package yi1;

import com.pinterest.api.model.or;
import kotlin.jvm.internal.Intrinsics;
import qa2.c1;

/* loaded from: classes2.dex */
public final class h0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i f139091a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f139092b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.n f139093c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139094d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139095e;

    /* renamed from: f, reason: collision with root package name */
    public final or f139096f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f139097g;

    /* renamed from: h, reason: collision with root package name */
    public final cs.c f139098h;

    /* renamed from: i, reason: collision with root package name */
    public final float f139099i;

    /* renamed from: j, reason: collision with root package name */
    public final k f139100j;

    /* renamed from: k, reason: collision with root package name */
    public final c1 f139101k;

    /* renamed from: l, reason: collision with root package name */
    public final int f139102l;

    /* renamed from: m, reason: collision with root package name */
    public final u50.x f139103m;

    public h0(u50.i iVar, u50.n topCornerRadius, u50.n bottomCornerRadius, boolean z13, boolean z14, or orVar, boolean z15, cs.c collectionDpaLayoutType, float f13, k pinHeightType, c1 c1Var, int i13, u50.x heightAdjustment) {
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(bottomCornerRadius, "bottomCornerRadius");
        Intrinsics.checkNotNullParameter(collectionDpaLayoutType, "collectionDpaLayoutType");
        Intrinsics.checkNotNullParameter(pinHeightType, "pinHeightType");
        Intrinsics.checkNotNullParameter(heightAdjustment, "heightAdjustment");
        this.f139091a = iVar;
        this.f139092b = topCornerRadius;
        this.f139093c = bottomCornerRadius;
        this.f139094d = z13;
        this.f139095e = z14;
        this.f139096f = orVar;
        this.f139097g = z15;
        this.f139098h = collectionDpaLayoutType;
        this.f139099i = f13;
        this.f139100j = pinHeightType;
        this.f139101k = c1Var;
        this.f139102l = i13;
        this.f139103m = heightAdjustment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f139091a, h0Var.f139091a) && Intrinsics.d(this.f139092b, h0Var.f139092b) && Intrinsics.d(this.f139093c, h0Var.f139093c) && this.f139094d == h0Var.f139094d && this.f139095e == h0Var.f139095e && Intrinsics.d(this.f139096f, h0Var.f139096f) && this.f139097g == h0Var.f139097g && this.f139098h == h0Var.f139098h && Float.compare(this.f139099i, h0Var.f139099i) == 0 && Intrinsics.d(this.f139100j, h0Var.f139100j) && Intrinsics.d(null, null) && this.f139101k == h0Var.f139101k && this.f139102l == h0Var.f139102l && Intrinsics.d(this.f139103m, h0Var.f139103m);
    }

    public final int hashCode() {
        u50.i iVar = this.f139091a;
        int e13 = ep.b.e(this.f139095e, ep.b.e(this.f139094d, d7.g.e(this.f139093c, d7.g.e(this.f139092b, (iVar == null ? 0 : iVar.hashCode()) * 31, 31), 31), 31), 31);
        or orVar = this.f139096f;
        int hashCode = (this.f139100j.hashCode() + a.a.a(this.f139099i, (this.f139098h.hashCode() + ep.b.e(this.f139097g, (e13 + (orVar == null ? 0 : orVar.hashCode())) * 31, 31)) * 31, 31)) * 961;
        c1 c1Var = this.f139101k;
        return Integer.hashCode(this.f139103m.f120588a) + ep.b.b(this.f139102l, (hashCode + (c1Var != null ? c1Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "StateTransformerImageDS(backgroundColor=" + this.f139091a + ", topCornerRadius=" + this.f139092b + ", bottomCornerRadius=" + this.f139093c + ", isFullWidth=" + this.f139094d + ", renderImageOnly=" + this.f139095e + ", stateTransformerComputedImageCrop=" + this.f139096f + ", isCollagesCutoutPin=" + this.f139097g + ", collectionDpaLayoutType=" + this.f139098h + ", imageAspectRatioTwoByTwo=" + this.f139099i + ", pinHeightType=" + this.f139100j + ", imageActionButtonDescription=null, resizeTypeOverride=" + this.f139101k + ", maxHeightConstraintForPinStretching=" + this.f139102l + ", heightAdjustment=" + this.f139103m + ")";
    }
}
