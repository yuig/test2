package androidx.compose.ui;

import d7.g;
import kotlin.Metadata;
import s3.e1;
import u2.p;
import u2.x;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Ls3/e1;", "Lu2/x;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17384b;

    public ZIndexElement(float f13) {
        this.f17384b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f17384b, ((ZIndexElement) obj).f17384b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17384b);
    }

    @Override // s3.e1
    public final p l() {
        x xVar = new x();
        xVar.f120063n = this.f17384b;
        return xVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        ((x) pVar).f120063n = this.f17384b;
    }

    public final String toString() {
        return g.h(new StringBuilder("ZIndexElement(zIndex="), this.f17384b, ')');
    }
}
