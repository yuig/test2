package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__StringsKt extends z {
    public static final int q(CharSequence charSequence, CharSequence charSequence2, int i13, int i14, boolean z13, boolean z14) {
        kotlin.ranges.a m13;
        if (z14) {
            int I = StringsKt.I(charSequence);
            if (i13 > I) {
                i13 = I;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            m13 = ql2.s.m(i13, i14);
        } else {
            if (i13 < 0) {
                i13 = 0;
            }
            int length = charSequence.length();
            if (i14 > length) {
                i14 = length;
            }
            m13 = new IntRange(i13, i14, 1);
        }
        boolean z15 = charSequence instanceof String;
        int i15 = m13.f80455c;
        int i16 = m13.f80454b;
        int i17 = m13.f80453a;
        if (!z15 || !(charSequence2 instanceof String)) {
            if ((i15 <= 0 || i17 > i16) && (i15 >= 0 || i16 > i17)) {
                return -1;
            }
            while (!t(0, i17, charSequence2.length(), charSequence2, charSequence, z13)) {
                if (i17 == i16) {
                    return -1;
                }
                i17 += i15;
            }
            return i17;
        }
        if ((i15 <= 0 || i17 > i16) && (i15 >= 0 || i16 > i17)) {
            return -1;
        }
        while (!z.k(0, i17, charSequence2.length(), (String) charSequence2, (String) charSequence, z13)) {
            if (i17 == i16) {
                return -1;
            }
            i17 += i15;
        }
        return i17;
    }

    public static final int r(int i13, CharSequence charSequence, boolean z13, char[] chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z13 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.c0.Q(chars), i13);
        }
        if (i13 < 0) {
            i13 = 0;
        }
        ql2.k it = new IntRange(i13, StringsKt.I(charSequence), 1).iterator();
        while (it.f104109c) {
            int b13 = it.b();
            char charAt = charSequence.charAt(b13);
            for (char c13 : chars) {
                if (a.b(c13, charAt, z13)) {
                    return b13;
                }
            }
        }
        return -1;
    }

    public static c s(CharSequence charSequence, String[] strArr, boolean z13, int i13) {
        u(i13);
        return new c(charSequence, 0, i13, new b0(kotlin.collections.z.d(strArr), z13));
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return v(i13, charSequence, str, z13);
            }
        }
        kotlin.collections.a0 g13 = yn2.c0.g(s(charSequence, delimiters, z13, i13));
        ArrayList arrayList = new ArrayList(g0.q(g13, 10));
        Iterator it = g13.iterator();
        while (it.hasNext()) {
            arrayList.add(x(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final boolean t(int i13, int i14, int i15, CharSequence charSequence, CharSequence other, boolean z13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i14 < 0 || i13 < 0 || i13 > charSequence.length() - i15 || i14 > other.length() - i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!a.b(charSequence.charAt(i13 + i16), other.charAt(i14 + i16), z13)) {
                return false;
            }
        }
        return true;
    }

    public static final void u(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("Limit must be non-negative, but was ", i13).toString());
        }
    }

    public static final List v(int i13, CharSequence charSequence, String str, boolean z13) {
        u(i13);
        int i14 = 0;
        int J2 = StringsKt.J(0, charSequence, str, z13);
        if (J2 == -1 || i13 == 1) {
            return kotlin.collections.e0.b(charSequence.toString());
        }
        boolean z14 = i13 > 0;
        int i15 = 10;
        if (z14 && i13 <= 10) {
            i15 = i13;
        }
        ArrayList arrayList = new ArrayList(i15);
        do {
            arrayList.add(charSequence.subSequence(i14, J2).toString());
            i14 = str.length() + J2;
            if (z14 && arrayList.size() == i13 - 1) {
                break;
            }
            J2 = StringsKt.J(i14, charSequence, str, z13);
        } while (J2 != -1);
        arrayList.add(charSequence.subSequence(i14, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean w(CharSequence charSequence, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return ((charSequence instanceof String) && (prefix instanceof String)) ? z.p((String) charSequence, (String) prefix, false) : t(0, 0, prefix.length(), charSequence, prefix, false);
    }

    public static final String x(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.f80453a, range.f80454b + 1).toString();
    }
}
