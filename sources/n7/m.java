package n7;

import pk.c1;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements d7.r, d7.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f89479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89481c;

    public /* synthetic */ m(int i13, long j13, b bVar) {
        this.f89481c = bVar;
        this.f89480b = i13;
        this.f89479a = j13;
    }

    @Override // d7.i
    public final void accept(Object obj) {
        l9.n nVar = (l9.n) this.f89481c;
        l9.a aVar = (l9.a) obj;
        bf.b.w(nVar.f82333i);
        c1 c1Var = aVar.f82294a;
        nVar.f82327c.getClass();
        byte[] d03 = g4.u.d0(aVar.f82296c, c1Var);
        d7.d0 d0Var = nVar.f82328d;
        d0Var.getClass();
        d0Var.I(d03.length, d03);
        nVar.f82325a.d(d03.length, 0, d0Var);
        long j13 = aVar.f82295b;
        long j14 = this.f89479a;
        if (j13 == -9223372036854775807L) {
            bf.b.t(nVar.f82333i.f18770t == Long.MAX_VALUE);
        } else {
            long j15 = nVar.f82333i.f18770t;
            j14 = j15 == Long.MAX_VALUE ? j14 + j13 : j13 + j15;
        }
        nVar.f82325a.a(j14, this.f89480b | 1, d03.length, 0, null);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        ((c) obj).l(this.f89480b, (b) this.f89481c);
    }

    public /* synthetic */ m(l9.n nVar, long j13, int i13) {
        this.f89481c = nVar;
        this.f89479a = j13;
        this.f89480b = i13;
    }
}
