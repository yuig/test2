package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yh2 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final dv f14255a;

    /* renamed from: b, reason: collision with root package name */
    public final dj.e f14256b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14257c;

    public yh2(oh0 flags, dv cryptoUtil, dj.e signalRequest) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        this.f14255a = cryptoUtil;
        this.f14256b = signalRequest;
        this.f14257c = flags.I();
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_RESPONSE_ENCRYPTION_KEY;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        if (!this.f14257c.contains(String.valueOf(this.f14256b.f55121l.a()))) {
            return new pk0(new xh2(null));
        }
        a.ad c13 = this.f14255a.c();
        if (c13 instanceof jk0) {
            return (jk0) c13;
        }
        Intrinsics.g(c13, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        return new pk0(new xh2((String) ((pk0) c13).f9719b));
    }
}
