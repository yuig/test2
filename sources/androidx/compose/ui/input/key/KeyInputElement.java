package androidx.compose.ui.input.key;

import j1.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.e;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Ls3/e1;", "Ll3/e;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class KeyInputElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17431b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f17432c;

    public KeyInputElement(Function1 function1, x0 x0Var) {
        this.f17431b = function1;
        this.f17432c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return Intrinsics.d(this.f17431b, keyInputElement.f17431b) && Intrinsics.d(this.f17432c, keyInputElement.f17432c);
    }

    public final int hashCode() {
        Function1 function1 = this.f17431b;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.f17432c;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        e eVar = new e();
        eVar.f81495n = this.f17431b;
        eVar.f81496o = this.f17432c;
        return eVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        e eVar = (e) pVar;
        eVar.f81495n = this.f17431b;
        eVar.f81496o = this.f17432c;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f17431b + ", onPreKeyEvent=" + this.f17432c + ')';
    }
}
