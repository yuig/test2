package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class n0 extends c implements o0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f33663b;

    static {
        new n0();
    }

    public n0(ArrayList arrayList) {
        super(true);
        this.f33663b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void S1(k kVar) {
        b();
        this.f33663b.add(kVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        b();
        this.f33663b.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f33663b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f33663b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final k0 g(int i13) {
        List list = this.f33663b;
        if (i13 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i13);
        arrayList.addAll(list);
        return new n0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        List list = this.f33663b;
        Object obj = list.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            kVar.getClass();
            Charset charset = l0.f33646a;
            if (kVar.size() == 0) {
                str = "";
            } else {
                j jVar = (j) kVar;
                str = new String(jVar.f33635d, jVar.j(), jVar.size(), charset);
            }
            j jVar2 = (j) kVar;
            int j13 = jVar2.j();
            if (g2.g(jVar2.f33635d, j13, jVar2.size() + j13)) {
                list.set(i13, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, l0.f33646a);
            if (g2.f(bArr)) {
                list.set(i13, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final List h() {
        return Collections.unmodifiableList(this.f33663b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final o0 k() {
        return this.f33594a ? new y1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final Object m(int i13) {
        return this.f33663b.get(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        Object remove = this.f33663b.remove(i13);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof k)) {
            return new String((byte[]) remove, l0.f33646a);
        }
        k kVar = (k) remove;
        kVar.getClass();
        Charset charset = l0.f33646a;
        if (kVar.size() == 0) {
            return "";
        }
        j jVar = (j) kVar;
        return new String(jVar.f33635d, jVar.j(), jVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        Object obj2 = this.f33663b.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof k)) {
            return new String((byte[]) obj2, l0.f33646a);
        }
        k kVar = (k) obj2;
        kVar.getClass();
        Charset charset = l0.f33646a;
        if (kVar.size() == 0) {
            return "";
        }
        j jVar = (j) kVar;
        return new String(jVar.f33635d, jVar.j(), jVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33663b.size();
    }

    public n0() {
        super(false);
        this.f33663b = Collections.emptyList();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        if (collection instanceof o0) {
            collection = ((o0) collection).h();
        }
        boolean addAll = this.f33663b.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public n0(int i13) {
        this(new ArrayList(i13));
    }
}
