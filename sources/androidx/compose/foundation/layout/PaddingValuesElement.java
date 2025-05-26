package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1.x0;
import p1.z0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Ls3/e1;", "Lp1/z0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class PaddingValuesElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final x0 f17166b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f17167c;

    public PaddingValuesElement(x0 x0Var, q0.e eVar) {
        this.f17166b = x0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.d(this.f17166b, paddingValuesElement.f17166b);
    }

    public final int hashCode() {
        return this.f17166b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        z0 z0Var = new z0();
        z0Var.f98623n = this.f17166b;
        return z0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((z0) pVar).f98623n = this.f17166b;
    }
}
