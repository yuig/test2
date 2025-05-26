package dm2;

import am2.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class j0 extends l {

    /* renamed from: h, reason: collision with root package name */
    public final am2.h f55446h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55447i;

    /* renamed from: j, reason: collision with root package name */
    public am2.c0 f55448j;

    /* renamed from: k, reason: collision with root package name */
    public am2.q f55449k;

    /* renamed from: l, reason: collision with root package name */
    public pn2.o f55450l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f55451m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f55452n;

    /* renamed from: o, reason: collision with root package name */
    public final on2.u f55453o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j0(dm2.q r3, am2.h r4, ym2.g r5, on2.c r6) {
        /*
            r2 = this;
            am2.v0 r0 = am2.w0.f15602a
            r1 = 0
            if (r4 == 0) goto L25
            if (r5 == 0) goto L20
            if (r6 == 0) goto L1b
            r2.<init>(r6, r3, r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f55452n = r3
            r2.f55453o = r6
            r2.f55446h = r4
            r3 = 0
            r2.f55447i = r3
            return
        L1b:
            r3 = 4
            o0(r3)
            throw r1
        L20:
            r3 = 2
            o0(r3)
            throw r1
        L25:
            r3 = 1
            o0(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.j0.<init>(dm2.q, am2.h, ym2.g, on2.c):void");
    }

    public static /* synthetic */ void o0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i14 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.g
    public final g1 J() {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.g
    public final boolean P() {
        return false;
    }

    @Override // am2.g
    public final boolean S() {
        return false;
    }

    @Override // am2.g
    public final boolean Y() {
        return false;
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i iVar) {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final in2.n b0() {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final am2.h c() {
        am2.h hVar = this.f55446h;
        if (hVar != null) {
            return hVar;
        }
        o0(8);
        throw null;
    }

    @Override // am2.g
    public final am2.g c0() {
        return null;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        pn2.o oVar = this.f55450l;
        if (oVar != null) {
            return oVar;
        }
        o0(11);
        throw null;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return bm2.h.f23540a;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        am2.q qVar = this.f55449k;
        if (qVar != null) {
            return qVar;
        }
        o0(10);
        throw null;
    }

    @Override // am2.g
    public final boolean isInline() {
        return false;
    }

    @Override // am2.g, am2.k
    public final List k() {
        ArrayList arrayList = this.f55451m;
        if (arrayList != null) {
            return arrayList;
        }
        o0(15);
        throw null;
    }

    @Override // am2.g, am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = this.f55448j;
        if (c0Var != null) {
            return c0Var;
        }
        o0(7);
        throw null;
    }

    @Override // am2.g
    public final Collection n() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        o0(13);
        throw null;
    }

    @Override // am2.g
    public final Collection p() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(19);
        throw null;
    }

    @Override // am2.k
    public final boolean q() {
        return this.f55447i;
    }

    @Override // am2.g
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return o.a0(this);
    }

    @Override // am2.g
    public final am2.f u() {
        return null;
    }
}
