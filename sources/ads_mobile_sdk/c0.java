package ads_mobile_sdk;

import ao2.j0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3666a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f3667b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3668c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f3669d;

    public c0(j0 backgroundScope, oh0 flags) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f3666a = backgroundScope;
        this.f3667b = flags;
        this.f3668c = new AtomicInteger(0);
        this.f3669d = new ConcurrentHashMap();
    }
}
