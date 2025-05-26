package kl0;

/* loaded from: classes5.dex */
public final class m extends bk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sq0.e f80101b;

    public m(sq0.e eVar, int i13) {
        this.f80100a = i13;
        this.f80101b = eVar;
    }

    @Override // bk.f, ar0.f
    public final boolean b(int i13, int i14) {
        int i15 = this.f80100a;
        sq0.e eVar = this.f80101b;
        switch (i15) {
            case 0:
                int i16 = z.f80128e2;
                if (i14 >= ((z) eVar).p8() && super.b(i13, i14)) {
                    break;
                }
                break;
            default:
                int i17 = qn0.d.f104450m1;
                if (i14 >= ((qn0.d) eVar).p8() && super.b(i13, i14)) {
                    break;
                }
                break;
        }
        return true;
    }
}
