package xn;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import kh2.u2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f135432c = new c(13);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f135433a;

    /* renamed from: b, reason: collision with root package name */
    public final yn.b f135434b;

    static {
        new c(5);
        new c(4);
        new c(6);
        new c(8);
        Object obj = null;
        new c(9, obj);
        new c(10, obj);
        new c(12, obj);
        new c(7, obj);
        new c(11, obj);
    }

    public g(Context context, Uri uri) {
        yn.b bVar = new yn.b(context);
        this.f135433a = uri;
        this.f135434b = bVar;
    }

    public static LinkedHashMap a(wn.e eVar) {
        return u2.B("Authorization", "Bearer " + eVar.f130435a);
    }
}
