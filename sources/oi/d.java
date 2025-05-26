package oi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public String f94715a;

    /* renamed from: b, reason: collision with root package name */
    public int f94716b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f94717c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f94718d;

    /* renamed from: e, reason: collision with root package name */
    public Long f94719e;

    /* renamed from: f, reason: collision with root package name */
    public Long f94720f;

    public static Boolean a(long j13, com.google.android.gms.internal.measurement.a2 a2Var) {
        try {
            return d(new BigDecimal(j13), a2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean b(Boolean bool, boolean z13) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z13);
    }

    public static Boolean c(String str, com.google.android.gms.internal.measurement.e2 e2Var, y3 y3Var) {
        List w13;
        com.bumptech.glide.d.t(e2Var);
        if (str == null || !e2Var.A() || e2Var.s() == com.google.android.gms.internal.measurement.d2.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        com.google.android.gms.internal.measurement.d2 s13 = e2Var.s();
        com.google.android.gms.internal.measurement.d2 d2Var = com.google.android.gms.internal.measurement.d2.IN_LIST;
        if (s13 == d2Var) {
            if (e2Var.r() == 0) {
                return null;
            }
        } else if (!e2Var.z()) {
            return null;
        }
        com.google.android.gms.internal.measurement.d2 s14 = e2Var.s();
        boolean x13 = e2Var.x();
        String v13 = (x13 || s14 == com.google.android.gms.internal.measurement.d2.REGEXP || s14 == d2Var) ? e2Var.v() : e2Var.v().toUpperCase(Locale.ENGLISH);
        if (e2Var.r() == 0) {
            w13 = null;
        } else {
            w13 = e2Var.w();
            if (!x13) {
                ArrayList arrayList = new ArrayList(w13.size());
                Iterator it = w13.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                w13 = Collections.unmodifiableList(arrayList);
            }
        }
        com.google.android.gms.internal.measurement.d2 d2Var2 = com.google.android.gms.internal.measurement.d2.REGEXP;
        String str2 = s14 == d2Var2 ? v13 : null;
        if (s14 == com.google.android.gms.internal.measurement.d2.IN_LIST) {
            if (w13 == null || w13.isEmpty()) {
                return null;
            }
        } else if (v13 == null) {
            return null;
        }
        if (!x13 && s14 != d2Var2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (k7.f94924a[s14.ordinal()]) {
            case 1:
                if (str2 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        y3Var.f95271i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                        return null;
                    }
                }
                break;
            case 6:
                if (w13 != null) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean d(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.a2 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.d.d(java.math.BigDecimal, com.google.android.gms.internal.measurement.a2, double):java.lang.Boolean");
    }
}
