package androidx.compose.foundation.layout;

import kotlin.Metadata;
import p1.n0;
import p1.p0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Ls3/e1;", "Lp1/p0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class IntrinsicWidthElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f17153b;

    public IntrinsicWidthElement(n0 n0Var) {
        this.f17153b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f17153b == intrinsicWidthElement.f17153b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f17153b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        p0 p0Var = new p0();
        p0Var.f98566n = this.f17153b;
        p0Var.f98567o = true;
        return p0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        p0 p0Var = (p0) pVar;
        p0Var.f98566n = this.f17153b;
        p0Var.f98567o = true;
    }
}
