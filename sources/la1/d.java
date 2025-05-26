package la1;

import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82512a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i13) {
        super(0, obj, ka1.b.class, "onMyAccountClosed", "onMyAccountClosed()V", 0);
        this.f82512a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, p.class, "handleFooterClickAction", "handleFooterClickAction()V", 0);
        }
    }

    public final void h() {
        switch (this.f82512a) {
            case 0:
                ka1.b bVar = (ka1.b) this.receiver;
                bVar.getClass();
                try {
                    d0.v(bVar.getPinalytics(), f1.USER_DELETE, null, false, 12);
                    bVar.t3();
                    break;
                } catch (Exception e13) {
                    bVar.f78925b.e(e13.getMessage());
                    return;
                }
            default:
                ka1.b bVar2 = ((p) this.receiver).D0;
                if (bVar2 != null) {
                    bVar2.v3();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f82512a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
