package ls0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.c2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.g0;
import h32.u0;
import j1.p0;
import j1.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lh0.l1;
import lq0.g1;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import ny1.o;
import ny1.q;
import ny1.t;
import ny1.w;
import x02.i2;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f84667a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84668b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f84669c;

    /* renamed from: d, reason: collision with root package name */
    public final jo1.a f84670d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f84671e;

    /* renamed from: f, reason: collision with root package name */
    public final l20.b f84672f;

    /* renamed from: g, reason: collision with root package name */
    public final w f84673g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f84674h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.w f84675i;

    /* renamed from: j, reason: collision with root package name */
    public final d f84676j;

    /* renamed from: k, reason: collision with root package name */
    public final vy.m f84677k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f84678l;

    /* renamed from: m, reason: collision with root package name */
    public final iv1.b f84679m;

    /* renamed from: n, reason: collision with root package name */
    public final k22.m f84680n;

    /* renamed from: o, reason: collision with root package name */
    public final l1 f84681o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84682p;

    /* renamed from: q, reason: collision with root package name */
    public final ms0.b f84683q;

    public n(String pinUid, String str, d0 pinalytics, jo1.a fragmentType, i2 pinRepository, l20.b imageDownloadService, w permissionsManager, i92.k toastUtils, m60.w eventManager, d gridActionUtils, vy.m analyticsApi, b60.a activeUidProvider, c2 sharesheetUtils, iv1.b nrtAutoOrgHelper, k22.m userService, l1 experiments) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(imageDownloadService, "imageDownloadService");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(gridActionUtils, "gridActionUtils");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUidProvider, "activeUidProvider");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(nrtAutoOrgHelper, "nrtAutoOrgHelper");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f84667a = pinUid;
        this.f84668b = str;
        this.f84669c = pinalytics;
        this.f84670d = fragmentType;
        this.f84671e = pinRepository;
        this.f84672f = imageDownloadService;
        this.f84673g = permissionsManager;
        this.f84674h = toastUtils;
        this.f84675i = eventManager;
        this.f84676j = gridActionUtils;
        this.f84677k = analyticsApi;
        this.f84678l = sharesheetUtils;
        this.f84679m = nrtAutoOrgHelper;
        this.f84680n = userService;
        this.f84681o = experiments;
        String g13 = ((b60.d) activeUidProvider).g();
        this.f84682p = g13 == null ? "" : g13;
        this.f84683q = new ms0.b();
    }

    public final void a(Context context, Activity activity, Function1 downloadDisposableListener, Function0 dismissModal) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(downloadDisposableListener, "downloadDisposableListener");
        Intrinsics.checkNotNullParameter(dismissModal, "dismissModal");
        if (Build.VERSION.SDK_INT >= 34) {
            b(context, downloadDisposableListener, dismissModal);
            return;
        }
        this.f84673g.c(activity, ny1.e.f92665f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? o.f92679j : null, q.f92690k, t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? t.f92700k : new yq0.k(this, 21), (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? t.f92702m : null, (r23 & 1024) != 0 ? t.f92703n : new v0(this, context, downloadDisposableListener, dismissModal, 13));
    }

    public final void b(Context context, Function1 function1, Function0 function0) {
        u0 u0Var = u0.PIN_DOWNLOAD_BUTTON;
        g0 g0Var = g0.OVERFLOW_MENU;
        d0 d0Var = this.f84669c;
        String str = this.f84667a;
        d0Var.b0(u0Var, g0Var, str, false);
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        function1.invoke(new kk2.m(this.f84671e.L(str).s(), new wr0.l(14, new p0(function0, j0Var, this, j0Var2, 22)), 0).l(tk2.e.f118017c).k(new wr0.l(15, j.f84655j)).l(wj2.c.a()).o(new fs0.q(21, new p0(j0Var, j0Var2, this, context, 23)), new fs0.q(22, new g1(14, this, j0Var2))));
    }
}
