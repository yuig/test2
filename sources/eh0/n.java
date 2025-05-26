package eh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class n extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58942i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rg0.n f58943j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f58944k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(rg0.n nVar, Function0 function0, int i13) {
        super(0);
        this.f58942i = i13;
        this.f58943j = nVar;
        this.f58944k = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58942i) {
            case 0:
                m136invoke();
                break;
            default:
                m136invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m136invoke() {
        int i13 = this.f58942i;
        Function0 function0 = this.f58944k;
        rg0.n nVar = this.f58943j;
        switch (i13) {
            case 0:
                o.f58945a = false;
                nVar.c(null, null);
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                o.f58945a = false;
                nVar.c(null, null);
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }
}
