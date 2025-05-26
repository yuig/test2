package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzot extends zzkr implements RandomAccess {
    private static final Object[] zza;
    private static final zzot zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzot(objArr, 0, false);
    }

    public zzot() {
        this(zza, 0, true);
    }

    public static zzot zze() {
        return zzb;
    }

    private static int zzg(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i13) {
        return a.f("Index:", i13, ", Size:", this.zzd);
    }

    private final void zzi(int i13) {
        if (i13 < 0 || i13 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i13));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i13));
        }
        int i15 = i13 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i14 < length) {
            System.arraycopy(objArr, i13, objArr, i15, i14 - i13);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i13);
            System.arraycopy(this.zzc, i13, objArr2, i15, this.zzd - i13);
            this.zzc = objArr2;
        }
        this.zzc[i13] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        zzi(i13);
        return this.zzc[i13];
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        zza();
        zzi(i13);
        Object[] objArr = this.zzc;
        Object obj = objArr[i13];
        if (i13 < this.zzd - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (r2 - i13) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        zza();
        zzi(i13);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i13) {
        if (i13 >= this.zzd) {
            return new zzot(i13 == 0 ? zza : Arrays.copyOf(this.zzc, i13), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i13) {
        int length = this.zzc.length;
        if (i13 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i13, 10)];
            return;
        }
        while (length < i13) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzot(Object[] objArr, int i13, boolean z13) {
        super(z13);
        this.zzc = objArr;
        this.zzd = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i13 = this.zzd;
        int length = this.zzc.length;
        if (i13 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i14 = this.zzd;
        this.zzd = i14 + 1;
        objArr[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
