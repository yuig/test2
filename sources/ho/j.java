package ho;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public char[] f69677a;

    /* renamed from: b, reason: collision with root package name */
    public int f69678b = 0;

    public j(CharSequence charSequence) {
        int i13 = 0;
        this.f69677a = new char[charSequence.length()];
        while (true) {
            char[] cArr = this.f69677a;
            if (i13 >= cArr.length) {
                return;
            }
            cArr[i13] = charSequence.charAt(i13);
            i13++;
        }
    }

    public static j a(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("source is null");
        }
        char[] cArr = new char[charSequence.length()];
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            cArr[i13] = Character.toLowerCase(charSequence.charAt(i13));
        }
        return new j(cArr);
    }

    public static NumberFormatException b(CharSequence charSequence) {
        return new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
    }

    public static int c(CharSequence charSequence) {
        boolean z13;
        if (charSequence == null) {
            throw new NumberFormatException("null");
        }
        int i13 = 1;
        int i14 = 0;
        if (Character.isWhitespace(charSequence.charAt(charSequence.length() - 1))) {
            int length = charSequence.length();
            while (length > 0 && Character.isWhitespace(charSequence.charAt(length - 1))) {
                length--;
            }
            charSequence = new j(charSequence.subSequence(0, length));
        }
        int length2 = charSequence.length();
        if (length2 <= 0) {
            throw b(charSequence);
        }
        char charAt = charSequence.charAt(0);
        int i15 = -2147483647;
        if (charAt < '0') {
            if (charAt == '-') {
                i15 = Integer.MIN_VALUE;
                z13 = true;
            } else {
                if (charAt != '+') {
                    throw b(charSequence);
                }
                z13 = false;
            }
            if (length2 == 1) {
                throw b(charSequence);
            }
        } else {
            i13 = 0;
            z13 = false;
        }
        int i16 = i15 / 10;
        while (i13 < length2) {
            int i17 = i13 + 1;
            int digit = Character.digit(charSequence.charAt(i13), 10);
            if (digit < 0) {
                throw b(charSequence);
            }
            if (i14 < i16) {
                throw b(charSequence);
            }
            int i18 = i14 * 10;
            if (i18 < i15 + digit) {
                throw b(charSequence);
            }
            i14 = i18 - digit;
            i13 = i17;
        }
        return z13 ? i14 : -i14;
    }

    public static j d(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("source is null");
        }
        char[] cArr = new char[charSequence.length()];
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            cArr[i13] = charSequence.charAt((r0 - i13) - 1);
        }
        return new j(cArr);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f69677a[i13];
    }

    @Override // java.lang.CharSequence
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final j subSequence(int i13, int i14) {
        return new j(Arrays.copyOfRange(this.f69677a, i13, i14));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() != length()) {
            return false;
        }
        for (int i13 = 0; i13 < length(); i13++) {
            if (this.f69677a[i13] != charSequence.charAt(i13)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        Arrays.fill(this.f69677a, ' ');
        this.f69678b = 0;
        this.f69677a = new char[0];
    }

    public final int hashCode() {
        int i13 = this.f69678b;
        if (i13 == 0) {
            char[] cArr = this.f69677a;
            if (cArr.length > 0) {
                for (int i14 = 0; i14 < this.f69677a.length; i14++) {
                    i13 = (i13 * 31) + cArr[i14];
                }
                this.f69678b = i13;
            }
        }
        return i13;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        char[] cArr = this.f69677a;
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f69677a);
    }

    public j(char[] cArr) {
        this.f69677a = Arrays.copyOf(cArr, cArr.length);
    }
}
