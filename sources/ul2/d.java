package ul2;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends sh.f {

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f122506f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f122507g;

    public d(b compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f122506f = compute;
        this.f122507g = new ConcurrentHashMap();
    }
}
