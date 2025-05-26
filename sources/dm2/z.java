package dm2;

import am2.i1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.q1;
import pn2.w1;

/* loaded from: classes2.dex */
public abstract class z extends p implements am2.x {
    public final am2.x A;
    public final am2.c B;
    public am2.x C;
    public Map D;

    /* renamed from: e, reason: collision with root package name */
    public List f55566e;

    /* renamed from: f, reason: collision with root package name */
    public List f55567f;

    /* renamed from: g, reason: collision with root package name */
    public pn2.b0 f55568g;

    /* renamed from: h, reason: collision with root package name */
    public List f55569h;

    /* renamed from: i, reason: collision with root package name */
    public d f55570i;

    /* renamed from: j, reason: collision with root package name */
    public d f55571j;

    /* renamed from: k, reason: collision with root package name */
    public am2.c0 f55572k;

    /* renamed from: l, reason: collision with root package name */
    public am2.q f55573l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f55574m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55575n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55576o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f55577p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f55578q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f55579r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f55580s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f55581t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f55582u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f55583v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f55584w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f55585x;

    /* renamed from: y, reason: collision with root package name */
    public Collection f55586y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Function0 f55587z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(am2.c cVar, am2.m mVar, am2.x xVar, am2.w0 w0Var, bm2.i iVar, ym2.g gVar) {
        super(mVar, iVar, gVar, w0Var);
        if (mVar == null) {
            X(0);
            throw null;
        }
        if (iVar == null) {
            X(1);
            throw null;
        }
        if (gVar == null) {
            X(2);
            throw null;
        }
        if (cVar == null) {
            X(3);
            throw null;
        }
        if (w0Var == null) {
            X(4);
            throw null;
        }
        this.f55573l = am2.s.f15581i;
        this.f55574m = false;
        this.f55575n = false;
        this.f55576o = false;
        this.f55577p = false;
        this.f55578q = false;
        this.f55579r = false;
        this.f55580s = false;
        this.f55581t = false;
        this.f55582u = false;
        this.f55583v = false;
        this.f55584w = true;
        this.f55585x = false;
        this.f55586y = null;
        this.f55587z = null;
        this.C = null;
        this.D = null;
        this.A = xVar == null ? this : xVar;
        this.B = cVar;
    }

