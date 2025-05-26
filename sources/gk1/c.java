package gk1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f65217j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f65218k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f65219l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f65220m = new c(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c f65221n = new c(4);

    /* renamed from: o, reason: collision with root package name */
    public static final c f65222o = new c(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65223i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f65223i = i13;
    }

    public final l b(l state) {
        switch (this.f65223i) {
            case 3:
                Intrinsics.checkNotNullParameter(state, "state");
                return l.e(state, CollectionsKt.m0(new nj1.a(eo1.c.lego_corner_radius_medium), state.f65239a), null, null, 6);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return l.e(state, null, new j(oi1.j.f95310a, true), null, 5);
        }
    }

    public final x0 e(x0 it) {
        switch (this.f65223i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, false, false, false, null, 0, false, null, null, false, null, false, null, false, true, false, null, null, false, false, null, Integer.MAX_VALUE, 255);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, false, false, false, null, 0, false, null, null, false, null, false, null, false, false, false, null, null, false, false, null, -1, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65223i;
        switch (i13) {
            case 0:
                h32.h0 update = (h32.h0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = h32.u0.VIRTUAL_TRY_ON_ICON;
                        update.f67045d = null;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = h32.u0.DISABLED_VIDEO_UNMUTE_BUTTON;
                        update.f67045d = null;
                        break;
                }
                return Unit.f80348a;
            case 1:
                h32.h0 update2 = (h32.h0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = h32.u0.VIRTUAL_TRY_ON_ICON;
                        update2.f67045d = null;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = h32.u0.DISABLED_VIDEO_UNMUTE_BUTTON;
                        update2.f67045d = null;
                        break;
                }
                return Unit.f80348a;
            case 2:
                return e((x0) obj);
            case 3:
                return b((l) obj);
            case 4:
                return b((l) obj);
            default:
                return e((x0) obj);
        }
    }
}
