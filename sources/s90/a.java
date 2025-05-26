package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.a f111957a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f111958b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111959c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f111960d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.a0 f111961e;

    public a(sa0.a cutoutEditorDisplayState, r0 cutoutSearchStatusBarState, boolean z13, t0 cutoutToolbarState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(cutoutEditorDisplayState, "cutoutEditorDisplayState");
        Intrinsics.checkNotNullParameter(cutoutSearchStatusBarState, "cutoutSearchStatusBarState");
        Intrinsics.checkNotNullParameter(cutoutToolbarState, "cutoutToolbarState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f111957a = cutoutEditorDisplayState;
        this.f111958b = cutoutSearchStatusBarState;
        this.f111959c = z13;
        this.f111960d = cutoutToolbarState;
        this.f111961e = pinalyticsState;
    }

    public static a e(a aVar, sa0.a aVar2, r0 r0Var, boolean z13, zy.a0 a0Var, int i13) {
        if ((i13 & 1) != 0) {
            aVar2 = aVar.f111957a;
        }
        sa0.a cutoutEditorDisplayState = aVar2;
        if ((i13 & 2) != 0) {
            r0Var = aVar.f111958b;
        }
        r0 cutoutSearchStatusBarState = r0Var;
        if ((i13 & 4) != 0) {
            z13 = aVar.f111959c;
        }
        boolean z14 = z13;
        t0 cutoutToolbarState = aVar.f111960d;
        if ((i13 & 16) != 0) {
            a0Var = aVar.f111961e;
        }
        zy.a0 pinalyticsState = a0Var;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cutoutEditorDisplayState, "cutoutEditorDisplayState");
        Intrinsics.checkNotNullParameter(cutoutSearchStatusBarState, "cutoutSearchStatusBarState");
        Intrinsics.checkNotNullParameter(cutoutToolbarState, "cutoutToolbarState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new a(cutoutEditorDisplayState, cutoutSearchStatusBarState, z14, cutoutToolbarState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f111957a, aVar.f111957a) && Intrinsics.d(this.f111958b, aVar.f111958b) && this.f111959c == aVar.f111959c && Intrinsics.d(this.f111960d, aVar.f111960d) && Intrinsics.d(this.f111961e, aVar.f111961e);
    }

    public final int hashCode() {
        return this.f111961e.hashCode() + ((this.f111960d.hashCode() + ep.b.e(this.f111959c, (this.f111958b.hashCode() + (this.f111957a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CollageCutoutDisplayState(cutoutEditorDisplayState=" + this.f111957a + ", cutoutSearchStatusBarState=" + this.f111958b + ", isSavingCutout=" + this.f111959c + ", cutoutToolbarState=" + this.f111960d + ", pinalyticsState=" + this.f111961e + ")";
    }
}
