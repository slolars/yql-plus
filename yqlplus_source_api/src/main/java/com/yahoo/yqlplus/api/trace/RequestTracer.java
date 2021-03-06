/*
 * Copyright (c) 2016 Yahoo Inc.
 * Licensed under the terms of the Apache version 2.0 license.
 * See LICENSE file for terms.
 */

package com.yahoo.yqlplus.api.trace;

import java.util.concurrent.TimeUnit;

public interface RequestTracer extends Tracer {
    TimeUnit getTickUnits();

    long elapsedTicks();

    Timeout createTimeout(long timeout, TimeUnit timeoutUnits);

    TraceRequest createTrace();
}
