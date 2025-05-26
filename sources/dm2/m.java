package dm2;

import am2.g1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class m extends l {

    /* renamed from: h, reason: collision with root package name */
    public final am2.c0 f55461h;

    /* renamed from: i, reason: collision with root package name */
    public final am2.h f55462i;

    /* renamed from: j, reason: collision with root package name */
    public final pn2.o f55463j;

    /* renamed from: k, reason: collision with root package name */
    public in2.n f55464k;

    /* renamed from: l, reason: collision with root package name */
    public Set f55465l;

    /* renamed from: m, reason: collision with root package name */
    public am2.f f55466m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(am2.m r3, ym2.g r4, am2.c0 r5, am2.h r6, java.util.Collection r7, on2.u r8) {
        /*
            r2 = this;
            am2.v0 r0 = am2.w0.f15602a
            r1 = 0
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L36
            if (r5 == 0) goto L31
            if (r6 == 0) goto L2c
            if (r7 == 0) goto L27
            if (r8 == 0) goto L22
            r2.<init>(r8, r3, r4, r0)
            r2.f55461h = r5
            r2.f55462i = r6
            pn2.o r3 = new pn2.o
            java.util.List r4 = java.util.Collections.emptyList()
            r3.<init>(r2, r4, r7, r8)
            r2.f55463j = r3
            return
        L22:
            r3 = 6
            o0(r3)
            throw r1
        L27:
            r3 = 4
            o0(r3)
            throw r1
        L2c:
            r3 = 3
            o0(r3)
            throw r1
        L31:
            r3 = 2
            o0(r3)
            throw r1
        L36:
            r3 = 1
            o0(r3)
            throw r1
        L3b:
            r3 = 0
            o0(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.m.<init>(am2.m, ym2.g, am2.c0, am2.h, java.util.Collection, on2.u):void");
    }

    public static /* synthetic */ void o0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i14 = 2;
                break;
            case 12:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
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
        in2.n nVar = this.f55464k;
        if (nVar != null) {
            return nVar;
        }
        o0(13);
        throw null;
    }

    @Override // am2.g
    public final in2.n b0() {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final am2.h c() {
        am2.h hVar = this.f55462i;
        if (hVar != null) {
            return hVar;
        }
        o0(15);
        throw null;
    }

    @Override // am2.g
    public final am2.g c0() {
        return null;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        pn2.o oVar = this.f55463j;
        if (oVar != null) {
            return oVar;
        }
        o0(10);
        throw null;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return bm2.h.f23540a;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        am2.r rVar = am2.s.f15577e;
        if (rVar != null) {
            return rVar;
        }
        o0(17);
        throw null;
    }

    @Override // am2.g
    public final boolean isInline() {
        return false;
    }

    @Override // am2.g, am2.k
    public final List k() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(18);
        throw null;
    }

    @Override // am2.g, am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = this.f55461h;
        if (c0Var != null) {
            return c0Var;
        }
        o0(16);
        throw null;
    }

    @Override // am2.g
    public final Collection n() {
        Set set = this.f55465l;
        if (set != null) {
            return set;
        }
        o0(11);
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
        return false;
    }

    @Override // am2.g
    public final boolean s0() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // am2.g
    public final am2.f u() {
        return this.f55466m;
    }

    public final void u0(in2.n nVar, Set set, k kVar) {
        if (set == null) {
            o0(8);
            throw null;
        }
        this.f55464k = nVar;
        this.f55465l = set;
        this.f55466m = kVar;
    }
}
