package jb1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f75325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75327c;

    public b(String code, String confirmedCode, boolean z13) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(confirmedCode, "confirmedCode");
        this.f75325a = code;
        this.f75326b = confirmedCode;
        this.f75327c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f75325a, bVar.f75325a) && Intrinsics.d(this.f75326b, bVar.f75326b) && this.f75327c == bVar.f75327c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75327c) + cb.d(this.f75326b, this.f75325a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PasscodeSetupCodeDisplayState(code=");
        sb3.append(this.f75325a);
        sb3.append(", confirmedCode=");
        sb3.append(this.f75326b);
        sb3.append(", isNextEnabled=");
        return a.a.r(sb3, this.f75327c, ")");
    }
}
