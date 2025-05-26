package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import y2.c;
import y2.d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Ls3/e1;", "Ly2/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final /* data */ class DrawWithCacheElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17386b;

    public DrawWithCacheElement(Function1 function1) {
        this.f17386b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.d(this.f17386b, ((DrawWithCacheElement) obj).f17386b);
    }

    public final int hashCode() {
        return this.f17386b.hashCode();
    }

    @Override // s3.e1
    public final p l() {
        return new c(new d(), this.f17386b);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        c cVar = (c) pVar;
        cVar.f136663q = this.f17386b;
        cVar.M0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f17386b + ')';
    }
}
