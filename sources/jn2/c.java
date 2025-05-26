package jn2;

import pn2.b0;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final am2.b f77127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(am2.b bVar, b0 b0Var) {
        super(b0Var);
        if (bVar == null) {
            a(0);
            throw null;
        }
        if (b0Var == null) {
            a(1);
            throw null;
        }
        this.f77127b = bVar;
    }

    public static /* synthetic */ void a(int i13) {
        String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 2 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "receiverType";
        } else if (i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i13 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i13 != 2) {
            if (i13 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f77127b + "}";
    }
}
