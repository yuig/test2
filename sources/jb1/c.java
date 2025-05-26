package jb1;

import kotlin.jvm.internal.Intrinsics;
import u50.s;

/* loaded from: classes5.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f75328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75329b;

    public c(String code, String confirmedCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(confirmedCode, "confirmedCode");
        this.f75328a = code;
        this.f75329b = confirmedCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f75328a, cVar.f75328a) && Intrinsics.d(this.f75329b, cVar.f75329b);
    }

    public final int hashCode() {
        return this.f75329b.hashCode() + (this.f75328a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NextButtonClicked(code=");
        sb3.append(this.f75328a);
        sb3.append(", confirmedCode=");
        return a.a.p(sb3, this.f75329b, ")");
    }
}
