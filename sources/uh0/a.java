package uh0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.fy;
import com.pinterest.api.model.jy;
import com.pinterest.api.model.ny;
import com.pinterest.api.model.yy;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t3;
import com.pinterest.ui.view.NoticeView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import jc0.s;
import jc0.v;
import kh2.n3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ku1.l;
import m60.u;
import m60.w;
import nx.d0;
import rg0.n;
import vb0.j;
import vh0.d;
import ye1.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f122241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f122242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f122243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f122244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f122245f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, HashMap hashMap, int i13) {
        this.f122240a = i13;
        this.f122242c = obj;
        this.f122243d = obj2;
        this.f122244e = obj3;
        this.f122245f = obj4;
        this.f122241b = hashMap;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ny e13;
        int i13 = this.f122240a;
        yy yyVar = null;
        HashMap auxData = this.f122241b;
        Object obj = this.f122245f;
        Object obj2 = this.f122244e;
        Object obj3 = this.f122243d;
        Object obj4 = this.f122242c;
        switch (i13) {
            case 0:
                Function0 onInviteButtonClicked = (Function0) obj4;
                w eventManager = (w) obj3;
                sh0.a survey = (sh0.a) obj2;
                n exp = (n) obj;
                Intrinsics.checkNotNullParameter(onInviteButtonClicked, "$onInviteButtonClicked");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                Intrinsics.checkNotNullParameter(survey, "$survey");
                Intrinsics.checkNotNullParameter(exp, "$exp");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                onInviteButtonClicked.invoke();
                eventManager.d(new s());
                eventManager.d(new v(new d(survey, exp, auxData), false, 0L, 30));
                return;
            case 1:
                e this$0 = (e) obj4;
                String str2 = (String) obj3;
                HashMap hashMap = (HashMap) obj2;
                d0 d0Var = (d0) obj;
                int i14 = e.f138849h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (d0Var != null) {
                    d0Var.h(this$0.f138850d, this$0.f138851e, hashMap);
                }
                if (str2 == null) {
                    this$0.getClass();
                    return;
                }
                l lVar = this$0.f138852f;
                if (lVar == null) {
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
                Context context = this$0.getContext();
                Intrinsics.f(context);
                l.b(lVar, context, str2, true, false, null, this.f122241b, 64);
                return;
            default:
                d0 pinalytics = (d0) obj4;
                NoticeView this$02 = (NoticeView) obj3;
                fy action = (fy) obj2;
                LinearLayout this_apply = (LinearLayout) obj;
                int i15 = NoticeView.f52709r;
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(action, "$action");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                HashMap hashMap2 = new HashMap();
                if (auxData != null) {
                    hashMap2.putAll(auxData);
                }
                jy d2 = action.d();
                if (d2 == null || (str = d2.g()) == null) {
                    str = "Missing";
                }
                hashMap2.put("url", str);
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NOTICE_ACTION_BUTTON, (r18 & 4) != 0 ? null : g0.NOTICE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap2, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$02.k(pinalytics, "client.events.searchAdvisories.action", hashMap2);
                jy d13 = action.d();
                String g13 = d13 != null ? d13.g() : null;
                if (g13 == null) {
                    g13 = "";
                }
                if (StringsKt.L(g13, "pinterest:", 0, false, 6) > -1) {
                    if (!n3.u0(g13)) {
                        j.f125466a.G("Flow key not supported", new Object[0]);
                        return;
                    }
                    w wVar = u.f85943a;
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) t3.f51396b.getValue());
                    jy d14 = action.d();
                    if (d14 != null && (e13 = d14.e()) != null) {
                        yyVar = e13.d();
                    }
                    w13.y0(yyVar, "com.pinterest.EXTRA_GOLD_STANDARD_CONTENT");
                    wVar.d(w13);
                    return;
                }
                if (StringsKt.L(g13, "tel:", 0, false, 6) > -1) {
                    Context context2 = this_apply.getContext();
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(g13));
                    Object obj5 = d5.a.f53679a;
                    context2.startActivity(intent, null);
                    return;
                }
                if (StringsKt.L(g13, "sms:", 0, false, 6) <= -1) {
                    this$02.j(g13);
                    return;
                }
                Context context3 = this_apply.getContext();
                Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse(g13));
                Object obj6 = d5.a.f53679a;
                context3.startActivity(intent2, null);
                return;
        }
    }

    public /* synthetic */ a(e eVar, String str, HashMap hashMap, HashMap hashMap2, d0 d0Var) {
        this.f122240a = 1;
        this.f122242c = eVar;
        this.f122243d = str;
        this.f122241b = hashMap;
        this.f122244e = hashMap2;
        this.f122245f = d0Var;
    }
}
