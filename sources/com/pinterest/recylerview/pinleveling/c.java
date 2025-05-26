package com.pinterest.recylerview.pinleveling;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final qq2.c f50381a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f50382b;

    /* renamed from: c, reason: collision with root package name */
    public int f50383c;

    public c(qq2.c pinLevelingPreferences) {
        Intrinsics.checkNotNullParameter(pinLevelingPreferences, "pinLevelingPreferences");
        this.f50381a = pinLevelingPreferences;
        this.f50383c = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f50381a, ((c) obj).f50381a);
    }

    public final int hashCode() {
        return this.f50381a.hashCode();
    }

    public final String toString() {
        return "PinLevelingConfiguration(pinLevelingPreferences=" + this.f50381a + ")";
    }
}
