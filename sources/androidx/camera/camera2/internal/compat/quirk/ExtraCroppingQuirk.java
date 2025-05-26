package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.x1;
import java.util.HashMap;
import java.util.Locale;
import y.c;

/* loaded from: classes2.dex */
public class ExtraCroppingQuirk implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f16761a;

    static {
        HashMap hashMap = new HashMap();
        f16761a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(t2 t2Var) {
        if (!f()) {
            return null;
        }
        int i13 = c.f136246a[t2Var.ordinal()];
        if (i13 == 1) {
            return new Size(1920, 1080);
        }
        if (i13 == 2) {
            return new Size(1280, 720);
        }
        if (i13 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap hashMap = f16761a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!hashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) hashMap.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
