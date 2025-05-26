package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import z2.p;
import z2.r;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Ls3/e1;", "Lz2/r;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final p f17401b;

    public FocusPropertiesElement(p pVar) {
        this.f17401b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.d(this.f17401b, ((FocusPropertiesElement) obj).f17401b);
    }

    public final int hashCode() {
        return this.f17401b.hashCode();
    }

    @Override // s3.e1
    public final u2.p l() {
        r rVar = new r();
        rVar.f140647n = this.f17401b;
        return rVar;
    }

    @Override // s3.e1
    public final void m(u2.p pVar) {
        ((r) pVar).f140647n = this.f17401b;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f17401b + ')';
    }
}
