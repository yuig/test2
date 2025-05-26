package pd;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final nd.h f99632a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99633b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f99634c;

    public b(nd.h hVar, a0 a0Var, ReferenceQueue referenceQueue, boolean z13) {
        super(a0Var, referenceQueue);
        g0 g0Var;
        d7.b.p(hVar, "Argument must not be null");
        this.f99632a = hVar;
        if (a0Var.f99625a && z13) {
            g0Var = a0Var.e();
            d7.b.p(g0Var, "Argument must not be null");
        } else {
            g0Var = null;
        }
        this.f99634c = g0Var;
        this.f99633b = a0Var.f99625a;
    }

    public final void a() {
        this.f99634c = null;
        clear();
    }
}
