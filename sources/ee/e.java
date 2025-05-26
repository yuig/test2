package ee;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f58762d;

    /* renamed from: a, reason: collision with root package name */
    public final View f58763a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f58764b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public d f58765c;

    public e(ImageView imageView) {
        this.f58763a = imageView;
    }

    public final int a(int i13, int i14, int i15) {
        int i16 = i14 - i15;
        if (i16 > 0) {
            return i16;
        }
        int i17 = i13 - i15;
        if (i17 > 0) {
            return i17;
        }
        View view = this.f58763a;
        if (view.isLayoutRequested() || i14 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f58762d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            d7.b.p(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f58762d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f58762d.intValue();
    }
}
