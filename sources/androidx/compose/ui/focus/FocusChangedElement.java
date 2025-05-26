package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Ls3/e1;", "Lz2/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class FocusChangedElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17399b;

    public FocusChangedElement(Function1 function1) {
        this.f17399b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.d(this.f17399b, ((FocusChangedElement) obj).f17399b);
    }

    public final int hashCode() {
        return this.f17399b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        z2.b bVar = new z2.b();
        bVar.f140604n = this.f17399b;
        return bVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((z2.b) pVar).f140604n = this.f17399b;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f17399b + ')';
    }
}
