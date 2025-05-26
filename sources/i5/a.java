package i5;

import android.location.LocationManager;
import android.os.Build;
import c5.y;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class a {
    static {
        new WeakHashMap();
    }

    public static boolean a(LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? y.l(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
