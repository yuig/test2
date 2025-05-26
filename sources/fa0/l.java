package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61506a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61507b;

    /* renamed from: c, reason: collision with root package name */
    public final z f61508c;

    /* renamed from: d, reason: collision with root package name */
    public final y f61509d;

    /* renamed from: e, reason: collision with root package name */
    public final o82.a0 f61510e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f61511f;

    public l(boolean z13, boolean z14, z saveState, y progressOverlayState, o82.a0 sectionDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(saveState, "saveState");
        Intrinsics.checkNotNullParameter(progressOverlayState, "progressOverlayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f61506a = z13;
        this.f61507b = z14;
        this.f61508c = saveState;
        this.f61509d = progressOverlayState;
        this.f61510e = sectionDisplayState;
        this.f61511f = pinalyticsState;
    }

    public static l e(l lVar, boolean z13, z zVar, y yVar, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        if ((i13 & 1) != 0) {
            z13 = lVar.f61506a;
        }
        boolean z14 = z13;
        boolean z15 = lVar.f61507b;
        if ((i13 & 4) != 0) {
            zVar = lVar.f61508c;
        }
        z saveState = zVar;
        if ((i13 & 8) != 0) {
            yVar = lVar.f61509d;
        }
        y progressOverlayState = yVar;
        if ((i13 & 16) != 0) {
            a0Var = lVar.f61510e;
        }
        o82.a0 sectionDisplayState = a0Var;
        if ((i13 & 32) != 0) {
            a0Var2 = lVar.f61511f;
        }
        zy.a0 pinalyticsState = a0Var2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(saveState, "saveState");
        Intrinsics.checkNotNullParameter(progressOverlayState, "progressOverlayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new l(z14, z15, saveState, progressOverlayState, sectionDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f61506a == lVar.f61506a && this.f61507b == lVar.f61507b && Intrinsics.d(this.f61508c, lVar.f61508c) && Intrinsics.d(this.f61509d, lVar.f61509d) && Intrinsics.d(this.f61510e, lVar.f61510e) && Intrinsics.d(this.f61511f, lVar.f61511f);
    }

    public final int hashCode() {
        return this.f61511f.hashCode() + ep.b.c(this.f61510e.f93524a, (this.f61509d.hashCode() + ((this.f61508c.hashCode() + ep.b.e(this.f61507b, Boolean.hashCode(this.f61506a) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RemixCloseupDisplayState(remixActionEnabled=" + this.f61506a + ", remixActionVisible=" + this.f61507b + ", saveState=" + this.f61508c + ", progressOverlayState=" + this.f61509d + ", sectionDisplayState=" + this.f61510e + ", pinalyticsState=" + this.f61511f + ")";
    }
}
