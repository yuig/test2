package yg1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.util.AvatarWithTitleAndSubtitleView;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.following.view.lego.CreatorFollowButton;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import pe.i;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class d extends LinearLayout implements e, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f139015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139016b;

    /* renamed from: c, reason: collision with root package name */
    public final w f139017c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f139018d;

    /* renamed from: e, reason: collision with root package name */
    public g f139019e;

    /* renamed from: f, reason: collision with root package name */
    public final AvatarWithTitleAndSubtitleView f139020f;

    /* renamed from: g, reason: collision with root package name */
    public CreatorFollowButton f139021g;

    /* renamed from: h, reason: collision with root package name */
    public wy0 f139022h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f139023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        if (!this.f139016b) {
            this.f139016b = true;
            this.f139017c = (w) ((jb) ((h) generatedComponent())).f113483a.f113885r0.get();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = new AvatarWithTitleAndSubtitleView(context2, null, 0, 6);
        this.f139020f = avatarWithTitleAndSubtitleView;
        setOrientation(0);
        addView(avatarWithTitleAndSubtitleView, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        avatarWithTitleAndSubtitleView.setOnClickListener(new View.OnClickListener(this) { // from class: yg1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f139013b;

            {
                this.f139013b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                d.a(this.f139013b);
            }
        });
        this.f139023i = g0.TODAY_ARTICLE_FOLLOWING_MODULE;
    }

    public static void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g gVar = this$0.f139019e;
        if (gVar != null) {
            d dVar = (d) ((e) gVar.getView());
            w wVar = dVar.f139017c;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            wVar.d(i.x1(null, dVar.f139022h, r41.b.TodayTabArticleFollowingModule));
            d0 pinalytics = gVar.getPinalytics();
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.BODY;
            g0 g0Var = ((d) ((e) gVar.getView())).f139023i;
            n70.o oVar = gVar.f139025a;
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : (String) oVar.f89634h, (r18 & 32) != 0 ? null : oVar.l(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f139015a == null) {
            this.f139015a = new o(this);
        }
        return this.f139015a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f139015a == null) {
            this.f139015a = new o(this);
        }
        return this.f139015a.generatedComponent();
    }

    @Override // yk1.d, yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f139018d = pinalytics;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, g0 componentType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        if (!this.f139016b) {
            this.f139016b = true;
            this.f139017c = (w) ((jb) ((h) generatedComponent())).f113483a.f113885r0.get();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        final int i13 = 0;
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = new AvatarWithTitleAndSubtitleView(context2, null, 0, 6);
        this.f139020f = avatarWithTitleAndSubtitleView;
        setOrientation(0);
        addView(avatarWithTitleAndSubtitleView, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        avatarWithTitleAndSubtitleView.setOnClickListener(new View.OnClickListener(this) { // from class: yg1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f139013b;

            {
                this.f139013b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                d.a(this.f139013b);
            }
        });
        this.f139023i = g0.TODAY_ARTICLE_FOLLOWING_MODULE;
        Intrinsics.checkNotNullParameter(componentType, "<set-?>");
        this.f139023i = componentType;
    }
}
