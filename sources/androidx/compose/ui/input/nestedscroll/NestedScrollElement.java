package androidx.compose.ui.input.nestedscroll;

import androidx.activity.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m3.d;
import m3.g;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Ls3/e1;", "Lm3/g;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NestedScrollElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final m3.a f17433b;

    /* renamed from: c, reason: collision with root package name */
    public final d f17434c;

    public NestedScrollElement(m3.a aVar, d dVar) {
        this.f17433b = aVar;
        this.f17434c = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.d(nestedScrollElement.f17433b, this.f17433b) && Intrinsics.d(nestedScrollElement.f17434c, this.f17434c);
    }

    public final int hashCode() {
        int hashCode = this.f17433b.hashCode() * 31;
        d dVar = this.f17434c;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // s3.e1
    public final p l() {
        return new g(this.f17433b, this.f17434c);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        g gVar = (g) pVar;
        gVar.f85740n = this.f17433b;
        d dVar = gVar.f85741o;
        if (dVar.f85726a == gVar) {
            dVar.f85726a = null;
        }
        d dVar2 = this.f17434c;
        if (dVar2 == null) {
            gVar.f85741o = new d();
        } else if (!Intrinsics.d(dVar2, dVar)) {
            gVar.f85741o = dVar2;
        }
        if (gVar.f120054m) {
            d dVar3 = gVar.f85741o;
            dVar3.f85726a = gVar;
            dVar3.f85727b = new a0(gVar, 9);
            dVar3.f85728c = gVar.z0();
        }
    }
}
