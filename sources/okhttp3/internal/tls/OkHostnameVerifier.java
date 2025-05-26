package okhttp3.internal.tls;

import a.a;
import ep.b;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f96256a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static ArrayList a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        List b13 = b(certificate, 7);
        return CollectionsKt.l0(b(certificate, 2), b13);
    }

    public static List b(X509Certificate x509Certificate, int i13) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return q0.f80391a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.d(list.get(0), Integer.valueOf(i13)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return q0.f80391a;
        }
    }

    public static boolean c(String str) {
        int i13;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(a.e("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder s13 = a.s("endIndex > string.length: ", length2, " > ");
            s13.append(str.length());
            throw new IllegalArgumentException(s13.toString().toString());
        }
        long j13 = 0;
        int i14 = 0;
        while (i14 < length2) {
            char charAt = str.charAt(i14);
            if (charAt < 128) {
                j13++;
            } else {
                if (charAt < 2048) {
                    i13 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i13 = 3;
                } else {
                    int i15 = i14 + 1;
                    char charAt2 = i15 < length2 ? str.charAt(i15) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j13++;
                        i14 = i15;
                    } else {
                        j13 += 4;
                        i14 += 2;
                    }
                }
                j13 += i13;
            }
            i14++;
        }
        return length == ((int) j13);
    }

    public static boolean d(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = Util.f95757a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (Util.f95762f.e(host)) {
            return e(host, certificate);
        }
        if (c(host)) {
            Locale locale = Locale.US;
            host = b.l(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> b13 = b(certificate, 2);
        if (!(b13 instanceof Collection) || !b13.isEmpty()) {
            for (String str : b13) {
                f96256a.getClass();
                if (host != null && host.length() != 0 && !z.p(host, ".", false) && !z.h(host, "..", false) && str != null && str.length() != 0 && !z.p(str, ".", false) && !z.h(str, "..", false)) {
                    String concat = !z.h(host, ".", false) ? host.concat(".") : host;
                    if (!z.h(str, ".", false)) {
                        str = str.concat(".");
                    }
                    if (c(str)) {
                        Locale locale2 = Locale.US;
                        str = b.l(locale2, "US", str, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!StringsKt.E(str, "*", false)) {
                        if (Intrinsics.d(concat, str)) {
                            return true;
                        }
                    } else if (z.p(str, "*.", false) && StringsKt.K(str, '*', 1, false, 4) == -1 && concat.length() >= str.length() && !Intrinsics.d("*.", str)) {
                        String substring = str.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        if (z.h(concat, substring, false)) {
                            int length = concat.length() - substring.length();
                            if (length > 0 && StringsKt.M(concat, '.', length - 1, 4) != -1) {
                            }
                            return true;
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static boolean e(String str, X509Certificate x509Certificate) {
        String c13 = HostnamesKt.c(str);
        List b13 = b(x509Certificate, 7);
        if ((b13 instanceof Collection) && b13.isEmpty()) {
            return false;
        }
        Iterator it = b13.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(c13, HostnamesKt.c((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!c(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return d(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
