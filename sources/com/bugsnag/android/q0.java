package com.bugsnag.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29421b;

    public q0(String str, String str2) {
        this.f29420a = str;
        this.f29421b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f29420a, q0Var.f29420a) && Intrinsics.d(this.f29421b, q0Var.f29421b);
    }

    public final int hashCode() {
        String str = this.f29420a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29421b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceIds(deviceId=" + ((Object) this.f29420a) + ", internalDeviceId=" + ((Object) this.f29421b) + ')';
    }
}
