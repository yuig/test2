package com.google.android.recaptcha.internal;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgp implements zzgx {

    @NotNull
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        String Z;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            int[] iArr = (int[]) zza2;
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(",", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            StringBuilder buffer = new StringBuilder();
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(",", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            buffer.append((CharSequence) "[");
            int length = iArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int i16 = iArr[i14];
                int i17 = i15 + 1;
                if (i17 > 1) {
                    buffer.append((CharSequence) ",");
                }
                buffer.append((CharSequence) String.valueOf(i16));
                i14++;
                i15 = i17;
            }
            buffer.append((CharSequence) "]");
            Z = buffer.toString();
            Intrinsics.checkNotNullExpressionValue(Z, "toString(...)");
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, Charsets.UTF_8);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                StringBuilder buffer2 = new StringBuilder();
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(buffer2, "buffer");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                buffer2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length2) {
                    long j13 = jArr[i18];
                    int i23 = i19 + 1;
                    if (i23 > 1) {
                        buffer2.append((CharSequence) ",");
                    }
                    buffer2.append((CharSequence) String.valueOf(j13));
                    i18++;
                    i19 = i23;
                }
                buffer2.append((CharSequence) "]");
                Z = buffer2.toString();
                Intrinsics.checkNotNullExpressionValue(Z, "toString(...)");
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                StringBuilder buffer3 = new StringBuilder();
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                Intrinsics.checkNotNullParameter(buffer3, "buffer");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                buffer3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i24 = 0;
                int i25 = 0;
                while (i24 < length3) {
                    short s13 = sArr[i24];
                    int i26 = i25 + 1;
                    if (i26 > 1) {
                        buffer3.append((CharSequence) ",");
                    }
                    buffer3.append((CharSequence) String.valueOf((int) s13));
                    i24++;
                    i25 = i26;
                }
                buffer3.append((CharSequence) "]");
                Z = buffer3.toString();
                Intrinsics.checkNotNullExpressionValue(Z, "toString(...)");
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                StringBuilder buffer4 = new StringBuilder();
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(buffer4, "buffer");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                buffer4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i27 = 0;
                int i28 = 0;
                while (i27 < length4) {
                    float f13 = fArr[i27];
                    int i29 = i28 + 1;
                    if (i29 > 1) {
                        buffer4.append((CharSequence) ",");
                    }
                    buffer4.append((CharSequence) String.valueOf(f13));
                    i27++;
                    i28 = i29;
                }
                buffer4.append((CharSequence) "]");
                Z = buffer4.toString();
                Intrinsics.checkNotNullExpressionValue(Z, "toString(...)");
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                Intrinsics.checkNotNullParameter(dArr, "<this>");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                StringBuilder buffer5 = new StringBuilder();
                Intrinsics.checkNotNullParameter(dArr, "<this>");
                Intrinsics.checkNotNullParameter(buffer5, "buffer");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                buffer5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i33 = 0;
                int i34 = 0;
                while (i33 < length5) {
                    double d2 = dArr[i33];
                    int i35 = i34 + 1;
                    if (i35 > 1) {
                        buffer5.append((CharSequence) ",");
                    }
                    buffer5.append((CharSequence) String.valueOf(d2));
                    i33++;
                    i34 = i35;
                }
                buffer5.append((CharSequence) "]");
                Z = buffer5.toString();
                Intrinsics.checkNotNullExpressionValue(Z, "toString(...)");
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                Z = c0.M((Object[]) zza2, ",", "[", "]", 0, null, null, 56);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                Z = CollectionsKt.Z((Iterable) zza2, ",", "[", "]", 0, null, null, 56);
            }
            Z = str;
        }
        zzgdVar.zzc().zze(i13, Z);
    }
}
