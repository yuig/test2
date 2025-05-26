package wn2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f130608a;

    public j(Throwable th3) {
        this.f130608a = th3;
    }

    public static /* synthetic */ void a(int i13) {
        String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 1 ? 3 : 2];
        if (i13 != 1) {
            objArr[0] = "throwable";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        }
        if (i13 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        } else {
            objArr[1] = "getThrowable";
        }
        if (i13 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 == 1) {
            throw new IllegalStateException(format);
        }
    }

    public final Throwable b() {
        Throwable th3 = this.f130608a;
        if (th3 != null) {
            return th3;
        }
        a(1);
        throw null;
    }

    public final String toString() {
        return this.f130608a.toString();
    }
}
