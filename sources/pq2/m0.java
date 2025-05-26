package pq2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes4.dex */
public final class m0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f101060c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101061d;

    public m0(int i13, Method method) {
        this.f101060c = method;
        this.f101061d = i13;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        Headers headers = (Headers) obj;
        if (headers == null) {
            int i13 = this.f101061d;
            throw k1.n(this.f101060c, i13, "Headers parameter must not be null.", new Object[0]);
        }
        Headers.Builder builder = x0Var.f101106f;
        builder.getClass();
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i14 = 0; i14 < size; i14++) {
            builder.c(headers.d(i14), headers.j(i14));
        }
    }
}
