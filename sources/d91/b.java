package d91;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.f0;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f54047b;

    public /* synthetic */ b(e eVar, int i13) {
        this.f54046a = i13;
        this.f54047b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f54046a;
        int i14 = 1;
        e this$0 = this.f54047b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                a91.b bVar = this$0.f54065i;
                if (bVar != null) {
                    e eVar = (e) bVar.getView();
                    Context context = eVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (bs1.c.c1(context)) {
                        Context context2 = eVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        Activity k03 = bs1.c.k0(context2);
                        d0 d0Var = eVar.f54059c;
                        if (d0Var != null) {
                            c91.e eVar2 = eVar.f54060d;
                            if (eVar2 == null) {
                                Intrinsics.r("onDemandModuleControllerFactory");
                                throw null;
                            }
                            eVar2.a(k03, d0Var).a(new d(eVar, i14), null, c91.a.f26973a);
                        }
                    }
                    bVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0.TAP_TO_TRY_ON_INLINE, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : bVar.f1567a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context3 = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                if (bs1.c.c1(context3)) {
                    Context context4 = this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    Activity k04 = bs1.c.k0(context4);
                    d0 pinalytics = this$0.f54059c;
                    if (pinalytics == null) {
                        return;
                    }
                    q qVar = this$0.f54063g;
                    if (qVar == null) {
                        Intrinsics.r("prefsManagerPersisted");
                        throw null;
                    }
                    if (!f0.n0(k04, "android.permission.CAMERA", true, qVar)) {
                        this$0.a();
                        return;
                    }
                    Context context5 = this$0.getContext();
                    if (context5 != null) {
                        Intrinsics.checkNotNullParameter(context5, "context");
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        pinalytics.X(u0.LENS_PERMISSION_SETTINGS_BUTTON);
                        String[] strArr = qy1.d.f105359a;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context5.getPackageName(), null));
                        intent.addFlags(268435456);
                        context5.startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                a91.b bVar2 = this$0.f54065i;
                if (bVar2 == null || !bVar2.f1568b) {
                    return;
                }
                bVar2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_ICON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : bVar2.f1567a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                x81.k kVar = ((e) bVar2.getView()).f54066j;
                if (kVar != null) {
                    kVar.pauseCamera();
                }
                bVar2.p3();
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                a91.b bVar3 = this$0.f54065i;
                if (bVar3 != null) {
                    bVar3.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0.CLOSE_INLINE_VTO, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : bVar3.f1567a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    e eVar3 = (e) bVar3.getView();
                    x81.k kVar2 = eVar3.f54066j;
                    if (kVar2 != null) {
                        kVar2.pauseCamera();
                    }
                    Object obj = eVar3.f54066j;
                    View view2 = obj instanceof View ? (View) obj : null;
                    if (view2 != null && Intrinsics.d(view2.getParent(), eVar3)) {
                        eVar3.removeView(view2);
                    }
                    LinearLayout linearLayout = eVar3.f54070n;
                    if (linearLayout != null && Intrinsics.d(linearLayout.getParent(), eVar3)) {
                        eVar3.removeView(linearLayout);
                    }
                    bs1.c.R1(eVar3.f54069m, false);
                    bs1.c.R1(eVar3.f54068l, true);
                    return;
                }
                return;
        }
    }
}
