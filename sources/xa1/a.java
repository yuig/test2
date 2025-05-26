package xa1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.components.users.LegoUserRep;
import h32.d4;
import h32.i0;
import j1.v0;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.t0;
import m60.x0;
import pk.a0;

/* loaded from: classes5.dex */
public final class a extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final jf2.c f134433a;

    public a(jf2.c accountSwitcherUiManager) {
        Intrinsics.checkNotNullParameter(accountSwitcherUiManager, "accountSwitcherUiManager");
        this.f134433a = accountSwitcherUiManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.p(context.getString(x0.setting_screen_switch_account));
        LinearLayout multiUserAccountContainer = new LinearLayout(context);
        multiUserAccountContainer.setId(c52.c.account_switcher_modal_container);
        Resources resources = multiUserAccountContainer.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        multiUserAccountContainer.setPadding(K, K, K, K);
        multiUserAccountContainer.setOrientation(1);
        modalViewWrapper.t(multiUserAccountContainer);
        jf2.c cVar = this.f134433a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiUserAccountContainer, "multiUserAccountContainer");
        Object obj = ((wk2.a) cVar.f75873b).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        for (mr1.h hVar : com.bumptech.glide.c.a0((UserDeserializer) obj)) {
            wy0 wy0Var = hVar.f88089b;
            LegoUserRep legoUserRep = new LegoUserRep(context);
            legoUserRep.y1(ze0.a.List);
            legoUserRep.M1(vn1.h.f126278d);
            oa2.t.i4(legoUserRep, dl2.b.j1(wy0Var), 0, null, 14);
            legoUserRep.t0(false);
            legoUserRep.r0(false);
            rl1.g a13 = rl1.g.a(rl1.n.f(context), 0, null, new rl1.o(eo1.b.color_themed_background_elevation_floating, 3), null, null, wy0Var.q2(), 3055);
            rl1.a R0 = m0.R0(wy0Var, new yk1.a(context.getResources(), context.getTheme()), false);
            GestaltAvatar gestaltAvatar = legoUserRep.f52345e;
            pe.i.w1(gestaltAvatar, a13);
            pe.i.v1(gestaltAvatar, R0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Resources resources2 = context.getResources();
            Intrinsics.f(resources2);
            layoutParams.topMargin = a0.L(resources2, 4.0f);
            layoutParams.bottomMargin = a0.L(resources2, 4.0f);
            if (hVar.a()) {
                layoutParams.setMarginStart(a0.L(resources2, 16.0f));
            }
            legoUserRep.setLayoutParams(layoutParams);
            String uid = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            wy0 f13 = ((b60.d) ((b60.b) cVar.f75874c)).f();
            if (Intrinsics.d(uid, f13 != null ? f13.getUid() : null)) {
                ViewGroup.LayoutParams layoutParams2 = legoUserRep.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.weight = 1.0f;
                legoUserRep.setLayoutParams(layoutParams3);
                View view = new View(context);
                int W = bs1.c.W(view, r0.thumbnail_xsmall_size);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(W, W);
                layoutParams4.gravity = 16;
                view.setLayoutParams(layoutParams4);
                view.setBackground(bs1.c.f0(view, sm1.b.ic_check_gestalt, Integer.valueOf(eo1.b.color_gray_500), null, 4));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(legoUserRep);
                linearLayout.addView(view);
                legoUserRep = linearLayout;
            } else {
                legoUserRep.z1(new v0(cVar, context, hVar, wy0Var, 4));
            }
            legoUserRep.setId(t0.account_switcher_row_container);
            multiUserAccountContainer.addView(legoUserRep);
        }
        return modalViewWrapper;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.ACCOUNT_SWITCHER, null, null, null, null, null);
    }
}
