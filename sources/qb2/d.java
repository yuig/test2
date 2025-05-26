package qb2;

import com.pinterest.api.model.iw;
import dl1.s;
import ep.g;
import java.util.ArrayList;
import jk2.x;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import pb2.f;
import tk2.e;
import uj2.q;
import we1.f2;

/* loaded from: classes4.dex */
public final class d extends xk1.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final h12.a f103422k;

    /* renamed from: l, reason: collision with root package name */
    public final no1.d f103423l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f103424m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h12.a boardInviteApi, no1.d contactRequestRemoteDataSource) {
        super(null);
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        this.f103422k = boardInviteApi;
        this.f103423l = contactRequestRemoteDataSource;
        this.f103424m = new ArrayList();
        o(18, new f2(26));
        o(5, new f2(27));
        o(4, new f2(28));
        o(24, new f2(29));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) getItem(i13);
        if (sVar instanceof f) {
            return ((f) sVar).r();
        }
        throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar != null ? sVar.getClass() : null));
    }

    @Override // xk1.c
    public final q k() {
        x H = q.P(this.f103423l.b(), this.f103422k.a().u(), new g(25, new jq1.b(this, 12))).H(e.f118017c);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    @Override // xk1.c, vq0.e
    public final void removeItem(int i13) {
        s sVar = (s) getItem(i13);
        String uid = sVar != null ? sVar.getUid() : null;
        ArrayList arrayList = this.f103424m;
        arrayList.removeIf(new iw(16, new kw1.c(uid, 18)));
        super.removeItem(i13);
        s sVar2 = (s) CollectionsKt.firstOrNull(arrayList);
        if (sVar2 != null) {
            j2(sVar2);
        } else {
            clear();
        }
    }
}
