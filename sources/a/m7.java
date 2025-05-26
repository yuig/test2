package a;

import android.os.Bundle;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class m7 {
    public static Bundle a(nm.u serverParameterData) {
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Bundle bundle = new Bundle();
        Iterator it = ((pm.l) serverParameterData.f91366a.keySet()).iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            try {
                Intrinsics.f(key);
                Intrinsics.checkNotNullParameter(serverParameterData, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                String p13 = serverParameterData.v(key).p();
                Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                bundle.putString(key, p13);
            } catch (IllegalStateException unused) {
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    public static Bundle b(wi.k baseRequest, MediationExtrasReceiver adapter) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Bundle bundle = (Bundle) baseRequest.f129961h.get(adapter.getClass().getName());
        return bundle == null ? new Bundle() : bundle;
    }

    public static NativeAdOptions c(bj.n nativeRequest) {
        int i13;
        int i14;
        VideoOptions videoOptions;
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        int i15 = zf.f201c[nativeRequest.j().ordinal()];
        int i16 = 4;
        if (i15 == 1) {
            i13 = 0;
        } else if (i15 == 2) {
            i13 = 1;
        } else if (i15 == 3) {
            i13 = 2;
        } else if (i15 == 4) {
            i13 = 3;
        } else {
            if (i15 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 4;
        }
        builder.d(i13);
        int i17 = zf.f200b[nativeRequest.e().ordinal()];
        if (i17 == 1) {
            i14 = 0;
        } else if (i17 == 2) {
            i14 = 1;
        } else if (i17 == 3) {
            i14 = 2;
        } else {
            if (i17 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = 3;
        }
        builder.c(i14);
        bj.e b13 = nativeRequest.b();
        int i18 = b13 == null ? -1 : zf.f199a[b13.ordinal()];
        if (i18 == 1) {
            i16 = 1;
        } else if (i18 == 2) {
            i16 = 2;
        } else if (i18 != 3) {
            i16 = i18 != 4 ? 0 : 8;
        }
        builder.b(i16, nativeRequest.f());
        builder.e(false);
        wi.e0 c13 = nativeRequest.c();
        if (c13 != null) {
            VideoOptions.Builder builder2 = new VideoOptions.Builder();
            builder2.d(c13.f129936a);
            builder2.b(c13.f129938c);
            builder2.c(c13.f129937b);
            videoOptions = builder2.a();
        } else {
            videoOptions = null;
        }
        if (videoOptions != null) {
            builder.f(videoOptions);
        }
        return builder.a();
    }

    public static String d(nm.u serverParameterData, wi.a0 requestConfiguration) {
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        if (!serverParameterData.f91366a.containsKey("max_ad_content_rating")) {
            return requestConfiguration.f129927c.getValue();
        }
        Intrinsics.checkNotNullParameter(serverParameterData, "<this>");
        Intrinsics.checkNotNullParameter("max_ad_content_rating", "key");
        String p13 = serverParameterData.v("max_ad_content_rating").p();
        Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
        return p13;
    }
}
