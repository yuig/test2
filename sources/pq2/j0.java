package pq2;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class j0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f101043c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101044d;

    /* renamed from: e, reason: collision with root package name */
    public final p f101045e;

    public j0(Method method, int i13, p pVar) {
        this.f101043c = method;
        this.f101044d = i13;
        this.f101045e = pVar;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        int i13 = this.f101044d;
        Method method = this.f101043c;
        if (obj == null) {
            throw k1.n(method, i13, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            x0Var.f101111k = (RequestBody) this.f101045e.a(obj);
        } catch (IOException e13) {
            throw k1.o(method, e13, i13, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
