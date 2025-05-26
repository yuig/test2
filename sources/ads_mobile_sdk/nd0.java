package ads_mobile_sdk;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class nd0 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final md0 f8757a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f8758b;

    public nd0(md0 firebaseAnalyticsIds, oh0 flags) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsIds, "firebaseAnalyticsIds");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f8757a = firebaseAnalyticsIds;
        this.f8758b = flags;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Uri.Builder appendQueryParameter = Uri.parse(z.n(chain.getF95974e().f95700a.f95639i, (String) this.f8758b.a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", oh0.f9294r), this.f8757a.f8178c)).buildUpon().appendQueryParameter("gmp_app_id", this.f8757a.f8176a).appendQueryParameter("fbs_aiid", this.f8757a.f8177b);
        if (appendQueryParameter.build().getQueryParameter("fbs_aeid") == null) {
            appendQueryParameter.appendQueryParameter("fbs_aeid", this.f8757a.f8178c);
        }
        Uri build = appendQueryParameter.build();
        Request.Builder builder = new Request.Builder();
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        builder.j(uri);
        return chain.b(builder.b());
    }
}
