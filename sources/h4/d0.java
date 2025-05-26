package h4;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f67533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67534b;

    public d0(String str, int i13) {
        this.f67533a = new b4.g(str, null, 6);
        this.f67534b = i13;
    }

    @Override // h4.j
    public final void a(l lVar) {
        int i13 = lVar.f67589d;
        boolean z13 = i13 != -1;
        b4.g gVar = this.f67533a;
        if (z13) {
            lVar.d(i13, lVar.f67590e, gVar.f21571a);
            String str = gVar.f21571a;
            if (str.length() > 0) {
                lVar.e(i13, str.length() + i13);
            }
        } else {
            int i14 = lVar.f67587b;
            lVar.d(i14, lVar.f67588c, gVar.f21571a);
            String str2 = gVar.f21571a;
            if (str2.length() > 0) {
                lVar.e(i14, str2.length() + i14);
            }
        }
        int i15 = lVar.f67587b;
        int i16 = lVar.f67588c;
        int i17 = i15 == i16 ? i16 : -1;
        int i18 = this.f67534b;
        int g13 = ql2.s.g(i18 > 0 ? (i17 + i18) - 1 : (i17 + i18) - gVar.f21571a.length(), 0, lVar.f67586a.a());
        lVar.f(g13, g13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f67533a.f21571a, d0Var.f67533a.f21571a) && this.f67534b == d0Var.f67534b;
    }

    public final int hashCode() {
        return (this.f67533a.f21571a.hashCode() * 31) + this.f67534b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text='");
        sb3.append(this.f67533a.f21571a);
        sb3.append("', newCursorPosition=");
        return cb.l(sb3, this.f67534b, ')');
    }
}
