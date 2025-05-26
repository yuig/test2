package androidx.compose.foundation.layout;

import i1.f1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p1.t0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Ls3/e1;", "Lp1/t0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class OffsetPxElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17159b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f17160c;

    public OffsetPxElement(Function1 function1, f1 f1Var) {
        this.f17159b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f17159b == offsetPxElement.f17159b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f17159b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        t0 t0Var = new t0();
        t0Var.f98597n = this.f17159b;
        t0Var.f98598o = true;
        return t0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        t0 t0Var = (t0) pVar;
        t0Var.f98597n = this.f17159b;
        t0Var.f98598o = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f17159b + ", rtlAware=true)";
    }
}
