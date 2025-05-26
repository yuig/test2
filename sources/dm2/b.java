package dm2;

import java.util.Collections;
import java.util.List;
import pn2.l1;
import pn2.q1;

/* loaded from: classes2.dex */
public abstract class b extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.g f55388a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.l f55389b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.l f55390c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f55391d;

    public b(on2.u uVar, ym2.g gVar) {
        int i13 = 0;
        if (uVar == null) {
            o0(0);
            throw null;
        }
        int i14 = 1;
        if (gVar == null) {
            o0(1);
            throw null;
        }
        this.f55388a = gVar;
        on2.q qVar = (on2.q) uVar;
        this.f55389b = new on2.l(qVar, new a(this, i13));
        this.f55390c = new on2.l(qVar, new a(this, i14));
        this.f55391d = new on2.l(qVar, new a(this, 2));
    }

    public static /* synthetic */ void o0(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i13 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i13 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i13 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i13 == 19) {
            objArr[1] = "substitute";
        } else if (i13 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 6 && i13 != 9 && i13 != 12 && i13 != 14 && i13 != 16 && i13 != 17 && i13 != 19 && i13 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // am2.g
    public final in2.n G(l1 l1Var) {
        if (l1Var == null) {
            o0(15);
            throw null;
        }
        fn2.d.i(bn2.e.d(this));
        in2.n X = X(l1Var, qn2.h.f104498a);
        if (X != null) {
            return X;
        }
        o0(16);
        throw null;
    }

    @Override // am2.g
    public in2.n I() {
        in2.n nVar = (in2.n) this.f55390c.invoke();
        if (nVar != null) {
            return nVar;
        }
        o0(4);
        throw null;
    }

    @Override // am2.g
    public in2.n L() {
        fn2.d.i(bn2.e.d(this));
        in2.n a03 = a0(qn2.h.f104498a);
        if (a03 != null) {
            return a03;
        }
        o0(17);
        throw null;
    }

    @Override // am2.g
    public List N() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(6);
        throw null;
    }

    @Override // dm2.f0
    public in2.n X(l1 l1Var, qn2.i iVar) {
        if (l1Var == null) {
            o0(10);
            throw null;
        }
        if (!l1Var.f()) {
            return new in2.s(a0(iVar), q1.e(l1Var));
        }
        in2.n a03 = a0(iVar);
        if (a03 != null) {
            return a03;
        }
        o0(12);
        throw null;
    }

    @Override // dm2.f0, am2.g, am2.m
    /* renamed from: a */
    public final am2.g o0() {
        return this;
    }

    @Override // am2.m
    public final ym2.g getName() {
        ym2.g gVar = this.f55388a;
        if (gVar != null) {
            return gVar;
        }
        o0(2);
        throw null;
    }

    @Override // am2.g, am2.j
    public final pn2.h0 j() {
        pn2.h0 h0Var = (pn2.h0) this.f55389b.invoke();
        if (h0Var != null) {
            return h0Var;
        }
        o0(20);
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        return eVar.b(this, obj);
    }

    @Override // am2.y0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public am2.g d(q1 q1Var) {
        if (q1Var != null) {
            return q1Var.f100834a.f() ? this : new e0(this, q1Var);
        }
        o0(18);
        throw null;
    }

    @Override // am2.g
    public final d t0() {
        d dVar = (d) this.f55391d.invoke();
        if (dVar != null) {
            return dVar;
        }
        o0(5);
        throw null;
    }

    @Override // dm2.f0, am2.g, am2.m
    /* renamed from: a */
    public final am2.j o0() {
        return this;
    }

    @Override // dm2.f0, am2.m
    /* renamed from: a */
    public final am2.m o0() {
        return this;
    }
}
