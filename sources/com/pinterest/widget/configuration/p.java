package com.pinterest.widget.configuration;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f52846a;

    public p(al1.i wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f52846a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f52846a, ((p) obj).f52846a);
    }

    public final int hashCode() {
        return this.f52846a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavRequest(wrapped="), this.f52846a, ")");
    }
}
