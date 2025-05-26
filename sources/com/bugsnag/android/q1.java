package com.bugsnag.android;

import a.cb;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29422a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29424c;

    public q1(int i13, boolean z13, boolean z14) {
        this.f29422a = i13;
        this.f29423b = z13;
        this.f29424c = z14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LastRunInfo(consecutiveLaunchCrashes=");
        sb3.append(this.f29422a);
        sb3.append(", crashed=");
        sb3.append(this.f29423b);
        sb3.append(", crashedDuringLaunch=");
        return cb.m(sb3, this.f29424c, ')');
    }
}
