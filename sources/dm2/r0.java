package dm2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 extends o0 implements am2.s0 {

    /* renamed from: m, reason: collision with root package name */
    public pn2.b0 f55517m;

    /* renamed from: n, reason: collision with root package name */
    public final am2.s0 f55518n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(am2.r0 r0Var, bm2.i iVar, am2.c0 c0Var, am2.q qVar, boolean z13, boolean z14, boolean z15, am2.c cVar, am2.s0 s0Var, am2.w0 w0Var) {
        super(c0Var, qVar, r0Var, iVar, ym2.g.g("<get-" + r0Var.getName() + ">"), z13, z14, z15, cVar, w0Var);
        r0 r0Var2;
        r0 r0Var3;
        if (r0Var == null) {
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
        if (cVar == null) {
            X(4);
            throw null;
        }
        if (w0Var == null) {
            X(5);
            throw null;
        }
        if (s0Var != 0) {
            r0Var3 = this;
            r0Var2 = s0Var;
        } else {
            r0Var2 = this;
            r0Var3 = r0Var2;
        }
        r0Var3.f55518n = r0Var2;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 6 || i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 6 || i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i13 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // am2.b
    public final pn2.b0 getReturnType() {
        return this.f55517m;
    }

    @Override // am2.d, am2.b
    public final Collection h() {
        return u0(true);
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        switch (eVar.f122512a) {
            case 0:
                return eVar.c(this, obj);
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                eVar.e(this, builder, "getter");
                return Unit.f80348a;
        }
    }

    @Override // dm2.p
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final am2.s0 o0() {
        am2.s0 s0Var = this.f55518n;
        if (s0Var != null) {
            return s0Var;
        }
        X(8);
        throw null;
    }

    public final void w0(pn2.b0 b0Var) {
        if (b0Var == null) {
            b0Var = r0().getType();
        }
        this.f55517m = b0Var;
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
}
