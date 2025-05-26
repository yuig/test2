package kl0;

import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f80074j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, int i13) {
        super(1);
        this.f80073i = i13;
        this.f80074j = f0Var;
    }

    public final void b(int i13) {
        int i14 = this.f80073i;
        f0 f0Var = this.f80074j;
        switch (i14) {
            case 0:
                if (i13 == 0) {
                    int i15 = f0.f80080k0;
                    f0Var.getClass();
                    NavigationImpl w13 = Navigation.w1(com.pinterest.screens.q.a());
                    w13.Y1("com.pinterest.EXTRA_ABOUT_AMB_CAN_NAVIGATE_TO_OPTIONS", true);
                    f0Var.f7().d(w13);
                    d7.g.s(Navigation.w1(com.pinterest.screens.q.b()), f0Var.f7());
                    break;
                } else if (i13 == 1) {
                    int i16 = f0.f80080k0;
                    f0Var.getClass();
                    ScreenLocation c13 = com.pinterest.screens.q.c();
                    wy0 f13 = ((b60.d) f0Var.getActiveUserManager()).f();
                    String G2 = f13 != null ? f13.G2() : null;
                    String z43 = f13 != null ? f13.z4() : null;
                    String a13 = vb0.b.f125448a.a();
                    int value = hf0.b.a().getValue();
                    String str = (String) f0Var.f80084j0.getValue();
                    StringBuilder w14 = a.a.w("https://anket.pinterest.com/survey/437?country=", G2, "&username=", z43, "&sessionId=");
                    w14.append(a13);
                    w14.append("&app_type=");
                    w14.append(value);
                    w14.append("&boardId=");
                    w14.append(str);
                    NavigationImpl z03 = Navigation.z0(c13, w14.toString());
                    z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
                    z03.Y1("com.pinterest.EXTRA_IS_SURVEY", true);
                    f0Var.f7().d(z03);
                    d7.g.s(Navigation.w1(com.pinterest.screens.q.b()), f0Var.f7());
                    break;
                }
                break;
            default:
                f0Var.X6("com.pinterest.EXTRA_BOARD_VIEW_TYPE_RESULT_CODE", e0.t.j(new Pair("com.pinterest.EXTRA_BOARD_VIEW_TYPE", Integer.valueOf(i13))));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80073i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
