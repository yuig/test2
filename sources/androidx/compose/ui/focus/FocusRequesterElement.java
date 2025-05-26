package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import z2.s;
import z2.u;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Ls3/e1;", "Lz2/u;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class FocusRequesterElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final s f17402b;

    public FocusRequesterElement(s sVar) {
        this.f17402b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.d(this.f17402b, ((FocusRequesterElement) obj).f17402b);
    }

    public final int hashCode() {
        return this.f17402b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        u uVar = new u();
        uVar.f140651n = this.f17402b;
        return uVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        u uVar = (u) pVar;
        uVar.f140651n.f140650a.n(uVar);
        s sVar = this.f17402b;
        uVar.f140651n = sVar;
        sVar.f140650a.b(uVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f17402b + ')';
    }
}
