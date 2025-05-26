package ec1;

import android.os.Handler;
import ap.o;
import h32.f1;
import i92.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.r3;
import m60.w;
import qz.f0;
import sq0.c0;
import va1.m1;
import wk1.q;
import x02.x2;
import yk1.v;

/* loaded from: classes5.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final w f58423a;

    /* renamed from: b, reason: collision with root package name */
    public final k f58424b;

    /* renamed from: c, reason: collision with root package name */
    public final v f58425c;

    /* renamed from: d, reason: collision with root package name */
    public final o f58426d;

    /* renamed from: e, reason: collision with root package name */
    public final x10.d f58427e;

    /* renamed from: f, reason: collision with root package name */
    public final oc.c f58428f;

    /* renamed from: g, reason: collision with root package name */
    public final kc2.a f58429g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f58430h;

    /* renamed from: i, reason: collision with root package name */
    public final String f58431i;

    /* renamed from: j, reason: collision with root package name */
    public final dc1.c f58432j;

    /* renamed from: k, reason: collision with root package name */
    public final i f58433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d pinalytics, uj2.q networkStateStream, w eventManager, k toastUtils, yk1.a viewResources, x2 userRepository, o uploadContactsUtil, x10.d settingsApi, vb0.c applicationUtils, oc.c apolloClient, cr1.a accountService, r3 experiments, kc2.a videoPreferences) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        this.f58423a = eventManager;
        this.f58424b = toastUtils;
        this.f58425c = viewResources;
        this.f58426d = uploadContactsUtil;
        this.f58427e = settingsApi;
        this.f58428f = apolloClient;
        this.f58429g = videoPreferences;
        this.f58430h = new Handler();
        this.f58431i = applicationUtils.a();
        this.f58432j = new dc1.c(userRepository, uploadContactsUtil, viewResources, accountService, experiments);
        this.f58433k = new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static void u3(j jVar, String str, m1 m1Var, boolean z13, f1 f1Var, int i13, String str2, boolean z14, Function1 function1, int i14) {
        String str3 = (i14 & 32) != 0 ? null : str2;
        boolean z15 = (i14 & 64) != 0 ? false : z14;
        jVar.getClass();
        boolean z16 = m1Var.f125210e;
        m1Var.f125210e = z13;
        f0 f0Var = new f0();
        int i15 = 1;
        f0Var.e(str, String.valueOf((int) (Intrinsics.d(str, "ccpa_opted_out") ? !z13 ? 1 : 0 : z13)));
        f0Var.d(Boolean.valueOf(z15), "user_confirm_skip_passcode");
        if (str3 != null) {
            f0Var.e("passcode", str3);
        }
        new kk2.g(jVar.f58427e.a(f0Var.i()).l(wj2.c.a()).r(tk2.e.f118017c), new a(0, new b(jVar, i15)), 2).o(new a(1, new e(str, z13, jVar, f1Var, i13, function1)), new a(2, new h(function1, jVar, m1Var, z16, str, z13, f1Var, i13)));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f58432j);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((fc1.e) ((com.pinterest.feature.settings.privacydata.a) getView())).K0 = null;
        this.f58423a.j(this.f58433k);
        super.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.settings.privacydata.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        fc1.e eVar = (fc1.e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.K0 = this;
        this.f58423a.h(this.f58433k);
    }
}
