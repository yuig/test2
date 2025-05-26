package km2;

import am2.c0;
import am2.m;
import am2.q;
import am2.w0;
import am2.x;
import dm2.t0;
import dm2.u0;
import dm2.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import pn2.b0;
import pn2.q1;
import vn2.k;
import vn2.z;

/* loaded from: classes2.dex */
public final class g extends u0 implements a {
    public static final e G = new e();
    public static final e H = new e();
    public f E;
    public final boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, u0 u0Var, bm2.i iVar, ym2.g gVar, am2.c cVar, w0 w0Var, boolean z13) {
        super(mVar, u0Var, iVar, gVar, cVar, w0Var);
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
        this.E = null;
        this.F = z13;
    }

    public static g I0(m mVar, lm2.d dVar, ym2.g gVar, fm2.h hVar, boolean z13) {
        if (mVar == null) {
            X(5);
            throw null;
        }
        if (gVar != null) {
            return new g(mVar, null, dVar, gVar, am2.c.DECLARATION, hVar, z13);
        }
        X(7);
        throw null;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 21) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 13) {
            objArr[1] = "initialize";
        } else if (i13 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // dm2.u0
    public final u0 H0(t0 t0Var, dm2.d dVar, List list, List list2, List list3, b0 b0Var, c0 c0Var, q qVar, r0 r0Var) {
        vn2.f fVar;
        if (list == null) {
            X(9);
            throw null;
        }
        if (list2 == null) {
            X(10);
            throw null;
        }
        if (list3 == null) {
            X(11);
            throw null;
        }
        if (qVar == null) {
            X(12);
            throw null;
        }
        super.H0(t0Var, dVar, list, list2, list3, b0Var, c0Var, qVar, r0Var);
        List list4 = z.f126351g;
        Intrinsics.checkNotNullParameter(this, "functionDescriptor");
        for (k kVar : z.f126351g) {
            kVar.getClass();
            Intrinsics.checkNotNullParameter(this, "functionDescriptor");
            ym2.g gVar = kVar.f126330a;
            if (gVar == null || Intrinsics.d(getName(), gVar)) {
                Regex regex = kVar.f126331b;
                if (regex != null) {
                    String b13 = getName().b();
                    Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
                    if (!regex.e(b13)) {
                        continue;
                    }
                }
                Collection collection = kVar.f126332c;
                if (collection == null || collection.contains(getName())) {
                    Intrinsics.checkNotNullParameter(this, "functionDescriptor");
                    vn2.e[] eVarArr = kVar.f126334e;
                    int length = eVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            String str = (String) kVar.f126333d.invoke(this);
                            fVar = str != null ? new vn2.f(str) : vn2.f.f126318c;
                        } else {
                            String b14 = eVarArr[i13].b(this);
                            if (b14 != null) {
                                fVar = new vn2.f(b14);
                                break;
                            }
                            i13++;
                        }
                    }
                    this.f55574m = fVar.f126320a;
                    return this;
                }
            }
        }
        fVar = vn2.f.f126317b;
        this.f55574m = fVar.f126320a;
        return this;
    }

    @Override // dm2.z, am2.b
    public final boolean V() {
        return this.E.isSynthesized;
    }

    @Override // km2.a
    public final a e0(b0 b0Var, ArrayList arrayList, b0 b0Var2, Pair pair) {
        ArrayList l13 = ue.c.l(arrayList, x(), this);
        t0 V = b0Var == null ? null : dl2.b.V(this, b0Var, bm2.h.f23540a);
        y z03 = z0(q1.f100833b);
        z03.f55548g = l13;
        z03.f(b0Var2);
        z03.f55550i = V;
        z03.f55557p = true;
        z03.f55556o = true;
        g gVar = (g) z03.f55565x.w0(z03);
        if (pair != null) {
            gVar.A0((am2.a) pair.f80346a, pair.f80347b);
        }
        if (gVar != null) {
            return gVar;
        }
        X(21);
        throw null;
    }

    @Override // dm2.u0, dm2.z
    public final dm2.z v0(am2.c cVar, m mVar, x xVar, w0 w0Var, bm2.i iVar, ym2.g gVar) {
        if (mVar == null) {
            X(14);
            throw null;
        }
        if (cVar == null) {
            X(15);
            throw null;
        }
        if (iVar == null) {
            X(16);
            throw null;
        }
        u0 u0Var = (u0) xVar;
        if (gVar == null) {
            gVar = getName();
        }
        g gVar2 = new g(mVar, u0Var, iVar, gVar, cVar, w0Var, this.F);
        f fVar = this.E;
        gVar2.E = f.get(fVar.isStable, fVar.isSynthesized);
        return gVar2;
    }
}
