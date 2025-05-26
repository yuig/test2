package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79726i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f79727j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sg2.a f79728k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(z0 z0Var, sg2.a aVar, int i13) {
        super(0);
        this.f79726i = i13;
        this.f79727j = z0Var;
        this.f79728k = aVar;
    }

    public final uf2.d b() {
        int i13 = this.f79726i;
        sg2.a aVar = this.f79728k;
        z0 z0Var = this.f79727j;
        switch (i13) {
            case 0:
                return new uf2.d(new u0(z0Var, 0), new v0(aVar, 0), 12);
            default:
                return new uf2.d(new u0(z0Var, 1), new v0(aVar, 5), 12);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f79726i) {
        }
        return b();
    }
}
