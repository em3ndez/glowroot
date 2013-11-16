/*
 * Copyright 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.informant.local.ui;

import checkers.nullness.quals.Nullable;
import com.google.common.base.Objects;

import io.informant.markers.UsedByJsonBinding;

/**
 * Structure used to deserialize json post data sent to /backend/trace/points.
 * 
 * @author Trask Stalnaker
 * @since 0.5
 */
@UsedByJsonBinding
class TracePointRequest {

    private long from;
    private long to;
    private double low; // seconds, with millisecond precision
    private double high; // seconds, with millisecond precision
    private boolean errorOnly;
    private boolean fineOnly;
    @Nullable
    private String groupingComparator;
    @Nullable
    private String grouping;
    @Nullable
    private String userIdComparator;
    @Nullable
    private String userId;
    @Nullable
    private Boolean background;
    private int limit;

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public boolean isErrorOnly() {
        return errorOnly;
    }

    public void setErrorOnly(boolean errorOnly) {
        this.errorOnly = errorOnly;
    }

    public boolean isFineOnly() {
        return fineOnly;
    }

    public void setFineOnly(boolean fineOnly) {
        this.fineOnly = fineOnly;
    }

    @Nullable
    public String getGroupingComparator() {
        return groupingComparator;
    }

    public void setGroupingComparator(@Nullable String groupingComparator) {
        this.groupingComparator = groupingComparator;
    }

    @Nullable
    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(@Nullable String grouping) {
        this.grouping = grouping;
    }

    @Nullable
    public String getUserIdComparator() {
        return userIdComparator;
    }

    public void setUserIdComparator(@Nullable String userIdComparator) {
        this.userIdComparator = userIdComparator;
    }

    @Nullable
    public String getUserId() {
        return userId;
    }

    public void setUserId(@Nullable String userId) {
        this.userId = userId;
    }

    @Nullable
    public Boolean isBackground() {
        return background;
    }

    public void setBackground(@Nullable Boolean background) {
        this.background = background;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("from", from)
                .add("to", to)
                .add("low", low)
                .add("high", high)
                .add("errorOnly", errorOnly)
                .add("fineOnly", fineOnly)
                .add("groupingComparator", groupingComparator)
                .add("grouping", grouping)
                .add("userIdComparator", userIdComparator)
                .add("userId", userId)
                .add("background", background)
                .add("limit", limit)
                .toString();
    }
}
