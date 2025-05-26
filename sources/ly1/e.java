package ly1;

import kotlin.jvm.internal.Intrinsics;
import ny.g;
import okhttp3.HttpUrl;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes4.dex */
public final class e implements uu1.c {
    @Override // uu1.c
    public final void a(RequestFinishedInfo info2) {
        Intrinsics.checkNotNullParameter(info2, "info");
        HttpUrl.Companion companion = HttpUrl.f95629k;
        String url = info2.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        companion.getClass();
        if (com.bumptech.glide.c.r0(HttpUrl.Companion.d(url))) {
            new g(info2.getMetrics().getSocketReused()).i();
        }
    }
}
