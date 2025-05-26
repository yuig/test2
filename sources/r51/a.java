package r51;

import a12.d;
import com.pinterest.api.model.cd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk2.i1;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.q;
import xk1.c;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: k, reason: collision with root package name */
    public final d f106250k;

    /* renamed from: l, reason: collision with root package name */
    public final String f106251l;

    /* renamed from: m, reason: collision with root package name */
    public final String f106252m;

    /* renamed from: n, reason: collision with root package name */
    public final List f106253n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d aggregatedCommentService, String unifiedCommentModelType, String unifiedCommentId, List list) {
        super(null);
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(unifiedCommentModelType, "unifiedCommentModelType");
        Intrinsics.checkNotNullParameter(unifiedCommentId, "unifiedCommentId");
        this.f106250k = aggregatedCommentService;
        this.f106251l = unifiedCommentModelType;
        this.f106252m = unifiedCommentId;
        this.f106253n = list;
        o(1, new sz0.a(13));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 1;
    }

    @Override // xk1.c
    public final q k() {
        ArrayList arrayList = new ArrayList();
        String str = this.f106252m;
        List list = this.f106253n;
        if (list == null || !(!list.isEmpty())) {
            boolean d2 = Intrinsics.d(this.f106251l, "aggregatedcomment");
            d dVar = this.f106250k;
            q t13 = (d2 ? dVar.e(8, str) : dVar.n(str)).r(e.f118017c).l(wj2.c.a()).u().t(new d51.a(5, new y11.c(19, arrayList, this)));
            Intrinsics.checkNotNullExpressionValue(t13, "run(...)");
            return t13;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(str, (cd0) it.next()));
        }
        i1 y13 = q.y(arrayList);
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }
}
