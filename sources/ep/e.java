package ep;

import dl1.s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes3.dex */
public final class e extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f59869k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f59870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h12.a boardInviteApi) {
        super(null);
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        this.f59870l = boardInviteApi;
        o(4, new c(0));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f59869k) {
            case 0:
                s sVar = (s) getItem(i13);
                if (sVar instanceof pb2.f) {
                    return 4;
                }
                throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar != null ? sVar.getClass() : null));
            default:
                s sVar2 = (s) getItem(i13);
                if (sVar2 instanceof pb2.f) {
                    return ((pb2.f) sVar2).r();
                }
                throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar2 != null ? sVar2.getClass() : null));
        }
    }

    @Override // xk1.c
    public final q k() {
        switch (this.f59869k) {
            case 0:
                kk2.m k13 = ((h12.a) this.f59870l).a().l(wj2.c.a()).r(tk2.e.f118017c).k(new a(0, d.f59865j));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                q u13 = k13.u();
                Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
                return u13;
            default:
                q t13 = u20.d.d((u20.d) this.f59870l, 15).H(tk2.e.f118017c).t(new a(1, new w1.g(new ArrayList(), 5)));
                Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
                return t13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u20.d sendShareServiceWrapper) {
        super(null);
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        this.f59870l = sendShareServiceWrapper;
        o(22, new c(1));
    }
}
