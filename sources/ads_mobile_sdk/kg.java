package ads_mobile_sdk;

import a.zb;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kg {

    /* renamed from: a, reason: collision with root package name */
    public final zb f7287a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7288b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f7289c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f7290d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f7291e;

    /* renamed from: f, reason: collision with root package name */
    public Long f7292f;

    public kg(zb clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f7287a = clock;
        this.f7288b = new Object();
        this.f7289c = new AtomicInteger(-1);
        this.f7290d = new AtomicInteger(-1);
        this.f7291e = new AtomicInteger(-1);
        new AtomicInteger(0);
    }
}
