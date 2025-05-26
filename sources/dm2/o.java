package dm2;

/* loaded from: classes2.dex */
public abstract class o extends bm2.b implements am2.m {

    /* renamed from: b, reason: collision with root package name */
    public final ym2.g f55471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bm2.i iVar, ym2.g gVar) {
        super(iVar);
        if (iVar == null) {
            X(0);
            throw null;
        }
        if (gVar == null) {
            X(1);
            throw null;
        }
        this.f55471b = gVar;
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5 || i13 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i13 != 2 && i13 != 3) {
            if (i13 == 4) {
                objArr[2] = "toString";
            } else if (i13 != 5 && i13 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static String a0(am2.m mVar) {
        if (mVar == null) {
            X(4);
            throw null;
        }
        try {
            String str = an2.y.f15820e.z(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str != null) {
                return str;
            }
            X(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 != null) {
                return str2;
            }
            X(6);
            throw null;
        }
    }

    /* renamed from: a */
    public am2.m o0() {
        return this;
    }

    @Override // am2.m
    public final ym2.g getName() {
        ym2.g gVar = this.f55471b;
        if (gVar != null) {
            return gVar;
        }
        X(2);
        throw null;
    }

    public String toString() {
        return a0(this);
    }
}
