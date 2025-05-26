package hm1;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.notificationtab.view.NotificationsTabBadgeFlyoutView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import ru1.v;

/* loaded from: classes2.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f69584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69585c;

    public /* synthetic */ g(int i13, View view, Object obj) {
        this.f69583a = i13;
        this.f69584b = view;
        this.f69585c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f69583a;
        Object obj = this.f69585c;
        View view = this.f69584b;
        switch (i13) {
            case 0:
                GestaltText gestaltText = (GestaltText) view;
                gestaltText.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((Function1) obj).invoke(Integer.valueOf(gestaltText.getLineCount()));
                return;
            default:
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj;
                int i14 = iArr[0];
                int width = view.getWidth();
                int i15 = LegoFloatingBottomNavBar.N;
                int i16 = legoFloatingBottomNavBar.w().f63028b;
                b60.b bVar = legoFloatingBottomNavBar.D;
                if (bVar == null) {
                    Intrinsics.r("activeUserManager");
                    throw null;
                }
                wy0 f13 = ((b60.d) bVar).f();
                int i17 = (f13 == null || !dl2.b.G2(f13)) ? 0 : legoFloatingBottomNavBar.w().f63029c;
                if (legoFloatingBottomNavBar.f49967o || i17 <= 0 || i16 <= 0 || !r.f80446e) {
                    return;
                }
                Context context = legoFloatingBottomNavBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                NotificationsTabBadgeFlyoutView notificationsTabBadgeFlyoutView = new NotificationsTabBadgeFlyoutView(context);
                legoFloatingBottomNavBar.f49970r = notificationsTabBadgeFlyoutView;
                notificationsTabBadgeFlyoutView.a(new v(legoFloatingBottomNavBar));
                legoFloatingBottomNavBar.F(i17, i16);
                notificationsTabBadgeFlyoutView.f46839c = i14;
                notificationsTabBadgeFlyoutView.f46840d = width;
                legoFloatingBottomNavBar.addView(legoFloatingBottomNavBar.f49970r, 0);
                r.f80446e = false;
                NotificationsTabBadgeFlyoutView notificationsTabBadgeFlyoutView2 = legoFloatingBottomNavBar.f49970r;
                if (notificationsTabBadgeFlyoutView2 == null) {
                    return;
                }
                notificationsTabBadgeFlyoutView2.setImportantForAccessibility(4);
                return;
        }
    }
}
