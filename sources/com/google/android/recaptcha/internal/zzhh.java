package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ql2.k;
import ql2.s;

/* loaded from: classes3.dex */
public final class zzhh implements zzgx {

    @NotNull
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z13 = obj instanceof Byte;
        if (z13 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z14 = obj instanceof Short;
        if (z14 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z15 = obj instanceof Integer;
        if (z15 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z16 = obj instanceof Long;
        if (z16 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z17 = obj instanceof Float;
        if (z17 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z18 = obj instanceof Double;
        if (z18 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i13 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i13 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i13] % ((Number) obj2).intValue())));
                    i13++;
                }
                return new String(CollectionsKt.B0(arrayList), Charsets.UTF_8);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i13 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i13] % ((Number) obj2).intValue()));
                    i13++;
                }
                return CollectionsKt.E0(arrayList2);
            }
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b13 : bArr) {
                arrayList3.add(Integer.valueOf(b13 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z14 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s13 : sArr) {
                arrayList4.add(Integer.valueOf(s13 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z15 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i14 : iArr) {
                arrayList5.add(Integer.valueOf(i14 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j13 : jArr) {
                arrayList6.add(Long.valueOf(j13 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z17 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f13 : fArr) {
                arrayList7.add(Float.valueOf(f13 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z18 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d2 : dArr) {
                arrayList8.add(Double.valueOf(d2 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z19 = obj instanceof byte[];
        if (z19 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b14 : bArr2) {
                arrayList9.add(Integer.valueOf(b14 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z23 = obj instanceof short[];
        if (z23 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s14 : sArr2) {
                arrayList10.add(Integer.valueOf(s14 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z24 = obj instanceof int[];
        if (z24 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i13 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i13] % ((Number) obj2).intValue()));
                i13++;
            }
            return CollectionsKt.E0(arrayList11);
        }
        boolean z25 = obj instanceof long[];
        if (z25 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j14 : jArr2) {
                arrayList12.add(Long.valueOf(j14 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z26 = obj instanceof float[];
        if (z26 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f14 : fArr2) {
                arrayList13.add(Float.valueOf(f14 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z27 = obj instanceof double[];
        if (z27 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d13 : dArr2) {
                arrayList14.add(Double.valueOf(d13 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z19 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            IntRange q13 = s.q(0, length4);
            ArrayList arrayList15 = new ArrayList(g0.q(q13, 10));
            k it = q13.iterator();
            while (it.f104109c) {
                int b15 = it.b();
                arrayList15.add(Integer.valueOf(bArr3[b15] % bArr4[b15]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z23 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            IntRange q14 = s.q(0, length5);
            ArrayList arrayList16 = new ArrayList(g0.q(q14, 10));
            k it2 = q14.iterator();
            while (it2.f104109c) {
                int b16 = it2.b();
                arrayList16.add(Integer.valueOf(sArr3[b16] % sArr4[b16]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z24 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            IntRange q15 = s.q(0, length6);
            ArrayList arrayList17 = new ArrayList(g0.q(q15, 10));
            k it3 = q15.iterator();
            while (it3.f104109c) {
                int b17 = it3.b();
                arrayList17.add(Integer.valueOf(iArr3[b17] % iArr4[b17]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z25 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            IntRange q16 = s.q(0, length7);
            ArrayList arrayList18 = new ArrayList(g0.q(q16, 10));
            k it4 = q16.iterator();
            while (it4.f104109c) {
                int b18 = it4.b();
                arrayList18.add(Long.valueOf(jArr3[b18] % jArr4[b18]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z26 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            IntRange q17 = s.q(0, length8);
            ArrayList arrayList19 = new ArrayList(g0.q(q17, 10));
            k it5 = q17.iterator();
            while (it5.f104109c) {
                int b19 = it5.b();
                arrayList19.add(Float.valueOf(fArr3[b19] % fArr4[b19]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z27 || !(obj2 instanceof double[])) {
            throw new zzce(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        IntRange q18 = s.q(0, length9);
        ArrayList arrayList20 = new ArrayList(g0.q(q18, 10));
        k it6 = q18.iterator();
        while (it6.f104109c) {
            int b23 = it6.b();
            arrayList20.add(Double.valueOf(dArr3[b23] % dArr4[b23]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i13, zzb(zza2, zza3));
        } catch (ArithmeticException e13) {
            throw new zzce(4, 6, e13);
        }
    }
}
