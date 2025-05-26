package ul1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f122449a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f122450b;

    /* renamed from: c, reason: collision with root package name */
    public final l f122451c;

    /* renamed from: d, reason: collision with root package name */
    public final fm1.c f122452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f122453e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f122454f;

    public c(i0 text, i0 contentDescription, l variant, fm1.c visibility, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f122449a = text;
        this.f122450b = contentDescription;
        this.f122451c = variant;
        this.f122452d = visibility;
        this.f122453e = i13;
        this.f122454f = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [u50.i0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ul1.l] */
    public static c e(c cVar, k0 k0Var, f fVar, fm1.c cVar2, int i13, int i14) {
        k0 k0Var2 = k0Var;
        if ((i14 & 1) != 0) {
            k0Var2 = cVar.f122449a;
        }
        k0 text = k0Var2;
        i0 contentDescription = cVar.f122450b;
        f fVar2 = fVar;
        if ((i14 & 4) != 0) {
            fVar2 = cVar.f122451c;
        }
        f variant = fVar2;
        if ((i14 & 8) != 0) {
            cVar2 = cVar.f122452d;
        }
        fm1.c visibility = cVar2;
        if ((i14 & 16) != 0) {
            i13 = cVar.f122453e;
        }
        int i15 = i13;
        boolean z13 = (i14 & 32) != 0 ? cVar.f122454f : false;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new c(text, contentDescription, variant, visibility, i15, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f122449a, cVar.f122449a) && Intrinsics.d(this.f122450b, cVar.f122450b) && Intrinsics.d(this.f122451c, cVar.f122451c) && this.f122452d == cVar.f122452d && this.f122453e == cVar.f122453e && this.f122454f == cVar.f122454f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122454f) + ep.b.b(this.f122453e, d7.g.a(this.f122452d, (this.f122451c.hashCode() + ep.b.d(this.f122450b, this.f122449a.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f122449a);
        sb3.append(", contentDescription=");
        sb3.append(this.f122450b);
        sb3.append(", variant=");
        sb3.append(this.f122451c);
        sb3.append(", visibility=");
        sb3.append(this.f122452d);
        sb3.append(", id=");
        sb3.append(this.f122453e);
        sb3.append(", showIcon=");
        return a.a.r(sb3, this.f122454f, ")");
    }
}
