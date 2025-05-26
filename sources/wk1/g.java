package wk1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130150i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f130151j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f130152k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(e eVar, i iVar, int i13) {
        super(1);
        this.f130150i = i13;
        this.f130151j = eVar;
        this.f130152k = iVar;
    }

    public final void b(wt1.p pVar) {
        int i13 = this.f130150i;
        i iVar = this.f130152k;
        e eVar = this.f130151j;
        switch (i13) {
            case 0:
                tl1.i iVar2 = pVar.f131096b;
                if (!eVar.t0() && iVar2 != null && iVar2.f118095a == 0) {
                    iVar.c();
                    break;
                }
                break;
            default:
                tl1.i iVar3 = pVar.f131096b;
                if (!eVar.t0() && iVar3 != null && iVar3.f118095a == 0) {
                    iVar.c();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f130150i) {
            case 0:
                b((wt1.p) obj);
                break;
            default:
                b((wt1.p) obj);
                break;
        }
        return Unit.f80348a;
    }
}
