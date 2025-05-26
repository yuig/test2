package dm2;

import am2.g1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class v extends l {

    /* renamed from: h, reason: collision with root package name */
    public final pn2.o f55533h;

    /* renamed from: i, reason: collision with root package name */
    public final u f55534i;

    /* renamed from: j, reason: collision with root package name */
    public final on2.s f55535j;

    /* renamed from: k, reason: collision with root package name */
    public final bm2.i f55536k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(on2.u uVar, am2.g gVar, pn2.h0 h0Var, ym2.g gVar2, on2.s sVar, bm2.i iVar, am2.w0 w0Var) {
        super(uVar, gVar, gVar2, w0Var);
        if (uVar == null) {
            o0(6);
            throw null;
        }
        if (gVar == null) {
            o0(7);
            throw null;
        }
        if (h0Var == null) {
            o0(8);
            throw null;
        }
        if (gVar2 == null) {
            o0(9);
            throw null;
        }
        if (sVar == null) {
            o0(10);
            throw null;
        }
        this.f55536k = iVar;
        this.f55533h = new pn2.o(this, Collections.emptyList(), Collections.singleton(h0Var), uVar);
        this.f55534i = new u(this, uVar);
        this.f55535j = sVar;
    }

    public static /* synthetic */ void o0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i13) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i13) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static v u0(on2.u uVar, am2.g gVar, ym2.g gVar2, on2.s sVar, bm2.i iVar, am2.w0 w0Var) {
        if (uVar == null) {
            o0(0);
            throw null;
        }
        if (gVar == null) {
            o0(1);
            throw null;
        }
        if (gVar2 == null) {
            o0(2);
            throw null;
        }
        if (sVar != null) {
            return new v(uVar, gVar, gVar.j(), gVar2, sVar, iVar, w0Var);
        }
        o0(3);
        throw null;
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
        u uVar = this.f55534i;
        if (uVar != null) {
            return uVar;
        }
        o0(14);
        throw null;
    }

    @Override // am2.g
    public final in2.n b0() {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final am2.h c() {
        am2.h hVar = am2.h.ENUM_ENTRY;
        if (hVar != null) {
            return hVar;
        }
        o0(18);
        throw null;
    }

    @Override // am2.g
    public final am2.g c0() {
        return null;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        pn2.o oVar = this.f55533h;
        if (oVar != null) {
            return oVar;
        }
        o0(17);
        throw null;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        bm2.i iVar = this.f55536k;
        if (iVar != null) {
            return iVar;
        }
        o0(21);
        throw null;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        am2.r rVar = am2.s.f15577e;
        if (rVar != null) {
            return rVar;
        }
        o0(20);
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
        o0(22);
        throw null;
    }

    @Override // am2.g, am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = am2.c0.FINAL;
        if (c0Var != null) {
            return c0Var;
        }
        o0(19);
        throw null;
    }

    @Override // am2.g
    public final Collection n() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(16);
        throw null;
    }

    @Override // am2.g
    public final Collection p() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(23);
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

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // am2.g
    public final am2.f u() {
        return null;
    }
}
