package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import y2.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Ls3/e1;", "Ly2/g;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class DrawWithContentElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17387b;

    public DrawWithContentElement(Function1 function1) {
        this.f17387b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.d(this.f17387b, ((DrawWithContentElement) obj).f17387b);
    }

    public final int hashCode() {
        return this.f17387b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        g gVar = new g();
        gVar.f136668n = this.f17387b;
        return gVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((g) pVar).f136668n = this.f17387b;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f17387b + ')';
    }
}
