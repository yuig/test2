package u81;

import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.e5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f120986j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i13) {
        super(0);
        this.f120985i = i13;
        this.f120986j = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f120985i) {
            case 0:
                b0 b0Var = this.f120986j;
                wy0 f13 = ((b60.d) b0Var.f120989a).f();
                String uid = f13 != null ? f13.getUid() : null;
                wy0 f14 = ((b60.d) b0Var.f120989a).f();
                break;
            case 1:
                m267invoke();
                break;
            default:
                m267invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m267invoke() {
        int i13 = this.f120985i;
        b0 b0Var = this.f120986j;
        switch (i13) {
            case 1:
                b0Var.f120990b.k(kk1.d.product_feedback_thank_you);
                break;
            default:
                NavigationImpl z03 = Navigation.z0((ScreenLocation) e5.f50737b.getValue(), (String) b0Var.f120998j.getValue());
                z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
                b0Var.f120991c.d(z03);
                b0Var.f120996h = true;
                break;
        }
    }
}
