package com.bugsnag.android;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType;", "", "", "toString", "()Ljava/lang/String;", "type", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "com/bugsnag/android/k", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public enum BreadcrumbType {
    ERROR("error"),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST("request"),
    STATE(AnimatedTarget.PROPERTY_STATE),
    USER("user");


    @NotNull
    public static final k Companion = new k();

    @NotNull
    private final String type;

    BreadcrumbType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.type;
    }
}
