package wa1;

import android.app.Activity;
import android.os.Bundle;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb2.n;
import xa1.l;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128647i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f128648j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mr1.h f128649k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, mr1.h hVar, int i13) {
        super(1);
        this.f128647i = i13;
        this.f128648j = kVar;
        this.f128649k = hVar;
    }

    public final void b(wy0 wy0Var) {
        int i13 = this.f128647i;
        mr1.h hVar = this.f128649k;
        k kVar = this.f128648j;
        switch (i13) {
            case 2:
                mr1.a aVar = kVar.f128654e;
                or1.c cVar = or1.c.SWITCH_ACCOUNT;
                or1.e eVar = or1.e.SUCCESS;
                or1.a aVar2 = or1.b.Companion;
                wy0 wy0Var2 = hVar.f88089b;
                aVar2.getClass();
                ((n) aVar).h(cVar, eVar, or1.a.a(wy0Var2), null);
                break;
            default:
                kVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.pinterest.EXTRA_SWITCH_ACCOUNT_CONFIRMATION_TOAST", true);
                bundle.putString("com.pinterest.EXTRA_SWITCH_ACCOUNT_FULL_NAME", hVar.f88089b.Z2());
                bundle.putString("com.pinterest.EXTRA_SWITCH_ACCOUNT_AVATAR_URL", hVar.f88089b.l3());
                mo1.d.a(kVar.f128657h, false, null, null, bundle, 7);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f128647i;
        mr1.h hVar = this.f128649k;
        k kVar = this.f128648j;
        switch (i13) {
            case 0:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            case 1:
                ((l) ((com.pinterest.feature.settings.menu.b) kVar.getView())).f7().d(new of0.a(new mf0.l()));
                or1.c cVar = or1.c.SWITCH_ACCOUNT;
                or1.e eVar = or1.e.ATTEMPT;
                or1.a aVar = or1.b.Companion;
                wy0 wy0Var = hVar.f88089b;
                aVar.getClass();
                ((n) kVar.f128654e).h(cVar, eVar, or1.a.a(wy0Var), null);
                break;
            case 2:
                b((wy0) obj);
                break;
            case 3:
                mr1.a aVar2 = kVar.f128654e;
                or1.c cVar2 = or1.c.SWITCH_ACCOUNT;
                or1.e eVar2 = or1.e.FAILURE;
                or1.a aVar3 = or1.b.Companion;
                wy0 wy0Var2 = hVar.f88089b;
                aVar3.getClass();
                n nVar = (n) aVar2;
                nVar.h(cVar2, eVar2, or1.a.a(wy0Var2), (Throwable) obj);
                break;
            default:
                b((wy0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
