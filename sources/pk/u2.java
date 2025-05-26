package pk;

/* loaded from: classes3.dex */
public final class u2 extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public static final u2 f100492i = new u2();

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f100493d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f100494e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f100495f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f100496g;

    /* renamed from: h, reason: collision with root package name */
    public final transient u2 f100497h;

    public u2() {
        this.f100493d = null;
        this.f100494e = new Object[0];
        this.f100495f = 0;
        this.f100496g = 0;
        this.f100497h = this;
    }

    @Override // pk.h1
    public final x2 d() {
        return new x2(this, this.f100494e, this.f100495f, this.f100496g);
    }

    @Override // pk.h1
    public final y2 e() {
        return new y2(this, new z2(this.f100495f, this.f100496g, this.f100494e));
    }

    @Override // pk.h1, java.util.Map
    public final Object get(Object obj) {
        Object n13 = a3.n(this.f100496g, this.f100495f, this.f100493d, obj, this.f100494e);
        if (n13 == null) {
            return null;
        }
        return n13;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f100496g;
    }

    @Override // pk.s0, pk.h1
    public Object writeReplace() {
        return super.writeReplace();
    }

    public u2(int i13, Object[] objArr) {
        this.f100494e = objArr;
        this.f100496g = i13;
        this.f100495f = 0;
        int n13 = i13 >= 2 ? o1.n(i13) : 0;
        Object m13 = a3.m(objArr, i13, n13, 0);
        if (!(m13 instanceof Object[])) {
            this.f100493d = m13;
            Object m14 = a3.m(objArr, i13, n13, 1);
            if (!(m14 instanceof Object[])) {
                this.f100497h = new u2(m14, objArr, i13, this);
                return;
            }
            throw ((f1) ((Object[]) m14)[2]).a();
        }
        throw ((f1) ((Object[]) m13)[2]).a();
    }

    public u2(Object obj, Object[] objArr, int i13, u2 u2Var) {
        this.f100493d = obj;
        this.f100494e = objArr;
        this.f100495f = 1;
        this.f100496g = i13;
        this.f100497h = u2Var;
    }
}
