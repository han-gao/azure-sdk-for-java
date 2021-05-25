// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of live pipelines. */
@Fluent
public final class LivePipelineCollection {
    /*
     * List of live pipelines.
     */
    @JsonProperty(value = "value")
    private List<LivePipeline> value;

    /*
     * A continuation token to be used in subsequent calls when enumerating
     * through the collection. This is returned when the collection results
     * won't fit in a single response.
     */
    @JsonProperty(value = "@continuationToken")
    private String continuationToken;

    /**
     * Get the value property: List of live pipelines.
     *
     * @return the value value.
     */
    public List<LivePipeline> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of live pipelines.
     *
     * @param value the value value to set.
     * @return the LivePipelineCollection object itself.
     */
    public LivePipelineCollection setValue(List<LivePipeline> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuationToken property: A continuation token to be used in subsequent calls when enumerating through
     * the collection. This is returned when the collection results won't fit in a single response.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: A continuation token to be used in subsequent calls when enumerating through
     * the collection. This is returned when the collection results won't fit in a single response.
     *
     * @param continuationToken the continuationToken value to set.
     * @return the LivePipelineCollection object itself.
     */
    public LivePipelineCollection setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
}
