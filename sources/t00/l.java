package t00;

import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes3.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f115703a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115704b;

    /* renamed from: c, reason: collision with root package name */
    public final qb0.e f115705c;

    /* renamed from: d, reason: collision with root package name */
    public final c f115706d;

    /* renamed from: e, reason: collision with root package name */
    public final k f115707e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.e f115708f;

    /* renamed from: g, reason: collision with root package name */
    public final i f115709g;

    public l(b60.b activeUserManager, w eventManager, qb0.e networkUtils, c errorDialogChecks, k guardianErrorMessageHandler, m60.e applicationInfoProvider, i errorDialogDisplay) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(errorDialogChecks, "errorDialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f115703a = activeUserManager;
        this.f115704b = eventManager;
        this.f115705c = networkUtils;
        this.f115706d = errorDialogChecks;
        this.f115707e = guardianErrorMessageHandler;
        this.f115708f = applicationInfoProvider;
        this.f115709g = errorDialogDisplay;
    }

    @Override // t00.n
    public final m a(boolean z13) {
        return new d(new f(false, this.f115703a, this.f115704b, this.f115705c, this.f115706d, this.f115707e, this.f115708f, this.f115709g), 2);
    }
}
