package z3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.g1;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pinterest.activity.library.modal.ManageVisibilityToggleItemView;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.api.model.rp;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import cp.z;
import is1.b0;
import is1.f0;
import is1.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import m60.x0;
import okhttp3.WebSocket;
import oq.c0;
import oq.p0;
import pc.n0;
import pc.r0;
import r1.j0;
import rq.d0;
import rq.g2;
import rq.h1;
import rq.m4;
import rq.w3;
import rq.y0;
import u50.k0;
import v.q1;
import x40.a9;
import x40.ad;
import x40.b9;
import x40.c9;
import x40.d9;
import x40.e9;
import x40.f9;
import x40.g9;
import x40.ic;
import x40.jc;
import x40.k9;
import x40.l9;
import x40.ub;
import x40.uc;
import x40.vc;
import x40.wc;
import x40.xc;
import x40.yc;
import x40.zc;
import zp.a0;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f140705j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i13) {
        super(1);
        this.f140704i = i13;
        this.f140705j = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public final com.pinterest.framework.multisection.datasource.pagedlist.l b(pc.h response) {
        xc xcVar;
        ?? r03;
        wc wcVar;
        wc wcVar2;
        List<vc> list;
        uc ucVar;
        ic icVar;
        jc jcVar;
        c9 c9Var;
        ?? r04;
        List<b9> list2;
        a9 a9Var;
        k9 k9Var;
        f9 f9Var;
        e9 e9Var;
        int i13 = this.f140704i;
        boolean z13 = false;
        String str = null;
        Object obj = this.f140705j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(response, "response");
                n0 n0Var = response.f99563c;
                ad adVar = n0Var instanceof ad ? (ad) n0Var : null;
                if (adVar != null && (icVar = adVar.f131964a) != null) {
                    Intrinsics.checkNotNullParameter(icVar, "<this>");
                    zc zcVar = icVar instanceof zc ? (zc) icVar : null;
                    if (zcVar != null && (jcVar = zcVar.f133822e) != null) {
                        Intrinsics.checkNotNullParameter(jcVar, "<this>");
                        yc ycVar = jcVar instanceof yc ? (yc) jcVar : null;
                        if (ycVar != null) {
                            xcVar = ycVar.f133739e;
                            if (xcVar != null || (list = xcVar.f133685a) == null) {
                                r03 = q0.f80391a;
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
                                gi.m mVar = (gi.m) obj;
                                r03 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    z40.f fVar = (z40.f) next;
                                    int i14 = ep.m.f59886a[((ep.n) mVar.f65095d).ordinal()];
                                    if (i14 == 1) {
                                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                                        if (((uc) fVar).f133470g == null) {
                                            r03.add(next);
                                        }
                                    } else {
                                        if (i14 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                                        if (((uc) fVar).f133470g != null) {
                                            r03.add(next);
                                        }
                                    }
                                }
                            }
                            if (xcVar != null && (wcVar2 = xcVar.f133686b) != null) {
                                str = wcVar2.f133622a;
                            }
                            if (xcVar != null && (wcVar = xcVar.f133686b) != null) {
                                z13 = wcVar.f133624c;
                            }
                            return new com.pinterest.framework.multisection.datasource.pagedlist.l(str, r03, z13);
                        }
                    }
                }
                xcVar = null;
                if (xcVar != null) {
                }
                r03 = q0.f80391a;
                if (xcVar != null) {
                    str = wcVar2.f133622a;
                }
                if (xcVar != null) {
                    z13 = wcVar.f133624c;
                }
                return new com.pinterest.framework.multisection.datasource.pagedlist.l(str, r03, z13);
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                ((jp.i) obj).getClass();
                n0 n0Var2 = response.f99563c;
                l9 l9Var = n0Var2 instanceof l9 ? (l9) n0Var2 : null;
                if (l9Var != null && (k9Var = l9Var.f132726a) != null) {
                    Intrinsics.checkNotNullParameter(k9Var, "<this>");
                    g9 g9Var = k9Var instanceof g9 ? (g9) k9Var : null;
                    if (g9Var != null && (f9Var = g9Var.f132441e) != null && (e9Var = f9Var.f132405i) != null) {
                        Intrinsics.checkNotNullParameter(e9Var, "<this>");
                        d9 d9Var = e9Var instanceof d9 ? (d9) e9Var : null;
                        if (d9Var != null) {
                            c9Var = d9Var.f132235b;
                            if (c9Var != null || (list2 = c9Var.f132104a) == null) {
                                r04 = q0.f80391a;
                            } else {
                                r04 = new ArrayList();
                                for (b9 b9Var : list2) {
                                    if (b9Var == null || (a9Var = b9Var.f132036a) == null) {
                                        a9Var = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(a9Var, "<this>");
                                    }
                                    if (a9Var != null) {
                                        r04.add(a9Var);
                                    }
                                }
                            }
                            return new com.pinterest.framework.multisection.datasource.pagedlist.l("", r04, false);
                        }
                    }
                }
                c9Var = null;
                if (c9Var != null) {
                }
                r04 = q0.f80391a;
                return new com.pinterest.framework.multisection.datasource.pagedlist.l("", r04, false);
        }
    }

    public final rn1.a e(rn1.a state) {
        int i13 = this.f140704i;
        Object obj = this.f140705j;
        switch (i13) {
            case 18:
                Intrinsics.checkNotNullParameter(state, "state");
                String blockReason = ((rp) ((tt1.a) obj).c()).getBlockReason();
                return rn1.a.y(state, bs1.c.h2(blockReason != null ? blockReason : ""), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 19:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, null, null, null, null, ((y0) obj).f109661g ? vn1.g.UI_100 : vn1.g.UI_200, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096975);
            case 20:
                Intrinsics.checkNotNullParameter(state, "it");
                int id3 = ((p0) obj).getId();
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(state, new k0(id3, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 22:
                Intrinsics.checkNotNullParameter(state, "it");
                String str = ((d0) obj).f109131b;
                String str2 = str != null ? str : "";
                return rn1.a.y(state, ep.b.x(str2, "string", str2), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final void f(g0 g0Var) {
        oq.q0 q0Var;
        int i13 = this.f140704i;
        Object obj = this.f140705j;
        switch (i13) {
            case 25:
                if ((g0Var instanceof f0) || (g0Var instanceof is1.d0)) {
                    g2 g2Var = (g2) obj;
                    int i14 = g2.f109203k;
                    if (g2Var.hasContent()) {
                        g2Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                p0 p0Var = null;
                if (g0Var instanceof b0) {
                    w3 w3Var = (w3) obj;
                    i92.k kVar = w3Var.f109622d;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.i(w3Var.getResources().getString(x0.generic_error));
                    Throwable th3 = ((b0) g0Var).f73576b;
                    p0Var = p0.SHOW_TRANSLATION;
                } else if (g0Var instanceof is1.d0) {
                    p0Var = p0.SHOW_TRANSLATION;
                } else if (g0Var instanceof f0) {
                    p0Var = p0.SHOW_ORIGINAL;
                }
                if (p0Var == null || (q0Var = ((w3) obj).f109624f) == null) {
                    return;
                }
                q0Var.a(p0Var);
                return;
        }
    }

    public final void h(String contentText) {
        int i13 = this.f140704i;
        Object obj = this.f140705j;
        switch (i13) {
            case 24:
                Intrinsics.checkNotNullParameter(contentText, "it");
                c0 c0Var = ((h1) obj).f109238t;
                if (c0Var != null) {
                    Intrinsics.checkNotNullParameter(contentText, "contentText");
                    if (!c0Var.v()) {
                        c0Var.setContentDescription(contentText);
                        break;
                    } else {
                        View view = c0Var.G;
                        if (view != null) {
                            view.setContentDescription(contentText);
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(contentText, "it");
                PinterestVideoView pinterestVideoView = (PinterestVideoView) obj;
                pinterestVideoView.setContentDescription(contentText);
                SimplePlayerControlView simplePlayerControlView = pinterestVideoView.F;
                if (simplePlayerControlView != null) {
                    simplePlayerControlView.setContentDescription(contentText);
                    break;
                }
                break;
        }
    }

    public final void i(Throwable th3) {
        int i13 = this.f140704i;
        Object obj = this.f140705j;
        switch (i13) {
            case 2:
                ((com.google.common.util.concurrent.c0) obj).cancel(false);
                break;
            case 5:
                ((WebSocket) obj).f(1001, null);
                break;
            case 10:
                ek2.f fVar = ((cp.c0) obj).f52924f;
                if (fVar != null) {
                    bk2.c.dispose(fVar);
                    break;
                }
                break;
            case 19:
                Intrinsics.f(th3);
                ((q1) ((aq.f) obj)).a(th3);
                break;
            default:
                bs1.c.X0((m4) obj);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecyclerView g83;
        int i13;
        int i14;
        int i15 = this.f140704i;
        byte b13 = 0;
        int i16 = 1;
        Object obj2 = this.f140705j;
        switch (i15) {
            case 0:
                w.h((y) obj, ((g) obj2).f140670a);
                return Unit.f80348a;
            case 1:
            default:
                pq.b it = (pq.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, null, null, null, false, false, false, false, false, null, false, ((PdpCloseupCarouselView) obj2).f35051h <= 0, 1023);
            case 2:
                i((Throwable) obj);
                return Unit.f80348a;
            case 3:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                z9.w wVar = (z9.w) obj2;
                ArrayList arrayList = wVar.f141300d;
                Collection values = ((Map) wVar.f141304h.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.k0.u(((z9.t) it2.next()).f141289b, arrayList2);
                }
                return Boolean.valueOf(!CollectionsKt.l0((List) wVar.f141307k.getValue(), CollectionsKt.l0(arrayList2, arrayList)).contains(key));
            case 4:
                z9.k entry = (z9.k) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return new q5.n(i16, (ca.k) obj2, entry);
            case 5:
                i((Throwable) obj);
                return Unit.f80348a;
            case 6:
                return Boolean.valueOf(Intrinsics.d(com.bugsnag.android.y0.f29694f.i((File) obj, ((g1) obj2).f29234g).f29698d, "startupcrash"));
            case 7:
                return Integer.valueOf(Intrinsics.j(((Thread) obj).getId(), ((Thread) obj2).getId()));
            case 8:
                lo.e it3 = (lo.e) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ((WebViewYouTubePlayer) it3).a((mo.b) obj2);
                return Unit.f80348a;
            case 9:
                z zVar = (z) obj2;
                kp.o oVar = (kp.o) kp.o.getEntries().get(((Number) obj).intValue());
                int i17 = z.f52984d;
                zVar.getClass();
                zVar.f52987c.a(zVar.f52986b.a(zVar.f52985a, oVar.getSnoozeTime()).r(tk2.e.f118017c).l(wj2.c.a()).o(new vo.a(22, new ba.s(7, oVar, zVar)), new vo.a(23, cp.y.f52983i)));
                return Unit.f80348a;
            case 10:
                i((Throwable) obj);
                return Unit.f80348a;
            case 11:
                return b((pc.h) obj);
            case 12:
                if ((((sq0.v) obj) instanceof sq0.r) && (g83 = ((cp.u) ((rb2.p) obj2)).g8()) != null) {
                    g83.G2(0);
                }
                return Unit.f80348a;
            case 13:
                return b((pc.h) obj);
            case 14:
                com.pinterest.framework.multisection.datasource.pagedlist.p requestState = (com.pinterest.framework.multisection.datasource.pagedlist.p) obj;
                Intrinsics.checkNotNullParameter(requestState, "requestState");
                pc.q0 q0Var = new pc.q0(Integer.valueOf(requestState.f49152a));
                String str = requestState.f49153b;
                r0 q0Var2 = str == null ? pc.p0.f99597a : new pc.q0(str);
                lh0.p0 p0Var = ((jp.j) obj2).f77275b;
                p0Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) p0Var.f83455a;
                return new ub(q0Var, q0Var2, new pc.q0(Boolean.valueOf(g1Var.o("android_real_time_messaging_killswitch", "enabled", z3Var) || g1Var.l("android_real_time_messaging_killswitch"))), 4);
            case 15:
                wy0 user = (wy0) obj;
                zp.x xVar = ((zp.v) obj2).f142521f;
                if (xVar != null) {
                    Intrinsics.f(user);
                    Intrinsics.checkNotNullParameter(user, "user");
                    zp.b bVar = zp.b.Hidden;
                    zp.b bVar2 = xVar.f142576b;
                    if (bVar2 != bVar) {
                        if (xVar.f142577c) {
                            int i18 = d70.g.visibility_option_title_visible_to_others;
                            Context context = xVar.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                            marginLayoutParams.bottomMargin = bs1.c.W(gestaltText, eo1.c.space_200);
                            gestaltText.setLayoutParams(marginLayoutParams);
                            GestaltText i19 = gestaltText.i(new j0(i18, 5));
                            ViewGroup.LayoutParams layoutParams = i19.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams2.topMargin = bs1.c.W(i19, eo1.c.space_800);
                            i19.setLayoutParams(marginLayoutParams2);
                            xVar.addView(i19);
                        }
                        Boolean t43 = user.t4();
                        Intrinsics.checkNotNullExpressionValue(t43, "getShowAllPins(...)");
                        boolean booleanValue = t43.booleanValue();
                        int[] iArr = zp.w.f142525a;
                        int i23 = iArr[bVar2.ordinal()];
                        int i24 = 2;
                        if (i23 == 1) {
                            i13 = d70.g.show_all_pins_for_all;
                        } else if (i23 == 2) {
                            i13 = d70.g.show_all_pins;
                        } else {
                            if (i23 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i13 = 0;
                        }
                        int i25 = iArr[bVar2.ordinal()];
                        if (i25 == 1) {
                            i14 = d70.g.show_all_pins_description_for_all;
                        } else if (i25 == 2) {
                            i14 = d70.g.show_all_pins_description;
                        } else {
                            if (i25 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i14 = 0;
                        }
                        zp.z zVar2 = new zp.z(false);
                        Context context2 = xVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        ManageVisibilityToggleItemView manageVisibilityToggleItemView = new ManageVisibilityToggleItemView(context2);
                        a0 a0Var = new a0(manageVisibilityToggleItemView, i13, i16);
                        GestaltSwitchWithLabel gestaltSwitchWithLabel = manageVisibilityToggleItemView.f34949a;
                        c0.d.k(gestaltSwitchWithLabel, a0Var);
                        c0.d.k(gestaltSwitchWithLabel, new a0(manageVisibilityToggleItemView, i14, b13 == true ? 1 : 0));
                        c0.d.k(gestaltSwitchWithLabel, new cp.t(booleanValue, i24));
                        manageVisibilityToggleItemView.f34950b = zVar2;
                        manageVisibilityToggleItemView.f34951c = xVar.f142575a;
                        xVar.addView(manageVisibilityToggleItemView);
                    }
                }
                return Unit.f80348a;
            case 16:
                j((on1.i) obj);
                return Unit.f80348a;
            case 17:
                j((on1.i) obj);
                return Unit.f80348a;
            case 18:
                return e((rn1.a) obj);
            case 19:
                i((Throwable) obj);
                return Unit.f80348a;
            case 20:
                return e((rn1.a) obj);
            case 21:
                vy0 user2 = (vy0) obj;
                Intrinsics.checkNotNullParameter(user2, "user");
                user2.f43100z1 = Boolean.valueOf(!((pg0.e) obj2).f100059a);
                boolean[] zArr = user2.V1;
                if (zArr.length > 129) {
                    zArr[129] = true;
                }
                wy0 a13 = user2.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            case 22:
                return e((rn1.a) obj);
            case 23:
                return e((rn1.a) obj);
            case 24:
                h((String) obj);
                return Unit.f80348a;
            case 25:
                f((g0) obj);
                return Unit.f80348a;
            case 26:
                f((g0) obj);
                return Unit.f80348a;
            case 27:
                i((Throwable) obj);
                return Unit.f80348a;
            case 28:
                h((String) obj);
                return Unit.f80348a;
        }
    }

    public final void j(on1.i it) {
        int i13 = this.f140704i;
        Object obj = this.f140705j;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                ManageVisibilityToggleItemView manageVisibilityToggleItemView = (ManageVisibilityToggleItemView) obj;
                zp.y yVar = manageVisibilityToggleItemView.f34951c;
                zp.z zVar = manageVisibilityToggleItemView.f34950b;
                if (yVar != null && zVar != null) {
                    zVar.f142584a = it instanceof on1.g;
                    yVar.d(zVar);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((zp.d0) obj).f142359c.d(new zp.a(!(it instanceof on1.g)));
                break;
        }
    }
}
