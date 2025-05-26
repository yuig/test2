package androidx.compose.foundation;

import k1.p1;
import k1.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1.k;
import s3.e1;
import s3.m;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Ls3/e1;", "Lk1/p1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class IndicationModifierElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final k f17095b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f17096c;

    public IndicationModifierElement(k kVar, q1 q1Var) {
        this.f17095b = kVar;
        this.f17096c = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.d(this.f17095b, indicationModifierElement.f17095b) && Intrinsics.d(this.f17096c, indicationModifierElement.f17096c);
    }

    public final int hashCode() {
        return this.f17096c.hashCode() + (this.f17095b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        m b13 = this.f17096c.b(this.f17095b);
        p1 p1Var = new p1();
        p1Var.f77973p = b13;
        p1Var.M0(b13);
        return p1Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        p1 p1Var = (p1) pVar;
        m b13 = this.f17096c.b(this.f17095b);
        p1Var.N0(p1Var.f77973p);
        p1Var.f77973p = b13;
        p1Var.M0(b13);
    }
}
