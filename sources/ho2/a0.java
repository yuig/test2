package ho2;

import ao2.n2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f69744a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f69745b;

    /* renamed from: c, reason: collision with root package name */
    public final n2[] f69746c;

    /* renamed from: d, reason: collision with root package name */
    public int f69747d;

    public a0(CoroutineContext coroutineContext, int i13) {
        this.f69744a = coroutineContext;
        this.f69745b = new Object[i13];
        this.f69746c = new n2[i13];
    }

    public final void a(n2 n2Var, Object obj) {
        int i13 = this.f69747d;
        this.f69745b[i13] = obj;
        this.f69747d = i13 + 1;
        Intrinsics.g(n2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.f69746c[i13] = n2Var;
    }

    public final void b(CoroutineContext coroutineContext) {
        n2[] n2VarArr = this.f69746c;
        int length = n2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i13 = length - 1;
            n2 n2Var = n2VarArr[length];
            Intrinsics.f(n2Var);
            n2Var.restoreThreadContext(coroutineContext, this.f69745b[length]);
            if (i13 < 0) {
                return;
            } else {
                length = i13;
            }
        }
    }
}
