package ads_mobile_sdk;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hp {

    /* renamed from: a, reason: collision with root package name */
    public static final hp f6036a = new hp();

    public final ThreadPoolExecutor a(int i13, long j13, String poolName) {
        Intrinsics.checkNotNullParameter(poolName, "poolName");
        int i14 = kp.f7424g;
        Intrinsics.checkNotNullParameter(poolName, "poolName");
        zn2.a aVar = zn2.b.f142311b;
        return new ThreadPoolExecutor(i13, i13, zn2.b.n(j13, zn2.d.SECONDS), TimeUnit.SECONDS, new LinkedBlockingQueue(), new ip(poolName));
    }
}
