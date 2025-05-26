package xb1;

import ab1.o;
import android.content.Context;
import com.pinterest.feature.settings.notifications.y0;
import h32.f1;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import qz.f0;
import sq0.c0;
import wk1.q;
import x02.x2;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends q implements com.pinterest.feature.settings.permissions.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f134500a;

    /* renamed from: b, reason: collision with root package name */
    public final x10.d f134501b;

    /* renamed from: c, reason: collision with root package name */
    public final k f134502c;

    /* renamed from: d, reason: collision with root package name */
    public final zt0.b f134503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, uk1.e pinalyticsFactory, uj2.q networkStateStream, x2 userRepository, w eventManager, x10.d settingsApi, k toastUtils) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f134500a = eventManager;
        this.f134501b = settingsApi;
        this.f134502c = toastUtils;
        this.f134503d = new zt0.b(userRepository, context);
    }

    @Override // com.pinterest.feature.settings.permissions.a
    public final void T1(int i13) {
        Object obj = this.f134503d.d().get(1);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.permissions.model.DetailsPermissionSettingsItem.MentionsControlSettingsRadioGroup");
        wb1.g gVar = (wb1.g) ((wb1.h) obj).f129019h.get(i13);
        t3(bd1.b.ALLOW_MENTIONS, Integer.valueOf(gVar.f129016h.getValue()), null, false);
        d0.v(getPinalytics(), f1.MENTION_SETTINGS_TOGGLE, null, false, 12);
        this.f134500a.d(new a(gVar.f129016h));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        d0.v(getPinalytics(), f1.MENTION_SETTINGS_VISIT, null, false, 12);
        ((wk1.i) dataSources).b(this.f134503d);
    }

    @Override // wk1.q
    /* renamed from: onBind */
    public final void r3(c0 c0Var) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) c0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }

    public final void t3(bd1.b bVar, Object obj, String str, boolean z13) {
        f0 f0Var = new f0();
        f0Var.d(obj, bVar.getValue());
        if (str != null) {
            f0Var.e("passcode", str);
        }
        f0Var.d(Boolean.valueOf(z13), "user_confirm_skip_passcode");
        new kk2.h(this.f134501b.a(f0Var.i()).r(tk2.e.f118017c).l(wj2.c.a()), new g51.h(this, 10), 1).o(new o(21, new y0(this, 15)), new o(22, new aw0.j(this, bVar, obj, str, 14)));
    }

    @Override // wk1.q, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }
}
