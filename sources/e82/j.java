package e82;

import kotlin.jvm.internal.Intrinsics;
import so.ga;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final lu1.b f57875a;

    /* renamed from: b, reason: collision with root package name */
    public final x10.d f57876b;

    /* renamed from: c, reason: collision with root package name */
    public final cr1.a f57877c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f57878d;

    /* renamed from: e, reason: collision with root package name */
    public final ga f57879e;

    /* renamed from: f, reason: collision with root package name */
    public String f57880f;

    public j(lu1.b activityHelper, x10.d settingsApi, cr1.a accountService, b60.b activeUserManager, ga etsyConnectionFactory) {
        Intrinsics.checkNotNullParameter(activityHelper, "activityHelper");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(etsyConnectionFactory, "etsyConnectionFactory");
        this.f57875a = activityHelper;
        this.f57876b = settingsApi;
        this.f57877c = accountService;
        this.f57878d = activeUserManager;
        this.f57879e = etsyConnectionFactory;
        this.f57880f = "";
    }
}
