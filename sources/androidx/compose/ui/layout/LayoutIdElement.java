package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q3.y;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Ls3/e1;", "Lq3/y;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class LayoutIdElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f17444b;

    public LayoutIdElement(Object obj) {
        this.f17444b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.d(this.f17444b, ((LayoutIdElement) obj).f17444b);
    }

    public final int hashCode() {
        return this.f17444b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        y yVar = new y();
        yVar.f102275n = this.f17444b;
        return yVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((y) pVar).f102275n = this.f17444b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f17444b + ')';
    }
}
