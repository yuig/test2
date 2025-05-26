package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class m0 extends c implements n0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18107b;

    static {
        new m0(10).f18035a = false;
    }

    public m0(int i13) {
        this(new ArrayList(i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        b();
        this.f18107b.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f18107b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void b0(i iVar) {
        b();
        this.f18107b.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f18107b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final i0 g(int i13) {
        ArrayList arrayList = this.f18107b;
        if (i13 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i13);
        arrayList2.addAll(arrayList);
        return new m0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        ArrayList arrayList = this.f18107b;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            iVar.getClass();
            Charset charset = j0.f18080a;
            if (iVar.size() == 0) {
                str = "";
            } else {
                j jVar = (j) iVar;
                str = new String(jVar.f18079d, jVar.j(), jVar.size(), charset);
            }
            j jVar2 = (j) iVar;
            int j13 = jVar2.j();
            if (k2.f18088a.i(j13, jVar2.size() + j13, jVar2.f18079d) == 0) {
                arrayList.set(i13, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, j0.f18080a);
            if (k2.f18088a.i(0, bArr.length, bArr) == 0) {
                arrayList.set(i13, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final List h() {
        return Collections.unmodifiableList(this.f18107b);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final n0 k() {
        return this.f18035a ? new b2(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final Object m(int i13) {
        return this.f18107b.get(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        Object remove = this.f18107b.remove(i13);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof i)) {
            return new String((byte[]) remove, j0.f18080a);
        }
        i iVar = (i) remove;
        iVar.getClass();
        Charset charset = j0.f18080a;
        if (iVar.size() == 0) {
            return "";
        }
        j jVar = (j) iVar;
        return new String(jVar.f18079d, jVar.j(), jVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        Object obj2 = this.f18107b.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof i)) {
            return new String((byte[]) obj2, j0.f18080a);
        }
        i iVar = (i) obj2;
        iVar.getClass();
        Charset charset = j0.f18080a;
        if (iVar.size() == 0) {
            return "";
        }
        j jVar = (j) iVar;
        return new String(jVar.f18079d, jVar.j(), jVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18107b.size();
    }

    public m0(ArrayList arrayList) {
        this.f18107b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        if (collection instanceof n0) {
            collection = ((n0) collection).h();
        }
        boolean addAll = this.f18107b.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
