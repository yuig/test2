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
public final class zzht implements zzgx {

    @NotNull
    public static final zzht zza = new zzht();

    private zzht() {
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
        zzgdVar.zzc().zze(i13, zzb(zza2, zza3));
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) {
        boolean z13 = obj instanceof Byte;
        if (z13 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z14 = obj instanceof Short;
        if (z14 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z15 = obj instanceof Integer;
        if (z15 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z16 = obj instanceof Long;
        if (z16 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i13 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i13 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i13] ^ ((Number) obj2).byteValue())));
                    i13++;
                }
                return CollectionsKt.B0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i13 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i13] ^ ((Number) obj2).intValue()));
                    i13++;
                }
                return CollectionsKt.E0(arrayList2);
            }
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b13 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b13 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z14 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s13 : sArr) {
                arrayList4.add(Short.valueOf((short) (s13 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z15 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i14 : iArr) {
                arrayList5.add(Integer.valueOf(i14 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j13 : jArr) {
                arrayList6.add(Long.valueOf(j13 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z17 = obj instanceof byte[];
        if (z17 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b14 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b14 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z18 = obj instanceof short[];
        if (z18 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s14 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s14 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z19 = obj instanceof int[];
        if (z19 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i15 : iArr2) {
                arrayList9.add(Integer.valueOf(i15 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z23 = obj instanceof long[];
        if (z23 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j14 : jArr2) {
                arrayList10.add(Long.valueOf(j14 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z17 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length3, bArr4.length);
            IntRange q13 = s.q(0, length3);
            ArrayList arrayList11 = new ArrayList(g0.q(q13, 10));
            k it = q13.iterator();
            while (it.f104109c) {
                int b15 = it.b();
                arrayList11.add(Byte.valueOf((byte) (bArr4[b15] ^ bArr3[b15])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z18 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length4, sArr4.length);
            IntRange q14 = s.q(0, length4);
            ArrayList arrayList12 = new ArrayList(g0.q(q14, 10));
            k it2 = q14.iterator();
            while (it2.f104109c) {
                int b16 = it2.b();
                arrayList12.add(Short.valueOf((short) (sArr4[b16] ^ sArr3[b16])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z19 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length5, iArr4.length);
            IntRange q15 = s.q(0, length5);
            ArrayList arrayList13 = new ArrayList(g0.q(q15, 10));
            k it3 = q15.iterator();
            while (it3.f104109c) {
                int b17 = it3.b();
                arrayList13.add(Integer.valueOf(iArr4[b17] ^ iArr3[b17]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z23 || !(obj2 instanceof long[])) {
            throw new zzce(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzgw.zza(this, length6, jArr4.length);
        IntRange q16 = s.q(0, length6);
        ArrayList arrayList14 = new ArrayList(g0.q(q16, 10));
        k it4 = q16.iterator();
        while (it4.f104109c) {
            int b18 = it4.b();
            arrayList14.add(Long.valueOf(jArr3[b18] ^ jArr4[b18]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
