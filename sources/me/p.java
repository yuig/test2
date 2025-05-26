package me;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum p {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        p[] valuesCustom = values();
        return (p[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
