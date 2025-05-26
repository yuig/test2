package km2;

import am2.m;
import am2.w0;
import am2.x;
import dm2.k;
import dm2.z;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.q0;
import pn2.b0;

/* loaded from: classes4.dex */
public final class b extends k implements a {
    public Boolean F;
    public Boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(am2.g gVar, b bVar, bm2.i iVar, boolean z13, am2.c cVar, w0 w0Var) {
        super(gVar, bVar, iVar, z13, cVar, w0Var);
        if (gVar == null) {
            X(0);
            throw null;
        }
        if (iVar == null) {
            X(1);
            throw null;
        }
        if (cVar == null) {
            X(2);
            throw null;
        }
        if (w0Var == null) {
            X(3);
            throw null;
        }
        this.F = null;
        this.G = null;
    }

    public static b K0(am2.g gVar, bm2.i iVar, boolean z13, fm2.h hVar) {
        if (gVar != null) {
            return new b(gVar, null, iVar, z13, am2.c.DECLARATION, hVar);
        }
        X(4);
        throw null;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 11 || i13 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 11 || i13 == 18) ? 2 : 3];
        switch (i13) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 11 && i13 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // dm2.z
    public final void B0(boolean z13) {
        this.F = Boolean.valueOf(z13);
    }

    @Override // dm2.z
    public final void C0(boolean z13) {
        this.G = Boolean.valueOf(z13);
    }

    @Override // dm2.k
    /* renamed from: E0 */
    public final /* bridge */ /* synthetic */ k v0(am2.c cVar, m mVar, x xVar, w0 w0Var, bm2.i iVar, ym2.g gVar) {
        return L0(cVar, mVar, xVar, w0Var, iVar);
    }

    public final b L0(am2.c cVar, m mVar, x xVar, w0 w0Var, bm2.i iVar) {
        if (mVar == null) {
            X(7);
            throw null;
        }
        if (cVar == null) {
            X(8);
            throw null;
        }
        if (iVar == null) {
            X(9);
            throw null;
        }
        if (w0Var == null) {
            X(10);
            throw null;
        }
        if (cVar != am2.c.DECLARATION && cVar != am2.c.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + cVar);
        }
        b bVar = new b((am2.g) mVar, (b) xVar, iVar, this.E, cVar, w0Var);
        Boolean bool = this.F;
        bool.getClass();
        bVar.F = bool;
        Boolean bool2 = this.G;
        bool2.getClass();
        bVar.G = bool2;
        return bVar;
    }

    @Override // dm2.z, am2.b
    public final boolean V() {
        return this.G.booleanValue();
    }

    @Override // km2.a
    public final a e0(b0 b0Var, ArrayList arrayList, b0 b0Var2, Pair pair) {
        b L0 = L0(c(), g(), null, b(), getAnnotations());
        L0.y0(b0Var == null ? null : dl2.b.V(L0, b0Var, bm2.h.f23540a), this.f55571j, q0.f80391a, getTypeParameters(), ue.c.l(arrayList, x(), L0), b0Var2, l(), getVisibility());
        if (pair != null) {
            L0.A0((am2.a) pair.f80346a, pair.f80347b);
        }
        return L0;
    }

    @Override // dm2.k, dm2.z
    public final /* bridge */ /* synthetic */ z v0(am2.c cVar, m mVar, x xVar, w0 w0Var, bm2.i iVar, ym2.g gVar) {
        return L0(cVar, mVar, xVar, w0Var, iVar);
    }
}
