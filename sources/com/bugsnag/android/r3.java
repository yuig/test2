package com.bugsnag.android;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* loaded from: classes3.dex */
public enum r3 {
    NEW("NEW"),
    BLOCKED("BLOCKED"),
    RUNNABLE("RUNNABLE"),
    TERMINATED("TERMINATED"),
    TIMED_WAITING("TIMED_WAITING"),
    WAITING("WAITING"),
    UNKNOWN("UNKNOWN");

    private final String descriptor;

    r3(String str) {
        this.descriptor = str;
    }

    @NonNull
    public static r3 byDescriptor(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (r3 r3Var : values()) {
            if (r3Var.getDescriptor().equals(str)) {
                return r3Var;
            }
        }
        return UNKNOWN;
    }

    @NonNull
    public static r3 forThread(@NonNull Thread thread) {
        return getState(thread.getState());
    }

    @NonNull
    private static r3 getState(Thread.State state) {
        switch (q3.f29426a[state.ordinal()]) {
            case 1:
                return NEW;
            case 2:
                return BLOCKED;
            case 3:
                return RUNNABLE;
            case 4:
                return TERMINATED;
            case 5:
                return TIMED_WAITING;
            case 6:
                return WAITING;
            default:
                return UNKNOWN;
        }
    }

    @NonNull
    public String getDescriptor() {
        return this.descriptor;
    }
}
