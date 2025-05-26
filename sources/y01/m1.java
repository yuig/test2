package y01;

import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class m1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final nx.d1 f136439b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.b0 f136440c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f136441d;

    public m1(rw1.f screenPagerStateTransformer, nx.d1 trackingParamAttacher, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(screenPagerStateTransformer, "screenPagerStateTransformer");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f136439b = trackingParamAttacher;
        this.f136440c = pinAuxHelper;
        this.f136441d = b(screenPagerStateTransformer, new kotlin.jvm.internal.d0() { // from class: y01.i1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((h0) obj).f136412a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: y01.j1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n1) obj).f136448f;
            }
        }, k1.f136427i);
    }

    public static String h(l82.e eVar) {
        Object obj;
        h42.a aVar = ((h0) eVar.f82218a).f136412a;
        Set set = aVar.f67640a;
        int i13 = aVar.f67641b;
        Set set2 = set;
        Intrinsics.checkNotNullParameter(set2, "<this>");
        if (set2 instanceof List) {
            obj = CollectionsKt.U(i13, (List) set2);
        } else {
            if (i13 >= 0) {
                int i14 = 0;
                for (Object obj2 : set2) {
                    int i15 = i14 + 1;
                    if (i13 == i14) {
                        obj = obj2;
                        break;
                    }
                    i14 = i15;
                }
            }
            obj = null;
        }
        Navigation navigation = (Navigation) obj;
        if (navigation == null) {
            return "";
        }
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        return f49940b;
    }

    public static String i(z zVar) {
        if (!df.j1.d1(zVar.f136505b) || !df.j1.d1(zVar.f136506c)) {
            return null;
        }
        String replace = new Regex("(?<=[?&;])bookmark=.*?($|[&;])").replace(zVar.f136505b, "");
        if (replace == null || !StringsKt.E(replace, "item_count=", false)) {
            return replace;
        }
        int size = zVar.f136504a.size();
        qb0.e eVar = qb0.d.f103396a;
        return qb0.e.f(replace, "item_count", String.valueOf(size));
    }

    public static int j(l82.e eVar, int i13, float f13) {
        int i14 = ((h0) eVar.f82218a).f136412a.f67641b;
        Integer valueOf = Integer.valueOf(i14);
        Intrinsics.checkNotNullParameter(valueOf, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(valueOf);
        int size = byteArrayOutputStream.size();
        l82.i0 i0Var = eVar.f82219b;
        int i15 = ((n1) i0Var).f136453k;
        if (i15 >= 0 && f13 < 1.0E-4f) {
            return i15;
        }
        if ((i14 <= i13 || i13 < 0) && ((i14 >= i13 || i13 >= size) && (i13 = i14 + 1) >= size)) {
            i13 = -1;
        }
        return i13 != -1 ? i13 : ((n1) i0Var).f136453k;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 c(l82.i0 r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y01.m1.c(l82.i0):l82.c0");
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        String str;
        String str2;
        boolean z13 = false;
        byte b13 = 0;
        y0 event = (y0) sVar;
        h0 priorDisplayState = (h0) oVar;
        n1 priorVMState = (n1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        int i13 = 16;
        if (event instanceof x0) {
            x0 x0Var = (x0) event;
            h42.d event2 = x0Var.f136502a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f136441d;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
            h42.d dVar = x0Var.f136502a;
            if (dVar instanceof h42.c) {
                if (!((n1) resultBuilder.f82219b).f136449g) {
                    int size = ((h0) resultBuilder.f82218a).f136412a.f67640a.size();
                    int i14 = ((h0) resultBuilder.f82218a).f136412a.f67641b;
                    n1 n1Var = (n1) resultBuilder.f82219b;
                    int i15 = n1Var.f136450h;
                    if (size > i15 && i14 >= size - i15 && i(n1Var.f136443a) != null) {
                        resultBuilder.h(g1.f136404k);
                        String i16 = i(((n1) resultBuilder.f82219b).f136443a);
                        if (i16 != null) {
                            String str3 = StringsKt.E(i16, "?", false) ? "&bookmark=" : "?bookmark=";
                            resultBuilder.h(new zu0.c(i16, i13));
                            String str4 = ((n1) resultBuilder.f82219b).f136443a.f136506c;
                            if (str4 != null) {
                                resultBuilder.a(new j(i16, str3, str4));
                            }
                        }
                    }
                }
                int i17 = ((h42.c) dVar).f67647a;
                resultBuilder.d(b.f136384a);
                kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                if (!((n1) resultBuilder.f82219b).f136446d) {
                    j0Var.f80434a = Integer.valueOf(j(resultBuilder, i17, 1.0f));
                }
                int i18 = ((h0) resultBuilder.f82218a).f136412a.f67641b;
                a11.u uVar = i18 == i17 ? null : i18 < i17 ? new a11.u("right", 1 + i17, i17 - 2) : new a11.u("left", i17 - 1, i17 + 2);
                if (uVar == null || (str2 = uVar.f357a) == null) {
                    str2 = "";
                }
                String uid = ((f30) ((n1) resultBuilder.f82219b).f136443a.f136504a.get(((h0) resultBuilder.f82218a).f136412a.f67641b)).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                h32.i0 source = ((n1) resultBuilder.f82219b).f136455m.generateLoggingContext();
                if (source != null) {
                    HashMap contents = new HashMap();
                    contents.put("mobile_p2p_swipe_direction", str2);
                    Intrinsics.checkNotNullParameter(contents, "contents");
                    Intrinsics.checkNotNullParameter(source, "source");
                    resultBuilder.a(new r1(new zy.f0(new zy.a(new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.NAVIGATION, source.f67085e, source.f67086f), h32.f1.SWIPE, uid, new HashMap(contents), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
                }
                resultBuilder.f(new ky0.b(i13, j0Var, uVar));
            } else if (dVar instanceof h42.b) {
                h42.b bVar = (h42.b) dVar;
                int i19 = bVar.f67644a;
                if (((h0) resultBuilder.f82218a).f136412a.f67640a.size() > 1) {
                    float f13 = bVar.f67645b;
                    int j13 = j(resultBuilder, i19, f13);
                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                    int i23 = ((n1) resultBuilder.f82219b).f136454l;
                    h0Var.f80426a = i23;
                    int i24 = ((h0) resultBuilder.f82218a).f136412a.f67641b;
                    kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
                    kotlin.jvm.internal.j0 j0Var3 = new kotlin.jvm.internal.j0();
                    if (i19 == i23 && f13 > 0.5f) {
                        int i25 = 1 + i19;
                        h0Var.f80426a = i25;
                        j0Var2.f80434a = Integer.valueOf(i25);
                        j0Var3.f80434a = Integer.valueOf(i19);
                    } else if (i19 == i23 - 1 && f13 < 0.5f) {
                        h0Var.f80426a = i19;
                        j0Var2.f80434a = Integer.valueOf(i19);
                        j0Var3.f80434a = Integer.valueOf(1 + i19);
                    }
                    resultBuilder.f(new p1.a(i24, j13, j0Var2, j0Var3, i19, f13, bVar.f67646c));
                    resultBuilder.h(new rq.a0(h0Var, j13, resultBuilder, 5));
                }
            }
        } else if (event instanceof u0) {
            Set set = ((h0) resultBuilder.f82218a).f136412a.f67640a;
            int size2 = ((n1) resultBuilder.f82219b).f136443a.f136504a.size();
            if (set.size() == 1 && size2 > 1) {
                k(resultBuilder);
                resultBuilder.d(h.f136411a);
            }
        } else if (event instanceof o0) {
            if (Intrinsics.d(h(resultBuilder), ((o0) event).f136467a)) {
                resultBuilder.f(g1.f136408o);
            }
            Set set2 = ((h0) resultBuilder.f82218a).f136412a.f67640a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                if (!Intrinsics.d(((Navigation) obj).getF49940b(), r5.f136467a)) {
                    arrayList.add(obj);
                }
            }
            resultBuilder.f(new w1.g(arrayList, i13));
        } else {
            boolean z14 = event instanceof i0;
            g1 g1Var = g1.f136406m;
            if (z14) {
                resultBuilder.f(g1Var);
            } else if (event instanceof y) {
                PinFeed pinFeed = ((y) event).f136503a;
                resultBuilder.h(g1.f136403j);
                resultBuilder.h(new rx0.f(this, ((n1) resultBuilder.f82219b).f136443a, pinFeed, 4));
                List items = pinFeed.q();
                Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                String str5 = ((n1) resultBuilder.f82219b).f136444b;
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList f14 = a11.w.f(str5, items, false);
                String str6 = ((n1) resultBuilder.f82219b).f136444b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(f14, 10));
                Iterator it = f14.iterator();
                while (it.hasNext()) {
                    f30 f30Var = (f30) it.next();
                    n1 n1Var2 = (n1) resultBuilder.f82219b;
                    arrayList2.add(g(f30Var, str6, n1Var2.f136447e, n1Var2.f136445c));
                }
                resultBuilder.f(new h1(b13 == true ? 1 : 0, kotlin.collections.i1.i(CollectionsKt.I0(((h0) resultBuilder.f82218a).f136412a.f67640a), arrayList2)));
            } else if (event instanceof x) {
                resultBuilder.h(g1.f136407n);
                Throwable th3 = ((x) event).f136501a;
                if (((n1) resultBuilder.f82219b).f136452j && !(th3 instanceof CancellationException)) {
                    resultBuilder.a(new l(th3, "Swipe and load more pins from API is not working", tb0.p.PDP));
                }
            } else if (event instanceof t0) {
                String str7 = ((n1) resultBuilder.f82219b).f136451i;
                String h10 = h(resultBuilder);
                NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.g0.f50804b.getValue(), str7, ml1.b.NO_TRANSITION.getValue());
                L.m0("com.pinterest.EXTRA_PIN_ID", h10);
                resultBuilder.a(new b1(new al1.a(L)));
            } else if (event instanceof l0) {
                resultBuilder.h(new dx0.d((l0) event, 29));
            } else if (event instanceof j0) {
                j0 j0Var4 = (j0) event;
                boolean z15 = j0Var4.f136421a;
                int size3 = ((h0) resultBuilder.f82218a).f136412a.f67640a.size();
                if (size3 == 0) {
                    int size4 = ((n1) resultBuilder.f82219b).f136443a.f136504a.size();
                    resultBuilder.a(new m(z15, Integer.valueOf(size3), Integer.valueOf(size4), Integer.valueOf(size4)));
                    resultBuilder.f(g1.f136405l);
                }
                if (j0Var4.f136422b || j0Var4.f136423c) {
                    resultBuilder.d(q.f136473a, t.f136494a);
                }
            } else if (event instanceof n0) {
                Navigation navigation = ((n0) event).f136442a;
                if ((!((h0) resultBuilder.f82218a).f136412a.f67640a.isEmpty()) && navigation != null) {
                    resultBuilder.a(new c1(navigation));
                }
            } else if (event instanceof k0) {
                f30 f30Var2 = ((k0) event).f136426a;
                String uid2 = f30Var2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                resultBuilder.d(new a(uid2, b40.g(f30Var2)));
            } else if (event instanceof w0) {
                int i26 = f1.f136401a[((w0) event).f136500a.ordinal()];
                if (i26 == 1) {
                    z13 = true;
                } else if (i26 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.f(new dv0.n(z13, i13));
            } else if (event instanceof v0) {
                String str8 = ((v0) event).f136499a;
                if (!kotlin.text.z.j(str8)) {
                    resultBuilder.a(new u(str8));
                }
            } else if (event instanceof m0) {
                resultBuilder.a(v.f136498a);
            } else if (event instanceof s0) {
                s0 s0Var = (s0) event;
                if (!s0Var.f136493b && (str = s0Var.f136492a) != null) {
                    resultBuilder.a(new p(str));
                    if (str.length() > 0) {
                        resultBuilder.a(new r(h(resultBuilder)));
                    }
                }
            } else if (event instanceof r0) {
                f30 f30Var3 = ((r0) event).f136489a;
                resultBuilder.h(new zp.u0(9, f30Var3));
                h32.i0 generateLoggingContext = ((n1) resultBuilder.f82219b).f136455m.generateLoggingContext();
                if (generateLoggingContext != null) {
                    resultBuilder.a(new r1(new zy.e0(new zy.a(generateLoggingContext, h32.f1.PIN_SCREENSHOT, f30Var3.getUid(), this.f136440c.m(f30Var3), null, null, true, false, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN))));
                }
                boolean z16 = ((n1) resultBuilder.f82219b).f136456n;
                if (z16) {
                    resultBuilder.a(z0.f136510a);
                }
                resultBuilder.f(new dv0.n(z16, 15));
            } else if (event instanceof q0) {
                boolean z17 = ((q0) event).f136474a;
                resultBuilder.f(g1Var);
                f30 f30Var4 = ((n1) resultBuilder.f82219b).f136457o;
                if (!z17 && f30Var4 != null) {
                    resultBuilder.a(new s(f30Var4));
                }
                resultBuilder.h(g1.f136409p);
            } else if (event instanceof p0) {
                Throwable th4 = ((p0) event).f136470a;
                if (((n1) resultBuilder.f82219b).f136452j && !(th4 instanceof CancellationException)) {
                    resultBuilder.a(new l(th4, "Error in screenshotPin", tb0.p.PDP));
                }
            }
        }
        return resultBuilder.e();
    }

    public final NavigationImpl g(f30 pin, String str, o oVar, boolean z13) {
        String str2;
        ArrayList arrayList = oVar.f136464g;
        Intrinsics.checkNotNullParameter(pin, "pin");
        nx.d1 trackingParamAttacher = this.f136439b;
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        NavigationImpl r03 = Navigation.r0((ScreenLocation) com.pinterest.screens.g0.f50806d.getValue(), pin);
        r03.m0("com.pinterest.EXTRA_SOURCE_QUERY", oVar.f136458a);
        r03.Y1("com.pinterest.EXTRA_NAVIGATION_FROM_FEED", Intrinsics.d(str, pin.getUid()));
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (uid.length() > 0) {
            TrackingParamKeyBuilder trackingParamKeyBuilder = oVar.f136459b;
            if (trackingParamKeyBuilder != null) {
                String pinId = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                str2 = trackingParamAttacher.f(new nx.e1(trackingParamKeyBuilder.f35482b, trackingParamKeyBuilder.f35481a, pinId, trackingParamKeyBuilder.f35483c));
            } else {
                str2 = null;
            }
            if (df.j1.U0(str2)) {
                r03.m0("com.pinterest.TRACKING_PARAMETER", str2);
            }
        }
        r03.m0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", oVar.f136461d);
        r03.z(oVar.f136463f, "com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH");
        r03.d("com.pinterest.EXTRA_CONTEXT_PIN_IDS", arrayList);
        r03.Y1("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", oVar.f136465h);
        r03.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", oVar.f136466i);
        r03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", oVar.f136462e);
        Intrinsics.checkNotNullParameter(pin, "pin");
        r03.Y1("com.pinterest.EXCLUDE_AD", z13 && !b40.w0(pin));
        Intrinsics.checkNotNullExpressionValue(r03, "apply(...)");
        return r03;
    }

    public final void k(l82.e eVar) {
        n1 n1Var = (n1) eVar.f82219b;
        z zVar = n1Var.f136443a;
        String str = n1Var.f136444b;
        List items = zVar.f136504a;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList f13 = a11.w.f(str, items, false);
        Iterator it = f13.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((f30) it.next()).getUid(), str)) {
                break;
            } else {
                i13++;
            }
        }
        Integer valueOf = Integer.valueOf(i13);
        if (i13 < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        String str2 = ((n1) eVar.f82219b).f136444b;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(f13, 10));
        Iterator it2 = f13.iterator();
        while (it2.hasNext()) {
            f30 f30Var = (f30) it2.next();
            n1 n1Var2 = (n1) eVar.f82219b;
            arrayList.add(g(f30Var, str2, n1Var2.f136447e, n1Var2.f136445c));
        }
        eVar.f(new xs0.k(intValue, 1, arrayList));
        eVar.h(new zx0.d(intValue, 3));
    }
}
