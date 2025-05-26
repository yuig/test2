package b10;

import com.pinterest.api.model.pr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.si;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pr f20874j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ si f20875k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(pr prVar, si siVar, int i13) {
        super(0);
        this.f20873i = i13;
        this.f20874j = prVar;
        this.f20875k = siVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20873i) {
            case 0:
                m54invoke();
                break;
            case 1:
                m54invoke();
                break;
            case 2:
                m54invoke();
                break;
            case 3:
                m54invoke();
                break;
            default:
                m54invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m54invoke() {
        int i13 = this.f20873i;
        pr prVar = this.f20874j;
        si siVar = this.f20875k;
        switch (i13) {
            case 0:
                prVar.b(siVar.f133278a);
                break;
            case 1:
                prVar.c(siVar.f133279b != null ? Double.valueOf(r0.intValue()) : null);
                break;
            case 2:
                prVar.d(siVar.f133280c);
                break;
            case 3:
                prVar.e(siVar.f133281d);
                break;
            default:
                prVar.f(siVar.f133282e != null ? Double.valueOf(r0.intValue()) : null);
                break;
        }
    }
}
