package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzmi extends zzkr implements RandomAccess, zznk, zzor {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzmi(dArr, 0, false);
    }

    public zzmi() {
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
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i13));
        }
        int i15 = i13 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i14 < length) {
            System.arraycopy(dArr, i13, dArr, i15, i14 - i13);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i13);
            System.arraycopy(this.zzb, i13, dArr2, i15, this.zzc - i13);
            this.zzb = dArr2;
        }
        this.zzb[i13] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmi)) {
            return super.addAll(collection);
        }
        zzmi zzmiVar = (zzmi) collection;
        int i13 = zzmiVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        double[] dArr = this.zzb;
        if (i15 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i15);
        }
        System.arraycopy(zzmiVar.zzb, 0, this.zzb, this.zzc, zzmiVar.zzc);
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
        if (!(obj instanceof zzmi)) {
            return super.equals(obj);
        }
        zzmi zzmiVar = (zzmi) obj;
        if (this.zzc != zzmiVar.zzc) {
            return false;
        }
        double[] dArr = zzmiVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (Double.doubleToLongBits(this.zzb[i13]) != Double.doubleToLongBits(dArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzj(i13);
        return Double.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i14]);
            byte[] bArr = zznl.zzb;
            i13 = (i13 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == doubleValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzj(i13);
        double[] dArr = this.zzb;
        double d2 = dArr[i13];
        if (i13 < this.zzc - 1) {
            System.arraycopy(dArr, i13 + 1, dArr, i13, (r3 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i14, dArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzj(i13);
        double[] dArr = this.zzb;
        double d2 = dArr[i13];
        dArr[i13] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzmi(i13 == 0 ? zza : Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i13) {
        zzj(i13);
        return this.zzb[i13];
    }

    public final void zzf(double d2) {
        zza();
        int i13 = this.zzc;
        int length = this.zzb.length;
        if (i13 == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        dArr2[i14] = d2;
    }

    public final void zzg(int i13) {
        int length = this.zzb.length;
        if (i13 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i13, 10)];
            return;
        }
        while (length < i13) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzmi(double[] dArr, int i13, boolean z13) {
        super(z13);
        this.zzb = dArr;
        this.zzc = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
