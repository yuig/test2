package bm2;

/* loaded from: classes2.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f23531a;

    public b(i iVar) {
        if (iVar != null) {
            this.f23531a = iVar;
        } else {
            X(0);
            throw null;
        }
    }

    public static /* synthetic */ void X(int i13) {
        String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 1 ? 3 : 2];
        if (i13 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i13 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i13 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // bm2.a
    public i getAnnotations() {
        i iVar = this.f23531a;
        if (iVar != null) {
            return iVar;
        }
        X(1);
        throw null;
    }
}
