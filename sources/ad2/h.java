package ad2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import o82.b3;
import r02.c0;
import w41.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lad2/h;", "Lo82/i3;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h extends a {
    public static final /* synthetic */ int H0 = 0;
    public final m1 F0;
    public final d4 G0;

    public h() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(23, new c0(this, 8)));
        this.F0 = a1.s(this, k0.f80436a.b(u.class), new s52.m(a13, 5), new t02.h(a13, 6), new t02.i(this, a13, 6));
        this.G0 = d4.ANDROID_WIDGET;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new g0(((u) this.F0.getValue()).a(), 25);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(((u) this.F0.getValue()).c(), 22);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        j jVar = new j();
        a.e eVar = new a.e(3);
        b3.G(adapter, 100, new c72.o(this, 28), jVar, new com.pinterest.boardAutoCollages.l(this, 8), eVar, null, 96);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(xc2.f.fragment_widget_board_selction, xc2.e.p_recycler_view);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intent intent;
        Bundle extras;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        FragmentActivity E4 = E4();
        ((u) this.F0.getValue()).h((E4 == null || (intent = E4.getIntent()) == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0));
        NestedScrollView nestedScrollView = (NestedScrollView) v13.findViewById(xc2.e.bottom_sheet_view);
        Intrinsics.f(nestedScrollView);
        BottomSheetBehavior J2 = BottomSheetBehavior.J(nestedScrollView);
        Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
        LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
        lockableBottomSheetBehavior.f44543h0 = false;
        lockableBottomSheetBehavior.X(3);
        nestedScrollView.requestLayout();
        ((GestaltSearchField) v13.findViewById(xc2.e.widget_board_search_field)).g0(new v02.d(this, 8));
    }
}
