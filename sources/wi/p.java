package wi;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f129977a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f129978b;

    public p(Drawable drawable, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f129977a = drawable;
        this.f129978b = uri;
    }
}
