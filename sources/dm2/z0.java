package dm2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class z0 extends j {

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f55588k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f55589l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f55590m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z0(am2.m r12, bm2.i r13, boolean r14, pn2.w1 r15, ym2.g r16, int r17, on2.u r18) {
        /*
            r11 = this;
            r9 = r11
            am2.z0 r8 = am2.z0.f15606a
            r10 = 0
            if (r12 == 0) goto L42
            if (r13 == 0) goto L3c
            if (r15 == 0) goto L36
            if (r16 == 0) goto L30
            if (r18 == 0) goto L2a
            r0 = r11
            r1 = r18
            r2 = r12
            r3 = r13
            r4 = r16
            r5 = r15
            r6 = r14
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r9.f55589l = r0
            r0 = 0
            r9.f55590m = r0
            r9.f55588k = r10
            return
        L2a:
            r0 = 25
            X(r0)
            throw r10
        L30:
            r0 = 22
            X(r0)
            throw r10
        L36:
            r0 = 21
            X(r0)
            throw r10
        L3c:
            r0 = 20
            X(r0)
            throw r10
        L42:
            r0 = 19
            X(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.z0.<init>(am2.m, bm2.i, boolean, pn2.w1, ym2.g, int, on2.u):void");
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 5 || i13 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 5 || i13 == 28) ? 2 : 3];
        switch (i13) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i13 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i13 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i13) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 5 && i13 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static z0 w0(am2.m mVar, bm2.i iVar, boolean z13, w1 w1Var, ym2.g gVar, int i13, on2.u uVar) {
        if (mVar == null) {
            X(6);
            throw null;
        }
        if (iVar == null) {
            X(7);
            throw null;
        }
        if (w1Var == null) {
            X(8);
            throw null;
        }
        if (gVar == null) {
            X(9);
            throw null;
        }
        if (uVar != null) {
            return new z0(mVar, iVar, z13, w1Var, gVar, i13, uVar);
        }
        X(11);
        throw null;
    }

    public static z0 x0(am2.m mVar, w1 w1Var, ym2.g gVar, int i13, on2.u uVar) {
        bm2.g gVar2 = bm2.h.f23540a;
        if (mVar == null) {
            X(0);
            throw null;
        }
        if (w1Var == null) {
            X(2);
            throw null;
        }
        if (uVar == null) {
            X(4);
            throw null;
        }
        z0 w03 = w0(mVar, gVar2, false, w1Var, gVar, i13, uVar);
        pn2.h0 m13 = fn2.d.e(mVar).m();
        if (w03.f55590m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + w03.y0());
        }
        if (!ao2.m0.U(m13)) {
            w03.f55589l.add(m13);
        }
        if (!w03.f55590m) {
            w03.f55590m = true;
            return w03;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + w03.y0());
    }

    @Override // dm2.j
    public final void u0(pn2.b0 b0Var) {
        if (b0Var == null) {
            X(27);
            throw null;
        }
        Function1 function1 = this.f55588k;
        if (function1 == null) {
            return;
        }
        function1.invoke(b0Var);
    }

    @Override // dm2.j
    public final List v0() {
        if (!this.f55590m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + y0());
        }
        ArrayList arrayList = this.f55589l;
        if (arrayList != null) {
            return arrayList;
        }
        X(28);
        throw null;
    }

    public final String y0() {
        return getName() + " declared in " + bn2.e.h(g());
    }
}
