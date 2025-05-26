package com.bugsnag.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/ErrorType;", "", "", "desc", "Ljava/lang/String;", "getDesc$bugsnag_android_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "com/bugsnag/android/v0", "UNKNOWN", "ANDROID", "REACTNATIVEJS", "C", "DART", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public enum ErrorType {
    UNKNOWN(""),
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c"),
    DART("dart");


    @NotNull
    public static final v0 Companion = new v0();

    @NotNull
    private final String desc;

    ErrorType(String str) {
        this.desc = str;
    }

    public static final ErrorType fromDescriptor(@NotNull String str) {
        Companion.getClass();
        return v0.a(str);
    }

    @NotNull
    /* renamed from: getDesc$bugsnag_android_core_release, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }
}
