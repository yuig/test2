package sl;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements zl.c, zl.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f113153a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f113154b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f113155c;

    public l(Executor executor) {
        this.f113155c = executor;
    }

    public final synchronized void a(Executor executor, zl.a aVar) {
        try {
            executor.getClass();
            if (!this.f113153a.containsKey(nl.b.class)) {
                this.f113153a.put(nl.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f113153a.get(nl.b.class)).put(aVar, executor);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
