package tb0;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new f0.a(1, runnable));
    }
}
