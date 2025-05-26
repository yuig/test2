package com.pinterest.xrenderer.legacy.multipass_processing;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.a f52871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52872b;

    public c(androidx.appcompat.widget.a uniformHandle, String settingName) {
        Intrinsics.checkNotNullParameter(uniformHandle, "uniformHandle");
        Intrinsics.checkNotNullParameter(settingName, "settingName");
        this.f52871a = uniformHandle;
        this.f52872b = settingName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f52871a, cVar.f52871a) && Intrinsics.d(this.f52872b, cVar.f52872b);
    }

    public final int hashCode() {
        return this.f52872b.hashCode() + (this.f52871a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParamBinding(uniformHandle=");
        sb3.append(this.f52871a);
        sb3.append(", settingName=");
        return ep.b.k(sb3, this.f52872b, ')');
    }
}
