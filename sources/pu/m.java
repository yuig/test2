package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f101363a;

    public m(String str) {
        this.f101363a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return Intrinsics.d(this.f101363a, ((m) obj).f101363a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f101363a;
        return Boolean.hashCode(true) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenCustomUrl(url="), this.f101363a, ", isSkipOutboundPinClickEvent=true)");
    }
}
