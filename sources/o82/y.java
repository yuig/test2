package o82;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Map f93747a;

    /* renamed from: b, reason: collision with root package name */
    public final qa2.j0 f93748b;

    /* renamed from: c, reason: collision with root package name */
    public final x02.x2 f93749c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f93750d;

    /* renamed from: e, reason: collision with root package name */
    public final nl1.d f93751e;

    /* renamed from: f, reason: collision with root package name */
    public final qa2.n f93752f;

    /* renamed from: g, reason: collision with root package name */
    public final h32.i0 f93753g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f93754h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f93755i;

    public y(nr0.t viewBindersMapProvider, pk.h1 reflectionBasedViewCreators, qa2.d pinGridCellFactory, nx.f0 pinalyticsFactory, x02.x2 userRepository, yk1.v viewResources, FragmentActivity activity, v2 fragment, qa2.n gridFeatureConfig, h32.i0 analyticsLoggingContext) {
        Intrinsics.checkNotNullParameter(viewBindersMapProvider, "viewBindersMapProvider");
        Intrinsics.checkNotNullParameter(reflectionBasedViewCreators, "reflectionBasedViewCreators");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(analyticsLoggingContext, "analyticsLoggingContext");
        this.f93747a = reflectionBasedViewCreators;
        this.f93748b = pinGridCellFactory;
        this.f93749c = userRepository;
        this.f93750d = activity;
        this.f93751e = fragment;
        this.f93752f = gridFeatureConfig;
        this.f93753g = analyticsLoggingContext;
        final int i13 = 0;
        final int i14 = 1;
        this.f93754h = viewBindersMapProvider.a(new uk1.d(new e3.a(5), ((nx.m) pinalyticsFactory).a(new nx.a(this) { // from class: o82.x

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f93743b;

            {
                this.f93743b = this;
            }

            @Override // nx.a
            public final h32.i0 generateLoggingContext() {
                int i15 = i13;
                y this$0 = this.f93743b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        break;
                }
                return this$0.f93753g;
            }
        }), ""), new nx.a(this) { // from class: o82.x

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f93743b;

            {
                this.f93743b = this;
            }

            @Override // nx.a
            public final h32.i0 generateLoggingContext() {
                int i15 = i14;
                y this$0 = this.f93743b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        break;
                }
                return this$0.f93753g;
            }
        }, gridFeatureConfig.f103320a, gridFeatureConfig, viewResources);
        this.f93755i = new LinkedHashMap();
    }
}
