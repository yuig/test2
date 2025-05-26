package uv0;

import android.graphics.PointF;
import android.view.View;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.mw0;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.nw0;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.ow0;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.pw0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.qw0;
import com.pinterest.api.model.rw0;
import com.pinterest.api.model.sw0;
import com.pinterest.api.model.tq;
import java.util.Set;
import kh2.g3;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f123182a;

    static {
        l0 l0Var = k0.f80436a;
        f123182a = h1.f(l0Var.b(nq.class), l0Var.b(oq.class), l0Var.b(lq.class), l0Var.b(mq.class), l0Var.b(pq.class), l0Var.b(jq.class), l0Var.b(kq.class));
    }

    public static final void a(View view, boolean z13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z13 ? 0 : 8);
        for (sw0 sw0Var : sw0.values()) {
            int i13 = o.f123181a[sw0Var.ordinal()];
            if (i13 == 1) {
                view.setAlpha(1.0f);
            } else if (i13 == 2) {
                view.setTranslationX(0.0f);
            } else if (i13 == 3) {
                view.setTranslationY(0.0f);
            } else if (i13 == 4) {
                view.setScaleX(1.0f);
            } else if (i13 == 5) {
                view.setScaleY(1.0f);
            }
        }
    }

    public static final void b(View view, long j13, tq durationConfig, pu0.k transitionConfig) {
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(transitionConfig, "transitionConfig");
        if (view == null) {
            return;
        }
        rw0 o23 = g3.o2(j13, durationConfig.getStartTimeMs(), durationConfig.getEndTimeMs(), 250L);
        if (Intrinsics.d(o23, nw0.f40522a) || Intrinsics.d(o23, mw0.f40247a)) {
            a(view, false);
            return;
        }
        boolean z13 = o23 instanceof pw0;
        PointF pointF = transitionConfig.f101397b;
        if (z13) {
            transitionConfig.f101398c.getSpec().viewTransformations(view, (pw0) o23, pointF);
        } else if (Intrinsics.d(o23, ow0.f40826a)) {
            a(view, true);
        } else if (o23 instanceof qw0) {
            transitionConfig.f101399d.getSpec().viewTransformations(view, (qw0) o23, pointF);
        }
    }

    public static final boolean c(qq qqVar) {
        if (qqVar != null) {
            if (f123182a.contains(k0.f80436a.b(qqVar.getClass()))) {
                return true;
            }
        }
        return false;
    }
}
