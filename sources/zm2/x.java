package zm2;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class x extends AbstractList implements RandomAccess, y {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f142257b = new k0(new x());

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f142258a;

    public x() {
        this.f142258a = new ArrayList();
    }

    @Override // zm2.y
    public final void A1(z zVar) {
        this.f142258a.add(zVar);
        ((AbstractList) this).modCount++;
    }

    @Override // zm2.y
    public final g E0(int i13) {
        g zVar;
        ArrayList arrayList = this.f142258a;
        Object obj = arrayList.get(i13);
        if (obj instanceof g) {
            zVar = (g) obj;
        } else if (obj instanceof String) {
            try {
                zVar = new z(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e13) {
                throw new RuntimeException("UTF-8 not supported?", e13);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            zVar = new z(bArr2);
        }
        if (zVar != obj) {
            arrayList.set(i13, zVar);
        }
        return zVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        this.f142258a.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f142258a.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f142258a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String b13;
        ArrayList arrayList = this.f142258a;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            b13 = gVar.t();
            if (gVar.j()) {
                arrayList.set(i13, b13);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            b13 = w.b(bArr);
            if (w.a(bArr)) {
                arrayList.set(i13, b13);
            }
        }
        return b13;
    }

    @Override // zm2.y
    public final List h() {
        return Collections.unmodifiableList(this.f142258a);
    }

    @Override // zm2.y
    public final k0 k() {
        return new k0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        Object remove = this.f142258a.remove(i13);
        ((AbstractList) this).modCount++;
        return remove instanceof String ? (String) remove : remove instanceof g ? ((g) remove).t() : w.b((byte[]) remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        Object obj2 = this.f142258a.set(i13, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof g ? ((g) obj2).t() : w.b((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f142258a.size();
    }

    public x(y yVar) {
        this.f142258a = new ArrayList(yVar.size());
        addAll(yVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        if (collection instanceof y) {
            collection = ((y) collection).h();
        }
        boolean addAll = this.f142258a.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
