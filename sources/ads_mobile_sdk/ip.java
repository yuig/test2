package ads_mobile_sdk;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ip implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f6512a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6513b;

    public ip(String str) {
        this.f6513b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new Thread(runnable, "GMA(" + this.f6513b + ") " + this.f6512a.getAndIncrement());
    }
}
