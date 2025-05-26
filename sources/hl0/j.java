package hl0;

import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class j extends rk2.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yk1.p f69479c;

    public /* synthetic */ j(yk1.p pVar, int i13) {
        this.f69478b = i13;
        this.f69479c = pVar;
    }

    @Override // uj2.d0
    public final void onError(Throwable throwable) {
        int i13 = this.f69478b;
        yk1.p pVar = this.f69479c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                v vVar = (v) pVar;
                if (vVar.isBound()) {
                    vVar.f69539p.o("BoardPresenter Fail to load board.", throwable);
                    yk1.n nVar = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                    if (nVar != null) {
                        ((yq0.t) nVar).setLoadState(yk1.i.ERROR);
                    }
                    vVar.f69541q.i(((yk1.a) vVar.f69546u).f139224a.getString(x0.generic_error));
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Could not load board and section in BoardSectionContentTabPresenter", throwable);
                un0.h hVar = (un0.h) pVar;
                hVar.f122839g.i(((yk1.a) hVar.f122840h).f139224a.getString(x0.generic_error));
                yk1.n nVar2 = (sn0.a) hVar.getViewIfBound();
                if (nVar2 != null) {
                    ((yq0.t) nVar2).setLoadState(yk1.i.LOADED);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Set set = is0.h.B;
                ((PinGridHideView) ((hs0.b) ((is0.h) pVar).getView())).b();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e1  */
    @Override // uj2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.j.onSuccess(java.lang.Object):void");
    }
}
