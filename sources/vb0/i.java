package vb0;

import android.os.Handler;
import android.os.Looper;
import b3.m0;
import b3.x0;
import h32.a0;
import h32.a1;
import h32.a4;
import h32.b0;
import h32.b2;
import h32.c0;
import h32.c1;
import h32.c3;
import h32.d0;
import h32.d3;
import h32.e2;
import h32.e3;
import h32.e4;
import h32.f1;
import h32.g0;
import h32.g3;
import h32.h2;
import h32.i0;
import h32.i1;
import h32.i3;
import h32.k0;
import h32.l2;
import h32.m2;
import h32.n1;
import h32.n2;
import h32.o3;
import h32.p;
import h32.p2;
import h32.q0;
import h32.q2;
import h32.r;
import h32.r0;
import h32.r2;
import h32.r3;
import h32.s;
import h32.s3;
import h32.t;
import h32.t1;
import h32.u;
import h32.u0;
import h32.u1;
import h32.u2;
import h32.v2;
import h32.v3;
import h32.w0;
import h32.w1;
import h32.w2;
import h32.x;
import h32.x1;
import h32.x2;
import h32.x3;
import h32.y;
import h32.z0;
import h32.z1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g2;
import lh0.k4;
import lh0.n0;
import n60.o;
import q3.n;
import s3.m1;

/* loaded from: classes.dex */
public final class i implements jn2.f, x0, n, m1 {

    /* renamed from: a */
    public final int f125465a;

    public /* synthetic */ i(int i13) {
        this.f125465a = i13;
    }

    public static tq0.h f() {
        return new tq0.h(new Handler(Looper.getMainLooper()), new qc2.d());
    }

