package yb0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f138495j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f138496k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f138497l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f138498m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f138499n = new l(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138500i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f138500i = i13;
    }

    public final cm1.d b(cm1.d it) {
        switch (this.f138500i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return cm1.d.e(it, null, null, null, cm1.e.VERTICAL, null, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
            default:
                Intrinsics.checkNotNullParameter(it, "buttonGroupState");
                yl1.b f13 = yl1.b.f(it.f28012a, null, false, null, null, null, null, null, null, ga2.d.alert_view_confirm_button, null, 767);
                int i13 = ga2.d.alert_view_cancel_button;
                return cm1.d.e(it, f13, yl1.b.f(it.f28012a, null, false, null, null, yl1.i.b(), null, null, null, i13, null, 751), yl1.c.LARGE, null, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f138500i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = ga2.d.alert_view_subtitle_tv;
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER), null, null, 0, fm1.c.GONE, null, null, null, true, i13, null, null, null, null, null, false, null, null, 2094011);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096127);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138500i) {
            case 0:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return e((rn1.a) obj);
    }
}
