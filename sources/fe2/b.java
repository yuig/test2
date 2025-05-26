package fe2;

import android.graphics.Bitmap;
import ge2.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: m, reason: collision with root package name */
    public final Bitmap f62087m;

    /* renamed from: n, reason: collision with root package name */
    public float f62088n;

    /* renamed from: o, reason: collision with root package name */
    public float f62089o;

    public b(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f62087m = bitmap;
        this.f62088n = bitmap.getWidth();
        this.f62089o = bitmap.getHeight();
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
