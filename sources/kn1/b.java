package kn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import hn1.i;
import hn1.k;
import hn1.l;
import hn1.p;
import hn1.q;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80233a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80234b;

    /* renamed from: c, reason: collision with root package name */
    public final q f80235c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f80236d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f80237e;

    /* renamed from: f, reason: collision with root package name */
    public final p f80238f;

    /* renamed from: g, reason: collision with root package name */
    public final hn1.b f80239g;

    /* renamed from: h, reason: collision with root package name */
    public final l f80240h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f80241i;

    /* renamed from: j, reason: collision with root package name */
    public final i f80242j;

    /* renamed from: k, reason: collision with root package name */
    public final int f80243k;

    public b(boolean z13, boolean z14, q titleAlignment, i0 title, i0 i0Var, p startIconButton, hn1.b bVar, l lVar, boolean z15, i iVar, int i13) {
        Intrinsics.checkNotNullParameter(titleAlignment, "titleAlignment");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(startIconButton, "startIconButton");
        this.f80233a = z13;
        this.f80234b = z14;
        this.f80235c = titleAlignment;
        this.f80236d = title;
        this.f80237e = i0Var;
        this.f80238f = startIconButton;
        this.f80239g = bVar;
        this.f80240h = lVar;
        this.f80241i = z15;
        this.f80242j = iVar;
        this.f80243k = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [hn1.l] */
    /* JADX WARN: Type inference failed for: r2v9, types: [hn1.b] */
    public static b e(b bVar, boolean z13, boolean z14, q qVar, i0 i0Var, p pVar, hn1.c cVar, k kVar, int i13) {
        boolean z15 = (i13 & 1) != 0 ? bVar.f80233a : z13;
        boolean z16 = (i13 & 2) != 0 ? bVar.f80234b : z14;
        q titleAlignment = (i13 & 4) != 0 ? bVar.f80235c : qVar;
        i0 title = (i13 & 8) != 0 ? bVar.f80236d : i0Var;
        i0 i0Var2 = (i13 & 16) != 0 ? bVar.f80237e : null;
        p startIconButton = (i13 & 32) != 0 ? bVar.f80238f : pVar;
        hn1.c cVar2 = (i13 & 64) != 0 ? bVar.f80239g : cVar;
        k kVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bVar.f80240h : kVar;
        boolean z17 = bVar.f80241i;
        i iVar = bVar.f80242j;
        int i14 = bVar.f80243k;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(titleAlignment, "titleAlignment");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(startIconButton, "startIconButton");
        return new b(z15, z16, titleAlignment, title, i0Var2, startIconButton, cVar2, kVar2, z17, iVar, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f80233a == bVar.f80233a && this.f80234b == bVar.f80234b && this.f80235c == bVar.f80235c && Intrinsics.d(this.f80236d, bVar.f80236d) && Intrinsics.d(this.f80237e, bVar.f80237e) && this.f80238f == bVar.f80238f && Intrinsics.d(this.f80239g, bVar.f80239g) && Intrinsics.d(this.f80240h, bVar.f80240h) && this.f80241i == bVar.f80241i && Intrinsics.d(this.f80242j, bVar.f80242j) && this.f80243k == bVar.f80243k;
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f80236d, (this.f80235c.hashCode() + ep.b.e(this.f80234b, Boolean.hashCode(this.f80233a) * 31, 31)) * 31, 31);
        i0 i0Var = this.f80237e;
        int hashCode = (this.f80238f.hashCode() + ((d2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31)) * 31;
        hn1.b bVar = this.f80239g;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f80240h;
        int e13 = ep.b.e(this.f80241i, (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31);
        i iVar = this.f80242j;
        return Integer.hashCode(this.f80243k) + ((e13 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(showDragHandle=");
        sb3.append(this.f80233a);
        sb3.append(", isFullSheet=");
        sb3.append(this.f80234b);
        sb3.append(", titleAlignment=");
        sb3.append(this.f80235c);
        sb3.append(", title=");
        sb3.append(this.f80236d);
        sb3.append(", subHeader=");
        sb3.append(this.f80237e);
        sb3.append(", startIconButton=");
        sb3.append(this.f80238f);
        sb3.append(", endAction=");
        sb3.append(this.f80239g);
        sb3.append(", image=");
        sb3.append(this.f80240h);
        sb3.append(", shouldAddElevation=");
        sb3.append(this.f80241i);
        sb3.append(", illustration=");
        sb3.append(this.f80242j);
        sb3.append(", id=");
        return a.a.n(sb3, this.f80243k, ")");
    }
}
