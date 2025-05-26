package hs1;

import android.graphics.Bitmap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import vu1.a0;

/* loaded from: classes2.dex */
public abstract class r implements q {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config f70066d = Bitmap.Config.ARGB_8888;

    /* renamed from: e, reason: collision with root package name */
    public static final Request f70067e;

    /* renamed from: f, reason: collision with root package name */
    public static final a10.e f70068f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f70069g;

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f70070h;

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f70071a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f70072b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f70073c;

    static {
        Request.Builder builder = new Request.Builder();
        builder.j("https://i.pinimg.com/_/_/r20.gif");
        builder.c(CacheControl.f95522o);
        builder.f("HEAD", null);
        f70067e = builder.b();
        f70068f = new a10.e(2);
        f70069g = new LinkedHashSet();
        f70070h = new LinkedHashSet();
    }

    public final boolean e(a cacheableImage, String url, Map map, boolean z13, int i13, int i14, Boolean bool, List list, boolean z14) {
        Intrinsics.checkNotNullParameter(cacheableImage, "cacheableImage");
        Intrinsics.checkNotNullParameter(url, "url");
        z o13 = ((m) this).o(url, z14);
        o13.f70086d = z13;
        o13.f70087e = i13;
        o13.f70088f = i14;
        o13.f70084b = map;
        o13.f70089g = bool != null ? bool.booleanValue() : false;
        o13.f70090h = list;
        o13.a(cacheableImage);
        return false;
    }

    public final void f(int i13) {
        Call newCall;
        for (int i14 = 0; i14 < i13; i14++) {
            OkHttpClient okHttpClient = this.f70071a;
            if (okHttpClient != null && (newCall = okHttpClient.newCall(f70067e)) != null) {
                newCall.k1(f70068f);
            }
        }
    }

    public final void g(boolean z13) {
        ConnectionPool connectionPool;
        Call newCall;
        if (!z13) {
            OkHttpClient okHttpClient = this.f70071a;
            int a13 = (okHttpClient == null || (connectionPool = okHttpClient.connectionPool()) == null) ? 0 : connectionPool.a();
            if (a13 < 4) {
                f(4 - a13);
                return;
            }
            return;
        }
        Request.Builder builder = new Request.Builder();
        builder.j("https://i.pinimg.com/_/_/r20.gif");
        builder.f("HEAD", null);
        Request b13 = builder.b();
        a0 a0Var = this.f70072b;
        if (a0Var == null || (newCall = a0Var.newCall(b13)) == null) {
            return;
        }
        newCall.k1(f70068f);
    }
}
