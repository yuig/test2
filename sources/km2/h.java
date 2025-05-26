package km2;

import am2.c0;
import am2.i1;
import am2.m;
import am2.q;
import am2.r0;
import am2.v0;
import am2.w0;
import bm2.j;
import dm2.o0;
import dm2.p;
import dm2.q0;
import dm2.s0;
import im2.d0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import pn2.b0;
import qm2.s;
import xl2.l;

/* loaded from: classes2.dex */
public class h extends q0 implements a {
    public final boolean B;
    public final Pair C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, bm2.i iVar, c0 c0Var, q qVar, boolean z13, ym2.g gVar, w0 w0Var, r0 r0Var, am2.c cVar, boolean z14, Pair pair) {
        super(mVar, r0Var, iVar, c0Var, qVar, z13, gVar, cVar, w0Var, false, false, false, false, false, false);
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
        if (w0Var == null) {
            X(5);
            throw null;
        }
        if (cVar == null) {
            X(6);
            throw null;
        }
        this.B = z14;
        this.C = pair;
    }

    public static h C0(m mVar, lm2.d dVar, c0 c0Var, q qVar, boolean z13, ym2.g gVar, fm2.h hVar, boolean z14) {
        if (mVar == null) {
            X(7);
            throw null;
        }
        if (c0Var == null) {
            X(9);
            throw null;
        }
        if (gVar != null) {
            return new h(mVar, dVar, c0Var, qVar, z13, gVar, hVar, null, am2.c.DECLARATION, z14, null);
        }
        X(11);
        throw null;
    }

    public static /* synthetic */ void X(int i13) {
        String str = i13 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 21 ? 3 : 2];
        switch (i13) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i13 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // dm2.q0
    public final void A0(b0 b0Var) {
    }

    @Override // dm2.q0, am2.b
    public final Object K(e eVar) {
        Pair pair = this.C;
        if (pair == null || !((am2.a) pair.f80346a).equals(eVar)) {
            return null;
        }
        return pair.f80347b;
    }

    @Override // dm2.c1, am2.b
    public final boolean V() {
        return false;
    }

    @Override // km2.a
    public final a e0(b0 b0Var, ArrayList arrayList, b0 b0Var2, Pair pair) {
        dm2.r0 r0Var;
        s0 s0Var;
        r0 o03 = o0() == this ? null : o0();
        h hVar = new h(g(), getAnnotations(), l(), getVisibility(), this.f55493f, getName(), b(), o03, c(), this.B, pair);
        dm2.r0 r0Var2 = this.f55511x;
        if (r0Var2 != null) {
            r0Var = r14;
            dm2.r0 r0Var3 = new dm2.r0(hVar, r0Var2.getAnnotations(), r0Var2.l(), r0Var2.getVisibility(), r0Var2.f55472e, r0Var2.f55473f, r0Var2.f55476i, c(), o03 == null ? null : o03.getGetter(), r0Var2.b());
            r0Var.f55479l = r0Var2.f55479l;
            r0Var.w0(b0Var2);
        } else {
            r0Var = null;
        }
        Object obj = this.f55512y;
        if (obj != null) {
            o0 o0Var = (o0) obj;
            s0 s0Var2 = new s0(hVar, ((bm2.b) obj).getAnnotations(), o0Var.l(), o0Var.getVisibility(), o0Var.f55472e, o0Var.f55473f, o0Var.f55476i, c(), o03 == null ? null : o03.getSetter(), ((p) obj).b());
            s0Var2.f55479l = s0Var2.f55479l;
            s0Var2.x0((i1) ((s0) obj).x().get(0));
            s0Var = s0Var2;
        } else {
            s0Var = null;
        }
        hVar.y0(r0Var, s0Var, this.f55513z, this.A);
        Function0 function0 = this.f55495h;
        if (function0 != null) {
            hVar.z0(this.f55494g, function0);
        }
        hVar.n0(h());
        hVar.B0(b0Var2, getTypeParameters(), this.f55508u, b0Var == null ? null : dl2.b.V(this, b0Var, bm2.h.f23540a), kotlin.collections.q0.f80391a);
        return hVar;
    }

    @Override // dm2.q0, am2.j1
    public final boolean isConst() {
        b0 type = getType();
        if (this.B && f0.h.q(type)) {
            j jVar = s.f104439a;
            Intrinsics.checkNotNullParameter(type, "<this>");
            Intrinsics.checkNotNullParameter(qn2.p.f104516a, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            ym2.c ENHANCED_NULLABILITY_ANNOTATION = d0.f72716p;
            Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
            if (!a0.m0(type, ENHANCED_NULLABILITY_ANNOTATION) || l.I(type)) {
                return true;
            }
        }
        return false;
    }

    @Override // dm2.q0
    public final q0 w0(m mVar, c0 c0Var, q qVar, r0 r0Var, am2.c cVar, ym2.g gVar) {
        v0 v0Var = w0.f15602a;
        if (mVar == null) {
            X(13);
            throw null;
        }
        if (c0Var == null) {
            X(14);
            throw null;
        }
        if (qVar == null) {
            X(15);
            throw null;
        }
        if (cVar == null) {
            X(16);
            throw null;
        }
        if (gVar == null) {
            X(17);
            throw null;
        }
        return new h(mVar, getAnnotations(), c0Var, qVar, this.f55493f, gVar, v0Var, r0Var, cVar, this.B, this.C);
    }
}
