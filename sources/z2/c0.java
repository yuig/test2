package z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140609i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f140610j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(z zVar, int i13) {
        super(0);
        this.f140609i = i13;
        this.f140610j = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z zVar = this.f140610j;
        int i13 = this.f140609i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        zVar.M0();
                        break;
                    default:
                        if (zVar.f120042a.f120054m) {
                            androidx.compose.ui.focus.a.D(zVar);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        zVar.M0();
                        break;
                    default:
                        if (zVar.f120042a.f120054m) {
                            androidx.compose.ui.focus.a.D(zVar);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
