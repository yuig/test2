package com.pinterest.pushnotification;

import c5.e0;
import c5.s;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import df.j1;
import h32.f1;
import hs1.q;
import i01.r0;
import i91.h0;
import java.util.HashSet;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v2;
import lh0.z3;
import m60.w;
import nx.d0;
import pk.a0;
import so.d9;
import so.oa;
import tb0.p;
import uz1.u;
import uz1.x;
import uz1.y;
import uz1.z;

/* loaded from: classes2.dex */
public class MessagingService extends FirebaseMessagingService implements af2.c {

    /* renamed from: b, reason: collision with root package name */
    public volatile ye2.l f50237b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f50238c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f50239d = false;

    /* renamed from: e, reason: collision with root package name */
    public g f50240e;

    /* renamed from: f, reason: collision with root package name */
    public z f50241f;

    /* renamed from: g, reason: collision with root package name */
    public w f50242g;

    /* renamed from: h, reason: collision with root package name */
    public l f50243h;

    /* renamed from: i, reason: collision with root package name */
    public v2 f50244i;

    @Override // af2.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ye2.l componentManager() {
        if (this.f50237b == null) {
            synchronized (this.f50238c) {
                try {
                    if (this.f50237b == null) {
                        this.f50237b = new ye2.l(this);
                    }
                } finally {
                }
            }
        }
        return this.f50237b;
    }

    public final void e() {
        if (!this.f50239d) {
            this.f50239d = true;
            oa oaVar = ((d9) ((e) generatedComponent())).f113387a;
            this.f50240e = oaVar.y2();
            x92.b pushNotificationRenderer = new x92.b((q) oaVar.f113875q7.get(), (lu1.b) oaVar.f113961v5.get(), new x((q) oaVar.f113875q7.get(), 0));
            l pushTokenRegistrationScheduler = oaVar.X2();
            s50.a appBadgeUtils = (s50.a) oaVar.Y9.get();
            bv1.a newsHubBadgeInteractor = (bv1.a) oaVar.f113596aa.get();
            x pushNotificationUtils = new x((q) oaVar.f113875q7.get(), 0);
            u pushNotificationLogger = new u((d0) oaVar.f113817n2.get(), oaVar.H2(), oaVar.k2(), (tb0.h) oaVar.f113797m0.get());
            v2 experiments = oaVar.z2();
            Intrinsics.checkNotNullParameter(pushNotificationRenderer, "pushNotificationRenderer");
            Intrinsics.checkNotNullParameter(pushTokenRegistrationScheduler, "pushTokenRegistrationScheduler");
            Intrinsics.checkNotNullParameter(appBadgeUtils, "appBadgeUtils");
            Intrinsics.checkNotNullParameter(newsHubBadgeInteractor, "newsHubBadgeInteractor");
            Intrinsics.checkNotNullParameter(pushNotificationUtils, "pushNotificationUtils");
            Intrinsics.checkNotNullParameter(pushNotificationLogger, "pushNotificationLogger");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            this.f50241f = new z(pushNotificationRenderer, pushTokenRegistrationScheduler, appBadgeUtils, newsHubBadgeInteractor, pushNotificationUtils, pushNotificationLogger, experiments, vb0.j.f125466a);
            this.f50242g = (w) oaVar.f113885r0.get();
            this.f50243h = oaVar.X2();
            this.f50244i = oaVar.z2();
        }
        super.onCreate();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public final void onCreate() {
        e();
        new ny.i().i();
        dl2.b.f55293b = false;
        this.f50242g.f(new ey.w());
        as1.d.b(getResources());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        uz1.d valueOf;
        String str;
        Object obj;
        Integer num;
        uz1.c a13;
        uz1.j jVar;
        uz1.j jVar2;
        String str2;
        uz1.b bVar;
        uz1.i iVar;
        Integer num2;
        uz1.c cVar;
        super.onMessageReceived(remoteMessage);
        v2 v2Var = this.f50244i;
        v2Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) v2Var.f83492a;
        boolean o13 = g1Var.o("android_push_notification_refactor", "enabled", z3Var);
        bk.f fVar = ck2.i.f27926f;
        c5.u uVar = null;
        if (!o13 && !g1Var.l("android_push_notification_refactor")) {
            g gVar = this.f50240e;
            Map e13 = remoteMessage.e();
            gVar.getClass();
            if (c60.d.b()) {
                if (e13 == null) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    tb0.k kVar = new tb0.k();
                    kVar.c("Event", "DataIsNull");
                    hVar.k("PushNotificationExceptions", kVar.f117102a);
                    return;
                }
                gVar.f50285j.b(null);
                if (tz1.b.c().f25804b.areNotificationsEnabled()) {
                    f fVar2 = new f(e13);
                    tz1.b.a();
                    String b13 = fVar2.b();
                    String str3 = a0.s0(b13) ? "99" : b13;
                    gVar.f50278c.c(this, fVar2.a().intValue());
                    new fk2.c(1, gVar.f50281f.a(), fVar).i(new r0(19), new h0(3));
                    if ((a0.s0(fVar2.f50267k) && a0.s0(fVar2.f50261e)) || ff0.j.f62103a) {
                        return;
                    }
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.h hVar2 = tb0.g.f117075a;
                    hVar2.h(j1.T("showNotification of category: '%s'", fVar2.p()));
                    String f13 = fVar2.f();
                    try {
                        c5.u b14 = gVar.b(this, fVar2, str3, f13);
                        if (f13 != null) {
                            hVar2.h("Building Notif Group Summary");
                            uVar = new c5.u(this, f13);
                            uVar.r(pz1.b.ic_stat_pinterest_nonpds);
                            uVar.s(new s(1));
                            uVar.l(f13);
                            uVar.m();
                            uVar.n();
                        }
                        if (g.l(this, fVar2, b14, uVar) == h.f50288b) {
                            gVar.f50276a.a(f1.PUSH_NOTIFICATION_RECEIVED_BY, vb0.b.f125448a.a(), false, false);
                            gVar.f50280e.q("received", ((b20.c) gVar.f50284i).n(), fVar2.o());
                            return;
                        }
                        return;
                    } catch (Exception e14) {
                        tb0.g.f117075a.q(e14, "Failed to show PushNotification", p.PUSH_NOTIFICATIONS);
                        return;
                    }
                }
                return;
            }
            return;
        }
        z zVar = this.f50241f;
        Map pushData = remoteMessage.e();
        zVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        if (c60.d.b()) {
            zVar.f123329b.b(null);
            zVar.f123332e.getClass();
            if (tz1.b.c().f25804b.areNotificationsEnabled()) {
                g1.g gVar2 = (g1.g) pushData;
                if (j1.U0((CharSequence) gVar2.get("payload")) || j1.U0((CharSequence) gVar2.get("title"))) {
                    tz1.b.a();
                    zVar.f123330c.c(this, Integer.parseInt((String) gVar2.getOrDefault("badge", "0")));
                    new fk2.c(1, zVar.f123331d.a(), fVar).j(new ek2.i());
                    zVar.f123335h.O("PushNotificationV2.handleMessage", p.PUSH_NOTIFICATIONS);
                    if (Integer.parseInt((String) gVar2.getOrDefault("type", "0")) == 22) {
                        valueOf = uz1.d.valueOf("DEFAULT_NOTIFICATION");
                    } else {
                        String str4 = (String) gVar2.get("category");
                        valueOf = uz1.d.valueOf(str4 != null ? str4 : "DEFAULT_NOTIFICATION");
                    }
                    HashSet hashSet3 = tb0.h.f117076w;
                    tb0.g.f117075a.h("PushNotificationV2: asPushBuilderData for " + valueOf);
                    String str5 = (String) gVar2.get("link");
                    if (str5 == null) {
                        str5 = "";
                    }
                    uz1.b bVar2 = new uz1.b(str5, gVar2, zVar.b(gVar2), uz1.e.DEFAULT_NOTIF);
                    switch (y.f123327a[valueOf.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            uz1.i iVar2 = uz1.h.f123297a;
                            Integer valueOf2 = (f0.j(uz1.d.FOUR_PINS_GRID_NOTIFICATION, uz1.d.SIX_PINS_GRID_NOTIFICATION).contains(valueOf) && zVar.f123334g.b()) ? null : Integer.valueOf(pz1.e.notification_view);
                            str = "99";
                            uz1.j jVar3 = new uz1.j(oe.f.k("override_collapsed_view_title", "title", gVar2), oe.f.k("override_collapsed_view_body", "payload", gVar2), uz1.b.a(bVar2, oe.f.k("collapsed_view_link", "link", gVar2), uz1.e.COLLAPSED_NOTIF, 22), zVar.a(gVar2, this, uz1.d.DEFAULT_NOTIFICATION));
                            String str6 = (String) gVar2.get("title");
                            if (str6 == null) {
                                str6 = "";
                            }
                            String str7 = (String) gVar2.get("payload");
                            if (str7 == null) {
                                str7 = "";
                            }
                            obj = null;
                            uz1.j jVar4 = new uz1.j(str6, str7, uz1.b.a(bVar2, null, uz1.e.EXPANDED_NOTIF, 23), zVar.a(gVar2, this, valueOf));
                            num = valueOf2;
                            a13 = uz1.b.a(bVar2, null, uz1.e.ACTION_BUTTON, 23);
                            jVar = jVar3;
                            jVar2 = jVar4;
                            str2 = null;
                            bVar = null;
                            iVar = iVar2;
                            break;
                        case 7:
                            String str8 = (String) gVar2.get("image");
                            String str9 = (String) gVar2.get("payload");
                            if (str9 == null) {
                                str9 = "";
                            }
                            uz1.i gVar3 = new uz1.g(str9);
                            if (Integer.parseInt((String) gVar2.getOrDefault("type", "0")) == 22) {
                                String str10 = (String) gVar2.get("invite_accepted");
                                if (str10 == null || !Boolean.parseBoolean(str10)) {
                                    u uVar2 = zVar.f123333f;
                                    uVar2.getClass();
                                    Intrinsics.checkNotNullParameter("BoardNotificationAccept", "eventName");
                                    Intrinsics.checkNotNullParameter("Action", "eventKey");
                                    Intrinsics.checkNotNullParameter("AcceptRendered", "eventValue");
                                    tb0.k kVar2 = new tb0.k();
                                    kVar2.c("Action", "AcceptRendered");
                                    uVar2.f123317d.k("BoardNotificationAccept", kVar2.f117102a);
                                    num2 = Integer.valueOf(pz1.e.board_notification_action_accept);
                                    String str11 = (String) gVar2.get("push_id");
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    cVar = new uz1.a(str11, gVar2);
                                } else {
                                    num2 = Integer.valueOf(pz1.e.board_notification_action_view);
                                    cVar = uz1.b.a(bVar2, null, uz1.e.ACTION_BUTTON, 23);
                                }
                            } else {
                                num2 = null;
                                cVar = null;
                            }
                            num = num2;
                            str = "99";
                            str2 = str8;
                            iVar = gVar3;
                            a13 = cVar;
                            bVar = bVar2;
                            obj = null;
                            jVar = null;
                            jVar2 = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    int b15 = zVar.b(gVar2);
                    String str12 = (String) gVar2.get("push_id");
                    String str13 = str12 == null ? "" : str12;
                    Object obj2 = gVar2.get("channel_id");
                    String str14 = (String) obj2;
                    String str15 = (String) ((str14 == null || kotlin.text.z.j(str14)) ? obj : obj2);
                    String str16 = str15 == null ? str : str15;
                    int i13 = eo1.b.color_white_mochimalist_0;
                    int i14 = pz1.b.ic_stat_pinterest_nonpds;
                    String str17 = (String) gVar2.get("title");
                    String str18 = str17 == null ? "" : str17;
                    String str19 = (String) gVar2.get("payload");
                    uz1.f pushBuilderData = new uz1.f(b15, str13, str16, i13, i14, str2, str18, str19 == null ? "" : str19, bVar, num, a13, f0.j(0L, 150L, 150L, 150L), iVar, jVar, jVar2);
                    et1.r0 onPushRendered = new et1.r0(7, zVar, gVar2);
                    x92.b bVar3 = zVar.f123328a;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(this, "context");
                    Intrinsics.checkNotNullParameter(pushBuilderData, "pushBuilderData");
                    Intrinsics.checkNotNullParameter(onPushRendered, "onPushRendered");
                    if (d5.a.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                        return;
                    }
                    try {
                        ((x) bVar3.f134367d).getClass();
                        e0 c13 = tz1.b.c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getManager(...)");
                        c13.a(b15, bVar3.m(pushBuilderData, this));
                        onPushRendered.invoke();
                    } catch (Exception e15) {
                        HashSet hashSet4 = tb0.h.f117076w;
                        tb0.g.f117075a.q(e15, "Failed to notify with NotificationManager", p.PUSH_NOTIFICATIONS);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        super.onNewToken(str);
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
        if (c60.d.b()) {
            this.f50243h.b(str);
        }
    }
}
