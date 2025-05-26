package tr1;

import android.util.Patterns;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lb0.n;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f119038a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f119039b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f119040c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f119041d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f119042e;

    static {
        Map g13 = z0.g(new Pair("AT", 14), new Pair("BE", 13), new Pair("BG", 14), new Pair("HR", 16), new Pair("CY", 14), new Pair("CZ", 15), new Pair("DK", 13), new Pair("EE", 13), new Pair("FI", 13), new Pair("FR", 15), new Pair("DE", 16), new Pair("GR", 15), new Pair("HU", 16), new Pair("IE", 16), new Pair("IT", 14), new Pair("LV", 13), new Pair("LT", 14), new Pair("LU", 16), new Pair("MT", 13), new Pair("NL", 16), new Pair("PL", 16), new Pair("PT", 13), new Pair("RO", 16), new Pair("SK", 16), new Pair("SI", 15), new Pair("ES", 14), new Pair("SE", 13), new Pair("GB", 13));
        f119038a = g13;
        Map b13 = y0.b(new Pair("KR", 14));
        f119039b = b13;
        f119040c = z0.j(g13, b13);
        f119041d = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\']{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        f119042e = Pattern.compile("^[^0-9].*$");
    }

    public static String a(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new Regex("[._+]").replace(new Regex("[0-9]").replace(((String[]) new Regex("@").f(0, email).toArray(new String[0]))[0], ""), " ");
    }

    public static boolean b(int i13) {
        return i13 < 16;
    }

    public static final boolean c(String str) {
        return (str == null || str.length() == 0 || !f119041d.matcher(str).matches()) ? false : true;
    }

    public static boolean d(String str) {
        return (str == null || str.length() == 0 || !f119042e.matcher(str).matches()) ? false : true;
    }

    public static boolean e(String str) {
        return str.length() != 0 && Patterns.PHONE.matcher(str).matches();
    }

    public static boolean f(int i13, String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        Integer num = (Integer) f119040c.get(country);
        if (num != null) {
            return num.intValue() > i13;
        }
        return !(i13 >= 13);
    }

    public static boolean g(String str) {
        return str.length() != 0 && Patterns.WEB_URL.matcher(str).matches();
    }

    public static final void h() {
        ((lb0.b) n.b()).m("PREF_REGISTER_RESTRICT_DATE", Calendar.getInstance().getTimeInMillis());
    }
}
