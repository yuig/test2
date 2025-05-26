package r02;

import com.pinterest.api.model.mj;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105756i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mj f105757j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RVCSectionItemView f105758k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mj mjVar, RVCSectionItemView rVCSectionItemView) {
        super(1);
        this.f105757j = mjVar;
        this.f105758k = rVCSectionItemView;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f105756i;
        RVCSectionItemView rVCSectionItemView = this.f105758k;
        mj mjVar = this.f105757j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Double F = mjVar.F();
                Intrinsics.checkNotNullExpressionValue(F, "getDateOfEnforcement(...)");
                double doubleValue = F.doubleValue();
                int i14 = RVCSectionItemView.f50428l;
                rVCSectionItemView.getClass();
                String format = new SimpleDateFormat("MMM d, yyyy").format(Double.valueOf(doubleValue * 1000));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return rn1.a.y(it, bs1.c.h2(format), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, q02.b.a(mjVar) ? bs1.c.h2(bs1.c.f2(rVCSectionItemView, h02.e.rvc_appeal_in_progress)) : bs1.c.h2(bs1.c.f2(rVCSectionItemView, h02.e.rvc_appeal_reviewed)), null, null, kotlin.collections.e0.b(vn1.e.BOLD), null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097078);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f105756i) {
        }
        return b((rn1.a) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(RVCSectionItemView rVCSectionItemView, mj mjVar) {
        super(1);
        this.f105758k = rVCSectionItemView;
        this.f105757j = mjVar;
    }
}
