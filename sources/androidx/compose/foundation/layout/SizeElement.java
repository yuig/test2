package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.i1;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Ls3/e1;", "Lp1/i1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SizeElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17168b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17169c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17170d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17171e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17172f;

    public SizeElement(float f13, float f14, float f15, float f16, boolean z13) {
        this.f17168b = f13;
        this.f17169c = f14;
        this.f17170d = f15;
        this.f17171e = f16;
        this.f17172f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return n4.e.a(this.f17168b, sizeElement.f17168b) && n4.e.a(this.f17169c, sizeElement.f17169c) && n4.e.a(this.f17170d, sizeElement.f17170d) && n4.e.a(this.f17171e, sizeElement.f17171e) && this.f17172f == sizeElement.f17172f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17172f) + a.a.a(this.f17171e, a.a.a(this.f17170d, a.a.a(this.f17169c, Float.hashCode(this.f17168b) * 31, 31), 31), 31);
    }

    @Override // s3.e1
    public final p l() {
        i1 i1Var = new i1();
        i1Var.f98527n = this.f17168b;
        i1Var.f98528o = this.f17169c;
        i1Var.f98529p = this.f17170d;
        i1Var.f98530q = this.f17171e;
        i1Var.f98531r = this.f17172f;
        return i1Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        i1 i1Var = (i1) pVar;
        i1Var.f98527n = this.f17168b;
        i1Var.f98528o = this.f17169c;
        i1Var.f98529p = this.f17170d;
        i1Var.f98530q = this.f17171e;
        i1Var.f98531r = this.f17172f;
    }

    public SizeElement(float f13, float f14, float f15, float f16, boolean z13, int i13) {
        this((i13 & 1) != 0 ? Float.NaN : f13, (i13 & 2) != 0 ? Float.NaN : f14, (i13 & 4) != 0 ? Float.NaN : f15, (i13 & 8) != 0 ? Float.NaN : f16, z13);
    }
}
