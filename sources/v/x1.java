package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f123734e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f123735f = new Size(320, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f123736g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f123737h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile x1 f123738i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f123739a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Size f123740b = null;

    /* renamed from: c, reason: collision with root package name */
    public final z.c f123741c = new z.c(0);

    /* renamed from: d, reason: collision with root package name */
    public final gc.c f123742d = new gc.c(7);

    public x1(Context context) {
        this.f123739a = (DisplayManager) context.getSystemService("display");
    }

    public static x1 b(Context context) {
        if (f123738i == null) {
            synchronized (f123737h) {
                try {
                    if (f123738i == null) {
                        f123738i = new x1(context);
                    }
                } finally {
                }
            }
        }
        return f123738i;
    }

    public static Display d(Display[] displayArr, boolean z13) {
        Display display = null;
        int i13 = -1;
        for (Display display2 : displayArr) {
            if (!z13 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i14 = point.x * point.y;
                if (i14 > i13) {
                    display = display2;
                    i13 = i14;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size e13;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = k0.c.f77781a;
        if (size.getHeight() * size.getWidth() < k0.c.a(f123735f)) {
            size = ((SmallDisplaySizeQuirk) this.f123742d.f64764b) != null ? (Size) SmallDisplaySizeQuirk.f16782a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f123736g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f123734e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        return (this.f123741c.f140502a == null || (e13 = ExtraCroppingQuirk.e(androidx.camera.core.impl.t2.PRIV)) == null) ? size : e13.getHeight() * e13.getWidth() > size.getHeight() * size.getWidth() ? e13 : size;
    }

    public final Display c(boolean z13) {
        Display[] displays = this.f123739a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d2 = d(displays, z13);
        if (d2 == null && z13) {
            d2 = d(displays, false);
        }
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f123740b != null) {
            return this.f123740b;
        }
        this.f123740b = a();
        return this.f123740b;
    }
}
