package x62;

import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f133989a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f133990b;

    /* renamed from: c, reason: collision with root package name */
    public final n f133991c;

    /* renamed from: d, reason: collision with root package name */
    public final float f133992d;

    /* renamed from: e, reason: collision with root package name */
    public final o f133993e;

    public p(String imageUrl, i1 i1Var, n brushMode, float f13, o maskMode) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(brushMode, "brushMode");
        Intrinsics.checkNotNullParameter(maskMode, "maskMode");
        this.f133989a = imageUrl;
        this.f133990b = i1Var;
        this.f133991c = brushMode;
        this.f133992d = f13;
        this.f133993e = maskMode;
    }

    public static p a(p pVar, String str, i1 i1Var, n nVar, float f13, o oVar, int i13) {
        if ((i13 & 1) != 0) {
            str = pVar.f133989a;
        }
        String imageUrl = str;
        if ((i13 & 2) != 0) {
            i1Var = pVar.f133990b;
        }
        i1 i1Var2 = i1Var;
        if ((i13 & 4) != 0) {
            nVar = pVar.f133991c;
        }
        n brushMode = nVar;
        if ((i13 & 8) != 0) {
            f13 = pVar.f133992d;
        }
        float f14 = f13;
        if ((i13 & 16) != 0) {
            oVar = pVar.f133993e;
        }
        o maskMode = oVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(brushMode, "brushMode");
        Intrinsics.checkNotNullParameter(maskMode, "maskMode");
        return new p(imageUrl, i1Var2, brushMode, f14, maskMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f133989a, pVar.f133989a) && Intrinsics.d(this.f133990b, pVar.f133990b) && this.f133991c == pVar.f133991c && Float.compare(this.f133992d, pVar.f133992d) == 0 && this.f133993e == pVar.f133993e;
    }

    public final int hashCode() {
        int hashCode = this.f133989a.hashCode() * 31;
        i1 i1Var = this.f133990b;
        return this.f133993e.hashCode() + a.a.a(this.f133992d, (this.f133991c.hashCode() + ((hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RefineMaskModel(imageUrl=" + this.f133989a + ", imageMask=" + this.f133990b + ", brushMode=" + this.f133991c + ", brushSize=" + this.f133992d + ", maskMode=" + this.f133993e + ")";
    }

    public /* synthetic */ p() {
        this("", null, n.BRUSH, 64.0f, o.NORMAL);
    }
}
