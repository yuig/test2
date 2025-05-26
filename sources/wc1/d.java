package wc1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import va1.m1;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f129108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f129109k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, m1 m1Var, int i13) {
        super(0);
        this.f129107i = i13;
        this.f129108j = eVar;
        this.f129109k = m1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f129107i) {
            case 0:
                m280invoke();
                break;
            case 1:
                m280invoke();
                break;
            default:
                m280invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m280invoke() {
        int i13 = this.f129107i;
        m1 item = this.f129109k;
        e eVar = this.f129108j;
        switch (i13) {
            case 0:
                tc1.a aVar = eVar.D0;
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((vc1.d) aVar).f125608h = item;
                }
                w f73 = eVar.f7();
                NavigationImpl w13 = Navigation.w1((ScreenLocation) l4.f51095j.getValue());
                w13.y0(l91.f.CREATE, "extra_password_mode");
                f73.d(w13);
                break;
            case 1:
                tc1.a aVar2 = eVar.D0;
                if (aVar2 != null) {
                    ((vc1.d) aVar2).w3(item, false);
                    break;
                }
                break;
            default:
                tc1.a aVar3 = eVar.D0;
                if (aVar3 != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((vc1.d) aVar3).z3(item, true);
                    break;
                }
                break;
        }
    }
}
