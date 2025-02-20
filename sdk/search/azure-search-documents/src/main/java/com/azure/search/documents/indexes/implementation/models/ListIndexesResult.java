// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response from a List Indexes request. If successful, it includes the full definitions of all indexes. */
@Immutable
public final class ListIndexesResult {
    /*
     * The indexes in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndex> indexes;

    /**
     * Creates an instance of ListIndexesResult class.
     *
     * @param indexes the indexes value to set.
     */
    @JsonCreator
    public ListIndexesResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndex> indexes) {
        this.indexes = indexes;
    }

    /**
     * Get the indexes property: The indexes in the Search service.
     *
     * @return the indexes value.
     */
    public List<SearchIndex> getIndexes() {
        return this.indexes;
    }
}
