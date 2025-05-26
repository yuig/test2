package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface d0 extends ExecutorService {
    c0 submit(Callable callable);
}