    public static /* synthetic */ void X(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i14 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [dm2.b1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [am2.i1] */
    public static ArrayList x0(am2.x containingDeclaration, List list, q1 q1Var, boolean z13, boolean z14, boolean[] zArr) {
        if (list == null) {
            X(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r43 = (i1) it.next();
            c1 c1Var = (c1) r43;
            pn2.b0 type = c1Var.getType();
            w1 w1Var = w1.IN_VARIANCE;
            pn2.b0 outType = q1Var.l(type, w1Var);
            b1 b1Var = (b1) r43;
            pn2.b0 b0Var = b1Var.f55398j;
            pn2.b0 l13 = b0Var == null ? null : q1Var.l(b0Var, w1Var);
            if (outType == null) {
                return null;
            }
            if ((outType != c1Var.getType() || b0Var != l13) && zArr != null) {
                zArr[0] = true;
            }
            x xVar = r43 instanceof a1 ? new x(((a1) r43).w0()) : null;
            i1 i1Var = z13 ? null : r43;
            bm2.i annotations = ((bm2.b) r43).getAnnotations();
            ym2.g name = ((o) r43).getName();
            boolean r03 = b1Var.r0();
            am2.w0 source = z14 ? ((p) r43).b() : am2.w0.f15602a;
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            int i13 = b1Var.f55394f;
            boolean z15 = b1Var.f55396h;
            boolean z16 = b1Var.f55397i;
            arrayList.add(xVar == null ? new b1(containingDeclaration, i1Var, i13, annotations, name, outType, r03, z15, z16, l13, source) : new a1(containingDeclaration, i1Var, i13, annotations, name, outType, r03, z15, z16, l13, source, xVar));
        }
        return arrayList;
    }

    @Override // am2.b
    public final d A() {
        return this.f55571j;
    }

    public final void A0(am2.a aVar, Object obj) {
        if (this.D == null) {
            this.D = new LinkedHashMap();
        }
        this.D.put(aVar, obj);
    }

    public void B0(boolean z13) {
        this.f55584w = z13;
    }

    public void C0(boolean z13) {
        this.f55585x = z13;
    }

    @Override // am2.b
    public final d D() {
        return this.f55570i;
    }

    public final void D0(pn2.h0 h0Var) {
        if (h0Var != null) {
            this.f55568g = h0Var;
        } else {
            X(11);
            throw null;
        }
    }

    @Override // am2.b
    public Object K(km2.e eVar) {
        Map map = this.D;
        if (map == null) {
            return null;
        }
        return map.get(eVar);
    }

    @Override // am2.a0
    public final boolean M() {
        return this.f55580s;
    }

    @Override // am2.b
    public boolean V() {
        return this.f55585x;
    }

    @Override // am2.a0
    public final boolean Z() {
        return this.f55579r;
    }

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public am2.x o0() {
        am2.x xVar = this.A;
        am2.x o03 = xVar == this ? this : xVar.o0();
        if (o03 != null) {
            return o03;
        }
        X(20);
        throw null;
    }

    @Override // am2.d
    public final am2.c c() {
        am2.c cVar = this.B;
        if (cVar != null) {
            return cVar;
        }
        X(21);
        throw null;
    }

    @Override // am2.y0
    public am2.x d(q1 q1Var) {
        if (q1Var == null) {
            X(22);
            throw null;
        }
        if (q1Var.f100834a.f()) {
            return this;
        }
        y z03 = z0(q1Var);
        z03.f55546e = o0();
        z03.f55556o = true;
        z03.f55564w = true;
        return z03.f55565x.w0(z03);
    }

    @Override // am2.x
    public final am2.x f0() {
        return this.C;
    }

    public pn2.b0 getReturnType() {
        return this.f55568g;
    }

    @Override // am2.b
    public final List getTypeParameters() {
        List list = this.f55566e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        am2.q qVar = this.f55573l;
        if (qVar != null) {
            return qVar;
        }
        X(16);
        throw null;
    }

    public Collection h() {
        Function0 function0 = this.f55587z;
        if (function0 != null) {
            this.f55586y = (Collection) function0.invoke();
            this.f55587z = null;
        }
        Collection collection = this.f55586y;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        X(14);
        throw null;
    }

    @Override // am2.b
    public final List i0() {
        List list = this.f55569h;
        if (list != null) {
            return list;
        }
        X(13);
        throw null;
    }

    @Override // am2.a0
    public boolean isExternal() {
        return this.f55576o;
    }

    @Override // am2.x
    public final boolean isInfix() {
        if (this.f55575n) {
            return true;
        }
        Iterator it = o0().h().iterator();
        while (it.hasNext()) {
            if (((am2.x) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // am2.x
    public boolean isInline() {
        return this.f55577p;
    }

    @Override // am2.x
    public final boolean isOperator() {
        if (this.f55574m) {
            return true;
        }
        Iterator it = o0().h().iterator();
        while (it.hasNext()) {
            if (((am2.x) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // am2.x
    public boolean isSuspend() {
        return this.f55583v;
    }

    @Override // am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = this.f55572k;
        if (c0Var != null) {
            return c0Var;
        }
        X(15);
        throw null;
    }

    public Object l0(ul2.e eVar, Object obj) {
        return eVar.c(this, obj);
    }

    @Override // am2.x
    public final boolean m0() {
        return this.f55581t;
    }

    public void n0(Collection collection) {
        if (collection == null) {
            X(17);
            throw null;
        }
        this.f55586y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((am2.x) it.next()).p0()) {
                this.f55582u = true;
                return;
            }
        }
    }

    @Override // am2.x
    public final boolean p0() {
        return this.f55582u;
    }

    public am2.w q0() {
        return z0(q1.f100833b);
    }

    public final am2.x r0(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        am2.x build = q0().k(mVar).h(c0Var).i(rVar).j(cVar).e().build();
        if (build != null) {
            return build;
        }
        X(26);
        throw null;
    }

    @Override // am2.x
    public boolean t() {
        return this.f55578q;
    }

    public u0 u0(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        return (u0) r0(mVar, c0Var, rVar, cVar);
    }

    public abstract z v0(am2.c cVar, am2.m mVar, am2.x xVar, am2.w0 w0Var, bm2.i iVar, ym2.g gVar);

    public z w0(y yVar) {
        t0 t0Var;
        d dVar;
        pn2.b0 l13;
        if (yVar == null) {
            X(25);
            throw null;
        }
        int i13 = 1;
        boolean[] zArr = new boolean[1];
        bm2.i L = yVar.f55560s != null ? dl2.b.L(getAnnotations(), yVar.f55560s) : getAnnotations();
        am2.m mVar = yVar.f55543b;
        am2.x xVar = yVar.f55546e;
        am2.c cVar = yVar.f55547f;
        ym2.g gVar = yVar.f55553l;
        am2.w0 b13 = yVar.f55556o ? ((p) (xVar != null ? xVar : o0())).b() : am2.w0.f15602a;
        if (b13 == null) {
            X(27);
            throw null;
        }
        z v03 = v0(cVar, mVar, xVar, b13, L, gVar);
        List list = yVar.f55559r;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        q1 l14 = com.bumptech.glide.c.l1(list, yVar.f55542a, v03, arrayList, zArr);
        if (l14 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!yVar.f55549h.isEmpty()) {
            int i14 = 0;
            for (d dVar2 : yVar.f55549h) {
                pn2.b0 l15 = l14.l(dVar2.getType(), w1.IN_VARIANCE);
                if (l15 == null) {
                    return null;
                }
                jn2.b bVar = (jn2.b) ((jn2.e) dVar2.o0());
                int i15 = bVar.f77124b;
                int i16 = i14 + 1;
                arrayList2.add(dl2.b.P(v03, l15, bVar.f77125c, dVar2.getAnnotations(), i14));
                zArr[0] = zArr[0] | (l15 != dVar2.getType());
                i14 = i16;
            }
        }
        d dVar3 = yVar.f55550i;
        if (dVar3 != null) {
            pn2.b0 l16 = l14.l(dVar3.getType(), w1.IN_VARIANCE);
            if (l16 == null) {
                return null;
            }
            yVar.f55550i.o0();
            t0 t0Var2 = new t0(v03, new jn2.c(v03, l16), yVar.f55550i.getAnnotations());
            zArr[0] = (l16 != yVar.f55550i.getType()) | zArr[0];
            t0Var = t0Var2;
        } else {
            t0Var = null;
        }
        d dVar4 = yVar.f55551j;
        if (dVar4 != null) {
            d d2 = dVar4.d(l14);
            if (d2 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (d2 != yVar.f55551j);
            dVar = d2;
        } else {
            dVar = null;
        }
        ArrayList x03 = x0(v03, yVar.f55548g, l14, yVar.f55557p, yVar.f55556o, zArr);
        if (x03 == null || (l13 = l14.l(yVar.f55552k, w1.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z13 = zArr[0] | (l13 != yVar.f55552k);
        zArr[0] = z13;
        if (!z13 && yVar.f55564w) {
            return this;
        }
        v03.y0(t0Var, dVar, arrayList2, arrayList, x03, l13, yVar.f55544c, yVar.f55545d);
        v03.f55574m = this.f55574m;
        v03.f55575n = this.f55575n;
        v03.f55576o = this.f55576o;
        v03.f55577p = this.f55577p;
        v03.f55578q = this.f55578q;
        v03.f55583v = this.f55583v;
        v03.f55579r = this.f55579r;
        v03.f55580s = this.f55580s;
        v03.B0(this.f55584w);
        v03.f55581t = yVar.f55558q;
        v03.f55582u = yVar.f55561t;
        Boolean bool = yVar.f55563v;
        v03.C0(bool != null ? bool.booleanValue() : this.f55585x);
        if (!yVar.f55562u.isEmpty() || this.D != null) {
            LinkedHashMap linkedHashMap = yVar.f55562u;
            Map map = this.D;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                v03.D = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                v03.D = linkedHashMap;
            }
        }
        if (yVar.f55555n || this.C != null) {
            am2.x xVar2 = this.C;
            if (xVar2 == null) {
                xVar2 = this;
            }
            v03.C = xVar2.d(l14);
        }
        if (yVar.f55554m && !o0().h().isEmpty()) {
            if (yVar.f55542a.f()) {
                Function0 function0 = this.f55587z;
                if (function0 != null) {
                    v03.f55587z = function0;
                } else {
                    v03.n0(h());
                }
            } else {
                v03.f55587z = new s(i13, this, l14);
            }
        }
        return v03;
    }

    @Override // am2.b
    public final List x() {
        List list = this.f55567f;
        if (list != null) {
            return list;
        }
        X(19);
        throw null;
    }

    public void y0(t0 t0Var, d dVar, List list, List list2, List list3, pn2.b0 b0Var, am2.c0 c0Var, am2.q qVar) {
        if (list == null) {
            X(5);
            throw null;
        }
        if (list2 == null) {
            X(6);
            throw null;
        }
        if (list3 == null) {
            X(7);
            throw null;
        }
        if (qVar == null) {
            X(8);
            throw null;
        }
        this.f55566e = CollectionsKt.F0(list2);
        this.f55567f = CollectionsKt.F0(list3);
        this.f55568g = b0Var;
        this.f55572k = c0Var;
        this.f55573l = qVar;
        this.f55570i = t0Var;
        this.f55571j = dVar;
        this.f55569h = list;
        for (int i13 = 0; i13 < list2.size(); i13++) {
            am2.c1 c1Var = (am2.c1) list2.get(i13);
            if (c1Var.getIndex() != i13) {
                throw new IllegalStateException(c1Var + " index is " + c1Var.getIndex() + " but position is " + i13);
            }
        }
        for (int i14 = 0; i14 < list3.size(); i14++) {
            i1 i1Var = (i1) list3.get(i14);
            b1 b1Var = (b1) i1Var;
            if (b1Var.f55394f != i14) {
                throw new IllegalStateException(i1Var + "index is " + b1Var.f55394f + " but position is " + i14);
            }
        }
    }

    public final y z0(q1 q1Var) {
        if (q1Var != null) {
            return new y(this, q1Var.h(), g(), l(), getVisibility(), c(), x(), i0(), this.f55570i, getReturnType());
        }
        X(24);
        throw null;
    }
}
