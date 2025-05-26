package dm2;

import am2.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.l1;
import pn2.q1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public am2.m f55482a;

    /* renamed from: b, reason: collision with root package name */
    public am2.c0 f55483b;

    /* renamed from: c, reason: collision with root package name */
    public am2.q f55484c;

    /* renamed from: e, reason: collision with root package name */
    public am2.c f55486e;

    /* renamed from: h, reason: collision with root package name */
    public final d f55489h;

    /* renamed from: i, reason: collision with root package name */
    public final ym2.g f55490i;

    /* renamed from: j, reason: collision with root package name */
    public final pn2.b0 f55491j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q0 f55492k;

    /* renamed from: d, reason: collision with root package name */
    public am2.r0 f55485d = null;

    /* renamed from: f, reason: collision with root package name */
    public l1 f55487f = l1.f100816a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55488g = true;

    public p0(q0 q0Var) {
        this.f55492k = q0Var;
        this.f55482a = q0Var.g();
        this.f55483b = q0Var.l();
        this.f55484c = q0Var.getVisibility();
        this.f55486e = q0Var.c();
        this.f55489h = q0Var.f55508u;
        this.f55490i = q0Var.getName();
        this.f55491j = q0Var.getType();
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 7 || i13 == 9 || i13 == 11 || i13 == 19 || i13 == 13 || i13 == 14 || i13 == 16 || i13 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 7 || i13 == 9 || i13 == 11 || i13 == 19 || i13 == 13 || i13 == 14 || i13 == 16 || i13 == 17) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "setOwner";
        } else if (i13 == 2) {
            objArr[1] = "setOriginal";
        } else if (i13 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i13 == 5) {
            objArr[1] = "setReturnType";
        } else if (i13 == 7) {
            objArr[1] = "setModality";
        } else if (i13 == 9) {
            objArr[1] = "setVisibility";
        } else if (i13 == 11) {
            objArr[1] = "setKind";
        } else if (i13 == 19) {
            objArr[1] = "setName";
        } else if (i13 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i13 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i13 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i13 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 5 && i13 != 7 && i13 != 9 && i13 != 11 && i13 != 19 && i13 != 13 && i13 != 14 && i13 != 16 && i13 != 17) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final q0 b() {
        d dVar;
        t0 t0Var;
        r0 r0Var;
        s0 s0Var;
        Function0 function0;
        t0 t0Var2;
        t0 t0Var3;
        q0 q0Var = this.f55492k;
        q0Var.getClass();
        am2.m mVar = this.f55482a;
        am2.c0 c0Var = this.f55483b;
        am2.q qVar = this.f55484c;
        am2.r0 r0Var2 = this.f55485d;
        am2.c cVar = this.f55486e;
        ym2.g gVar = this.f55490i;
        am2.v0 v0Var = am2.w0.f15602a;
        q0 w03 = q0Var.w0(mVar, c0Var, qVar, r0Var2, cVar, gVar);
        List typeParameters = q0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        q1 k13 = com.bumptech.glide.c.k1(typeParameters, this.f55487f, w03, arrayList);
        pn2.b0 b0Var = this.f55491j;
        pn2.b0 l13 = k13.l(b0Var, w1.OUT_VARIANCE);
        if (l13 != null) {
            w1 w1Var = w1.IN_VARIANCE;
            pn2.b0 l14 = k13.l(b0Var, w1Var);
            if (l14 != null) {
                w03.A0(l14);
            }
            d dVar2 = this.f55489h;
            if (dVar2 != null) {
                d d2 = dVar2.d(k13);
                dVar = d2 != null ? d2 : null;
            }
            d dVar3 = q0Var.f55509v;
            if (dVar3 != null) {
                pn2.b0 l15 = k13.l(dVar3.getType(), w1Var);
                if (l15 == null) {
                    t0Var3 = null;
                } else {
                    dVar3.o0();
                    t0Var3 = new t0(w03, new jn2.c(w03, l15), dVar3.getAnnotations());
                }
                t0Var = t0Var3;
            } else {
                t0Var = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (d dVar4 : q0Var.f55507t) {
                pn2.b0 l16 = k13.l(dVar4.getType(), w1.IN_VARIANCE);
                if (l16 == null) {
                    t0Var2 = null;
                } else {
                    jn2.b bVar = (jn2.b) ((jn2.e) dVar4.o0());
                    int i13 = bVar.f77124b;
                    dVar4.o0();
                    t0Var2 = new t0(w03, new jn2.b(w03, l16, bVar.f77125c), dVar4.getAnnotations());
                }
                if (t0Var2 != null) {
                    arrayList2.add(t0Var2);
                }
            }
            w03.B0(l13, arrayList, dVar, t0Var, arrayList2);
            r0 r0Var3 = q0Var.f55511x;
            if (r0Var3 == null) {
                r0Var = null;
            } else {
                bm2.i annotations = r0Var3.getAnnotations();
                am2.c0 c0Var2 = this.f55483b;
                am2.q visibility = q0Var.f55511x.getVisibility();
                if (this.f55486e == am2.c.FAKE_OVERRIDE) {
                    am2.q g13 = am2.s.g(visibility.f15569a.c());
                    Intrinsics.checkNotNullExpressionValue(g13, "toDescriptorVisibility(...)");
                    if (am2.s.e(g13)) {
                        visibility = am2.s.f15580h;
                    }
                }
                am2.q qVar2 = visibility;
                r0 r0Var4 = q0Var.f55511x;
                r0Var = new r0(w03, annotations, c0Var2, qVar2, r0Var4.f55472e, r0Var4.f55473f, r0Var4.f55476i, this.f55486e, c(), v0Var);
            }
            if (r0Var != null) {
                r0 r0Var5 = q0Var.f55511x;
                pn2.b0 b0Var2 = r0Var5.f55517m;
                r0Var.f55479l = q0.x0(k13, r0Var5);
                r0Var.w0(b0Var2 != null ? k13.l(b0Var2, w1.OUT_VARIANCE) : null);
            }
            Object obj = q0Var.f55512y;
            if (obj == null) {
                s0Var = null;
            } else {
                bm2.i annotations2 = ((bm2.b) obj).getAnnotations();
                am2.c0 c0Var3 = this.f55483b;
                am2.q visibility2 = ((o0) q0Var.f55512y).getVisibility();
                if (this.f55486e == am2.c.FAKE_OVERRIDE) {
                    am2.q g14 = am2.s.g(visibility2.f15569a.c());
                    Intrinsics.checkNotNullExpressionValue(g14, "toDescriptorVisibility(...)");
                    if (am2.s.e(g14)) {
                        visibility2 = am2.s.f15580h;
                    }
                }
                am2.q qVar3 = visibility2;
                o0 o0Var = (o0) q0Var.f55512y;
                s0Var = new s0(w03, annotations2, c0Var3, qVar3, o0Var.f55472e, o0Var.f55473f, o0Var.f55476i, this.f55486e, d(), v0Var);
            }
            if (s0Var != null) {
                List x03 = z.x0(s0Var, ((s0) q0Var.f55512y).x(), k13, false, false, null);
                if (x03 == null) {
                    x03 = Collections.singletonList(s0.v0(s0Var, fn2.d.e(this.f55482a).o(), ((bm2.b) ((i1) ((s0) q0Var.f55512y).x().get(0))).getAnnotations()));
                }
                if (x03.size() != 1) {
                    throw new IllegalStateException();
                }
                s0Var.f55479l = q0.x0(k13, q0Var.f55512y);
                s0Var.x0((i1) x03.get(0));
            }
            w wVar = q0Var.f55513z;
            w wVar2 = wVar == null ? null : new w(w03, wVar.getAnnotations());
            w wVar3 = q0Var.A;
            w03.y0(r0Var, s0Var, wVar2, wVar3 == null ? null : new w(w03, wVar3.getAnnotations()));
            if (this.f55488g) {
                wn2.i iVar = new wn2.i();
                Iterator it = q0Var.h().iterator();
                while (it.hasNext()) {
                    iVar.add(((am2.r0) it.next()).d(k13));
                }
                w03.n0(iVar);
            }
            if (!q0Var.isConst() || (function0 = q0Var.f55495h) == null) {
                return w03;
            }
            w03.z0(q0Var.f55494g, function0);
            return w03;
        }
        return null;
    }

    public final am2.s0 c() {
        am2.r0 r0Var = this.f55485d;
        if (r0Var == null) {
            return null;
        }
        return r0Var.getGetter();
    }

    public final am2.t0 d() {
        am2.r0 r0Var = this.f55485d;
        if (r0Var == null) {
            return null;
        }
        return r0Var.getSetter();
    }

    public final void e(am2.r0 r0Var) {
        this.f55485d = r0Var;
    }

    public final void f(l1 l1Var) {
        if (l1Var != null) {
            this.f55487f = l1Var;
        } else {
            a(15);
            throw null;
        }
    }
}
