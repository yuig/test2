package dm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.q1;
import ul2.e1;
import ul2.h1;
import ul2.u1;

/* loaded from: classes2.dex */
public class q0 extends c1 implements am2.r0 {
    public w A;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f55493f;

    /* renamed from: g, reason: collision with root package name */
    public on2.j f55494g;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f55495h;

    /* renamed from: i, reason: collision with root package name */
    public final am2.c0 f55496i;

    /* renamed from: j, reason: collision with root package name */
    public am2.q f55497j;

    /* renamed from: k, reason: collision with root package name */
    public Collection f55498k;

    /* renamed from: l, reason: collision with root package name */
    public final am2.r0 f55499l;

    /* renamed from: m, reason: collision with root package name */
    public final am2.c f55500m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f55501n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f55502o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f55503p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f55504q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f55505r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f55506s;

    /* renamed from: t, reason: collision with root package name */
    public List f55507t;

    /* renamed from: u, reason: collision with root package name */
    public d f55508u;

    /* renamed from: v, reason: collision with root package name */
    public d f55509v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f55510w;

    /* renamed from: x, reason: collision with root package name */
    public r0 f55511x;

    /* renamed from: y, reason: collision with root package name */
    public am2.t0 f55512y;

    /* renamed from: z, reason: collision with root package name */
    public w f55513z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(am2.m mVar, am2.r0 r0Var, bm2.i iVar, am2.c0 c0Var, am2.q qVar, boolean z13, ym2.g gVar, am2.c cVar, am2.w0 w0Var, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        super(mVar, iVar, gVar, null, w0Var);
        if (mVar == null) {
            X(0);
            throw null;
        }
        if (iVar == null) {
            X(1);
            throw null;
        }
        if (c0Var == null) {
            X(2);
            throw null;
        }
        if (qVar == null) {
            X(3);
            throw null;
        }
        if (gVar == null) {
            X(4);
            throw null;
        }
        if (cVar == null) {
            X(5);
            throw null;
        }
        if (w0Var == null) {
            X(6);
            throw null;
        }
        if (mVar == null) {
            r0(0);
            throw null;
        }
        if (iVar == null) {
            r0(1);
            throw null;
        }
        if (gVar == null) {
            r0(2);
            throw null;
        }
        if (w0Var == null) {
            r0(3);
            throw null;
        }
        this.f55493f = z13;
        this.f55498k = null;
        this.f55507t = Collections.emptyList();
        this.f55496i = c0Var;
        this.f55497j = qVar;
        this.f55499l = r0Var == null ? this : r0Var;
        this.f55500m = cVar;
        this.f55501n = z14;
        this.f55502o = z15;
        this.f55503p = z16;
        this.f55504q = z17;
        this.f55505r = z18;
        this.f55506s = z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void X(int r11) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.q0.X(int):void");
    }

    public static /* synthetic */ void r0(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "annotations";
        } else if (i13 == 2) {
            objArr[0] = "name";
        } else if (i13 == 3) {
            objArr[0] = "source";
        } else if (i13 == 4 || i13 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i13 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i13 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static q0 v0(am2.m mVar, am2.c0 c0Var, am2.r rVar, boolean z13, ym2.g gVar, am2.c cVar, am2.w0 w0Var) {
        bm2.g gVar2 = bm2.h.f23540a;
        if (mVar == null) {
            X(7);
            throw null;
        }
        if (c0Var == null) {
            X(9);
            throw null;
        }
        if (rVar == null) {
            X(10);
            throw null;
        }
        if (gVar == null) {
            X(11);
            throw null;
        }
        if (cVar == null) {
            X(12);
            throw null;
        }
        if (w0Var != null) {
            return new q0(mVar, null, gVar2, c0Var, rVar, z13, gVar, cVar, w0Var, false, false, false, false, false, false);
        }
        X(13);
        throw null;
    }

    public static am2.x x0(q1 q1Var, am2.q0 q0Var) {
        if (q0Var == null) {
            X(31);
            throw null;
        }
        am2.x xVar = ((o0) q0Var).f55479l;
        if (xVar != null) {
            return xVar.d(q1Var);
        }
        return null;
    }

    @Override // dm2.c1, am2.b
    public final d A() {
        return this.f55508u;
    }

    public void A0(pn2.b0 b0Var) {
    }

    public final void B0(pn2.b0 b0Var, List list, d dVar, t0 t0Var, List list2) {
        if (b0Var == null) {
            X(17);
            throw null;
        }
        if (list == null) {
            X(18);
            throw null;
        }
        if (list2 == null) {
            X(19);
            throw null;
        }
        this.f55406e = b0Var;
        this.f55510w = new ArrayList(list);
        this.f55509v = t0Var;
        this.f55508u = dVar;
        this.f55507t = list2;
    }

    @Override // am2.j1
    public final boolean C() {
        return this.f55493f;
    }

    @Override // dm2.c1, am2.b
    public final d D() {
        return this.f55509v;
    }

    @Override // am2.r0
    public final w E() {
        return this.A;
    }

    @Override // am2.b
    public Object K(km2.e eVar) {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return this.f55504q;
    }

    @Override // am2.a0
    public final boolean Z() {
        return this.f55503p;
    }

    @Override // am2.d
    public final am2.c c() {
        am2.c cVar = this.f55500m;
        if (cVar != null) {
            return cVar;
        }
        X(39);
        throw null;
    }

    @Override // am2.y0
    public final am2.r0 d(q1 q1Var) {
        if (q1Var == null) {
            X(27);
            throw null;
        }
        if (q1Var.f100834a.f()) {
            return this;
        }
        p0 p0Var = new p0(this);
        p0Var.f(q1Var.h());
        p0Var.e(o0());
        return p0Var.b();
    }

    @Override // am2.j1
    public final dn2.g d0() {
        on2.j jVar = this.f55494g;
        if (jVar != null) {
            return (dn2.g) jVar.invoke();
        }
        return null;
    }

    @Override // am2.r0
    public final r0 getGetter() {
        return this.f55511x;
    }

    @Override // dm2.c1, am2.b
    public final pn2.b0 getReturnType() {
        pn2.b0 type = getType();
        if (type != null) {
            return type;
        }
        X(23);
        throw null;
    }

    @Override // am2.r0
    public final am2.t0 getSetter() {
        return this.f55512y;
    }

    @Override // dm2.c1, am2.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f55510w;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        am2.q qVar = this.f55497j;
        if (qVar != null) {
            return qVar;
        }
        X(25);
        throw null;
    }

