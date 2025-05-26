package com.bugsnag.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j1 extends i {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f29285a;

    public j1(k1 k1Var) {
        this.f29285a = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f29285a, ((j1) obj).f29285a);
    }

    public final int hashCode() {
        return this.f29285a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagState(featureFlags=" + this.f29285a + ')';
    }
}
