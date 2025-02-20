// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.TokenCharacterKind;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Tokenizes the input into n-grams of the given size(s). This tokenizer is implemented using Apache Lucene. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.NGramTokenizer")
@Fluent
public final class NGramTokenizer extends LexicalTokenizer {
    /*
     * Identifies the concrete type of the tokenizer.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.NGramTokenizer";

    /*
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of maxGram.
     */
    @JsonProperty(value = "minGram")
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    @JsonProperty(value = "maxGram")
    private Integer maxGram;

    /*
     * Character classes to keep in the tokens.
     */
    @JsonProperty(value = "tokenChars")
    private List<TokenCharacterKind> tokenChars;

    /**
     * Creates an instance of NGramTokenizer class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public NGramTokenizer(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the tokenizer.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @param maxGram the maxGram value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get the tokenChars property: Character classes to keep in the tokens.
     *
     * @return the tokenChars value.
     */
    public List<TokenCharacterKind> getTokenChars() {
        return this.tokenChars;
    }

    /**
     * Set the tokenChars property: Character classes to keep in the tokens.
     *
     * @param tokenChars the tokenChars value to set.
     * @return the NGramTokenizer object itself.
     */
    public NGramTokenizer setTokenChars(List<TokenCharacterKind> tokenChars) {
        this.tokenChars = tokenChars;
        return this;
    }
}
