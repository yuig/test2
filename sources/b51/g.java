package b51;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22003i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f22004j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f22003i = i13;
        this.f22004j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f22003i;
        h hVar = this.f22004j;
        switch (i13) {
            case 0:
                hVar.f22007c.m(((yk1.a) hVar.f22008d).f139224a.getString(nz1.f.profile_spam_report_toast));
                break;
            default:
                hVar.f22007c.m(((yk1.a) hVar.f22008d).f139224a.getString(x0.generic_error));
                break;
        }
        return Unit.f80348a;
    }
}
