package uz1;

import android.content.Context;
import android.graphics.Bitmap;
import com.pinterest.ui.imageview.GenericWebImageView;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final hs1.q f123326a;

    public x(hs1.q imageCache, int i13) {
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            this.f123326a = imageCache;
        } else {
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            this.f123326a = imageCache;
        }
    }

    public static ArrayList c(ArrayList bitmaps, int i13, int i14, Context context) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList(g0.q(bitmaps, 10));
        Iterator it = bitmaps.iterator();
        while (it.hasNext()) {
            arrayList.add(Bitmap.createScaledBitmap((Bitmap) it.next(), context.getResources().getDimensionPixelSize(i13), context.getResources().getDimensionPixelSize(i14), false));
        }
        return arrayList;
    }

    public final ArrayList a(Context context, List pinImageUrls, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
        return kh2.g0.d(pinImageUrls, i15, this.f123326a, context.getResources().getDimensionPixelSize(i13), context.getResources().getDimensionPixelSize(i14));
    }

    public final void b(String str, boolean z13, int i13, int i14, Map map, hs1.a cacheableImage, boolean z14) {
        Intrinsics.checkNotNullParameter(cacheableImage, "cacheableImage");
        cacheableImage.p1(z13);
        if (str == null || kotlin.text.z.j(str)) {
            return;
        }
        hs1.z o13 = ((hs1.m) this.f123326a).o(str, z14);
        o13.f70086d = z13;
        if (i13 != 0) {
            o13.f70087e = i13;
        }
        if (i14 != 0) {
            o13.f70088f = i14;
        }
        if (map != null) {
            o13.f70084b = map;
        }
        o13.a(cacheableImage);
        new py.f(str, cacheableImage instanceof GenericWebImageView ? ((GenericWebImageView) cacheableImage).A : d4.UNKNOWN_VIEW, -1, q92.c.OTHER).i();
    }
}
