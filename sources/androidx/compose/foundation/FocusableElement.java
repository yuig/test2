package androidx.compose.foundation;

import k1.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1.l;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Ls3/e1;", "Lk1/u0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FocusableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f17093b;

    public FocusableElement(l lVar) {
        this.f17093b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.d(this.f17093b, ((FocusableElement) obj).f17093b);
        }
        return false;
    }

    public final int hashCode() {
        l lVar = this.f17093b;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // s3.e1
    public final p l() {
        return new u0(this.f17093b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((u0) pVar).P0(this.f17093b);
    }
}
