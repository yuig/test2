package cb2;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.x0;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nx.d0;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv0.p f27306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f27307k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f27308l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(kv0.p pVar, String str, String str2, int i13) {
        super(0);
        this.f27305i = i13;
        this.f27306j = pVar;
        this.f27307k = str;
        this.f27308l = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f27305i) {
            case 0:
                m84invoke();
                break;
            default:
                m84invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m84invoke() {
        int i13 = this.f27305i;
        String str = this.f27308l;
        String str2 = this.f27307k;
        kv0.p pVar = this.f27306j;
        switch (i13) {
            case 0:
                ((d0) pVar.f80994a).F(g0.CONTEXTUAL_MENU, u0.BOARD_SECTION_EDIT_BUTTON);
                m60.w wVar = (m60.w) pVar.f80995b;
                NavigationImpl z03 = Navigation.z0((ScreenLocation) x0.f51541c.getValue(), str2);
                z03.m0("com.pinterest.EXTRA_BOARD_ID", str);
                wVar.d(z03);
                break;
            default:
                ((d0) pVar.f80994a).F(g0.CONTEXTUAL_MENU, u0.BOARD_SECTION_MORE_IDEAS);
                m60.w wVar2 = (m60.w) pVar.f80995b;
                NavigationImpl z04 = Navigation.z0((ScreenLocation) x0.f51542d.getValue(), str2);
                z04.m0("com.pinterest.EXTRA_BOARD_ID", str);
                z04.z(x22.c.CONTEXTUAL_MENU_BUTTON.ordinal(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
                wVar2.d(z04);
                break;
        }
    }
}
