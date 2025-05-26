package jn2;

import pn2.b0;

/* loaded from: classes2.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f77123a;

    public a(b0 b0Var) {
        if (b0Var != null) {
            this.f77123a = b0Var;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i13 == 1) {
            objArr[1] = "getType";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 1 && i13 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // jn2.f
    public final b0 getType() {
        b0 b0Var = this.f77123a;
        if (b0Var != null) {
            return b0Var;
        }
        a(1);
        throw null;
    }
}
