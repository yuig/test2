package pq2;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class r0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f101079c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101080d;

    public r0(int i13, Method method) {
        this.f101079c = method;
        this.f101080d = i13;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        if (obj != null) {
            x0Var.f101103c = obj.toString();
        } else {
            int i13 = this.f101080d;
            throw k1.n(this.f101079c, i13, "@Url parameter is null.", new Object[0]);
        }
    }
}
