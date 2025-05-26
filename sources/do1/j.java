package do1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i f55680a;

    public j(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f55680a = new f(drawable);
    }

    public j(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f55680a = new h(uri);
    }

    public j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f55680a = new g(url);
    }
}
