package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class g implements n {

    /* renamed from: a */
    public final Double f31399a;

    public g(Double d2) {
        if (d2 == null) {
            this.f31399a = Double.valueOf(Double.NaN);
        } else {
            this.f31399a = d2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p(zzf());
        }
        throw new IllegalArgumentException(a.a.l(zzf(), ".", str, " is not a function."));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f31399a.equals(((g) obj).f31399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31399a.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return new g(this.f31399a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        Double d2 = this.f31399a;
        return Boolean.valueOf((Double.isNaN(d2.doubleValue()) || d2.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        return this.f31399a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        Double d2 = this.f31399a;
        if (Double.isNaN(d2.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d2.doubleValue())) {
            return d2.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d2.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }
}
