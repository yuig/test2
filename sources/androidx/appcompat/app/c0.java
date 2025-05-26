package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static j5.h b(Configuration configuration) {
        return j5.h.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j5.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((j5.j) hVar.f74680a).f74681a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j5.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((j5.j) hVar.f74680a).f74681a.toLanguageTags()));
    }
}
