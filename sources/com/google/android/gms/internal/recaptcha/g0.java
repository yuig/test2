package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class g0 extends n implements f0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31750b;

    static {
        new g0(10).f31771a = false;
    }

    public g0(ArrayList arrayList) {
        this.f31771a = true;
        this.f31750b = arrayList;
    }

    @Override // com.google.android.gms.internal.recaptcha.f0
    public final f0 C0() {
        return this.f31771a ? new d1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i13, Object obj) {
        b();
        this.f31750b.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f31750b.size(), collection);
    }

    public final g0 c(int i13) {
        ArrayList arrayList = this.f31750b;
        if (i13 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i13);
        arrayList2.addAll(arrayList);
        return new g0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f31750b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        ArrayList arrayList = this.f31750b;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof u)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, d0.f31745a);
            if (k1.f31767a.f(bArr, 0, bArr.length)) {
                arrayList.set(i13, str2);
            }
            return str2;
        }
        u uVar = (u) obj;
        uVar.getClass();
        Charset charset = d0.f31745a;
        if (uVar.e() == 0) {
            str = "";
        } else {
            t tVar = (t) uVar;
            str = new String(tVar.f31788c, tVar.j(), tVar.e(), charset);
        }
        t tVar2 = (t) uVar;
        int j13 = tVar2.j();
        if (k1.f31767a.f(tVar2.f31788c, j13, tVar2.e() + j13)) {
            arrayList.set(i13, str);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        Object remove = this.f31750b.remove(i13);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof u)) {
            return new String((byte[]) remove, d0.f31745a);
        }
        u uVar = (u) remove;
        uVar.getClass();
        Charset charset = d0.f31745a;
        if (uVar.e() == 0) {
            return "";
        }
        t tVar = (t) uVar;
        return new String(tVar.f31788c, tVar.j(), tVar.e(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        Object obj2 = this.f31750b.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof u)) {
            return new String((byte[]) obj2, d0.f31745a);
        }
        u uVar = (u) obj2;
        uVar.getClass();
        Charset charset = d0.f31745a;
        if (uVar.e() == 0) {
            return "";
        }
        t tVar = (t) uVar;
        return new String(tVar.f31788c, tVar.j(), tVar.e(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31750b.size();
    }

    @Override // com.google.android.gms.internal.recaptcha.f0
    public final List zzb() {
        return Collections.unmodifiableList(this.f31750b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        if (collection instanceof f0) {
            collection = ((f0) collection).zzb();
        }
        boolean addAll = this.f31750b.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public g0(int i13) {
        this(new ArrayList(i13));
    }
}
