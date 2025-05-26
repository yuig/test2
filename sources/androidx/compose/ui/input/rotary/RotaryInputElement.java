package androidx.compose.ui.input.rotary;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p3.b;
import s3.e1;
import t3.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Ls3/e1;", "Lp3/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17442b = p.f116117k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return Intrinsics.d(this.f17442b, ((RotaryInputElement) obj).f17442b) && Intrinsics.d(null, null);
        }
        return false;
    }

    public final int hashCode() {
        Function1 function1 = this.f17442b;
        return (function1 == null ? 0 : function1.hashCode()) * 31;
    }

    @Override // s3.e1
    public final u2.p l() {
        b bVar = new b();
        bVar.f98721n = this.f17442b;
        bVar.f98722o = null;
        return bVar;
    }

    @Override // s3.e1
    public final void m(u2.p pVar) {
        b bVar = (b) pVar;
        bVar.f98721n = this.f17442b;
        bVar.f98722o = null;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f17442b + ", onPreRotaryScrollEvent=null)";
    }
}
