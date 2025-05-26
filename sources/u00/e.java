package u00;

import android.net.TrafficStats;
import android.os.Handler;
import bk1.a2;
import com.google.android.gms.common.api.internal.b0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.metrics.exceptions.EmptyConnectionMetricsCollectionException;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ek1.e0;
import ek1.g0;
import ek1.r;
import ek1.r1;
import ek1.x;
import fk1.w;
import gk1.d0;
import gk1.x0;
import h32.y1;
import h32.z1;
import hk1.v;
import io.reactivex.exceptions.UndeliverableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import lb.u0;
import ni1.o2;
import ni1.x2;
import ni1.y2;
import okhttp3.ResponseBody;
import rl1.q;
import so.oa;
import u50.p0;
import zy.l0;

/* loaded from: classes.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f119832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i13) {
        super(1);
        this.f119831i = i13;
        this.f119832j = obj;
    }

    public final r b(r it) {
        int i13 = this.f119831i;
        Object obj = this.f119832j;
        switch (i13) {
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, null, null, false, (qa2.m) obj, 15);
            case 19:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, az.b.e(it.f59329b, null, (z1) obj, null, 5), null, false, null, 29);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                az.b bVar = it.f59329b;
                z1 source = bVar.f20694b;
                Intrinsics.f(source);
                Intrinsics.checkNotNullParameter(source, "source");
                return r.e(it, null, az.b.e(bVar, null, new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, Boolean.valueOf(((e0) ((g0) obj)).f59229a), source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), null, 5), null, false, null, 29);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                az.b bVar2 = it.f59329b;
                return r.e(it, null, az.b.e(bVar2, nx.c.a(bVar2.f20693a, bs1.c.o2((HashMap) obj)), null, null, 6), null, false, null, 29);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                z1 z1Var = ((x) obj).f59390a;
                return r.e(it, null, az.b.e(it.f59329b, null, z1Var, az.a.IMPRESSION_ENDED, 1), new ek1.m(z1Var), false, null, 25);
        }
    }

    public final y2 e(y2 it) {
        int i13 = this.f119831i;
        Object obj = this.f119832j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                l0 pinalyticsVMState = (l0) obj;
                dk1.h hVar = it.V;
                f30 pinModel = hVar.f55166a;
                Intrinsics.checkNotNullParameter(pinModel, "pinModel");
                wa2.m pinFeatureConfig = hVar.f55168c;
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                x2 experimentConfigs = hVar.f55170e;
                Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
                Map experimentsGroupInfo = hVar.f55171f;
                Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
                return y2.b(it, null, pinalyticsVMState, null, false, false, null, null, false, false, false, false, 0, false, false, new dk1.h(pinModel, hVar.f55167b, pinFeatureConfig, pinalyticsVMState, experimentConfigs, experimentsGroupInfo), r1.b(it.W, pinalyticsVMState, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -5, 4194303), x0.b(it.X, false, false, false, pinalyticsVMState, 0, false, null, null, false, null, false, null, false, false, false, null, null, false, false, null, -33, 255), v.b(it.Y, pinalyticsVMState, false, false, false, null, 1015), w.b(it.Z, pinalyticsVMState, 0, null, null, false, null, null, false, false, false, false, null, 16777211), ck1.d.b(it.f90902a0, pinalyticsVMState, false, 23), a2.b(it.f90904b0, pinalyticsVMState, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -5, 524287), -9, 32767);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                wy0 wy0Var = (wy0) obj;
                return y2.b(it, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, a2.b(it.f90904b0, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, wy0Var != null ? wy0Var.getUid() : null, null, null, false, false, null, false, false, null, null, false, false, false, false, -1, 524279), -1, 2097151);
        }
    }

    public final q f(q it) {
        int i13 = this.f119831i;
        Object obj = this.f119832j;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, ((ij1.j) obj).f72359o.f72376b.f72344d, null, false, false, null, 0, null, null, 2035);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, ((ij1.a) obj).f72344d, null, false, false, null, 0, null, null, 2039);
        }
    }

    public final void h(Throwable th3) {
        int i13 = this.f119831i;
        Object obj = this.f119832j;
        switch (i13) {
            case 4:
                if (!(th3 instanceof UndeliverableException)) {
                    Intrinsics.f(th3);
                    ((n60.m) obj).getClass();
                    throw th3;
                }
                n60.m mVar = (n60.m) obj;
                if (!kh2.n.B(th3, new mz.c(mVar, 8))) {
                    tb0.h hVar = (tb0.h) ((bf2.b) bf2.b.a(((oa) ((n60.p) mVar.f89274e.getValue())).f113797m0)).get();
                    UndeliverableException undeliverableException = (UndeliverableException) th3;
                    if (hVar.f117078b.get() && hVar.f117079c.get()) {
                        hVar.f117097u.h(undeliverableException);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (th3 instanceof EmptyConnectionMetricsCollectionException) {
                    Object obj2 = ((j0) obj).f80434a;
                    if (obj2 != null) {
                        return;
                    } else {
                        Intrinsics.r("configuration");
                        throw null;
                    }
                }
                return;
            default:
                if (th3 instanceof CancellationException) {
                    ((o2) obj).g();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        int i13 = this.f119831i;
        Object obj2 = this.f119832j;
        switch (i13) {
            case 0:
                dl1.s it = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.getUid(), ((dl1.s) obj2).getUid()));
            case 1:
                z40.b error = (z40.b) obj;
                Intrinsics.checkNotNullParameter(error, "it");
                b0 b0Var = ((c10.d) obj2).f24486c;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                if (((qb0.e) b0Var.f30790c).c()) {
                    c10.a aVar = (c10.a) b0Var.f30791d;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(error, "error");
                    boolean contains = aVar.f24480a.contains(error.b());
                    Object obj3 = b0Var.f30793f;
                    if (contains) {
                        ((t00.i) obj3).a(error.a().getMessage(), null);
                    } else if (b0Var.f30788a) {
                        ((c10.a) b0Var.f30791d).getClass();
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (!r3.f24481b.contains(error.b())) {
                            ((t00.i) obj3).b(error.a().getMessage(), null);
                        }
                    }
                }
                return Unit.f80348a;
            case 2:
                ResponseBody body = (ResponseBody) obj;
                Intrinsics.checkNotNullParameter(body, "body");
                return new kk2.k(new u0(5, body, (y20.a) obj2), 1).r(tk2.e.f118015a);
            case 3:
                if (((m60.a) obj) == m60.a.BACKGROUND) {
                    ep1.a aVar2 = (ep1.a) obj2;
                    int i14 = aVar2.f59893c;
                    aVar2.f59898h = TrafficStats.getUidRxBytes(i14);
                    aVar2.f59899i = TrafficStats.getUidTxBytes(i14);
                    Handler handler = aVar2.f59894d;
                    sq0.a aVar3 = aVar2.f59895e;
                    if (aVar3 == null) {
                        Intrinsics.r("runnable");
                        throw null;
                    }
                    handler.postDelayed(aVar3, aVar2.f59891a);
                } else {
                    ep1.a aVar4 = (ep1.a) obj2;
                    Handler handler2 = aVar4.f59894d;
                    sq0.a aVar5 = aVar4.f59895e;
                    if (aVar5 == null) {
                        Intrinsics.r("runnable");
                        throw null;
                    }
                    handler2.removeCallbacks(aVar5);
                }
                return Unit.f80348a;
            case 4:
                h((Throwable) obj);
                return Unit.f80348a;
            case 5:
                Integer verticalOffset = (Integer) obj;
                Intrinsics.checkNotNullParameter(verticalOffset, "verticalOffset");
                return Integer.valueOf(((int) ((r70.b) obj2).a()) - verticalOffset.intValue());
            case 6:
                ug0.c result = (ug0.c) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                String str = result.f122126a;
                return Boolean.valueOf(str == null || Intrinsics.d(str, ((tg0.a) obj2).toString()));
            case 7:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (((com.pinterest.feature.home.model.g) obj2).a()) {
                    os0.b bVar = os0.b.f97497a;
                    Intrinsics.checkNotNullParameter(String.valueOf(it2.getMessage()), "error");
                    new ny.d(s92.o.ERROR, null, null, 0, null, false, 62).i();
                }
                return uj2.b0.g(it2);
            case 8:
                pn1.b it3 = (pn1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return pn1.b.e(it3, null, bs1.c.h2(((lt0.e) obj2).f84788h), 0, false, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER);
            case 9:
                h((Throwable) obj);
                return Unit.f80348a;
            case 10:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ((SingleColumnCarouselPinView) obj2).setContentDescription(it4);
                return Unit.f80348a;
            case 11:
                return e((y2) obj);
            case 12:
                return e((y2) obj);
            case 13:
                ni1.u0 it5 = (ni1.u0) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return ni1.u0.e(it5, 0, null, (bb2.i) obj2, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 2097143);
            case 14:
                h((Throwable) obj);
                return Unit.f80348a;
            case 15:
                y1 update = (y1) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ((pb0.g) ((SbaPinRep) obj2).getClock()).getClass();
                update.f67439e = Long.valueOf(System.currentTimeMillis() * 1000000);
                return Unit.f80348a;
            case 16:
                return f((q) obj);
            case 17:
                return f((q) obj);
            case 18:
                return b((r) obj);
            case 19:
                r1 it6 = (r1) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return r1.b(it6, null, null, 0, null, null, null, false, false, yi1.r.a(((r1) obj2).f59351m, false, null, 0L, 0L, true, false, null, 447), 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -4097, 4194303);
            case 20:
                return b((r) obj);
            case 21:
                return b((r) obj);
            case 22:
                return b((r) obj);
            case 23:
                return b((r) obj);
            case 24:
                fk1.d it7 = (fk1.d) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                List list = it7.f62348a;
                aj1.a[] elements = (aj1.a[]) obj2;
                Intrinsics.checkNotNullParameter(list, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList arrayList = new ArrayList(list.size() + elements.length);
                arrayList.addAll(list);
                k0.v(arrayList, elements);
                return fk1.d.e(arrayList);
            case 25:
                u50.v image = (u50.v) obj;
                Intrinsics.checkNotNullParameter(image, "$this$image");
                ((p0) obj2).e("*");
                return Unit.f80348a;
            case 26:
                w it8 = (w) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                wa2.g0 g0Var = ((fk1.f) ((fk1.j) obj2)).f62350a.f128851b0;
                if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.RECENTLY_VIEWED_PRODUCTS_STORY) {
                    if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.RECENTLY_SAVED_PRODUCTS_STORY) {
                        if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.BEST_SELLING_FOLLOWING_BRAND_PRODUCTS_STORY) {
                            if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.BEST_SELLING_RECOMMENDED_BRAND_PRODUCTS_STORY) {
                                if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.SHOP_THE_BOARD_PRODUCTS_STORY) {
                                    if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.ON_SALE_PRODUCTS_STORY) {
                                        if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.RECONSIDERATION_PRODUCTS_STORY) {
                                            if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.PRODUCT_CATEGORY_ON_SALE_PRODUCTS_STORY) {
                                                if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.BEST_SELLING_PRODUCT_CATEGORY_PRODUCTS_STORY) {
                                                    if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.PRODUCT_CATEGORY_BASED_PRODUCTS_STORY) {
                                                        if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.STYLE_AND_PC_STORY) {
                                                            if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.ON_SALE_CLOSEUP_PRODUCTS_STORY) {
                                                                if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.ON_SALE_SEARCH_PRODUCTS_STORY) {
                                                                    if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.SHOP_SEARCH_PRODUCTS_STORY) {
                                                                        if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.BOARD_SHOP_MODULE) {
                                                                            if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.SHOP_TOOL_STL_MODULE) {
                                                                                z13 = false;
                                                                                return w.b(it8, null, 0, null, null, z13, null, null, false, false, false, false, null, 16776703);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z13 = true;
                return w.b(it8, null, 0, null, null, z13, null, null, false, false, false, false, null, 16776703);
            case 27:
                gk1.l state = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return gk1.l.e(state, CollectionsKt.m0((jj1.d) obj2, state.f65239a), null, null, 6);
            case 28:
                x0 it9 = (x0) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                gk1.x xVar = (gk1.x) ((d0) obj2);
                wa2.m mVar = xVar.f65288a;
                boolean z14 = mVar.N;
                wa2.g0 g0Var2 = mVar.f128851b0;
                return x0.b(it9, z14, mVar.O, mVar.G, null, 0, g0Var2 != null && g0Var2.f128731m, mVar.S, mVar.T, mVar.f128847J, mVar.f128877o0, mVar.f128879p0, null, xVar.f65290c, false, false, null, null, false, false, null, -1074774045, 255);
            default:
                hk1.g state2 = (hk1.g) obj;
                Intrinsics.checkNotNullParameter(state2, "state");
                return hk1.g.e(CollectionsKt.m0(new zj1.b((rm1.c) obj2), state2.f69351a));
        }
    }
}
