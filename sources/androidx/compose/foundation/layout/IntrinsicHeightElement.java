package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.m0;
import p1.n0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Ls3/e1;", "Lp1/m0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class IntrinsicHeightElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f17152b;

    public IntrinsicHeightElement(n0 n0Var) {
        this.f17152b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f17152b == intrinsicHeightElement.f17152b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f17152b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        m0 m0Var = new m0();
        m0Var.f98555n = this.f17152b;
        m0Var.f98556o = true;
        return m0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        m0 m0Var = (m0) pVar;
        m0Var.f98555n = this.f17152b;
        m0Var.f98556o = true;
    }
}
