package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zznx extends zzkr implements RandomAccess, zznj, zzor {
    private static final long[] zza;
    private static final zznx zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zznx(jArr, 0, false);
    }

    public zznx() {
        this(zza, 0, true);
    }

    public static zznx zzf() {
        return zzb;
    }

    private static int zzi(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    private final String zzj(int i13) {
        return a.f("Index:", i13, ", Size:", this.zzd);
    }

    private final void zzk(int i13) {
        if (i13 < 0 || i13 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i13));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        int i14;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i13));
        }
        int i15 = i13 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i14 < length) {
            System.arraycopy(jArr, i13, jArr, i15, i14 - i13);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i13);
            System.arraycopy(this.zzc, i13, jArr2, i15, this.zzd - i13);
            this.zzc = jArr2;
        }
        this.zzc[i13] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zznx)) {
            return super.addAll(collection);
        }
        zznx zznxVar = (zznx) collection;
        int i13 = zznxVar.zzd;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzd;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.zzc;
        if (i15 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(zznxVar.zzc, 0, this.zzc, this.zzd, zznxVar.zzd);
        this.zzd = i15;
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
        if (!(obj instanceof zznx)) {
            return super.equals(obj);
        }
        zznx zznxVar = (zznx) obj;
        if (this.zzd != zznxVar.zzd) {
            return false;
        }
        long[] jArr = zznxVar.zzc;
        for (int i13 = 0; i13 < this.zzd; i13++) {
            if (this.zzc[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzk(i13);
        return Long.valueOf(this.zzc[i13]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzd; i14++) {
            long j13 = this.zzc[i14];
            byte[] bArr = zznl.zzb;
            i13 = (i13 * 31) + ((int) (j13 ^ (j13 >>> 32)));
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i13 = this.zzd;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzc[i14] == longValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzk(i13);
        long[] jArr = this.zzc;
        long j13 = jArr[i13];
        if (i13 < this.zzd - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (r3 - i13) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i14, jArr, i13, this.zzd - i14);
        this.zzd -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzk(i13);
        long[] jArr = this.zzc;
        long j13 = jArr[i13];
        jArr[i13] = longValue;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i13) {
        if (i13 >= this.zzd) {
            return new zznx(i13 == 0 ? zza : Arrays.copyOf(this.zzc, i13), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i13) {
        zzk(i13);
        return this.zzc[i13];
    }

    public final void zzg(long j13) {
        zza();
        int i13 = this.zzd;
        int length = this.zzc.length;
        if (i13 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        jArr2[i14] = j13;
    }

    public final void zzh(int i13) {
        int length = this.zzc.length;
        if (i13 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i13, 10)];
            return;
        }
        while (length < i13) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zznx(long[] jArr, int i13, boolean z13) {
        super(z13);
        this.zzc = jArr;
        this.zzd = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
