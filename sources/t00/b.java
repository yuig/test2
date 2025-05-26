package t00;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f115663a;

    public b(b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f115663a = activeUserManager;
    }

    @Override // t00.m
    public final void b(String errorData, String baseUrl, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        a(yb2.a.c(errorData), baseUrl, throwable);
    }
}
