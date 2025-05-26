package fi0;

import android.app.Activity;
import android.os.Bundle;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb2.n;
import mf0.l;
import mo1.d;
import mr1.h;
import or1.e;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f62206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f62207k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, h hVar, int i13) {
        super(1);
        this.f62205i = i13;
        this.f62206j = cVar;
        this.f62207k = hVar;
    }

    public final void b(wy0 wy0Var) {
        int i13 = this.f62205i;
        h hVar = this.f62207k;
        c cVar = this.f62206j;
        switch (i13) {
            case 2:
                mr1.a aVar = cVar.f62209b;
                or1.c cVar2 = or1.c.SWITCH_ACCOUNT;
                e eVar = e.SUCCESS;
                or1.a aVar2 = or1.b.Companion;
                wy0 wy0Var2 = hVar.f88089b;
                aVar2.getClass();
                ((n) aVar).h(cVar2, eVar, or1.a.a(wy0Var2), null);
                break;
            default:
                cVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.pinterest.EXTRA_SWITCH_ACCOUNT_CONFIRMATION_TOAST", true);
                bundle.putString("com.pinterest.EXTRA_SWITCH_ACCOUNT_FULL_NAME", hVar.f88089b.Z2());
                bundle.putString("com.pinterest.EXTRA_SWITCH_ACCOUNT_AVATAR_URL", hVar.f88089b.l3());
                d.a(cVar.f62211d, false, null, null, bundle, 7);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62205i;
        h hVar = this.f62207k;
        c cVar = this.f62206j;
        switch (i13) {
            case 0:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            case 1:
                ((ki0.c) ((ei0.a) cVar.getView())).f7().d(new of0.a(new l()));
                or1.c cVar2 = or1.c.SWITCH_ACCOUNT;
                e eVar = e.ATTEMPT;
                or1.a aVar = or1.b.Companion;
                wy0 wy0Var = hVar.f88089b;
                aVar.getClass();
                ((n) cVar.f62209b).h(cVar2, eVar, or1.a.a(wy0Var), null);
                break;
            case 2:
                b((wy0) obj);
                break;
            case 3:
                mr1.a aVar2 = cVar.f62209b;
                or1.c cVar3 = or1.c.SWITCH_ACCOUNT;
                e eVar2 = e.FAILURE;
                or1.a aVar3 = or1.b.Companion;
                wy0 wy0Var2 = hVar.f88089b;
                aVar3.getClass();
                n nVar = (n) aVar2;
                nVar.h(cVar3, eVar2, or1.a.a(wy0Var2), (Throwable) obj);
                break;
            default:
                b((wy0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
