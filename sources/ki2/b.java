package ki2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f79805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f79806b;

    public b(Runnable impl, Object priorityInfo) {
        Intrinsics.checkNotNullParameter(priorityInfo, "priorityInfo");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f79805a = priorityInfo;
        this.f79806b = impl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79806b.run();
    }
}
