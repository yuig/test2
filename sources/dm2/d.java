package dm2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pn2.q1;
import pn2.w1;

/* loaded from: classes2.dex */
public abstract class d extends o implements am2.p0 {
    public static /* synthetic */ void X(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i13) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.b
    public final d A() {
        return null;
    }

    @Override // am2.b
    public final d D() {
        return null;
    }

    @Override // am2.b
    public final boolean V() {
        return false;
    }

    @Override // dm2.o, am2.m
    /* renamed from: a */
    public final am2.b o0() {
        return this;
    }

    @Override // am2.n
    public final am2.w0 b() {
        return am2.w0.f15602a;
    }

    @Override // am2.b
    public final pn2.b0 getReturnType() {
        return getType();
    }

    @Override // am2.h1
    public final pn2.b0 getType() {
        pn2.b0 type = o0().getType();
        if (type != null) {
            return type;
        }
        X(6);
        throw null;
    }

    @Override // am2.b
    public final List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        X(5);
        throw null;
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        am2.r rVar = am2.s.f15578f;
        if (rVar != null) {
            return rVar;
        }
        X(9);
        throw null;
    }

    @Override // am2.b
    public final Collection h() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        X(8);
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        switch (eVar.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(getName());
                return Unit.f80348a;
        }
    }

    public abstract jn2.f o0();

    @Override // am2.y0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final d d(q1 q1Var) {
        if (q1Var == null) {
            X(3);
            throw null;
        }
        if (q1Var.f100834a.f()) {
            return this;
        }
        pn2.b0 l13 = g() instanceof am2.g ? q1Var.l(getType(), w1.OUT_VARIANCE) : q1Var.l(getType(), w1.INVARIANT);
        if (l13 == null) {
            return null;
        }
        return l13 == getType() ? this : new t0(g(), new jn2.g(l13), getAnnotations());
    }

    @Override // am2.b
    public final List x() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        X(7);
        throw null;
    }

    @Override // dm2.o, am2.m
    /* renamed from: a */
    public final am2.m o0() {
        return this;
    }
}
