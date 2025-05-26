package pp2;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import androidx.fragment.app.FragmentActivity;
import bb1.w;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.wy0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.creation.CreationActivity;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import d4.f;
import dl1.t;
import g70.h;
import h32.f1;
import h32.g0;
import h32.u0;
import hc1.n;
import i92.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import lb2.q;
import lh0.a0;
import lh0.s3;
import lh0.y1;
import lu1.d;
import m60.x0;
import n00.s;
import n91.b0;
import nr0.m;
import nx.d0;
import o52.e;
import oc.c;
import or1.i;
import pc.q0;
import pc.r0;
import pc.v;
import pr1.g;
import r72.k0;
import so.t0;
import so.y2;
import u01.x;
import u50.o;
import x02.i2;
import x31.p;
import x40.m9;
import xa0.j;
import ye1.l;
import yq1.u;
import yq1.y0;

/* loaded from: classes4.dex */
public abstract class a implements f, pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static Class f100950a;

    public static void A(w wVar, cr1.a aVar) {
        wVar.f22568k0 = aVar;
    }

    public static void A0(w wVar, k kVar) {
        wVar.f22569l0 = kVar;
    }

    public static void B(u uVar, cr1.a aVar) {
        uVar.f140019n0 = aVar;
    }

    public static void B0(u uVar, k kVar) {
        uVar.f140015j0 = kVar;
    }

    public static void C(u uVar, mr1.a aVar) {
        uVar.f140020o0 = aVar;
    }

    public static void C0(l lVar, ku1.l lVar2) {
        lVar.f138872d = lVar2;
    }

    public static void D(CreationActivity creationActivity, d dVar) {
        creationActivity.f47092p = dVar;
    }

    public static final void D0(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.LENS_PERMISSION_OVERLAY, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static void E(u uVar, ox.b bVar) {
        uVar.f140024s0 = bVar;
    }

    public static final void E0(d0 pinalytics, u0 permissionResult, g0 componentType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(permissionResult, "permissionResult");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.LENS_PERMISSIONS_REQUEST, (r18 & 2) != 0 ? null : permissionResult, (r18 & 4) != 0 ? null : componentType, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static void F(n nVar, c cVar) {
        nVar.f68731z0 = cVar;
    }

    public static final int F0(long j13) {
        if (Long.compareUnsigned(j13, 0L) > 0) {
            return 64 - Long.numberOfLeadingZeros(j13);
        }
        return 1;
    }

    public static void G(u uVar, i iVar) {
        uVar.f140023r0 = iVar;
    }

    public static g G0(String str, String str2, String str3, String str4, String str5) {
        return new g(str, str2, str3, str4, str5);
    }

    public static void H(u uVar, q qVar) {
        uVar.f140016k0 = qVar;
    }

    public static void I(u uVar, com.pinterest.identity.authentication.a aVar) {
        uVar.f140017l0 = aVar;
    }

    public static void J(y0 y0Var, com.pinterest.identity.authentication.a aVar) {
        y0Var.f140060k0 = aVar;
    }

    public static final void J0(HashMap hashMap, String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
        }
    }

    public static void K(n nVar, lu1.b bVar) {
        nVar.C0 = bVar;
    }

    public static final vn0 K0(ArrayList items) {
        int i13;
        long j13;
        Intrinsics.checkNotNullParameter(items, "items");
        int i14 = f0.i(items);
        Intrinsics.checkNotNullParameter(items, "<this>");
        long j14 = ((bo0) CollectionsKt.b0(items)).f36143i;
        int size = items.size();
        long j15 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                i13 = i14;
                j13 = j14;
                break;
            }
            if (((bo0) items.get(i15)).f36143i + j15 >= u()) {
                j13 = u() - j15;
                i13 = i15;
                break;
            }
            j15 += ((bo0) items.get(i15)).f36143i;
            i15++;
        }
        return new vn0(items, 0, 0L, i13, j13);
    }

    public static void L(vx1.c cVar, h hVar) {
        cVar.f126829a0 = hVar;
    }

    public static final j01.b L0(hs.d moduleViewabilityHelper, ps.c adsPinCloseupModelAllowList, b60.b activeUserManager, a0 experiments, b11.g monolithHeaderConfig, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adsPinCloseupModelAllowList, "adsPinCloseupModelAllowList");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        x lazyBlock = new x(moduleViewabilityHelper, adsPinCloseupModelAllowList, activeUserManager, experiments, monolithHeaderConfig, z13, z14, z15);
        Intrinsics.checkNotNullParameter(lazyBlock, "lazyBlock");
        return new j01.b(lazyBlock);
    }

    public static void M(n nVar, bq.c cVar) {
        nVar.A0 = cVar;
    }

    public static final j01.b M0(b11.g monolithHeaderConfig, a0 experiments, ps.c adsPinCloseupModelAllowList) {
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsPinCloseupModelAllowList, "adsPinCloseupModelAllowList");
        rx0.f lazyBlock = new rx0.f(monolithHeaderConfig, adsPinCloseupModelAllowList, experiments, 3);
        Intrinsics.checkNotNullParameter(lazyBlock, "lazyBlock");
        return new j01.b(lazyBlock);
    }

    public static void N(vx1.c cVar, a11.d dVar) {
        cVar.X = dVar;
    }

    public static final void N0(String str) {
        O0("OnReceiveMapping", str);
    }

    public static void O(CreationActivity creationActivity, tb0.h hVar) {
        creationActivity.f47093q = hVar;
    }

    public static final void O0(String str, String str2) {
        try {
            if (f100950a == null) {
                Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
                Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
                f100950a = cls;
            }
            Class cls2 = f100950a;
            if (cls2 == null) {
                Intrinsics.r("unityPlayer");
                throw null;
            }
            Method method = cls2.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
            Class cls3 = f100950a;
            if (cls3 != null) {
                method.invoke(cls3, "UnityFacebookSDKPlugin", str, str2);
            } else {
                Intrinsics.r("unityPlayer");
                throw null;
            }
        } catch (Exception e13) {
            Log.e("pp2.a", "Failed to send message to Unity", e13);
        }
    }

    public static void P(a51.d dVar, m60.f0 f0Var) {
        dVar.P0 = f0Var;
    }

    public static final void P0(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i13);
        marginLayoutParams.topMargin = i14;
        marginLayoutParams.setMarginEnd(i15);
        marginLayoutParams.bottomMargin = i16;
    }

    public static void Q(a51.d dVar, m mVar) {
        dVar.Q0 = mVar;
    }

    public static final void Q0(FragmentActivity activity, Context context, Function0 onConfirmCallback, Function0 onCancelCallback, Function0 onDismissedCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
        Intrinsics.checkNotNullParameter(onCancelCallback, "onCancelCallback");
        Intrinsics.checkNotNullParameter(onDismissedCallback, "onDismissedCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(e.pin_selection_discard_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(e.pin_selection_discard_dialog_text);
        String string3 = activity.getString(e.pin_selection_discard_dialog_discard);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        int i14 = 10;
        a13 = j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new ax1.a(i14, onConfirmCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new ax1.a(11, onCancelCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : new com.pinterest.feature.ideaPinCreation.closeup.view.d0(i14, onDismissedCallback));
        ((AlertContainer) activity.findViewById(tr.b.alert_container)).c(a13);
    }

    public static void R(com.pinterest.feature.todaytab.tab.view.k kVar, m mVar) {
        kVar.T0 = mVar;
    }

    public static void R0(tc.g writer, v customScalarAdapters, m9 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("conversationId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132814a);
        r0 r0Var = value.f132815b;
        if (r0Var instanceof q0) {
            writer.M0("imageSpec");
            pc.c.d(eVar).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f132816c;
        if (r0Var2 instanceof q0) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.d(pc.c.f99527h).a(writer, customScalarAdapters, (q0) r0Var2);
        } else if (customScalarAdapters.f99608b.f15032b) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.f99522c.d(writer, customScalarAdapters, Boolean.FALSE);
        }
    }

    public static void S(x11.c cVar, q11.a aVar) {
        cVar.A0 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final void S0(AvatarPair avatarPair, List list, List list2) {
        ?? r13;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            bc0.a aVar = null;
            ?? r23 = 0;
            if (!it.hasNext()) {
                if (list2 != null) {
                    List list3 = list2;
                    r13 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String substring = ((String) it2.next()).substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                        String upperCase = substring.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        r13.add(new bc0.a(r23 == true ? 1 : 0, upperCase, 61));
                    }
                } else {
                    r13 = kotlin.collections.q0.f80391a;
                }
                avatarPair.X(CollectionsKt.l0((Iterable) r13, arrayList));
                return;
            }
            Object user = it.next();
            if (user != null) {
                Intrinsics.checkNotNullParameter(user, "user");
                if (user instanceof wy0) {
                    wy0 wy0Var = (wy0) user;
                    aVar = new bc0.a(dl2.b.s0(wy0Var), dl2.b.M0(wy0Var), dl2.b.W1(wy0Var) || cb.y(wy0Var, "getIsVerifiedMerchant(...)"), sm1.b.ic_check_circle_gestalt, Integer.valueOf(cb.y(wy0Var, "getIsVerifiedMerchant(...)") ? eo1.b.color_blue_500 : eo1.b.color_themed_base_red_300), wy0Var.q2());
                } else {
                    if (!(user instanceof z40.d0)) {
                        throw new IllegalArgumentException(a.a.k("Unsupported type: ", user.getClass().getSimpleName(), " for mapping to AvatarDisplay"));
                    }
                    z40.d0 d0Var = (z40.d0) user;
                    aVar = new bc0.a(f0.h.F(d0Var), f0.h.H(d0Var), f0.h.e0(d0Var) || f0.h.f0(d0Var), sm1.b.ic_check_circle_gestalt, Integer.valueOf(f0.h.f0(d0Var) ? eo1.b.color_blue_500 : eo1.b.color_themed_base_red_300), d0Var.n());
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
    }

    public static void T(n nVar, s3 s3Var) {
        nVar.F0 = s3Var;
    }

    public static final void T0(AvatarPair avatarPair, List users, List emailList) {
        Intrinsics.checkNotNullParameter(avatarPair, "<this>");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(emailList, "emailList");
        S0(avatarPair, users, emailList);
    }

    public static void U(u uVar, y1 y1Var) {
        uVar.f140021p0 = y1Var;
    }

    public static void V(com.pinterest.feature.unauth.sba.w wVar, il1.a aVar) {
        wVar.G0 = aVar;
    }

    public static void W(CreationActivity creationActivity, zp.j jVar) {
        creationActivity.f47097u = jVar;
    }

    public static void X(nw1.b bVar, t0 t0Var) {
        bVar.T0 = t0Var;
    }

    public static void Y(CreationActivity creationActivity, kf1.b bVar) {
        creationActivity.f47098v = bVar;
    }

    public static void Z(CreationActivity creationActivity, ag1.b bVar) {
        creationActivity.f47095s = bVar;
    }

    public static void a0(CreationActivity creationActivity, t tVar) {
        creationActivity.f47094r = tVar;
    }

    public static void b0(CreationActivity creationActivity, ag1.h hVar) {
        creationActivity.f47096t = hVar;
    }

    public static void c0(y0 y0Var, so.f0 f0Var) {
        y0Var.f140059j0 = f0Var;
    }

    public static void d0(a51.d dVar, m60.g0 g0Var) {
        dVar.O0 = g0Var;
    }

    public static void e0(u uVar, rr1.g gVar) {
        uVar.f140025t0 = gVar;
    }

    public static void f0(a51.d dVar, i2 i2Var) {
        dVar.M0 = i2Var;
    }

    public static final void g(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        com.bumptech.glide.d.e(apiFieldsMap);
        apiFieldsMap.e("user.image_medium_url");
        apiFieldsMap.e("user.image_large_url");
        apiFieldsMap.e("user.image_xlarge_url");
        apiFieldsMap.e("user.follower_count");
    }

    public static void g0(com.pinterest.feature.todaytab.tab.view.k kVar, i2 i2Var) {
        kVar.R0 = i2Var;
    }

    public static void h(ge1.b bVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str3, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            arrayList = null;
        }
        if ((i13 & 8) != 0) {
            arrayList2 = null;
        }
        if ((i13 & 16) != 0) {
            arrayList3 = null;
        }
        if ((i13 & 32) != 0) {
            arrayList4 = null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        HashMap<String, String> auxData = bVar.getAuxData();
        if (auxData != null) {
            J0(auxData, "selected_brand_label", str);
        }
        HashMap<String, String> auxData2 = bVar.getAuxData();
        if (auxData2 != null) {
            J0(auxData2, "selected_brand_value", str2);
        }
        HashMap<String, String> auxData3 = bVar.getAuxData();
        if (auxData3 != null) {
            J0(auxData3, "selected_brands_labels", arrayList);
        }
        HashMap<String, String> auxData4 = bVar.getAuxData();
        if (auxData4 != null) {
            J0(auxData4, "selected_brands_values", arrayList2);
        }
        HashMap<String, String> auxData5 = bVar.getAuxData();
        if (auxData5 != null) {
            J0(auxData5, "prev_selected_brands_labels", arrayList3);
        }
        HashMap<String, String> auxData6 = bVar.getAuxData();
        if (auxData6 != null) {
            J0(auxData6, "prev_selected_brands_values", arrayList4);
        }
        HashMap<String, String> auxData7 = bVar.getAuxData();
        if (auxData7 != null) {
            J0(auxData7, "module_id", str3);
        }
    }

    public static void h0(u uVar, tb.l lVar) {
        uVar.f140022q0 = lVar;
    }

    public static void i(ge1.c cVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str3, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            arrayList = null;
        }
        if ((i13 & 8) != 0) {
            arrayList2 = null;
        }
        if ((i13 & 16) != 0) {
            arrayList3 = null;
        }
        if ((i13 & 32) != 0) {
            arrayList4 = null;
        }
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        HashMap<String, String> auxData = cVar.getAuxData();
        if (auxData != null) {
            J0(auxData, "selected_merchant_label", str);
        }
        HashMap<String, String> auxData2 = cVar.getAuxData();
        if (auxData2 != null) {
            J0(auxData2, "selected_merchant_domain", str2);
        }
        HashMap<String, String> auxData3 = cVar.getAuxData();
        if (auxData3 != null) {
            J0(auxData3, "selected_merchants_labels", arrayList);
        }
        HashMap<String, String> auxData4 = cVar.getAuxData();
        if (auxData4 != null) {
            J0(auxData4, "selected_merchants_domains", arrayList2);
        }
        HashMap<String, String> auxData5 = cVar.getAuxData();
        if (auxData5 != null) {
            J0(auxData5, "prev_selected_merchants_labels", arrayList3);
        }
        HashMap<String, String> auxData6 = cVar.getAuxData();
        if (auxData6 != null) {
            J0(auxData6, "prev_selected_merchants_domains", arrayList4);
        }
        HashMap<String, String> auxData7 = cVar.getAuxData();
        if (auxData7 != null) {
            J0(auxData7, "module_id", str3);
        }
    }

    public static void i0(hy0.d dVar, so.q0 q0Var) {
        dVar.f70591o0 = q0Var;
    }

    public static final void j(GestaltIconButtonFloating gestaltIconButtonFloating, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltIconButtonFloating, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.messaging.q qVar = gestaltIconButtonFloating.f49399e;
        qm1.l lVar = new qm1.l((qm1.b) ((o) qVar.f33803a));
        init.invoke(lVar);
        ql1.k nextState = new ql1.k(lVar, 22);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public static void j0(a51.d dVar, uk1.e eVar) {
        dVar.N0 = eVar;
    }

    public static final void k(GestaltText gestaltText, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        rn1.k kVar = new rn1.k(gestaltText.l());
        init.invoke(kVar);
        gestaltText.i(new an1.i(kVar, 14));
    }

    public static void k0(w wVar, uk1.e eVar) {
        wVar.f22567j0 = eVar;
    }

    public static final void l(GestaltToast gestaltToast, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltToast, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        do1.x xVar = new do1.x(gestaltToast.z());
        init.invoke(xVar);
        gestaltToast.v(new an1.i(xVar, 21));
    }

    public static void l0(com.pinterest.feature.todaytab.tab.view.k kVar, uk1.e eVar) {
        kVar.S0 = eVar;
    }

    public static final u41.e m(x31.a aVar, bm1.n selectedState, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        bm1.m mVar = new bm1.m(bm1.o.SMALL, selectedState, new bm1.b(aVar.d(), aVar.e() != null ? aVar.e() : (z14 && selectedState == bm1.n.SELECTED) ? rm1.q.CANCEL : null, false), z13, null, aVar.a().value(), null, 80);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new u41.e(mVar, new u41.g(aVar.a().value(), 2));
    }

    public static void m0(n nVar, uk1.e eVar) {
        nVar.B0 = eVar;
    }

    public static final u41.e n(x31.a aVar, p vmState) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        bm1.n nVar = (bm1.n) vmState.f131640f.get(aVar.a());
        if (nVar == null) {
            nVar = bm1.n.UNSELECTED;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return m(aVar, nVar, !vmState.f131639e.contains(aVar.a()), vmState.f131636b);
    }

    public static void n0(hy0.d dVar, uk1.e eVar) {
        dVar.f70592p0 = eVar;
    }

    public static void o0(nw1.b bVar, uk1.e eVar) {
        bVar.S0 = eVar;
    }

    public static final boolean p(int i13, int i14) {
        return i13 == i14;
    }

    public static void p0(x11.c cVar, uk1.e eVar) {
        cVar.f131576z0 = eVar;
    }

    public static String q(long j13) {
        if (j13 == 0) {
            return "0000000000000000";
        }
        ThreadLocal threadLocal = ri2.k.f108417a;
        char[] cArr = (char[]) threadLocal.get();
        if (cArr == null || cArr.length < 16) {
            cArr = new char[16];
            threadLocal.set(cArr);
        }
        ri2.f.b(j13, cArr, 0);
        return new String(cArr, 0, 16);
    }

    public static void q0(xa1.t tVar, uk1.e eVar) {
        tVar.f134481j0 = eVar;
    }

    public static final HashMap r(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return bs1.c.o(new Pair("recipient", b0Var.f90032b));
    }

    public static void r0(u uVar, uk1.e eVar) {
        uVar.f140018m0 = eVar;
    }

    public static final ke2.a s(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new ke2.a(((float) ((k0Var.f106524l / 6.283185307179586d) * 2.0d)) + (k0Var.f106514b ? 1.0f : 0.0f), ((float) ((k0Var.f106523k / 6.283185307179586d) * (-2.0d))) + (k0Var.f106513a ? 1.0f : 0.0f));
    }

    public static void s0(y0 y0Var, uk1.e eVar) {
        y0Var.f140061l0 = eVar;
    }

    public static final String t(Date date, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (date == null) {
            return "";
        }
        String string = resources.getString(com.pinterest.partnerAnalytics.g.metrics_disclaimer_updated, new pb0.d(resources).b(date, pb0.b.STYLE_NORMAL, true).toString());
        Intrinsics.f(string);
        return string;
    }

    public static void t0(vx1.c cVar, gw1.f fVar) {
        cVar.Z = fVar;
    }

    public static final long u() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    public static void u0(vx1.c cVar, gw1.f fVar) {
        cVar.Y = fVar;
    }

    public static final String v(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return "users/" + userId + "/pins/products/viewed/";
    }

    public static void v0(n nVar, s sVar) {
        nVar.D0 = sVar;
    }

    public static final ze1.d w(Navigation navigation) {
        if (navigation == null) {
            return new ze1.d(null, null, false, null, null, null, 255);
        }
        String v03 = navigation.v0("brand_image_url");
        if (v03 == null) {
            v03 = "";
        }
        String v04 = navigation.v0("brand_name");
        if (v04 == null) {
            v04 = "";
        }
        boolean S = navigation.S("brand_verification", false);
        String v05 = navigation.v0("brand_user_id");
        if (v05 == null) {
            v05 = "";
        }
        String v06 = navigation.v0("source");
        if (v06 == null) {
            v06 = "";
        }
        String v07 = navigation.v0("search_query");
        ze1.c cVar = new ze1.c(v06, v07 != null ? v07 : "");
        String g23 = navigation.g2("module_source", "module_source_closeup");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        return new ze1.d(v03, v04, S, v05, cVar, g23, navigation.S("merchant_verification", false), navigation.v0("shop_source"));
    }

    public static void w0(CreationActivity creationActivity, x92.b bVar) {
        creationActivity.f47100x = bVar;
    }

    public static final String x(t32.f productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        return String.valueOf(productFilterType.getValue());
    }

    public static void x0(v02.t tVar, y2 y2Var) {
        tVar.f123819z0 = y2Var;
    }

    public static final String y(String feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        String concat = "story/feed/".concat(feedType);
        return e0.B(concat) != '/' ? concat.concat("/") : concat;
    }

    public static void y0(n nVar, c2 c2Var) {
        nVar.E0 = c2Var;
    }

    public static final String z(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return "users/" + userId + "/wishlist/";
    }

    public static void z0(CreationActivity creationActivity, vo.u uVar) {
        creationActivity.f47099w = uVar;
    }

    public abstract int H0(int i13);

    public abstract int I0(int i13);

    @Override // d4.f
    public int a(int i13) {
        int H0 = H0(i13);
        if (H0 == -1 || H0(H0) == -1) {
            return -1;
        }
        return H0;
    }

    @Override // d4.f
    public int b(int i13) {
        return I0(i13);
    }

    @Override // d4.f
    public int c(int i13) {
        return H0(i13);
    }

    @Override // d4.f
    public int e(int i13) {
        int I0 = I0(i13);
        if (I0 == -1 || I0(I0) == -1) {
            return -1;
        }
        return I0;
    }
}
