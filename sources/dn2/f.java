package dn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.b f55621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55622b;

    public f(ym2.b classId, int i13) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f55621a = classId;
        this.f55622b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f55621a, fVar.f55621a) && this.f55622b == fVar.f55622b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55622b) + (this.f55621a.hashCode() * 31);
    }

    public final String toString() {
        int i13;
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        while (true) {
            i13 = this.f55622b;
            if (i14 >= i13) {
                break;
            }
            sb3.append("kotlin/Array<");
            i14++;
        }
        sb3.append(this.f55621a);
        for (int i15 = 0; i15 < i13; i15++) {
            sb3.append(">");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
