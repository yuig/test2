package fw1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f63052j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f63053k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f63054l = new g(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63055i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f63055i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f63055i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], kk1.d.submit), false, null, null, null, null, null, null, 0, null, 1020);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], com.pinterest.partnerAnalytics.g.chart_data_help_button), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], com.pinterest.partnerAnalytics.g.chart_data_send_feedback_button), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63055i) {
        }
        return b((yl1.b) obj);
    }
}
