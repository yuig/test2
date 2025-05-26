package ep;

import com.pinterest.api.model.wy0;
import dl1.s;
import h32.f1;
import java.util.ArrayList;
import jk2.i1;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;

/* loaded from: classes3.dex */
public final class f extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final u20.d f59871k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f59872l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f59873m;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f59874n;

    /* renamed from: o, reason: collision with root package name */
    public final Function0 f59875o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f59876p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f59877q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u20.d sendShareServiceWrapper, d0 pinalytics, boolean z13, b60.b activeUserManager, jp.e shouldShowCachedContacts) {
        super(null);
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(shouldShowCachedContacts, "shouldShowCachedContacts");
        this.f59871k = sendShareServiceWrapper;
        this.f59872l = pinalytics;
        this.f59873m = z13;
        this.f59874n = activeUserManager;
        this.f59875o = shouldShowCachedContacts;
        o(1, new c(2));
        o(17, new c(3));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) getItem(i13);
        if (sVar instanceof pb2.f) {
            return ((pb2.f) sVar).r();
        }
        throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar != null ? sVar.getClass() : null));
    }

    @Override // wt1.b
    public final boolean i() {
        return (this.f59876p == null || this.f59877q == null) ? false : true;
    }

    @Override // xk1.c
    public final q k() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.f59876p;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.d(bool, bool2) || Intrinsics.d(this.f59877q, bool2)) {
            arrayList.add(new pb2.i());
            i1 y13 = q.y(arrayList);
            Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
            return y13;
        }
        if (this.f59876p == null || this.f59877q == null) {
            i1 y14 = q.y(q0.f80391a);
            Intrinsics.checkNotNullExpressionValue(y14, "just(...)");
            return y14;
        }
        if (this.f59873m) {
            d0.v(this.f59872l, f1.CONVERSATION_EMPTY_INBOX_NEW_MESSAGE_BTN_DISPLAYED, null, false, 12);
            wy0 f13 = ((b60.d) this.f59874n).f();
            if ((f13 != null ? f13.k2() : 0).intValue() > 15) {
                arrayList.add(new pb2.i());
            }
        }
        return !((Boolean) this.f59875o.invoke()).booleanValue() ? q.y(arrayList) : u20.d.d(this.f59871k, 15).H(tk2.e.f118017c).t(new a(2, new w1.g(arrayList, 6)));
    }
}
