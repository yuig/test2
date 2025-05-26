package t00;

import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f115693a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115694b;

    /* renamed from: c, reason: collision with root package name */
    public final qb0.e f115695c;

    /* renamed from: d, reason: collision with root package name */
    public final c f115696d;

    /* renamed from: e, reason: collision with root package name */
    public final k f115697e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.e f115698f;

    /* renamed from: g, reason: collision with root package name */
    public final i f115699g;

    public j(b60.b activeUserManager, x92.b developerPreferences, w eventManager, qb0.e networkUtils, c errorDialogChecks, k guardianErrorMessageHandler, m60.e applicationInfoProvider, i errorDialogDisplay) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(errorDialogChecks, "errorDialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f115693a = activeUserManager;
        this.f115694b = eventManager;
        this.f115695c = networkUtils;
        this.f115696d = errorDialogChecks;
        this.f115697e = guardianErrorMessageHandler;
        this.f115698f = applicationInfoProvider;
        this.f115699g = errorDialogDisplay;
    }

    @Override // t00.n
    public final m a(boolean z13) {
        return new d(new f(z13, this.f115693a, this.f115694b, this.f115695c, this.f115696d, this.f115697e, this.f115698f, this.f115699g), 1);
    }
}
