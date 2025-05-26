package androidx.compose.ui.layout;

import kl2.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q3.b0;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Ls3/e1;", "Lq3/b0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final l f17443b;

    public LayoutElement(l lVar) {
        this.f17443b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.d(this.f17443b, ((LayoutElement) obj).f17443b);
    }

    public final int hashCode() {
        return this.f17443b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        b0 b0Var = new b0();
        b0Var.f102169n = this.f17443b;
        return b0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((b0) pVar).f102169n = this.f17443b;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f17443b + ')';
    }
}
