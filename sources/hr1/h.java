package hr1;

import kotlin.jvm.internal.Intrinsics;
import so.ia;

/* loaded from: classes4.dex */
public final class h extends lr1.g {

    /* renamed from: h, reason: collision with root package name */
    public final ia f69995h;

    /* renamed from: i, reason: collision with root package name */
    public final String f69996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ia authControllerFactory, mr1.c activityProvider, uj2.q resultsFeed, String logValue) {
        super(qr1.f.f104999b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(authControllerFactory, "authControllerFactory");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        this.f69995h = authControllerFactory;
        this.f69996i = logValue;
    }

    @Override // or1.p
    public final String a() {
        return this.f69996i;
    }

    @Override // lr1.g
    public final kk2.m c() {
        return (kk2.m) new g(this.f69995h, this.f84602b, this.f84603c).b();
    }
}
