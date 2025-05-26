package mn0;

import com.pinterest.repository.pin.PinService;
import j12.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public final class h extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87790a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87791b;

    /* renamed from: c, reason: collision with root package name */
    public final PinService f87792c;

    /* renamed from: d, reason: collision with root package name */
    public final k f87793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String boardId, ArrayList arrayList, PinService pinService, k boardSectionService, uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f87790a = boardId;
        this.f87791b = arrayList;
        this.f87792c = pinService;
        this.f87793d = boardSectionService;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ln0.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        List list = this.f87791b;
        if (list == null || !(!list.isEmpty())) {
            xj2.c o13 = this.f87793d.e(this.f87790a).r(tk2.e.f118017c).l(wj2.c.a()).o(new xl0.a(18, new f(this, 1)), new xl0.a(19, g.f87788k));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        } else {
            xj2.c o14 = this.f87792c.loadSuggestedBoardNames((String) list.get(0)).r(tk2.e.f118017c).l(wj2.c.a()).o(new xl0.a(20, new f(this, 0)), new xl0.a(21, g.f87787j));
            Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
            addDisposable(o14);
        }
    }
}
