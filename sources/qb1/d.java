package qb1;

import android.os.Bundle;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.passcode.PasscodeLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import p91.k;
import pb1.p;
import pb1.s;
import u50.i0;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ nu.b f103415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f103416s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nu.b bVar, s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f103415r = bVar;
        this.f103416s = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f103415r, this.f103416s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p pVar = (p) this.f103416s;
        com.pinterest.feature.settings.passcode.d dVar = pVar.f99475a;
        String str = pVar.f99476b;
        i0 i0Var = pVar.f99477c;
        nu.b bVar = this.f103415r;
        bVar.getClass();
        int i13 = c.f103414a[dVar.ordinal()];
        if (i13 == 1) {
            ll.j jVar = (ll.j) bVar.f92310e;
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_passcode_verified", true);
            bundle.putString("passcode_verified", str);
            Unit unit = Unit.f80348a;
            jVar.E("passcode_screen_code", bundle);
        } else if (i13 == 2) {
            b20.c.B((b20.c) bVar.f92309d, new k92.b(new k92.c(i0Var, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL)), null, null, 30);
            ((w) bVar.f92307b).d(new k(bd1.b.IS_PARENTAL_CONTROL_PASSCODE_ENABLED, "false"));
            ((ll.j) bVar.f92310e).C(e.f103417j);
            ((b60.b) bVar.f92308c).a(e.f103418k);
            ll.j jVar2 = (ll.j) bVar.f92310e;
            NavigationImpl w13 = Navigation.w1(PasscodeLocation.PASSCODE_SETTINGS);
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            jVar2.f(w13);
        }
        return Unit.f80348a;
    }
}
