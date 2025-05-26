package e41;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g41.m;
import h32.f1;
import h32.u0;
import i92.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import so.oa;
import u40.d0;
import u40.f0;
import u40.g0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f57187j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, int i13) {
        super(1);
        this.f57186i = i13;
        this.f57187j = hVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f57186i;
        h hVar = this.f57187j;
        switch (i13) {
            case 1:
                c41.b bVar = (c41.b) hVar.getView();
                int i14 = x0.oops_something_went_wrong;
                k kVar = ((m) bVar).B0;
                if (kVar != null) {
                    kVar.h(i14);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            default:
                Intrinsics.f(th3);
                hVar.getClass();
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 d0Var;
        Integer num;
        int i13 = this.f57186i;
        h hVar = this.f57187j;
        switch (i13) {
            case 0:
                hVar.getDataSourceRegistry().d();
                hVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.USER_PROFILE_REMOVE, (r18 & 2) != 0 ? null : u0.USER_REMOVE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                g0 g0Var = (g0) ((pc.h) obj).f99563c;
                if (g0Var != null && (d0Var = g0Var.f120327a) != null) {
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    f0 f0Var = d0Var instanceof f0 ? (f0) d0Var : null;
                    if (f0Var != null && (num = f0Var.f120324b) != null) {
                        hVar.u3(num.intValue());
                    }
                }
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
