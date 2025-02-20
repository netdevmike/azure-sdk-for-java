// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify which protocols are enabled. */
@Fluent
public final class EnabledProtocols {
    /*
     * Enable Download protocol or not
     */
    @JsonProperty(value = "download", required = true)
    private boolean download;

    /*
     * Enable DASH protocol or not
     */
    @JsonProperty(value = "dash", required = true)
    private boolean dash;

    /*
     * Enable HLS protocol or not
     */
    @JsonProperty(value = "hls", required = true)
    private boolean hls;

    /*
     * Enable SmoothStreaming protocol or not
     */
    @JsonProperty(value = "smoothStreaming", required = true)
    private boolean smoothStreaming;

    /**
     * Get the download property: Enable Download protocol or not.
     *
     * @return the download value.
     */
    public boolean download() {
        return this.download;
    }

    /**
     * Set the download property: Enable Download protocol or not.
     *
     * @param download the download value to set.
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withDownload(boolean download) {
        this.download = download;
        return this;
    }

    /**
     * Get the dash property: Enable DASH protocol or not.
     *
     * @return the dash value.
     */
    public boolean dash() {
        return this.dash;
    }

    /**
     * Set the dash property: Enable DASH protocol or not.
     *
     * @param dash the dash value to set.
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withDash(boolean dash) {
        this.dash = dash;
        return this;
    }

    /**
     * Get the hls property: Enable HLS protocol or not.
     *
     * @return the hls value.
     */
    public boolean hls() {
        return this.hls;
    }

    /**
     * Set the hls property: Enable HLS protocol or not.
     *
     * @param hls the hls value to set.
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withHls(boolean hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the smoothStreaming property: Enable SmoothStreaming protocol or not.
     *
     * @return the smoothStreaming value.
     */
    public boolean smoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * Set the smoothStreaming property: Enable SmoothStreaming protocol or not.
     *
     * @param smoothStreaming the smoothStreaming value to set.
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withSmoothStreaming(boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
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
