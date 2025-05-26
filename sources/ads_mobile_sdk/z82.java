package ads_mobile_sdk;

import a.d6;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public abstract class z82 {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine f14678a;

    /* renamed from: b, reason: collision with root package name */
    public d6 f14679b = null;

    public z82(CronetEngine cronetEngine) {
        cronetEngine.getClass();
        this.f14678a = cronetEngine;
        bf.b.k(getClass().equals(a.sf.class));
    }

    public final zu a() {
        if (this.f14679b == null) {
            this.f14679b = a.l9.f96q;
        }
        return new zu(new y82(this.f14678a, Executors.newFixedThreadPool(4), new f82(new a.e0(), new e82(Executors.newCachedThreadPool())), new m92(), this.f14679b));
    }
}
