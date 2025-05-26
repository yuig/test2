package ip0;

import com.pinterest.api.model.f30;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sq0.e0;
import uj2.q;
import uk1.d;
import vq0.b;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final a f73365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f73365c = this;
        this.f126436a.j(0, new pk0.b(4));
    }

    public final void D3(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Iterator it = d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((f30) it.next()).getUid(), pinUid)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            removeItem(i13);
        }
    }

    public final void F3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        x3(items);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f73365c;
    }
}