    @Override // am2.b
    public final Collection h() {
        Collection collection = this.f55498k;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        X(41);
        throw null;
    }

    @Override // am2.r0
    public final w h0() {
        return this.f55513z;
    }

    @Override // am2.b
    public final List i0() {
        List list = this.f55507t;
        if (list != null) {
            return list;
        }
        X(22);
        throw null;
    }

    @Override // am2.j1
    public boolean isConst() {
        return this.f55502o;
    }

    @Override // am2.a0
    public boolean isExternal() {
        return this.f55505r;
    }

    @Override // am2.j1
    public final boolean j0() {
        return this.f55501n;
    }

    @Override // am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = this.f55496i;
        if (c0Var != null) {
            return c0Var;
        }
        X(24);
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        Object b1Var;
        int i13 = eVar.f122512a;
        Object obj2 = eVar.f122513b;
        switch (i13) {
            case 0:
                Unit data = (Unit) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(data, "data");
                int i14 = (this.f55508u != null ? 1 : 0) + (this.f55509v != null ? 1 : 0);
                if (this.f55493f) {
                    if (i14 == 0) {
                        b1Var = new ul2.m0((ul2.i0) obj2, this);
                    } else {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                b1Var = new ul2.q0((ul2.i0) obj2, this);
                            }
                            throw new u1("Unsupported property: " + this);
                        }
                        b1Var = new ul2.o0((ul2.i0) obj2, this);
                    }
                    return b1Var;
                }
                if (i14 == 0) {
                    b1Var = new ul2.b1((ul2.i0) obj2, this);
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            b1Var = new h1((ul2.i0) obj2, this);
                        }
                        throw new u1("Unsupported property: " + this);
                    }
                    b1Var = new e1((ul2.i0) obj2, this);
                }
                return b1Var;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y.p((an2.y) obj2, this, builder);
                return Unit.f80348a;
        }
    }

    @Override // am2.r0
    public final ArrayList m() {
        ArrayList arrayList = new ArrayList(2);
        r0 r0Var = this.f55511x;
        if (r0Var != null) {
            arrayList.add(r0Var);
        }
        am2.t0 t0Var = this.f55512y;
        if (t0Var != null) {
            arrayList.add(t0Var);
        }
        return arrayList;
    }

    @Override // am2.d
    public final void n0(Collection collection) {
        if (collection != null) {
            this.f55498k = collection;
        } else {
            X(40);
            throw null;
        }
    }

    @Override // am2.r0
    public final boolean s() {
        return this.f55506s;
    }

    @Override // am2.d
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final q0 W(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        p0 p0Var = new p0(this);
        if (mVar == null) {
            p0.a(0);
            throw null;
        }
        p0Var.f55482a = mVar;
        p0Var.f55485d = null;
        p0Var.f55483b = c0Var;
        if (rVar == null) {
            p0.a(8);
            throw null;
        }
        p0Var.f55484c = rVar;
        if (cVar == null) {
            p0.a(10);
            throw null;
        }
        p0Var.f55486e = cVar;
        p0Var.f55488g = false;
        q0 b13 = p0Var.b();
        if (b13 != null) {
            return b13;
        }
        X(42);
        throw null;
    }

    public q0 w0(am2.m mVar, am2.c0 c0Var, am2.q qVar, am2.r0 r0Var, am2.c cVar, ym2.g gVar) {
        am2.v0 v0Var = am2.w0.f15602a;
        if (mVar == null) {
            X(32);
            throw null;
        }
        if (c0Var == null) {
            X(33);
            throw null;
        }
        if (qVar == null) {
            X(34);
            throw null;
        }
        if (cVar == null) {
            X(35);
            throw null;
        }
        if (gVar == null) {
            X(36);
            throw null;
        }
        bm2.i annotations = getAnnotations();
        boolean isConst = isConst();
        boolean isExternal = isExternal();
        return new q0(mVar, r0Var, annotations, c0Var, qVar, this.f55493f, gVar, cVar, v0Var, this.f55501n, isConst, this.f55503p, this.f55504q, isExternal, this.f55506s);
    }

    public final void y0(r0 r0Var, s0 s0Var, w wVar, w wVar2) {
        this.f55511x = r0Var;
        this.f55512y = s0Var;
        this.f55513z = wVar;
        this.A = wVar2;
    }

    public final void z0(on2.j jVar, Function0 function0) {
        if (function0 == null) {
            r0(5);
            throw null;
        }
        this.f55495h = function0;
        if (jVar == null) {
            jVar = (on2.j) function0.invoke();
        }
        this.f55494g = jVar;
    }

    @Override // dm2.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final am2.r0 o0() {
        am2.r0 r0Var = this.f55499l;
        am2.r0 o03 = r0Var == this ? this : r0Var.o0();
        if (o03 != null) {
            return o03;
        }
        X(38);
        throw null;
    }
}
