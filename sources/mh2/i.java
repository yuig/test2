package mh2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f87181a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f87182b;

    public i(d getConfigLogLimit) {
        Intrinsics.checkNotNullParameter(getConfigLogLimit, "getConfigLogLimit");
        this.f87181a = getConfigLogLimit;
        this.f87182b = new AtomicInteger(0);
    }
}
