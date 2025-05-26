package eq0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.ue;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.w3;
import e0.t;
import go0.r;
import h32.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kh2.k3;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.u;
import m60.w;
import nx.d0;
import so.oa;
import v.f1;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f59915a = z0.h(new Pair(k.RELATED_TAB, "related_tab"), new Pair(k.POPULAR_TAB, "popular_tab"), new Pair(k.YOURS_TAB, "yours_tab"), new Pair(k.GIF_TRAY, "gif_Tray"), new Pair(k.SEARCH_PIN, "send_a_pin_search"), new Pair(k.PIN_IT_REPLY, "send_a_pin_from_reply"));

    public static final void a(Throwable th3) {
        f1 f1Var;
        qz.d dVar = null;
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null) {
            dVar = k3.M(f1Var);
        }
        if (dVar != null) {
            String str = dVar.f105384d;
            if (str == null || str.length() == 0) {
                str = bs1.c.b2(w42.c.send_pin_server_error);
            }
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().b(str);
        }
    }

    public static final void b(String pinUid, String convoId, k source, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(source, "source");
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        d0.v(a13, h32.f1.PIN_SEND, pinUid, false, 12);
        HashMap hashMap = new HashMap();
        hashMap.put("pin_id", pinUid);
        hashMap.put("conversation_id", convoId);
        bs1.c.G1("conversation_send_a_pin_tab", (String) f59915a.get(source), hashMap);
        d0 a14 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a14, "get(...)");
        a14.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : source == k.GIF_TRAY ? g0.CONVERSATION_GIF_REACTION_TRAY : g0.MODAL_CONVERSATION_DISCOVERY, (r18 & 8) != 0 ? null : convoId, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        u.f85943a.d(new l(pinUid, str));
    }

    public static final void c(nr0.e view, String convoId, String pinUid, k source, w eventManager, no1.e conversationRemoteDataSource, oc.c apolloClient, String str, n threadInfo, f30 f30Var) {
        String str2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        fw.f37821a.getClass();
        ue b13 = ew.b(convoId);
        if (b13 != null) {
            TypeAheadItem typeAheadItem = new TypeAheadItem();
            typeAheadItem.e(b13);
            if (view instanceof ku1.k) {
                ((ku1.k) view).D5();
                if (((ScreenLocation) w3.f51517b.getValue()).getF46894a().isAssignableFrom(view.getClass())) {
                    eventManager.d(new g());
                }
            }
            t.f56747e = -1;
            n1 c13 = n1.f83436b.c();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) c13.f83439a;
            if (g1Var.o("android_message_composer_redesign", "enabled", z3Var) || g1Var.l("android_message_composer_redesign")) {
                new Handler(Looper.getMainLooper()).post(new dp.a(18, eventManager, f30Var));
                return;
            }
            if (threadInfo == null) {
                new kk2.m(oo1.j.i(typeAheadItem), new qk0.b(23, new r(pinUid, (Object) conversationRemoteDataSource, (Object) str, 6)), 0).l(wj2.c.a()).o(new dq0.i(5, new b(pinUid, convoId, source, 0)), new dq0.i(6, a.f59908k));
                return;
            }
            if (!threadInfo.f59922c || ((str2 = threadInfo.f59920a) != null && str2.length() != 0)) {
                d(convoId, threadInfo, pinUid, source, str, apolloClient);
                return;
            }
            Intrinsics.checkNotNullParameter(convoId, "convoId");
            Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
            if (threadInfo.f59924e == null) {
                return;
            }
            new kk2.m(oo1.j.i(typeAheadItem), new qk0.b(22, new r((Object) threadInfo, (Object) conversationRemoteDataSource, str, 5)), 0).l(wj2.c.a()).o(new dq0.i(3, new r60.d(pinUid, convoId, source, threadInfo, str, apolloClient, 3)), new dq0.i(4, a.f59907j));
        }
    }

    public static final void d(String str, n nVar, String str2, k kVar, String str3, oc.c cVar) {
        oo1.j jVar = oo1.j.f96854a;
        oo1.j.u(str, nVar.f59920a, nVar.f59921b, null, str2, y32.c.SEND_A_PIN.getValue(), cVar, str3).l(wj2.c.a()).o(new dq0.i(1, new b(str2, str, kVar, 1)), new dq0.i(2, a.f59909l));
    }
}
