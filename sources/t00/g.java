package t00;

import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f115680a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115681b;

    /* renamed from: c, reason: collision with root package name */
    public final qb0.e f115682c;

    /* renamed from: d, reason: collision with root package name */
    public final c f115683d;

    /* renamed from: e, reason: collision with root package name */
    public final k f115684e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.e f115685f;

    /* renamed from: g, reason: collision with root package name */
    public final i f115686g;

    public g(b60.b activeUserManager, w eventManager, qb0.e networkUtils, c errorDialogChecks, k guardianErrorMessageHandler, m60.e applicationInfoProvider, i errorDialogDisplay) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(errorDialogChecks, "errorDialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f115680a = activeUserManager;
        this.f115681b = eventManager;
        this.f115682c = networkUtils;
        this.f115683d = errorDialogChecks;
        this.f115684e = guardianErrorMessageHandler;
        this.f115685f = applicationInfoProvider;
        this.f115686g = errorDialogDisplay;
    }

    @Override // t00.n
    public final m a(boolean z13) {
        return new f(z13, this.f115680a, this.f115681b, this.f115682c, this.f115683d, this.f115684e, this.f115685f, this.f115686g);
    }
}
