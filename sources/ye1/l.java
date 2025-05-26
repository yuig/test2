package ye1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import we1.a2;

/* loaded from: classes5.dex */
public final class l extends LinearLayout implements n, ky.h, nx.v, yk1.n, af2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f138868k = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f138869a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138870b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f138871c;

    /* renamed from: d, reason: collision with root package name */
    public ku1.l f138872d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f138873e;

    /* renamed from: f, reason: collision with root package name */
    public p f138874f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f138875g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f138876h;

    /* renamed from: i, reason: collision with root package name */
    public final WebImageView f138877i;

    /* renamed from: j, reason: collision with root package name */
    public final WebImageView f138878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f138870b) {
            this.f138870b = true;
            pp2.a.C0(this, (ku1.l) ((jb) ((m) generatedComponent())).f113485c.f114476s.get());
        }
        this.f138871c = context;
        View.inflate(context, f62.d.view_shopping_unit_card, this);
        int i13 = eo1.b.color_background_light;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
        View findViewById = findViewById(f62.c.shopping_unit_card_text);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.j(new ca1.h(this, 21));
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        this.f138873e = gestaltText;
        View findViewById2 = findViewById(f62.c.shopping_card_image_1);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f138875g = (WebImageView) findViewById2;
        View findViewById3 = findViewById(f62.c.shopping_card_image_2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f138876h = (WebImageView) findViewById3;
        View findViewById4 = findViewById(f62.c.shopping_card_image_3);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f138877i = (WebImageView) findViewById4;
        View findViewById5 = findViewById(f62.c.shopping_card_image_4);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f138878j = (WebImageView) findViewById5;
        setOnClickListener(new a2(this, 2));
        setBackground(context.getDrawable(f62.b.shopping_unit_background));
        setForeground(context.getDrawable(f62.b.shopping_unit_background));
        setClipToOutline(true);
    }

    @Override // ye1.q
    public final void E1(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ku1.l lVar = this.f138872d;
        if (lVar != null) {
            ku1.l.b(lVar, this.f138871c, url, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
        } else {
            Intrinsics.r("uriNavigator");
            throw null;
        }
    }

    @Override // ye1.q
    public final void I6(p listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f138874f = listener;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f138869a == null) {
            this.f138869a = new ye2.o(this);
        }
        return this.f138869a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138869a == null) {
            this.f138869a = new ye2.o(this);
        }
        return this.f138869a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        p pVar = this.f138874f;
        if (pVar != null) {
            return ((u) pVar).I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        p pVar = this.f138874f;
        if (pVar != null) {
            return ((u) pVar).E1();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f138874f = null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
