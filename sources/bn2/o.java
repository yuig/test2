package bn2;

import am2.i1;
import am2.r0;
import am2.t0;
import am2.x;
import ao2.m0;
import dm2.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.a1;
import pn2.b0;
import pn2.v1;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final List f23589c = CollectionsKt.F0(ServiceLoader.load(h.class, h.class.getClassLoader()));

    /* renamed from: d, reason: collision with root package name */
    public static final o f23590d;

    /* renamed from: e, reason: collision with root package name */
    public static final re2.h f23591e;

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i f23592a;

    /* renamed from: b, reason: collision with root package name */
    public final qn2.c f23593b;

    static {
        re2.h hVar = new re2.h(28);
        f23591e = hVar;
        f23590d = new o(hVar);
    }

    public o(qn2.c cVar) {
        qn2.h hVar = qn2.h.f104498a;
        if (cVar == null) {
            a(5);
            throw null;
        }
        this.f23593b = cVar;
        this.f23592a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.a(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(am2.c1 r4, am2.c1 r5, pn2.a1 r6) {
        /*
            r0 = 0
            if (r4 == 0) goto L51
            if (r5 == 0) goto L4b
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L1e
            return r2
        L1e:
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r4.next()
            pn2.b0 r5 = (pn2.b0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L32:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r1.next()
            pn2.b0 r3 = (pn2.b0) r3
            boolean r3 = c(r5, r3, r6)
            if (r3 == 0) goto L32
            r1.remove()
            goto L22
        L48:
            return r2
        L49:
            r4 = 1
            return r4
        L4b:
            r4 = 50
            a(r4)
            throw r0
        L51:
            r4 = 49
            a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.b(am2.c1, am2.c1, pn2.a1):boolean");
    }

    public static boolean c(b0 b0Var, b0 b0Var2, a1 a1Var) {
        if (b0Var == null) {
            a(46);
            throw null;
        }
        if (b0Var2 == null) {
            a(47);
            throw null;
        }
        if (m0.U(b0Var) && m0.U(b0Var2)) {
            return true;
        }
        return pn2.g.g(a1Var, b0Var.z0(), b0Var2.z0());
    }

    public static void d(am2.d dVar, LinkedHashSet linkedHashSet) {
        if (dVar == null) {
            a(17);
            throw null;
        }
        if (dVar.c().isReal()) {
            linkedHashSet.add(dVar);
            return;
        }
        if (dVar.h().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + dVar);
        }
        Iterator it = dVar.h().iterator();
        while (it.hasNext()) {
            d((am2.d) it.next(), linkedHashSet);
        }
    }

    public static ArrayList e(am2.b bVar) {
        dm2.d D = bVar.D();
        ArrayList arrayList = new ArrayList();
        if (D != null) {
            arrayList.add(D.getType());
        }
        Iterator it = bVar.x().iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) ((i1) it.next())).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0165, code lost:
    
        if (r3 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0167, code lost:
    
        r0 = am2.s.f15580h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016c, code lost:
    
        r12 = ((am2.d) u(r11, new ym2.d(1))).W(r12, r1, r0, am2.c.FAKE_OVERRIDE);
        r13.w0(r12, r11);
        r13.f(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0183, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016a, code lost:
    
        r0 = am2.s.f15579g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(java.util.Collection r11, am2.g r12, com.bumptech.glide.d r13) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.f(java.util.Collection, am2.g, com.bumptech.glide.d):void");
    }

    public static ArrayList h(Object obj, LinkedList linkedList, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        am2.b bVar = (am2.b) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            am2.b bVar2 = (am2.b) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                m k13 = k(bVar, bVar2);
                if (k13 == m.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (k13 == m.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static n j(am2.b bVar, am2.b bVar2) {
        boolean z13;
        if (bVar == null) {
            a(40);
            throw null;
        }
        if (bVar2 == null) {
            a(41);
            throw null;
        }
        boolean z14 = bVar instanceof x;
        if ((z14 && !(bVar2 instanceof x)) || (((z13 = bVar instanceof r0)) && !(bVar2 instanceof r0))) {
            return n.d("Member kind mismatch");
        }
        if (!z14 && !z13) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return n.d("Name mismatch");
        }
        n d2 = (bVar.D() == null) != (bVar2.D() == null) ? n.d("Receiver presence mismatch") : bVar.x().size() != bVar2.x().size() ? n.d("Value parameter number mismatch") : null;
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    public static m k(am2.b bVar, am2.b bVar2) {
        o oVar = f23590d;
        m c13 = oVar.n(bVar2, bVar, null).c();
        m c14 = oVar.n(bVar, bVar2, null).c();
        m mVar = m.OVERRIDABLE;
        if (c13 == mVar && c14 == mVar) {
            return mVar;
        }
        m mVar2 = m.CONFLICT;
        return (c13 == mVar2 || c14 == mVar2) ? mVar2 : m.INCOMPATIBLE;
    }

    public static boolean l(t0 t0Var, t0 t0Var2) {
        if (t0Var == null || t0Var2 == null) {
            return true;
        }
        return r(t0Var, t0Var2);
    }

    public static boolean m(am2.b bVar, am2.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 == null) {
            a(68);
            throw null;
        }
        b0 returnType = bVar.getReturnType();
        b0 returnType2 = bVar2.getReturnType();
        if (!r(bVar, bVar2)) {
            return false;
        }
        a1 g13 = f23590d.g(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof x) {
            return q(bVar, returnType, bVar2, returnType2, g13);
        }
        if (!(bVar instanceof r0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        r0 r0Var = (r0) bVar;
        r0 r0Var2 = (r0) bVar2;
        if (l(r0Var.getSetter(), r0Var2.getSetter())) {
            return (r0Var.C() && r0Var2.C()) ? pn2.g.g(g13, returnType.z0(), returnType2.z0()) : (r0Var.C() || !r0Var2.C()) && q(bVar, returnType, bVar2, returnType2, g13);
        }
        return false;
    }

    public static boolean q(am2.b bVar, b0 b0Var, am2.b bVar2, b0 b0Var2, a1 state) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (b0Var == null) {
            a(74);
            throw null;
        }
        if (bVar2 == null) {
            a(75);
            throw null;
        }
        if (b0Var2 == null) {
            a(76);
            throw null;
        }
        pn2.g gVar = pn2.g.f100796a;
        v1 subType = b0Var.z0();
        v1 superType = b0Var2.z0();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return pn2.g.n(gVar, state, subType, superType);
    }

    public static boolean r(am2.p pVar, am2.p pVar2) {
        if (pVar == null) {
            a(69);
            throw null;
        }
        if (pVar2 != null) {
            Integer b13 = am2.s.b(pVar.getVisibility(), pVar2.getVisibility());
            return b13 == null || b13.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean s(am2.b bVar, am2.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean equals = bVar.equals(bVar2);
        c cVar = c.f23578a;
        if (!equals && cVar.a(bVar.o0(), bVar2.o0(), false, true)) {
            return true;
        }
        am2.b o03 = bVar2.o0();
        int i13 = e.f23579a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(bVar.o0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.a(o03, (am2.b) it.next(), false, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(am2.d r6, kotlin.jvm.functions.Function1 r7) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.t(am2.d, kotlin.jvm.functions.Function1):void");
    }

    public static Object u(Collection collection, Function1 transform) {
        Object obj;
        if (collection.size() == 1) {
            Object R = CollectionsKt.R(collection);
            if (R != null) {
                return R;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList2 = new ArrayList(g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(transform.invoke(it.next()));
        }
        Object R2 = CollectionsKt.R(collection);
        am2.b bVar = (am2.b) transform.invoke(R2);
        for (Object obj2 : collection) {
            am2.b bVar2 = (am2.b) transform.invoke(obj2);
            if (bVar2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj2);
                    break;
                }
                if (!m(bVar2, (am2.b) it2.next())) {
                    break;
                }
            }
            if (m(bVar2, bVar) && !m(bVar, bVar2)) {
                R2 = obj2;
            }
        }
        if (arrayList.isEmpty()) {
            if (R2 != null) {
                return R2;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object R3 = CollectionsKt.R(arrayList);
            if (R3 != null) {
                return R3;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (!dl2.b.J1(((am2.b) transform.invoke(obj)).getReturnType())) {
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        Object R4 = CollectionsKt.R(arrayList);
        if (R4 != null) {
            return R4;
        }
        a(84);
        throw null;
    }

    public final a1 g(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean isEmpty = list.isEmpty();
        qn2.e kotlinTypePreparator = qn2.e.f104497a;
        qn2.c cVar = this.f23593b;
        if (isEmpty) {
            qn2.i kotlinTypeRefiner = this.f23592a;
            p typeSystemContext = new p(null, cVar, kotlinTypeRefiner);
            Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
            Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return new a1(true, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
        }
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < list.size(); i13++) {
            hashMap.put(((am2.c1) list.get(i13)).e(), ((am2.c1) list2.get(i13)).e());
        }
        qn2.i kotlinTypeRefiner2 = this.f23592a;
        p typeSystemContext2 = new p(hashMap, cVar, kotlinTypeRefiner2);
        Intrinsics.checkNotNullParameter(typeSystemContext2, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "kotlinTypeRefiner");
        return new a1(true, true, typeSystemContext2, kotlinTypePreparator, kotlinTypeRefiner2);
    }

    public final void i(ym2.g gVar, Collection collection, Collection collection2, am2.g gVar2, com.bumptech.glide.d dVar) {
        Integer b13;
        if (gVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (gVar2 == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            am2.d fromCurrent = (am2.d) it.next();
            if (fromCurrent == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            wn2.i iVar = new wn2.i();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                am2.d fromSuper = (am2.d) it2.next();
                m c13 = n(fromSuper, fromCurrent, gVar2).c();
                boolean z13 = !am2.s.e(fromSuper.getVisibility()) && am2.s.c(am2.s.f15585m, fromSuper, fromCurrent) == null;
                int i13 = l.f23585b[c13.ordinal()];
                if (i13 == 1) {
                    if (z13) {
                        iVar.add(fromSuper);
                    }
                    arrayList.add(fromSuper);
                } else if (i13 == 2) {
                    if (z13) {
                        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                        dVar.x(fromSuper, fromCurrent);
                    }
                    arrayList.add(fromSuper);
                }
            }
            dVar.w0(fromCurrent, iVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            xl2.i predicate = new xl2.i(((am2.d) linkedHashSet.iterator().next()).g(), 3);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) predicate.invoke(it3.next())).booleanValue()) {
                        LinkedList<am2.d> descriptors = new LinkedList(linkedHashSet);
                        while (!descriptors.isEmpty()) {
                            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
                            descriptors.isEmpty();
                            am2.d dVar2 = null;
                            for (am2.d dVar3 : descriptors) {
                                if (dVar2 == null || ((b13 = am2.s.b(dVar2.getVisibility(), dVar3.getVisibility())) != null && b13.intValue() < 0)) {
                                    dVar2 = dVar3;
                                }
                            }
                            Intrinsics.f(dVar2);
                            f(h(dVar2, descriptors, new ym2.d(2), new k(dVar, dVar2)), gVar2, dVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            f(Collections.singleton((am2.d) it4.next()), gVar2, dVar);
        }
    }

    public final n n(am2.b bVar, am2.b bVar2, am2.g gVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 == null) {
            a(20);
            throw null;
        }
        n o13 = o(bVar, bVar2, gVar, false);
        if (o13 != null) {
            return o13;
        }
        a(21);
        throw null;
    }

    public final n o(am2.b bVar, am2.b bVar2, am2.g gVar, boolean z13) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        n p13 = p(bVar, bVar2, z13);
        boolean z14 = p13.c() == m.OVERRIDABLE;
        List<h> list = f23589c;
        for (h hVar : list) {
            if (hVar.b() != f.CONFLICTS_ONLY && (!z14 || hVar.b() != f.SUCCESS_ONLY)) {
                int i13 = l.f23584a[hVar.a(bVar, bVar2, gVar).ordinal()];
                if (i13 == 1) {
                    z14 = true;
                } else {
                    if (i13 == 2) {
                        return n.b("External condition failed");
                    }
                    if (i13 == 3) {
                        return n.d("External condition");
                    }
                }
            }
        }
        if (!z14) {
            return p13;
        }
        for (h hVar2 : list) {
            if (hVar2.b() == f.CONFLICTS_ONLY) {
                int i14 = l.f23584a[hVar2.a(bVar, bVar2, gVar).ordinal()];
                if (i14 == 1) {
                    throw new IllegalStateException("Contract violation in " + hVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i14 == 2) {
                    return n.b("External condition failed");
                }
                if (i14 == 3) {
                    return n.d("External condition");
                }
            }
        }
        n nVar = n.f23587b;
        if (nVar != null) {
            return nVar;
        }
        n.a(0);
        throw null;
    }

    public final n p(am2.b bVar, am2.b bVar2, boolean z13) {
        if (bVar == null) {
            a(30);
            throw null;
        }
        if (bVar2 == null) {
            a(31);
            throw null;
        }
        n j13 = j(bVar, bVar2);
        if (j13 != null) {
            return j13;
        }
        ArrayList e13 = e(bVar);
        ArrayList e14 = e(bVar2);
        List typeParameters = bVar.getTypeParameters();
        List typeParameters2 = bVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i13 = 0; i13 < e13.size(); i13++) {
                if (!qn2.d.f104496a.a((b0) e13.get(i13), (b0) e14.get(i13))) {
                    return n.d("Type parameter number mismatch");
                }
            }
            return n.b("Type parameter number mismatch");
        }
        a1 state = g(typeParameters, typeParameters2);
        for (int i14 = 0; i14 < typeParameters.size(); i14++) {
            if (!b((am2.c1) typeParameters.get(i14), (am2.c1) typeParameters2.get(i14), state)) {
                return n.d("Type parameter bounds mismatch");
            }
        }
        for (int i15 = 0; i15 < e13.size(); i15++) {
            if (!c((b0) e13.get(i15), (b0) e14.get(i15), state)) {
                return n.d("Value parameter type mismatch");
            }
        }
        if ((bVar instanceof x) && (bVar2 instanceof x) && ((x) bVar).isSuspend() != ((x) bVar2).isSuspend()) {
            return n.b("Incompatible suspendability");
        }
        if (z13) {
            b0 returnType = bVar.getReturnType();
            b0 returnType2 = bVar2.getReturnType();
            if (returnType != null && returnType2 != null && (!m0.U(returnType2) || !m0.U(returnType))) {
                pn2.g gVar = pn2.g.f100796a;
                v1 subType = returnType2.z0();
                v1 superType = returnType.z0();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(subType, "subType");
                Intrinsics.checkNotNullParameter(superType, "superType");
                if (!pn2.g.n(gVar, state, subType, superType)) {
                    return n.b("Return type mismatch");
                }
            }
        }
        n nVar = n.f23587b;
        if (nVar != null) {
            return nVar;
        }
        n.a(0);
        throw null;
    }
}
