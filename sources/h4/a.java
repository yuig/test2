package h4;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f67517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67518b;

    public a(b4.g gVar, int i13) {
        this.f67517a = gVar;
        this.f67518b = i13;
    }

    @Override // h4.j
    public final void a(l lVar) {
        int i13 = lVar.f67589d;
        boolean z13 = i13 != -1;
        b4.g gVar = this.f67517a;
        if (z13) {
            lVar.d(i13, lVar.f67590e, gVar.f21571a);
        } else {
            lVar.d(lVar.f67587b, lVar.f67588c, gVar.f21571a);
        }
        int i14 = lVar.f67587b;
        int i15 = lVar.f67588c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f67518b;
        int g13 = ql2.s.g(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - gVar.f21571a.length(), 0, lVar.f67586a.a());
        lVar.f(g13, g13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f67517a.f21571a, aVar.f67517a.f21571a) && this.f67518b == aVar.f67518b;
    }

    public final int hashCode() {
        return (this.f67517a.f21571a.hashCode() * 31) + this.f67518b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommitTextCommand(text='");
        sb3.append(this.f67517a.f21571a);
        sb3.append("', newCursorPosition=");
        return cb.l(sb3, this.f67518b, ')');
    }

    public a(String str, int i13) {
        this(new b4.g(str, null, 6), i13);
    }
}
