package v50;

import java.util.Locale;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f124164a = h1.f("employee", "employees");

    public static final boolean a(String str) {
        if (str != null) {
            return z.p(str, "enabled", false);
        }
        return false;
    }

    public static final boolean b(String str) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return f124164a.contains(lowerCase);
    }
}
