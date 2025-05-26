package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.q0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Ls3/e1;", "Lp1/q0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LayoutWeightElement extends e1 {

    /* renamed from: b */
    public final float f17154b;

    /* renamed from: c */
    public final boolean f17155c;

    public LayoutWeightElement(float f13, boolean z13) {
        this.f17154b = f13;
        this.f17155c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f17154b == layoutWeightElement.f17154b && this.f17155c == layoutWeightElement.f17155c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17155c) + (Float.hashCode(this.f17154b) * 31);
    }

    @Override // s3.e1
    public final p l() {
        q0 q0Var = new q0();
        q0Var.f98573n = this.f17154b;
        q0Var.f98574o = this.f17155c;
        return q0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        q0 q0Var = (q0) pVar;
        q0Var.f98573n = this.f17154b;
        q0Var.f98574o = this.f17155c;
    }
}
