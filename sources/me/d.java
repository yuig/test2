package me;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f86975a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86976b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86977c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86978d;

    public d(String jsonString, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f86975a = jsonString;
        this.f86976b = z13;
        this.f86977c = z14;
        this.f86978d = str;
    }

    private final Object readResolve() {
        return new e(this.f86975a, this.f86976b, this.f86977c, this.f86978d);
    }
}
