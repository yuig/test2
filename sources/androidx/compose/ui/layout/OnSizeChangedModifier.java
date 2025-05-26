package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import lb.l0;
import q3.y0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Ls3/e1;", "Lq3/y0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17446b;

    public OnSizeChangedModifier(Function1 function1) {
        this.f17446b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f17446b == ((OnSizeChangedModifier) obj).f17446b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17446b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        return new y0(this.f17446b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        y0 y0Var = (y0) pVar;
        y0Var.f102276n = this.f17446b;
        y0Var.f102277o = l0.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
