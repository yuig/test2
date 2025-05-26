package dm2;

import am2.i1;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 extends o0 implements am2.t0 {

    /* renamed from: m, reason: collision with root package name */
    public i1 f55522m;

    /* renamed from: n, reason: collision with root package name */
    public final am2.t0 f55523n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(am2.r0 r0Var, bm2.i iVar, am2.c0 c0Var, am2.q qVar, boolean z13, boolean z14, boolean z15, am2.c cVar, am2.t0 t0Var, am2.w0 w0Var) {
        super(c0Var, qVar, r0Var, iVar, ym2.g.g("<set-" + r0Var.getName() + ">"), z13, z14, z15, cVar, w0Var);
        s0 s0Var;
        s0 s0Var2;
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
        if (t0Var != 0) {
            s0Var2 = this;
            s0Var = t0Var;
        } else {
            s0Var = this;
            s0Var2 = s0Var;
        }
        s0Var2.f55523n = s0Var;
    }

    public static /* synthetic */ void X(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 9:
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
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i13) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i13) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static b1 v0(s0 s0Var, pn2.b0 b0Var, bm2.i iVar) {
        if (b0Var == null) {
            X(8);
            throw null;
        }
        if (iVar != null) {
            return new b1(s0Var, null, 0, iVar, ym2.i.f139488g, b0Var, false, false, false, null, am2.w0.f15602a);
        }
        X(9);
        throw null;
    }

    @Override // am2.b
    public final pn2.b0 getReturnType() {
        pn2.h0 x13 = fn2.d.e(this).x();
        if (x13 != null) {
            return x13;
        }
        X(12);
        throw null;
    }

    @Override // am2.d, am2.b
    public final Collection h() {
        return u0(false);
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
                eVar.e(this, builder, "setter");
                return Unit.f80348a;
        }
    }

    @Override // dm2.p
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final am2.t0 o0() {
        am2.t0 t0Var = this.f55523n;
        if (t0Var != null) {
            return t0Var;
        }
        X(13);
        throw null;
    }

    @Override // am2.b
    public final List x() {
        i1 i1Var = this.f55522m;
        if (i1Var == null) {
            throw new IllegalStateException();
        }
        List singletonList = Collections.singletonList(i1Var);
        if (singletonList != null) {
            return singletonList;
        }
        X(11);
        throw null;
    }

    public final void x0(i1 i1Var) {
        if (i1Var != null) {
            this.f55522m = i1Var;
        } else {
            X(6);
            throw null;
        }
    }
}
