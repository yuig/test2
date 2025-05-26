package j5;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f74671a = 0;

    static {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            a.a(30);
        }
        if (i13 >= 30) {
            a.a(31);
        }
        if (i13 >= 30) {
            a.a(33);
        }
        if (i13 >= 30) {
            a.a(1000000);
        }
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.d("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 35) {
            if (i13 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (a("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
