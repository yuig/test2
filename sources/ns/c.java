package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91899a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91900b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f91902d;

    /* renamed from: e, reason: collision with root package name */
    public final o82.a0 f91903e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f91904f;

    public c(boolean z13, boolean z14, boolean z15, boolean z16, o82.a0 multiSectionDisplayState, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f91899a = z13;
        this.f91900b = z14;
        this.f91901c = z15;
        this.f91902d = z16;
        this.f91903e = multiSectionDisplayState;
        this.f91904f = pinalyticsDisplayState;
    }

    public static c e(c cVar, boolean z13, boolean z14, boolean z15, boolean z16, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        if ((i13 & 1) != 0) {
            z13 = cVar.f91899a;
        }
        boolean z17 = z13;
        if ((i13 & 2) != 0) {
            z14 = cVar.f91900b;
        }
        boolean z18 = z14;
        if ((i13 & 4) != 0) {
            z15 = cVar.f91901c;
        }
        boolean z19 = z15;
        if ((i13 & 8) != 0) {
            z16 = cVar.f91902d;
        }
        boolean z23 = z16;
        if ((i13 & 16) != 0) {
            a0Var = cVar.f91903e;
        }
        o82.a0 multiSectionDisplayState = a0Var;
        if ((i13 & 32) != 0) {
            a0Var2 = cVar.f91904f;
        }
        zy.a0 pinalyticsDisplayState = a0Var2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new c(z17, z18, z19, z23, multiSectionDisplayState, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f91899a == cVar.f91899a && this.f91900b == cVar.f91900b && this.f91901c == cVar.f91901c && this.f91902d == cVar.f91902d && Intrinsics.d(this.f91903e, cVar.f91903e) && Intrinsics.d(this.f91904f, cVar.f91904f);
    }

    public final int hashCode() {
        return this.f91904f.hashCode() + ep.b.c(this.f91903e.f93524a, ep.b.e(this.f91902d, ep.b.e(this.f91901c, ep.b.e(this.f91900b, Boolean.hashCode(this.f91899a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "SearchLandingAdPreviewDisplayState(updateToolbarForImmersiveHeader=" + this.f91899a + ", updateSearchBar=" + this.f91900b + ", isTransparent=" + this.f91901c + ", shouldAnimate=" + this.f91902d + ", multiSectionDisplayState=" + this.f91903e + ", pinalyticsDisplayState=" + this.f91904f + ")";
    }
}
