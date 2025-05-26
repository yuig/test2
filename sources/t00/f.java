package t00;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.error.ServerError;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import v.f1;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115673b;

    /* renamed from: c, reason: collision with root package name */
    public final w f115674c;

    /* renamed from: d, reason: collision with root package name */
    public final qb0.e f115675d;

    /* renamed from: e, reason: collision with root package name */
    public final c f115676e;

    /* renamed from: f, reason: collision with root package name */
    public final k f115677f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.e f115678g;

    /* renamed from: h, reason: collision with root package name */
    public final i f115679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z13, b60.b activeUserManager, w eventManager, qb0.e networkUtils, c errorDialogChecks, k guardianErrorMessageHandler, m60.e applicationInfoProvider, i errorDialogDisplay) {
        super(activeUserManager);
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(errorDialogChecks, "errorDialogChecks");
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(errorDialogDisplay, "errorDialogDisplay");
        this.f115673b = z13;
        this.f115674c = eventManager;
        this.f115675d = networkUtils;
        this.f115676e = errorDialogChecks;
        this.f115677f = guardianErrorMessageHandler;
        this.f115678g = applicationInfoProvider;
        this.f115679h = errorDialogDisplay;
    }

    @Override // t00.m
    public final void a(qz.d response, String baseUrl, Throwable th3) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        int i13 = response.f105387g;
        Integer num = null;
        if (th3 instanceof ServerError) {
            f1 f1Var2 = ((ServerError) th3).f45043a;
            if (f1Var2 != null) {
                num = Integer.valueOf(f1Var2.f123449b);
            }
        } else if ((th3 instanceof NetworkResponseError) && (f1Var = ((NetworkResponseError) th3).f45043a) != null) {
            num = Integer.valueOf(f1Var.f123449b);
        }
        this.f115677f.a(i13, response, num);
        if (this.f115675d.c()) {
            if (((b60.d) this.f115663a).i() && h.a().contains(Integer.valueOf(i13))) {
                this.f115674c.d(new a(baseUrl));
            }
            this.f115676e.getClass();
            boolean contains = h.f115688b.contains(Integer.valueOf(i13));
            i iVar = this.f115679h;
            if (contains) {
                iVar.a(response.f105384d, response.f105385e);
                return;
            }
            boolean z13 = this.f115673b;
            if (z13 && !h.f115689c.contains(Integer.valueOf(i13)) && i13 != -1000) {
                iVar.b(response.f105384d, th3);
            } else if (z13) {
                ((m60.d) this.f115678g).g();
            }
        }
    }
}
