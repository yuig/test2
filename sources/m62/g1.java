package m62;

import android.graphics.Color;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import do2.a2;
import do2.t2;
import do2.u2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh2.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import r72.a3;
import r72.b3;
import r72.c3;
import r72.d3;
import r72.e3;
import r72.f3;
import r72.g3;
import r72.i2;
import r72.k2;
import r72.l2;
import r72.n2;
import r72.o2;
import r72.p2;
import r72.q2;
import r72.r2;
import r72.u1;
import r72.v2;
import r72.w2;
import r72.x2;
import r72.y1;
import r72.y2;
import r72.z1;
import r72.z2;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final h62.k f85981a;

    /* renamed from: b, reason: collision with root package name */
    public final i62.c f85982b;

    /* renamed from: c, reason: collision with root package name */
    public final i62.e f85983c;

    /* renamed from: d, reason: collision with root package name */
    public final i62.d f85984d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f85985e;

    /* renamed from: f, reason: collision with root package name */
    public final q62.a f85986f;

    /* renamed from: g, reason: collision with root package name */
    public final t2 f85987g;

    /* renamed from: h, reason: collision with root package name */
    public final a2 f85988h;

    /* renamed from: i, reason: collision with root package name */
    public final s62.a f85989i;

    /* renamed from: j, reason: collision with root package name */
    public final do2.d f85990j;

    /* renamed from: k, reason: collision with root package name */
    public z1 f85991k;

    /* renamed from: l, reason: collision with root package name */
    public f f85992l;

    /* renamed from: m, reason: collision with root package name */
    public String f85993m;

    /* renamed from: n, reason: collision with root package name */
    public String f85994n;

    /* renamed from: o, reason: collision with root package name */
    public k2 f85995o;

    /* renamed from: p, reason: collision with root package name */
    public String f85996p;

    /* renamed from: q, reason: collision with root package name */
    public String f85997q;

    /* renamed from: r, reason: collision with root package name */
    public LinkedHashMap f85998r;

    /* renamed from: s, reason: collision with root package name */
    public Map f85999s;

    /* renamed from: t, reason: collision with root package name */
    public List f86000t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f86001u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f86002v;

    /* renamed from: w, reason: collision with root package name */
    public z1 f86003w;

    /* renamed from: x, reason: collision with root package name */
    public List f86004x;

    public g1(h62.k project, i62.c effectsRepository, i62.e toolsRepository, i62.d fontsRepository, g01.a layerActionsViewModelDelegate, q62.a urlBuilder) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(effectsRepository, "effectsRepository");
        Intrinsics.checkNotNullParameter(toolsRepository, "toolsRepository");
        Intrinsics.checkNotNullParameter(fontsRepository, "fontsRepository");
        Intrinsics.checkNotNullParameter(layerActionsViewModelDelegate, "layerActionsViewModelDelegate");
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        this.f85981a = project;
        this.f85982b = effectsRepository;
        this.f85983c = toolsRepository;
        this.f85984d = fontsRepository;
        this.f85985e = layerActionsViewModelDelegate;
        this.f85986f = urlBuilder;
        t2 a13 = u2.a(new s());
        this.f85987g = a13;
        this.f85988h = new a2(a13);
        s62.a aVar = new s62.a();
        this.f85989i = aVar;
        this.f85990j = aVar.f111248b;
        this.f85998r = new LinkedHashMap();
        this.f85999s = kotlin.collections.z0.d();
        this.f86000t = kotlin.collections.q0.f80391a;
        this.f86001u = new LinkedHashMap();
        this.f86002v = xk2.m.b(new yv1.i(this, 19));
    }

    public static r72.p0 b(String str, double d2) {
        return new r72.p0(str, (float) m(new hd2.a(d2 / 6.283185307179586d)).a(), 0.0f, new ql2.g((float) (0.0d * 2 * 3.141592653589793d), (float) (1.0d * 2 * 3.141592653589793d)));
    }

    public static hd2.a m(hd2.a aVar) {
        hd2.a other = new hd2.a(1.0d);
        double d2 = aVar.f68913a;
        if (d2 < 0.0d) {
            return m(aVar.b(other));
        }
        if (d2 <= 1.0d) {
            return aVar;
        }
        Intrinsics.checkNotNullParameter(other, "other");
        return m(new hd2.a(d2 - 1.0d));
    }

    public final void a() {
        this.f85994n = null;
        this.f85996p = null;
        this.f85989i.a(c0.f85964a);
    }

    public final i c() {
        List list;
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        Object obj = null;
        p pVar = m2Var instanceof p ? (p) m2Var : null;
        if (pVar == null || (list = pVar.f86039d) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String a13 = ((i) next).f86011a.a();
            String str = this.f85993m;
            if (str != null && Intrinsics.d(a13, str)) {
                obj = next;
                break;
            }
        }
        return (i) obj;
    }

    public final z1 d() {
        return ((s) this.f85987g.getValue()).f86045a;
    }

    public final k e() {
        Object obj;
        List list = ((s) this.f85988h.f55726a.getValue()).f86051g;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof k) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((k) obj).f86021a.b(), this.f85994n)) {
                break;
            }
        }
        return (k) obj;
    }

    public final m f() {
        Object obj;
        List list = ((s) this.f85988h.f55726a.getValue()).f86051g;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof m) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((m) obj).f86033c, this.f85994n)) {
                break;
            }
        }
        return (m) obj;
    }

    public final boolean g() {
        t2 t2Var;
        Object value;
        if (!l()) {
            v vVar = ((s) this.f85988h.f55726a.getValue()).f86048d;
            boolean z13 = vVar instanceof t;
            u uVar = u.f86059a;
            if (!z13) {
                if (!Intrinsics.d(vVar, uVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                n();
                return false;
            }
            while (true) {
                t2Var = this.f85987g;
                Object value2 = t2Var.getValue();
                u uVar2 = uVar;
                if (t2Var.h(value2, s.a((s) value2, null, null, null, uVar, null, null, null, null, false, 0.0f, null, 2039))) {
                    break;
                }
                uVar = uVar2;
            }
            if (this.f85991k != null) {
                do {
                    value = t2Var.getValue();
                } while (!t2Var.h(value, s.a((s) value, this.f85991k, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                String str = this.f85993m;
                if (str != null) {
                    kg.p.i(this.f86001u, str, d1.f85969j);
                }
                this.f85991k = null;
            }
            a();
            r();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0290 A[LOOP:5: B:93:0x0258->B:95:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(m62.h r30) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m62.g1.h(m62.h):void");
    }

    public final void i(k kVar) {
        t2 t2Var;
        Object value;
        s sVar;
        ArrayList arrayList;
        String str = this.f85993m;
        if (str == null) {
            return;
        }
        r72.w0 w0Var = kVar.f86021a;
        int i13 = 1;
        if (w0Var instanceof r72.o0) {
            a();
            r72.o0 o0Var = (r72.o0) w0Var;
            int i14 = o0Var.f106598e + 1;
            List list = o0Var.f106597d;
            w0Var = r72.o0.d(o0Var, ((Number) list.get(i14 % list.size())).floatValue());
        } else if (w0Var instanceof r72.q0) {
            a();
            r72.q0 q0Var = (r72.q0) w0Var;
            int i15 = q0Var.f106624e + 1;
            List list2 = q0Var.f106623d;
            w0Var = r72.q0.d(q0Var, ((Number) list2.get(i15 % list2.size())).intValue());
        } else if (w0Var instanceof r72.m0) {
            a();
            w0Var = r72.m0.d((r72.m0) w0Var, !r3.f106549b);
        } else {
            boolean z13 = w0Var instanceof r72.p0;
            s62.a aVar = this.f85989i;
            if (z13 || (w0Var instanceof r72.r0) || (w0Var instanceof r72.v0) || (w0Var instanceof r72.t0)) {
                if (!Intrinsics.d(this.f85994n, w0Var.b())) {
                    this.f85994n = w0Var.b();
                    aVar.a(new e0(w0Var));
                }
            } else {
                if (!(w0Var instanceof r72.n0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!Intrinsics.d(this.f85994n, w0Var.b())) {
                    this.f85994n = w0Var.b();
                    this.f85996p = c0.d.S2(((r72.n0) w0Var).f106579b);
                    do {
                        t2Var = this.f85987g;
                        value = t2Var.getValue();
                        sVar = (s) value;
                        List list3 = this.f86004x;
                        if (list3 == null) {
                            Intrinsics.r("colors");
                            throw null;
                        }
                        List list4 = list3;
                        arrayList = new ArrayList(kotlin.collections.g0.q(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new a((String) it.next(), false));
                        }
                    } while (!t2Var.h(value, s.a(sVar, null, null, null, null, null, null, null, arrayList, false, 0.0f, null, 1919)));
                    aVar.a(new e0(w0Var));
                }
            }
        }
        kg.p.i(this.f86001u, str, new e1(kVar, w0Var, i13));
        p();
        t();
        u();
    }

    public final void j(b1 event) {
        l2 l2Var;
        Object value;
        s sVar;
        l2 l2Var2;
        Object value2;
        Object value3;
        Object value4;
        k e13;
        k e14;
        m f13;
        Object value5;
        Object value6;
        h1 h1Var;
        Object value7;
        s sVar2;
        t tVar;
        ArrayList arrayList;
        List list;
        Object obj;
        i2 i2Var;
        Object value8;
        z1 z1Var;
        Object value9;
        s sVar3;
        t tVar2;
        ArrayList arrayList2;
        Object value10;
        Object value11;
        Object value12;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof p0;
        t2 t2Var = this.f85987g;
        if (z13) {
            z1 d2 = d();
            if (d2 == null || (d2 instanceof u1) || !(d2 instanceof y1)) {
                return;
            }
            if (!(((s) t2Var.getValue()).f86048d instanceof u)) {
                g();
                return;
            }
            y1 y1Var = (y1) d2;
            this.f85997q = y1Var.f106726f.f106540a;
            do {
                value12 = t2Var.getValue();
            } while (!t2Var.h(value12, s.a((s) value12, y1.f(y1Var, null, null, 0.0d, 0.0d, r72.k0.a(d2.a(), false, false, true, false, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16379), null, 47), null, null, null, null, null, null, null, false, 0.0f, y1Var.f106726f, 1022)));
            return;
        }
        boolean z14 = event instanceof o0;
        s62.a aVar = this.f85989i;
        if (z14) {
            o0 o0Var = (o0) event;
            double d13 = o0Var.f86037a;
            z1 d14 = d();
            if (d14 == null) {
                return;
            }
            r72.k0 a13 = d14.a();
            double d15 = o0Var.f86038b;
            z1 v13 = kh2.w.v(d14, null, null, 0.0d, 0.0d, r72.k0.a(a13, false, false, false, false, 0.0f, null, null, null, null, d13, d15, null, 13311), 15);
            do {
                value11 = t2Var.getValue();
            } while (!t2Var.h(value11, s.a((s) value11, v13, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
            m f14 = f();
            if (f14 != null) {
                g3 g3Var = f14.f86031a.f78436a;
                if (Intrinsics.d(g3Var, d3.f106460b)) {
                    aVar.a(new e0(b(g3Var.f106489a, d15)));
                } else if (Intrinsics.d(g3Var, e3.f106465b)) {
                    aVar.a(new e0(b(g3Var.f106489a, d13)));
                }
            }
            v();
            return;
        }
        if (event instanceof k0) {
            h(((k0) event).f86025a);
            l();
            return;
        }
        boolean z15 = event instanceof l0;
        a2 a2Var = this.f85988h;
        int i13 = 0;
        int i14 = 10;
        if (z15) {
            i iVar = ((l0) event).f86030a;
            if (iVar.f86012b.f78423d) {
                return;
            }
            String str = this.f85993m;
            r72.j0 j0Var = iVar.f86011a;
            String a14 = j0Var.a();
            if (str == null || !Intrinsics.d(str, a14)) {
                this.f85993m = j0Var.a();
                t();
                r();
                return;
            }
            i c13 = c();
            if (c13 == null) {
                return;
            }
            r72.j0 j0Var2 = c13.f86011a;
            k62.b bVar = c13.f86012b;
            List a15 = this.f85982b.a(new k62.a(j0Var2, bVar));
            if (a15.isEmpty()) {
                return;
            }
            this.f85991k = d();
            while (true) {
                Object value13 = t2Var.getValue();
                s sVar4 = (s) value13;
                t tVar3 = new t(new s62.g(bVar.f78420a));
                yk2.b bVar2 = new yk2.b();
                bVar2.add(new l(true));
                List<k62.c> list2 = a15;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list2, i14));
                for (k62.c cVar : list2) {
                    arrayList3.add(new k(cVar.f78424a, cVar.f78425b, false));
                }
                bVar2.addAll(arrayList3);
                Unit unit = Unit.f80348a;
                if (t2Var.h(value13, s.a(sVar4, null, null, null, tVar3, null, null, kotlin.collections.e0.a(bVar2), null, false, 0.0f, null, 1975))) {
                    break;
                } else {
                    i14 = 10;
                }
            }
            u();
            List list3 = ((s) a2Var.f55726a.getValue()).f86051g;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 instanceof k) {
                    arrayList4.add(obj2);
                }
            }
            k kVar = (k) CollectionsKt.firstOrNull(arrayList4);
            if (kVar != null) {
                r72.w0 w0Var = kVar.f86021a;
                k kVar2 = ((w0Var instanceof r72.p0) || (w0Var instanceof r72.r0) || (w0Var instanceof r72.v0) || (w0Var instanceof r72.t0) || (w0Var instanceof r72.n0)) ? kVar : null;
                if (kVar2 != null) {
                    i(kVar2);
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof x0) {
            k62.g gVar = ((x0) event).f86063a.f86026a;
            g3 g3Var2 = gVar.f78436a;
            if (g3Var2 instanceof f3) {
                f3 f3Var = (f3) g3Var2;
                z1 d16 = d();
                u1 u1Var = d16 instanceof u1 ? (u1) d16 : null;
                if (u1Var == null) {
                    return;
                }
                if (Intrinsics.d(f3Var, b3.f106445b)) {
                    a();
                    double d17 = u1.f106668t.f106672d;
                    r72.k0 k0Var = r72.k0.f106512o;
                    u1Var = u1.f(u1Var, null, null, 0.0d, d17, r72.k0.a(u1Var.f106673e, k0Var.f106513a, k0Var.f106514b, false, false, 0.0f, null, null, null, null, k0Var.f106523k, k0Var.f106524l, null, 13308), null, null, null, null, null, null, null, null, 262119);
                } else {
                    boolean d18 = Intrinsics.d(f3Var, z2.f106728b);
                    r72.k0 k0Var2 = u1Var.f106673e;
                    if (d18) {
                        a();
                        u1Var = u1.f(u1Var, null, null, 0.0d, 0.0d, r72.k0.a(k0Var2, false, !k0Var2.f106514b, false, false, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16381), null, null, null, null, null, null, null, null, 262127);
                    } else if (Intrinsics.d(f3Var, a3.f106439b)) {
                        a();
                        u1Var = u1.f(u1Var, null, null, 0.0d, 0.0d, r72.k0.a(k0Var2, !k0Var2.f106513a, false, false, false, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16382), null, null, null, null, null, null, null, null, 262127);
                    } else if (Intrinsics.d(f3Var, c3.f106452b)) {
                        a();
                        u1Var = u1.f(u1Var, null, null, 0.0d, u1Var.f106672d - 1.5707963267948966d, null, null, null, null, null, null, null, null, null, 262135);
                    } else if (!Intrinsics.d(f3Var, e3.f106465b)) {
                        if (!Intrinsics.d(f3Var, d3.f106460b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!Intrinsics.d(this.f85994n, f3Var.f106489a)) {
                            String str2 = f3Var.f106489a;
                            this.f85994n = str2;
                            aVar.a(new e0(b(str2, k0Var2.f106524l)));
                        }
                    } else if (!Intrinsics.d(this.f85994n, f3Var.f106489a)) {
                        String str3 = f3Var.f106489a;
                        this.f85994n = str3;
                        aVar.a(new e0(b(str3, k0Var2.f106523k)));
                    }
                }
                do {
                    value10 = t2Var.getValue();
                } while (!t2Var.h(value10, s.a((s) value10, u1Var, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                u();
                return;
            }
            boolean z16 = g3Var2 instanceof r72.u2;
            if (z16) {
                r72.u2 u2Var = z16 ? (r72.u2) g3Var2 : null;
                if (u2Var != null && Intrinsics.d(u2Var, r72.t2.f106664b)) {
                    do {
                        value9 = t2Var.getValue();
                        sVar3 = (s) value9;
                        tVar2 = new t(new s62.h(gVar.f78437b, new Object[0]));
                        Iterable iterable = (List) this.f85999s.get(f.TRANSFORM);
                        if (iterable == null) {
                            iterable = kotlin.collections.q0.f80391a;
                        }
                        Iterable iterable2 = iterable;
                        arrayList2 = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
                        Iterator it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new m(((k1) it.next()).f86026a, false));
                        }
                    } while (!t2Var.h(value9, s.a(sVar3, null, null, null, tVar2, null, null, arrayList2, null, false, 0.0f, null, 1975)));
                    u();
                    return;
                }
                return;
            }
            boolean z17 = g3Var2 instanceof r2;
            g3 g3Var3 = gVar.f78436a;
            if (!z17) {
                if (g3Var2 instanceof y2) {
                    z1 d19 = d();
                    y1 y1Var2 = d19 instanceof y1 ? (y1) d19 : null;
                    if (y1Var2 == null) {
                        return;
                    }
                    y2 y2Var = g3Var3 instanceof y2 ? (y2) g3Var3 : null;
                    if (y2Var == null) {
                        return;
                    }
                    if (Intrinsics.d(y2Var, w2.f106701b)) {
                        i2Var = i2.LEFT;
                    } else if (Intrinsics.d(y2Var, v2.f106699b)) {
                        i2Var = i2.CENTER;
                    } else {
                        if (!Intrinsics.d(y2Var, x2.f106708b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2Var = i2.RIGHT;
                    }
                    y1 f15 = y1.f(y1Var2, null, null, 0.0d, 0.0d, null, l2.a(y1Var2.f106726f, null, null, null, 0.0f, null, i2Var, false, 95), 31);
                    do {
                        value8 = t2Var.getValue();
                    } while (!t2Var.h(value8, s.a((s) value8, f15, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                    v();
                    return;
                }
                return;
            }
            z1 d23 = d();
            if (d23 == null) {
                return;
            }
            r2 r2Var = g3Var3 instanceof r2 ? (r2) g3Var3 : null;
            if (r2Var == null) {
                return;
            }
            boolean d24 = Intrinsics.d(r2Var, r72.m2.f106577b);
            g01.a aVar2 = this.f85985e;
            if (d24) {
                aVar2.b(d23.b());
                return;
            }
            if (Intrinsics.d(r2Var, n2.f106582b)) {
                IndexedValue b13 = this.f85981a.b(d23.b());
                if (b13 == null || (z1Var = (z1) b13.f80350b) == null) {
                    return;
                }
                aVar2.c(kh2.w.v(d23, null, null, z1Var.e(), 0.0d, null, 27));
                return;
            }
            if (!Intrinsics.d(r2Var, p2.f106619b)) {
                if (Intrinsics.d(r2Var, o2.f106608b)) {
                    n();
                    aVar2.d(d23.b());
                    return;
                }
                return;
            }
            String id3 = d23.b();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(id3, "id");
            h62.k kVar3 = (h62.k) aVar2.f63224a;
            IndexedValue b14 = kVar3.b(id3);
            if (b14 != null) {
                ((kl2.l) aVar2.f63225b).invoke(Integer.valueOf(b14.f80349a), Integer.valueOf(kVar3.c()), l62.h0.REPLACE);
                return;
            }
            return;
        }
        int i15 = 2;
        if (event instanceof n0) {
            h1 h1Var2 = ((n0) event).f86035a;
            if (this.f85995o != h1Var2.a()) {
                this.f85995o = h1Var2.a();
                z1 d25 = d();
                y1 y1Var3 = d25 instanceof y1 ? (y1) d25 : null;
                if (y1Var3 == null) {
                    return;
                }
                y1 f16 = y1.f(y1Var3, null, null, 0.0d, 0.0d, null, l2.a(y1Var3.f106726f, null, null, null, 0.0f, h1Var2.a(), null, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE), 31);
                do {
                    value6 = t2Var.getValue();
                } while (!t2Var.h(value6, s.a((s) value6, f16, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                s();
                return;
            }
            m2 m2Var = ((s) a2Var.f55726a.getValue()).f86050f;
            q qVar = m2Var instanceof q ? (q) m2Var : null;
            if (qVar == null || (list = qVar.f86041d) == null) {
                h1Var = null;
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it2.next();
                    if (((h1) next).a() == this.f85995o) {
                        obj = next;
                        break;
                    }
                }
                h1Var = (h1) obj;
            }
            if (h1Var == null) {
                return;
            }
            List list4 = h1Var.f86008a.f78435b;
            if (list4.size() < 2) {
                return;
            }
            do {
                value7 = t2Var.getValue();
                sVar2 = (s) value7;
                tVar = new t(new s62.g(h1Var.f86010c));
                List list5 = list4;
                arrayList = new ArrayList(kotlin.collections.g0.q(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new j((k62.e) it3.next(), false));
                }
            } while (!t2Var.h(value7, s.a(sVar2, null, null, null, tVar, null, null, arrayList, null, false, 0.0f, null, 1975)));
            u();
            return;
        }
        boolean d26 = Intrinsics.d(event, s0.f86056a);
        LinkedHashMap linkedHashMap = this.f86001u;
        if (d26) {
            String str4 = this.f85993m;
            if (str4 == null) {
                return;
            }
            kg.p.i(linkedHashMap, str4, d1.f85970k);
            a();
            t();
            u();
            return;
        }
        if (event instanceof m0) {
            i(((m0) event).f86034a);
            return;
        }
        if ((event instanceof t0) || (event instanceof u0)) {
            return;
        }
        if (event instanceof a1) {
            float f17 = ((a1) event).f85955a;
            String str5 = this.f85993m;
            if (str5 != null) {
                k e15 = e();
                if (e15 == null) {
                    return;
                }
                r72.w0 w0Var2 = e15.f86021a;
                if (w0Var2 instanceof r72.p0) {
                    w0Var2 = r72.p0.d((r72.p0) w0Var2, f17);
                } else if (w0Var2 instanceof r72.r0) {
                    w0Var2 = r72.r0.d((r72.r0) w0Var2, (int) f17);
                }
                kg.p.i(linkedHashMap, str5, new e1(e15, w0Var2, 3));
                u();
                t();
                return;
            }
            z1 d27 = d();
            if (d27 == null || (f13 = f()) == null) {
                return;
            }
            g3 g3Var4 = f13.f86031a.f78436a;
            if (Intrinsics.d(g3Var4, d3.f106460b)) {
                d27 = kh2.w.v(d27, null, null, 0.0d, 0.0d, r72.k0.a(d27.a(), false, false, false, false, 0.0f, null, null, null, null, 0.0d, f17, null, 14335), 15);
            } else if (Intrinsics.d(g3Var4, e3.f106465b)) {
                d27 = kh2.w.v(d27, null, null, 0.0d, 0.0d, r72.k0.a(d27.a(), false, false, false, false, 0.0f, null, null, null, null, f17, 0.0d, null, 15359), 15);
            }
            do {
                value5 = t2Var.getValue();
            } while (!t2Var.h(value5, s.a((s) value5, d27, null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
            u();
            return;
        }
        if (event instanceof q0) {
            List list6 = ((q0) event).f86042a;
            String str6 = this.f85993m;
            if (str6 == null || (e14 = e()) == null) {
                return;
            }
            r72.w0 w0Var3 = e14.f86021a;
            if (w0Var3 instanceof r72.v0) {
                r72.v0 v0Var = (r72.v0) w0Var3;
                r72.u0 u0Var = (r72.u0) CollectionsKt.firstOrNull(list6);
                if (u0Var == null) {
                    u0Var = v0Var.f106695b;
                }
                w0Var3 = r72.v0.d(v0Var, u0Var);
            } else if (w0Var3 instanceof r72.t0) {
                r72.t0 t0Var = (r72.t0) w0Var3;
                w0Var3 = r72.t0.d(t0Var, list6.size() == 2 ? new r72.s0(((r72.u0) list6.get(0)).f106666a, ((r72.u0) list6.get(0)).f106667b, ((r72.u0) list6.get(1)).f106666a, ((r72.u0) list6.get(1)).f106667b) : t0Var.f106659b);
            }
            kg.p.i(linkedHashMap, str6, new e1(e14, w0Var3, i15));
            u();
            t();
            return;
        }
        if (event instanceof h0) {
            a aVar3 = ((h0) event).f86007a;
            f fVar = this.f85992l;
            int i16 = fVar == null ? -1 : c1.f85965a[fVar.ordinal()];
            if (i16 == 9) {
                z1 d28 = d();
                y1 y1Var4 = d28 instanceof y1 ? (y1) d28 : null;
                if (y1Var4 == null) {
                    return;
                }
                this.f85996p = aVar3.f85951a;
                do {
                    value3 = t2Var.getValue();
                } while (!t2Var.h(value3, s.a((s) value3, y1.f(y1Var4, null, null, 0.0d, 0.0d, null, l2.a(y1Var4.f106726f, null, aVar3.f85951a, null, 0.0f, null, null, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED), 31), null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                q();
                return;
            }
            if (i16 == 10) {
                z1 d29 = d();
                y1 y1Var5 = d29 instanceof y1 ? (y1) d29 : null;
                if (y1Var5 == null) {
                    return;
                }
                this.f85996p = aVar3.f85951a;
                do {
                    value4 = t2Var.getValue();
                } while (!t2Var.h(value4, s.a((s) value4, y1.f(y1Var5, null, null, 0.0d, 0.0d, null, l2.a(y1Var5.f106726f, null, null, aVar3.f85951a, 0.0f, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), 31), null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                q();
                return;
            }
            String str7 = this.f85993m;
            if (str7 == null || (e13 = e()) == null) {
                return;
            }
            r72.w0 w0Var4 = e13.f86021a;
            if (w0Var4 instanceof r72.n0) {
                int parseColor = Color.parseColor(aVar3.f85951a);
                this.f85996p = aVar3.f85951a;
                w0Var4 = r72.n0.d((r72.n0) w0Var4, parseColor);
            }
            kg.p.i(linkedHashMap, str7, new e1(e13, w0Var4, i13));
            p();
            u();
            t();
            return;
        }
        if (Intrinsics.d(event, r0.f86044a)) {
            f fVar2 = this.f85992l;
            if (fVar2 != null && c1.f85965a[fVar2.ordinal()] == 10) {
                z1 d33 = d();
                y1 y1Var6 = d33 instanceof y1 ? (y1) d33 : null;
                if (y1Var6 == null) {
                    return;
                }
                this.f85996p = null;
                do {
                    value2 = t2Var.getValue();
                } while (!t2Var.h(value2, s.a((s) value2, y1.f(y1Var6, null, null, 0.0d, 0.0d, null, l2.a(y1Var6.f106726f, null, null, null, 0.0f, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), 31), null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
                q();
                return;
            }
            return;
        }
        if (Intrinsics.d(event, i0.f86014a)) {
            return;
        }
        if (Intrinsics.d(event, y0.f86065a)) {
            g();
            return;
        }
        if (Intrinsics.d(event, z0.f86068a)) {
            this.f85991k = null;
            g();
            return;
        }
        if (!(event instanceof w0)) {
            if (event instanceof v0) {
                this.f85997q = ((v0) event).f86061a;
                return;
            }
            return;
        }
        float f18 = ((w0) event).f86062a;
        z1 d34 = d();
        y1 y1Var7 = d34 instanceof y1 ? (y1) d34 : null;
        if (y1Var7 == null) {
            return;
        }
        l2 l2Var3 = ((s) t2Var.getValue()).f86055k;
        while (true) {
            Object value14 = t2Var.getValue();
            l2Var = l2Var3;
            if (t2Var.h(value14, s.a((s) value14, y1.f(y1Var7, null, null, 0.0d, 0.0d, null, l2.a(y1Var7.f106726f, null, null, null, f18, null, null, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), 31), null, null, null, null, null, null, null, false, 0.0f, null, 2046))) {
                break;
            } else {
                l2Var3 = l2Var;
            }
        }
        do {
            value = t2Var.getValue();
            sVar = (s) value;
            if (l2Var != null) {
                String str8 = this.f85997q;
                if (str8 == null) {
                    str8 = "";
                }
                l2Var2 = l2.a(l2Var, str8, null, null, f18, null, null, false, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
            } else {
                l2Var2 = null;
            }
        } while (!t2Var.h(value, s.a(sVar, null, null, null, null, null, null, null, null, false, f18, l2Var2, 511)));
    }

    public final void k(String str) {
        yk2.g builder = new yk2.g();
        aa0.g gVar = (aa0.g) this.f85983c.f71635a;
        kotlin.collections.q0 transformationTools = gVar.f1629a;
        List shapeTools = (List) gVar.f1630b.getValue();
        List layerTools = (List) gVar.f1631c.getValue();
        List textAlignTools = (List) gVar.f1632d.getValue();
        Intrinsics.checkNotNullParameter(transformationTools, "transformationTools");
        Intrinsics.checkNotNullParameter(shapeTools, "shapeTools");
        Intrinsics.checkNotNullParameter(layerTools, "layerTools");
        Intrinsics.checkNotNullParameter(textAlignTools, "textAlignTools");
        builder.put(f.TRANSFORM, transformationTools);
        builder.put(f.SHAPE, shapeTools);
        f fVar = f.LAYER;
        ArrayList arrayList = new ArrayList();
        for (Object obj : layerTools) {
            if (!Intrinsics.d(((k62.g) obj).f78436a, q2.f106629b) || str != null) {
                arrayList.add(obj);
            }
        }
        builder.put(fVar, arrayList);
        builder.put(f.ALIGN, textAlignTools);
        Intrinsics.checkNotNullParameter(builder, "builder");
        yk2.g c13 = builder.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(c13.f139256i));
        for (Map.Entry entry : c13.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new k1((k62.g) it.next(), false, false));
            }
            linkedHashMap.put(key, arrayList2);
        }
        this.f85999s = linkedHashMap;
    }

    public final boolean l() {
        Object value;
        s sVar;
        r72.k0 a13;
        String str;
        Object value2;
        t2 t2Var = this.f85987g;
        if (((s) t2Var.getValue()).f86055k == null) {
            return false;
        }
        z1 d2 = d();
        y1 y1Var = d2 instanceof y1 ? (y1) d2 : null;
        if (y1Var == null) {
            return false;
        }
        do {
            value = t2Var.getValue();
            sVar = (s) value;
            a13 = r72.k0.a(y1Var.f106725e, false, false, false, false, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16379);
            str = this.f85997q;
            if (str == null) {
                str = "";
            }
        } while (!t2Var.h(value, s.a(sVar, y1.f(y1Var, null, null, 0.0d, 0.0d, a13, l2.a(y1Var.f106726f, str, null, null, 0.0f, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), 15), null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
        do {
            value2 = t2Var.getValue();
        } while (!t2Var.h(value2, s.a((s) value2, null, null, null, null, null, null, null, null, false, 0.0f, null, 1023)));
        this.f85997q = null;
        return true;
    }

    public final void n() {
        z1 z1Var;
        z1 d2 = d();
        if (d2 == null || (z1Var = this.f86003w) == null) {
            return;
        }
        boolean z13 = d2 instanceof y1;
        h62.k kVar = this.f85981a;
        boolean z14 = true;
        if (z13 && (z1Var instanceof y1) && ((y1) d2).f106726f.f106540a.length() == 0) {
            kVar.h(d2.b(), ((y1) z1Var).f106726f.f106540a.length() > 0);
        } else {
            kVar.k(d2.b(), true, new l62.k0(z14 ? 1 : 0, d2));
        }
    }

    public final void o(boolean z13) {
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        p pVar = m2Var instanceof p ? (p) m2Var : null;
        List list = pVar != null ? pVar.f86039d : null;
        if (list == null) {
            list = kotlin.collections.q0.f80391a;
        }
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((i) it.next()).f86013c) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            this.f85989i.a(new d0(i13, z13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [m62.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [m62.e] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [m62.a] */
    public final void p() {
        t2 t2Var = this.f85987g;
        List<??> list = ((s) t2Var.getValue()).f86052h;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (?? r33 : list) {
            if (r33 instanceof a) {
                r33 = (a) r33;
                boolean d2 = Intrinsics.d(this.f85996p, r33.f85951a);
                if (d2 != r33.f85952b) {
                    r33 = a.b(r33, d2);
                }
            }
            arrayList.add(r33);
        }
        while (true) {
            Object value = t2Var.getValue();
            ArrayList arrayList2 = arrayList;
            if (t2Var.h(value, s.a((s) value, null, null, null, null, null, null, null, arrayList, false, 0.0f, null, 1919))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [m62.e] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [m62.a] */
    /* JADX WARN: Type inference failed for: r3v8, types: [m62.a] */
    public final void q() {
        t2 t2Var;
        Object value;
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        o oVar = m2Var instanceof o ? (o) m2Var : null;
        if (oVar == null) {
            return;
        }
        List<??> list = oVar.f86036d;
        ArrayList colors = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (?? r33 : list) {
            if (r33 instanceof a) {
                r33 = (a) r33;
                boolean d2 = Intrinsics.d(this.f85996p, r33.f85951a);
                if (d2 != r33.f85952b) {
                    r33 = a.b(r33, d2);
                }
            }
            colors.add(r33);
        }
        do {
            t2Var = this.f85987g;
            value = t2Var.getValue();
            Intrinsics.checkNotNullParameter(colors, "colors");
        } while (!t2Var.h(value, s.a((s) value, null, null, null, null, null, new o(colors), null, null, false, 0.0f, null, 2015)));
    }

    public final void r() {
        t2 t2Var;
        Object value;
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        p pVar = m2Var instanceof p ? (p) m2Var : null;
        if (pVar == null) {
            return;
        }
        List<i> list = pVar.f86039d;
        ArrayList effects = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (i iVar : list) {
            String str = this.f85993m;
            boolean d2 = str == null ? false : Intrinsics.d(str, iVar.f86011a.a());
            boolean z13 = d2 != iVar.f86013c;
            LinkedHashMap linkedHashMap = this.f86001u;
            r72.j0 j0Var = iVar.f86011a;
            Map map = (Map) linkedHashMap.get(new r72.l0(j0Var.a()));
            if (map == null) {
                map = kotlin.collections.z0.d();
            }
            r72.j0 effect = kh2.m0.f(j0Var, map);
            boolean d13 = true ^ Intrinsics.d(effect, j0Var);
            if (z13 || d13) {
                Intrinsics.checkNotNullParameter(effect, "effect");
                k62.b metadata = iVar.f86012b;
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                iVar = new i(effect, metadata, d2);
            }
            effects.add(iVar);
        }
        do {
            t2Var = this.f85987g;
            value = t2Var.getValue();
            Intrinsics.checkNotNullParameter(effects, "effects");
        } while (!t2Var.h(value, s.a((s) value, null, null, null, null, null, new p(effects), null, null, false, 0.0f, null, 2015)));
        f fVar = this.f85992l;
        if (fVar != null) {
            this.f85998r.put(fVar, effects);
        }
    }

    public final void s() {
        t2 t2Var;
        Object value;
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        q qVar = m2Var instanceof q ? (q) m2Var : null;
        if (qVar == null) {
            return;
        }
        List<h1> list = qVar.f86041d;
        ArrayList fonts = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (h1 h1Var : list) {
            boolean z13 = this.f85995o == h1Var.a();
            if (z13 != h1Var.f86009b) {
                k62.f fontListing = h1Var.f86008a;
                Intrinsics.checkNotNullParameter(fontListing, "fontListing");
                h1Var = new h1(fontListing, z13);
            }
            fonts.add(h1Var);
        }
        do {
            t2Var = this.f85987g;
            value = t2Var.getValue();
            Intrinsics.checkNotNullParameter(fonts, "fonts");
        } while (!t2Var.h(value, s.a((s) value, null, null, null, null, null, new q(fonts), null, null, false, 0.0f, null, 2015)));
    }

    public final void t() {
        z1 d2;
        r72.i0 i0Var;
        r72.s sVar;
        r72.n nVar;
        r72.g gVar;
        t2 t2Var;
        Object value;
        i c13 = c();
        if (c13 == null || (d2 = d()) == null) {
            return;
        }
        r72.k0 a13 = d2.a();
        r72.j0 j0Var = c13.f86011a;
        r72.j0 h10 = kg.p.h(a13, j0Var.a());
        if (h10 != null) {
            j0Var = h10;
        }
        Map map = (Map) this.f86001u.get(new r72.l0(j0Var.a()));
        if (map == null) {
            map = kotlin.collections.z0.d();
        }
        r72.j0 effect = kh2.m0.f(j0Var, map);
        r72.k0 a14 = d2.a();
        Intrinsics.checkNotNullParameter(a14, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        r72.i0 i0Var2 = a14.f106519g;
        boolean z13 = effect instanceof r72.g;
        r72.n nVar2 = a14.f106520h;
        r72.s sVar2 = a14.f106521i;
        if (z13) {
            gVar = (r72.g) effect;
            i0Var = i0Var2;
            nVar = nVar2;
            sVar = sVar2;
        } else {
            boolean z14 = effect instanceof r72.i0;
            r72.g gVar2 = a14.f106518f;
            if (z14) {
                i0Var = (r72.i0) effect;
            } else if (effect instanceof r72.n) {
                nVar = (r72.n) effect;
                i0Var = i0Var2;
                sVar = sVar2;
                gVar = gVar2;
            } else if (effect instanceof r72.s) {
                sVar = (r72.s) effect;
                i0Var = i0Var2;
                nVar = nVar2;
                gVar = gVar2;
            } else {
                i0Var = i0Var2;
            }
            nVar = nVar2;
            sVar = sVar2;
            gVar = gVar2;
        }
        r72.k0 a15 = r72.k0.a(a14, false, false, false, false, 0.0f, gVar, i0Var, nVar, sVar, 0.0d, 0.0d, null, 15903);
        do {
            t2Var = this.f85987g;
            value = t2Var.getValue();
        } while (!t2Var.h(value, s.a((s) value, kh2.w.v(d2, null, null, 0.0d, 0.0d, a15, 15), null, null, null, null, null, null, null, false, 0.0f, null, 2046)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [m62.m] */
    /* JADX WARN: Type inference failed for: r2v13, types: [m62.m] */
    /* JADX WARN: Type inference failed for: r2v14, types: [m62.m] */
    /* JADX WARN: Type inference failed for: r2v16, types: [m62.m] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [m62.l] */
    /* JADX WARN: Type inference failed for: r2v7, types: [m62.n] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void u() {
        j jVar;
        k kVar;
        g1 g1Var = this;
        List<??> list = ((s) g1Var.f85988h.f55726a.getValue()).f86051g;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (?? r23 : list) {
            boolean z13 = r23 instanceof l;
            LinkedHashMap linkedHashMap = g1Var.f86001u;
            if (z13) {
                String str = g1Var.f85993m;
                if (str != null) {
                    Map map = (Map) linkedHashMap.get(new r72.l0(str));
                    if (map == null) {
                        map = kotlin.collections.z0.d();
                    }
                    Collection<r72.w0> values = map.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        for (r72.w0 w0Var : values) {
                            Intrinsics.checkNotNullParameter(w0Var, "<this>");
                            if (!Intrinsics.d(w0Var.c(), w0Var.a())) {
                                break;
                            }
                        }
                    }
                    if (g1Var.f85994n == null) {
                        r5 = true;
                    }
                    ((l) r23).getClass();
                    r23 = new l(r5);
                }
            } else if (r23 instanceof k) {
                String str2 = g1Var.f85993m;
                if (str2 != null) {
                    Map map2 = (Map) linkedHashMap.get(new r72.l0(str2));
                    r72.w0 setting = map2 != null ? (r72.w0) map2.get(((k) r23).f86021a.b()) : null;
                    boolean d2 = Intrinsics.d(((k) r23).f86021a.b(), g1Var.f85994n);
                    if (d2 == r23.b() && setting == null) {
                        kVar = (k) r23;
                    } else {
                        k kVar2 = (k) r23;
                        if (setting == null) {
                            setting = kVar2.f86021a;
                        }
                        Intrinsics.checkNotNullParameter(setting, "setting");
                        k62.d metadata = kVar2.f86022b;
                        Intrinsics.checkNotNullParameter(metadata, "metadata");
                        kVar = new k(setting, metadata, d2);
                    }
                    r23 = kVar;
                }
            } else if (r23 instanceof m) {
                z1 d13 = d();
                if (d13 != null) {
                    m mVar = (m) r23;
                    if (Intrinsics.d(mVar.f86031a.f78436a, b3.f106445b)) {
                        r72.k0 k0Var = r72.k0.f106512o;
                        if (d13.d() % 6.283185307179586d == 0.0d && d13.a().f106513a == k0Var.f106513a && d13.a().f106514b == k0Var.f106514b && d13.a().f106523k == k0Var.f106523k && d13.a().f106524l == k0Var.f106524l) {
                            r5 = true;
                        }
                        r23 = r5 != r23.b() ? m.c((m) r23, r5) : (m) r23;
                    } else {
                        boolean d14 = Intrinsics.d(mVar.f86031a.f78436a.f106489a, g1Var.f85994n);
                        r23 = d14 != r23.b() ? m.c((m) r23, d14) : (m) r23;
                    }
                }
            } else {
                if (!(r23 instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                z1 d15 = d();
                y1 y1Var = d15 instanceof y1 ? (y1) d15 : null;
                if (y1Var != null) {
                    r5 = ((j) r23).f86015a.f78432a == y1Var.f106726f.f106544e;
                    if (r5 != r23.b()) {
                        k62.e fontVariant = ((j) r23).f86015a;
                        Intrinsics.checkNotNullParameter(fontVariant, "fontVariant");
                        jVar = new j(fontVariant, r5);
                    } else {
                        jVar = (j) r23;
                    }
                    r23 = jVar;
                }
            }
            arrayList.add(r23);
        }
        while (true) {
            t2 t2Var = g1Var.f85987g;
            Object value = t2Var.getValue();
            if (t2Var.h(value, s.a((s) value, null, null, null, null, null, null, arrayList, null, false, 0.0f, null, 1983))) {
                return;
            } else {
                g1Var = this;
            }
        }
    }

    public final void v() {
        t2 t2Var;
        Object value;
        boolean z13;
        z1 d2 = d();
        if (d2 == null) {
            return;
        }
        m2 m2Var = ((s) this.f85988h.f55726a.getValue()).f86050f;
        r rVar = m2Var instanceof r ? (r) m2Var : null;
        if (rVar == null) {
            return;
        }
        List<k1> list = rVar.f86043d;
        ArrayList tools = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (k1 k1Var : list) {
            g3 g3Var = k1Var.f86026a.f78436a;
            boolean d13 = Intrinsics.d(g3Var, o2.f106608b);
            k62.g gVar = k1Var.f86026a;
            boolean z14 = k1Var.f86028c;
            if (d13) {
                boolean z15 = d2.a().f106516d;
                if (z15 != z14) {
                    k1Var = k1.a(k1Var, k62.g.a(gVar, z15 ? h62.p.effect_layer_unlock : h62.p.effect_layer_lock), false, z15, 2);
                }
            } else if (Intrinsics.d(g3Var, q2.f106629b)) {
                if ((d2 instanceof u1) && (z13 = ((u1) d2).f106681m) != z14) {
                    k1Var = k1.a(k1Var, k62.g.a(gVar, z13 ? h62.p.effect_layer_unsave : h62.p.effect_layer_save), false, z13, 2);
                }
            } else if ((g3Var instanceof y2) && (d2 instanceof y1)) {
                i2 i2Var = ((y1) d2).f106726f.f106545f;
                g3 g3Var2 = gVar.f78436a;
                boolean z16 = true;
                if (!Intrinsics.d(g3Var2, w2.f106701b) ? !Intrinsics.d(g3Var2, v2.f106699b) ? !Intrinsics.d(g3Var2, x2.f106708b) || i2Var != i2.RIGHT : i2Var != i2.CENTER : i2Var != i2.LEFT) {
                    z16 = false;
                }
                if (z16 != k1Var.f86027b) {
                    k1Var = k1.a(k1Var, null, z16, false, 5);
                }
            }
            tools.add(k1Var);
        }
        do {
            t2Var = this.f85987g;
            value = t2Var.getValue();
            Intrinsics.checkNotNullParameter(tools, "tools");
        } while (!t2Var.h(value, s.a((s) value, null, null, null, null, null, new r(tools), null, null, false, 0.0f, null, 2015)));
    }
}
