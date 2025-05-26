package dh0;

import i1.a1;
import i32.j;
import i32.l;
import i32.w0;
import i32.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import m60.e;
import m60.w;
import pg0.y;
import pm.k;
import pm.m;
import rg0.n;
import rg0.o;
import rg0.p;
import rg0.q;
import rg0.r;
import rg0.s;
import tb0.g;
import tb0.h;
import ug0.i;
import uj2.a0;
import uj2.b0;
import x02.a2;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: b, reason: collision with root package name */
    public final i f54983b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f54984c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f54985d;

    /* renamed from: e, reason: collision with root package name */
    public final w f54986e;

    /* renamed from: f, reason: collision with root package name */
    public final e f54987f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f54988g;

    public d(i _experiencesApi, HashMap _userExperiences, HashMap _userMultiExperiences, w _eventManager, e _applicationInfoProvider) {
        Intrinsics.checkNotNullParameter(_experiencesApi, "_experiencesApi");
        Intrinsics.checkNotNullParameter(_userExperiences, "_userExperiences");
        Intrinsics.checkNotNullParameter(_userMultiExperiences, "_userMultiExperiences");
        Intrinsics.checkNotNullParameter(_eventManager, "_eventManager");
        Intrinsics.checkNotNullParameter(_applicationInfoProvider, "_applicationInfoProvider");
        this.f54983b = _experiencesApi;
        this.f54984c = _userExperiences;
        this.f54985d = _userMultiExperiences;
        this.f54986e = _eventManager;
        this.f54987f = _applicationInfoProvider;
        HashMap hashMap = new HashMap();
        this.f54988g = hashMap;
        hashMap.put(o.CONTEXT_APP_LAUNCH_SESSION_ID.getValue(), UUID.randomUUID().toString());
    }

    public static void e(n nVar, y0 y0Var) {
        String name = y0Var.name();
        if (nVar == null) {
            HashSet hashSet = h.f117076w;
            g.f117075a.s(name, null);
            return;
        }
        int i13 = nVar.f108060b;
        l.Companion.getClass();
        l a13 = j.a(i13);
        if (a13 == null) {
            HashSet hashSet2 = h.f117076w;
            g.f117075a.s(name, null);
        } else {
            HashSet hashSet3 = h.f117076w;
            g.f117075a.s(name, a13.name());
        }
    }

    public final void a() {
        this.f54984c.clear();
        this.f54986e.d(new r(null));
    }

    public final n b(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return (n) this.f54984c.get(placement);
    }

    public final n c(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        n b13 = b(placement);
        if (b13 != null) {
            k(placement);
        }
        return b13;
    }

    public final void d(vd0.c cVar, boolean z13) {
        n f13;
        w wVar = this.f54986e;
        if (z13) {
            pm.l lVar = (pm.l) cVar.f125623a.f91366a.entrySet();
            HashMap hashMap = new HashMap(lVar.size());
            Iterator it = lVar.iterator();
            while (((m) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((k) it).next();
                hashMap.put((String) entry.getKey(), new vd0.a(((nm.s) entry.getValue()).f()));
            }
            Intrinsics.checkNotNullExpressionValue(hashMap, "optArrayMap(...)");
            for (String str : hashMap.keySet()) {
                vd0.a aVar = (vd0.a) hashMap.get(str);
                w0 w0Var = y0.Companion;
                Intrinsics.f(str);
                int parseInt = Integer.parseInt(str);
                w0Var.getClass();
                y0 a13 = w0.a(parseInt);
                if (a13 != null) {
                    ArrayList arrayList = new ArrayList();
                    Intrinsics.f(aVar);
                    Iterator it2 = aVar.iterator();
                    while (it2.hasNext()) {
                        n f14 = n.f((vd0.c) it2.next());
                        if (f14 != null) {
                            arrayList.add(f14);
                            e(f14, a13);
                        }
                    }
                    this.f54985d.put(a13, arrayList);
                    wVar.d(new r(a13));
                }
            }
            return;
        }
        HashMap l13 = cVar.l();
        Intrinsics.checkNotNullExpressionValue(l13, "optJsonMap(...)");
        boolean z14 = false;
        for (String str2 : l13.keySet()) {
            vd0.c cVar2 = (vd0.c) l13.get(str2);
            w0 w0Var2 = y0.Companion;
            Intrinsics.f(str2);
            int parseInt2 = Integer.parseInt(str2);
            w0Var2.getClass();
            y0 a14 = w0.a(parseInt2);
            if (a14 != null && (f13 = n.f(cVar2)) != null) {
                this.f54984c.put(a14, f13);
                e(f13, a14);
                wVar.d(new r(a14));
                y0 y0Var = y0.ANDROID_PIN_GRID_ATTRIBUTION;
                int i13 = f13.f108060b;
                if (y0Var == a14) {
                    k(a14);
                    if (i13 == l.ANDROID_IMAGE_ONLY_PIN_GRID.value()) {
                        f13.g();
                        wVar.d(new pg0.w());
                    }
                } else if (y0.ANDROID_MAIN_USER_ED == a14 || y0.ANDROID_GLOBAL_NAG == a14) {
                    if (i13 != l.ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER.value()) {
                        wVar.d(new p(a14));
                        z14 = true;
                    }
                } else if (y0.ANDROID_HOME_FEED_TAKEOVER_AFTER_SCROLL == a14) {
                    wVar.f(new y(str2));
                } else if (y0.ANDROID_APP_TAKEOVER == a14) {
                    wVar.d(new p(a14));
                } else if (y0.ANDROID_BUSINESS_HUB_RESOURCE_CARDS_MODULE == a14 || y0.ANDROID_BUSINESS_HUB_ACTION_CARDS_MODULE == a14 || y0.ANDROID_BUSINESS_HUB_STORY_PINS_ADOPTION == a14) {
                    wVar.d(new p(a14));
                }
            }
        }
        if (z14) {
            return;
        }
        wVar.d(new q(y0.ANDROID_MAIN_USER_ED));
    }

    public final void f() {
        ((m60.d) this.f54987f).g();
        tg0.c cVar = new tg0.c(true, false);
        i iVar = this.f54983b;
        pn.c g13 = iVar.g(cVar);
        a0 a0Var = tk2.e.f118017c;
        x H = g13.H(a0Var);
        ug0.d dVar = new ug0.d(4, b.f54973j);
        ug0.d dVar2 = new ug0.d(5, b.f54974k);
        ck2.c cVar2 = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        H.F(dVar, dVar2, cVar2, a2Var);
        this.f54985d.clear();
        tg0.c sideEffect = new tg0.c(true, true);
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        String p13 = com.bumptech.glide.c.p1(((d) iVar.i()).f54988g);
        ((m60.d) iVar.f122137b).g();
        b0<vd0.c> e13 = iVar.f122136a.e(p13, null);
        ir.j jVar = new ir.j(16, new ug0.h(iVar, sideEffect, 1));
        e13.getClass();
        pn.c cVar3 = new pn.c(1, e13, jVar);
        Intrinsics.checkNotNullExpressionValue(cVar3, "flatMapObservable(...)");
        cVar3.H(a0Var).F(new ug0.d(6, b.f54975l), new ug0.d(7, b.f54976m), cVar2, a2Var);
    }

    public final uj2.q g(y0 placement, Map map, nl.b sideEffect) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        return h(placement, map, true, sideEffect);
    }

    public final uj2.q h(y0 placement, Map map, boolean z13, nl.b sideEffect) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        y0[] placements = {placement};
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        ((m60.d) this.f54987f).g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(placements[0].value()));
        uj2.q t13 = this.f54983b.h(arrayList, map, z13, tg0.d.f117578b).t(new ir.j(18, new a1(placements, this, sideEffect, 8)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    public final void i(y0 placement, Map map) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        g(placement, map, new tg0.c(false, false)).H(tk2.e.f118017c).F(new a(0, c.f54978j), new a(1, c.f54979k), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final n j(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        n nVar = (n) this.f54984c.remove(placement);
        e(null, placement);
        this.f54986e.d(new r(placement));
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r4 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(i32.y0 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "placement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            rg0.n r11 = r10.b(r11)
            if (r11 == 0) goto Lbc
            vd0.a r0 = r11.f108059a
            if (r0 == 0) goto Lbc
            int r1 = r0.d()
            if (r1 != 0) goto L17
            goto Lbc
        L17:
            int r1 = r0.d()
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r1) goto Lbc
            java.lang.String r4 = r0.l(r3)     // Catch: java.lang.Exception -> L60
            r5 = 1
            if (r4 == 0) goto L72
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = ":"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L60
            java.util.List r4 = r6.f(r2, r4)     // Catch: java.lang.Exception -> L60
            if (r4 == 0) goto L72
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Exception -> L60
            if (r6 != 0) goto L62
            int r6 = r4.size()     // Catch: java.lang.Exception -> L60
            java.util.ListIterator r6 = r4.listIterator(r6)     // Catch: java.lang.Exception -> L60
        L41:
            boolean r7 = r6.hasPrevious()     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L62
            java.lang.Object r7 = r6.previous()     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L60
            int r7 = r7.length()     // Catch: java.lang.Exception -> L60
            if (r7 != 0) goto L54
            goto L41
        L54:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> L60
            int r6 = r6.nextIndex()     // Catch: java.lang.Exception -> L60
            int r6 = r6 + r5
            java.util.List r4 = kotlin.collections.CollectionsKt.y0(r4, r6)     // Catch: java.lang.Exception -> L60
            goto L64
        L60:
            r4 = move-exception
            goto Lb1
        L62:
            kotlin.collections.q0 r4 = kotlin.collections.q0.f80391a     // Catch: java.lang.Exception -> L60
        L64:
            if (r4 == 0) goto L72
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Exception -> L60
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L60
            java.lang.Object[] r4 = r4.toArray(r6)     // Catch: java.lang.Exception -> L60
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Exception -> L60
            if (r4 != 0) goto L74
        L72:
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L60
        L74:
            int r6 = r4.length     // Catch: java.lang.Exception -> L60
            r7 = 2
            if (r6 != r7) goto Lb8
            vd0.c r6 = r11.f108072n     // Catch: java.lang.Exception -> L60
            if (r6 == 0) goto L89
            java.util.HashMap r6 = r6.l()     // Catch: java.lang.Exception -> L60
            r8 = r4[r5]     // Catch: java.lang.Exception -> L60
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Exception -> L60
            vd0.c r6 = (vd0.c) r6     // Catch: java.lang.Exception -> L60
            goto L8a
        L89:
            r6 = 0
        L8a:
            ug0.i r8 = r10.f54983b     // Catch: java.lang.Exception -> L60
            r9 = r4[r2]     // Catch: java.lang.Exception -> L60
            r4 = r4[r5]     // Catch: java.lang.Exception -> L60
            uj2.q r4 = r8.k(r9, r4, r6)     // Catch: java.lang.Exception -> L60
            uj2.a0 r5 = tk2.e.f118017c     // Catch: java.lang.Exception -> L60
            jk2.x r4 = r4.H(r5)     // Catch: java.lang.Exception -> L60
            dh0.c r5 = dh0.c.f54980l     // Catch: java.lang.Exception -> L60
            dh0.a r6 = new dh0.a     // Catch: java.lang.Exception -> L60
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L60
            dh0.c r5 = dh0.c.f54981m     // Catch: java.lang.Exception -> L60
            dh0.a r7 = new dh0.a     // Catch: java.lang.Exception -> L60
            r8 = 3
            r7.<init>(r8, r5)     // Catch: java.lang.Exception -> L60
            ck2.c r5 = ck2.i.f27923c     // Catch: java.lang.Exception -> L60
            x02.a2 r8 = ck2.i.f27924d     // Catch: java.lang.Exception -> L60
            r4.F(r6, r7, r5, r8)     // Catch: java.lang.Exception -> L60
            goto Lb8
        Lb1:
            java.util.HashSet r5 = tb0.h.f117076w
            tb0.h r5 = tb0.g.f117075a
            r5.p(r4)
        Lb8:
            int r3 = r3 + 1
            goto L1d
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dh0.d.k(i32.y0):void");
    }
}
