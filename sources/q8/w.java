package q8;

/* loaded from: classes3.dex */
public class w implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102994a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102995b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f102996c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(long j13) {
        this(j13, 0L);
        this.f102994a = 1;
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        int i13 = this.f102994a;
        int i14 = 1;
        Object obj = this.f102996c;
        switch (i13) {
            case 0:
                x xVar = (x) obj;
                bf.b.w(xVar.f103007k);
                sp2.i iVar = xVar.f103007k;
                long[] jArr = (long[]) iVar.f114928b;
                long[] jArr2 = (long[]) iVar.f114929c;
                int e13 = d7.n0.e(jArr, d7.n0.j((xVar.f103001e * j13) / 1000000, 0L, xVar.f103006j - 1), false);
                long j14 = e13 == -1 ? 0L : jArr[e13];
                long j15 = e13 != -1 ? jArr2[e13] : 0L;
                long j16 = (j14 * 1000000) / ((x) obj).f103001e;
                long j17 = this.f102995b;
                f0 f0Var = new f0(j16, j15 + j17);
                if (j16 == j13 || e13 == jArr.length - 1) {
                    return new d0(f0Var, f0Var);
                }
                int i15 = e13 + 1;
                return new d0(f0Var, new f0((jArr[i15] * 1000000) / ((x) obj).f103001e, j17 + jArr2[i15]));
            case 1:
                return (d0) obj;
            default:
                s8.b bVar = (s8.b) obj;
                d0 b13 = bVar.f111424i[0].b(j13);
                while (true) {
                    s8.e[] eVarArr = bVar.f111424i;
                    if (i14 >= eVarArr.length) {
                        return b13;
                    }
                    d0 b14 = eVarArr[i14].b(j13);
                    if (b14.f102898a.f102915b < b13.f102898a.f102915b) {
                        b13 = b14;
                    }
                    i14++;
                }
        }
    }

    @Override // q8.e0
    public final boolean h() {
        switch (this.f102994a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // q8.e0
    public final long l() {
        switch (this.f102994a) {
            case 0:
                return ((x) this.f102996c).b();
            default:
                return this.f102995b;
        }
    }

    public /* synthetic */ w(Object obj, long j13, int i13) {
        this.f102994a = i13;
        this.f102996c = obj;
        this.f102995b = j13;
    }

    public w(long j13, long j14) {
        this.f102994a = 1;
        this.f102995b = j13;
        f0 f0Var = j14 == 0 ? f0.f102913c : new f0(0L, j14);
        this.f102996c = new d0(f0Var, f0Var);
    }
}
