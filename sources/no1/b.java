package no1;

import com.pinterest.error.NetworkResponseError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;
import x40.ad;
import x40.b5;
import x40.c5;
import x40.ed;
import x40.f9;
import x40.fd;
import x40.g5;
import x40.g9;
import x40.gd;
import x40.h5;
import x40.hd;
import x40.ic;
import x40.id;
import x40.jc;
import x40.jd;
import x40.k5;
import x40.k9;
import x40.kd;
import x40.l5;
import x40.l9;
import x40.od;
import x40.p5;
import x40.pd;
import x40.q5;
import x40.uc;
import x40.vc;
import x40.xc;
import x40.yc;
import x40.zc;
import z40.n;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f91657j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f91658k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f91659l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f91660m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f91661n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f91662o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f91663i = i13;
    }

    public final List b(h response) {
        xc xcVar;
        List<vc> list;
        uc ucVar;
        ic icVar;
        jc jcVar;
        od odVar;
        jd jdVar;
        id idVar;
        gd gdVar;
        List<fd> list2;
        ed edVar;
        switch (this.f91663i) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                ad adVar = (ad) response.f99563c;
                if (adVar != null && (icVar = adVar.f131964a) != null) {
                    Intrinsics.checkNotNullParameter(icVar, "<this>");
                    zc zcVar = icVar instanceof zc ? (zc) icVar : null;
                    if (zcVar != null && (jcVar = zcVar.f133822e) != null) {
                        Intrinsics.checkNotNullParameter(jcVar, "<this>");
                        yc ycVar = jcVar instanceof yc ? (yc) jcVar : null;
                        if (ycVar != null) {
                            xcVar = ycVar.f133739e;
                            if (xcVar != null || (list = xcVar.f133685a) == null) {
                                break;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (vc vcVar : list) {
                                    if (vcVar == null || (ucVar = vcVar.f133553a) == null) {
                                        ucVar = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(ucVar, "<this>");
                                    }
                                    if (ucVar != null) {
                                        arrayList.add(ucVar);
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                xcVar = null;
                if (xcVar != null) {
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                pd pdVar = (pd) response.f99563c;
                if (pdVar != null && (odVar = pdVar.f133041a) != null) {
                    Intrinsics.checkNotNullParameter(odVar, "<this>");
                    kd kdVar = odVar instanceof kd ? (kd) odVar : null;
                    if (kdVar != null && (jdVar = kdVar.f132677e) != null && (idVar = jdVar.f132615a) != null) {
                        Intrinsics.checkNotNullParameter(idVar, "<this>");
                        hd hdVar = idVar instanceof hd ? (hd) idVar : null;
                        if (hdVar != null && (gdVar = hdVar.f132502b) != null && (list2 = gdVar.f132450a) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (fd fdVar : list2) {
                                if (fdVar == null || (edVar = fdVar.f132411a) == null) {
                                    edVar = null;
                                } else {
                                    Intrinsics.checkNotNullParameter(edVar, "<this>");
                                }
                                if (edVar != null) {
                                    arrayList2.add(edVar);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        return q0.f80391a;
    }

    public final n e(h it) {
        b5 b5Var;
        k9 k9Var;
        f9 f9Var;
        switch (this.f91663i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                g5 g5Var = ((h5) it.a()).f132489a;
                if (g5Var != null) {
                    Intrinsics.checkNotNullParameter(g5Var, "<this>");
                    c5 c5Var = g5Var instanceof c5 ? (c5) g5Var : null;
                    if (c5Var != null && (b5Var = c5Var.f132099e) != null) {
                        Intrinsics.checkNotNullParameter(b5Var, "<this>");
                        return b5Var;
                    }
                }
                throw new NetworkResponseError((Object) null);
            default:
                Intrinsics.checkNotNullParameter(it, "response");
                l9 l9Var = (l9) it.f99563c;
                if (l9Var == null || (k9Var = l9Var.f132726a) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(k9Var, "<this>");
                g9 g9Var = k9Var instanceof g9 ? (g9) k9Var : null;
                if (g9Var == null || (f9Var = g9Var.f132441e) == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(f9Var, "<this>");
                return f9Var;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k5 k5Var;
        switch (this.f91663i) {
            case 0:
                return b((h) obj);
            case 1:
                return b((h) obj);
            case 2:
                return Unit.f80348a;
            case 3:
                return e((h) obj);
            case 4:
                h it = (h) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                p5 p5Var = ((q5) it.a()).f133106a;
                if (p5Var != null) {
                    Intrinsics.checkNotNullParameter(p5Var, "<this>");
                    l5 l5Var = p5Var instanceof l5 ? (l5) p5Var : null;
                    if (l5Var != null && (k5Var = l5Var.f132702e) != null) {
                        Intrinsics.checkNotNullParameter(k5Var, "<this>");
                        return k5Var;
                    }
                }
                throw new NetworkResponseError((Object) null);
            default:
                return e((h) obj);
        }
    }
}
