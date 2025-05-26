package dm2;

import am2.j1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c1 extends p implements j1 {

    /* renamed from: e, reason: collision with root package name */
    public pn2.b0 f55406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(am2.m mVar, bm2.i iVar, ym2.g gVar, pn2.b0 b0Var, am2.w0 w0Var) {
        super(mVar, iVar, gVar, w0Var);
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
        if (w0Var == null) {
            X(3);
            throw null;
        }
        this.f55406e = b0Var;
    }

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
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.b
    public d A() {
        return null;
    }

    @Override // am2.b
    public d D() {
        return null;
    }

    @Override // am2.b
    public boolean V() {
        return false;
    }

    @Override // am2.b
    public pn2.b0 getReturnType() {
        pn2.b0 type = getType();
        if (type != null) {
            return type;
        }
        X(10);
        throw null;
    }

    @Override // am2.h1
    public final pn2.b0 getType() {
        pn2.b0 b0Var = this.f55406e;
        if (b0Var != null) {
            return b0Var;
        }
        X(4);
        throw null;
    }

    @Override // am2.b
    public List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        X(8);
        throw null;
    }

    @Override // am2.b
    public final List x() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        X(6);
        throw null;
    }
}
