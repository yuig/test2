package ag;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static int f15090g;

    /* renamed from: a, reason: collision with root package name */
    public int f15091a;

    /* renamed from: b, reason: collision with root package name */
    public int f15092b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15093c;

    /* renamed from: d, reason: collision with root package name */
    public int f15094d;

    /* renamed from: e, reason: collision with root package name */
    public e f15095e;

    /* renamed from: f, reason: collision with root package name */
    public float f15096f;

    public static synchronized f a(int i13, e eVar) {
        f fVar;
        synchronized (f.class) {
            fVar = new f();
            if (i13 <= 0) {
                throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
            }
            fVar.f15092b = i13;
            fVar.f15093c = new Object[i13];
            fVar.f15094d = 0;
            fVar.f15095e = eVar;
            fVar.f15096f = 1.0f;
            fVar.d();
            int i14 = f15090g;
            fVar.f15091a = i14;
            f15090g = i14 + 1;
        }
        return fVar;
    }

    public final synchronized e b() {
        e eVar;
        try {
            if (this.f15094d == -1 && this.f15096f > 0.0f) {
                d();
            }
            Object[] objArr = this.f15093c;
            int i13 = this.f15094d;
            eVar = (e) objArr[i13];
            eVar.f15089a = -1;
            this.f15094d = i13 - 1;
        } catch (Throwable th3) {
            throw th3;
        }
        return eVar;
    }

    public final synchronized void c(e eVar) {
        try {
            int i13 = eVar.f15089a;
            if (i13 != -1) {
                if (i13 == this.f15091a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + eVar.f15089a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i14 = this.f15094d + 1;
            this.f15094d = i14;
            if (i14 >= this.f15093c.length) {
                int i15 = this.f15092b;
                int i16 = i15 * 2;
                this.f15092b = i16;
                Object[] objArr = new Object[i16];
                for (int i17 = 0; i17 < i15; i17++) {
                    objArr[i17] = this.f15093c[i17];
                }
                this.f15093c = objArr;
            }
            eVar.f15089a = this.f15091a;
            this.f15093c[this.f15094d] = eVar;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void d() {
        float f13 = this.f15096f;
        int i13 = this.f15092b;
        int i14 = (int) (i13 * f13);
        if (i14 < 1) {
            i13 = 1;
        } else if (i14 <= i13) {
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            this.f15093c[i15] = this.f15095e.a();
        }
        this.f15094d = i13 - 1;
    }
}
