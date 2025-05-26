package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p1.i0;
import s3.e1;
import u2.g;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Ls3/e1;", "Lp1/i0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HorizontalAlignElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final u2.c f17151b;

    public HorizontalAlignElement(g gVar) {
        this.f17151b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.d(this.f17151b, horizontalAlignElement.f17151b);
    }

    public final int hashCode() {
        return Float.hashCode(((g) this.f17151b).f120032a);
    }

    @Override // s3.e1
    public final p l() {
        i0 i0Var = new i0();
        i0Var.f98526n = this.f17151b;
        return i0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((i0) pVar).f98526n = this.f17151b;
    }
}
