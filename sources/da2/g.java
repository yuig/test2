package da2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIcon;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import cp.s;
import de1.t;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import om1.l;
import rm1.q;
import u81.r;
import wk1.k;
import zd1.o;
import zd1.p;

/* loaded from: classes4.dex */
public final class g extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f54244o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f54245a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f54246b;

    /* renamed from: c, reason: collision with root package name */
    public final q f54247c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f54248d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f54249e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f54250f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f54251g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f54252h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f54253i;

    /* renamed from: j, reason: collision with root package name */
    public c f54254j;

    /* renamed from: k, reason: collision with root package name */
    public final ProductFilterIcon f54255k;

    /* renamed from: l, reason: collision with root package name */
    public final t f54256l;

    /* renamed from: m, reason: collision with root package name */
    public final e f54257m;

    /* renamed from: n, reason: collision with root package name */
    public p f54258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, o oVar, de1.c cVar, uj2.q networkStateStream, String str, q qVar, f0 pinalyticsFactory, boolean z13, int i13, int i14) {
        super(context, null, 0);
        int i15;
        GestaltText gestaltText;
        int i16;
        o oVar2 = (i14 & 8) != 0 ? null : oVar;
        de1.c cVar2 = (i14 & 16) != 0 ? null : cVar;
        String pinId = (i14 & 64) != 0 ? "" : str;
        q navigationIcon = (i14 & 1024) != 0 ? q.CANCEL : qVar;
        if ((i14 & 8192) != 0) {
            int i17 = eo1.b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            i15 = context.getColor(i17);
        } else {
            i15 = i13;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        final int i18 = 0;
        this.f54245a = false;
        this.f54246b = false;
        this.f54247c = navigationIcon;
        this.f54257m = new e(this, pinalyticsFactory, 0);
        this.f54258n = p.PRODUCT_FILTER_SOURCE_INVALID;
        View.inflate(context, f62.d.view_bottom_sheet_title_header, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(i15);
        View findViewById = findViewById(f62.c.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById;
        this.f54248d = gestaltText2;
        View findViewById2 = findViewById(f62.c.bottom_sheet_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f54249e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(f62.c.title_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f54250f = (ConstraintLayout) findViewById3;
        View findViewById4 = findViewById(f62.c.subtitle_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f54251g = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(f62.c.back_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById5;
        this.f54252h = gestaltIconButton;
        View findViewById6 = findViewById(f62.c.handlebar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById6;
        this.f54253i = imageView;
        gestaltIconButton.t(new s12.a(this, 29));
        gestaltIconButton.u(new gm1.a(this) { // from class: da2.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f54235b;

            {
                this.f54235b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar3;
                c cVar4;
                int i19 = i18;
                g this$0 = this.f54235b;
                switch (i19) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar3 = this$0.f54254j) != null) {
                            s sVar = (s) cVar3;
                            int i23 = sVar.f52969a;
                            k kVar = sVar.f52970b;
                            switch (i23) {
                                case 0:
                                    ca2.e eVar = ((l81.l) kVar).f82176o2;
                                    if (eVar != null) {
                                        ca2.e.i(eVar, "close_button_tapped", 0.0f, null, 6);
                                        break;
                                    }
                                    break;
                                default:
                                    int i24 = r.f121059l2;
                                    ((r) kVar).P7();
                                    break;
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof rn1.f) && (cVar4 = this$0.f54254j) != null) {
                            s sVar2 = (s) cVar4;
                            int i25 = sVar2.f52969a;
                            k kVar2 = sVar2.f52970b;
                            switch (i25) {
                                case 0:
                                    ca2.e eVar2 = ((l81.l) kVar2).f82176o2;
                                    if (eVar2 != null) {
                                        BottomSheetBehavior bottomSheetBehavior = eVar2.f27255n;
                                        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 3) {
                                            eVar2.v("header_tapped");
                                            break;
                                        } else {
                                            eVar2.s("header_tapped", true);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    m81.r rVar = ((r) kVar2).X1;
                                    if (rVar != null) {
                                        s81.p pVar = (s81.p) rVar;
                                        if (pVar.f111942t != m81.g.GALLERY_PHOTOS) {
                                            ca2.e l93 = ((r) ((m81.q) pVar.getView())).l9();
                                            BottomSheetBehavior bottomSheetBehavior2 = l93.f27255n;
                                            if (bottomSheetBehavior2 != null && bottomSheetBehavior2.L == 3) {
                                                l93.v("header_tapped");
                                                break;
                                            } else {
                                                l93.s("header_tapped", true);
                                                break;
                                            }
                                        } else {
                                            pVar.e4(m81.g.GALLERY_DIRECTORIES);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        final int i19 = 1;
        gestaltText2.j(new gm1.a(this) { // from class: da2.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f54235b;

            {
                this.f54235b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar3;
                c cVar4;
                int i192 = i19;
                g this$0 = this.f54235b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar3 = this$0.f54254j) != null) {
                            s sVar = (s) cVar3;
                            int i23 = sVar.f52969a;
                            k kVar = sVar.f52970b;
                            switch (i23) {
                                case 0:
                                    ca2.e eVar = ((l81.l) kVar).f82176o2;
                                    if (eVar != null) {
                                        ca2.e.i(eVar, "close_button_tapped", 0.0f, null, 6);
                                        break;
                                    }
                                    break;
                                default:
                                    int i24 = r.f121059l2;
                                    ((r) kVar).P7();
                                    break;
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof rn1.f) && (cVar4 = this$0.f54254j) != null) {
                            s sVar2 = (s) cVar4;
                            int i25 = sVar2.f52969a;
                            k kVar2 = sVar2.f52970b;
                            switch (i25) {
                                case 0:
                                    ca2.e eVar2 = ((l81.l) kVar2).f82176o2;
                                    if (eVar2 != null) {
                                        BottomSheetBehavior bottomSheetBehavior = eVar2.f27255n;
                                        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 3) {
                                            eVar2.v("header_tapped");
                                            break;
                                        } else {
                                            eVar2.s("header_tapped", true);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    m81.r rVar = ((r) kVar2).X1;
                                    if (rVar != null) {
                                        s81.p pVar = (s81.p) rVar;
                                        if (pVar.f111942t != m81.g.GALLERY_PHOTOS) {
                                            ca2.e l93 = ((r) ((m81.q) pVar.getView())).l9();
                                            BottomSheetBehavior bottomSheetBehavior2 = l93.f27255n;
                                            if (bottomSheetBehavior2 != null && bottomSheetBehavior2.L == 3) {
                                                l93.v("header_tapped");
                                                break;
                                            } else {
                                                l93.s("header_tapped", true);
                                                break;
                                            }
                                        } else {
                                            pVar.e4(m81.g.GALLERY_DIRECTORIES);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        View findViewById7 = findViewById(f62.c.product_filter_mvp);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        ProductFilterIcon productFilterIcon = (ProductFilterIcon) findViewById7;
        this.f54255k = productFilterIcon;
        if (oVar2 != null) {
            gestaltText = gestaltText2;
            i16 = 0;
            t listener = new t(cVar2, new e(this, pinalyticsFactory, 1), networkStateStream, pinId, new yk1.a(getContext().getResources(), getContext().getTheme()), false, null, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
            Intrinsics.checkNotNullParameter(listener, "listener");
            oVar2.f141742f = listener;
            productFilterIcon.setOnClickListener(new fd1.e(24, this, listener));
            this.f54256l = listener;
        } else {
            gestaltText = gestaltText2;
            i16 = 0;
        }
        if (z13) {
            imageView.setVisibility(i16);
            com.bumptech.glide.c.d0(gestaltIconButton);
            gestaltText.i(b.f54236j);
            setOnClickListener(new wq1.a(this, 23));
        }
    }

    public final void a(s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f54254j = listener;
    }

    public final void b(int i13) {
        this.f54255k.b(i13);
    }

    public final void c(boolean z13, p source) {
        Intrinsics.checkNotNullParameter(source, "filterSource");
        t tVar = this.f54256l;
        if (tVar != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            tVar.f54657m = source;
        }
        bs1.c.R1(this.f54255k, z13);
        boolean z14 = z13 && this.f54258n != source;
        this.f54258n = source;
        if (z14) {
            int i13 = d.f54239a[source.ordinal()];
            e eVar = this.f54257m;
            if (i13 == 1) {
                eVar.c(a4.SHOPPING_RELATED_PRODUCTS_FEED, d4.FLASHLIGHT, null);
            } else if (i13 == 2) {
                eVar.c(a4.SHOPPING_STELA_PRODUCTS_FEED, d4.FLASHLIGHT, null);
            } else if (i13 == 3) {
                eVar.c(a4.SHOPPING_DOT_FEED, d4.CLOSEUP_SCENE_SHOP, null);
            } else if (i13 == 4) {
                eVar.c(a4.SHOPPING_DOT_FEED, d4.PINCH_TO_ZOOM, null);
            }
            d0 d0Var = eVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.FILTER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public final void d(String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f54249e.i(new kw1.c(subtitle, 14));
        this.f54248d.i(b.f54237k);
    }

    public final void e(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        dl2.b.z(this.f54251g, new f(icon, 1));
    }

    public final void f(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54250f.setVisibility(0);
        CharSequence text = this.f54249e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        this.f54248d.i(new gb1.p(title, text.length() > 0, 2));
    }

    public final void g(boolean z13) {
        this.f54250f.setVisibility(z13 ? 0 : 8);
    }

    public final void h(boolean z13) {
        this.f54252h.t(new fx1.d(z13, 15));
    }

    public final void i(boolean z13) {
        this.f54248d.i(new fx1.d(z13, 16));
    }

    public final void j(float f13) {
        this.f54253i.setAlpha(f13);
    }

    public final void k(int i13) {
        this.f54253i.setColorFilter(i13);
    }
}
