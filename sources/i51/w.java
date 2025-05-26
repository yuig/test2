package i51;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.h0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final w f71609j = new w(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f71610k = new w(1);

    /* renamed from: l, reason: collision with root package name */
    public static final w f71611l = new w(2);

    /* renamed from: m, reason: collision with root package name */
    public static final w f71612m = new w(3);

    /* renamed from: n, reason: collision with root package name */
    public static final w f71613n = new w(4);

    /* renamed from: o, reason: collision with root package name */
    public static final w f71614o = new w(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13) {
        super(1);
        this.f71615i = i13;
    }

    public final g b(g it) {
        u41.e eVar = null;
        switch (this.f71615i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, false, null, null, null, false, null, true, 63);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.e(it, false, null, null, null, false, null, false, 63);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "profileSavedTabDS");
                u41.e eVar2 = it.f71585b;
                if (eVar2 != null) {
                    bm1.m mVar = eVar2.f120483a;
                    eVar = u41.e.a(eVar2, bm1.m.e(mVar, null, kh2.j.S(mVar.f23508b), null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED), null, 2);
                }
                return g.e(it, false, eVar, null, null, false, null, false, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
            case 3:
                Intrinsics.checkNotNullParameter(it, "profileSavedTabDS");
                u41.e eVar3 = it.f71585b;
                if (eVar3 != null) {
                    bm1.m mVar2 = eVar3.f120483a;
                    eVar = u41.e.a(eVar3, bm1.m.e(mVar2, null, kh2.j.S(mVar2.f23508b), null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED), null, 2);
                }
                return g.e(it, false, eVar, null, null, true, null, false, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f71615i) {
            case 0:
                return b((g) obj);
            case 1:
                return b((g) obj);
            case 2:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.FILTER;
                return Unit.f80348a;
            case 3:
                return b((g) obj);
            case 4:
                return b((g) obj);
            default:
                ((Throwable) obj).getMessage();
                return Unit.f80348a;
        }
    }
}
