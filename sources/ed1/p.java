package ed1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58670i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f58671j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i13) {
        super(0);
        this.f58670i = i13;
        this.f58671j = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f58670i;
        q qVar = this.f58671j;
        switch (i13) {
            case 0:
                if (qVar.G.j()) {
                    return new o(qVar, 0);
                }
                return null;
            default:
                qVar.r3(false);
                return Unit.f80348a;
        }
    }
}
