package androidx.compose.foundation;

import a.cb;
import k1.p2;
import k1.t2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1.c1;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "Ls3/e1;", "Lk1/p2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class ScrollSemanticsElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final t2 f17107b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17108c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f17109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17110e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17111f;

    public ScrollSemanticsElement(t2 t2Var, boolean z13, c1 c1Var, boolean z14, boolean z15) {
        this.f17107b = t2Var;
        this.f17108c = z13;
        this.f17109d = c1Var;
        this.f17110e = z14;
        this.f17111f = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return Intrinsics.d(this.f17107b, scrollSemanticsElement.f17107b) && this.f17108c == scrollSemanticsElement.f17108c && Intrinsics.d(this.f17109d, scrollSemanticsElement.f17109d) && this.f17110e == scrollSemanticsElement.f17110e && this.f17111f == scrollSemanticsElement.f17111f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f17108c, this.f17107b.hashCode() * 31, 31);
        c1 c1Var = this.f17109d;
        return Boolean.hashCode(this.f17111f) + ep.b.e(this.f17110e, (e13 + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        p2 p2Var = new p2();
        p2Var.f77974n = this.f17107b;
        p2Var.f77975o = this.f17108c;
        p2Var.f77976p = this.f17111f;
        return p2Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        p2 p2Var = (p2) pVar;
        p2Var.f77974n = this.f17107b;
        p2Var.f77975o = this.f17108c;
        p2Var.f77976p = this.f17111f;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScrollSemanticsElement(state=");
        sb3.append(this.f17107b);
        sb3.append(", reverseScrolling=");
        sb3.append(this.f17108c);
        sb3.append(", flingBehavior=");
        sb3.append(this.f17109d);
        sb3.append(", isScrollable=");
        sb3.append(this.f17110e);
        sb3.append(", isVertical=");
        return cb.m(sb3, this.f17111f, ')');
    }
}
