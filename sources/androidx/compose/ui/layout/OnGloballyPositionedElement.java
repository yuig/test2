package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import q3.x0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Ls3/e1;", "Lq3/x0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17445b;

    public OnGloballyPositionedElement(Function1 function1) {
        this.f17445b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f17445b == ((OnGloballyPositionedElement) obj).f17445b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17445b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        x0 x0Var = new x0();
        x0Var.f102274n = this.f17445b;
        return x0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((x0) pVar).f102274n = this.f17445b;
    }
}
