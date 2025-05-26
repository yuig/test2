package dm2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends pn2.l {

    /* renamed from: c, reason: collision with root package name */
    public final am2.a1 f55429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f55430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, on2.u uVar, am2.a1 a1Var) {
        super(uVar);
        if (uVar == null) {
            p(0);
            throw null;
        }
        this.f55430d = jVar;
        this.f55429c = a1Var;
    }

    public static /* synthetic */ void p(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i13 == 2) {
            objArr[1] = "getParameters";
        } else if (i13 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i13 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i13 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // pn2.b1
    public final am2.j b() {
        j jVar = this.f55430d;
        if (jVar != null) {
            return jVar;
        }
        p(3);
        throw null;
    }

    @Override // pn2.b1
    public final boolean d() {
        return true;
    }

    @Override // pn2.l
    public final Collection e() {
        List v03 = this.f55430d.v0();
        if (v03 != null) {
            return v03;
        }
        p(1);
        throw null;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        xl2.l e13 = fn2.d.e(this.f55430d);
        if (e13 != null) {
            return e13;
        }
        p(4);
        throw null;
    }

    @Override // pn2.l
    public final pn2.b0 g() {
        return rn2.m.d(rn2.l.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // pn2.b1
    public final List getParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p(2);
        throw null;
    }

    @Override // pn2.l
    public final am2.a1 j() {
        am2.a1 a1Var = this.f55429c;
        if (a1Var != null) {
            return a1Var;
        }
        p(5);
        throw null;
    }

    @Override // pn2.l
    public final boolean m(am2.j jVar) {
        if (jVar instanceof am2.c1) {
            bn2.c cVar = bn2.c.f23578a;
            am2.c1 b13 = (am2.c1) jVar;
            j a13 = this.f55430d;
            Intrinsics.checkNotNullParameter(a13, "a");
            Intrinsics.checkNotNullParameter(b13, "b");
            if (cVar.b(a13, b13, true, bn2.b.f23577i)) {
                return true;
            }
        }
        return false;
    }

    @Override // pn2.l
    public final List n(List list) {
        if (list == null) {
            p(7);
            throw null;
        }
        List r03 = this.f55430d.r0(list);
        if (r03 != null) {
            return r03;
        }
        p(8);
        throw null;
    }

    @Override // pn2.l
    public final void o(pn2.b0 b0Var) {
        if (b0Var != null) {
            this.f55430d.u0(b0Var);
        } else {
            p(6);
            throw null;
        }
    }

    public final String toString() {
        return this.f55430d.getName().f139478a;
    }
}
