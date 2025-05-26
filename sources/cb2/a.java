package cb2;

import android.view.View;
import com.pinterest.api.model.v7;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.x0;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f27286b;

    public /* synthetic */ a(c cVar, int i13) {
        this.f27285a = i13;
        this.f27286b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f27285a;
        c this$0 = this.f27286b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var = this$0.f27298a;
                u0 u0Var = u0.BOARD_EDIT_BUTTON;
                g0 g0Var = g0.CONTEXTUAL_MENU;
                v7 v7Var = this$0.f27304g;
                if (v7Var == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                d0Var.b0(u0Var, g0Var, v7Var.getUid(), false);
                ScreenLocation screenLocation = (ScreenLocation) x0.f51539a.getValue();
                v7 v7Var2 = this$0.f27304g;
                if (v7Var2 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                this$0.f27300c.d(Navigation.r0(screenLocation, v7Var2));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var2 = this$0.f27298a;
                u0 u0Var2 = u0.SEND_BUTTON;
                g0 g0Var2 = g0.CONTEXTUAL_MENU;
                v7 v7Var3 = this$0.f27304g;
                if (v7Var3 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                d0Var2.b0(u0Var2, g0Var2, v7Var3.getUid(), false);
                v7 v7Var4 = this$0.f27304g;
                if (v7Var4 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                this$0.f27301d.q(y32.f.BOARD_LONGPRESS.value(), v7Var4);
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f27298a.N(f1.DRAG, u0.BOARD_SECTION_REORDER_ENTRY_BUTTON, g0.CONTEXTUAL_MENU, null, false);
                ScreenLocation screenLocation2 = (ScreenLocation) x0.f51540b.getValue();
                v7 v7Var5 = this$0.f27304g;
                if (v7Var5 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                NavigationImpl z03 = Navigation.z0(screenLocation2, v7Var5.getUid());
                z03.z(com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER.ordinal(), "com.pinterest.EXTRA_BOARD_ORGANIZE_MODE");
                this$0.f27300c.d(z03);
                return;
        }
    }
}
