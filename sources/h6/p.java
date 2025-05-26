package h6;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class p extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f67744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f67745b;

    public p(com.bumptech.glide.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f67744a = dVar;
        this.f67745b = threadPoolExecutor;
    }

    @Override // com.bumptech.glide.d
    public final void m0(Throwable th3) {
        ThreadPoolExecutor threadPoolExecutor = this.f67745b;
        try {
            this.f67744a.m0(th3);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.bumptech.glide.d
    public final void n0(com.google.firebase.messaging.q qVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f67745b;
        try {
            this.f67744a.n0(qVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
