package we1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;

/* loaded from: classes5.dex */
public final class u2 extends GridLayout implements u, nx.v, n0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f129633l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ao2.j0 f129634a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f129635b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f129636c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.w f129637d;

    /* renamed from: e, reason: collision with root package name */
    public final v2 f129638e;

    /* renamed from: f, reason: collision with root package name */
    public final gi2.b f129639f;

    /* renamed from: g, reason: collision with root package name */
    public final pb0.d f129640g;

    /* renamed from: h, reason: collision with root package name */
    public final g70.h f129641h;

    /* renamed from: i, reason: collision with root package name */
    public final f4 f129642i;

    /* renamed from: j, reason: collision with root package name */
    public final x21.g f129643j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f129644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context, ao2.j0 scope, uk1.d presenterPinalytics, b60.b activeUserManager, m60.w eventManager, v2 params, gi2.b boardRepItemViewBinderProvider, pb0.d fuzzyDateFormatter, g70.h boardNavigator, f4 experiments) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(boardRepItemViewBinderProvider, "boardRepItemViewBinderProvider");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f129634a = scope;
        this.f129635b = presenterPinalytics;
        this.f129636c = activeUserManager;
        this.f129637d = eventManager;
        this.f129638e = params;
        this.f129639f = boardRepItemViewBinderProvider;
        this.f129640g = fuzzyDateFormatter;
        this.f129641h = boardNavigator;
        this.f129642i = experiments;
        this.f129644k = new ArrayList();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (Intrinsics.d(params.f129658i, Boolean.TRUE)) {
            layoutParams.gravity = 17;
        }
        setLayoutParams(layoutParams);
        int i13 = params.f129654e;
        setPaddingRelative(i13, 0, i13, 0);
        setColumnCount(params.f129653d);
        x21.h m13 = pe.i.m1(params.f129656g);
        if (m13 != null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            this.f129643j = new x21.g(this, new x21.a(this), m13, params.f129657h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x059a  */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, com.pinterest.component.board.view.LegoBoardRep] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, we1.c] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View, xo0.v] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.View, com.pinterest.feature.following.carousel.view.ImpressionableUserRep, com.pinterest.ui.components.users.LegoUserRep] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View, we1.r0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews.BoardMoreIdeasUpsellListItemView] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.view.View, com.pinterest.ui.components.users.LegoUserRep] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [android.view.View, we1.p] */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.view.View, we1.o0] */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.view.View, xo0.x] */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.view.View, we1.t] */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.view.View, we1.l0] */
    /* JADX WARN: Type inference failed for: r3v90, types: [android.view.View, we1.m0] */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.view.View, we1.q0] */
    @Override // we1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r27) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.u2.a(java.util.List):void");
    }

    @Override // we1.u
    public final ViewGroup b() {
        return this;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return yn2.c0.t(d7.b.O(this));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        x21.g gVar = this.f129643j;
        if (view == null || gVar == null) {
            return;
        }
        gVar.l(view);
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        x21.g gVar = this.f129643j;
        if (view == null || gVar == null) {
            return;
        }
        gVar.m(view);
    }
}
