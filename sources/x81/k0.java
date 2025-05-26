package x81;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        o0 o0Var = (o0) this.receiver;
        a.c.y(((f0) ((v) o0Var.getView())).f7());
        if (intValue == 0) {
            f0 f0Var = (f0) ((v) o0Var.getView());
            f0Var.m9();
            FragmentActivity requireActivity = f0Var.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            ny1.w.b(requireActivity);
        } else if (intValue == 1) {
            f0 f0Var2 = (f0) ((v) o0Var.getView());
            ny1.w m93 = f0Var2.m9();
            FragmentActivity requireActivity2 = f0Var2.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            ny1.w.e(m93, requireActivity2, ny1.f.f92666f, tb0.p.MEDIA_GALLERY.toString(), null, new z(f0Var2, 7), 88);
        }
        return Unit.f80348a;
    }
}
