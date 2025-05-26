package wa1;

import i32.l;
import i32.y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rg0.n;
import rg0.y;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128645i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f128646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, int i13) {
        super(1);
        this.f128645i = i13;
        this.f128646j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd0.c m13;
        int i13 = this.f128645i;
        k kVar = this.f128646j;
        switch (i13) {
            case 0:
                kVar.getClass();
                n c13 = ((dh0.d) y.a()).c(y0.ANDROID_USER_SETTINGS_TAKEOVER);
                if (c13 != null) {
                    int value = l.GRAD_WALKTHROUGH_SETTINGS_MOMENT_B.value();
                    int i14 = c13.f108060b;
                    if ((i14 == value || i14 == l.GRAD_WALKTHROUGH_SETTINGS_MOMENT_C.value()) && (m13 = c13.f108070l.m("display_data")) != null) {
                        vd0.a k13 = m13.k("tooltips");
                        ArrayList arrayList = new ArrayList(g0.q(k13, 10));
                        Iterator it = k13.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new eg0.c((vd0.c) it.next()));
                        }
                        kotlin.jvm.internal.j.z(kVar.getScope(), null, null, new f(kVar, c13, arrayList, null), 3);
                    }
                }
                return Unit.f80348a;
            default:
                xa1.l lVar = (xa1.l) ((com.pinterest.feature.settings.menu.b) kVar.getView());
                i92.k kVar2 = lVar.C0;
                if (kVar2 != null) {
                    kVar2.b(lVar.getString(x0.account_switcher_switch_failure_message));
                    return Unit.f80348a;
                }
                Intrinsics.r("toastUtils");
                throw null;
        }
    }
}
