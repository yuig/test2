package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: classes2.dex */
public abstract class n0 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
