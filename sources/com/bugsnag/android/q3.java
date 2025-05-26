package com.bugsnag.android;

import java.lang.Thread;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29426a;

    static {
        int[] iArr = new int[Thread.State.values().length];
        f29426a = iArr;
        try {
            iArr[Thread.State.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29426a[Thread.State.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29426a[Thread.State.RUNNABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29426a[Thread.State.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f29426a[Thread.State.TIMED_WAITING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f29426a[Thread.State.WAITING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
