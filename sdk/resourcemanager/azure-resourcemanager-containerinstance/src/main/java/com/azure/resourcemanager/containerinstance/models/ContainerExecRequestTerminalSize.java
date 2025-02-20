// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The size of the terminal. */
@Fluent
public final class ContainerExecRequestTerminalSize {
    /*
     * The row size of the terminal
     */
    @JsonProperty(value = "rows")
    private Integer rows;

    /*
     * The column size of the terminal
     */
    @JsonProperty(value = "cols")
    private Integer cols;

    /**
     * Get the rows property: The row size of the terminal.
     *
     * @return the rows value.
     */
    public Integer rows() {
        return this.rows;
    }

    /**
     * Set the rows property: The row size of the terminal.
     *
     * @param rows the rows value to set.
     * @return the ContainerExecRequestTerminalSize object itself.
     */
    public ContainerExecRequestTerminalSize withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the cols property: The column size of the terminal.
     *
     * @return the cols value.
     */
    public Integer cols() {
        return this.cols;
    }

    /**
     * Set the cols property: The column size of the terminal.
     *
     * @param cols the cols value to set.
     * @return the ContainerExecRequestTerminalSize object itself.
     */
    public ContainerExecRequestTerminalSize withCols(Integer cols) {
        this.cols = cols;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
