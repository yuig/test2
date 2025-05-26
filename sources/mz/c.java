package mz;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.apollographql.apollo3.exception.ApolloException;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i10;
import com.pinterest.api.model.q30;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.boardAutoCollages.m0;
import com.pinterest.error.NoConnectionErrorWithUrls;
import com.pinterest.error.ServerError;
import com.pinterest.error.TimeoutErrorWithUrls;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.screens.k0;
import df.j1;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.u0;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k92.l;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.f0;
import kotlin.text.z;
import l82.n;
import m60.w;
import m90.b1;
import n70.t0;
import o82.i2;
import o82.j0;
import qz.r;
import s80.a2;
import s80.e2;
import s80.f7;
import s80.j;
import s80.n6;
import s80.o0;
import s80.o6;
import s80.p6;
import s80.r0;
import s80.s1;
import s80.t1;
import s80.v6;
import s80.w0;
import s80.z6;
import ta0.v;
import tb0.p;
import u50.p0;
import uj2.c0;
import w80.d1;
import w80.g1;
import z80.m;
import z80.q;
import z80.x;
import zb0.i;
import zy.d0;
import zy.l0;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88524i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f88525j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i13) {
        super(1);
        this.f88524i = i13;
        this.f88525j = obj;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f88524i;
        Object obj = this.f88525j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.DARK;
                jz.a aVar = (jz.a) obj;
                String str = aVar.f77733b;
                fm1.c Z = d7.b.Z(!(str == null || z.j(str)));
                String str2 = aVar.f77733b;
                return rn1.a.y(it, bs1.c.h2(str2 != null ? str2 : ""), cVar, null, null, vn1.g.BODY_100, 0, Z, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097068);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String f13 = ((i10) obj).f();
                String str3 = f13 != null ? f13 : "";
                if (str3.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((Object) f0.a(str3.charAt(0)));
                    String substring = str3.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb3.append(substring);
                    str3 = sb3.toString();
                }
                return rn1.a.y(it, ep.b.x(str3, "string", str3), null, e0.b(vn1.b.CENTER), null, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
        }
    }

    public final j e(j it) {
        int i13 = this.f88524i;
        Object obj = this.f88525j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return j.e(it, null, null, null, null, null, null, null, null, v6.e(it.f111600i, null, ((r0) ((w0) obj)).f111778a, false, 5), null, null, null, false, false, false, null, 130815);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                it.f111597f.getClass();
                return j.e(it, null, null, null, null, null, new d1((g1) obj), null, null, null, null, null, null, false, false, false, null, 131039);
        }
    }

    public final n6 f(n6 it) {
        int i13 = this.f88524i;
        Object obj = this.f88525j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, ((o0) obj).f111733a, null, true, false, false, false, null, null, null, null, null, null, null, null, false, null, false, null, 2097142);
            case 20:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, null, null, null, null, null, ((z6) obj).f111881a, null, false, null, false, null, 2088959);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, ((s1) obj).f111789a, true, false, false, false, null, null, null, null, null, null, null, null, false, null, false, null, 2097139);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, ((t1) obj).f111799a, null, null, null, null, null, null, false, null, false, null, 2096895);
        }
    }

    public final void h(wy0 wy0Var) {
        int i13 = this.f88524i;
        Object obj = this.f88525j;
        switch (i13) {
            case 3:
                x10.d dVar = (x10.d) obj;
                b60.b bVar = dVar.f131567d;
                Intrinsics.f(wy0Var);
                ((b60.d) bVar).j(wy0Var);
                wy0 f13 = ((b60.d) dVar.f131567d).f();
                if (f13 != null) {
                    dVar.f131565b.W(f13);
                    break;
                }
                break;
            default:
                ((kk2.a) ((c0) obj)).b(wy0Var);
                break;
        }
    }

    public final void i(n buildAndStart) {
        int i13 = this.f88524i;
        int i14 = 18;
        int i15 = 17;
        int i16 = 16;
        int i17 = 15;
        Object obj = this.f88525j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                g60.j jVar = (g60.j) obj;
                n.b(buildAndStart, jVar.f63716c);
                n.b(buildAndStart, jVar.f63717d);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                d0 a13 = ((h60.c) obj).f67786c.a();
                buildAndStart.a(a13, new ns.o0(i17), a13.a());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                m0 m0Var = (m0) obj;
                mb0.a aVar = (mb0.a) m0Var.f44587h.f63225b;
                buildAndStart.a(aVar, new ns.o0(i16), aVar.a());
                w60.d dVar = m0Var.f44582c;
                buildAndStart.a(dVar, new ns.o0(19), dVar.a());
                nu.a aVar2 = m0Var.f44583d;
                buildAndStart.a(aVar2, new ns.o0(i14), aVar2.a());
                d0 d0Var = m0Var.f44584e;
                buildAndStart.a(d0Var, new ns.o0(20), d0Var.a());
                v vVar = m0Var.f44585f;
                buildAndStart.a(vVar, new ns.o0(i15), vVar.a());
                l lVar = m0Var.f44586g;
                buildAndStart.a(lVar, new ns.o0(21), lVar.a());
                break;
            case 14:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                t0 t0Var = (t0) obj;
                d0 d0Var2 = t0Var.f89681g;
                buildAndStart.a(d0Var2, new ns.o0(26), d0Var2.a());
                mb0.a aVar3 = (mb0.a) t0Var.f89682h.f63225b;
                buildAndStart.a(aVar3, new ns.o0(22), aVar3.a());
                p70.e eVar = t0Var.f89678d;
                buildAndStart.a(eVar, new ns.o0(23), eVar.a());
                i60.a aVar4 = t0Var.f89679e;
                buildAndStart.a(aVar4, new ns.o0(24), aVar4.a());
                nu.a aVar5 = t0Var.f89680f;
                buildAndStart.a(aVar5, new ns.o0(25), aVar5.a());
                break;
            case 16:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                h80.s sVar = (h80.s) obj;
                n.b(buildAndStart, sVar.f68119c);
                n.b(buildAndStart, sVar.f68120d);
                i60.a aVar6 = sVar.f68121e;
                buildAndStart.a(aVar6, new ns.o0(27), aVar6.a());
                break;
            case 25:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                p6 p6Var = (p6) obj;
                m mVar = p6Var.f111759e;
                buildAndStart.a(mVar, new o6(1), mVar.a());
                z80.d dVar2 = p6Var.f111767m;
                buildAndStart.a(dVar2, new o6(2), dVar2.a());
                z80.b bVar = p6Var.f111760f;
                buildAndStart.a(bVar, new o6(3), bVar.a());
                z80.s sVar2 = p6Var.f111762h;
                buildAndStart.a(sVar2, new o6(6), sVar2.a());
                q qVar = p6Var.f111766l;
                buildAndStart.a(qVar, new o6(4), qVar.a());
                x xVar = p6Var.f111763i;
                buildAndStart.a(xVar, new o6(5), xVar.a());
                o22.a aVar7 = p6Var.f111768n;
                buildAndStart.a(aVar7, new o6(7), aVar7.a());
                i iVar = p6Var.f111758d;
                buildAndStart.a(iVar, new ns.o0(28), iVar.a());
                t80.s sVar3 = p6Var.f111764j;
                buildAndStart.a(sVar3, new ns.o0(29), sVar3.a());
                d0 d0Var3 = p6Var.f111765k;
                buildAndStart.a(d0Var3, new o6(8), d0Var3.a());
                v vVar2 = p6Var.f111761g;
                buildAndStart.a(vVar2, new o6(0), vVar2.a());
                break;
            case 26:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                g90.c0 c0Var = (g90.c0) obj;
                ws.q qVar2 = c0Var.f64516c;
                buildAndStart.a(qVar2, new o6(10), qVar2.a());
                w60.d dVar3 = c0Var.f64517d;
                buildAndStart.a(dVar3, new o6(11), dVar3.a());
                d0 a14 = c0Var.f64518e.a();
                buildAndStart.a(a14, new o6(9), a14.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                b1 b1Var = (b1) obj;
                mb0.a aVar8 = (mb0.a) b1Var.f86637h.f63225b;
                buildAndStart.a(aVar8, new o6(i17), aVar8.a());
                o90.c cVar = b1Var.f86633d;
                buildAndStart.a(cVar, new o6(i16), cVar.a());
                d0 d0Var4 = b1Var.f86634e;
                buildAndStart.a(d0Var4, new o6(i15), d0Var4.a());
                o22.c cVar2 = b1Var.f86636g;
                buildAndStart.a(cVar2, new o6(i14), cVar2.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        String uid;
        String uid2;
        wy0 b13;
        String name;
        String str;
        a4 a4Var;
        a4 a4Var2;
        m60.f0 f0Var = vb0.j.f125466a;
        int i14 = this.f88524i;
        int i15 = 2;
        boolean z13 = false;
        byte b14 = 0;
        Object obj2 = this.f88525j;
        switch (i14) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i14) {
                    case 1:
                        r rVar = (r) obj2;
                        Intrinsics.f(th3);
                        rVar.getClass();
                        rVar.f105430b.q(th3, "Error during ImageCacheManager initialization or media prefetch", p.PERFORMANCE);
                        break;
                    default:
                        String str2 = ((u60.n) obj2).L;
                        break;
                }
                return Unit.f80348a;
            case 2:
                String componentName = (String) obj;
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                String str3 = "[ApolloClientFactory]: Could not extract " + componentName + " from Apollo client.\nThis means that the Apollo client was not configured properly.";
                f0Var.F(str3, (p) obj2, new Object[0]);
                throw new ApolloException(str3, 2);
            case 3:
                h((wy0) obj);
                return Unit.f80348a;
            case 4:
                Intrinsics.checkNotNullParameter((u50.v) obj, "$this$null");
                ((p0) obj2).e("*");
                return Unit.f80348a;
            case 5:
                i((n) obj);
                return Unit.f80348a;
            case 6:
                i((n) obj);
                return Unit.f80348a;
            case 7:
                vh response = (vh) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof q30) {
                        arrayList.add(obj3);
                    }
                }
                h60.d dVar = (h60.d) obj2;
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q30 q30Var = (q30) it.next();
                    i0 p13 = dVar.f67788l.p();
                    if (p13 == null) {
                        p13 = new i0(d4.USER, a4.USER_SELF, null, h32.g0.BOARDS_TAB, null, null);
                    }
                    arrayList2.add(new g60.g(q30Var, new l0(p13, dVar.f67789m), b14 == true ? 1 : 0, 4));
                }
                if (!arrayList2.isEmpty()) {
                    dVar.f67791o.invoke();
                }
                return e0.b(new h60.g(arrayList2, dVar.f67792p, dVar.f67793q, (Integer) null, dVar.f67789m, 24));
            case 8:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                ((n60.m) obj2).getClass();
                if ((error instanceof NoConnectionErrorWithUrls) || (error instanceof TimeoutErrorWithUrls) || (error instanceof ServerError) || (error instanceof UnknownHostException) || ((error instanceof ErrnoException) && ((i13 = ((ErrnoException) error).errno) == OsConstants.ENETUNREACH || i13 == OsConstants.ECONNREFUSED))) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 9:
                h((wy0) obj);
                return Unit.f80348a;
            case 10:
                Throwable th4 = (Throwable) obj;
                switch (i14) {
                    case 1:
                        r rVar2 = (r) obj2;
                        Intrinsics.f(th4);
                        rVar2.getClass();
                        rVar2.f105430b.q(th4, "Error during ImageCacheManager initialization or media prefetch", p.PERFORMANCE);
                        break;
                    default:
                        String str4 = ((u60.n) obj2).L;
                        break;
                }
                return Unit.f80348a;
            case 11:
                String collageId = (String) obj;
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                int i16 = com.pinterest.boardAutoCollages.q.T0;
                kh2.j.x2(((com.pinterest.boardAutoCollages.q) obj2).k9(), new com.pinterest.boardAutoCollages.g(collageId));
                return Unit.f80348a;
            case 12:
                i((n) obj);
                return Unit.f80348a;
            case 13:
                n70.o0 vmState = (n70.o0) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                zd1.c0 c0Var = (zd1.c0) obj2;
                return n70.o0.b(vmState, dl2.b.R0(c0Var.a()), 0, new j0(new i2(new m70.f(vmState.f89635a, vmState.f89636b, vmState.f89643i, dl2.b.R0(c0Var.a())), i15)), null, 5631);
            case 14:
                i((n) obj);
                return Unit.f80348a;
            case 15:
                return b((rn1.a) obj);
            case 16:
                i((n) obj);
                return Unit.f80348a;
            case 17:
                a2 it2 = (a2) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i17 = e2.f111509k0;
                ((e2) obj2).Z7(it2);
                return Unit.f80348a;
            case 18:
                GestaltSpinner it3 = (GestaltSpinner) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                dl2.b.X2(it3, ((f7) obj2).f111539a ? ln1.e.LOADING : ln1.e.NONE);
                return Unit.f80348a;
            case 19:
                return f((n6) obj);
            case 20:
                return e((j) obj);
            case 21:
                return f((n6) obj);
            case 22:
                return f((n6) obj);
            case 23:
                return e((j) obj);
            case 24:
                return f((n6) obj);
            case 25:
                i((n) obj);
                return Unit.f80348a;
            case 26:
                i((n) obj);
                return Unit.f80348a;
            case 27:
                int intValue = ((Number) obj).intValue();
                k90.l lVar = (k90.l) obj2;
                lVar.getClass();
                Object sVar = new jc0.s();
                w wVar = lVar.f78794d;
                wVar.d(sVar);
                String str5 = lVar.f78792b;
                f30 f30Var = lVar.f78791a;
                nx.d0 d0Var = lVar.f78795e;
                if (intValue == 0) {
                    d0Var.h(h32.g0.SHEET, u0.ADD_TO_COLLAGE_BUTTON, lVar.a());
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) k0.f51021a.getValue());
                    if (f30Var != null && (uid = f30Var.getUid()) != null) {
                        w13.m0("com.pinterest.EXTRA_PIN_ID", uid);
                    }
                    if (str5 != null) {
                        w13.m0("EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", str5);
                    }
                    w13.z(d32.c.CUTOUT_CLOSEUP_OVERFLOW_MENU.getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
                    w13.Y1("{CollageDraftPickerExtras.}EXTRA_ALLOW_NAVIGATION_TO_COMPOSER", true);
                    wVar.d(w13);
                } else if (intValue == 1) {
                    d0Var.h(h32.g0.SHEET, u0.PIN_FLAG_BUTTON, lVar.a());
                    if (f30Var == null || (uid2 = b40.o(f30Var)) == null) {
                        uid2 = (f30Var == null || (b13 = g02.a.b(f30Var)) == null) ? null : b13.getUid();
                        if (uid2 == null) {
                            uid2 = lVar.f78793c;
                        }
                    }
                    String str6 = uid2;
                    if (j1.U0(str5) && j1.U0(str6)) {
                        i0 p14 = d0Var.p();
                        ScreenLocation screenLocation = (ScreenLocation) k0.f51023c.getValue();
                        Intrinsics.f(str5);
                        NavigationImpl z03 = Navigation.z0(screenLocation, str5);
                        d4 d4Var = lVar.f78796f;
                        String name2 = d4Var.name();
                        String name3 = (p14 == null || (a4Var2 = p14.f67082b) == null) ? null : a4Var2.name();
                        Intrinsics.f(str6);
                        if (p14 == null || (a4Var = p14.f67082b) == null || (name = a4Var.name()) == null) {
                            name = d4Var.name();
                        }
                        String str7 = name;
                        if (f30Var != null) {
                            nx.d1 d1Var = lVar.f78797g;
                            str = d1Var != null ? d1Var.d(d0Var, f30Var) : null;
                        } else {
                            str = null;
                        }
                        z03.w0(new ReportData.PinReportData(lVar.f78792b, name2, name3, str6, str7, str, f30Var != null ? f30Var.z4() : null, null, com.bumptech.glide.d.o0(f30Var != null ? f30Var.i5() : null)), "com.pinterest.EXTRA_REPORT_DATA");
                        wVar.d(z03);
                    } else {
                        f0Var.F("shuffleAssetId and creatorId should always be provided", p.COLLAGES, new Object[0]);
                    }
                }
                return Unit.f80348a;
            case 28:
                m90.b it4 = (m90.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ((m90.l) ((m90.m) obj2)).getClass();
                return m90.b.e(it4, null, false, null, 95);
            default:
                i((n) obj);
                return Unit.f80348a;
        }
    }
}
