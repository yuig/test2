package wc2;

import kotlin.jvm.internal.Intrinsics;
import ni1.u0;

/* loaded from: classes4.dex */
public final class f implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f129133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129134b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f129135c;

    public f(String str, int i13, u0 pinRepDisplayState) {
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        this.f129133a = str;
        this.f129134b = i13;
        this.f129135c = pinRepDisplayState;
    }

    public static f e(f fVar, String str, int i13, u0 pinRepDisplayState, int i14) {
        if ((i14 & 1) != 0) {
            str = fVar.f129133a;
        }
        if ((i14 & 2) != 0) {
            i13 = fVar.f129134b;
        }
        if ((i14 & 4) != 0) {
            pinRepDisplayState = fVar.f129135c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        return new f(str, i13, pinRepDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f129133a, fVar.f129133a) && this.f129134b == fVar.f129134b && Intrinsics.d(this.f129135c, fVar.f129135c);
    }

    public final int hashCode() {
        String str = this.f129133a;
        return this.f129135c.hashCode() + ep.b.b(this.f129134b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "WebviewPinDisplayState(payload=" + this.f129133a + ", adWidth=" + this.f129134b + ", pinRepDisplayState=" + this.f129135c + ")";
    }
}
