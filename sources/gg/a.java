package gg;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[][] f64888a = new char[97][];

    static {
        char[] charArray = "&amp;".toCharArray();
        char[] charArray2 = "&lt;".toCharArray();
        char[] charArray3 = "&gt;".toCharArray();
        char[] charArray4 = "&quot;".toCharArray();
        char[] charArray5 = "&#39;".toCharArray();
        char[] charArray6 = "&#96;".toCharArray();
        char[] charArray7 = "&#61;".toCharArray();
        int i13 = 0;
        while (true) {
            char[][] cArr = f64888a;
            if (i13 >= cArr.length) {
                return;
            }
            if (i13 <= 13) {
                cArr[i13] = ("&#" + i13 + ";").toCharArray();
            } else if (i13 == 34) {
                cArr[i13] = charArray4;
            } else if (i13 == 96) {
                cArr[i13] = charArray6;
            } else if (i13 == 38) {
                cArr[i13] = charArray;
            } else if (i13 != 39) {
                switch (i13) {
                    case 60:
                        cArr[i13] = charArray2;
                        break;
                    case 61:
                        cArr[i13] = charArray7;
                        break;
                    case 62:
                        cArr[i13] = charArray3;
                        break;
                    default:
                        cArr[i13] = null;
                        break;
                }
            } else {
                cArr[i13] = charArray5;
            }
            i13++;
        }
    }
}
