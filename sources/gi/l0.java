package gi;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f65083i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final l0 f65084j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f65085d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f65086e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f65087f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f65088g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f65089h;

    static {
        Object[] objArr = new Object[0];
        f65084j = new l0(0, 0, 0, objArr, objArr);
    }

    public l0(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        this.f65085d = objArr;
        this.f65086e = i13;
        this.f65087f = objArr2;
        this.f65088g = i14;
        this.f65089h = i15;
    }

    @Override // gi.u
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f65085d;
        int i13 = this.f65089h;
        System.arraycopy(objArr2, 0, objArr, 0, i13);
        return i13;
    }

    @Override // gi.u
    public final int c() {
        return this.f65089h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f65087f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i13 = rotateLeft & this.f65088g;
                    Object obj2 = objArr[i13];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    rotateLeft = i13 + 1;
                }
            }
        }
        return false;
    }

    @Override // gi.u
    public final int d() {
        return 0;
    }

    @Override // gi.u
    public final r0 e() {
        return n().listIterator(0);
    }

    @Override // gi.u
    public final Object[] f() {
        return this.f65085d;
    }

    @Override // gi.b0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f65086e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // gi.b0
    public final z p() {
        return z.l(this.f65089h, this.f65085d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f65089h;
    }
}
