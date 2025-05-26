package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
