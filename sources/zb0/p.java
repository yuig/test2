package zb0;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends o {

    /* renamed from: e, reason: collision with root package name */
    public final a f141579e;

    public p(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f141575a = n.f141573l;
        this.f141576b = n.f141572k;
        this.f141577c = n.f141571j;
        this.f141578d = m.f141570i;
        this.f141579e = config;
    }

    @Override // zb0.o
    public final yb0.n a(Context context) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = yb0.n.f138503p;
        a aVar = this.f141579e;
        a13 = xa0.j.a(context, aVar.f141550a.a(context).toString(), aVar.f141551b.a(context), aVar.f141552c.a(context).toString(), (r20 & 16) != 0 ? "" : aVar.f141553d.a(context).toString(), (r20 & 32) != 0 ? yb0.k.f138491j : null, (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        a13.f138517n = aVar.f141554e;
        return a13;
    }
}
