package qz;

import android.os.SystemClock;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes3.dex */
public final class m extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OkHttpClient.Builder f105414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(OkHttpClient.Builder builder, hb0.a aVar) {
        super(aVar);
        this.f105414d = builder;
    }

    @Override // hb0.c
    public final void c() {
        OkHttpClient.Builder builder = this.f105414d;
        builder.getClass();
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        vb0.j.f125475j = SystemClock.elapsedRealtime();
        Request.Builder builder2 = new Request.Builder();
        builder2.j("https://i.pinimg.com/_/_/warm/");
        CacheControl cacheControl = CacheControl.f95522o;
        builder2.c(cacheControl);
        builder2.f("HEAD", null);
        okHttpClient.newCall(builder2.b()).k1(q.f105427b);
        vb0.j.f125469d = SystemClock.elapsedRealtime();
        Request.Builder builder3 = new Request.Builder();
        builder3.j("https://api.pinterest.com/_/_/warm/");
        builder3.c(cacheControl);
        builder3.f("HEAD", null);
        okHttpClient.newCall(builder3.b()).k1(q.f105428c);
    }
}
