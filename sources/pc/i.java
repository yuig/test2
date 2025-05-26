package pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f99568b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f99569c;

    public i(c0 element, f0 left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f99568b = left;
        this.f99569c = element;
    }

    @Override // pc.f0
    public final c0 a(d0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i iVar = this;
        while (true) {
            c0 a13 = iVar.f99569c.a(key);
            if (a13 != null) {
                return a13;
            }
            f0 f0Var = iVar.f99568b;
            if (!(f0Var instanceof i)) {
                return f0Var.a(key);
            }
            iVar = (i) f0Var;
        }
    }

    @Override // pc.f0
    public final f0 b(d0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c0 c0Var = this.f99569c;
        c0 a13 = c0Var.a(key);
        f0 f0Var = this.f99568b;
        if (a13 != null) {
            return f0Var;
        }
        f0 b13 = f0Var.b(key);
        return b13 == f0Var ? this : b13 == y.f99612b ? c0Var : new i(c0Var, b13);
    }

    @Override // pc.f0
    public final f0 c(f0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == y.f99612b ? this : (f0) context.d(this);
    }

    @Override // pc.f0
    public final Object d(Object obj) {
        e0 operation = e0.f99540i;
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f99568b.d(obj), this.f99569c);
    }
}
