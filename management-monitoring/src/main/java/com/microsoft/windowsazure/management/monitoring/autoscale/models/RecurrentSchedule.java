/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.autoscale.models;

import java.util.ArrayList;

public class RecurrentSchedule {
    private ArrayList<String> days;

    /**
     * @return The Days value.
     */
    public ArrayList<String> getDays() {
        return this.days;
    }

    /**
     * @param daysValue
     *            The Days value.
     */
    public void setDays(final ArrayList<String> daysValue) {
        this.days = daysValue;
    }

    private ArrayList<Integer> hours;

    /**
     * @return The Hours value.
     */
    public ArrayList<Integer> getHours() {
        return this.hours;
    }

    /**
     * @param hoursValue
     *            The Hours value.
     */
    public void setHours(final ArrayList<Integer> hoursValue) {
        this.hours = hoursValue;
    }

    private ArrayList<Integer> minutes;

    /**
     * @return The Minutes value.
     */
    public ArrayList<Integer> getMinutes() {
        return this.minutes;
    }

    /**
     * @param minutesValue
     *            The Minutes value.
     */
    public void setMinutes(final ArrayList<Integer> minutesValue) {
        this.minutes = minutesValue;
    }

    private String timeZone;

    /**
     * @return The TimeZone value.
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @param timeZoneValue
     *            The TimeZone value.
     */
    public void setTimeZone(final String timeZoneValue) {
        this.timeZone = timeZoneValue;
    }

    /**
     * Initializes a new instance of the RecurrentSchedule class.
     * 
     */
    public RecurrentSchedule() {
        this.days = new ArrayList<String>();
        this.hours = new ArrayList<Integer>();
        this.minutes = new ArrayList<Integer>();
    }
}
