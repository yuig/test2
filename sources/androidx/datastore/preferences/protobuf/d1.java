package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class d1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f18058a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f18059b;

    /* renamed from: c, reason: collision with root package name */
    public final u f18060c;

    public d1(w1 w1Var, u uVar, b bVar) {
        this.f18059b = w1Var;
        uVar.getClass();
        this.f18060c = uVar;
        this.f18058a = bVar;
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void a(Object obj, Object obj2) {
        o1.B(this.f18059b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void b(Object obj) {
        ((y1) this.f18059b).getClass();
        ((g0) obj).unknownFields.f18170e = false;
        this.f18060c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final boolean c(Object obj) {
        this.f18060c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final int d(Object obj) {
        ((y1) this.f18059b).getClass();
        x1 x1Var = ((g0) obj).unknownFields;
        int i13 = x1Var.f18169d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < x1Var.f18166a; i15++) {
            int i16 = x1Var.f18167b[i15] >>> 3;
            i14 += q.i(3, (i) x1Var.f18168c[i15]) + q.E(2, i16) + (q.D(1) * 2);
        }
        x1Var.f18169d = i14;
        return i14;
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final Object e() {
        g0 g0Var = (g0) this.f18058a;
        g0Var.getClass();
        return ((d0) g0Var.d(f0.NEW_BUILDER)).g();
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final int f(Object obj) {
        ((y1) this.f18059b).getClass();
        return ((g0) obj).unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final boolean g(Object obj, Object obj2) {
        w1 w1Var = this.f18059b;
        ((y1) w1Var).getClass();
        x1 x1Var = ((g0) obj).unknownFields;
        ((y1) w1Var).getClass();
        return x1Var.equals(((g0) obj2).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void h(Object obj, m1 m1Var, t tVar) {
        ((y1) this.f18059b).getClass();
        g0 g0Var = (g0) obj;
        if (g0Var.unknownFields == x1.f18165f) {
            g0Var.unknownFields = x1.b();
        }
        this.f18060c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n1
    public final void i(Object obj, h1.b bVar) {
        this.f18060c.getClass();
        ep.b.A(obj);
        throw null;
    }
}
