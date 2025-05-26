package e0;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kh2.m0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f56718c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f56719d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f56720e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayList f56721f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f56722a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteOrder f56723b;

    static {
        k kVar = new k();
        kVar.f56715a = 0;
        f56721f = Collections.list(kVar);
    }

    public n(ByteOrder byteOrder) {
        l lVar = new l();
        lVar.f56716a = 0;
        this.f56722a = Collections.list(lVar);
        this.f56723b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair a13 = a(split[0]);
            if (((Integer) a13.first).intValue() == 2) {
                return a13;
            }
            for (int i13 = 1; i13 < split.length; i13++) {
                Pair a14 = a(split[i13]);
                int intValue = (((Integer) a14.first).equals(a13.first) || ((Integer) a14.second).equals(a13.first)) ? ((Integer) a13.first).intValue() : -1;
                int intValue2 = (((Integer) a13.second).intValue() == -1 || !(((Integer) a14.first).equals(a13.second) || ((Integer) a14.second).equals(a13.second))) ? -1 : ((Integer) a13.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    a13 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    a13 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return a13;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
    
        if (r12 != r9) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r19, java.lang.String r20, java.util.ArrayList r21) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.c(java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    public final void d(int i13) {
        int i14;
        if (i13 == 0) {
            i14 = 1;
        } else if (i13 == 90) {
            i14 = 6;
        } else if (i13 == 180) {
            i14 = 3;
        } else if (i13 != 270) {
            m0.X0("ExifData", "Unexpected orientation value: " + i13 + ". Must be one of 0, 90, 180, 270.");
            i14 = 0;
        } else {
            i14 = 8;
        }
        c("Orientation", String.valueOf(i14), this.f56722a);
    }
}
