package pq2;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes4.dex */
public final class m extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final i f101059a;

    public m(g0 g0Var) {
        this.f101059a = g0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        if (z13) {
            this.f101059a.cancel();
        }
        return super.cancel(z13);
    }
}
