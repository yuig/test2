package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Ls3/e1;", "Landroidx/compose/foundation/lazy/layout/f1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends s3.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f17198b;

    public TraversablePrefetchStateModifierElement(l0 l0Var) {
        this.f17198b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.d(this.f17198b, ((TraversablePrefetchStateModifierElement) obj).f17198b);
    }

    public final int hashCode() {
        return this.f17198b.hashCode();
    }

    @Override // s3.e1
    public final u2.p l() {
        return new f1(this.f17198b);
    }

    @Override // s3.e1
    public final void m(u2.p pVar) {
        ((f1) pVar).f17239n = this.f17198b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f17198b + ')';
    }
}
