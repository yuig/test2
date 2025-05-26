package p02;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes4.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98413b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f98414c;

    /* renamed from: d, reason: collision with root package name */
    public final v f98415d;

    public g(boolean z13, String str, a0 listDisplayState, v vVar) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        this.f98412a = z13;
        this.f98413b = str;
        this.f98414c = listDisplayState;
        this.f98415d = vVar;
    }

    public static g e(g gVar, String str, a0 listDisplayState, v vVar, int i13) {
        boolean z13 = gVar.f98412a;
        if ((i13 & 2) != 0) {
            str = gVar.f98413b;
        }
        if ((i13 & 4) != 0) {
            listDisplayState = gVar.f98414c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        return new g(z13, str, listDisplayState, vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f98412a == gVar.f98412a && Intrinsics.d(this.f98413b, gVar.f98413b) && Intrinsics.d(this.f98414c, gVar.f98414c) && Intrinsics.d(this.f98415d, gVar.f98415d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f98412a) * 31;
        String str = this.f98413b;
        int c13 = ep.b.c(this.f98414c.f93524a, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        v vVar = this.f98415d;
        return c13 + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "RVCSectionDisplayState(isYourAccountTab=" + this.f98412a + ", userId=" + this.f98413b + ", listDisplayState=" + this.f98414c + ", downloadedPdf=" + this.f98415d + ")";
    }
}
