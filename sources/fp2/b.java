package fp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f62786a = new ReentrantReadWriteLock(false);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f62787b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f62788c = new AtomicInteger();

    public b() {
        new ArrayList();
    }

    public final void a(String str, int i13, int i14) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f62786a;
        reentrantReadWriteLock.readLock().lock();
        HashMap hashMap = this.f62787b;
        try {
            a aVar = (a) hashMap.get(str);
            AtomicInteger atomicInteger = this.f62788c;
            if (aVar != null) {
                if (!aVar.a(i14)) {
                    atomicInteger.incrementAndGet();
                }
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                a aVar2 = (a) hashMap.get(str);
                if (aVar2 == null) {
                    if (hashMap.size() >= 256) {
                        atomicInteger.incrementAndGet();
                    } else {
                        aVar2 = new a(i13, str);
                        hashMap.put(str, aVar2);
                    }
                }
                if (!aVar2.a(i14)) {
                    atomicInteger.incrementAndGet();
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
