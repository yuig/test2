package z80;

import android.content.Context;
import ao2.j0;
import ao2.v0;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import lh0.d0;
import s80.l1;
import s80.m1;
import s80.u5;
import s80.v5;
import s80.w5;
import s80.x5;
import s80.y5;
import s80.z5;

/* loaded from: classes5.dex */
public final class x implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final x80.c f141101a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f141102b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f141103c;

    public x(x80.c onboardingDataManager, d0 experiments, Context context) {
        Intrinsics.checkNotNullParameter(onboardingDataManager, "onboardingDataManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f141101a = onboardingDataManager;
        this.f141102b = experiments;
        this.f141103c = context;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        z5 request = (z5) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u5) {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new u(this, eventIntake, null), 2);
            return;
        }
        if (request instanceof w5) {
            eventIntake.a(new m1(true));
            kotlin.jvm.internal.j.z(scope, null, null, new v(this, eventIntake, request, null), 3);
            return;
        }
        if (request instanceof v5) {
            v5 v5Var = (v5) request;
            String imageUrl = v5Var.f111830a.getImageUrl();
            t tVar = v5Var.f111830a;
            int i13 = 0;
            eventIntake.a(new l1(new CutoutModel(imageUrl, i13, 0, tVar.getShuffleItemImageId(), null, tVar.getPinId(), new MaskModel(null, null))));
            return;
        }
        if (request instanceof y5) {
            kotlin.jvm.internal.j.z(scope, null, null, new w(request, eventIntake, null), 3);
            return;
        }
        if (request instanceof x5) {
            x80.c cVar = this.f141101a;
            cVar.getClass();
            rg0.n b13 = ((dh0.d) cVar.f134161a).b(y0.COLLAGE_COMPOSER);
            if (b13 != null) {
                b13.a(null, null);
            }
        }
    }
}
