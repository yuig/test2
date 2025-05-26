package dm2;

/* loaded from: classes2.dex */
public final class t0 extends d {

    /* renamed from: c, reason: collision with root package name */
    public final am2.m f55527c;

    /* renamed from: d, reason: collision with root package name */
    public final jn2.f f55528d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(am2.m mVar, jn2.a aVar, bm2.i iVar) {
        this(mVar, aVar, iVar, ym2.i.f139485d);
        if (mVar == null) {
            X(0);
            throw null;
        }
        if (iVar != null) {
        } else {
            X(2);
            throw null;
        }
    }

    public static /* synthetic */ void X(int i13) {
        String str = (i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i13 == 7) {
            objArr[1] = "getValue";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i13) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // am2.m
    public final am2.m g() {
        am2.m mVar = this.f55527c;
        if (mVar != null) {
            return mVar;
        }
        X(8);
        throw null;
    }

    @Override // dm2.d
    public final jn2.f o0() {
        jn2.f fVar = this.f55528d;
        if (fVar != null) {
            return fVar;
        }
        X(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(am2.m mVar, jn2.a aVar, bm2.i iVar, ym2.g gVar) {
        super(iVar, gVar);
        if (mVar == null) {
            X(3);
            throw null;
        }
        if (iVar == null) {
            X(5);
            throw null;
        }
        if (gVar != null) {
            this.f55527c = mVar;
            this.f55528d = aVar;
            return;
        }
        X(6);
        throw null;
    }
}
