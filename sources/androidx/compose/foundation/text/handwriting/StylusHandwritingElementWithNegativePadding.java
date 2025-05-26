package androidx.compose.foundation.text.handwriting;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import x1.d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "Ls3/e1;", "Lx1/d;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class StylusHandwritingElementWithNegativePadding extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f17355b;

    public StylusHandwritingElementWithNegativePadding(Function0 function0) {
        this.f17355b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && Intrinsics.d(this.f17355b, ((StylusHandwritingElementWithNegativePadding) obj).f17355b);
    }

    public final int hashCode() {
        return this.f17355b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        return new d(this.f17355b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((d) pVar).f131559p = this.f17355b;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f17355b + ')';
    }
}
