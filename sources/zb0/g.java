package zb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import u50.r;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f141561j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f141562k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(r rVar, k kVar, int i13) {
        super(0);
        this.f141560i = i13;
        this.f141561j = rVar;
        this.f141562k = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f141560i) {
            case 0:
                m299invoke();
                break;
            case 1:
                m299invoke();
                break;
            default:
                m299invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m299invoke() {
        int i13 = this.f141560i;
        r rVar = this.f141561j;
        k kVar = this.f141562k;
        switch (i13) {
            case 0:
                rVar.a(new c(((j) kVar).f141567b));
                break;
            case 1:
                rVar.a(new b(((j) kVar).f141567b));
                break;
            default:
                rVar.a(new e(((j) kVar).f141567b));
                break;
        }
    }
}
