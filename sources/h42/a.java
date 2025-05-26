package h42;

import java.util.Set;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import u50.b0;
import u50.n;
import u50.o;

/* loaded from: classes4.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Set f67640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67641b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i f67642c;

    /* renamed from: d, reason: collision with root package name */
    public final n f67643d;

    public a(Set screens, int i13, u50.i iVar, n nVar) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f67640a = screens;
        this.f67641b = i13;
        this.f67642c = iVar;
        this.f67643d = nVar;
    }

    public static a e(a aVar, Set screens, int i13, int i14) {
        if ((i14 & 1) != 0) {
            screens = aVar.f67640a;
        }
        if ((i14 & 2) != 0) {
            i13 = aVar.f67641b;
        }
        u50.i iVar = aVar.f67642c;
        n nVar = aVar.f67643d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(screens, "screens");
        return new a(screens, i13, iVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f67640a, aVar.f67640a) && this.f67641b == aVar.f67641b && Intrinsics.d(this.f67642c, aVar.f67642c) && Intrinsics.d(this.f67643d, aVar.f67643d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f67641b, this.f67640a.hashCode() * 31, 31);
        u50.i iVar = this.f67642c;
        int hashCode = (b13 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        n nVar = this.f67643d;
        return hashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenPagerDisplayState(screens=" + this.f67640a + ", position=" + this.f67641b + ", backgroundColor=" + this.f67642c + ", pageMargin=" + this.f67643d + ")";
    }

    public a(u50.g gVar, b0 b0Var, int i13) {
        this(s0.f80394a, 0, (i13 & 4) != 0 ? null : gVar, (i13 & 8) != 0 ? null : b0Var);
    }
}
