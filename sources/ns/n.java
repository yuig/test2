package ns;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import we1.q0;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91941i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f91942j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, int i13) {
        super(0);
        this.f91941i = i13;
        this.f91942j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f91941i;
        r rVar = this.f91942j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(rVar.f76941e);
            case 1:
                Context context = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                b bVar = new b(context);
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                bVar.setPaddingRelative(dl2.b.G0(bVar, eo1.a.item_horizontal_spacing), bVar.getResources().getDimensionPixelSize(eo1.c.space_400), dl2.b.G0(bVar, eo1.a.item_horizontal_spacing), bVar.getResources().getDimensionPixelSize(eo1.c.space_400));
                q0 q0Var = new q0(0.444f, 4, context);
                u50.e imageBgColor = new u50.e(eo1.a.sema_color_background_secondary_default);
                Intrinsics.checkNotNullParameter(imageBgColor, "imageBgColor");
                we1.p0 p0Var = q0Var.f129558f;
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(imageBgColor, "imageBgColor");
                Iterator it = p0Var.f129542b.iterator();
                while (it.hasNext()) {
                    bb2.j jVar = (bb2.j) it.next();
                    Context context2 = p0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    jVar.setBackgroundColor(((Number) imageBgColor.a(context2)).intValue());
                }
                bVar.addView(q0Var);
                return bVar;
            default:
                uk1.e eVar = rVar.F0;
                if (eVar != null) {
                    return ((uk1.a) eVar).f(rVar.s7(), "");
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
        }
    }
}
