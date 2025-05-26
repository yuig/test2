package lv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84978i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f84979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f84978i = i13;
        this.f84979j = cVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f84978i;
        c cVar = this.f84979j;
        switch (i13) {
            case 0:
                if (cVar.isBound()) {
                    ((mv0.i) ((jv0.d) cVar.getView())).j9(x0.responses_create_failure);
                    break;
                }
                break;
            default:
                if (cVar.isBound()) {
                    ((mv0.i) ((jv0.d) cVar.getView())).j9(x0.responses_create_failure);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f84978i) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
