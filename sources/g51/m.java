package g51;

import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import j51.d0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl2.g0;
import wt1.c0;
import wt1.p;
import wt1.x;
import wt1.y;
import yq0.t;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63618i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f63619j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(1);
        this.f63618i = i13;
        this.f63619j = nVar;
    }

    public final void b(v7 v7Var) {
        int i13 = this.f63618i;
        n nVar = this.f63619j;
        switch (i13) {
            case 11:
                Iterator it = nVar.w3().d().iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                    } else if (!(((dl1.s) it.next()) instanceof v7)) {
                        i14++;
                    }
                }
                int max = Math.max(0, i14);
                d51.l w33 = nVar.w3();
                Intrinsics.f(v7Var);
                w33.P(max, v7Var);
                n.u3(nVar);
                if (nVar.F3()) {
                    nVar.I3();
                    break;
                }
                break;
            default:
                d51.l w34 = nVar.w3();
                String uid = v7Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                w34.X(uid);
                com.pinterest.framework.multisection.datasource.pagedlist.f fVar = nVar.A;
                int indexOf = fVar.f49190a.d().indexOf(v7Var);
                if (indexOf > 0) {
                    fVar.removeItem(indexOf);
                }
                n.u3(nVar);
                if (nVar.F3()) {
                    nVar.I3();
                    break;
                }
                break;
        }
    }

    public final void e(f30 pin) {
        int i13 = this.f63618i;
        n nVar = this.f63619j;
        switch (i13) {
            case 3:
                nVar.onRecyclerRefresh();
                break;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (nVar.isBound()) {
                    d0 d0Var = (d0) ((c51.f) nVar.getView());
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    String uid = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    PinFeed pinFeed = new PinFeed();
                    pinFeed.I(pin);
                    Unit unit = Unit.f80348a;
                    d0Var.I4(uid, pinFeed, 0, 0, null);
                    break;
                }
                break;
            case 5:
                nVar.P = new Pair(Boolean.TRUE, b40.i(pin));
                break;
        }
    }

    public final void f(c0 c0Var) {
        int i13 = this.f63618i;
        n nVar = this.f63619j;
        switch (i13) {
            case 0:
                if ((c0Var instanceof p) && nVar.isBound()) {
                    ((d0) ((c51.f) nVar.getView())).D8();
                    break;
                }
                break;
            default:
                int i14 = 0;
                if (nVar.M || !nVar.G3() || !(c0Var instanceof p)) {
                    if (c0Var instanceof y) {
                        tl1.i iVar = c0Var.f131096b;
                        x xVar = iVar instanceof x ? (x) iVar : null;
                        List list = xVar != null ? xVar.f131130b : null;
                        if (list == null) {
                            list = q0.f80391a;
                        }
                        int a13 = nVar.f63622b.f63606f.a();
                        if (list.size() > a13) {
                            c51.b bVar = ((d0) ((c51.f) nVar.getView())).f74731k1;
                            if (bVar != null) {
                                bVar.l(a13);
                            }
                        } else {
                            c51.f fVar = (c51.f) nVar.getView();
                            int size = list.size();
                            c51.b bVar2 = ((d0) fVar).f74731k1;
                            if (bVar2 != null) {
                                bVar2.l(size);
                            }
                        }
                        if (!list.isEmpty()) {
                            nVar.R = false;
                            break;
                        } else {
                            nVar.f63634n.d(new dc0.h(true));
                            List<wk1.e> dataSources = nVar.getDataSources();
                            h60.d dVar = nVar.H;
                            if ((!dataSources.contains(dVar) || dVar.f135189f) && !nVar.R) {
                                ((t) ((c51.f) nVar.getView())).setLoadState(yk1.i.LOADED);
                            }
                            nVar.R = true;
                            break;
                        }
                    }
                } else {
                    nVar.M = true;
                    if (nVar.getDataSources().contains(nVar.B3())) {
                        tl1.i iVar2 = c0Var.f131096b;
                        if (iVar2 != null && iVar2.f118095a > 0) {
                            nVar.B3().t();
                        }
                        g0.Z(nVar.B3(), nVar.f63644x);
                    }
                    d51.d dVar2 = nVar.E;
                    nVar.addDisposable(dVar2.m().F(new g(0, new m(nVar, i14)), new g(1, d.f63585k), ck2.i.f27923c, ck2.i.f27924d));
                    dVar2.n();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0202, code lost:
    
        if (r11.booleanValue() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        if (g51.n.v3(r6, r0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0196, code lost:
    
        if (g51.n.v3(r6, r11) != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g51.m.invoke(java.lang.Object):java.lang.Object");
    }
}
