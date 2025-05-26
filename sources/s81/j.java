package s81;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m81.q;
import ny1.w;
import u81.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        p pVar = (p) this.receiver;
        a.c.y(((r) ((q) pVar.getView())).f7());
        if (intValue == 0) {
            r rVar = (r) ((q) pVar.getView());
            rVar.o9();
            FragmentActivity requireActivity = rVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            w.b(requireActivity);
            rVar.f121088s1 = true;
        } else if (intValue == 1) {
            r rVar2 = (r) ((q) pVar.getView());
            w o93 = rVar2.o9();
            FragmentActivity requireActivity2 = rVar2.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            w.e(o93, requireActivity2, ny1.f.f92666f, tb0.p.MEDIA_GALLERY.toString(), null, new u81.n(rVar2, 9), 88);
        }
        return Unit.f80348a;
    }
}
