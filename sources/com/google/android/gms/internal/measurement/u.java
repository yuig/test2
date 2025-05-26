package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31656a = new ArrayList();

    public final void a(String str) {
        if (!this.f31656a.contains(o0.q(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(a.a.j("Command not implemented: ", str));
    }
}
