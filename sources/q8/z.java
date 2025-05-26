package q8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f103010c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f103011a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f103012b = -1;

    public final boolean a(String str) {
        Matcher matcher = f103010c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i13 = d7.n0.f53866a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f103011a = parseInt;
            this.f103012b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(a7.n0 n0Var) {
        int i13 = 0;
        while (true) {
            a7.m0[] m0VarArr = n0Var.f1152a;
            if (i13 >= m0VarArr.length) {
                return;
            }
            a7.m0 m0Var = m0VarArr[i13];
            if (m0Var instanceof d9.e) {
                d9.e eVar = (d9.e) m0Var;
                if ("iTunSMPB".equals(eVar.f54014c) && a(eVar.f54015d)) {
                    return;
                }
            } else if (m0Var instanceof d9.l) {
                d9.l lVar = (d9.l) m0Var;
                if ("com.apple.iTunes".equals(lVar.f54027b) && "iTunSMPB".equals(lVar.f54028c) && a(lVar.f54029d)) {
                    return;
                }
            } else {
                continue;
            }
            i13++;
        }
    }
}
