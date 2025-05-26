package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p implements n, Iterable {

    /* renamed from: a */
    public final String f31578a;

    public p(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f31578a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02da  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n d(java.lang.String r21, m.h r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p.d(java.lang.String, m.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f31578a.equals(((p) obj).f31578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31578a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("\""), this.f31578a, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return new p(this.f31578a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f31578a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        String str = this.f31578a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return this.f31578a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return new r(this, 1);
    }
}
