package rf1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107925i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rg0.n f107926j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(rg0.n nVar, int i13) {
        super(0);
        this.f107925i = i13;
        this.f107926j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f107925i) {
            case 0:
                m246invoke();
                break;
            case 1:
                m246invoke();
                break;
            case 2:
                m246invoke();
                break;
            default:
                m246invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m246invoke() {
        int i13 = this.f107925i;
        rg0.n nVar = this.f107926j;
        switch (i13) {
            case 0:
                nVar.g();
                break;
            case 1:
                nVar.a(null, null);
                break;
            case 2:
                nVar.c(null, null);
                break;
            default:
                nVar.c(null, null);
                break;
        }
    }
}
