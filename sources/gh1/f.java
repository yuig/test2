package gh1;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qf1.z;
import s81.g;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class f extends b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f65019t = 0;

    /* renamed from: s, reason: collision with root package name */
    public final v f65020s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, d0 pinalytics) {
        super(context, pinalytics, n92.c.view_today_tab_upsell_single_story);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f65020s = m.b(new ee1.d(this, 15));
        post(new g(this, 8));
    }

    @Override // gh1.b, eh1.a
    public final void X0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((GestaltButton) this.f65020s.getValue()).d(new z(text, 20));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i13) * 1.77d), 1073741824));
    }
}
