package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzkv extends zzkr implements RandomAccess, zznk, zzor {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzkv(zArr, 0, false);
    }

    public zzkv() {
        this(zza, 0, true);
    }

    private static int zzg(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i13) {
        return a.f("Index:", i13, ", Size:", this.zzc);
    }

    private final void zzi(int i13) {
        if (i13 < 0 || i13 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i13));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        int i14;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i13));
        }
        int i15 = i13 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i14 < length) {
            System.arraycopy(zArr, i13, zArr, i15, i14 - i13);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i13);
            System.arraycopy(this.zzb, i13, zArr2, i15, this.zzc - i13);
            this.zzb = zArr2;
        }
        this.zzb[i13] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzkv)) {
            return super.addAll(collection);
        }
        zzkv zzkvVar = (zzkv) collection;
        int i13 = zzkvVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        boolean[] zArr = this.zzb;
        if (i15 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i15);
        }
        System.arraycopy(zzkvVar.zzb, 0, this.zzb, this.zzc, zzkvVar.zzc);
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
        if (!(obj instanceof zzkv)) {
            return super.equals(obj);
        }
        zzkv zzkvVar = (zzkv) obj;
        if (this.zzc != zzkvVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkvVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (this.zzb[i13] != zArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzi(i13);
        return Boolean.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            i13 = (i13 * 31) + zznl.zza(this.zzb[i14]);
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == booleanValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzi(i13);
        boolean[] zArr = this.zzb;
        boolean z13 = zArr[i13];
        if (i13 < this.zzc - 1) {
            System.arraycopy(zArr, i13 + 1, zArr, i13, (r2 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i14, zArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i13);
        boolean[] zArr = this.zzb;
        boolean z13 = zArr[i13];
        zArr[i13] = booleanValue;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzkv(i13 == 0 ? zza : Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z13) {
        zza();
        int i13 = this.zzc;
        int length = this.zzb.length;
        if (i13 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        zArr2[i14] = z13;
    }

    public final boolean zzf(int i13) {
        zzi(i13);
        return this.zzb[i13];
    }

    private zzkv(boolean[] zArr, int i13, boolean z13) {
        super(z13);
        this.zzb = zArr;
        this.zzc = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
