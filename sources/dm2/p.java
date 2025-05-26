package dm2;

/* loaded from: classes2.dex */
public abstract class p extends o implements am2.n {

    /* renamed from: c, reason: collision with root package name */
    public final am2.m f55480c;

    /* renamed from: d, reason: collision with root package name */
    public final am2.w0 f55481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(am2.m mVar, bm2.i iVar, ym2.g gVar, am2.w0 w0Var) {
        super(iVar, gVar);
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
        this.f55480c = mVar;
        this.f55481d = w0Var;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public am2.w0 b() {
        am2.w0 w0Var = this.f55481d;
        if (w0Var != null) {
            return w0Var;
        }
        X(6);
        throw null;
    }

    public am2.m g() {
        am2.m mVar = this.f55480c;
        if (mVar != null) {
            return mVar;
        }
        X(5);
        throw null;
    }

    @Override // dm2.o, am2.m
    public am2.n o0() {
        return this;
    }
}
