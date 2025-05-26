package r02;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f105769d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105770e;

    public l(int i13, boolean z13) {
        this.f105769d = i13;
        this.f105770e = z13;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u50.k0 j23 = bs1.c.j2(new String[0], this.f105769d);
        boolean z13 = this.f105770e;
        return new GestaltToast(context, new do1.d(j23, new do1.l(new rm1.f(z13 ? rm1.q.CHECK_CIRCLE : rm1.q.WORKFLOW_STATUS_PROBLEM, rm1.i.LG)), null, z13 ? do1.n.DEFAULT : do1.n.ERROR, 0, 0, 4, null, true, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP));
    }
}
