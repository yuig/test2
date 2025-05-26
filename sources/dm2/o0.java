package dm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pn2.q1;

/* loaded from: classes2.dex */
public abstract class o0 extends p implements am2.q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f55472e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f55473f;

    /* renamed from: g, reason: collision with root package name */
    public final am2.c0 f55474g;

    /* renamed from: h, reason: collision with root package name */
    public final am2.r0 f55475h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55476i;

    /* renamed from: j, reason: collision with root package name */
    public final am2.c f55477j;

    /* renamed from: k, reason: collision with root package name */
    public am2.q f55478k;

    /* renamed from: l, reason: collision with root package name */
    public am2.x f55479l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(am2.c0 c0Var, am2.q qVar, am2.r0 r0Var, bm2.i iVar, ym2.g gVar, boolean z13, boolean z14, boolean z15, am2.c cVar, am2.w0 w0Var) {
        super(r0Var.g(), iVar, gVar, w0Var);
        if (c0Var == null) {
            X(0);
            throw null;
        }
        if (qVar == null) {
            X(1);
            throw null;
        }
        if (r0Var == null) {
            X(2);
            throw null;
        }
        if (iVar == null) {
            X(3);
            throw null;
        }
        if (w0Var == null) {
            X(5);
            throw null;
        }
        this.f55479l = null;
        this.f55474g = c0Var;
        this.f55478k = qVar;
        this.f55475h = r0Var;
        this.f55472e = z13;
        this.f55473f = z14;
        this.f55476i = z15;
        this.f55477j = cVar;
    }

    public static /* synthetic */ void X(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i14 = 2;
                break;
            case 7:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i13) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.b
    public final d A() {
        return r0().A();
    }

    @Override // am2.b
    public final d D() {
        return r0().D();
    }

    @Override // am2.b
    public final Object K(km2.e eVar) {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.b
    public final boolean V() {
        return false;
    }

    @Override // am2.d
    public final am2.d W(am2.m mVar, am2.c0 c0Var, am2.r rVar, am2.c cVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // am2.d
    public final am2.c c() {
        am2.c cVar = this.f55477j;
        if (cVar != null) {
            return cVar;
        }
        X(6);
        throw null;
    }

    @Override // am2.x, am2.y0
    public final am2.x d(q1 q1Var) {
        if (q1Var != null) {
            return this;
        }
        X(7);
        throw null;
    }

    @Override // am2.x
    public final am2.x f0() {
        return this.f55479l;
    }

    @Override // am2.b
    public final List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        X(9);
        throw null;
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        am2.q qVar = this.f55478k;
        if (qVar != null) {
            return qVar;
        }
        X(11);
        throw null;
    }

    @Override // am2.b
    public final List i0() {
        List i03 = r0().i0();
        if (i03 != null) {
            return i03;
        }
        X(14);
        throw null;
    }

    @Override // am2.a0
    public final boolean isExternal() {
        return this.f55473f;
    }

    @Override // am2.x
    public final boolean isInfix() {
        return false;
    }

    @Override // am2.x
    public final boolean isInline() {
        return this.f55476i;
    }

    @Override // am2.x
    public final boolean isOperator() {
        return false;
    }

    @Override // am2.x
    public final boolean isSuspend() {
        return false;
    }

    @Override // am2.a0
    public final am2.c0 l() {
        am2.c0 c0Var = this.f55474g;
        if (c0Var != null) {
            return c0Var;
        }
        X(10);
        throw null;
    }

    @Override // am2.x
    public final boolean m0() {
        return false;
    }

    @Override // am2.d
    public final void n0(Collection collection) {
        if (collection != null) {
            return;
        }
        X(16);
        throw null;
    }

    @Override // am2.x
    public final boolean p0() {
        return false;
    }

    public final am2.r0 r0() {
        am2.r0 r0Var = this.f55475h;
        if (r0Var != null) {
            return r0Var;
        }
        X(13);
        throw null;
    }

    @Override // am2.x
    public final boolean t() {
        return false;
    }

    public final ArrayList u0(boolean z13) {
        ArrayList arrayList = new ArrayList(0);
        for (am2.r0 r0Var : r0().h()) {
            am2.p getter = z13 ? r0Var.getGetter() : r0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // am2.y0
    public final /* bridge */ /* synthetic */ am2.n d(q1 q1Var) {
        d(q1Var);
        return this;
    }
}
