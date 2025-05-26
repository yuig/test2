package t00;

import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f115666a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115667b;

    /* renamed from: c, reason: collision with root package name */
    public final qb0.e f115668c;

    /* renamed from: d, reason: collision with root package name */
    public final c f115669d;

    /* renamed from: e, reason: collision with root package name */
    public final k f115670e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.e f115671f;

    /* renamed from: g, reason: collision with root package name */
    public final i f115672g;

    public e(b60.b activeUserManager, w eventManager, qb0.e networkUtils, c errorDialogChecks, k guardianErrorMessageHandler, m60.e applicationInfoProvider, i errorDialogDisplay) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(errorDialogChecks, "errorDialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f115666a = activeUserManager;
        this.f115667b = eventManager;
        this.f115668c = networkUtils;
        this.f115669d = errorDialogChecks;
        this.f115670e = guardianErrorMessageHandler;
        this.f115671f = applicationInfoProvider;
        this.f115672g = errorDialogDisplay;
    }

    @Override // t00.n
    public final m a(boolean z13) {
        return new d(new f(z13, this.f115666a, this.f115667b, this.f115668c, this.f115669d, this.f115670e, this.f115671f, this.f115672g), 0);
    }
}
