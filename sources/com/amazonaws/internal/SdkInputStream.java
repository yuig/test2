package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class SdkInputStream extends InputStream implements MetricAware {
    @Override // com.amazonaws.internal.MetricAware
    public final boolean a() {
        Closeable d2 = d();
        if (d2 instanceof MetricAware) {
            return ((MetricAware) d2).a();
        }
        return false;
    }

    public final void c() {
        if (Thread.interrupted()) {
            throw new AbortedException();
        }
    }

    public abstract InputStream d();
}
