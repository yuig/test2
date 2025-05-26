package g8;

/* loaded from: classes3.dex */
public final class b implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f64212a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f64214c;

    public b(c cVar, b1 b1Var) {
        this.f64214c = cVar;
        this.f64212a = b1Var;
    }

    @Override // g8.b1
    public final void b() {
        this.f64212a.b();
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        c cVar2 = this.f64214c;
        if (cVar2.b()) {
            return -3;
        }
        if (this.f64213b) {
            eVar.f57530b = 4;
            return -4;
        }
        long t13 = cVar2.t();
        int i14 = this.f64212a.i(cVar, eVar, i13);
        if (i14 != -5) {
            long j13 = cVar2.f64220f;
            if (j13 == Long.MIN_VALUE || ((i14 != -4 || eVar.f78456g < j13) && !(i14 == -3 && t13 == Long.MIN_VALUE && !eVar.f78455f))) {
                return i14;
            }
            eVar.n();
            eVar.f57530b = 4;
            this.f64213b = true;
            return -4;
        }
        androidx.media3.common.b bVar = (androidx.media3.common.b) cVar.f104884c;
        bVar.getClass();
        int i15 = bVar.I;
        int i16 = bVar.H;
        if (i16 != 0 || i15 != 0) {
            if (cVar2.f64219e != 0) {
                i16 = 0;
            }
            if (cVar2.f64220f != Long.MIN_VALUE) {
                i15 = 0;
            }
            a7.q a13 = bVar.a();
            a13.G = i16;
            a13.H = i15;
            cVar.f104884c = a13.a();
        }
        return -5;
    }

    @Override // g8.b1
    public final boolean j() {
        return !this.f64214c.b() && this.f64212a.j();
    }

    @Override // g8.b1
    public final int o(long j13) {
        if (this.f64214c.b()) {
            return -3;
        }
        return this.f64212a.o(j13);
    }
}
