/*
 * Copyright 2012 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

/**
 * The {@code JobEventsArgs} class contains arguments for getting events using 
 * the {@link Job#getEvents} method.
 */
public class JobEventsArgs extends Args {

    /**
     * Specifies the format for the returned output.
     */
    public static enum OutputMode {
        /** Returns output in Atom format. */
        ATOM("atom"),
        /** Returns output in CSV format. */
        CSV("csv"),
        /** Returns output in JSON format. */
        JSON("json"),
        /** Returns output in JSON_COLS format. */
        JSON_COLS("json_cols"),
        /** Returns output in JSON_ROWS format. */
        JSON_ROWS("json_rows"),
        /** Returns output in raw format. */
        RAW("raw"),
        /** Returns output in XML format. */
        XML("xml");
        
        private String value;
        
        private OutputMode(String value) {
            this.value = value;
        }
        
        /**
         * @return The REST API value for this enumerated constant.
         */
        public String toString() {
            return this.value;
        }
    }
    
    /**
     * Specifies how to truncate lines to achieve the value in 
     * {@link #setMaximumLines}.
     */
    public static enum TruncationMode {
        /** Use the "abstract" truncation mode.*/
        ABSTRACT("abstract"),
        /** Use the "truncate" truncation mode.*/
        TRUNCATE("truncate");
        
        private String value;
        
        private TruncationMode(String value) {
            this.value = value;
        }
        
        /**
         * @return The REST API value for this enumerated constant.
         */
        public String toString() {
            return this.value;
        }
    }
    
    /**
     * Class constructor.
     */
    public JobEventsArgs() { super(); }
    
    /* BEGIN AUTOGENERATED CODE */
    
    /**
     * Sets the maximum number of results to return. To return all available results, specify 0. The default value is 100.
     * 
     * @param count
     *      The maximum number of results. 
     */
    public void setCount(int count) {
        this.put("count", count);
    }
    
    /**
     * Specifies the earliest time in the time range to search. The time string can be a UTC time (with fractional seconds), a relative time specifier (to now), or a formatted time string.
     * 
     * @param earliestTime
     *      The earliest time. 
     */
    public void setEarliestTime(String earliestTime) {
        this.put("earliest_time", earliestTime);
    }
    
    /**
     * Sets a list of fields to return for the event set. 
     * 
     * @param fieldList
     *      A list of fields.
     */
    public void setFieldList(String[] fieldList) {
        this.put("f", fieldList);
    }
    
    /**
     * Specifies the latest time in the time range to search. The time string can be a UTC time (with fractional seconds), a relative time specifier (to now), or a formatted time string.
     * 
     * @param latestTime
     *      The latest time. 
     */
    public void setLatestTime(String latestTime) {
        this.put("latest_time", latestTime);
    }
    
    /**
     * Sets the maximum number of lines that any single event's <b>_raw</b> field should contain.
     * 
     * @param maximumLines
     *      The maximum number of lines. For no limit, specify 0.
     */
    public void setMaximumLines(int maximumLines) {
        this.put("max_lines", maximumLines);
    }
    
    /**
     * Specifies the index of the first result (inclusive) from which to begin returning data. This value is 0-indexed.<p>In Splunk 4.1+, negative offsets are allowed and are added to the count to compute the absolute offset (for example, offset=-1 is the last available offset). Offsets in the results are always absolute and never negative. The default value is 0.
     * 
     * @param offset
     *      The index of the first result to return.
     */
    public void setOffset(int offset) {
        this.put("offset", offset);
    }
    
    /**
     * Sets the format of the output.
     * 
     * @param outputMode
     *      The output format.
     */
    public void setOutputMode(OutputMode outputMode) {
        this.put("output_mode", outputMode);
    }
    
    /**
     * Sets a UTC time format. 
     *
     * @param outputTimeFormat
     *      A UTC time format.
     */
    public void setOutputTimeFormat(String outputTimeFormat) {
        this.put("output_time_format", outputTimeFormat);
    }
    
    /**
     * Sets the post-processing search to apply to results. 
     * 
     * @param search
     *      The post-processing search query.
     */
    public void setSearch(String search) {
        this.put("search", search);
    }
    
    /**
     * Sets the type of segmentation to perform on the data, including an option to perform k/v segmentation.
     * 
     * @param segmentation
     *      The segmentation type.
     */
    public void setSegmentation(String segmentation) {
        this.put("segmentation", segmentation);
    }
    
    /**
     * Specifies an expression to convert a formatted time string from {start,end}_time into UTC seconds. The default format is "%m/%d/%Y:%H:%M:%S". 
     * 
     * @param timeFormat
     *      The time format.
     */
    public void setTimeFormat(String timeFormat) {
        this.put("time_format", timeFormat);
    }
    
    /**
     * Specifies how to truncate lines to achieve the value in {@link #setMaximumLines}.
     * 
     * @param truncationMode
     *      The truncation mode.
     */
    public void setTruncationMode(TruncationMode truncationMode) {
        this.put("truncation_mode", truncationMode);
    }
    
    /* END AUTOGENERATED CODE */
}
