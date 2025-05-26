package cg0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import c91.e;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import ll.j;
import m60.w;
import nx.d0;
import nx.v;
import pg0.g0;
import q5.m0;
import q5.v0;
import so.jb;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends CardView implements ag0.a, n, v, h, af2.c {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f27691s = 0;

    /* renamed from: h, reason: collision with root package name */
    public o f27692h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27693i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f27694j;

    /* renamed from: k, reason: collision with root package name */
    public final w f27695k;

    /* renamed from: l, reason: collision with root package name */
    public final e f27696l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f27697m;

    /* renamed from: n, reason: collision with root package name */
    public final ProportionalImageView f27698n;

    /* renamed from: o, reason: collision with root package name */
    public String f27699o;

    /* renamed from: p, reason: collision with root package name */
    public String f27700p;

    /* renamed from: q, reason: collision with root package name */
    public bg0.a f27701q;

    /* renamed from: r, reason: collision with root package name */
    public final j f27702r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        final int i13 = 1;
        if (!this.f27693i) {
            this.f27693i = true;
            jb jbVar = (jb) ((d) generatedComponent());
            this.f27695k = (w) jbVar.f113483a.f113885r0.get();
            this.f27696l = (e) jbVar.f113485c.f114211a0.get();
        }
        this.f27694j = pinalytics;
        final int i14 = 0;
        this.f27702r = new j(16, i14);
        View.inflate(context, ig0.b.view_education_banner, this);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(this, 0.0f);
        int i15 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i15));
        View findViewById = findViewById(ig0.a.edu_banner_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(ig0.a.edu_banner_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById2;
        this.f27698n = proportionalImageView;
        View findViewById3 = findViewById(ig0.a.edu_banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f27697m = gestaltText;
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener(this) { // from class: cg0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27690b;

            {
                this.f27690b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i14;
                b this$0 = this.f27690b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        bg0.a aVar = this$0.f27701q;
                        if (aVar != null) {
                            vh story = aVar.f22782c;
                            Integer num = aVar.f22781b;
                            rg0.n nVar = aVar.f22780a;
                            if (nVar != null) {
                                nVar.c(null, null);
                            }
                            if (story == null || num == null) {
                                return;
                            }
                            ag0.a aVar2 = (ag0.a) aVar.getView();
                            int intValue = num.intValue();
                            b bVar = (b) aVar2;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(story, "story");
                            w wVar = bVar.f27695k;
                            if (wVar != null) {
                                wVar.f(new g0(intValue));
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        bg0.a aVar3 = this$0.f27701q;
                        if (aVar3 != null) {
                            aVar3.q3();
                            return;
                        }
                        return;
                }
            }
        });
        proportionalImageView.f52576J = 1.3f;
        float dimensionPixelOffset = proportionalImageView.getResources().getDimensionPixelOffset(eo1.c.lego_image_corner_radius);
        proportionalImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        proportionalImageView.setOnClickListener(new View.OnClickListener(this) { // from class: cg0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27690b;

            {
                this.f27690b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i13;
                b this$0 = this.f27690b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        bg0.a aVar = this$0.f27701q;
                        if (aVar != null) {
                            vh story = aVar.f22782c;
                            Integer num = aVar.f22781b;
                            rg0.n nVar = aVar.f22780a;
                            if (nVar != null) {
                                nVar.c(null, null);
                            }
                            if (story == null || num == null) {
                                return;
                            }
                            ag0.a aVar2 = (ag0.a) aVar.getView();
                            int intValue = num.intValue();
                            b bVar = (b) aVar2;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(story, "story");
                            w wVar = bVar.f27695k;
                            if (wVar != null) {
                                wVar.f(new g0(intValue));
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        bg0.a aVar3 = this$0.f27701q;
                        if (aVar3 != null) {
                            aVar3.q3();
                            return;
                        }
                        return;
                }
            }
        });
        gestaltText.j(new yb0.b(this, 9));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f27692h == null) {
            this.f27692h = new o(this);
        }
        return this.f27692h;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f27692h == null) {
            this.f27692h = new o(this);
        }
        return this.f27692h.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f27699o;
        if (str == null) {
            return null;
        }
        return j.x(this.f27702r, str, 0, 0, this.f27700p, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f27702r.y(null);
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }
}
