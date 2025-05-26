package x8;

import q8.d0;
import q8.e0;
import q8.f0;
import q8.y;

/* loaded from: classes3.dex */
public final class d extends y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f134152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f134153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, e0 e0Var, e0 e0Var2) {
        super(e0Var);
        this.f134153c = eVar;
        this.f134152b = e0Var2;
    }

    @Override // q8.y, q8.e0
    public final d0 e(long j13) {
        d0 e13 = this.f134152b.e(j13);
        f0 f0Var = e13.f102898a;
        long j14 = f0Var.f102914a;
        long j15 = f0Var.f102915b;
        long j16 = this.f134153c.f134154a;
        f0 f0Var2 = new f0(j14, j15 + j16);
        f0 f0Var3 = e13.f102899b;
        return new d0(f0Var2, new f0(f0Var3.f102914a, f0Var3.f102915b + j16));
    }
}
