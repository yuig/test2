package com.google.android.recaptcha.internal;

import a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzne extends zzkr implements RandomAccess, zzni, zzor {
    private static final int[] zza;
    private static final zzne zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzne(iArr, 0, false);
    }

    public zzne() {
        this(zza, 0, true);
    }

    public static zzne zzf() {
        return zzb;
    }

    private static int zzj(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i13) {
        return a.f("Index:", i13, ", Size:", this.zzd);
    }

    private final void zzl(int i13) {
        if (i13 < 0 || i13 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i13));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        int i14;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i13));
        }
        int i15 = i13 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i14 < length) {
            System.arraycopy(iArr, i13, iArr, i15, i14 - i13);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i13);
            System.arraycopy(this.zzc, i13, iArr2, i15, this.zzd - i13);
            this.zzc = iArr2;
        }
        this.zzc[i13] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzne)) {
            return super.addAll(collection);
        }
        zzne zzneVar = (zzne) collection;
        int i13 = zzneVar.zzd;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzd;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.zzc;
        if (i15 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(zzneVar.zzc, 0, this.zzc, this.zzd, zzneVar.zzd);
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
        if (!(obj instanceof zzne)) {
            return super.equals(obj);
        }
        zzne zzneVar = (zzne) obj;
        if (this.zzd != zzneVar.zzd) {
            return false;
        }
        int[] iArr = zzneVar.zzc;
        for (int i13 = 0; i13 < this.zzd; i13++) {
            if (this.zzc[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzl(i13);
        return Integer.valueOf(this.zzc[i13]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzd; i14++) {
            i13 = (i13 * 31) + this.zzc[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i13 = this.zzd;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzc[i14] == intValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzl(i13);
        int[] iArr = this.zzc;
        int i14 = iArr[i13];
        if (i13 < this.zzd - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (r2 - i13) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i14, iArr, i13, this.zzd - i14);
        this.zzd -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i13);
        int[] iArr = this.zzc;
        int i14 = iArr[i13];
        iArr[i13] = intValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i13) {
        zzl(i13);
        return this.zzc[i13];
    }

    @Override // com.google.android.recaptcha.internal.zznk
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzni zzd(int i13) {
        if (i13 >= this.zzd) {
            return new zzne(i13 == 0 ? zza : Arrays.copyOf(this.zzc, i13), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzni
    public final void zzh(int i13) {
        zza();
        int i14 = this.zzd;
        int length = this.zzc.length;
        if (i14 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i15 = this.zzd;
        this.zzd = i15 + 1;
        iArr2[i15] = i13;
    }

    public final void zzi(int i13) {
        int length = this.zzc.length;
        if (i13 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i13, 10)];
            return;
        }
        while (length < i13) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzne(int[] iArr, int i13, boolean z13) {
        super(z13);
        this.zzc = iArr;
        this.zzd = i13;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
