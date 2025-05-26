package rh1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/s0;", "Lrh1/h2;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s0 extends a1 {

    /* renamed from: t1, reason: collision with root package name */
    public static final /* synthetic */ int f108287t1 = 0;

    @Override // rh1.h2, yq0.t, ml1.q
    public final void k5() {
        Navigation navigation = this.I;
        if (Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_COMMENT_IS_HIDDEN", false)) : null, Boolean.TRUE)) {
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(getResources().getString(ob2.f.comment_is_hidden_message));
        }
        super.k5();
    }

    @Override // rh1.k, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().d(new fd1.a());
        super.onDestroyView();
    }

    @Override // rh1.k, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        fo1.a i73 = i7();
        if (i73 != null) {
            rm1.q qVar = rm1.q.CANCEL;
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            Context context = gestaltToolbarImpl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Context context2 = gestaltToolbarImpl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
            gestaltToolbarImpl.setBackground(null);
            Drawable l23 = bs1.c.l2(gestaltToolbarImpl, drawableRes, eo1.b.color_themed_text_default);
            String string = getString(m60.x0.cancel);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gestaltToolbarImpl.T(l23, string);
            gestaltToolbarImpl.m();
        }
        View findViewById = v13.findViewById(ob2.c.comments_feed_linear_layout);
        findViewById.setClickable(true);
        findViewById.setBackground(bs1.c.f0(findViewById, eo1.d.lego_card_rounded_top, null, null, 6));
        int W = bs1.c.W(findViewById, eo1.c.lego_spacing_horizontal_small);
        findViewById.setPaddingRelative(W, 0, W, 0);
        Navigation navigation = this.I;
        if (navigation != null && navigation.w("com.pinterest.EXTRA_COMMENT_MODAL_WIDTH") && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.width = navigation.J1("com.pinterest.EXTRA_COMMENT_MODAL_WIDTH");
        }
        v13.setOnClickListener(new we1.a2(this, 18));
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
    }
}
