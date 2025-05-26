package okhttp3;

import ep.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.StringsKt;
import kotlin.text.z;
import ll2.a;
import okhttp3.internal.Util;
import ue.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f95626b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f95627a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f95628a = new ArrayList(20);

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.f95626b.getClass();
            Companion.a(name);
            Companion.b(value, name);
            c(name, value);
        }

        public final void b(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int K = StringsKt.K(line, ':', 1, false, 4);
            if (K != -1) {
                String substring = line.substring(0, K);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(K + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
                return;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return;
            }
            String substring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            c("", substring3);
        }

        public final void c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f95628a;
            arrayList.add(name);
            arrayList.add(StringsKt.i0(value).toString());
        }

        public final void d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Headers.f95626b.getClass();
            Companion.a(name);
            c(name, value);
        }

        public final Headers e() {
            return new Headers((String[]) this.f95628a.toArray(new String[0]));
        }

        public final String f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = this.f95628a;
            int size = arrayList.size() - 2;
            int u13 = c.u(size, 0, -2);
            if (u13 > size) {
                return null;
            }
            while (!z.i(name, (String) arrayList.get(size), true)) {
                if (size == u13) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f95628a;
                if (i13 >= arrayList.size()) {
                    return;
                }
                if (z.i(name, (String) arrayList.get(i13), true)) {
                    arrayList.remove(i13);
                    arrayList.remove(i13);
                    i13 -= 2;
                }
                i13 += 2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                char charAt = str.charAt(i13);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i13), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                char charAt = str.charAt(i13);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Util.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i13), str2));
                    sb3.append(Util.r(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            }
        }

        public static Headers c(Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i13 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String obj = StringsKt.i0(str).toString();
                String obj2 = StringsKt.i0(str2).toString();
                a(obj);
                b(obj2, obj);
                strArr[i13] = obj;
                strArr[i13 + 1] = obj2;
                i13 += 2;
            }
            return new Headers(strArr);
        }

        public static Headers d(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                String str = strArr[i14];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i14] = StringsKt.i0(str).toString();
            }
            int u13 = c.u(0, strArr.length - 1, 2);
            if (u13 >= 0) {
                while (true) {
                    String str2 = strArr[i13];
                    String str3 = strArr[i13 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i13 == u13) {
                        break;
                    }
                    i13 += 2;
                }
            }
            return new Headers(strArr);
        }
    }

    public Headers(String[] strArr) {
        this.f95627a = strArr;
    }

    public final long b() {
        String[] strArr = this.f95627a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        return length;
    }

    public final String c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f95626b.getClass();
        String[] strArr = this.f95627a;
        int length = strArr.length - 2;
        int u13 = c.u(length, 0, -2);
        if (u13 <= length) {
            while (!z.i(name, strArr[length], true)) {
                if (length != u13) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String d(int i13) {
        return this.f95627a[i13 * 2];
    }

    public final Set e() {
        Intrinsics.checkNotNullParameter(o0.f80439a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            treeSet.add(d(i13));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            if (Arrays.equals(this.f95627a, ((Headers) obj).f95627a)) {
                return true;
            }
        }
        return false;
    }

    public final Builder f() {
        Builder builder = new Builder();
        k0.v(builder.f95628a, this.f95627a);
        return builder;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f95627a);
    }

    public final TreeMap i() {
        Intrinsics.checkNotNullParameter(o0.f80439a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            String d2 = d(i13);
            Locale locale = Locale.US;
            String l13 = b.l(locale, "US", d2, locale, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(l13);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(l13, list);
            }
            list.add(j(i13));
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i13 = 0; i13 < size; i13++) {
            pairArr[i13] = new Pair(d(i13), j(i13));
        }
        return com.bumptech.glide.c.D0(pairArr);
    }

    public final String j(int i13) {
        return this.f95627a[(i13 * 2) + 1];
    }

    public final List n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            if (z.i(name, d(i13), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(j(i13));
            }
        }
        if (arrayList == null) {
            return q0.f80391a;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f95627a.length / 2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            String d2 = d(i13);
            String j13 = j(i13);
            sb3.append(d2);
            sb3.append(": ");
            if (Util.r(d2)) {
                j13 = "██";
            }
            sb3.append(j13);
            sb3.append("\n");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
