package cj0;

import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) obj;
        p pVar = (p) this.f80413a;
        int i13 = p.X0;
        pVar.getClass();
        pVar.W0 = gVar.f27827e;
        f fVar = pVar.N0;
        if (fVar == null) {
            Intrinsics.r("boardContentView");
            throw null;
        }
        fVar.b(gVar);
        if (gVar.f27829g) {
            pVar.E8(0, false);
            kh2.j.x2(pVar.l9(), v0.f27871a);
        }
        RecyclerView g83 = pVar.g8();
        Object obj3 = g83 != null ? g83.f19242n : null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = obj3 instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) obj3 : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            int f19177u = pinterestStaggeredGridLayoutManager.getF19177u();
            int i14 = gVar.f27823a;
            if (f19177u != i14) {
                pinterestStaggeredGridLayoutManager.h1(i14);
                pVar.P8();
            }
        }
        yk1.i iVar = gVar.f27828f;
        if (iVar != null) {
            pVar.setLoadState(iVar);
        }
        return Unit.f80348a;
    }
}
