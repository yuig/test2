package ads_mobile_sdk;

import android.location.Location;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bl1 implements NativeMediationAdRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Set f3516a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3519d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3520e;

    /* renamed from: f, reason: collision with root package name */
    public final Location f3521f;

    /* renamed from: g, reason: collision with root package name */
    public final NativeAdOptions f3522g;

    public bl1(Set set, boolean z13, int i13, int i14, String str, Location location, NativeAdOptions nativeAdOptions) {
        Intrinsics.checkNotNullParameter(nativeAdOptions, "nativeAdOptions");
        this.f3516a = set;
        this.f3517b = z13;
        this.f3518c = i13;
        this.f3519d = i14;
        this.f3520e = str;
        this.f3521f = location;
        this.f3522g = nativeAdOptions;
    }

    public /* synthetic */ bl1(Set set, boolean z13, int i13, int i14, String str, NativeAdOptions nativeAdOptions) {
        this(set, z13, i13, i14, str, null, nativeAdOptions);
    }
}
