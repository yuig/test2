package dl1;

import android.util.LruCache;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f55284a = new LruCache(20);

    public final void a(m mVar, s sVar) {
        Long l13 = mVar.f55252b;
        q qVar = new q();
        qVar.f55266b = System.currentTimeMillis();
        if (sVar == null) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.o("MemoryCache entry should have a model", new IllegalArgumentException());
        }
        qVar.f55265a = sVar;
        qVar.f55267c = l13;
        this.f55284a.put(mVar, qVar);
    }
}
