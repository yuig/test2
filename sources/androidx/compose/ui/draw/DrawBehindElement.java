package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import y2.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Ls3/e1;", "Ly2/e;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17385b;

    public DrawBehindElement(Function1 function1) {
        this.f17385b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.d(this.f17385b, ((DrawBehindElement) obj).f17385b);
    }

    public final int hashCode() {
        return this.f17385b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        e eVar = new e();
        eVar.f136667n = this.f17385b;
        return eVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((e) pVar).f136667n = this.f17385b;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f17385b + ')';
    }
}
