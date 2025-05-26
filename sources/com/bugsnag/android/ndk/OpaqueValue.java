package com.bugsnag.android.ndk;

import com.bugsnag.android.a0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "", "a", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "json", "com/bugsnag/android/a0", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class OpaqueValue {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String json;

    public OpaqueValue(String str) {
        this.json = str;
    }

    public static final Object makeSafe(Object obj) {
        return a0.r(obj);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }
}
