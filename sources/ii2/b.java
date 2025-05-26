package ii2;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f72331a = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|(([a-fA-F0-9]{1,4}|):){1,7}([a-fA-F0-9]{1,4}|:)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f72332b = Pattern.compile("([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,63}[a-zA-Z0-9])?)(\\.[a-zA-Z]{1,63})(\\.[a-zA-Z]{1,2})?$|^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|(([a-fA-F0-9]{1,4}|):){1,7}([a-fA-F0-9]{1,4}|:)");

    public static final String a(String url) {
        String substring;
        Intrinsics.checkNotNullParameter(url, "url");
        int M = StringsKt.M(url, '/', 0, 6);
        if (M < 0) {
            substring = url;
        } else {
            substring = url.substring(M);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        int K = StringsKt.K(substring, '?', 0, false, 6);
        int K2 = StringsKt.K(substring, '#', 0, false, 6);
        if (K < 0) {
            K = Integer.MAX_VALUE;
        }
        if (K2 < 0) {
            K2 = Integer.MAX_VALUE;
        }
        if (K > K2) {
            K = K2;
        }
        if (M < 0) {
            M = 0;
        }
        int length = substring.length();
        if (length <= K) {
            K = length;
        }
        String substring2 = url.substring(0, M + K);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }
}
