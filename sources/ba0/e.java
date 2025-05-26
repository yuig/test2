package ba0;

import ao2.j0;
import b3.w;
import do2.t2;
import fk1.u;
import h62.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import m62.c1;
import m62.f;
import m62.g1;
import m62.h1;
import m62.i;
import m62.s;
import p90.n0;
import r72.a2;
import r72.f2;
import r72.u1;
import r72.y1;
import r72.z;
import u50.r;
import y90.g0;
import y90.h0;
import y90.i0;
import y90.j;
import y90.k0;
import y90.l0;
import y90.z1;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final List f22335b = f0.j(new m62.g(f.LAYER, z1.collage_effect_category_options, true), new m62.g(f.MOTION, z1.collage_effect_category_motion, true), new m62.g(f.FILTER, z1.collage_effect_category_color, true));

    /* renamed from: c, reason: collision with root package name */
    public static final List f22336c = f0.j(new m62.g(f.FONT, z1.collage_effect_category_font, true), new m62.g(f.COLOR, z1.collage_effect_category_color, true), new m62.g(f.BORDER_COLOR, z1.collage_effect_category_border, true), new m62.g(f.ALIGN, z1.collage_effect_category_align, true));

    /* renamed from: a, reason: collision with root package name */
    public final g1 f22337a;

    public e(g1 effectsViewModelDelegate) {
        Intrinsics.checkNotNullParameter(effectsViewModelDelegate, "effectsViewModelDelegate");
        this.f22337a = effectsViewModelDelegate;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        t2 t2Var;
        Object value;
        r72.z1 f13;
        float f14;
        ArrayList arrayList;
        boolean z13;
        t2 t2Var2;
        Object value2;
        s sVar;
        String str;
        boolean d2;
        i62.c cVar;
        l0 request = (l0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z14 = request instanceof y90.j0;
        g1 g1Var = this.f22337a;
        if (!z14) {
            if (request instanceof i0) {
                g1Var.j(((i0) request).f138190a);
                return;
            }
            if (request instanceof g0) {
                eventIntake.a(new j(g1Var.g()));
                return;
            }
            if (request instanceof h0) {
                eventIntake.a(new j(g1Var.g()));
                return;
            }
            if (request instanceof k0) {
                n0 block = new n0(request, 14);
                g1Var.getClass();
                Intrinsics.checkNotNullParameter(block, "block");
                do {
                    t2Var = g1Var.f85987g;
                    value = t2Var.getValue();
                } while (!t2Var.h(value, block.invoke(value)));
                return;
            }
            return;
        }
        y90.j0 j0Var = (y90.j0) request;
        Iterable b13 = j0Var.f138193b ? e0.b(new m62.g(f.SHAPE, z1.collage_effect_category_shape, false)) : q0.f80391a;
        Collection j13 = j0Var.f138194c ? f0.j(new m62.g(f.LAYER, z1.collage_effect_category_options, true), new m62.g(f.MOTION, z1.collage_effect_category_motion, true)) : q0.f80391a;
        int i13 = a2.f106437b;
        String id3 = j0Var.f138192a;
        Intrinsics.checkNotNullParameter(id3, "value");
        ArrayList arrayList2 = ra0.h0.f106943o;
        ArrayList colors = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            colors.add(c0.d.S2(androidx.compose.ui.graphics.a.u(((w) it.next()).f21392a)));
        }
        ArrayList imageItemCategories = CollectionsKt.l0(b13, f22335b);
        ArrayList textItemCategories = CollectionsKt.l0(f22336c, j13);
        t80.r onItemLoaded = new t80.r(12, scope, this);
        b onLayerActionPerformed = b.f22329i;
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(imageItemCategories, "imageItemCategories");
        Intrinsics.checkNotNullParameter(textItemCategories, "textItemCategories");
        Intrinsics.checkNotNullParameter(onItemLoaded, "onItemLoaded");
        Intrinsics.checkNotNullParameter(onLayerActionPerformed, "onLayerActionPerformed");
        Intrinsics.checkNotNullParameter(colors, "<set-?>");
        g1Var.f86004x = colors;
        g01.a aVar = g1Var.f85985e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(onLayerActionPerformed, "onLayerActionPerformed");
        aVar.f63225b = onLayerActionPerformed;
        k kVar = g1Var.f85981a;
        IndexedValue b14 = kVar.b(id3);
        if (b14 != null) {
            r72.z1 z1Var = (r72.z1) b14.f80350b;
            g1Var.f86003w = z1Var;
            r72.k0 a13 = z1Var.a();
            yk2.g builder = new yk2.g();
            i62.c cVar2 = g1Var.f85982b;
            aa0.d dVar = (aa0.d) cVar2.f71633a;
            List borderEffects = (List) dVar.f1619d.getValue();
            List filterEffects = (List) dVar.f1621f.getValue();
            List motionEffects = (List) dVar.f1622g.getValue();
            Intrinsics.checkNotNullParameter(borderEffects, "borderEffects");
            q0 alphaEffects = dVar.f1620e;
            Intrinsics.checkNotNullParameter(alphaEffects, "alphaEffects");
            Intrinsics.checkNotNullParameter(filterEffects, "filterEffects");
            Intrinsics.checkNotNullParameter(motionEffects, "motionEffects");
            builder.put(f.OPACITY, alphaEffects);
            builder.put(f.BORDER, borderEffects);
            builder.put(f.FILTER, filterEffects);
            builder.put(f.MOTION, motionEffects);
            Intrinsics.checkNotNullParameter(builder, "builder");
            yk2.g c13 = builder.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(c13.f139256i));
            Iterator it2 = ((yk2.h) c13.entrySet()).iterator();
            while (((q5.j0) it2).hasNext()) {
                Map.Entry entry = (Map.Entry) ((yk2.d) it2).next();
                Object key = entry.getKey();
                Iterable iterable = (Iterable) entry.getValue();
                Iterator it3 = it2;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    k62.a aVar2 = (k62.a) it4.next();
                    r72.j0 effect = p.h(a13, aVar2.f78418a.a());
                    Iterator it5 = it4;
                    r72.j0 j0Var2 = effect == null ? aVar2.f78418a : effect;
                    r72.k0 k0Var = a13;
                    boolean z15 = effect != null;
                    k62.b metadata = aVar2.f78419b;
                    if (effect != null) {
                        Intrinsics.checkNotNullParameter(effect, "effect");
                        Intrinsics.checkNotNullParameter(metadata, "metadata");
                        cVar = cVar2;
                        p.i(g1Var.f86001u, j0Var2.a(), new u(cVar2.a(new k62.a(effect, metadata)), 13));
                    } else {
                        cVar = cVar2;
                    }
                    arrayList3.add(new i(j0Var2, metadata, z15));
                    it4 = it5;
                    a13 = k0Var;
                    cVar2 = cVar;
                }
                linkedHashMap.put(key, arrayList3);
                it2 = it3;
            }
            g1Var.f85998r = z0.r(linkedHashMap);
            if (z1Var instanceof u1) {
                g1Var.k(((u1) z1Var).f106676h);
                f14 = 0.0f;
                f13 = z1Var;
                arrayList = imageItemCategories;
                z13 = false;
            } else {
                if (!(z1Var instanceof y1)) {
                    throw new NoWhenBranchMatchedException();
                }
                g1Var.k(null);
                List list = (List) ((aa0.f) g1Var.f85984d.f71634a).f1628a.getValue();
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(new h1((k62.f) it6.next(), false));
                }
                g1Var.f86000t = arrayList4;
                y1 y1Var = (y1) z1Var;
                f13 = y1.f(y1Var, null, null, 1.0d, 0.0d, null, null, 59);
                f14 = y1Var.f106726f.f106543d;
                arrayList = textItemCategories;
                z13 = true;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList) {
                f fVar = ((m62.g) obj).f85977a;
                switch (c1.f85965a[fVar.ordinal()]) {
                    case 5:
                        Collection collection = (Collection) g1Var.f85999s.get(fVar);
                        if (collection != null && !collection.isEmpty()) {
                            arrayList5.add(obj);
                        }
                        break;
                    case 6:
                        Collection collection2 = (Collection) g1Var.f85999s.get(fVar);
                        if (collection2 != null && !collection2.isEmpty()) {
                            arrayList5.add(obj);
                        }
                        break;
                    case 7:
                        Collection collection3 = (Collection) g1Var.f85999s.get(fVar);
                        if (collection3 != null && !collection3.isEmpty()) {
                            arrayList5.add(obj);
                        }
                        break;
                    case 8:
                        Collection collection4 = (Collection) g1Var.f85999s.get(fVar);
                        if (collection4 != null && !collection4.isEmpty()) {
                            arrayList5.add(obj);
                        }
                        break;
                    case 9:
                    case 10:
                        List list2 = g1Var.f86004x;
                        if (list2 == null) {
                            Intrinsics.r("colors");
                            throw null;
                        }
                        if (!list2.isEmpty()) {
                            arrayList5.add(obj);
                        }
                    case 11:
                        if (!g1Var.f86000t.isEmpty()) {
                            arrayList5.add(obj);
                        }
                    default:
                        List list3 = (List) g1Var.f85998r.get(fVar);
                        if (list3 == null) {
                            list3 = q0.f80391a;
                        }
                        if (!list3.isEmpty()) {
                            List<i> list4 = list3;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                for (i iVar : list4) {
                                    int i14 = c1.f85965a[fVar.ordinal()];
                                    if (i14 == 1) {
                                        d2 = Intrinsics.d(iVar.f86011a, r72.e.f106461b);
                                    } else if (i14 == 2) {
                                        d2 = Intrinsics.d(iVar.f86011a, r72.i.f106496b);
                                    } else if (i14 == 3) {
                                        d2 = Intrinsics.d(iVar.f86011a, r72.r.f106630b);
                                    } else if (i14 != 4) {
                                        continue;
                                    } else {
                                        d2 = Intrinsics.d(iVar.f86011a, z.f106727b);
                                    }
                                    if (!d2) {
                                        arrayList5.add(obj);
                                    }
                                }
                            }
                        }
                        break;
                }
            }
            ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                arrayList6.add(new m62.h((m62.g) it7.next(), false));
            }
            do {
                t2Var2 = g1Var.f85987g;
                value2 = t2Var2.getValue();
                sVar = (s) value2;
                str = ((f2) kVar.f67841c.f55726a.getValue()).f106476h.f106626a;
                if (str == null) {
                    str = "";
                }
            } while (!t2Var2.h(value2, s.a(sVar, f13, str, null, null, arrayList6, null, null, null, z13, f14, null, 1260)));
            m62.h hVar2 = (m62.h) CollectionsKt.firstOrNull(arrayList6);
            if (hVar2 != null) {
                g1Var.h(hVar2);
            }
            onItemLoaded.invoke(z1Var);
        }
        lb.l0.J0(lb.l0.Q0(new c(this, eventIntake, null), g1Var.f85988h), scope);
        lb.l0.J0(lb.l0.Q0(new d(eventIntake, null), g1Var.f85990j), scope);
    }
}
