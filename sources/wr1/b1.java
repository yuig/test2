package wr1;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130946i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f130947j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(d1 d1Var, int i13) {
        super(1);
        this.f130946i = i13;
        this.f130947j = d1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130946i;
        d1 d1Var = this.f130947j;
        switch (i13) {
            case 0:
                List users = (List) obj;
                Intrinsics.checkNotNullParameter(users, "users");
                zy.d0 d0Var = d1Var.f130956d;
                l82.c e13 = d1Var.f130960h.e();
                h32.i0 pinalyticsContext = new h32.i0(null, null, null, null, null, null);
                Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
                d0Var.e(d1Var.f130955c, new zy.e0(new zy.a(com.bumptech.glide.d.z0(pinalyticsContext, t0.F), h32.f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_NAME_REQUEST, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)), e13);
                List list = users;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f1((wy0) it.next()));
                }
                return arrayList;
            default:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                mb0.a aVar = (mb0.a) d1Var.f130959g.f63225b;
                start.a(aVar, new rb1.w(19), aVar.a());
                l82.n.b(start, d1Var.f130957e);
                zy.d0 d0Var2 = d1Var.f130956d;
                start.a(d0Var2, new rb1.w(20), d0Var2.a());
                return Unit.f80348a;
        }
    }
}