    private static void i(fo.a protocol, Object obj) {
        e32.b struct = (e32.b) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("CommonExtraData", "structName");
        if (struct.f57129a != null) {
            protocol.e("excludesFromGridRep", 1, (byte) 2);
            ((fo.b) protocol).c(struct.f57129a.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Integer num = struct.f57130b;
        if (num != null) {
            o.q(protocol, "creativeType", 2, (byte) 8, num);
        }
        Integer num2 = struct.f57131c;
        if (num2 != null) {
            o.q(protocol, "closeupType", 3, (byte) 8, num2);
        }
        Integer num3 = struct.f57132d;
        if (num3 != null) {
            o.q(protocol, "mediaType", 4, (byte) 8, num3);
        }
        Integer num4 = struct.f57133e;
        if (num4 != null) {
            o.q(protocol, "intendedDestinationType", 5, (byte) 8, num4);
        }
        Integer num5 = struct.f57134f;
        if (num5 != null) {
            o.q(protocol, "fallbackDestinationType", 6, (byte) 8, num5);
        }
        Integer num6 = struct.f57135g;
        if (num6 != null) {
            o.q(protocol, "finalDestinationType", 7, (byte) 8, num6);
        }
        String str = struct.f57136h;
        if (str != null) {
            protocol.e("finalDestinationUrl", 8, (byte) 11);
            protocol.m(str);
        }
        bVar.c((byte) 0);
    }

    private static void j(fo.a protocol, Object obj) {
        h32.e struct = (h32.e) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("AdDataEventData", "structName");
        if (struct.f66958a != null) {
            protocol.e("dynamicAdData", 1, (byte) 12);
            r0.f67213e.y0(protocol, struct.f66958a);
        }
        s sVar = struct.f66959b;
        if (sVar != null) {
            protocol.e("badgeItem", 2, (byte) 12);
            s.f67229b.d(protocol, sVar);
        }
        h32.g gVar = struct.f66960c;
        if (gVar != null) {
            protocol.e("adFormatsModularizationData", 4, (byte) 12);
            h32.g.f67009e.h(protocol, gVar);
        }
        e32.b bVar2 = struct.f66961d;
        if (bVar2 != null) {
            protocol.e("commonExtraData", 6, (byte) 12);
            e32.b.f57128i.h(protocol, bVar2);
        }
        bVar.c((byte) 0);
    }

    private static void k(fo.a protocol, Object obj) {
        h32.g struct = (h32.g) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("AdFormatsModularizationEventData", "structName");
        if (struct.f67010a != null) {
            protocol.e("adsCreativeType", 1, (byte) 8);
            protocol.g(struct.f67010a.intValue());
        }
        Integer num = struct.f67011b;
        if (num != null) {
            o.q(protocol, "adsCloseupType", 2, (byte) 8, num);
        }
        Integer num2 = struct.f67012c;
        if (num2 != null) {
            o.q(protocol, "adsDestinationType", 3, (byte) 8, num2);
        }
        Integer num3 = struct.f67013d;
        if (num3 != null) {
            o.q(protocol, "adsMediaType", 4, (byte) 8, num3);
        }
        bVar.c((byte) 0);
    }

    private static void l(fo.a protocol, Object obj) {
        i0 struct = (i0) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("Context", "structName");
        if (struct.f67081a != null) {
            protocol.e("viewType", 1, (byte) 8);
            protocol.g(struct.f67081a.getValue());
        }
        a4 a4Var = struct.f67082b;
        if (a4Var != null) {
            protocol.e("viewParameter", 2, (byte) 8);
            protocol.g(a4Var.getValue());
        }
        x3 x3Var = struct.f67083c;
        if (x3Var != null) {
            protocol.e("viewData", 3, (byte) 12);
            x3.f67396r.d(protocol, x3Var);
        }
        g0 g0Var = struct.f67084d;
        if (g0Var != null) {
            protocol.e("component", 4, (byte) 8);
            protocol.g(g0Var.getValue());
        }
        d0 d0Var = struct.f67085e;
        if (d0Var != null) {
            protocol.e("componentData", 5, (byte) 12);
            d0.f66942b.y0(protocol, d0Var);
        }
        u0 u0Var = struct.f67086f;
        if (u0Var != null) {
            protocol.e("element", 6, (byte) 8);
            protocol.g(u0Var.getValue());
        }
        bVar.c((byte) 0);
    }

    private static void m(fo.a protocol, Object obj) {
        w0 struct = (w0) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("Event", "structName");
        if (struct.f67323a != null) {
            protocol.e("time", 1, (byte) 10);
            protocol.h(struct.f67323a.longValue());
        }
        f1 f1Var = struct.f67324b;
        if (f1Var != null) {
            protocol.e("eventType", 2, (byte) 8);
            protocol.g(f1Var.getValue());
        }
        Long l13 = struct.f67325c;
        if (l13 != null) {
            o.r(protocol, "userId", 3, (byte) 10, l13);
        }
        Long l14 = struct.f67326d;
        if (l14 != null) {
            o.r(protocol, "objectId", 4, (byte) 10, l14);
        }
        Map map = struct.f67327e;
        if (map != null) {
            protocol.e("auxData", 5, (byte) 13);
            int size = map.size();
            fo.b bVar2 = (fo.b) protocol;
            bVar2.c((byte) 11);
            bVar2.c((byte) 11);
            bVar2.g(size);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                protocol.m(str);
                protocol.m(str2);
            }
        }
        c1 c1Var = struct.f67328f;
        if (c1Var != null) {
            protocol.e("eventData", 6, (byte) 12);
            c1.f66897g0.h(protocol, c1Var);
        }
        i iVar = i0.f67080g;
        i0 i0Var = struct.f67329g;
        if (i0Var != null) {
            protocol.e("previousContext", 7, (byte) 12);
            iVar.h(protocol, i0Var);
        }
        i0 i0Var2 = struct.f67330h;
        if (i0Var2 != null) {
            protocol.e("context", 8, (byte) 12);
            iVar.h(protocol, i0Var2);
        }
        h32.m mVar = struct.f67331i;
        if (mVar != null) {
            protocol.e("app", 9, (byte) 8);
            protocol.g(mVar.getValue());
        }
        String str3 = struct.f67332j;
        if (str3 != null) {
            protocol.e("request", 10, (byte) 11);
            protocol.m(str3);
        }
        String str4 = struct.f67333k;
        if (str4 != null) {
            protocol.e("appVersion", 11, (byte) 11);
            protocol.m(str4);
        }
        q0 q0Var = struct.f67334l;
        if (q0Var != null) {
            protocol.e("device", 12, (byte) 8);
            protocol.g(q0Var.getValue());
        }
        x xVar = struct.f67335m;
        if (xVar != null) {
            protocol.e("browser", 13, (byte) 8);
            protocol.g(xVar.getValue());
        }
        t1 t1Var = struct.f67336n;
        if (t1Var != null) {
            protocol.e("os", 14, (byte) 8);
            protocol.g(t1Var.getValue());
        }
        String str5 = struct.f67337o;
        if (str5 != null) {
            protocol.e("deviceName", 15, (byte) 11);
            protocol.m(str5);
        }
        String str6 = struct.f67338p;
        if (str6 != null) {
            protocol.e("unauthId", 16, (byte) 11);
            protocol.m(str6);
        }
        String str7 = struct.f67339q;
        if (str7 != null) {
            protocol.e("userIdStr", 17, (byte) 11);
            protocol.m(str7);
        }
        String str8 = struct.f67340r;
        if (str8 != null) {
            protocol.e("objectIdStr", 18, (byte) 11);
            protocol.m(str8);
        }
        String str9 = struct.f67341s;
        if (str9 != null) {
            protocol.e("insertionId", 19, (byte) 11);
            protocol.m(str9);
        }
        z0 z0Var = struct.f67342t;
        if (z0Var != null) {
            protocol.e("appState", 20, (byte) 8);
            protocol.g(z0Var.getValue());
        }
        u2 u2Var = struct.f67343u;
        if (u2Var != null) {
            protocol.e("site", 21, (byte) 8);
            protocol.g(u2Var.getValue());
        }
        String str10 = struct.f67344v;
        if (str10 != null) {
            protocol.e("uuid", 23, (byte) 11);
            protocol.m(str10);
        }
        Map map2 = struct.f67345w;
        if (map2 != null) {
            protocol.e("pData", 24, (byte) 13);
            int size2 = map2.size();
            fo.b bVar3 = (fo.b) protocol;
            bVar3.c((byte) 11);
            bVar3.c((byte) 11);
            bVar3.g(size2);
            for (Map.Entry entry2 : map2.entrySet()) {
                String str11 = (String) entry2.getKey();
                String str12 = (String) entry2.getValue();
                protocol.m(str11);
                protocol.m(str12);
            }
        }
        Long l15 = struct.f67346x;
        if (l15 != null) {
            o.r(protocol, "clientId", 25, (byte) 10, l15);
        }
        Long l16 = struct.f67347y;
        if (l16 != null) {
            o.r(protocol, "browserExtensionTrackingId", 26, (byte) 10, l16);
        }
        Boolean bool = struct.f67348z;
        if (bool != null) {
            protocol.e("fromThirdParty", 27, (byte) 2);
            ((fo.b) protocol).c(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool2 = struct.A;
        if (bool2 != null) {
            protocol.e("isPromoted", 28, (byte) 2);
            ((fo.b) protocol).c(bool2.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool3 = struct.B;
        if (bool3 != null) {
            protocol.e("isDownstreamPromoted", 29, (byte) 2);
            ((fo.b) protocol).c(bool3.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Long l17 = struct.C;
        if (l17 != null) {
            o.r(protocol, "durationNs", 30, (byte) 10, l17);
        }
        String str13 = struct.D;
        if (str13 != null) {
            protocol.e("pairId", 31, (byte) 11);
            protocol.m(str13);
        }
        Long l18 = struct.E;
        if (l18 != null) {
            o.r(protocol, "timeSkew", 32, (byte) 10, l18);
        }
        String str14 = struct.F;
        if (str14 != null) {
            protocol.e("clientUUID", 33, (byte) 11);
            protocol.m(str14);
        }
        String str15 = struct.G;
        if (str15 != null) {
            protocol.e("clientTrackingParams", 34, (byte) 11);
            protocol.m(str15);
        }
        String str16 = struct.H;
        if (str16 != null) {
            protocol.e("seoExpId", 35, (byte) 11);
            protocol.m(str16);
        }
        p pVar = struct.I;
        if (pVar != null) {
            protocol.e("appTypeDetailed", 36, (byte) 8);
            protocol.g(pVar.getValue());
        }
        String str17 = struct.f67322J;
        if (str17 != null) {
            protocol.e("osVersion", 39, (byte) 11);
            protocol.m(str17);
        }
        Boolean bool4 = struct.K;
        if (bool4 != null) {
            protocol.e("isThirdPartyAd", 41, (byte) 2);
            ((fo.b) protocol).c(bool4.booleanValue() ? (byte) 1 : (byte) 0);
        }
        bVar.c((byte) 0);
    }

    private static void n(fo.a protocol, Object obj) {
        c1 struct = (c1) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        ((fo.b) protocol).getClass();
        Intrinsics.checkNotNullParameter("EventData", "structName");
        struct.getClass();
        String str = struct.f66899a;
        if (str != null) {
            protocol.e("json", 3, (byte) 11);
            protocol.m(str);
        }
        Boolean bool = struct.f66901b;
        if (bool != null) {
            protocol.e("completedCaptcha", 9, (byte) 2);
            ((fo.b) protocol).c(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }
        i iVar = z1.f67476m0;
        List list = struct.f66903c;
        if (list != null) {
            protocol.e("pinImpressions", 11, (byte) 15);
            Iterator j13 = o.j(list, protocol, (byte) 12);
            while (j13.hasNext()) {
                iVar.h(protocol, (z1) j13.next());
            }
        }
        Boolean bool2 = struct.f66905d;
        if (bool2 != null) {
            protocol.e("enforceSpamRules", 12, (byte) 2);
            ((fo.b) protocol).c(bool2.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool3 = struct.f66907e;
        if (bool3 != null) {
            protocol.e("adminOverride", 13, (byte) 2);
            ((fo.b) protocol).c(bool3.booleanValue() ? (byte) 1 : (byte) 0);
        }
        h32.m1 m1Var = struct.f66909f;
        if (m1Var != null) {
            protocol.e("interestImpressionData", 14, (byte) 12);
            h32.m1.f67140b.y0(protocol, m1Var);
        }
        v2 v2Var = struct.f66911g;
        if (v2Var != null) {
            protocol.e("storyImpression", 17, (byte) 12);
            v2.f67310k.d(protocol, v2Var);
        }
        List list2 = struct.f66912h;
        if (list2 != null) {
            protocol.e("csrImpressions", 18, (byte) 15);
            Iterator j14 = o.j(list2, protocol, (byte) 12);
            while (j14.hasNext()) {
                iVar.h(protocol, (z1) j14.next());
            }
        }
        List list3 = struct.f66913i;
        if (list3 != null) {
            protocol.e("boardImpressions", 21, (byte) 15);
            Iterator j15 = o.j(list3, protocol, (byte) 12);
            while (j15.hasNext()) {
                t.f67243n.d(protocol, (t) j15.next());
            }
        }
        List list4 = struct.f66914j;
        if (list4 != null) {
            protocol.e("topicImpressions", 22, (byte) 15);
            Iterator j16 = o.j(list4, protocol, (byte) 12);
            while (j16.hasNext()) {
                d3.f66945l.d(protocol, (d3) j16.next());
            }
        }
        List list5 = struct.f66915k;
        if (list5 != null) {
            protocol.e("userImpressions", 23, (byte) 15);
            Iterator j17 = o.j(list5, protocol, (byte) 12);
            while (j17.hasNext()) {
                e3.f66963n.d(protocol, (e3) j17.next());
            }
        }
        List list6 = struct.f66916l;
        if (list6 != null) {
            protocol.e("searchImpressions", 24, (byte) 15);
            Iterator j18 = o.j(list6, protocol, (byte) 12);
            while (j18.hasNext()) {
                n2.f67156k.o(protocol, (n2) j18.next());
            }
        }
        List list7 = struct.f66917m;
        if (list7 != null) {
            protocol.e("networkStoryImpressions", 25, (byte) 15);
            Iterator j19 = o.j(list7, protocol, (byte) 12);
            while (j19.hasNext()) {
                ep.b.A(j19.next());
                y.f67422i.o(protocol, null);
            }
        }
        List list8 = struct.f66918n;
        if (list8 != null) {
            protocol.e("notificationImpressions", 26, (byte) 15);
            Iterator j23 = o.j(list8, protocol, (byte) 12);
            while (j23.hasNext()) {
                ep.b.A(j23.next());
                y.f67423j.o(protocol, null);
            }
        }
        List list9 = struct.f66919o;
        if (list9 != null) {
            protocol.e("articleImpressions", 27, (byte) 15);
            Iterator j24 = o.j(list9, protocol, (byte) 12);
            while (j24.hasNext()) {
                r.f67198o.d(protocol, (r) j24.next());
            }
        }
        List list10 = struct.f66920p;
        if (list10 != null) {
            protocol.e("newsHubData", 29, (byte) 15);
            Iterator j25 = o.j(list10, protocol, (byte) 12);
            while (j25.hasNext()) {
                n1.f67151e.o(protocol, (n1) j25.next());
            }
        }
        g3 g3Var = struct.f66921q;
        if (g3Var != null) {
            protocol.e("videoEventData", 32, (byte) 12);
            g3.C.h(protocol, g3Var);
        }
        Boolean bool4 = struct.f66922r;
        if (bool4 != null) {
            protocol.e("didViewWebsiteOnePixel", 37, (byte) 2);
            ((fo.b) protocol).c(bool4.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Short sh3 = struct.f66923s;
        if (sh3 != null) {
            o.s(protocol, "maxViewWebsitePercent", 38, (byte) 6, sh3);
        }
        List list11 = struct.f66924t;
        if (list11 != null) {
            protocol.e("pinCarouselSlotImpressions", 40, (byte) 15);
            Iterator j26 = o.j(list11, protocol, (byte) 12);
            while (j26.hasNext()) {
                x1.f67379l.h(protocol, (x1) j26.next());
            }
        }
        w1 w1Var = struct.f66925u;
        if (w1Var != null) {
            protocol.e("pinCarouselSlotEventData", 41, (byte) 12);
            w1.f67349g.o(protocol, w1Var);
        }
        List list12 = struct.f66926v;
        if (list12 != null) {
            protocol.e("guideImpressions", 43, (byte) 15);
            Iterator j27 = o.j(list12, protocol, (byte) 12);
            while (j27.hasNext()) {
                ep.b.A(j27.next());
                y.f67418e.y0(protocol, null);
            }
        }
        i3 i3Var = struct.f66927w;
        if (i3Var != null) {
            protocol.e("videoPerformanceData", 44, (byte) 12);
            i3.f67087e0.h(protocol, i3Var);
        }
        List list13 = struct.f66928x;
        if (list13 != null) {
            protocol.e("spotlightDotShownData", 45, (byte) 15);
            Iterator j28 = o.j(list13, protocol, (byte) 12);
            while (j28.hasNext()) {
                ep.b.A(j28.next());
                y.f67427n.d(protocol, null);
            }
        }
        List list14 = struct.f66929y;
        if (list14 != null) {
            protocol.e("catalogsEventData", 47, (byte) 15);
            Iterator j29 = o.j(list14, protocol, (byte) 12);
            while (j29.hasNext()) {
                ep.b.A(j29.next());
                y.f67415b.y0(protocol, null);
            }
        }
        List list15 = struct.f66930z;
        if (list15 != null) {
            protocol.e("collectionItemImpressions", 48, (byte) 15);
            Iterator j33 = o.j(list15, protocol, (byte) 12);
            while (j33.hasNext()) {
                b0.f66836m.y0(protocol, (b0) j33.next());
            }
        }
        a0 a0Var = struct.A;
        if (a0Var != null) {
            protocol.e("collectionItemEventData", 49, (byte) 12);
            a0.f66821g.y0(protocol, a0Var);
        }
        List list16 = struct.B;
        if (list16 != null) {
            protocol.e("todayArticleImpressions", 50, (byte) 15);
            Iterator j34 = o.j(list16, protocol, (byte) 12);
            while (j34.hasNext()) {
                c3.f66931f.d(protocol, (c3) j34.next());
            }
        }
        List list17 = struct.C;
        if (list17 != null) {
            protocol.e("businessHubImpressions", 51, (byte) 15);
            Iterator j35 = o.j(list17, protocol, (byte) 12);
            while (j35.hasNext()) {
                ep.b.A(j35.next());
                y.f67414a.y0(protocol, null);
            }
        }
        w2 w2Var = struct.D;
        if (w2Var != null) {
            protocol.e("storyPinData", 52, (byte) 12);
            w2.f67356f.d(protocol, w2Var);
        }
        List list18 = struct.E;
        if (list18 != null) {
            protocol.e("commentImpressions", 53, (byte) 15);
            Iterator j36 = o.j(list18, protocol, (byte) 12);
            while (j36.hasNext()) {
                c0.f66886k.y0(protocol, (c0) j36.next());
            }
        }
        List list19 = struct.F;
        if (list19 != null) {
            protocol.e("classFeedGuideImpressions", 55, (byte) 15);
            Iterator j37 = o.j(list19, protocol, (byte) 12);
            while (j37.hasNext()) {
                ep.b.A(j37.next());
                y.f67416c.y0(protocol, null);
            }
        }
        List list20 = struct.G;
        if (list20 != null) {
            protocol.e("creatorBubbleImpressions", 56, (byte) 15);
            Iterator j38 = o.j(list20, protocol, (byte) 12);
            while (j38.hasNext()) {
                ep.b.A(j38.next());
                y.f67417d.y0(protocol, null);
            }
        }
        x2 x2Var = struct.H;
        if (x2Var != null) {
            protocol.e("storyPinProductEventData", 57, (byte) 12);
            x2.f67391e.d(protocol, x2Var);
        }
        List list21 = struct.I;
        if (list21 != null) {
            protocol.e("portalImpressions", 60, (byte) 15);
            Iterator j39 = o.j(list21, protocol, (byte) 12);
            while (j39.hasNext()) {
                ep.b.A(j39.next());
                y.f67425l.o(protocol, null);
            }
        }
        List list22 = struct.f66898J;
        if (list22 != null) {
            protocol.e("productGroupImpressions", 61, (byte) 15);
            Iterator j43 = o.j(list22, protocol, (byte) 12);
            while (j43.hasNext()) {
                ep.b.A(j43.next());
                y.f67426m.o(protocol, null);
            }
        }
        List list23 = struct.K;
        if (list23 != null) {
            protocol.e("liveSessionProductImpressions", 62, (byte) 15);
            Iterator j44 = o.j(list23, protocol, (byte) 12);
            while (j44.hasNext()) {
                ep.b.A(j44.next());
                y.f67421h.y0(protocol, null);
            }
        }
        List list24 = struct.L;
        if (list24 != null) {
            protocol.e("liveSessionCommentImpressions", 63, (byte) 15);
            Iterator j45 = o.j(list24, protocol, (byte) 12);
            while (j45.hasNext()) {
                ep.b.A(j45.next());
                y.f67420g.y0(protocol, null);
            }
        }
        List list25 = struct.M;
        if (list25 != null) {
            protocol.e("oneBarModuleImpressions", 64, (byte) 15);
            Iterator j46 = o.j(list25, protocol, (byte) 12);
            while (j46.hasNext()) {
                u1.f67268h.o(protocol, (u1) j46.next());
            }
        }
        List list26 = struct.N;
        if (list26 != null) {
            protocol.e("boardMoreIdeasFeedUpsellImpressions", 67, (byte) 15);
            Iterator j47 = o.j(list26, protocol, (byte) 12);
            while (j47.hasNext()) {
                u.f67259i.d(protocol, (u) j47.next());
            }
        }
        List list27 = struct.O;
        if (list27 != null) {
            protocol.e("showcaseImpressions", 70, (byte) 15);
            Iterator j48 = o.j(list27, protocol, (byte) 12);
            while (j48.hasNext()) {
                q2.f67188i.o(protocol, (q2) j48.next());
            }
        }
        p2 p2Var = struct.P;
        if (p2Var != null) {
            protocol.e("showcaseEventData", 71, (byte) 12);
            p2.f67176f.o(protocol, p2Var);
        }
        l2 l2Var = struct.Q;
        if (l2Var != null) {
            protocol.e("quizEventData", 72, (byte) 12);
            l2.f67137b.o(protocol, l2Var);
        }
        List list28 = struct.R;
        if (list28 != null) {
            protocol.e("shuffleImpressions", 76, (byte) 15);
            Iterator j49 = o.j(list28, protocol, (byte) 12);
            while (j49.hasNext()) {
                r2.f67218k.o(protocol, (r2) j49.next());
            }
        }
        List list29 = struct.S;
        if (list29 != null) {
            protocol.e("relatedPinsFilterImpressions", 77, (byte) 15);
            Iterator j53 = o.j(list29, protocol, (byte) 12);
            while (j53.hasNext()) {
                m2.f67142i.o(protocol, (m2) j53.next());
            }
        }
        List list30 = struct.T;
        if (list30 != null) {
            protocol.e("pinClusterImpressions", 78, (byte) 15);
            Iterator j54 = o.j(list30, protocol, (byte) 12);
            while (j54.hasNext()) {
                ep.b.A(j54.next());
                y.f67424k.o(protocol, null);
            }
        }
        Integer num = struct.U;
        if (num != null) {
            o.q(protocol, "clientCreativeType", 79, (byte) 8, num);
        }
        k0 k0Var = struct.V;
        if (k0Var != null) {
            protocol.e("dcoEventData", 80, (byte) 12);
            k0.f67127g.y0(protocol, k0Var);
        }
        n32.a aVar = struct.W;
        if (aVar != null) {
            protocol.e("gamImpData", 81, (byte) 12);
            n32.a.f89165c.d(protocol, aVar);
        }
        List list31 = struct.X;
        if (list31 != null) {
            protocol.e("useCaseImpressions", 82, (byte) 15);
            Iterator j55 = o.j(list31, protocol, (byte) 12);
            while (j55.hasNext()) {
                ep.b.A(j55.next());
                y.f67428o.d(protocol, null);
            }
        }
        h32.f fVar = struct.Y;
        if (fVar != null) {
            protocol.e("adDisclosureEventData", 83, (byte) 12);
            h32.f.f66981a.d(protocol, fVar);
        }
        x32.b bVar = struct.Z;
        if (bVar != null) {
            protocol.e("handshakeEventData", 84, (byte) 12);
            x32.b.f131651e.d(protocol, bVar);
        }
        List list32 = struct.f66900a0;
        if (list32 != null) {
            protocol.e("vaseAnnotationImpressions", 86, (byte) 15);
            Iterator j56 = o.j(list32, protocol, (byte) 12);
            while (j56.hasNext()) {
                ep.b.A(j56.next());
                e42.a.f57202a.d(protocol, null);
            }
        }
        String str2 = struct.f66902b0;
        if (str2 != null) {
            protocol.e("adFormatData", 87, (byte) 11);
            protocol.m(str2);
        }
        t22.a aVar2 = struct.f66904c0;
        if (aVar2 != null) {
            protocol.e("collageEventData", 89, (byte) 12);
            t22.a.f115823d.d(protocol, aVar2);
        }
        Short sh4 = struct.f66906d0;
        if (sh4 != null) {
            o.s(protocol, "dlAdCloseupIngressVariant", 90, (byte) 6, sh4);
        }
        h32.e eVar = struct.f66908e0;
        if (eVar != null) {
            protocol.e("adDataEventData", 93, (byte) 12);
            h32.e.f66957e.h(protocol, eVar);
        }
        b32.b bVar2 = struct.f66910f0;
        if (bVar2 != null) {
            protocol.e("cartingEventData", 94, (byte) 12);
            b32.b.f21463i.d(protocol, bVar2);
        }
        ((fo.b) protocol).c((byte) 0);
    }

    private static void o(fo.a protocol, Object obj) {
        z1 struct = (z1) obj;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(struct, "struct");
        fo.b bVar = (fo.b) protocol;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("PinImpression", "structName");
        if (struct.f67478a != null) {
            protocol.e("pinId", 1, (byte) 10);
            protocol.h(struct.f67478a.longValue());
        }
        Long l13 = struct.f67480b;
        if (l13 != null) {
            o.r(protocol, "time", 2, (byte) 10, l13);
        }
        String str = struct.f67482c;
        if (str != null) {
            protocol.e("pinIdStr", 3, (byte) 11);
            protocol.m(str);
        }
        String str2 = struct.f67484d;
        if (str2 != null) {
            protocol.e("insertionId", 4, (byte) 11);
            protocol.m(str2);
        }
        Long l14 = struct.f67486e;
        if (l14 != null) {
            o.r(protocol, "endTime", 5, (byte) 10, l14);
        }
        Integer num = struct.f67488f;
        if (num != null) {
            o.q(protocol, "yPosition", 6, (byte) 8, num);
        }
        Short sh3 = struct.f67490g;
        if (sh3 != null) {
            o.s(protocol, "columnIndex", 7, (byte) 6, sh3);
        }
        Short sh4 = struct.f67492h;
        if (sh4 != null) {
            o.s(protocol, "slotIndex", 8, (byte) 6, sh4);
        }
        String str3 = struct.f67494i;
        if (str3 != null) {
            protocol.e("requestId", 9, (byte) 11);
            protocol.m(str3);
        }
        h2 h2Var = struct.f67496j;
        if (h2Var != null) {
            protocol.e("type", 10, (byte) 8);
            protocol.g(h2Var.getValue());
        }
        Double d2 = struct.f67498k;
        if (d2 != null) {
            protocol.e("renderDuration", 11, (byte) 4);
            protocol.d(d2.doubleValue());
        }
        String str4 = struct.f67500l;
        if (str4 != null) {
            protocol.e("imageURL", 12, (byte) 11);
            protocol.m(str4);
        }
        String str5 = struct.f67502m;
        if (str5 != null) {
            protocol.e("imageSignature", 13, (byte) 11);
            protocol.m(str5);
        }
        Boolean bool = struct.f67503n;
        if (bool != null) {
            protocol.e("cached", 14, (byte) 2);
            ((fo.b) protocol).c(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Double d13 = struct.f67504o;
        if (d13 != null) {
            protocol.e("loops", 15, (byte) 4);
            protocol.d(d13.doubleValue());
        }
        List list = struct.f67505p;
        if (list != null) {
            protocol.e("richTypes", 16, (byte) 15);
            Iterator j13 = o.j(list, protocol, (byte) 8);
            while (j13.hasNext()) {
                protocol.g(((e2) j13.next()).getValue());
            }
        }
        List list2 = struct.f67506q;
        if (list2 != null) {
            protocol.e("visibleEvents", 17, (byte) 15);
            Iterator j14 = o.j(list2, protocol, (byte) 12);
            while (j14.hasNext()) {
                e4.f66977d.h(protocol, (e4) j14.next());
            }
        }
        Map map = struct.f67507r;
        if (map != null) {
            protocol.e("visibleMilliSeconds", 18, (byte) 13);
            int size = map.size();
            fo.b bVar2 = (fo.b) protocol;
            bVar2.c((byte) 8);
            bVar2.c((byte) 8);
            bVar2.g(size);
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                int intValue2 = ((Number) entry.getValue()).intValue();
                protocol.g(intValue);
                protocol.g(intValue2);
            }
        }
        Long l15 = struct.f67508s;
        if (l15 != null) {
            o.r(protocol, "storyId", 19, (byte) 10, l15);
        }
        Short sh5 = struct.f67509t;
        if (sh5 != null) {
            o.s(protocol, "storyIndex", 20, (byte) 6, sh5);
        }
        Boolean bool2 = struct.f67510u;
        if (bool2 != null) {
            protocol.e("isPromoted", 21, (byte) 2);
            ((fo.b) protocol).c(bool2.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool3 = struct.f67511v;
        if (bool3 != null) {
            protocol.e("isDownstreamPromoted", 22, (byte) 2);
            ((fo.b) protocol).c(bool3.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool4 = struct.f67512w;
        if (bool4 != null) {
            protocol.e("isNativeVideoAndWatchable", 23, (byte) 2);
            ((fo.b) protocol).c(bool4.booleanValue() ? (byte) 1 : (byte) 0);
        }
        String str6 = struct.f67513x;
        if (str6 != null) {
            protocol.e("storyIdStr", 24, (byte) 11);
            protocol.m(str6);
        }
        String str7 = struct.f67514y;
        if (str7 != null) {
            protocol.e("videoIdStr", 25, (byte) 11);
            protocol.m(str7);
        }
        Double d14 = struct.f67515z;
        if (d14 != null) {
            protocol.e("pinCellHeight", 26, (byte) 4);
            protocol.d(d14.doubleValue());
        }
        Double d15 = struct.A;
        if (d15 != null) {
            protocol.e("pinCellWidth", 27, (byte) 4);
            protocol.d(d15.doubleValue());
        }
        Double d16 = struct.B;
        if (d16 != null) {
            protocol.e("windowHeight", 28, (byte) 4);
            protocol.d(d16.doubleValue());
        }
        Double d17 = struct.C;
        if (d17 != null) {
            protocol.e("windowWidth", 29, (byte) 4);
            protocol.d(d17.doubleValue());
        }
        Double d18 = struct.D;
        if (d18 != null) {
            protocol.e("ratingValue", 30, (byte) 4);
            protocol.d(d18.doubleValue());
        }
        Integer num2 = struct.E;
        if (num2 != null) {
            o.q(protocol, "reviewCount", 31, (byte) 8, num2);
        }
        Boolean bool5 = struct.F;
        if (bool5 != null) {
            protocol.e("isAppInstall", 32, (byte) 2);
            ((fo.b) protocol).c(bool5.booleanValue() ? (byte) 1 : (byte) 0);
        }
        List list3 = struct.G;
        if (list3 != null) {
            protocol.e("clickEvents", 33, (byte) 15);
            Iterator j15 = o.j(list3, protocol, (byte) 12);
            while (j15.hasNext()) {
                b2.f66882d.o(protocol, (b2) j15.next());
            }
        }
        Boolean bool6 = struct.H;
        if (bool6 != null) {
            protocol.e("hasInstantContent", 34, (byte) 2);
            ((fo.b) protocol).c(bool6.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Short sh6 = struct.I;
        if (sh6 != null) {
            o.s(protocol, "viewCount", 35, (byte) 6, sh6);
        }
        String str8 = struct.f67477J;
        if (str8 != null) {
            protocol.e("clientTrackingParams", 36, (byte) 11);
            protocol.m(str8);
        }
        String str9 = struct.K;
        if (str9 != null) {
            protocol.e("objectSignature", 37, (byte) 11);
            protocol.m(str9);
        }
        z42.r rVar = struct.L;
        if (rVar != null) {
            protocol.e("nativeFormatType", 38, (byte) 8);
            protocol.g(rVar.getValue());
        }
        i1 i1Var = struct.M;
        if (i1Var != null) {
            protocol.e("forcedExit", 39, (byte) 8);
            protocol.g(i1Var.getValue());
        }
        String str10 = struct.N;
        if (str10 != null) {
            protocol.e("cacheSource", 40, (byte) 11);
            protocol.m(str10);
        }
        String str11 = struct.O;
        if (str11 != null) {
            protocol.e("adsSource", 41, (byte) 11);
            protocol.m(str11);
        }
        Long l16 = struct.P;
        if (l16 != null) {
            o.r(protocol, "rootPinId", 43, (byte) 10, l16);
        }
        Long l17 = struct.Q;
        if (l17 != null) {
            o.r(protocol, "creatorId", 44, (byte) 10, l17);
        }
        String str12 = struct.R;
        if (str12 != null) {
            protocol.e("creatorCountry", 45, (byte) 11);
            protocol.m(str12);
        }
        Boolean bool7 = struct.S;
        if (bool7 != null) {
            protocol.e("isViewerFollower", 46, (byte) 2);
            ((fo.b) protocol).c(bool7.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool8 = struct.T;
        if (bool8 != null) {
            protocol.e("isCheckoutCTAVisible", 48, (byte) 2);
            ((fo.b) protocol).c(bool8.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean bool9 = struct.U;
        if (bool9 != null) {
            protocol.e("isNativeContent", 49, (byte) 2);
            ((fo.b) protocol).c(bool9.booleanValue() ? (byte) 1 : (byte) 0);
        }
        z42.i iVar = struct.V;
        if (iVar != null) {
            protocol.e("formatType", 50, (byte) 8);
            protocol.g(iVar.getValue());
        }
        Boolean bool10 = struct.W;
        if (bool10 != null) {
            protocol.e("isThirdPartyAd", 51, (byte) 2);
            ((fo.b) protocol).c(bool10.booleanValue() ? (byte) 1 : (byte) 0);
        }
        String str13 = struct.X;
        if (str13 != null) {
            protocol.e("productTagParentPinId", 52, (byte) 11);
            protocol.m(str13);
        }
        Boolean bool11 = struct.Y;
        if (bool11 != null) {
            protocol.e("isMrcBtr", 53, (byte) 2);
            ((fo.b) protocol).c(bool11.booleanValue() ? (byte) 1 : (byte) 0);
        }
        k0 k0Var = struct.Z;
        if (k0Var != null) {
            protocol.e("dcoEventData", 55, (byte) 12);
            k0.f67127g.y0(protocol, k0Var);
        }
        Short sh7 = struct.f67479a0;
        if (sh7 != null) {
            o.s(protocol, "destinationType", 56, (byte) 6, sh7);
        }
        Short sh8 = struct.f67481b0;
        if (sh8 != null) {
            o.s(protocol, "creativeType", 57, (byte) 6, sh8);
        }
        Long l18 = struct.f67483c0;
        if (l18 != null) {
            o.r(protocol, "imageIngestedAtTime", 58, (byte) 10, l18);
        }
        Boolean bool12 = struct.f67485d0;
        if (bool12 != null) {
            protocol.e("isPremiereSpotlight", 59, (byte) 2);
            ((fo.b) protocol).c(bool12.booleanValue() ? (byte) 1 : (byte) 0);
        }
        h32.f fVar = struct.f67487e0;
        if (fVar != null) {
            protocol.e("adDisclosureEventData", 61, (byte) 12);
            h32.f.f66981a.d(protocol, fVar);
        }
        x32.b bVar3 = struct.f67489f0;
        if (bVar3 != null) {
            protocol.e("handshakeEventData", 62, (byte) 12);
            x32.b.f131651e.d(protocol, bVar3);
        }
        if (struct.f67491g0 != null) {
            protocol.e("adFormatData", 63, (byte) 11);
            protocol.m(struct.f67491g0);
        }
        if (struct.f67493h0 != null) {
            protocol.e("adFormatExtraData", 64, (byte) 11);
            protocol.m(struct.f67493h0);
        }
        if (struct.f67495i0 != null) {
            protocol.e("dlAdCloseupIngressVariant", 65, (byte) 6);
            protocol.f(struct.f67495i0.shortValue());
        }
        if (struct.f67497j0 != null) {
            protocol.e("didPinShowCreatorAttribution", 67, (byte) 2);
            ((fo.b) protocol).c(struct.f67497j0.booleanValue() ? (byte) 1 : (byte) 0);
        }
        if (struct.f67499k0 != null) {
            protocol.e("adDataEventData", 68, (byte) 12);
            h32.e.f66957e.h(protocol, struct.f67499k0);
        }
        if (struct.f67501l0 != null) {
            protocol.e("cartingEventData", 69, (byte) 12);
            b32.b.f21463i.d(protocol, struct.f67501l0);
        }
        bVar.c((byte) 0);
    }

    @Override // b3.x0
    public m0 a(long j13, n4.k kVar, n4.b bVar) {
        switch (this.f125465a) {
            case 0:
                float R = bVar.R(k1.g0.f77865a);
                return new b3.k0(new a3.d(0.0f, -R, a3.f.d(j13), a3.f.b(j13) + R));
            default:
                float R2 = bVar.R(k1.g0.f77865a);
                return new b3.k0(new a3.d(-R2, 0.0f, a3.f.d(j13) + R2, a3.f.b(j13)));
        }
    }

    public long b(long j13, long j14) {
        switch (this.f125465a) {
            case 0:
                float max = Math.max(a3.f.d(j14) / a3.f.d(j13), a3.f.b(j14) / a3.f.b(j13));
                return androidx.compose.ui.layout.b.a(max, max);
            case 1:
            case 2:
            default:
                if (a3.f.d(j13) <= a3.f.d(j14) && a3.f.b(j13) <= a3.f.b(j14)) {
                    return androidx.compose.ui.layout.b.a(1.0f, 1.0f);
                }
                float min = Math.min(a3.f.d(j14) / a3.f.d(j13), a3.f.b(j14) / a3.f.b(j13));
                return androidx.compose.ui.layout.b.a(min, min);
            case 3:
                float d2 = a3.f.d(j14) / a3.f.d(j13);
                return androidx.compose.ui.layout.b.a(d2, d2);
            case 4:
                float min2 = Math.min(a3.f.d(j14) / a3.f.d(j13), a3.f.b(j14) / a3.f.b(j13));
                return androidx.compose.ui.layout.b.a(min2, min2);
        }
    }

    public lh0.n1 c() {
        Function0 function0;
        if (lh0.n1.f83437c == null) {
            switch (this.f125465a) {
                case 12:
                    function0 = lh0.n1.f83438d;
                    break;
                case 17:
                    function0 = g2.f83372d;
                    break;
                default:
                    function0 = lh0.d3.f83330d;
                    break;
            }
            function0.invoke();
            g(n0.f83429l);
        }
        lh0.n1 n1Var = lh0.n1.f83437c;
        if (n1Var != null) {
            return n1Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public g2 d() {
        Function0 function0;
        if (g2.f83371c == null) {
            switch (this.f125465a) {
                case 12:
                    function0 = lh0.n1.f83438d;
                    break;
                case 17:
                    function0 = g2.f83372d;
                    break;
                default:
                    function0 = lh0.d3.f83330d;
                    break;
            }
            function0.invoke();
            g(lh0.a.f83289n);
        }
        g2 g2Var = g2.f83371c;
        if (g2Var != null) {
            return g2Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public Object e(Object obj, rl2.u property) {
        vn2.d thisRef = (vn2.d) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef.f126314a.get(this.f125465a);
    }

    public void g(Function0 function0) {
        switch (this.f125465a) {
            case 12:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                lh0.n1.f83438d = function0;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                g2.f83372d = function0;
                break;
            case 20:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                lh0.d3.f83330d = function0;
                break;
            default:
                Intrinsics.checkNotNullParameter(function0, "<set-?>");
                k4.f83409c = function0;
                break;
        }
    }

    @Override // jn2.f
    public pn2.b0 getType() {
        switch (this.f125465a) {
            case 0:
                throw new IllegalStateException("This method should not be called");
            case 1:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public void h(fo.a protocol, Object obj) {
        byte b13;
        byte b14;
        byte b15;
        int i13;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        byte b23;
        byte b24;
        byte b25;
        byte b26;
        int i14;
        int i15;
        byte b27;
        byte b28;
        byte b29;
        byte b33;
        byte b34;
        byte b35;
        byte b36;
        byte b37;
        byte b38;
        byte b39;
        byte b43;
        byte b44;
        byte b45;
        byte b46;
        byte b47;
        byte b48;
        switch (this.f125465a) {
            case 0:
                i(protocol, obj);
                break;
            case 1:
                j(protocol, obj);
                break;
            case 2:
                k(protocol, obj);
                break;
            case 3:
                l(protocol, obj);
                break;
            case 4:
                m(protocol, obj);
                break;
            case 5:
                a1 struct = (a1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct, "struct");
                fo.b bVar = (fo.b) protocol;
                bVar.getClass();
                Intrinsics.checkNotNullParameter("EventBatch", "structName");
                if (struct.f66829a != null) {
                    protocol.e("events", 1, (byte) 15);
                    Iterator j13 = o.j(struct.f66829a, protocol, (byte) 12);
                    while (j13.hasNext()) {
                        w0.L.h(protocol, (w0) j13.next());
                    }
                }
                Long l13 = struct.f66830b;
                if (l13 != null) {
                    o.r(protocol, "reportTime", 2, (byte) 10, l13);
                }
                bVar.c((byte) 0);
                break;
            case 6:
                n(protocol, obj);
                break;
            case 7:
                x1 struct2 = (x1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct2, "struct");
                fo.b bVar2 = (fo.b) protocol;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter("PinCarouselSlotImpression", "structName");
                if (struct2.f67380a != null) {
                    protocol.e("pinIdStr", 1, (byte) 11);
                    protocol.m(struct2.f67380a);
                }
                Long l14 = struct2.f67381b;
                if (l14 != null) {
                    o.r(protocol, "pinId", 2, (byte) 10, l14);
                }
                String str = struct2.f67382c;
                if (str != null) {
                    b13 = 11;
                    protocol.e("insertionId", 3, (byte) 11);
                    protocol.m(str);
                } else {
                    b13 = 11;
                }
                String str2 = struct2.f67383d;
                if (str2 != null) {
                    protocol.e("imageSignature", 4, b13);
                    protocol.m(str2);
                }
                Long l15 = struct2.f67384e;
                if (l15 != null) {
                    b14 = 10;
                    o.r(protocol, "time", 5, (byte) 10, l15);
                } else {
                    b14 = 10;
                }
                Long l16 = struct2.f67385f;
                if (l16 != null) {
                    b15 = 6;
                    o.r(protocol, "endTime", 6, b14, l16);
                } else {
                    b15 = 6;
                }
                Integer num = struct2.f67386g;
                if (num != null) {
                    i13 = 8;
                    o.q(protocol, "yPosition", 7, (byte) 8, num);
                } else {
                    i13 = 8;
                }
                Short sh3 = struct2.f67387h;
                if (sh3 != null) {
                    o.s(protocol, "slotIndex", i13, b15, sh3);
                }
                Long l17 = struct2.f67388i;
                if (l17 != null) {
                    b16 = 10;
                    o.r(protocol, "carouselDataId", 9, (byte) 10, l17);
                } else {
                    b16 = 10;
                }
                Long l18 = struct2.f67389j;
                if (l18 != null) {
                    o.r(protocol, "carouselSlotId", b16, b16, l18);
                }
                Long l19 = struct2.f67390k;
                if (l19 != null) {
                    o.r(protocol, "internalItemId", 11, b16, l19);
                }
                bVar2.c((byte) 0);
                break;
            case 8:
                o(protocol, obj);
                break;
            case 9:
                g3 struct3 = (g3) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct3, "struct");
                fo.b bVar3 = (fo.b) protocol;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter("VideoEventData", "structName");
                if (struct3.f67015a != null) {
                    protocol.e("videoIdStr", 1, (byte) 11);
                    protocol.m(struct3.f67015a);
                }
                Long l23 = struct3.f67016b;
                if (l23 != null) {
                    o.r(protocol, "pinId", 2, (byte) 10, l23);
                }
                String str3 = struct3.f67017c;
                if (str3 != null) {
                    b17 = 11;
                    protocol.e("requestId", 3, (byte) 11);
                    protocol.m(str3);
                } else {
                    b17 = 11;
                }
                String str4 = struct3.f67018d;
                if (str4 != null) {
                    protocol.e("insertionId", 4, b17);
                    protocol.m(str4);
                }
                Long l24 = struct3.f67019e;
                if (l24 != null) {
                    b18 = 10;
                    o.r(protocol, "time", 5, (byte) 10, l24);
                } else {
                    b18 = 10;
                }
                Long l25 = struct3.f67020f;
                if (l25 != null) {
                    o.r(protocol, "endTime", 6, b18, l25);
                }
                Long l26 = struct3.f67021g;
                if (l26 != null) {
                    o.r(protocol, "videoTime", 7, b18, l26);
                }
                Long l27 = struct3.f67022h;
                if (l27 != null) {
                    o.r(protocol, "endVideoTime", 8, b18, l27);
                }
                Boolean bool = struct3.f67023i;
                if (bool != null) {
                    protocol.e("isAudible", 9, (byte) 2);
                    ((fo.b) protocol).c(bool.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Double d2 = struct3.f67024j;
                if (d2 != null) {
                    b19 = 4;
                    protocol.e("viewability", 10, (byte) 4);
                    protocol.d(d2.doubleValue());
                } else {
                    b19 = 4;
                }
                Double d13 = struct3.f67025k;
                if (d13 != null) {
                    protocol.e("height", 12, b19);
                    protocol.d(d13.doubleValue());
                }
                Double d14 = struct3.f67026l;
                if (d14 != null) {
                    protocol.e("width", 13, b19);
                    protocol.d(d14.doubleValue());
                }
                Boolean bool2 = struct3.f67027m;
                if (bool2 != null) {
                    protocol.e("autoplay", 14, (byte) 2);
                    ((fo.b) protocol).c(bool2.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Integer num2 = struct3.f67028n;
                if (num2 != null) {
                    b23 = 8;
                    o.q(protocol, "quartile", 15, (byte) 8, num2);
                } else {
                    b23 = 8;
                }
                r3 r3Var = struct3.f67029o;
                if (r3Var != null) {
                    protocol.e("playbackState", 16, b23);
                    protocol.g(r3Var.getValue());
                }
                Map map = struct3.f67030p;
                if (map != null) {
                    protocol.e("viewMetrics", 17, (byte) 13);
                    int size = map.size();
                    fo.b bVar4 = (fo.b) protocol;
                    bVar4.c((byte) 8);
                    bVar4.c((byte) 8);
                    bVar4.g(size);
                    for (Map.Entry entry : map.entrySet()) {
                        v3 v3Var = (v3) entry.getKey();
                        int intValue = ((Number) entry.getValue()).intValue();
                        protocol.g(v3Var.getValue());
                        protocol.g(intValue);
                    }
                }
                Double d15 = struct3.f67031q;
                if (d15 != null) {
                    b24 = 4;
                    protocol.e("quartilePercentValue", 18, (byte) 4);
                    protocol.d(d15.doubleValue());
                } else {
                    b24 = 4;
                }
                Double d16 = struct3.f67032r;
                if (d16 != null) {
                    protocol.e("maxQuartilePercentValue", 19, b24);
                    protocol.d(d16.doubleValue());
                }
                List list = struct3.f67033s;
                if (list != null) {
                    protocol.e("playedVideoTimeIntervals", 20, (byte) 15);
                    Iterator j14 = o.j(list, protocol, (byte) 15);
                    while (j14.hasNext()) {
                        Iterator j15 = o.j((List) j14.next(), protocol, (byte) 8);
                        while (j15.hasNext()) {
                            protocol.g(((Number) j15.next()).intValue());
                        }
                    }
                }
                Map map2 = struct3.f67034t;
                if (map2 != null) {
                    protocol.e("quartilePercentMetrics", 21, (byte) 13);
                    int size2 = map2.size();
                    fo.b bVar5 = (fo.b) protocol;
                    bVar5.c((byte) 8);
                    bVar5.c((byte) 4);
                    bVar5.g(size2);
                    for (Map.Entry entry2 : map2.entrySet()) {
                        v3 v3Var2 = (v3) entry2.getKey();
                        double doubleValue = ((Number) entry2.getValue()).doubleValue();
                        protocol.g(v3Var2.getValue());
                        protocol.d(doubleValue);
                    }
                }
                h32.k4 k4Var = struct3.f67035u;
                if (k4Var != null) {
                    protocol.e("triggerType", 26, (byte) 8);
                    protocol.g(k4Var.getValue());
                }
                Boolean bool3 = struct3.f67036v;
                if (bool3 != null) {
                    protocol.e("isOnWifi", 27, (byte) 2);
                    ((fo.b) protocol).c(bool3.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l28 = struct3.f67037w;
                if (l28 != null) {
                    o.r(protocol, "videoDuration", 28, (byte) 10, l28);
                }
                Integer num3 = struct3.f67038x;
                if (num3 != null) {
                    b25 = 8;
                    o.q(protocol, "windowHeight", 29, (byte) 8, num3);
                } else {
                    b25 = 8;
                }
                Integer num4 = struct3.f67039y;
                if (num4 != null) {
                    o.q(protocol, "windowWidth", 30, b25, num4);
                }
                Boolean bool4 = struct3.f67040z;
                if (bool4 != null) {
                    protocol.e("gridAutoplay", 31, (byte) 2);
                    ((fo.b) protocol).c(bool4.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Boolean bool5 = struct3.A;
                if (bool5 != null) {
                    protocol.e("pinHasClosedCaptions", 32, (byte) 2);
                    ((fo.b) protocol).c(bool5.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Boolean bool6 = struct3.B;
                if (bool6 != null) {
                    protocol.e("closedCaptionsEnabled", 33, (byte) 2);
                    ((fo.b) protocol).c(bool6.booleanValue() ? (byte) 1 : (byte) 0);
                }
                bVar3.c((byte) 0);
                break;
            case 10:
                i3 struct4 = (i3) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct4, "struct");
                fo.b bVar6 = (fo.b) protocol;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter("VideoPerformanceData", "structName");
                if (struct4.f67089a != null) {
                    b26 = 10;
                    protocol.e("overallWatchedDurationMs", 1, (byte) 10);
                    protocol.h(struct4.f67089a.longValue());
                } else {
                    b26 = 10;
                }
                Long l29 = struct4.f67091b;
                if (l29 != null) {
                    o.r(protocol, "averageVideoKbps", 2, b26, l29);
                }
                Double d17 = struct4.f67093c;
                if (d17 != null) {
                    i14 = 4;
                    protocol.e("rebufferRate", 3, (byte) 4);
                    protocol.d(d17.doubleValue());
                } else {
                    i14 = 4;
                }
                Long l33 = struct4.f67095d;
                if (l33 != null) {
                    o.r(protocol, "nativeVideoDurationMs", i14, (byte) 10, l33);
                }
                Short sh4 = struct4.f67097e;
                if (sh4 != null) {
                    i15 = 6;
                    o.s(protocol, "numberOfStalls", 5, (byte) 6, sh4);
                } else {
                    i15 = 6;
                }
                Long l34 = struct4.f67098f;
                if (l34 != null) {
                    b27 = 10;
                    o.r(protocol, "startupTimeMs", i15, (byte) 10, l34);
                } else {
                    b27 = 10;
                }
                Long l35 = struct4.f67099g;
                if (l35 != null) {
                    o.r(protocol, "startupLatencyMs", 7, b27, l35);
                }
                Boolean bool7 = struct4.f67100h;
                if (bool7 != null) {
                    protocol.e("isCellular", 9, (byte) 2);
                    ((fo.b) protocol).c(bool7.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l36 = struct4.f67101i;
                if (l36 != null) {
                    b28 = 10;
                    o.r(protocol, "startupVariantKbps", 10, (byte) 10, l36);
                } else {
                    b28 = 10;
                }
                Long l37 = struct4.f67102j;
                if (l37 != null) {
                    o.r(protocol, "startupObservedKbps", 11, b28, l37);
                }
                Short sh5 = struct4.f67103k;
                if (sh5 != null) {
                    o.s(protocol, "startupVariantWidth", 12, (byte) 6, sh5);
                }
                Long l38 = struct4.f67104l;
                if (l38 != null) {
                    o.r(protocol, "startupVariantWatchedDurationMs", 13, (byte) 10, l38);
                }
                Short sh6 = struct4.f67105m;
                if (sh6 != null) {
                    b29 = 6;
                    o.s(protocol, "startupPlayerWidth", 14, (byte) 6, sh6);
                } else {
                    b29 = 6;
                }
                Short sh7 = struct4.f67106n;
                if (sh7 != null) {
                    o.s(protocol, "startupPlayerHeight", 15, b29, sh7);
                }
                Boolean bool8 = struct4.f67107o;
                if (bool8 != null) {
                    protocol.e("fatalError", 16, (byte) 2);
                    ((fo.b) protocol).c(bool8.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l39 = struct4.f67108p;
                if (l39 != null) {
                    o.r(protocol, "errorCode", 17, (byte) 10, l39);
                }
                String str5 = struct4.f67109q;
                if (str5 != null) {
                    b33 = 11;
                    protocol.e("errorName", 19, (byte) 11);
                    protocol.m(str5);
                } else {
                    b33 = 11;
                }
                String str6 = struct4.f67110r;
                if (str6 != null) {
                    protocol.e("errorReason", 20, b33);
                    protocol.m(str6);
                }
                Long l43 = struct4.f67111s;
                if (l43 != null) {
                    b34 = 10;
                    o.r(protocol, "numSeeks", 21, (byte) 10, l43);
                } else {
                    b34 = 10;
                }
                Long l44 = struct4.f67112t;
                if (l44 != null) {
                    o.r(protocol, "averageSeekWaitDurationMs", 22, b34, l44);
                }
                String str7 = struct4.f67113u;
                if (str7 != null) {
                    b35 = 11;
                    protocol.e("videoUrl", 23, (byte) 11);
                    protocol.m(str7);
                } else {
                    b35 = 11;
                }
                String str8 = struct4.f67114v;
                if (str8 != null) {
                    protocol.e("detailedErrors", 24, b35);
                    protocol.m(str8);
                }
                o3 o3Var = struct4.f67115w;
                if (o3Var != null) {
                    protocol.e("sessionMark", 25, (byte) 8);
                    protocol.g(o3Var.getValue());
                }
                Long l45 = struct4.f67116x;
                if (l45 != null) {
                    o.r(protocol, "downloadedKiloBytes", 26, (byte) 10, l45);
                }
                List list2 = struct4.f67117y;
                if (list2 != null) {
                    protocol.e("segments", 27, (byte) 15);
                    Iterator j16 = o.j(list2, protocol, (byte) 12);
                    while (j16.hasNext()) {
                        s3.f67232k.h(protocol, (s3) j16.next());
                    }
                }
                Long l46 = struct4.f67118z;
                if (l46 != null) {
                    o.r(protocol, "startupVariantHeight", 28, (byte) 10, l46);
                }
                String str9 = struct4.A;
                if (str9 != null) {
                    protocol.e("serverAddress", 30, (byte) 11);
                    protocol.m(str9);
                }
                Short sh8 = struct4.B;
                if (sh8 != null) {
                    o.s(protocol, "numServerAddressChanges", 31, (byte) 6, sh8);
                }
                Double d18 = struct4.C;
                if (d18 != null) {
                    protocol.e("screenPixelScale", 32, (byte) 4);
                    protocol.d(d18.doubleValue());
                }
                String str10 = struct4.D;
                if (str10 != null) {
                    b36 = 11;
                    protocol.e("playbackSessionId", 33, (byte) 11);
                    protocol.m(str10);
                } else {
                    b36 = 11;
                }
                String str11 = struct4.E;
                if (str11 != null) {
                    protocol.e("playerId", 34, b36);
                    protocol.m(str11);
                }
                Short sh9 = struct4.F;
                if (sh9 != null) {
                    o.s(protocol, "slotIndex", 37, (byte) 6, sh9);
                }
                String str12 = struct4.G;
                if (str12 != null) {
                    b37 = 11;
                    protocol.e("networkCarrierName", 38, (byte) 11);
                    protocol.m(str12);
                } else {
                    b37 = 11;
                }
                String str13 = struct4.H;
                if (str13 != null) {
                    protocol.e("networkCarrierType", 39, b37);
                    protocol.m(str13);
                }
                Double d19 = struct4.I;
                if (d19 != null) {
                    protocol.e("audioVolume", 40, (byte) 4);
                    protocol.d(d19.doubleValue());
                }
                Short sh10 = struct4.f67088J;
                if (sh10 != null) {
                    o.s(protocol, "activePlayersCount", 41, (byte) 6, sh10);
                }
                Long l47 = struct4.K;
                if (l47 != null) {
                    b38 = 10;
                    o.r(protocol, "traceId", 43, (byte) 10, l47);
                } else {
                    b38 = 10;
                }
                Long l48 = struct4.L;
                if (l48 != null) {
                    o.r(protocol, "overallBufferDurationMs", 44, b38, l48);
                }
                Long l49 = struct4.M;
                if (l49 != null) {
                    o.r(protocol, "overallPausedDurationMs", 45, b38, l49);
                }
                Boolean bool9 = struct4.N;
                if (bool9 != null) {
                    protocol.e("autoplaying", 46, (byte) 2);
                    ((fo.b) protocol).c(bool9.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Boolean bool10 = struct4.O;
                if (bool10 != null) {
                    protocol.e("videoCached", 49, (byte) 2);
                    ((fo.b) protocol).c(bool10.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l53 = struct4.P;
                if (l53 != null) {
                    o.r(protocol, "maxBitrateAVC", 50, (byte) 10, l53);
                }
                Boolean bool11 = struct4.Q;
                if (bool11 != null) {
                    protocol.e("hardwareDecoderAVC", 51, (byte) 2);
                    ((fo.b) protocol).c(bool11.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (struct4.R != null) {
                    protocol.e("maxBitrateHEVC", 52, (byte) 10);
                    protocol.h(struct4.R.longValue());
                }
                if (struct4.S != null) {
                    protocol.e("hardwareDecoderHEVC", 53, (byte) 2);
                    ((fo.b) protocol).c(struct4.S.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (struct4.T != null) {
                    b39 = 8;
                    protocol.e("maxCodecInstancesAVC", 54, (byte) 8);
                    protocol.g(struct4.T.intValue());
                } else {
                    b39 = 8;
                }
                if (struct4.U != null) {
                    protocol.e("maxCodecInstancesHEVC", 55, b39);
                    protocol.g(struct4.U.intValue());
                }
                if (struct4.V != null) {
                    protocol.e("activeCpuClockSpeed", 59, (byte) 10);
                    protocol.h(struct4.V.longValue());
                }
                if (struct4.W != null) {
                    b43 = 11;
                    protocol.e("cdnName", 60, (byte) 11);
                    protocol.m(struct4.W);
                } else {
                    b43 = 11;
                }
                if (struct4.X != null) {
                    protocol.e("cpuModelName", 61, b43);
                    protocol.m(struct4.X);
                }
                if (struct4.Y != null) {
                    protocol.e("cpuNumOfCores", 62, (byte) 3);
                    protocol.c(struct4.Y.byteValue());
                }
                if (struct4.Z != null) {
                    protocol.e("numDropFrames", 66, (byte) 8);
                    protocol.g(struct4.Z.intValue());
                }
                if (struct4.f67090a0 != null) {
                    protocol.e("wasVideoPreloaded", 67, (byte) 2);
                    ((fo.b) protocol).c(struct4.f67090a0.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (struct4.f67092b0 != null) {
                    protocol.e("videoPreloadingTriggeredBy", 68, (byte) 11);
                    protocol.m(struct4.f67092b0);
                }
                if (struct4.f67094c0 != null) {
                    protocol.e("preloadedDurationMs", 69, (byte) 10);
                    protocol.h(struct4.f67094c0.longValue());
                }
                if (struct4.f67096d0 != null) {
                    protocol.e("performanceClass", 70, (byte) 6);
                    protocol.f(struct4.f67096d0.shortValue());
                }
                bVar6.c((byte) 0);
                break;
            case 11:
                s3 struct5 = (s3) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct5, "struct");
                fo.b bVar7 = (fo.b) protocol;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter("VideoSegment", "structName");
                if (struct5.f67233a != null) {
                    b44 = 6;
                    protocol.e("sourceWidth", 1, (byte) 6);
                    protocol.f(struct5.f67233a.shortValue());
                } else {
                    b44 = 6;
                }
                Short sh11 = struct5.f67234b;
                if (sh11 != null) {
                    o.s(protocol, "sourceHeight", 2, b44, sh11);
                }
                Short sh12 = struct5.f67235c;
                if (sh12 != null) {
                    o.s(protocol, "viewportWidth", 3, b44, sh12);
                }
                Short sh13 = struct5.f67236d;
                if (sh13 != null) {
                    o.s(protocol, "viewportHeight", 4, b44, sh13);
                }
                Long l54 = struct5.f67237e;
                if (l54 != null) {
                    o.r(protocol, "watchedDurationMs", 5, (byte) 10, l54);
                }
                String str14 = struct5.f67238f;
                if (str14 != null) {
                    b45 = 11;
                    protocol.e("uri", 6, (byte) 11);
                    protocol.m(str14);
                } else {
                    b45 = 11;
                }
                String str15 = struct5.f67239g;
                if (str15 != null) {
                    protocol.e("serverAddress", b45, b45);
                    protocol.m(str15);
                }
                Short sh14 = struct5.f67240h;
                if (sh14 != null) {
                    o.s(protocol, "numServerAddressChanges", 12, (byte) 6, sh14);
                }
                Long l55 = struct5.f67241i;
                if (l55 != null) {
                    o.r(protocol, "playbackOffsetMs", 14, (byte) 10, l55);
                }
                String str16 = struct5.f67242j;
                if (str16 != null) {
                    protocol.e("cdnCacheStatus", 16, (byte) 11);
                    protocol.m(str16);
                }
                bVar7.c((byte) 0);
                break;
            case 12:
                e4 struct6 = (e4) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct6, "struct");
                fo.b bVar8 = (fo.b) protocol;
                bVar8.getClass();
                Intrinsics.checkNotNullParameter("VisibleEvent", "structName");
                if (struct6.f66978a != null) {
                    protocol.e("type", 1, (byte) 8);
                    protocol.g(struct6.f66978a.getValue());
                }
                Boolean bool12 = struct6.f66979b;
                if (bool12 != null) {
                    protocol.e("visible", 2, (byte) 2);
                    ((fo.b) protocol).c(bool12.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l56 = struct6.f66980c;
                if (l56 != null) {
                    o.r(protocol, "time", 3, (byte) 10, l56);
                }
                bVar8.c((byte) 0);
                break;
            case 13:
                re2.a struct7 = (re2.a) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct7, "struct");
                fo.b bVar9 = (fo.b) protocol;
                bVar9.getClass();
                Intrinsics.checkNotNullParameter("Annotation", "structName");
                if (struct7.f107690a != null) {
                    protocol.e("timestamp", 1, (byte) 10);
                    protocol.h(struct7.f107690a.longValue());
                }
                String str17 = struct7.f107691b;
                if (str17 != null) {
                    protocol.e("value", 2, (byte) 11);
                    protocol.m(str17);
                }
                re2.i iVar = struct7.f107692c;
                if (iVar != null) {
                    protocol.e("host", 3, (byte) 12);
                    re2.i.f107703e.h(protocol, iVar);
                }
                bVar9.c((byte) 0);
                break;
            case 14:
                re2.g struct8 = (re2.g) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct8, "struct");
                fo.b bVar10 = (fo.b) protocol;
                bVar10.getClass();
                Intrinsics.checkNotNullParameter("BinaryAnnotation", "structName");
                if (struct8.f107699a != null) {
                    b46 = 11;
                    protocol.e("key", 1, (byte) 11);
                    protocol.m(struct8.f107699a);
                } else {
                    b46 = 11;
                }
                wo2.m mVar = struct8.f107700b;
                if (mVar != null) {
                    protocol.e("value", 2, b46);
                    protocol.a(mVar);
                }
                re2.d dVar = struct8.f107701c;
                if (dVar != null) {
                    protocol.e("annotation_type", 3, (byte) 8);
                    protocol.g(dVar.getValue());
                }
                bVar10.c((byte) 0);
                break;
            case 15:
                re2.i struct9 = (re2.i) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct9, "struct");
                fo.b bVar11 = (fo.b) protocol;
                bVar11.getClass();
                Intrinsics.checkNotNullParameter("Endpoint", "structName");
                if (struct9.f107704a != null) {
                    protocol.e("ipv4", 1, (byte) 8);
                    protocol.g(struct9.f107704a.intValue());
                }
                Short sh15 = struct9.f107705b;
                if (sh15 != null) {
                    o.s(protocol, "port", 2, (byte) 6, sh15);
                }
                String str18 = struct9.f107706c;
                if (str18 != null) {
                    b47 = 11;
                    protocol.e("service_name", 3, (byte) 11);
                    protocol.m(str18);
                } else {
                    b47 = 11;
                }
                wo2.m mVar2 = struct9.f107707d;
                if (mVar2 != null) {
                    protocol.e("ipv6", 4, b47);
                    protocol.a(mVar2);
                }
                bVar11.c((byte) 0);
                break;
            case 16:
                re2.j struct10 = (re2.j) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct10, "struct");
                fo.b bVar12 = (fo.b) protocol;
                bVar12.getClass();
                Intrinsics.checkNotNullParameter("Span", "structName");
                if (struct10.f107709a != null) {
                    protocol.e("trace_id", 1, (byte) 10);
                    protocol.h(struct10.f107709a.longValue());
                }
                String str19 = struct10.f107710b;
                if (str19 != null) {
                    protocol.e("name", 3, (byte) 11);
                    protocol.m(str19);
                }
                Long l57 = struct10.f107711c;
                if (l57 != null) {
                    b48 = 10;
                    o.r(protocol, "id", 4, (byte) 10, l57);
                } else {
                    b48 = 10;
                }
                Long l58 = struct10.f107712d;
                if (l58 != null) {
                    o.r(protocol, "parent_id", 5, b48, l58);
                }
                List list3 = struct10.f107713e;
                if (list3 != null) {
                    protocol.e("annotations", 6, (byte) 15);
                    Iterator j17 = o.j(list3, protocol, (byte) 12);
                    while (j17.hasNext()) {
                        re2.a.f107689d.h(protocol, (re2.a) j17.next());
                    }
                }
                List list4 = struct10.f107714f;
                if (list4 != null) {
                    protocol.e("binary_annotations", 8, (byte) 15);
                    Iterator j18 = o.j(list4, protocol, (byte) 12);
                    while (j18.hasNext()) {
                        re2.g.f107698d.h(protocol, (re2.g) j18.next());
                    }
                }
                Boolean bool13 = struct10.f107715g;
                if (bool13 != null) {
                    protocol.e("debug", 9, (byte) 2);
                    ((fo.b) protocol).c(bool13.booleanValue() ? (byte) 1 : (byte) 0);
                }
                Long l59 = struct10.f107716h;
                if (l59 != null) {
                    o.r(protocol, "timestamp", 10, (byte) 10, l59);
                }
                Long l63 = struct10.f107717i;
                if (l63 != null) {
                    o.r(protocol, "duration", 11, (byte) 10, l63);
                }
                Long l64 = struct10.f107718j;
                if (l64 != null) {
                    o.r(protocol, "trace_id_high", 12, (byte) 10, l64);
                }
                bVar12.c((byte) 0);
                break;
            default:
                re2.k struct11 = (re2.k) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct11, "struct");
                fo.b bVar13 = (fo.b) protocol;
                bVar13.getClass();
                Intrinsics.checkNotNullParameter("Spans", "structName");
                if (struct11.f107720a != null) {
                    protocol.e("spans", 1, (byte) 15);
                    Iterator j19 = o.j(struct11.f107720a, protocol, (byte) 12);
                    while (j19.hasNext()) {
                        re2.j.f107708k.h(protocol, (re2.j) j19.next());
                    }
                }
                bVar13.c((byte) 0);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, int i14) {
        this(0);
        this.f125465a = i13;
        if (i13 == 1) {
            this(1);
            return;
        }
        switch (i13) {
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
