package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzmv extends zzkr implements RandomAccess, zznk, zzor {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzmv(fArr, 0, false);
    }

    public zzmv() {
        this(zza, 0, true);
    }

    private static int zzh(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i13) {
        return a.f("Index:", i13, ", Size:", this.zzc);
    }

    private final void zzj(int i13) {
        if (i13 < 0 || i13 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i13));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        int i14;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i13));
        }
        int i15 = i13 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i14 < length) {
            System.arraycopy(fArr, i13, fArr, i15, i14 - i13);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i13);
            System.arraycopy(this.zzb, i13, fArr2, i15, this.zzc - i13);
            this.zzb = fArr2;
        }
        this.zzb[i13] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmv)) {
            return super.addAll(collection);
        }
        zzmv zzmvVar = (zzmv) collection;
        int i13 = zzmvVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        float[] fArr = this.zzb;
        if (i15 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i15);
        }
        System.arraycopy(zzmvVar.zzb, 0, this.zzb, this.zzc, zzmvVar.zzc);
        this.zzc = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return super.equals(obj);
        }
        zzmv zzmvVar = (zzmv) obj;
        if (this.zzc != zzmvVar.zzc) {
            return false;
        }
        float[] fArr = zzmvVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (Float.floatToIntBits(this.zzb[i13]) != Float.floatToIntBits(fArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzj(i13);
        return Float.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            i13 = (i13 * 31) + Float.floatToIntBits(this.zzb[i14]);
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == floatValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzj(i13);
        float[] fArr = this.zzb;
        float f13 = fArr[i13];
        if (i13 < this.zzc - 1) {
            System.arraycopy(fArr, i13 + 1, fArr, i13, (r2 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i14, fArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzj(i13);
        float[] fArr = this.zzb;
        float f13 = fArr[i13];
        fArr[i13] = floatValue;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzmv(i13 == 0 ? zza : Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i13) {
        zzj(i13);
        return this.zzb[i13];
    }

    public final void zzf(float f13) {
        zza();
        int i13 = this.zzc;
        int length = this.zzb.length;
        if (i13 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        fArr2[i14] = f13;
    }

    public final void zzg(int i13) {
        int length = this.zzb.length;
        if (i13 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i13, 10)];
            return;
        }
        while (length < i13) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzmv(float[] fArr, int i13, boolean z13) {
        super(z13);
        this.zzb = fArr;
        this.zzc = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
