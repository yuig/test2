package m5;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f85861a;

    /* renamed from: b, reason: collision with root package name */
    public int f85862b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f85861a, this.f85862b);
    }
}
