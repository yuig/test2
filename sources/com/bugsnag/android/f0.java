package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class f0 {
    public static g0 a(int i13) {
        return (200 > i13 || i13 >= 300) ? (400 > i13 || i13 >= 500 || i13 == 408 || i13 == 429) ? g0.UNDELIVERED : g0.FAILURE : g0.DELIVERED;
    }
}
