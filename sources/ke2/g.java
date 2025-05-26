package ke2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap f79329a;

    static {
        Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "also(...)");
        f79329a = createBitmap;
    }
}
