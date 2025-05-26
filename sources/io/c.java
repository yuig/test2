package io;

import ho.j;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import jo.n;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f72908c = Pattern.compile("^[A-Z][^A-Z]+$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f72909d = Pattern.compile("^[^A-Z]+[A-Z]$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f72910e = Pattern.compile("^[^a-z]+$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f72911f = Pattern.compile("^[^A-Z]+$");

    @Override // io.e
    public final double a(n nVar) {
        int i13;
        int i14;
        int i15;
        int i16 = nVar.f77178f;
        nVar.f77193u = Double.valueOf(i16);
        CharSequence charSequence = nVar.f77176d;
        j a13 = j.a(charSequence);
        int i17 = 0;
        if (f72911f.matcher(charSequence).find(0) || a13.equals(charSequence)) {
            i13 = 1;
        } else if (f72908c.matcher(charSequence).find() || f72909d.matcher(charSequence).find() || f72910e.matcher(charSequence).find()) {
            i13 = 2;
        } else {
            int i18 = 0;
            int i19 = 0;
            for (int i23 = 0; i23 < charSequence.length(); i23++) {
                i18 += Character.isLowerCase(charSequence.charAt(i23)) ? 1 : 0;
                i19 += Character.isUpperCase(charSequence.charAt(i23)) ? 1 : 0;
            }
            i13 = 0;
            for (int i24 = 1; i24 <= Math.min(i19, i18); i24++) {
                i13 += a.b(i19 + i18, i24);
            }
            a13.f();
        }
        if (nVar.f77181i) {
            j a14 = j.a(charSequence);
            i14 = 1;
            for (Map.Entry entry : nVar.f77182j.entrySet()) {
                Character ch3 = (Character) entry.getKey();
                Character ch4 = (Character) entry.getValue();
                char charValue = ch3.charValue();
                char charValue2 = ch4.charValue();
                char[] cArr = a14.f69677a;
                char[] copyOf = Arrays.copyOf(cArr, cArr.length);
                int length = copyOf.length;
                int i25 = i17;
                int i26 = i25;
                int i27 = i26;
                while (i25 < length) {
                    char c13 = copyOf[i25];
                    if (c13 == charValue) {
                        i26++;
                    }
                    if (c13 == charValue2) {
                        i27++;
                    }
                    i25++;
                }
                AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(i26), Integer.valueOf(i27));
                int intValue = ((Integer) simpleImmutableEntry.getKey()).intValue();
                int intValue2 = ((Integer) simpleImmutableEntry.getValue()).intValue();
                if (intValue == 0 || intValue2 == 0) {
                    i15 = 2;
                } else {
                    int min = Math.min(intValue2, intValue);
                    i15 = 0;
                    for (int i28 = 1; i28 <= min; i28++) {
                        i15 += a.b(intValue2 + intValue, i28);
                    }
                }
                i14 *= i15;
                i17 = 0;
            }
        } else {
            i14 = 1;
        }
        return i16 * i13 * i14 * (nVar.f77180h ? 2 : 1);
    }
}
