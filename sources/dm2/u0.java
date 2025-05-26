package dm2;

import java.util.List;
import pn2.q1;

/* loaded from: classes2.dex */
public class u0 extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(am2.m mVar, u0 u0Var, bm2.i iVar, ym2.g gVar, am2.c cVar, am2.w0 w0Var) {
        super(cVar, mVar, u0Var, w0Var, iVar, gVar);
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
        if (w0Var != null) {
        } else {
            X(4);
            throw null;
        }
    }

    public static u0 E0(am2.m mVar, ym2.g gVar, am2.c cVar, am2.w0 w0Var) {
        bm2.g gVar2 = bm2.h.f23540a;
        if (mVar == null) {
            X(5);
            throw null;
        }
        if (gVar == null) {
            X(7);
            throw null;
        }
        if (cVar == null) {
            X(8);
            throw null;
        }
        if (w0Var != null) {
            return new u0(mVar, null, gVar2, gVar, cVar, w0Var);
        }
        X(9);
        throw null;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i13 == 13 || i13 == 18 || i13 == 23) {
            objArr[1] = "initialize";
        } else if (i13 == 24) {
            objArr[1] = "getOriginal";
        } else if (i13 == 29) {
            objArr[1] = "copy";
        } else if (i13 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 23 && i13 != 24 && i13 != 29 && i13 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // dm2.p
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final u0 o0() {
        u0 u0Var = (u0) super.o0();
        if (u0Var != null) {
            return u0Var;
        }
        X(24);
        throw null;
    }

    @Override // dm2.z
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final u0 y0(t0 t0Var, d dVar, List list, List list2, List list3, pn2.b0 b0Var, am2.c0 c0Var, am2.q qVar) {
        if (list == null) {
            X(14);
            throw null;
        }
        if (list2 == null) {
            X(15);
            throw null;
        }
        if (list3 == null) {
            X(16);
            throw null;
        }
        if (qVar != null) {
            return H0(t0Var, dVar, list, list2, list3, b0Var, c0Var, qVar, null);
        }
        X(17);
        throw null;
    }

    public u0 H0(t0 t0Var, d dVar, List list, List list2, List list3, pn2.b0 b0Var, am2.c0 c0Var, am2.q qVar, kotlin.collections.r0 r0Var) {
        if (list == null) {
            X(19);
            throw null;
        }
        if (list2 == null) {
            X(20);
            throw null;
        }
        if (list3 == null) {
            X(21);
            throw null;
        }
        if (qVar != null) {
            super.y0(t0Var, dVar, list, list2, list3, b0Var, c0Var, qVar);
            return this;
        }
        X(22);
        throw null;
    }

    @Override // am2.d
    public /* bridge */ /* synthetic */ am2.d W(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        return u0(mVar, c0Var, rVar, cVar);
    }

    @Override // dm2.z, am2.x
    public am2.w q0() {
        return z0(q1.f100833b);
    }

    @Override // dm2.z
    public z v0(am2.c cVar, am2.m mVar, am2.x xVar, am2.w0 w0Var, bm2.i iVar, ym2.g gVar) {
        if (mVar == null) {
            X(25);
            throw null;
        }
        if (cVar == null) {
            X(26);
            throw null;
        }
        if (iVar == null) {
            X(27);
            throw null;
        }
        u0 u0Var = (u0) xVar;
        if (gVar == null) {
            gVar = getName();
        }
        return new u0(mVar, u0Var, iVar, gVar, cVar, w0Var);
    }
}
