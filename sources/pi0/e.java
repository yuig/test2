package pi0;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.adscarousel.view.items.AdsCarouselPinItemVideoView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import qi0.h;
import wa2.m;
import yq0.z;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100180i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f100181j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f100182k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f100183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d0 d0Var, z zVar) {
        super(0);
        this.f100181j = fVar;
        this.f100182k = d0Var;
        this.f100183l = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f100180i;
        z zVar = this.f100183l;
        f fVar = this.f100181j;
        switch (i13) {
            case 0:
                if (fVar.f100189h == null) {
                    Intrinsics.r("pinItemViewFactory");
                    throw null;
                }
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j0 scope = zVar.f139760f;
                int i14 = fVar.R;
                m pinFeatureConfig = fVar.N;
                if (pinFeatureConfig == null) {
                    Intrinsics.r("pinFeatureConfig");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(scope, "scope");
                d0 pinalytics = this.f100182k;
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                return new h(context, scope, pinalytics, i14, pinFeatureConfig);
            default:
                if (fVar.f100188g == null) {
                    Intrinsics.r("videoGridCellFactory");
                    throw null;
                }
                Context context2 = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                j0 scope2 = zVar.f139760f;
                int i15 = fVar.R;
                m pinFeatureConfig2 = fVar.N;
                if (pinFeatureConfig2 == null) {
                    Intrinsics.r("pinFeatureConfig");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(context2, "context");
                d0 pinalytics2 = this.f100182k;
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                Intrinsics.checkNotNullParameter(pinFeatureConfig2, "pinFeatureConfig");
                return new AdsCarouselPinItemVideoView(context2, pinalytics2, pinFeatureConfig2, scope2, i15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, z zVar, d0 d0Var) {
        super(0);
        this.f100181j = fVar;
        this.f100183l = zVar;
        this.f100182k = d0Var;
    }
}
