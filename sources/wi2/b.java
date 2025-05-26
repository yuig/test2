package wi2;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public abstract class b extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f130016a;

    public b(ConcurrentHashMap concurrentHashMap) {
        this.f130016a = concurrentHashMap;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, this.f130016a.entrySet().iterator());
    }

    public final String toString() {
        return this.f130016a.toString();
    }
}
