package pk;

/* loaded from: classes.dex */
public final class b3 extends o1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f100361i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final b3 f100362j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f100363d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f100364e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f100365f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f100366g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f100367h;

    static {
        Object[] objArr = new Object[0];
        f100362j = new b3(0, 0, 0, objArr, objArr);
    }

    public b3(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        this.f100363d = objArr;
        this.f100364e = i13;
        this.f100365f = objArr2;
        this.f100366g = i14;
        this.f100367h = i15;
    }

    @Override // pk.v0
    public final int c(int i13, Object[] objArr) {
        Object[] objArr2 = this.f100363d;
        int i14 = this.f100367h;
        System.arraycopy(objArr2, 0, objArr, i13, i14);
        return i13 + i14;
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f100365f;
            if (objArr.length != 0) {
                int Y1 = bs1.c.Y1(obj);
                while (true) {
                    int i13 = Y1 & this.f100366g;
                    Object obj2 = objArr[i13];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    Y1 = i13 + 1;
                }
            }
        }
        return false;
    }

    @Override // pk.v0
    public final Object[] d() {
        return this.f100363d;
    }

    @Override // pk.v0
    public final int e() {
        return this.f100367h;
    }

    @Override // pk.v0
    public final int f() {
        return 0;
    }

    @Override // pk.o1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f100364e;
    }

    @Override // pk.v0
    public final boolean i() {
        return false;
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f100367h;
    }

    @Override // pk.o1
    public final c1 t() {
        return c1.l(this.f100367h, this.f100363d);
    }

    @Override // pk.o1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
