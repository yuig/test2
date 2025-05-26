package an1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class l implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f15743a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f15744b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f15745c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15747e;

    /* renamed from: f, reason: collision with root package name */
    public final fm1.c f15748f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f15749g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15750h;

    public l(i0 legendText, i0 helperText, i0 errorMessage, List options, int i13, fm1.c visibility, i0 contentDescription, int i14) {
        Intrinsics.checkNotNullParameter(legendText, "legendText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f15743a = legendText;
        this.f15744b = helperText;
        this.f15745c = errorMessage;
        this.f15746d = options;
        this.f15747e = i13;
        this.f15748f = visibility;
        this.f15749g = contentDescription;
        this.f15750h = i14;
    }

    public static l e(l lVar, i0 i0Var, i0 i0Var2, i0 i0Var3, List list, int i13, fm1.c cVar, i0 i0Var4, int i14) {
        i0 legendText = (i14 & 1) != 0 ? lVar.f15743a : i0Var;
        i0 helperText = (i14 & 2) != 0 ? lVar.f15744b : i0Var2;
        i0 errorMessage = (i14 & 4) != 0 ? lVar.f15745c : i0Var3;
        List options = (i14 & 8) != 0 ? lVar.f15746d : list;
        int i15 = (i14 & 16) != 0 ? lVar.f15747e : i13;
        fm1.c visibility = (i14 & 32) != 0 ? lVar.f15748f : cVar;
        i0 contentDescription = (i14 & 64) != 0 ? lVar.f15749g : i0Var4;
        int i16 = lVar.f15750h;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(legendText, "legendText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new l(legendText, helperText, errorMessage, options, i15, visibility, contentDescription, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f15743a, lVar.f15743a) && Intrinsics.d(this.f15744b, lVar.f15744b) && Intrinsics.d(this.f15745c, lVar.f15745c) && Intrinsics.d(this.f15746d, lVar.f15746d) && this.f15747e == lVar.f15747e && this.f15748f == lVar.f15748f && Intrinsics.d(this.f15749g, lVar.f15749g) && this.f15750h == lVar.f15750h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15750h) + ep.b.d(this.f15749g, d7.g.a(this.f15748f, ep.b.b(this.f15747e, ep.b.c(this.f15746d, ep.b.d(this.f15745c, ep.b.d(this.f15744b, this.f15743a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(legendText=");
        sb3.append(this.f15743a);
        sb3.append(", helperText=");
        sb3.append(this.f15744b);
        sb3.append(", errorMessage=");
        sb3.append(this.f15745c);
        sb3.append(", options=");
        sb3.append(this.f15746d);
        sb3.append(", selectedIndex=");
        sb3.append(this.f15747e);
        sb3.append(", visibility=");
        sb3.append(this.f15748f);
        sb3.append(", contentDescription=");
        sb3.append(this.f15749g);
        sb3.append(", id=");
        return a.a.n(sb3, this.f15750h, ")");
    }
}
