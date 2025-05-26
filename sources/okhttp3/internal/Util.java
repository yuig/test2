package okhttp3.internal;

import com.bumptech.glide.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import ln2.k;
import m60.f0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;
import q5.x0;
import t3.s1;
import wo2.e0;
import wo2.j;
import wo2.l;
import wo2.m;
import wo2.v;
import xk2.f;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f95757a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f95758b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f95759c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f95760d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f95761e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f95762f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f95763g;

    static {
        byte[] bArr = new byte[0];
        f95757a = bArr;
        Headers.f95626b.getClass();
        f95758b = Headers.Companion.d(new String[0]);
        ResponseBody.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        j jVar = new j();
        jVar.U(bArr);
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        f95759c = new ResponseBody$Companion$asResponseBody$1(null, 0, jVar);
        RequestBody.Companion.e(RequestBody.f95711a, bArr, null, 7);
        int i13 = v.f130737d;
        m mVar = m.f130712d;
        f95760d = k.j(f0.f0("efbbbf"), f0.f0("feff"), f0.f0("fffe"), f0.f0("0000ffff"), f0.f0("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.f(timeZone);
        f95761e = timeZone;
        f95762f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f95763g = StringsKt.S("Client", StringsKt.R("okhttp3.", name));
    }

    public static final List A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.H0(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map B(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return z0.d();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final int C(int i13, String str) {
        if (str == null) {
            return i13;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i13;
        }
    }

    public static final String D(int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int n13 = n(i13, i14, str);
        String substring = str.substring(n13, o(n13, i14, str));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void E(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            f.a(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.d(httpUrl.f95634d, other.f95634d) && httpUrl.f95635e == other.f95635e && Intrinsics.d(httpUrl.f95631a, other.f95631a);
    }

    public static final int b(long j13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        if (j13 < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j13);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0 || j13 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e13) {
            throw e13;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (!Intrinsics.d(e14.getMessage(), "bio == null")) {
                throw e14;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c13, int i13, int i14) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i13 < i14) {
            if (str.charAt(i13) == c13) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static final int f(String str, int i13, int i14, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i13 < i14) {
            if (StringsKt.F(delimiters, str.charAt(i13))) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static /* synthetic */ int g(String str, char c13, int i13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = str.length();
        }
        return e(str, c13, i13, i14);
    }

    public static final boolean h(e0 e0Var, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return w(e0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        return s1.e(copyOf, copyOf.length, locale, format, "format(locale, format, *args)");
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                x0 D0 = c.D0(strArr2);
                while (D0.hasNext()) {
                    if (comparator.compare(str, (String) D0.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String c13 = response.f95725f.c("Content-Length");
        if (c13 == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(c13, "<this>");
        try {
            return Long.parseLong(c13);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(kotlin.collections.f0.j(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = str.charAt(i13);
            if (Intrinsics.i(charAt, 31) <= 0 || Intrinsics.i(charAt, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) >= 0) {
                return i13;
            }
        }
        return -1;
    }

    public static final int n(int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i13 < i14) {
            char charAt = str.charAt(i13);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static final int o(int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i15 = i14 - 1;
        if (i13 <= i15) {
            while (true) {
                char charAt = str.charAt(i15);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i15 + 1;
                }
                if (i15 == i13) {
                    break;
                }
                i15--;
            }
        }
        return i13;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i13]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i13++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(Socket socket, l source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z13 = !source.o1();
                socket.setSoTimeout(soTimeout);
                return z13;
            } catch (Throwable th3) {
                socket.setSoTimeout(soTimeout);
                throw th3;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return z.i(name, "Authorization", true) || z.i(name, "Cookie", true) || z.i(name, "Proxy-Authorization", true) || z.i(name, "Set-Cookie", true);
    }

    public static final int s(char c13) {
        if ('0' <= c13 && c13 < ':') {
            return c13 - '0';
        }
        if ('a' <= c13 && c13 < 'g') {
            return c13 - 'W';
        }
        if ('A' > c13 || c13 >= 'G') {
            return -1;
        }
        return c13 - '7';
    }

    public static final Charset t(l lVar, Charset charset) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int j03 = lVar.j0(f95760d);
        if (j03 == -1) {
            return charset;
        }
        if (j03 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (j03 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (j03 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (j03 == 3) {
            Charsets.f80461a.getClass();
            return Charsets.a();
        }
        if (j03 != 4) {
            throw new AssertionError();
        }
        Charsets.f80461a.getClass();
        return Charsets.b();
    }

    public static final int u(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return (lVar.readByte() & 255) | ((lVar.readByte() & 255) << 16) | ((lVar.readByte() & 255) << 8);
    }

    public static final int v(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i13 = 0;
        while (!jVar.o1() && jVar.k(0L) == 61) {
            i13++;
            jVar.readByte();
        }
        return i13;
    }

    public static final boolean w(e0 e0Var, int i13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c13 = e0Var.timeout().e() ? e0Var.timeout().c() - nanoTime : Long.MAX_VALUE;
        e0Var.timeout().d(Math.min(c13, timeUnit.toNanos(i13)) + nanoTime);
        try {
            j jVar = new j();
            while (e0Var.read(jVar, 8192L) != -1) {
                jVar.a();
            }
            if (c13 == Long.MAX_VALUE) {
                e0Var.timeout().a();
            } else {
                e0Var.timeout().d(nanoTime + c13);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c13 == Long.MAX_VALUE) {
                e0Var.timeout().a();
            } else {
                e0Var.timeout().d(nanoTime + c13);
            }
            return false;
        } catch (Throwable th3) {
            if (c13 == Long.MAX_VALUE) {
                e0Var.timeout().a();
            } else {
                e0Var.timeout().d(nanoTime + c13);
            }
            throw th3;
        }
    }

    public static final Headers x(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.f96019a.j(), header.f96020b.j());
        }
        return builder.e();
    }

    public static final String y(long j13) {
        String hexString = Long.toHexString(j13);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String z(HttpUrl httpUrl, boolean z13) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        boolean E = StringsKt.E(httpUrl.f95634d, ":", false);
        String str = httpUrl.f95634d;
        if (E) {
            str = s1.b("[", str, ']');
        }
        int i13 = httpUrl.f95635e;
        if (!z13) {
            HttpUrl.f95629k.getClass();
            if (i13 == HttpUrl.Companion.c(httpUrl.f95631a)) {
                return str;
            }
        }
        return str + ':' + i13;
    }
}
