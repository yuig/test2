package com.pinterest.kit.network.image;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import hs1.q;
import hs1.r;
import hs1.t;
import kh2.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/kit/network/image/PinterestGlideModule;", "Lkh2/w;", "<init>", "()V", "images_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinterestGlideModule extends w {
    @Override // kh2.w
    public final void t0(Context context, b glide, j registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        q a13 = t.a();
        Intrinsics.g(a13, "null cannot be cast to non-null type com.pinterest.kit.network.image.ImageCacheBase");
        OkHttpClient okHttpClient = ((r) a13).f70071a;
        if (okHttpClient != null) {
            registry.i(new md.b(okHttpClient));
        }
    }
}
