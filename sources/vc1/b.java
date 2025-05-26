package vc1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mf0.l;
import wc1.e;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f125597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f125596i = i13;
        this.f125597j = dVar;
    }

    public final void b(xj2.c cVar) {
        int i13 = this.f125596i;
        d dVar = this.f125597j;
        switch (i13) {
            case 1:
                dVar.f125603c.d(new of0.a(new l()));
                break;
            default:
                dVar.f125603c.d(new of0.a(new l()));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f125596i;
        d dVar = this.f125597j;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                tc1.b bVar = (tc1.b) dVar.getView();
                Intrinsics.f(th3);
                ((e) bVar).V8(th3);
                break;
            case 1:
                b((xj2.c) obj);
                break;
            case 2:
                dVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.LOGIN_OPTION_ENABLED_SUCCESS, (r18 & 2) != 0 ? null : u0.GPLUS_CONNECT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                tc1.b bVar2 = (tc1.b) dVar.getViewIfBound();
                if (bVar2 != null) {
                    e eVar = (e) bVar2;
                    eVar.U8().m(eVar.getString(g82.a.connected_to_social));
                }
                break;
            default:
                b((xj2.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
