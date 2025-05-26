package t00;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115664a;

    /* renamed from: b, reason: collision with root package name */
    public final m f115665b;

    public d(f defaultRouter, int i13) {
        this.f115664a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(defaultRouter, "defaultRouter");
            this.f115665b = defaultRouter;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(defaultRouter, "defaultRouter");
            this.f115665b = defaultRouter;
        } else {
            Intrinsics.checkNotNullParameter(defaultRouter, "defaultRouter");
            this.f115665b = defaultRouter;
        }
    }

    @Override // t00.m
    public final void a(qz.d response, String baseUrl, Throwable th3) {
        int i13 = this.f115664a;
        m mVar = this.f115665b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                String e13 = response.e();
                if (th3 == null) {
                    mVar.a(response, baseUrl, new Throwable(e13));
                    break;
                } else {
                    mVar.a(response, baseUrl, th3);
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(response, "response");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                String str = response.f105384d;
                if (th3 == null) {
                    mVar.a(response, baseUrl, new Throwable(str));
                    break;
                } else {
                    mVar.a(response, baseUrl, th3);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                String str2 = response.f105384d;
                if (th3 == null) {
                    mVar.a(response, baseUrl, new Throwable(str2, th3));
                    break;
                } else {
                    mVar.a(response, baseUrl, th3);
                    break;
                }
        }
    }

    @Override // t00.m
    public final void b(String errorData, String baseUrl, Throwable throwable) {
        int i13 = this.f115664a;
        m mVar = this.f115665b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(errorData, "errorData");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                mVar.b(errorData, baseUrl, throwable);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(errorData, "errorData");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                mVar.b(errorData, baseUrl, throwable);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(errorData, "errorData");
                Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                mVar.b(errorData, baseUrl, throwable);
                break;
        }
    }
}
