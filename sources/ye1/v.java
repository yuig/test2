package ye1;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingstories.views.ShoppingUnitThumbnailView;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import we1.a2;

/* loaded from: classes5.dex */
public final class v extends FrameLayout implements q, ky.h, nx.v, yk1.n, af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f138897f = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f138898a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138899b;

    /* renamed from: c, reason: collision with root package name */
    public ku1.l f138900c;

    /* renamed from: d, reason: collision with root package name */
    public p f138901d;

    /* renamed from: e, reason: collision with root package name */
    public final ShoppingUnitThumbnailView f138902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f138899b) {
            this.f138899b = true;
            m0.C0(this, (ku1.l) ((jb) ((w) generatedComponent())).f113485c.f114476s.get());
        }
        ShoppingUnitThumbnailView shoppingUnitThumbnailView = new ShoppingUnitThumbnailView(context, null, 0);
        shoppingUnitThumbnailView.setLayoutParams(new FrameLayout.LayoutParams(-1, shoppingUnitThumbnailView.getResources().getDimensionPixelSize(f62.a.shopping_unit_thumbnail_height)));
        this.f138902e = shoppingUnitThumbnailView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(shoppingUnitThumbnailView);
        shoppingUnitThumbnailView.setOnClickListener(new a2(this, 4));
        setClipToOutline(true);
        int i13 = f62.b.shopping_unit_background;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
        setForeground(context.getDrawable(f62.b.shopping_unit_background));
    }

    @Override // ye1.q
    public final void E1(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ku1.l lVar = this.f138900c;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ku1.l.b(lVar, context, url, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    }

    @Override // ye1.q
    public final void I6(p listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f138901d = listener;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f138898a == null) {
            this.f138898a = new ye2.o(this);
        }
        return this.f138898a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138898a == null) {
            this.f138898a = new ye2.o(this);
        }
        return this.f138898a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        p pVar = this.f138901d;
        if (pVar != null) {
            return ((u) pVar).I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        p pVar = this.f138901d;
        if (pVar != null) {
            return ((u) pVar).E1();
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
