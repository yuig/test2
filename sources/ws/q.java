package ws;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.LruCache;
import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.pi0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zi0;
import ey.o4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import x91.d0;
import y01.c1;

/* loaded from: classes3.dex */
public final class q implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131071a;

    public /* synthetic */ q(int i13) {
        this.f131071a = i13;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        Object obj;
        List g13;
        String pinUid;
        Object obj2;
        switch (this.f131071a) {
            case 0:
                w request = (w) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                break;
            case 1:
                mt.o request2 = (mt.o) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                break;
            case 2:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(hVar);
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(null, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                break;
            case 3:
                g90.s request3 = (g90.s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request3 instanceof g90.s) {
                    String L = kg.t.L(request3.f64563a);
                    if (L == null) {
                        LruCache lruCache = ew.f37357a;
                        obj = null;
                    } else {
                        obj = ew.f37367k.get(L);
                    }
                    fi0 fi0Var = obj instanceof fi0 ? (fi0) obj : null;
                    if (fi0Var != null) {
                        List M = fi0Var.M();
                        if (M == null) {
                            M = q0.f80391a;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : M) {
                            zi0 H = ((pi0) obj3).H();
                            if (H == null || (g13 = H.g()) == null || !g13.contains("not_template")) {
                                arrayList.add(obj3);
                            }
                        }
                        eventIntake.a(new g90.e(arrayList));
                        break;
                    }
                }
                break;
            case 4:
                hp0.b0 request4 = (hp0.b0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if ((request4 instanceof hp0.b0) && (pinUid = request4.f69824a) != null) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    String concat = "qcm:".concat(pinUid);
                    if (concat == null) {
                        LruCache lruCache2 = ew.f37357a;
                        obj2 = null;
                    } else {
                        obj2 = ew.f37367k.get(concat);
                    }
                    vh vhVar = obj2 instanceof vh ? (vh) obj2 : null;
                    if (vhVar == null) {
                        eventIntake.a(hp0.d.f69826a);
                        break;
                    } else {
                        List list = vhVar.f42865w;
                        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof f30) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (b40.x((f30) next) != d40.COMPLETE_HIDDEN) {
                                arrayList3.add(next);
                            }
                        }
                        eventIntake.a(new hp0.e(arrayList3));
                        break;
                    }
                }
                break;
            case 5:
                y01.n request5 = (y01.n) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof y01.k) {
                    vb0.j.f125466a.F(((y01.k) request5).f136425a, tb0.p.CLOSEUP, new Object[0]);
                    break;
                } else if (request5 instanceof y01.l) {
                    y01.l lVar = (y01.l) request5;
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.q(lVar.f136428a, lVar.f136429b, lVar.f136430c);
                    break;
                } else if (request5 instanceof y01.m) {
                    y01.m mVar = (y01.m) request5;
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.h hVar2 = tb0.g.f117075a;
                    mVar.getClass();
                    hVar2.s("viewAdapterExists", String.valueOf(true));
                    hVar2.s("isResumed", String.valueOf(mVar.f136434a));
                    Integer num = mVar.f136435b;
                    if (num != null) {
                        hVar2.s("viewAdapterCount", String.valueOf(num.intValue()));
                        Integer num2 = mVar.f136436c;
                        if (num2 != null) {
                            hVar2.s("pinFeedCount", String.valueOf(num2.intValue()));
                        }
                        Integer num3 = mVar.f136437d;
                        if (num3 != null) {
                            hVar2.s("pinFeedAbsCount", String.valueOf(num3.intValue()));
                            break;
                        }
                    }
                }
                break;
            case 6:
                c1 request6 = (c1) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                String pinUid2 = request6.f136395a.getF49940b();
                Intrinsics.checkNotNullExpressionValue(pinUid2, "getId(...)");
                new jy.j(pinUid2).i();
                Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                new jy.u(pinUid2).i();
                Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                new jy.u(pinUid2).i();
                Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                new o4(pinUid2).i();
                break;
            case 7:
                d0 request7 = (d0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request7 instanceof x91.y) {
                    kotlin.jvm.internal.j.z(scope, null, null, new y91.a(((x91.y) request7).f134362a, null), 3);
                    break;
                } else if (request7 instanceof x91.b0) {
                    kotlin.jvm.internal.j.z(scope, null, null, new y91.b(((x91.b0) request7).f134309a, eventIntake, null), 3);
                    break;
                }
                break;
            case 8:
                hw1.q request8 = (hw1.q) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request8, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new iw1.a(request8, null), 2);
                break;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(hVar);
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(null, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                break;
        }
    }
}
