package dv0;

import a.k1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import c72.z;
import com.pinterest.partnerAnalytics.components.experiencebanner.AnalyticsExperienceBanner;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import do2.a2;
import do2.t2;
import do2.u2;
import g72.a0;
import g72.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Logger;
import jc0.s;
import kh2.m0;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import m60.w;
import r72.i1;
import r72.k0;
import r72.q1;
import rg0.o0;
import rg0.p0;
import ro2.u;
import so.oa;
import so.r8;
import v90.e0;
import x02.i2;
import x62.t;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56380a;

    /* renamed from: b, reason: collision with root package name */
    public Object f56381b;

    /* renamed from: c, reason: collision with root package name */
    public Object f56382c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f56383d;

    /* renamed from: e, reason: collision with root package name */
    public Object f56384e;

    public q(int i13) {
        this.f56380a = i13;
        if (i13 == 9) {
            this.f56381b = xi2.b.f135068a;
            return;
        }
        t2 a13 = u2.a(new x62.p());
        this.f56381b = a13;
        this.f56382c = new a2(a13);
        s62.a aVar = new s62.a();
        this.f56383d = aVar;
        this.f56384e = aVar.f111248b;
    }

    public final yi2.d a() {
        nj2.m mVar = (nj2.m) this.f56382c;
        if (mVar == null) {
            Logger logger = nj2.m.f91035d;
            nj2.o oVar = new nj2.o();
            zi2.b bVar = oVar.f91042b;
            nj2.f fVar = oVar.f91043c;
            mj2.a aVar = oVar.f91044d;
            Supplier supplier = oVar.f91045e;
            rj2.d dVar = oVar.f91046f;
            ArrayList arrayList = oVar.f91041a;
            kv0.p pVar = oVar.f91047g;
            pVar.getClass();
            mVar = new nj2.m(bVar, fVar, aVar, supplier, dVar, arrayList, new aj2.i(pVar));
        }
        fj2.d dVar2 = (fj2.d) this.f56383d;
        if (dVar2 == null) {
            Logger logger2 = fj2.d.f62264h;
            mj2.a aVar2 = mj2.a.f87281e;
            dVar2 = new fj2.d(new ArrayList(), new IdentityHashMap(), new ArrayList(), aVar2, ij2.b.f72382a, new aj2.i(aj2.h.q()));
        }
        bj2.k kVar = (bj2.k) this.f56384e;
        if (kVar == null) {
            Logger logger3 = bj2.k.f23003e;
            kVar = new bj2.k(mj2.a.f87281e, new bg.b(2), new ArrayList(), zi2.d.f142042a, new aj2.i(aj2.h.q()));
        }
        return new yi2.d(mVar, dVar2, kVar, (xi2.a) this.f56381b);
    }

    public final jv0.i b(aq.j jVar) {
        if ((jVar instanceof aq.c ? (aq.c) jVar : null) != null) {
            r8 r8Var = ((so.d) this.f56381b).f113377a;
            Context context = (Context) r8Var.f114090a.f113902s0.get();
            oa oaVar = r8Var.f114090a;
            return new kv0.i(jVar, context, (i2) oaVar.F3.get(), (h22.c) r8Var.f114091b.f114364k5.get(), (s1) oaVar.f113718h8.get());
        }
        if ((jVar instanceof aq.m ? (aq.m) jVar : null) != null) {
            r8 r8Var2 = ((so.e) this.f56382c).f113394a;
            return new kv0.c(jVar, (Context) r8Var2.f114090a.f113902s0.get(), (i2) r8Var2.f114090a.F3.get());
        }
        so.f fVar = (so.f) this.f56383d;
        String d2 = ((ag1.b) this.f56384e).d();
        r8 r8Var3 = fVar.f113409a;
        Context context2 = (Context) r8Var3.f114090a.f113902s0.get();
        oa oaVar2 = r8Var3.f114090a;
        return new kv0.c(d2, context2, (i2) oaVar2.F3.get(), (i22.d) oaVar2.X7.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.q.c():void");
    }

    public final rg0.n d() {
        switch (this.f56380a) {
        }
        return (rg0.n) ((xk2.k) this.f56384e).getValue();
    }

    public final String e() {
        return (String) this.f56381b;
    }

    public final void f(m0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        final int i13 = 1;
        if (Intrinsics.d(action, x62.m.f133988c)) {
            final EditMaskImageView editMaskImageView = (EditMaskImageView) this.f56381b;
            editMaskImageView.getClass();
            final x62.h hVar = new x62.h(editMaskImageView, 2);
            x62.k kVar = editMaskImageView.f51954h;
            if ((kVar != null ? kVar.f133985e : null) == null || editMaskImageView.f51958l == null) {
                return;
            }
            editMaskImageView.f51959m.execute(new Runnable() { // from class: x62.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i13;
                    Function1 onPop = hVar;
                    EditMaskImageView this$0 = editMaskImageView;
                    switch (i14) {
                        case 0:
                            ql2.g gVar = EditMaskImageView.f51946q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(onPop, "$onPop");
                            if (this$0.f51957k.size() > 0) {
                                g gVar2 = (g) this$0.f51957k.pop();
                                this$0.f51956j.push(gVar2);
                                Intrinsics.f(gVar2);
                                this$0.f2(gVar2, onPop);
                                break;
                            }
                            break;
                        default:
                            ql2.g gVar3 = EditMaskImageView.f51946q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(onPop, "$onPop");
                            if (this$0.f51956j.size() > 1) {
                                LinkedList linkedList = this$0.f51956j;
                                this$0.f51957k.push((g) linkedList.pop());
                                g gVar4 = (g) linkedList.peek();
                                if (gVar4 != null) {
                                    this$0.f2(gVar4, onPop);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (Intrinsics.d(action, x62.l.f133987c)) {
            final EditMaskImageView editMaskImageView2 = (EditMaskImageView) this.f56381b;
            editMaskImageView2.getClass();
            final x62.h hVar2 = new x62.h(editMaskImageView2, i13);
            x62.k kVar2 = editMaskImageView2.f51954h;
            if ((kVar2 != null ? kVar2.f133985e : null) == null || editMaskImageView2.f51958l == null) {
                return;
            }
            final int i14 = 0;
            editMaskImageView2.f51959m.execute(new Runnable() { // from class: x62.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i142 = i14;
                    Function1 onPop = hVar2;
                    EditMaskImageView this$0 = editMaskImageView2;
                    switch (i142) {
                        case 0:
                            ql2.g gVar = EditMaskImageView.f51946q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(onPop, "$onPop");
                            if (this$0.f51957k.size() > 0) {
                                g gVar2 = (g) this$0.f51957k.pop();
                                this$0.f51956j.push(gVar2);
                                Intrinsics.f(gVar2);
                                this$0.f2(gVar2, onPop);
                                break;
                            }
                            break;
                        default:
                            ql2.g gVar3 = EditMaskImageView.f51946q;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(onPop, "$onPop");
                            if (this$0.f51956j.size() > 1) {
                                LinkedList linkedList = this$0.f51956j;
                                this$0.f51957k.push((g) linkedList.pop());
                                g gVar4 = (g) linkedList.peek();
                                if (gVar4 != null) {
                                    this$0.f2(gVar4, onPop);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
    }

    public final ke2.d g(ee2.e eVar) {
        Object obj;
        Iterator it = ((List) this.f56384e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((he2.b) obj).f68965b, eVar)) {
                break;
            }
        }
        he2.b bVar = (he2.b) obj;
        if (bVar != null) {
            return bVar.f68964a;
        }
        return null;
    }

    public final Pair h(String str, boolean z13) {
        ro2.c cVar = (ro2.c) this.f56384e;
        cVar.getClass();
        a0 a0Var = ((c72.d) cVar.a(c72.d.Companion.serializer(), str)).f26894a;
        c72.n nVar = (c72.n) this.f56381b;
        r rVar = a0Var.f63920k;
        nVar.getClass();
        return new Pair(((c72.n) this.f56381b).c(a0Var, z13, false), c72.n.a(rVar));
    }

    public final Pair i(Map map, boolean z13) {
        if (map == null) {
            return new Pair(k0.f106512o, null);
        }
        String k13 = ((nm.o) this.f56383d).k(new c72.a(map));
        Intrinsics.f(k13);
        return h(k13, z13);
    }

    public final k0 j(Map map, boolean z13) {
        if (map == null) {
            return k0.f106512o;
        }
        String k13 = ((nm.o) this.f56383d).k(new c72.a(map));
        Intrinsics.f(k13);
        return (k0) h(k13, z13).f80346a;
    }

    public final q1 k(Map map) {
        if (map == null) {
            q1 q1Var = q1.f106625d;
            return q1.f106625d;
        }
        String k13 = ((nm.o) this.f56383d).k(new c72.a(map));
        Intrinsics.f(k13);
        ro2.c cVar = (ro2.c) this.f56384e;
        cVar.getClass();
        return ((ll.j) this.f56382c).v(((z) cVar.a(z.Companion.serializer(), k13)).f26934a);
    }

    public final void l() {
        switch (this.f56380a) {
            case 3:
                rg0.n d2 = d();
                if (d2 != null) {
                    d2.c(null, null);
                }
                ew1.e eVar = (ew1.e) this.f56382c;
                if (eVar == null) {
                    Intrinsics.r("expBannerListener");
                    throw null;
                }
                ((AnalyticsExperienceBanner) eVar).a(ew1.h.f60353d);
                return;
            default:
                ((w) this.f56381b).d(new s(true, 0));
                rg0.n d13 = d();
                if (d13 != null) {
                    d13.c(null, null);
                    return;
                }
                return;
        }
    }

    public final void m() {
        a11.e eVar;
        o0[] o0VarArr;
        o0 o0Var;
        int i13 = this.f56380a;
        switch (i13) {
            case 3:
                new kk2.k(new k1(this, 23), 1).r(tk2.e.f118017c).l(wj2.c.a()).o(ck2.i.f27924d, ck2.i.f27925e);
                ew1.e eVar2 = (ew1.e) this.f56382c;
                if (eVar2 != null) {
                    ((AnalyticsExperienceBanner) eVar2).a(ew1.h.f60353d);
                    return;
                } else {
                    Intrinsics.r("expBannerListener");
                    throw null;
                }
            default:
                rg0.n d2 = d();
                ag2.e eVar3 = d2 != null ? d2.f108068j : null;
                p0 p0Var = eVar3 instanceof p0 ? (p0) eVar3 : null;
                String str = (p0Var == null || (o0VarArr = p0Var.f108080d) == null || (o0Var = (o0) c0.J(0, o0VarArr)) == null) ? null : o0Var.f108077b;
                if (str != null) {
                    switch (i13) {
                        case 3:
                            eVar = (a11.e) ((xk2.k) this.f56383d).getValue();
                            break;
                        default:
                            eVar = (a11.e) ((xk2.k) this.f56383d).getValue();
                            break;
                    }
                    a11.e.e(eVar, str, null, 6);
                }
                rg0.n d13 = d();
                if (d13 != null) {
                    d13.a(null, null);
                    return;
                }
                return;
        }
    }

    public final void n(float f13, ql2.g range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f56384e = range;
        va0.o oVar = (va0.o) ((s62.e) this.f56382c);
        oVar.b(Float.valueOf(range.f104105a).floatValue());
        oVar.c(Float.valueOf(range.f104106b).floatValue());
        oVar.a(f13);
    }

    public final void o(int i13) {
        EditMaskImageView editMaskImageView = (EditMaskImageView) this.f56381b;
        editMaskImageView.f51949c = i13;
        x62.k kVar = editMaskImageView.f51954h;
        if (kVar != null) {
            kVar.f133983c.setColor(i13);
            kVar.invalidateSelf();
        }
        y62.e eVar = editMaskImageView.f51955i;
        editMaskImageView.r2(eVar != null ? eVar.f137919a : null);
    }

    public final void p(x62.p model) {
        Intrinsics.checkNotNullParameter(model, "model");
        EditMaskImageView editMaskImageView = (EditMaskImageView) this.f56381b;
        i1 i1Var = model.f133990b;
        if (!Intrinsics.d(editMaskImageView.f51952f, i1Var)) {
            editMaskImageView.f51952f = i1Var;
            if (i1Var == null) {
                editMaskImageView.f51958l = null;
                editMaskImageView.f51954h = null;
                editMaskImageView.f51955i = null;
            } else {
                editMaskImageView.s2(i1Var);
                editMaskImageView.r2(i1Var);
            }
            editMaskImageView.f51959m.execute(new x62.b(editMaskImageView, 0));
            x62.k kVar = editMaskImageView.f51954h;
            if (kVar != null && kVar.f133985e != null) {
                EditMaskImageView.k2(editMaskImageView, x62.f.DRAW);
            }
        }
        editMaskImageView.invalidate();
        boolean z13 = model.f133991c == x62.n.ERASER;
        editMaskImageView.f51948b = z13;
        x62.k kVar2 = editMaskImageView.f51954h;
        if (kVar2 != null) {
            kVar2.f133982b = z13;
        }
        float f13 = model.f133992d;
        editMaskImageView.f51947a = f13;
        if (kVar2 != null) {
            kVar2.f133981a = editMaskImageView.i2();
        }
        boolean z14 = model.f133993e == x62.o.INVERTED;
        x62.k kVar3 = editMaskImageView.f51954h;
        if (kVar3 != null && z14 != editMaskImageView.f51951e) {
            editMaskImageView.f51951e = z14;
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            kVar3.f133986f.drawPaint(paint);
            editMaskImageView.invalidate();
            EditMaskImageView.k2(editMaskImageView, x62.f.INVERT_MASK);
        }
        ve.h.Z(editMaskImageView, model.f133989a, r62.b.f106341l);
        ((va0.o) ((s62.e) this.f56382c)).a(((Number) ql2.s.k(Float.valueOf(f13), (ql2.h) this.f56384e)).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto Lc
            java.lang.CharSequence r8 = kotlin.text.StringsKt.i0(r8)
            java.lang.String r8 = r8.toString()
            goto Ld
        Lc:
            r8 = r0
        Ld:
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L1a
            int r3 = r8.length()
            r4 = 4
            if (r3 != r4) goto L1a
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r8 == 0) goto L34
            r4 = r2
        L1e:
            int r5 = r8.length()
            if (r4 >= r5) goto L32
            char r5 = r8.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L2f
            goto L34
        L2f:
            int r4 = r4 + 1
            goto L1e
        L32:
            r4 = r1
            goto L35
        L34:
            r4 = r2
        L35:
            if (r4 != 0) goto L42
            java.lang.Object r5 = r7.f56383d
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            if (r5 == 0) goto L42
            com.pinterest.feature.settings.passcode.a r6 = com.pinterest.feature.settings.passcode.a.ERROR_ONLY_DIGITS
            r5.invoke(r6, r0)
        L42:
            if (r3 == 0) goto L47
            if (r4 == 0) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 == 0) goto L4b
            r0 = r8
        L4b:
            r7.f56381b = r0
            java.lang.Object r8 = r7.f56382c
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            if (r8 == 0) goto L5a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.invoke(r0)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.q.q(java.lang.String):void");
    }

    public final ee2.e r(ke2.d dVar) {
        Object obj;
        Iterator it = ((List) this.f56384e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((he2.b) obj).f68964a, dVar)) {
                break;
            }
        }
        he2.b bVar = (he2.b) obj;
        if (bVar != null) {
            return bVar.f68965b;
        }
        return null;
    }

    public q(a11.d clickThroughHelperFactory, uk1.e pinalyticsFactory, rg0.s experiences, w eventManager, int i13) {
        this.f56380a = i13;
        if (i13 != 4) {
            Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            Intrinsics.checkNotNullParameter(experiences, "experiences");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f56381b = eventManager;
            int i14 = 0;
            this.f56383d = xk2.m.b(new ew1.f(clickThroughHelperFactory, pinalyticsFactory, i14));
            this.f56384e = xk2.m.b(new ew1.g(experiences, i14));
            return;
        }
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f56381b = eventManager;
        int i15 = 1;
        this.f56383d = xk2.m.b(new ew1.f(clickThroughHelperFactory, pinalyticsFactory, i15));
        this.f56384e = xk2.m.b(new ew1.g(experiences, i15));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, ke2.c cVar) {
        this(context, cVar, new kv0.p(7));
        this.f56380a = 8;
    }

    public q(so.d editablePinItemsFactory, so.e editableScheduledPinItemsFactory, so.f draftPinItemsFactory, ag1.b dataManager) {
        this.f56380a = 1;
        Intrinsics.checkNotNullParameter(editablePinItemsFactory, "editablePinItemsFactory");
        Intrinsics.checkNotNullParameter(editableScheduledPinItemsFactory, "editableScheduledPinItemsFactory");
        Intrinsics.checkNotNullParameter(draftPinItemsFactory, "draftPinItemsFactory");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        this.f56381b = editablePinItemsFactory;
        this.f56382c = editableScheduledPinItemsFactory;
        this.f56383d = draftPinItemsFactory;
        this.f56384e = dataManager;
    }

    public q(ev0.s view, h22.f storyPinService, du0.b presenterPinalytics) {
        this.f56380a = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f56381b = view;
        this.f56382c = storyPinService;
        this.f56383d = presenterPinalytics;
        this.f56384e = new HashMap();
    }

    public q(c72.n entityMapperEffectData, ll.j entityMapperShuffleEffectData, nm.o gson, u json) {
        this.f56380a = 7;
        Intrinsics.checkNotNullParameter(entityMapperEffectData, "entityMapperEffectData");
        Intrinsics.checkNotNullParameter(entityMapperShuffleEffectData, "entityMapperShuffleEffectData");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f56381b = entityMapperEffectData;
        this.f56382c = entityMapperShuffleEffectData;
        this.f56383d = gson;
        this.f56384e = json;
    }

    public q(EditMaskImageView maskEditor, va0.o brushSizeSlider, e0 onRefineMaskEvent) {
        this.f56380a = 5;
        Intrinsics.checkNotNullParameter(maskEditor, "maskEditor");
        Intrinsics.checkNotNullParameter(brushSizeSlider, "brushSizeSlider");
        Intrinsics.checkNotNullParameter(onRefineMaskEvent, "onRefineMaskEvent");
        this.f56381b = maskEditor;
        this.f56382c = brushSizeSlider;
        this.f56383d = onRefineMaskEvent;
        this.f56384e = new ql2.g(-1.0f, 0.0f);
        t tVar = new t(this);
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        maskEditor.f51950d = tVar;
        l3.c.R0((s62.e) this.f56382c, null, new mm1.g(this, 6), 3);
    }

    public q(b60.b activeUserManager) {
        this.f56380a = 2;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f56384e = ((b60.d) activeUserManager).f();
    }

    public q(Context context, ke2.c scene, kv0.p legacyScene) {
        this.f56380a = 8;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(legacyScene, "legacyScene");
        this.f56381b = context;
        this.f56382c = scene;
        this.f56383d = legacyScene;
        this.f56384e = new ArrayList();
    }
}
