package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p1.w0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Ls3/e1;", "Lp1/w0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PaddingElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17161b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17162c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17163d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17164e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f17165f;

    public PaddingElement(float f13, float f14, float f15, float f16, Function1 function1) {
        this.f17161b = f13;
        this.f17162c = f14;
        this.f17163d = f15;
        this.f17164e = f16;
        this.f17165f = function1;
        if ((f13 < 0.0f && !n4.e.a(f13, Float.NaN)) || ((f14 < 0.0f && !n4.e.a(f14, Float.NaN)) || ((f15 < 0.0f && !n4.e.a(f15, Float.NaN)) || (f16 < 0.0f && !n4.e.a(f16, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && n4.e.a(this.f17161b, paddingElement.f17161b) && n4.e.a(this.f17162c, paddingElement.f17162c) && n4.e.a(this.f17163d, paddingElement.f17163d) && n4.e.a(this.f17164e, paddingElement.f17164e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.a.a(this.f17164e, a.a.a(this.f17163d, a.a.a(this.f17162c, Float.hashCode(this.f17161b) * 31, 31), 31), 31);
    }

    @Override // s3.e1
    public final p l() {
        w0 w0Var = new w0();
        w0Var.f98611n = this.f17161b;
        w0Var.f98612o = this.f17162c;
        w0Var.f98613p = this.f17163d;
        w0Var.f98614q = this.f17164e;
        w0Var.f98615r = true;
        return w0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        w0 w0Var = (w0) pVar;
        w0Var.f98611n = this.f17161b;
        w0Var.f98612o = this.f17162c;
        w0Var.f98613p = this.f17163d;
        w0Var.f98614q = this.f17164e;
        w0Var.f98615r = true;
    }
}
