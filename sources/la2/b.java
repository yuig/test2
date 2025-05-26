package la2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82549a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f82550b;

    public b(Bitmap bitmap, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f82549a = url;
        this.f82550b = bitmap;
    }
}
