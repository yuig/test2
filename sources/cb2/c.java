package cb2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.v7;
import com.pinterest.ui.menu.ContextMenuItemView;
import com.pinterest.ui.menu.ContextMenuView;
import com.pinterest.ui.text.IconView;
import e82.h0;
import et1.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o0;
import lh0.z3;
import m60.x0;
import nx.d0;
import so.c4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f27298a;

    /* renamed from: b, reason: collision with root package name */
    public final c4 f27299b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f27300c;

    /* renamed from: d, reason: collision with root package name */
    public final c2 f27301d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f27302e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f27303f;

    /* renamed from: g, reason: collision with root package name */
    public v7 f27304g;

    public c(d0 topLevelPinalytics, c4 shareSheetIconOnClickListenerFactory, m60.w eventManager, c2 sharesheetUtils, h0 socialUtils, o0 experiments) {
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(shareSheetIconOnClickListenerFactory, "shareSheetIconOnClickListenerFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f27298a = topLevelPinalytics;
        this.f27299b = shareSheetIconOnClickListenerFactory;
        this.f27300c = eventManager;
        this.f27301d = sharesheetUtils;
        this.f27302e = socialUtils;
        this.f27303f = experiments;
    }

    public final ArrayList a(ContextMenuView contextMenuView, List list) {
        String str;
        o0 o0Var;
        String str2;
        ArrayList arrayList = new ArrayList();
        LayoutInflater from = LayoutInflater.from(contextMenuView.getContext());
        v7 v7Var = this.f27304g;
        if (v7Var == null) {
            Intrinsics.r("board");
            throw null;
        }
        o0 experiments = this.f27303f;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        boolean z13 = !experiments.b("enabled_3", a4.f83298b);
        if (kh2.d.M0(v7Var) || kh2.d.A0(v7Var) || list == null || !z13) {
            str = "getContext(...)";
            o0Var = experiments;
        } else {
            Intrinsics.f(from);
            Context context = contextMenuView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SendableObject sendableObject = new SendableObject(v7Var);
            int value = y32.f.BOARD_LONGPRESS.value();
            v7 v7Var2 = this.f27304g;
            if (v7Var2 == null) {
                Intrinsics.r("board");
                throw null;
            }
            str = "getContext(...)";
            o0Var = experiments;
            ContextMenuItemView V = ig1.b.V(from, context, sendableObject, this.f27298a, list, this.f27299b, value, this.f27303f, this.f27301d, v7Var2, null);
            if (V != null) {
                arrayList.add(V);
            } else if (ig1.b.c1(o0Var) && !kh2.d.M0(v7Var) && !kh2.d.A0(v7Var)) {
                arrayList.add(b(from));
            }
        }
        boolean z14 = !ig1.b.c1(o0Var);
        if (!kh2.d.M0(v7Var) && !kh2.d.A0(v7Var) && z14) {
            Intrinsics.f(from);
            arrayList.add(b(from));
        }
        if (kh2.w.i0(v7Var)) {
            Intrinsics.f(from);
            View inflate = from.inflate(wc0.d.contextmenu_item, (ViewGroup) null);
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
            ContextMenuItemView contextMenuItemView = (ContextMenuItemView) inflate;
            contextMenuItemView.setContentDescription(contextMenuItemView.getResources().getString(x0.icon_edit));
            rm1.q qVar = rm1.q.EDIT;
            Context context2 = contextMenuItemView.getContext();
            str2 = str;
            Intrinsics.checkNotNullExpressionValue(context2, str2);
            contextMenuItemView.j(qVar.drawableRes(context2));
            contextMenuItemView.l(x0.contextmenu_edit);
            contextMenuItemView.setVisibility(4);
            contextMenuItemView.setOnClickListener(new a(this, 0));
            if (o0Var.d() || c()) {
                ig1.b.o1(contextMenuItemView);
            }
            arrayList.add(contextMenuItemView);
        } else {
            str2 = str;
        }
        if (kh2.w.i0(v7Var) && !kh2.d.A0(v7Var)) {
            Intrinsics.f(from);
            View inflate2 = from.inflate(wc0.d.contextmenu_item, (ViewGroup) null);
            Intrinsics.g(inflate2, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
            ContextMenuItemView contextMenuItemView2 = (ContextMenuItemView) inflate2;
            contextMenuItemView2.setContentDescription(contextMenuItemView2.getResources().getString(x0.icon_reorder));
            rm1.q qVar2 = rm1.q.ARROWS_VERTICAL;
            Context context3 = contextMenuItemView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, str2);
            contextMenuItemView2.j(qVar2.drawableRes(context3));
            contextMenuItemView2.l(x0.contextmenu_reorder);
            contextMenuItemView2.setVisibility(4);
            contextMenuItemView2.setOnClickListener(new a(this, 2));
            if (o0Var.d() || c()) {
                ig1.b.o1(contextMenuItemView2);
            }
            arrayList.add(contextMenuItemView2);
        }
        return arrayList;
    }

    public final ContextMenuItemView b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(wc0.d.contextmenu_item, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
        ContextMenuItemView contextMenuItemView = (ContextMenuItemView) inflate;
        rm1.q qVar = rm1.q.ANDROID_SHARE;
        Context context = contextMenuItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable l23 = bs1.c.l2(contextMenuItemView, qVar.drawableRes(context), eo1.b.color_gray_700);
        IconView iconView = contextMenuItemView.f52588k;
        if (iconView != null) {
            iconView.setImageDrawable(l23);
        }
        IconView iconView2 = contextMenuItemView.f52588k;
        contextMenuItemView.f52593p = iconView2 != null ? iconView2.getDrawable() : null;
        contextMenuItemView.n();
        contextMenuItemView.setContentDescription(contextMenuItemView.getResources().getString(x0.icon_send));
        contextMenuItemView.l(x0.contextmenu_send);
        contextMenuItemView.setVisibility(4);
        contextMenuItemView.setOnClickListener(new a(this, 1));
        if (this.f27303f.d() || c()) {
            ig1.b.o1(contextMenuItemView);
        }
        return contextMenuItemView;
    }

    public final boolean c() {
        o0 o0Var = this.f27303f;
        o0Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) o0Var.f83446a;
        return g1Var.o("android_ctx_long_press_cleanup_animation", "enabled", z3Var) || g1Var.l("android_ctx_long_press_cleanup_animation");
    }

    public final void d(ContextMenuView menu, m10.d event, String apiTag) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(apiTag, "apiTag");
        dl1.s sVar = event.f85658b;
        if (sVar == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(sVar, "getModel(...)");
        v7 v7Var = (v7) sVar;
        this.f27304g = v7Var;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("board_id", v7Var.getUid());
        v7 v7Var2 = this.f27304g;
        if (v7Var2 == null) {
            Intrinsics.r("board");
            throw null;
        }
        pairArr[1] = new Pair("board_pin_count", String.valueOf(v7Var2.l1().intValue()));
        HashMap o13 = bs1.c.o(pairArr);
        v7 v7Var3 = this.f27304g;
        if (v7Var3 == null) {
            Intrinsics.r("board");
            throw null;
        }
        if (!kh2.d.M0(v7Var3)) {
            v7 v7Var4 = this.f27304g;
            if (v7Var4 == null) {
                Intrinsics.r("board");
                throw null;
            }
            if (!kh2.d.A0(v7Var4)) {
                Context context = menu.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                h0 h0Var = this.f27302e;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                h0Var.e(context, h0Var.f(), null).r(tk2.e.f118017c).l(wj2.c.a()).o(new ua2.v(3, new t0(this, menu, event, o13, 4)), new ua2.v(4, b.f27292j));
                return;
            }
        }
        menu.a(a(menu, null));
        Intrinsics.checkNotNullParameter(event, "event");
        menu.f52621s = o13;
        menu.n(event, null);
    }
}
