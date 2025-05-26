package xn;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import kh2.u2;
import ll.j;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final c f135423f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f135424g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f135425h;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f135426a;

    /* renamed from: b, reason: collision with root package name */
    public final yn.b f135427b;

    /* renamed from: c, reason: collision with root package name */
    public final d f135428c;

    /* renamed from: d, reason: collision with root package name */
    public final j f135429d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f135430e;

    static {
        int i13 = 0;
        new c(2, i13);
        f135423f = new c(1, i13);
        f135424g = new c(3);
        f135425h = new c(i13);
    }

    public e(Context context, Uri uri, Uri uri2) {
        yn.b bVar = new yn.b(context);
        this.f135428c = new d(this, 0);
        this.f135429d = new j(this, 12);
        this.f135426a = uri2;
        this.f135427b = bVar;
        this.f135430e = uri;
    }

    public final rn.b a() {
        rn.b a13 = this.f135427b.a(u2.I(this.f135430e, new String[0]), Collections.emptyMap(), Collections.emptyMap(), f135424g);
        if (!a13.d()) {
            Log.e("LineAuthApiClient", "getOpenIdDiscoveryDocument failed: " + a13);
        }
        return a13;
    }
}
