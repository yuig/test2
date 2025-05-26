package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final om0.z f104241a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.a0 f104242b;

    /* renamed from: c, reason: collision with root package name */
    public final wm0.a f104243c;

    /* renamed from: d, reason: collision with root package name */
    public final sk0.d f104244d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.a0 f104245e;

    public b(om0.z topBarState, o82.a0 sectionDisplayState, wm0.a toolsMode, sk0.d boardToolsDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(toolsMode, "toolsMode");
        Intrinsics.checkNotNullParameter(boardToolsDisplayState, "boardToolsDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f104241a = topBarState;
        this.f104242b = sectionDisplayState;
        this.f104243c = toolsMode;
        this.f104244d = boardToolsDisplayState;
        this.f104245e = pinalyticsState;
    }

    public static b e(b bVar, om0.z zVar, o82.a0 a0Var, wm0.a aVar, sk0.d dVar, zy.a0 a0Var2, int i13) {
        if ((i13 & 1) != 0) {
            zVar = bVar.f104241a;
        }
        om0.z topBarState = zVar;
        if ((i13 & 2) != 0) {
            a0Var = bVar.f104242b;
        }
        o82.a0 sectionDisplayState = a0Var;
        if ((i13 & 4) != 0) {
            aVar = bVar.f104243c;
        }
        wm0.a toolsMode = aVar;
        if ((i13 & 8) != 0) {
            dVar = bVar.f104244d;
        }
        sk0.d boardToolsDisplayState = dVar;
        if ((i13 & 16) != 0) {
            a0Var2 = bVar.f104245e;
        }
        zy.a0 pinalyticsState = a0Var2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(toolsMode, "toolsMode");
        Intrinsics.checkNotNullParameter(boardToolsDisplayState, "boardToolsDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new b(topBarState, sectionDisplayState, toolsMode, boardToolsDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f104241a, bVar.f104241a) && Intrinsics.d(this.f104242b, bVar.f104242b) && this.f104243c == bVar.f104243c && Intrinsics.d(this.f104244d, bVar.f104244d) && Intrinsics.d(this.f104245e, bVar.f104245e);
    }

    public final int hashCode() {
        return this.f104245e.hashCode() + ((this.f104244d.hashCode() + ((this.f104243c.hashCode() + ep.b.c(this.f104242b.f93524a, this.f104241a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BoardLandingDisplayState(topBarState=" + this.f104241a + ", sectionDisplayState=" + this.f104242b + ", toolsMode=" + this.f104243c + ", boardToolsDisplayState=" + this.f104244d + ", pinalyticsState=" + this.f104245e + ")";
    }
}
