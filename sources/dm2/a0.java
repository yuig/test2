package dm2;

/* loaded from: classes2.dex */
public final class a0 extends d {

    /* renamed from: c, reason: collision with root package name */
    public final am2.g f55385c;

    /* renamed from: d, reason: collision with root package name */
    public final jn2.d f55386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b bVar) {
        super(bm2.h.f23540a, ym2.i.f139485d);
        if (bVar == null) {
            X(0);
            throw null;
        }
        this.f55385c = bVar;
        this.f55386d = new jn2.d(bVar);
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i13 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i13 == 1) {
            objArr[1] = "getValue";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // am2.m
    public final am2.m g() {
        am2.g gVar = this.f55385c;
        if (gVar != null) {
            return gVar;
        }
        X(2);
        throw null;
    }

    @Override // dm2.d
    public final jn2.f o0() {
        jn2.d dVar = this.f55386d;
        if (dVar != null) {
            return dVar;
        }
        X(1);
        throw null;
    }

    @Override // dm2.o
    public final String toString() {
        return "class " + this.f55385c.getName() + "::this";
    }
}
