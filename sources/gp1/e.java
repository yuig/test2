package gp1;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import df.j1;
import java.util.List;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import m60.x0;
import okhttp3.internal.Util;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f65931a = Util.l("yahoo", "hotmail", "icloud", "outlook");

    public static final String a(String email) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(email, "email");
        if (email.length() == 0 || StringsKt.K(email, '@', 0, false, 6) == -1) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(email, new String[]{"@"}, false, 0, 6, null);
        String[] strArr = (String[]) split$default.toArray(new String[0]);
        String str = strArr[1];
        if (str.length() == 0 || StringsKt.K(str, '.', 0, false, 6) == -1) {
            return null;
        }
        split$default2 = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        String[] strArr2 = (String[]) split$default2.toArray(new String[0]);
        if (strArr2 != null && strArr2.length != 0 && strArr2[0].length() != 0) {
            if (strArr2.length < 2 || !Intrinsics.d(strArr2[0], "gmail") || Intrinsics.d(strArr2[1], "com")) {
                int o03 = j1.o0(c0.M(strArr2, ".", null, null, 0, null, null, 62), "gmail.com");
                if (strArr2[0].charAt(0) != 'g' || o03 < 1) {
                    for (String str2 : f65931a) {
                        if (strArr2.length != 0) {
                            String str3 = strArr2[0];
                            if (!Intrinsics.d(str3, str2) || strArr2.length <= 3) {
                                if (strArr2.length >= 2) {
                                    int o04 = j1.o0(str3, str2);
                                    if (str3.charAt(0) == str2.charAt(0) && o04 >= 1) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                            strArr2[0] = str2;
                            return a.a.D(strArr[0], "@", StringsKt.S(".", c0.M(strArr2, ".", null, null, 3, "", null, 38)));
                        }
                    }
                }
            }
            return a.a.C(strArr[0], "@gmail.com");
        }
        return null;
    }

    public static final SpannableStringBuilder b(Resources resources, String emailSuggestion) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(emailSuggestion, "emailSuggestion");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(x0.email_auto_correct_suggestion, emailSuggestion));
        spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - (emailSuggestion.length() + 2), spannableStringBuilder.length() - 1, 33);
        return spannableStringBuilder;
    }
}
