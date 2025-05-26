package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.x1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import pk2.f;

/* loaded from: classes2.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f16762a;

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f16763b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f16764c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f16765d;

    static {
        r2 r2Var = new r2();
        t2 t2Var = t2.YUV;
        s2 s2Var = s2.VGA;
        r2Var.a(l.a(t2Var, s2Var));
        t2 t2Var2 = t2.PRIV;
        s2 s2Var2 = s2.PREVIEW;
        r2Var.a(l.a(t2Var2, s2Var2));
        s2 s2Var3 = s2.MAXIMUM;
        f.n(t2Var, s2Var3, 0L, r2Var);
        f16762a = r2Var;
        r2 r2Var2 = new r2();
        r2Var2.a(new l(t2Var2, s2Var2, 0L));
        r2Var2.a(new l(t2Var2, s2Var, 0L));
        f.n(t2Var, s2Var3, 0L, r2Var2);
        f16763b = r2Var2;
        f16764c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f16765d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f16765d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
