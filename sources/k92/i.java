package k92;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import u50.r;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f78882j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f78883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, o oVar, int i13) {
        super(0);
        this.f78881i = i13;
        this.f78882j = rVar;
        this.f78883k = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f78881i) {
            case 0:
                m169invoke();
                break;
            case 1:
                m169invoke();
                break;
            case 2:
                m169invoke();
                break;
            case 3:
                m169invoke();
                break;
            case 4:
                m169invoke();
                break;
            case 5:
                m169invoke();
                break;
            case 6:
                m169invoke();
                break;
            default:
                m169invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m169invoke() {
        int i13 = this.f78881i;
        r rVar = this.f78882j;
        o oVar = this.f78883k;
        switch (i13) {
            case 0:
                rVar.a(new d(oVar.g()));
                break;
            case 1:
                rVar.a(new f(oVar.g()));
                break;
            case 2:
                rVar.a(new g(oVar.g()));
                break;
            case 3:
                rVar.a(new e(oVar.g()));
                break;
            case 4:
                rVar.a(new d(oVar.g()));
                break;
            case 5:
                rVar.a(new f(oVar.g()));
                break;
            case 6:
                rVar.a(new g(oVar.g()));
                break;
            default:
                rVar.a(new e(oVar.g()));
                break;
        }
    }
}
