package lh1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ao2.j0;
import ao2.v0;
import com.pinterest.feature.unauth.sba.f0;
import com.pinterest.feature.unauth.sba.g0;
import com.pinterest.feature.unauth.sba.h0;
import com.pinterest.feature.unauth.sba.i0;
import ho2.q;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import u50.r;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final n82.b f83525a;

    /* renamed from: b, reason: collision with root package name */
    public lu1.b f83526b;

    public d(n82.b currentActivityProvider) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f83525a = currentActivityProvider;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        com.pinterest.feature.unauth.sba.j0 request = (com.pinterest.feature.unauth.sba.j0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof g0)) {
            if (request instanceof f0) {
                f fVar = v0.f20219a;
                j.z(scope, q.f69782a, null, new b(this, null), 2);
                return;
            } else if (!(request instanceof h0)) {
                boolean z13 = request instanceof i0;
                return;
            } else {
                f fVar2 = v0.f20219a;
                j.z(scope, q.f69782a, null, new c(this, null), 2);
                return;
            }
        }
        lu1.b bVar = this.f83526b;
        if (bVar == null) {
            Intrinsics.r("baseActivityHelper");
            throw null;
        }
        g0 g0Var = (g0) request;
        Activity activity = bs1.c.k0(g0Var.f48819b);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent b13 = ((lu1.c) bVar).f84972b.b(activity, lu1.a.WEB_VIEW_ACTIVITY);
        b13.setData(Uri.parse(g0Var.f48818a));
        b13.putExtra("com.pinterest.EXTRA_HAS_URL", true);
        b13.putExtra("com.pinterest.EXTRA_IS_UNAUTH", true);
        b13.putExtra("com.pinterest.EXTRA_IS_PRELOAD_EXPERIENCE", true);
        activity.startActivity(b13);
    }
}
