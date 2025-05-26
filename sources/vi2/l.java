package vi2;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final b f125885a;

    /* renamed from: b, reason: collision with root package name */
    public final b f125886b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f125888d;

    public l(m mVar, b bVar, b bVar2) {
        this.f125888d = mVar;
        this.f125885a = bVar;
        this.f125886b = bVar2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Logger logger;
        ThreadLocal threadLocal;
        if (this.f125887c || this.f125888d.current() != this.f125886b) {
            logger = m.logger;
            logger.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f125887c = true;
            threadLocal = m.THREAD_LOCAL_STORAGE;
            threadLocal.set(this.f125885a);
        }
    }
}
