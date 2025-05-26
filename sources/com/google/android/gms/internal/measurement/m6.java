package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class m6 extends i5 implements l6, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f31524b;

    static {
        new m6();
    }

    public m6(ArrayList arrayList) {
        super(true);
        this.f31524b = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final void G1(o5 o5Var) {
        b();
        this.f31524b.add(o5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final l6 J() {
        return this.f31439a ? new s7(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        b();
        this.f31524b.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f31524b.size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f31524b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        List list = this.f31524b;
        Object obj = list.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof o5)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, c6.f31325a);
            p0 p0Var = y7.f31712a;
            int length = bArr.length;
            y7.f31712a.getClass();
            if (p0.c(bArr, 0, length)) {
                list.set(i13, str2);
            }
            return str2;
        }
        o5 o5Var = (o5) obj;
        o5Var.getClass();
        Charset charset = c6.f31325a;
        if (o5Var.j() == 0) {
            str = "";
        } else {
            n5 n5Var = (n5) o5Var;
            str = new String(n5Var.f31553d, n5Var.l(), n5Var.j(), charset);
        }
        n5 n5Var2 = (n5) o5Var;
        int l13 = n5Var2.l();
        int j13 = n5Var2.j() + l13;
        y7.f31712a.getClass();
        if (p0.c(n5Var2.f31553d, l13, j13)) {
            list.set(i13, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final Object o(int i13) {
        return this.f31524b.get(i13);
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        Object remove = this.f31524b.remove(i13);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof o5)) {
            return new String((byte[]) remove, c6.f31325a);
        }
        o5 o5Var = (o5) remove;
        o5Var.getClass();
        Charset charset = c6.f31325a;
        if (o5Var.j() == 0) {
            return "";
        }
        n5 n5Var = (n5) o5Var;
        return new String(n5Var.f31553d, n5Var.l(), n5Var.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        Object obj2 = this.f31524b.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof o5)) {
            return new String((byte[]) obj2, c6.f31325a);
        }
        o5 o5Var = (o5) obj2;
        o5Var.getClass();
        Charset charset = c6.f31325a;
        if (o5Var.j() == 0) {
            return "";
        }
        n5 n5Var = (n5) o5Var;
        return new String(n5Var.f31553d, n5Var.l(), n5Var.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31524b.size();
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final i6 zza(int i13) {
        List list = this.f31524b;
        if (i13 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i13);
        arrayList.addAll(list);
        return new m6(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final List zzb() {
        return Collections.unmodifiableList(this.f31524b);
    }

    public m6(int i13) {
        this(new ArrayList(i13));
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        if (collection instanceof l6) {
            collection = ((l6) collection).zzb();
        }
        boolean addAll = this.f31524b.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public m6() {
        super(false);
        this.f31524b = Collections.emptyList();
    }
}
