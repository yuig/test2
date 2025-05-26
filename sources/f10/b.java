package f10;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f60771a;

    public b(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f60771a = okHttpClient;
    }
}
