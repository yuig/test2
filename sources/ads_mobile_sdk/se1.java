package ads_mobile_sdk;

import a.w8;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class se1 implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final ni f11067a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1 f11068b;

    public se1(ni bannerRendererProvider, rm1 nativeRendererProvider) {
        Intrinsics.checkNotNullParameter(bannerRendererProvider, "bannerRendererProvider");
        Intrinsics.checkNotNullParameter(nativeRendererProvider, "nativeRendererProvider");
        this.f11067a = bannerRendererProvider;
        this.f11068b = nativeRendererProvider;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        w8 w8Var;
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        int ordinal = adConfiguration.f10377l.ordinal();
        if (ordinal == 1) {
            w8Var = new w8(this.f11067a.a(serverTransaction, adConfiguration), oe1.f9237a);
        } else {
            if (ordinal != 3) {
                return new a.db();
            }
            w8Var = new w8(this.f11068b.a(serverTransaction, adConfiguration), qe1.f10056a);
        }
        return w8Var;
    }
}
