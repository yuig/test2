package p000do;

import android.os.Bundle;
import com.livefront.bridge.wrapper.b;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import s.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f55639a = Executors.newCachedThreadPool();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f55640b;

    public static synchronized void a() {
        synchronized (a.class) {
            if (f55640b == null) {
                throw new IllegalStateException("You must first call initialize before calling any other methods");
            }
        }
    }

    public static void b(Bundle bundle, Object obj) {
        a();
        b bVar = f55640b;
        WeakHashMap weakHashMap = bVar.f55646e;
        String str = (String) weakHashMap.get(obj);
        if (str == null) {
            str = UUID.randomUUID().toString();
            weakHashMap.put(obj, str);
        }
        bundle.putString("uuid_".concat(obj.getClass().getName()), str);
        Bundle bundle2 = new Bundle();
        bVar.f55647f.a(bundle2, obj);
        if (bundle2.isEmpty()) {
            return;
        }
        b.b(bundle2);
        bVar.f55645d.put(str, bundle2);
        e eVar = new e(bVar, str, bundle2, 1);
        if (bVar.f55652k == null || bVar.f55652k.getCount() == 0) {
            bVar.f55652k = new CountDownLatch(1);
        }
        bVar.f55644c.add(eVar);
        bVar.f55643b.execute(eVar);
        if (bVar.f55648g > 0 || bVar.f55650i) {
            return;
        }
        try {
            bVar.f55652k.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        bVar.f55652k = null;
    }
}
