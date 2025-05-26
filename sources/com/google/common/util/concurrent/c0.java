package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface c0 extends Future {
    void d(Runnable runnable, Executor executor);
}
