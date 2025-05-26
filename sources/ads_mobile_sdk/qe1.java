package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class qe1 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qe1 f10056a = new qe1();

    public qe1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InternalNativeAd ad3 = (InternalNativeAd) obj;
        Intrinsics.checkNotNullParameter(ad3, "ad");
        return new fe1(ad3);
    }
}
