package mu0;

import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f88299j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f88298i = i13;
        this.f88299j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f88298i) {
            case 0:
                m188invoke();
                break;
            case 1:
                m188invoke();
                break;
            default:
                m188invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m188invoke() {
        int i13 = this.f88298i;
        j jVar = this.f88299j;
        switch (i13) {
            case 0:
                if (jVar.isBound()) {
                    ((nu0.i) ((iu0.a) jVar.getView())).W8(false);
                    j.t3(jVar);
                    break;
                }
                break;
            case 1:
                if (jVar.isBound()) {
                    ((nu0.i) ((iu0.a) jVar.getView())).W8(false);
                    break;
                }
                break;
            default:
                jVar.getPinalytics().X(u0.CANCEL_BUTTON);
                break;
        }
    }
}
