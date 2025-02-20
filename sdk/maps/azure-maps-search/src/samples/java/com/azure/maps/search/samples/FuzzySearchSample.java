// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.search.samples;

import java.io.IOException;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.models.GeoPosition;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.search.MapsSearchAsyncClient;
import com.azure.maps.search.MapsSearchClient;
import com.azure.maps.search.MapsSearchClientBuilder;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.GeographicEntityType;
import com.azure.maps.search.models.SearchAddressResult;

public class FuzzySearchSample {
    public static void main(String[] args) throws IOException {
        MapsSearchClientBuilder builder = new MapsSearchClientBuilder();

        // Authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));
        // builder.credential(keyCredential);

        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        builder.credential(tokenCredential);
        builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        MapsSearchClient client = builder.buildClient();

        // Search fuzzy -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        // BEGIN: com.azure.maps.search.sync.fuzzy_search
        System.out.println("Search Fuzzy:");

        // simple
        client.fuzzySearch(new FuzzySearchOptions("starbucks"));

        // with options
        SearchAddressResult results = client.fuzzySearch(
            new FuzzySearchOptions("1 Microsoft Way", new GeoPosition(-74.011454, 40.706270))
                .setTop(5));

        // with response
        Response<SearchAddressResult> response = client.fuzzySearchWithResponse(
            new FuzzySearchOptions("Monaco").setEntityType(GeographicEntityType.COUNTRY)
                .setTop(5), null);
        // END: com.azure.maps.search.sync.fuzzy_search

        MapsSearchClientBuilder asyncClientbuilder = new MapsSearchClientBuilder();

        // Authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));
        // builder.credential(keyCredential);

        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential asyncClientTokenCredential = new DefaultAzureCredentialBuilder().build();

        asyncClientbuilder.credential(asyncClientTokenCredential);
        asyncClientbuilder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        asyncClientbuilder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        MapsSearchAsyncClient asyncClient = asyncClientbuilder.buildAsyncClient();

        // Search fuzzy -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        // BEGIN: com.azure.maps.search.async.fuzzy_search
        System.out.println("Search Fuzzy:");

        // simple
        asyncClient.fuzzySearch(new FuzzySearchOptions("starbucks"));

        // with options
        SearchAddressResult fuzzySearchResults = asyncClient.fuzzySearch(
            new FuzzySearchOptions("1 Microsoft Way", new GeoPosition(-74.011454, 40.706270))
                .setTop(5)).block();

        // with response
        Response<SearchAddressResult> fuzzySearchResponse = asyncClient.fuzzySearchWithResponse(
            new FuzzySearchOptions("Monaco").setEntityType(GeographicEntityType.COUNTRY)
                .setTop(5)).block();
        // END: com.azure.maps.search.async.fuzzy_search
    }
    
}
