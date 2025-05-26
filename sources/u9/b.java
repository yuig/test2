package u9;

import d7.d0;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f121118c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f121119d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final d0 f121120a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f121121b = new StringBuilder();

    public static String a(d0 d0Var, StringBuilder sb3) {
        boolean z13 = false;
        sb3.setLength(0);
        int i13 = d0Var.f53807b;
        int i14 = d0Var.f53808c;
        while (i13 < i14 && !z13) {
            char c13 = (char) d0Var.f53806a[i13];
            if ((c13 < 'A' || c13 > 'Z') && ((c13 < 'a' || c13 > 'z') && !((c13 >= '0' && c13 <= '9') || c13 == '#' || c13 == '-' || c13 == '.' || c13 == '_'))) {
                z13 = true;
            } else {
                i13++;
                sb3.append(c13);
            }
        }
        d0Var.L(i13 - d0Var.f53807b);
        return sb3.toString();
    }

    public static String b(d0 d0Var, StringBuilder sb3) {
        c(d0Var);
        if (d0Var.a() == 0) {
            return null;
        }
        String a13 = a(d0Var, sb3);
        if (!"".equals(a13)) {
            return a13;
        }
        return "" + ((char) d0Var.y());
    }

    public static void c(d0 d0Var) {
        while (true) {
            for (boolean z13 = true; d0Var.a() > 0 && z13; z13 = false) {
                int i13 = d0Var.f53807b;
                byte[] bArr = d0Var.f53806a;
                byte b13 = bArr[i13];
                char c13 = (char) b13;
                if (c13 == '\t' || c13 == '\n' || c13 == '\f' || c13 == '\r' || c13 == ' ') {
                    d0Var.L(1);
                } else {
                    int i14 = d0Var.f53808c;
                    int i15 = i13 + 2;
                    if (i15 <= i14) {
                        int i16 = i13 + 1;
                        if (b13 == 47 && bArr[i16] == 42) {
                            while (true) {
                                int i17 = i15 + 1;
                                if (i17 >= i14) {
                                    break;
                                }
                                if (((char) bArr[i15]) == '*' && ((char) bArr[i17]) == '/') {
                                    i15 += 2;
                                    i14 = i15;
                                } else {
                                    i15 = i17;
                                }
                            }
                            d0Var.L(i14 - d0Var.f53807b);
                        }
                    }
                }
            }
            return;
        }
    }
}
