package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import z3.c;
import z3.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Ls3/e1;", "Lz3/c;", "Lz3/k;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends e1 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17464b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f17465c;

    public AppendedSemanticsElement(Function1 function1, boolean z13) {
        this.f17464b = z13;
        this.f17465c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f17464b == appendedSemanticsElement.f17464b && Intrinsics.d(this.f17465c, appendedSemanticsElement.f17465c);
    }

    public final int hashCode() {
        return this.f17465c.hashCode() + (Boolean.hashCode(this.f17464b) * 31);
    }

    @Override // s3.e1
    public final p l() {
        c cVar = new c();
        cVar.f140662n = this.f17464b;
        cVar.f140663o = false;
        cVar.f140664p = this.f17465c;
        return cVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        c cVar = (c) pVar;
        cVar.f140662n = this.f17464b;
        cVar.f140664p = this.f17465c;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f17464b + ", properties=" + this.f17465c + ')';
    }
}
