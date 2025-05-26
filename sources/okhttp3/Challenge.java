package okhttp3;

import a.cb;
import ep.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f95548a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f95549b;

    public Challenge(String scheme, Map authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f95548a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                str = b.l(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, str3);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f95549b = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f95549b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f95549b.get("realm");
    }

    /* renamed from: c, reason: from getter */
    public final String getF95548a() {
        return this.f95548a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Intrinsics.d(challenge.f95548a, this.f95548a) && Intrinsics.d(challenge.f95549b, this.f95549b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f95549b.hashCode() + cb.d(this.f95548a, 899, 31);
    }

    public final String toString() {
        return this.f95548a + " authParams=" + this.f95549b;
    }
}
