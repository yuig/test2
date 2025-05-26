package org.chromium.base;

import a.a;
import android.os.LocaleList;
import android.text.TextUtils;
import dp2.c;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class LocaleUtils {
    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "jw":
                return "jv";
            case "tl":
                return "fil";
            case "gom":
                return "kok";
            default:
                return str;
        }
    }

    public static String b(Locale locale) {
        String a13 = a(locale.getLanguage());
        String country = locale.getCountry();
        return (a13.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? a13 : a.D(a13, "-", country);
    }

    @CalledByNative
    public static String getDefaultCountryCode() {
        c.a();
        throw null;
    }

    @CalledByNative
    public static String getDefaultLocaleListString() {
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < localeList.size(); i13++) {
            Locale locale = localeList.get(i13);
            String language = locale.getLanguage();
            String a13 = a(language);
            if (!a13.equals(language)) {
                locale = new Locale.Builder().setLocale(locale).setLanguage(a13).build();
            }
            arrayList.add(b(locale));
        }
        return TextUtils.join(",", arrayList);
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        return b(Locale.getDefault());
    }
}
