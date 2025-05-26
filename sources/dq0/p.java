package dq0;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.lv;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.conversation.datasource.ThreadMessagesRetrofitPagedRemoteRequest;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import com.pinterest.framework.multisection.datasource.pagedlist.v;
import dl1.s;
import e0.t;
import go0.r;
import h32.f1;
import h32.g0;
import h32.l1;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import k1.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.p0;
import lh0.z3;
import lq0.b1;
import lq0.c1;
import lq0.o0;
import lq0.u1;
import lq0.v1;
import m60.w;
import nx.d0;
import nx.d1;
import om0.m1;
import org.eclipse.paho.client.mqttv3.MqttException;
import pc.q0;
import sk0.x;
import sq0.c0;
import wk1.q;
import x02.a2;

/* loaded from: classes5.dex */
public final class p extends q implements aq0.e, aq0.f, aq0.j, aq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f56121a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f56122b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f56123c;

    /* renamed from: d, reason: collision with root package name */
    public final q12.b f56124d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f56125e;

    /* renamed from: f, reason: collision with root package name */
    public final r12.a f56126f;

    /* renamed from: g, reason: collision with root package name */
    public final w f56127g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f56128h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f56129i;

    /* renamed from: j, reason: collision with root package name */
    public final no1.e f56130j;

    /* renamed from: k, reason: collision with root package name */
    public final oc.c f56131k;

    /* renamed from: l, reason: collision with root package name */
    public final i92.k f56132l;

    /* renamed from: m, reason: collision with root package name */
    public final d1 f56133m;

    /* renamed from: n, reason: collision with root package name */
    public final kq0.d f56134n;

    /* renamed from: o, reason: collision with root package name */
    public final h0 f56135o;

    /* renamed from: p, reason: collision with root package name */
    public String f56136p;

    /* renamed from: q, reason: collision with root package name */
    public String f56137q;

    /* renamed from: r, reason: collision with root package name */
    public Date f56138r;

    /* renamed from: s, reason: collision with root package name */
    public final m f56139s;

    /* renamed from: t, reason: collision with root package name */
    public String f56140t;

    /* renamed from: u, reason: collision with root package name */
    public String f56141u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String convoId, Resources resources, b1 convoThreadViewState, q12.b conversationService, Context context, r12.a conversationMessageRetrofitRemoteDataSource, uk1.e presenterPinalyticsFactory, uj2.q networkStateStream, w eventManager, b60.b activeUserManager, ConversationMessageDeserializer conversationMessageDeserializer, p0 conversationExperiments, no1.e conversationRemoteDatasource, oc.c apolloClient, i92.k toastUtils, d1 trackingParamsAttacher, kq0.d mqttManager) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(convoThreadViewState, "convoThreadViewState");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationMessageRetrofitRemoteDataSource, "conversationMessageRetrofitRemoteDataSource");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(conversationMessageDeserializer, "conversationMessageDeserializer");
        Intrinsics.checkNotNullParameter(conversationExperiments, "conversationExperiments");
        Intrinsics.checkNotNullParameter(conversationRemoteDatasource, "conversationRemoteDatasource");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(trackingParamsAttacher, "trackingParamsAttacher");
        Intrinsics.checkNotNullParameter(mqttManager, "mqttManager");
        this.f56121a = convoId;
        this.f56122b = resources;
        this.f56123c = convoThreadViewState;
        this.f56124d = conversationService;
        this.f56125e = context;
        this.f56126f = conversationMessageRetrofitRemoteDataSource;
        this.f56127g = eventManager;
        this.f56128h = activeUserManager;
        this.f56129i = conversationExperiments;
        this.f56130j = conversationRemoteDatasource;
        this.f56131k = apolloClient;
        this.f56132l = toastUtils;
        this.f56133m = trackingParamsAttacher;
        this.f56134n = mqttManager;
        this.f56135o = !(convoThreadViewState instanceof v1) ? new bq0.a(convoId, new xv.g(convoId, getPinalytics(), networkStateStream, this), conversationMessageDeserializer, convoThreadViewState instanceof c1) : new bq0.j(convoId, ((v1) convoThreadViewState).f84446a, new xv.g(convoId, getPinalytics(), networkStateStream, this), conversationMessageDeserializer);
        this.f56139s = new m(this);
        this.f56140t = "wss://mqtt.pinterest.com";
    }

    public static Integer D3(String str, List list) {
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(((s) it.next()).getUid(), str)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            return null;
        }
        return Integer.valueOf(i13);
    }

    public static void J3(String str) {
        if (str != null) {
            ob0.a aVar = ob0.b.f93978b;
            if (aVar == null) {
                Intrinsics.r("crashReporter");
                throw null;
            }
            ((tb0.h) aVar).q(new IllegalStateException(), str, tb0.p.MESSAGING);
        }
    }

    public static void K3(p pVar) {
        String mqttEndpoint;
        String str;
        String str2 = pVar.f56140t;
        kq0.d dVar = pVar.f56134n;
        if (str2 != null && !z.j(str2) && (str = pVar.f56141u) != null && !z.j(str)) {
            String mqttEndpoint2 = pVar.f56140t;
            String pubSubTopicId = pVar.f56141u;
            if (mqttEndpoint2 != null && pubSubTopicId != null) {
                dVar.getClass();
                Intrinsics.checkNotNullParameter(mqttEndpoint2, "mqttEndpoint");
                Intrinsics.checkNotNullParameter(pubSubTopicId, "pubSubTopicId");
                mp2.c cVar = (mp2.c) dVar.f80655f.get(mqttEndpoint2);
                mp2.b a13 = cVar != null ? cVar.a() : null;
                if (a13 != null && a13.isConnected()) {
                    LinkedHashMap linkedHashMap = dVar.f80656g;
                    if (!linkedHashMap.containsKey(mqttEndpoint2)) {
                        linkedHashMap.put(mqttEndpoint2, new ArrayList());
                    }
                    List list = (List) linkedHashMap.get(mqttEndpoint2);
                    if (list == null || list.contains(pubSubTopicId)) {
                        try {
                            a13.K0(pubSubTopicId);
                        } catch (MqttException e13) {
                            dVar.f80650a.q(e13, "mqtt exception trying to unsubscribe from topic", tb0.p.MESSAGING);
                        }
                        LinkedHashMap linkedHashMap2 = dVar.f80657h;
                        if (linkedHashMap2.containsKey(pubSubTopicId)) {
                            uk2.f fVar = (uk2.f) linkedHashMap2.get(pubSubTopicId);
                            if (fVar != null) {
                                fVar.a();
                            }
                            linkedHashMap2.remove(pubSubTopicId);
                        }
                        List list2 = (List) linkedHashMap.get(mqttEndpoint2);
                        if (list2 != null) {
                            list2.remove(pubSubTopicId);
                        }
                    }
                }
            }
        }
        String str3 = pVar.f56140t;
        if (str3 != null && !z.j(str3) && !z.i(pVar.f56140t, null, false) && (mqttEndpoint = pVar.f56140t) != null) {
            dVar.getClass();
            Intrinsics.checkNotNullParameter(mqttEndpoint, "mqttEndpoint");
            hf2.e eVar = (hf2.e) dVar.f80653d.get(mqttEndpoint);
            if (eVar != null && ((mp2.c) dVar.f80655f.get(mqttEndpoint)) != null) {
                eVar.isConnected();
            }
        }
        pVar.f56140t = null;
        pVar.f56141u = null;
    }

    public static final void t3(p pVar, kq0.e eVar) {
        pVar.getClass();
        int i13 = l.f56114a[eVar.f80658a.ordinal()];
        if (i13 == 1) {
            eVar.getClass();
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            pVar.N3();
            return;
        }
        kq0.a aVar = eVar.f80659b;
        if (aVar != null) {
            J3(aVar.f80644c);
            K3(pVar);
            o0 o0Var = (o0) ((aq0.i) pVar.getView());
            if (o0Var.N1 && o0Var.f91282J) {
                o0Var.R0.postDelayed(o0Var.P1, 1000L);
            }
            o0Var.N1 = false;
        }
    }

    public static final void u3(p pVar, String str, mv mvVar) {
        if (str != null) {
            pVar.getClass();
            if (str.length() > 1000) {
                str = pVar.f56122b.getString(xc0.i.create_conversation_char_limit);
            }
        }
        pVar.f56132l.i(str);
        h0 h0Var = pVar.f56135o;
        List d2 = h0Var.d();
        String uid = mvVar.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Integer D3 = D3(uid, d2);
        if (D3 != null) {
            h0Var.removeItem(D3.intValue());
        }
    }

    public static mv x3(p pVar, String str) {
        pVar.getClass();
        lv C = mv.C();
        C.i(UUID.randomUUID().toString());
        C.g(com.bumptech.glide.d.Q(pVar.f56128h));
        C.c(new Date());
        if (str == null || str.length() == 0) {
            str = "";
        }
        C.h(str);
        C.f(new HashMap());
        C.d(true);
        mv a13 = C.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final mv B3(int i13) {
        if (i13 < 0) {
            return null;
        }
        h0 h0Var = this.f56135o;
        if (i13 >= h0Var.a() - 1) {
            return null;
        }
        int i14 = i13 + 1;
        s item = h0Var.getItem(i14);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.Message");
        mv mvVar = (mv) item;
        return mvVar.H() == mv.c.EVENT ? B3(i14) : mvVar;
    }

    public final mv F3(int i13) {
        int i14 = i13 - 1;
        if (i14 < 0) {
            return null;
        }
        h0 h0Var = this.f56135o;
        if (i14 >= h0Var.a() - 1) {
            return null;
        }
        s item = h0Var.getItem(i14);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.Message");
        mv mvVar = (mv) item;
        return mvVar.H() == mv.c.EVENT ? F3(i14) : mvVar;
    }

    public final kk2.m G3(int i13, String messageText, String str) {
        b1 b1Var = this.f56123c;
        if (b1Var instanceof v1) {
            return H3((v1) b1Var, messageText, null, i13, str);
        }
        oo1.j jVar = oo1.j.f96854a;
        String convoId = this.f56121a;
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        oc.c apolloClient = this.f56131k;
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        kk2.m k13 = com.bumptech.glide.d.u0(apolloClient.a(new x40.w(convoId, messageText, String.valueOf(i13), str == null ? pc.p0.f99597a : new q0(str)))).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(29, oo1.g.f96845n));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final kk2.m H3(v1 v1Var, String str, String str2, int i13, String str3) {
        oo1.j jVar = oo1.j.f96854a;
        String str4 = v1Var.f84446a;
        String uid = v1Var.f84448c.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (str3 == null) {
            str3 = str2 != null ? this.f56133m.c(str2) : null;
        }
        return oo1.j.u(this.f56121a, str4, uid, str, str2, i13, this.f56131k, str3);
    }

    public final void I3(String pinId, String messageId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        lv C = mv.C();
        C.i(messageId);
        C.g(com.bumptech.glide.d.Q(this.f56128h));
        C.c(new Date());
        C.h("");
        e30 r33 = f30.r3();
        r33.x2(pinId);
        C.e(r33.a());
        C.f(new HashMap());
        C.d(Boolean.TRUE);
        this.f56135o.P(0, C.a());
    }

    public final void L3(boolean z13) {
        if (isBound()) {
            ((o0) ((aq0.i) getView())).i9(z13);
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: M3, reason: merged with bridge method [inline-methods] */
    public final void r3(aq0.i view) {
        String D;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        o0 o0Var = (o0) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        o0Var.M0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        o0Var.O0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        o0Var.N0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        o0Var.P0 = this;
        this.f56127g.h(this.f56139s);
        uj2.q K1 = this.f56135o.K1();
        op0.a aVar = new op0.a(18, new x(26, this, view));
        op0.a aVar2 = new op0.a(19, g.f56092o);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        K1.F(aVar, aVar2, cVar, a2Var);
        String a13 = n00.b.a(n00.c.DEFAULT_BOARD_FEED);
        q12.b bVar = this.f56124d;
        String str = this.f56121a;
        xj2.c o13 = bVar.c(str, a13).r(tk2.e.f118017c).l(wj2.c.a()).o(new op0.a(16, new n(this, 4)), new op0.a(17, g.f56091n));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
        fw.f37821a.getClass();
        ue b13 = ew.b(str);
        if (b13 != null && (D = b13.D()) != null) {
            this.f56141u = D;
        }
        wy0 f13 = ((b60.d) this.f56128h).f();
        String[] strArr = {this.f56140t, this.f56141u, f13 != null ? f13.z4() : null};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 3;
            if (i14 >= 3) {
                ArrayList A = kotlin.collections.c0.A(strArr);
                String mqttEndpoint = (String) A.get(0);
                int i16 = 1;
                String mqttTopicId = (String) A.get(1);
                int i17 = 2;
                String str2 = (String) A.get(2);
                p0 p0Var = this.f56129i;
                p0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) p0Var.f83455a;
                if (g1Var.o("sg_android_messaging_with_pinsub", "enabled", z3Var) || g1Var.l("sg_android_messaging_with_pinsub")) {
                    this.f56141u = mqttTopicId;
                    hf2.e mqttAndroidClient = new hf2.e(this.f56125e, mqttEndpoint, str2);
                    kq0.d dVar = this.f56134n;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(mqttEndpoint, "mqttEndpoint");
                    Intrinsics.checkNotNullParameter(mqttAndroidClient, "mqttAndroidClient");
                    LinkedHashMap linkedHashMap = dVar.f80653d;
                    if (linkedHashMap.get(mqttEndpoint) == null) {
                        linkedHashMap.put(mqttEndpoint, mqttAndroidClient);
                    }
                    LinkedHashMap linkedHashMap2 = dVar.f80654e;
                    uk2.f fVar = (uk2.f) linkedHashMap2.get(mqttEndpoint);
                    if (fVar == null) {
                        fVar = cb.r("create(...)");
                    }
                    linkedHashMap2.put(mqttEndpoint, fVar);
                    fVar.F(new rr.c(2, new n(this, i13)), new rr.c(2, new n(this, i16)), cVar, a2Var);
                    Intrinsics.checkNotNullParameter(mqttEndpoint, "mqttEndpoint");
                    Intrinsics.checkNotNullParameter(mqttTopicId, "pubSubTopicId");
                    hf2.e eVar = (hf2.e) linkedHashMap.get(mqttEndpoint);
                    if (eVar != null) {
                        try {
                            eVar.isConnected();
                            dVar.b(mqttEndpoint, mqttTopicId);
                        } catch (IllegalArgumentException e13) {
                            dVar.f80650a.q(e13, "exception in connectToMQTTByEndpoint", tb0.p.MESSAGING);
                        }
                    }
                    Intrinsics.checkNotNullParameter(mqttTopicId, "mqttTopicId");
                    LinkedHashMap linkedHashMap3 = dVar.f80657h;
                    if (!linkedHashMap3.containsKey(mqttTopicId)) {
                        uk2.f fVar2 = new uk2.f();
                        Intrinsics.checkNotNullExpressionValue(fVar2, "create(...)");
                        linkedHashMap3.put(mqttTopicId, fVar2);
                    }
                    uk2.f fVar3 = (uk2.f) linkedHashMap3.get(mqttTopicId);
                    if (fVar3 != null) {
                        fVar3.F(new rr.c(2, new n(this, i17)), new rr.c(2, new n(this, i15)), cVar, a2Var);
                        return;
                    }
                    return;
                }
                return;
            }
            if (strArr[i14] == null) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void N3() {
        this.f56135o.i2();
    }

    public final void Q3(mv mvVar, String str, String str2, boolean z13, String str3, String threadId) {
        String uid = mvVar.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        lv Q = mvVar.Q();
        Q.d(Boolean.FALSE);
        Q.h(str2);
        mv a13 = Q.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        h0 h0Var = this.f56135o;
        Integer D3 = D3(uid, h0Var.d());
        if (D3 != null) {
            h0Var.u1(D3.intValue(), a13);
        }
        aq0.i iVar = (aq0.i) getViewIfBound();
        if (iVar != null) {
            o0 o0Var = (o0) iVar;
            o0Var.o9(l1.MESSAGE_SENT);
            o0Var.D8();
        }
        d0.v(getPinalytics(), f1.CONVERSATION_MESSAGE_SEND, str, false, 12);
        t.f56747e = -1;
        b1 b1Var = this.f56123c;
        boolean z14 = b1Var instanceof v1;
        if (z14) {
            v1 v1Var = (v1) b1Var;
            if (v1Var.f84446a == null && threadId != null && z14) {
                v1Var.f84446a = threadId;
                bq0.j jVar = h0Var instanceof bq0.j ? (bq0.j) h0Var : null;
                if (jVar != null) {
                    Intrinsics.checkNotNullParameter(threadId, "newThreadId");
                    jVar.E = threadId;
                    ThreadMessagesRetrofitPagedRemoteRequest threadMessagesRetrofitPagedRemoteRequest = jVar.G;
                    threadMessagesRetrofitPagedRemoteRequest.getClass();
                    Intrinsics.checkNotNullParameter(threadId, "<set-?>");
                    threadMessagesRetrofitPagedRemoteRequest.f45509a = threadId;
                    jVar.i2();
                }
                aq0.i iVar2 = (aq0.i) getViewIfBound();
                if (iVar2 != null) {
                    o0 o0Var2 = (o0) iVar2;
                    Intrinsics.checkNotNullParameter(threadId, "threadId");
                    o0Var2.R0.postDelayed(o0Var2.P1, 1000L);
                }
            }
            this.f56127g.d(k.f56113a);
        }
        if (z13) {
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", this.f56121a);
            if (str3 != null) {
            }
            if (str != null) {
            }
            if (str2 != null) {
                hashMap.put("conversation_quick_reply_message", str2);
            }
            getPinalytics().g(f1.CONVERSATION_PIN_QUICK_REPLY_SEND, str, hashMap, false);
        }
    }

    public final void R3(String text, String pinId) {
        boolean z13;
        v1 v1Var;
        f30 I;
        boolean z14;
        f30 I2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        if ((!z.j(text)) && (!z.j(pinId))) {
            V3(new m1(4, this, text), pinId);
            return;
        }
        if (!z.j(pinId)) {
            V3(null, pinId);
            return;
        }
        boolean z15 = !z.j(text);
        b1 b1Var = this.f56123c;
        if (z15 && ((z14 = b1Var instanceof v1))) {
            v1 v1Var2 = (v1) b1Var;
            if ((v1Var2.f84449d instanceof lq0.a) && v1Var2.f84447b == null) {
                v1Var = z14 ? v1Var2 : null;
                if (v1Var == null || (I2 = v1Var.f84448c.I()) == null) {
                    return;
                }
                String uid = I2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                w3(uid, text);
                return;
            }
        }
        if ((!z.j(text)) && ((z13 = b1Var instanceof v1))) {
            v1 v1Var3 = (v1) b1Var;
            if ((v1Var3.f84449d instanceof u1) && v1Var3.f84447b == null) {
                v1Var = z13 ? v1Var3 : null;
                if (v1Var == null || (I = v1Var.f84448c.I()) == null) {
                    return;
                }
                String uid2 = I.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                w3(uid2, text);
                return;
            }
        }
        if (!z.j(text)) {
            U3(text, true, false);
        }
    }

    public final void S3(String text, String pin) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pin, "pin");
        int i13 = 1;
        if ((!z.j(text)) && (!z.j(pin))) {
            mv x33 = x3(this, text);
            this.f56135o.P(0, x33);
            xj2.c o13 = G3(y32.c.CONVERSATION_MESSAGE.getValue(), text, this.f56133m.c(pin)).l(wj2.c.a()).o(new op0.a(25, new r((Object) this, (Object) x33, pin, 2)), new op0.a(26, new o(this, x33, i13)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    public final void T3() {
        getPinalytics().b0(u0.CONVERSATION_OPEN_GIF_REACTION_TRAY_BUTTON, g0.CONVERSATION_GIF_REACTION_TRAY, this.f56121a, false);
        o0 o0Var = (o0) ((aq0.i) getView());
        if (o0Var.X8().getVisibility() == 0) {
            o0Var.j9(false);
        } else {
            o0Var.X8().animate().alpha(1.0f).setStartDelay(300L).setDuration(100L).translationY(0.0f).setListener(new androidx.appcompat.widget.d(o0Var, 15));
        }
    }

    public final void U3(String str, boolean z13, boolean z14) {
        int i13;
        if (isBound()) {
            mv x33 = x3(this, str);
            if (!z14) {
                ((o0) ((aq0.i) getView())).h9(z13);
            }
            int i14 = 0;
            this.f56135o.P(0, x33);
            String z33 = z3();
            if (z14) {
                i13 = y32.c.QUICK_REPLY.getValue();
            } else if (z13 || !Intrinsics.d(str, this.f56122b.getString(le0.h.conversation_response_heart))) {
                i13 = t.f56747e;
                if (i13 <= 0) {
                    i13 = y32.c.CONVERSATION_MESSAGE.getValue();
                }
            } else {
                i13 = y32.c.HEART_ICON.getValue();
            }
            xj2.c o13 = G3(i13, str, null).l(wj2.c.a()).o(new op0.a(23, new b0(this, x33, z14, z33)), new op0.a(24, new o(this, x33, i14)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    public final void V3(Function0 function0, String str) {
        if (this.f56129i.b()) {
            ((o0) ((aq0.i) getView())).h9(true);
        }
        b1 b1Var = this.f56123c;
        int i13 = 21;
        if (b1Var instanceof v1) {
            xj2.c o13 = H3((v1) b1Var, null, str, y32.c.CONVERSATION_MESSAGE.getValue(), null).l(wj2.c.a()).o(new op0.a(21, new r(str, (Object) this, (Object) function0, 4)), new op0.a(22, g.f56094q));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
            return;
        }
        y32.c cVar = y32.c.REACTION_ON_PIN;
        eq0.k kVar = eq0.k.PIN_IT_REPLY;
        fw.f37821a.getClass();
        ue b13 = ew.b(this.f56121a);
        if (b13 != null) {
            TypeAheadItem typeAheadItem = new TypeAheadItem();
            typeAheadItem.e(b13);
            new kk2.m(oo1.j.i(typeAheadItem), new qk0.b(i13, new r(str, (Object) cVar, (Object) this, 3)), 0).l(wj2.c.a()).o(new op0.a(29, new j1.p0(str, b13, kVar, function0, 20)), new i(0, g.f56093p));
        }
    }

    public final void W3(j jVar) {
        if (isBound()) {
            h0 h0Var = this.f56135o;
            Integer D3 = D3(jVar.f56111a, h0Var.d());
            s item = D3 != null ? h0Var.getItem(D3.intValue()) : null;
            mv mvVar = item instanceof mv ? (mv) item : null;
            if (mvVar != null) {
                lv Q = mvVar.Q();
                Q.f39911f = Integer.valueOf(oo1.l.USER.getCode());
                boolean[] zArr = Q.f39925t;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
                mv a13 = Q.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                h0Var.u1(D3.intValue(), a13);
            }
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        b1 b1Var = this.f56123c;
        boolean z13 = b1Var instanceof v1;
        h0 h0Var = this.f56135o;
        if (!z13) {
            v vVar = new v((r0) h0Var, true, 4);
            vVar.g(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
            ((wk1.i) dataSources).b(vVar);
            return;
        }
        bq0.j jVar = h0Var instanceof bq0.j ? (bq0.j) h0Var : null;
        if (jVar != null) {
            v1 v1Var = (v1) b1Var;
            String str = v1Var.f84446a;
            if (str == null || str.length() == 0) {
                jVar.P(0, v1Var.f84448c);
            }
            ((wk1.i) dataSources).b(jVar);
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f56127g.j(this.f56139s);
        ((aq0.i) getView()).getClass();
        K3(this);
        super.onUnbind();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v3(com.pinterest.api.model.mv r8, com.pinterest.api.model.mv r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L8
            com.pinterest.api.model.cf r1 = r8.N()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            if (r9 == 0) goto L14
            com.pinterest.api.model.cf r1 = r9.N()
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r8 == 0) goto L27
            com.pinterest.api.model.cf r4 = r8.N()
            if (r4 == 0) goto L27
            java.lang.String r4 = r4.getUid()
            goto L28
        L27:
            r4 = r0
        L28:
            if (r9 == 0) goto L35
            com.pinterest.api.model.cf r5 = r9.N()
            if (r5 == 0) goto L35
            java.lang.String r5 = r5.getUid()
            goto L36
        L35:
            r5 = r0
        L36:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            b60.b r5 = r7.f56128h
            com.pinterest.api.model.wy0 r6 = com.bumptech.glide.d.Q(r5)
            if (r8 == 0) goto L47
            java.lang.String r8 = kh2.j.V(r8)
            goto L48
        L47:
            r8 = r0
        L48:
            boolean r8 = dl2.b.S1(r6, r8)
            com.pinterest.api.model.wy0 r5 = com.bumptech.glide.d.Q(r5)
            if (r9 == 0) goto L56
            java.lang.String r0 = kh2.j.V(r9)
        L56:
            boolean r9 = dl2.b.S1(r5, r0)
            if (r8 == 0) goto L5e
            if (r9 != 0) goto L62
        L5e:
            if (r8 != 0) goto L64
            if (r9 != 0) goto L64
        L62:
            r8 = r3
            goto L65
        L64:
            r8 = r2
        L65:
            if (r1 == 0) goto L6c
            if (r4 == 0) goto L6c
            if (r8 == 0) goto L6c
            r2 = r3
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.p.v3(com.pinterest.api.model.mv, com.pinterest.api.model.mv):boolean");
    }

    public final void w3(String str, String str2) {
        fw.f37821a.getClass();
        ue b13 = ew.b(this.f56121a);
        if (b13 != null) {
            TypeAheadItem typeAheadItem = new TypeAheadItem();
            typeAheadItem.e(b13);
            xj2.c o13 = new kk2.m(oo1.j.i(typeAheadItem), new qk0.b(20, new x(25, str, this)), 0).l(wj2.c.a()).o(new op0.a(27, new j1.p0(str, b13, this, str2, 19)), new op0.a(28, g.f56089l));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    public final String z3() {
        String T;
        s item = this.f56135o.getItem(0);
        return (item == null || (T = kh2.j.T((mv) item)) == null) ? "" : T;
    }
}
