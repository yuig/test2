package dm2;

/* loaded from: classes2.dex */
public abstract class l extends b {

    /* renamed from: e, reason: collision with root package name */
    public final am2.m f55456e;

    /* renamed from: f, reason: collision with root package name */
    public final am2.w0 f55457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f55458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(on2.u uVar, am2.m mVar, ym2.g gVar, am2.w0 w0Var) {
        super(uVar, gVar);
        if (uVar == null) {
            o0(0);
            throw null;
        }
        if (mVar == null) {
            o0(1);
            throw null;
        }
        if (gVar == null) {
            o0(2);
            throw null;
        }
        this.f55456e = mVar;
        this.f55457f = w0Var;
        this.f55458g = false;
    }

    public static /* synthetic */ void o0(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i13 == 2) {
            objArr[0] = "name";
        } else if (i13 == 3) {
            objArr[0] = "source";
        } else if (i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // am2.n
    public final am2.w0 b() {
        am2.w0 w0Var = this.f55457f;
        if (w0Var != null) {
            return w0Var;
        }
        o0(5);
        throw null;
    }

    @Override // am2.m
    public final am2.m g() {
        am2.m mVar = this.f55456e;
        if (mVar != null) {
            return mVar;
        }
        o0(4);
        throw null;
    }

    public boolean isExternal() {
        return this.f55458g;
    }
}
