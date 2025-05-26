package ep;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes3.dex */
public final class i extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final h12.a f59881k;

    /* renamed from: l, reason: collision with root package name */
    public final no1.d f59882l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h12.a boardInviteApi, no1.d contactRequestRemoteDataSource) {
        super(null);
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        this.f59881k = boardInviteApi;
        this.f59882l = contactRequestRemoteDataSource;
        o(18, new c(4));
        o(5, new c(5));
        o(4, new c(6));
        o(0, new c(7));
        o(20, new c(8));
        o(19, new c(9));
        o(21, new c(10));
        o(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, new c(11));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) getItem(i13);
        if (sVar instanceof pb2.f) {
            return ((pb2.f) sVar).r();
        }
        throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar != null ? sVar.getClass() : null));
    }

    @Override // xk1.c
    public final q k() {
        x H = q.P(this.f59882l.b(), this.f59881k.a().u(), new g(0, h.f59880i)).H(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }
}
