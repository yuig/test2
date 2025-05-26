package dm2;

import pn2.w1;

/* loaded from: classes2.dex */
public abstract class c extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(on2.u uVar, am2.m mVar, bm2.i iVar, ym2.g gVar, w1 w1Var, boolean z13, int i13, am2.a1 a1Var) {
        super(uVar, mVar, iVar, gVar, w1Var, z13, i13, a1Var);
        if (uVar == null) {
            X(0);
            throw null;
        }
        if (mVar == null) {
            X(1);
            throw null;
        }
        if (w1Var == null) {
            X(4);
            throw null;
        }
        if (a1Var != null) {
        } else {
            X(6);
            throw null;
        }
    }

    public static /* synthetic */ void X(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // dm2.o
    public final String toString() {
        String str = "";
        String str2 = this.f55441f ? "reified " : "";
        if (r() != w1.INVARIANT) {
            str = r() + " ";
        }
        return str2 + str + getName();
    }
}
