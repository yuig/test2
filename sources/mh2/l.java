package mh2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f87191a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87192b;

    public l(Object obj, boolean z13) {
        this.f87191a = obj;
        this.f87192b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f87191a, lVar.f87191a) && this.f87192b == lVar.f87192b;
    }

    public final int hashCode() {
        Object obj = this.f87191a;
        return Boolean.hashCode(this.f87192b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogRequest(payload=");
        sb3.append(this.f87191a);
        sb3.append(", defer=");
        return cb.m(sb3, this.f87192b, ')');
    }
}
