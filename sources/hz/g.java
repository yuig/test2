package hz;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70612i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f70613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(0);
        this.f70612i = i13;
        this.f70613j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f70612i;
        h hVar = this.f70613j;
        switch (i13) {
            case 0:
                return hVar.generateLoggingContext();
            default:
                int i14 = h.B0;
                hVar.m8();
                hVar.l8();
                return Unit.f80348a;
        }
    }
}
