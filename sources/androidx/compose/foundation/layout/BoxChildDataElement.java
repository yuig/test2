package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p1.n;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Ls3/e1;", "Lp1/n;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BoxChildDataElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final u2.e f17147b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17148c;

    public BoxChildDataElement(u2.e eVar, boolean z13) {
        this.f17147b = eVar;
        this.f17148c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return Intrinsics.d(this.f17147b, boxChildDataElement.f17147b) && this.f17148c == boxChildDataElement.f17148c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17148c) + (this.f17147b.hashCode() * 31);
    }

    @Override // s3.e1
    public final p l() {
        n nVar = new n();
        nVar.f98557n = this.f17147b;
        nVar.f98558o = this.f17148c;
        return nVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        n nVar = (n) pVar;
        nVar.f98557n = this.f17147b;
        nVar.f98558o = this.f17148c;
    }
}
