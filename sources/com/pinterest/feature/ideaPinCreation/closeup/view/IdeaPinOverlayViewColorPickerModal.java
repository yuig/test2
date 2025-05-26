package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vq;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinOverlayViewColorPickerModal;", "Landroid/widget/FrameLayout;", "Lcu0/b;", "Lcu0/d;", "Lcu0/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/j1", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinOverlayViewColorPickerModal extends FrameLayout implements cu0.b, cu0.d, cu0.e {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f46009u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final IdeaPinColorPalette f46010a;

    /* renamed from: b, reason: collision with root package name */
    public final IdeaPinCreationStickerVariantSelector f46011b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f46012c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f46013d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f46014e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f46015f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltAvatar f46016g;

    /* renamed from: h, reason: collision with root package name */
    public String f46017h;

    /* renamed from: i, reason: collision with root package name */
    public String f46018i;

    /* renamed from: j, reason: collision with root package name */
    public String f46019j;

    /* renamed from: k, reason: collision with root package name */
    public dl1.s f46020k;

    /* renamed from: l, reason: collision with root package name */
    public u f46021l;

    /* renamed from: m, reason: collision with root package name */
    public View f46022m;

    /* renamed from: n, reason: collision with root package name */
    public View f46023n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46024o;

    /* renamed from: p, reason: collision with root package name */
    public au0.d f46025p;

    /* renamed from: q, reason: collision with root package name */
    public cu0.c f46026q;

    /* renamed from: r, reason: collision with root package name */
    public j1 f46027r;

    /* renamed from: s, reason: collision with root package name */
    public au0.d f46028s;

    /* renamed from: t, reason: collision with root package name */
    public final int f46029t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinOverlayViewColorPickerModal(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static u f(g1 g1Var) {
        int i13 = k1.f46213a[g1Var.a0().ordinal()];
        if (i13 == 1) {
            return g1Var instanceof z0 ? u.PRODUCT_TITLE : u.PRODUCT_THUMBNAIL;
        }
        if (i13 != 3) {
            return null;
        }
        qq qqVar = ((s0) g1Var).f46299a;
        Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.BoardStickerOverlayBlock");
        return ((jq) qqVar).getVariantType() == a42.c.DEFAULT ? u.BOARD_DEFAULT : u.BOARD_ONE_LINE;
    }

    @Override // cu0.b
    public final void a() {
        kg.a.t(this.f46011b, 8, 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    @Override // cu0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinOverlayViewColorPickerModal.b():void");
    }

    @Override // cu0.b
    public final void c() {
        KeyEvent.Callback callback = this.f46022m;
        g1 g1Var = callback instanceof g1 ? (g1) callback : null;
        if (g1Var == null) {
            return;
        }
        uq a03 = g1Var.a0();
        if (a03 == uq.BOARD_STICKER || a03 == uq.PRODUCT_TAG) {
            kg.a.s(this.f46011b, 200L, null, 4);
        }
    }

    public final void d() {
        this.f46010a.d();
    }

    public final vq e() {
        Matrix matrix;
        qq r03;
        rq config;
        KeyEvent.Callback callback = this.f46022m;
        g1 g1Var = callback instanceof g1 ? (g1) callback : null;
        if (g1Var == null || (r03 = g1Var.r0()) == null || (config = r03.getConfig()) == null || (matrix = config.getMatrix()) == null) {
            matrix = new Matrix();
        }
        return ig1.b.J0(matrix, new RectF(this.f46012c.getDrawable().getBounds()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.pinterest.feature.ideaPinCreation.closeup.view.u r25) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinOverlayViewColorPickerModal.g(com.pinterest.feature.ideaPinCreation.closeup.view.u):void");
    }

    public final void h(String str) {
        int i13 = this.f46029t;
        WebImageView webImageView = this.f46015f;
        webImageView.V1(str, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : i13, (r18 & 16) != 0 ? 0 : i13, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        bs1.c.U1(webImageView);
    }

    public final void i() {
        List variantOptions;
        KeyEvent.Callback callback = this.f46022m;
        g1 g1Var = callback instanceof g1 ? (g1) callback : null;
        if (g1Var == null) {
            return;
        }
        u f13 = f(g1Var);
        int i13 = k1.f46213a[g1Var.a0().ordinal()];
        int i14 = 0;
        if (i13 == 1) {
            w[] wVarArr = new w[2];
            int i15 = aq1.c.ic_product_sticker_text_selector_option_nonpds;
            int i16 = aq1.h.accessibility_idea_pin_product_sticker_title_variant;
            u uVar = u.PRODUCT_TITLE;
            wVarArr[0] = new w(i15, i16, uVar, f13 == uVar, new i1(this, 2));
            int i17 = aq1.c.ic_product_sticker_thumbnail_selector_option_nonpds;
            int i18 = aq1.h.accessibility_idea_pin_product_sticker_thumbnail_variant;
            u uVar2 = u.PRODUCT_THUMBNAIL;
            wVarArr[1] = new w(i17, i18, uVar2, f13 == uVar2, new i1(this, 3));
            variantOptions = kotlin.collections.f0.j(wVarArr);
        } else if (i13 != 3) {
            variantOptions = null;
        } else {
            w[] wVarArr2 = new w[2];
            int i19 = aq1.c.ic_board_sticker_default_selector_option_nonpds;
            int i23 = aq1.h.accessibility_idea_pin_board_sticker_default_variant;
            u uVar3 = u.BOARD_DEFAULT;
            wVarArr2[0] = new w(i19, i23, uVar3, f13 == uVar3, new i1(this, 4));
            int i24 = aq1.c.ic_board_sticker_compact_selector_option_nonpds;
            int i25 = aq1.h.accessibility_idea_pin_board_sticker_one_line_variant;
            u uVar4 = u.BOARD_ONE_LINE;
            wVarArr2[1] = new w(i24, i25, uVar4, f13 == uVar4, new i1(this, 5));
            variantOptions = kotlin.collections.f0.j(wVarArr2);
        }
        IdeaPinCreationStickerVariantSelector ideaPinCreationStickerVariantSelector = this.f46011b;
        if (variantOptions != null) {
            ideaPinCreationStickerVariantSelector.getClass();
            Intrinsics.checkNotNullParameter(variantOptions, "variantOptions");
            ArrayList arrayList = ideaPinCreationStickerVariantSelector.f45996b;
            arrayList.clear();
            arrayList.addAll(variantOptions);
        }
        ideaPinCreationStickerVariantSelector.removeAllViews();
        Iterator it = ideaPinCreationStickerVariantSelector.f45996b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i26 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            w wVar = (w) next;
            ImageButton imageButton = new ImageButton(ideaPinCreationStickerVariantSelector.getContext());
            if (wVar.f46352d) {
                ideaPinCreationStickerVariantSelector.f45995a = i14;
            }
            imageButton.setImageDrawable(bs1.c.l2(imageButton, wVar.f46349a, eo1.b.color_white_0));
            imageButton.setBackground(bs1.c.f0(imageButton, cz1.b.button_circular_dark_gray, null, null, 6));
            imageButton.setContentDescription(bs1.c.f2(imageButton, wVar.f46350b));
            imageButton.setOnClickListener(new xo.u(i14, ideaPinCreationStickerVariantSelector, wVar));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bs1.c.W(imageButton, eo1.c.space_1200), bs1.c.W(imageButton, eo1.c.space_1200));
            com.bumptech.glide.c.a1(layoutParams, bs1.c.W(imageButton, eo1.c.space_100), bs1.c.W(imageButton, eo1.c.ignore), bs1.c.W(imageButton, eo1.c.space_100), bs1.c.W(imageButton, eo1.c.ignore));
            imageButton.setLayoutParams(layoutParams);
            ideaPinCreationStickerVariantSelector.addView(imageButton);
            i14 = i26;
        }
        ideaPinCreationStickerVariantSelector.b();
    }

    @Override // cu0.e
    public final void j() {
        cu0.c cVar = this.f46026q;
        if (cVar != null) {
            ((f0) cVar).B0(cu0.f.OVERLAY_TAG);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        KeyEvent.Callback view;
        Bitmap f23;
        View view2 = this.f46022m;
        boolean z13 = view2 instanceof z0;
        Bitmap bitmap = null;
        if (z13) {
            z0 z0Var = z13 ? (z0) view2 : null;
            if (z0Var != null) {
                String str = this.f46019j;
                String str2 = this.f46018i;
                if (str == null) {
                    str = z0Var.f46389b;
                }
                Paint paint = z0Var.f46402o;
                xk2.v vVar = z0Var.f46401n;
                u2 u2Var = z0Var.f46400m;
                if (str2 == null) {
                    f23 = z0Var.f2(str, (TextPaint) vVar.getValue(), paint, u2Var);
                } else {
                    int parseColor = Color.parseColor(kh2.m2.V0(str2));
                    TextPaint textPaint = new TextPaint((TextPaint) vVar.getValue());
                    textPaint.setColor(parseColor);
                    Paint paint2 = new Paint(paint);
                    paint2.setColor(Color.parseColor(str2));
                    f23 = z0Var.f2(str, textPaint, paint2, u2Var);
                }
                bitmap = f23;
            }
            this.f46012c.setImageBitmap(bitmap);
            return;
        }
        boolean z14 = view2 instanceof s0;
        if (z14) {
            s0 s0Var = z14 ? (s0) view2 : null;
            if (s0Var == null) {
                return;
            }
            String str3 = this.f46018i;
            dl1.s sVar = this.f46020k;
            i1 bitmapListener = new i1(this, 0);
            Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
            if (sVar == null) {
                sVar = s0Var.f46300b;
            }
            qq qqVar = s0Var.f46299a;
            if (qqVar instanceof jq) {
                Context context = s0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Board");
                view = new m0(context, (v7) sVar, ((jq) qqVar).getVariantType(), null);
            } else if (qqVar instanceof mq) {
                Context context2 = s0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                view = new x0(context2, (f30) sVar, null);
            } else {
                view = new View(s0Var.getContext());
            }
            u1 u1Var = (u1) view;
            if (str3 == null) {
                str3 = qqVar.getConfig().getColorHex();
            }
            String V0 = kh2.m2.V0(str3);
            u1Var.a(Integer.valueOf(Color.parseColor(str3)).intValue(), Integer.valueOf(Color.parseColor(V0)).intValue());
            KeyEvent.Callback callback = (View) u1Var;
            ((u1) callback).b(new l0.d(s0Var, callback, bitmapListener, 16));
        }
    }

    @Override // cu0.d
    public final void m(String str) {
        ImageView imageView = this.f46014e;
        WebImageView webImageView = this.f46013d;
        if (str == null) {
            this.f46018i = "#00000000";
            View view = this.f46022m;
            if (view instanceof r1) {
                webImageView.setColorFilter((ColorFilter) null);
                return;
            } else {
                if (view instanceof f) {
                    imageView.setColorFilter((ColorFilter) null);
                    return;
                }
                return;
            }
        }
        this.f46018i = str;
        View view2 = this.f46022m;
        if ((view2 instanceof z0) || (view2 instanceof s0)) {
            k();
        } else if (view2 instanceof r1) {
            webImageView.setColorFilter(Color.parseColor(str));
        } else if (view2 instanceof f) {
            imageView.setColorFilter(Color.parseColor(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinOverlayViewColorPickerModal(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46029t = bs1.c.W(this, aq1.b.idea_pin_tagged_product_image_preview_size);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View inflate = View.inflate(context, aq1.f.layout_idea_pin_overlay_view_color_picker, this);
        final int i14 = 0;
        ((GestaltButton) inflate.findViewById(aq1.d.cancel_button)).e(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinOverlayViewColorPickerModal f46194b;

            {
                this.f46194b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                au0.d dVar;
                int i15 = i14;
                IdeaPinOverlayViewColorPickerModal this$0 = this.f46194b;
                switch (i15) {
                    case 0:
                        int i16 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = false;
                        this$0.d();
                        break;
                    case 1:
                        int i17 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = true;
                        this$0.d();
                        break;
                    default:
                        int i18 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof rl1.t) && (dVar = this$0.f46028s) != null) {
                            dVar.getPinalytics().X(h32.u0.STORY_PIN_MENTION_THUMBNAIL);
                            if (dVar.u3() != null) {
                                q qVar = (q) ((yt0.d) dVar.getView());
                                qVar.getClass();
                                NavigationImpl V8 = q.V8(qVar, com.pinterest.screens.d2.i());
                                V8.Y1("com.pinterest.EXTRA_IDEA_PIN_IS_EDITING_EXISTING_USER_TAG", true);
                                qVar.M1(V8);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        ((GestaltButton) inflate.findViewById(aq1.d.done_button)).e(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinOverlayViewColorPickerModal f46194b;

            {
                this.f46194b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                au0.d dVar;
                int i152 = i15;
                IdeaPinOverlayViewColorPickerModal this$0 = this.f46194b;
                switch (i152) {
                    case 0:
                        int i16 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = false;
                        this$0.d();
                        break;
                    case 1:
                        int i17 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = true;
                        this$0.d();
                        break;
                    default:
                        int i18 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof rl1.t) && (dVar = this$0.f46028s) != null) {
                            dVar.getPinalytics().X(h32.u0.STORY_PIN_MENTION_THUMBNAIL);
                            if (dVar.u3() != null) {
                                q qVar = (q) ((yt0.d) dVar.getView());
                                qVar.getClass();
                                NavigationImpl V8 = q.V8(qVar, com.pinterest.screens.d2.i());
                                V8.Y1("com.pinterest.EXTRA_IDEA_PIN_IS_EDITING_EXISTING_USER_TAG", true);
                                qVar.M1(V8);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        View findViewById = inflate.findViewById(aq1.d.color_picker);
        IdeaPinColorPalette ideaPinColorPalette = (IdeaPinColorPalette) findViewById;
        ideaPinColorPalette.c(this, this, this);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46010a = ideaPinColorPalette;
        View findViewById2 = inflate.findViewById(aq1.d.representative_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46012c = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(aq1.d.web_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46013d = (WebImageView) findViewById3;
        View findViewById4 = inflate.findViewById(aq1.d.animated_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46014e = (ImageView) findViewById4;
        View findViewById5 = inflate.findViewById(aq1.d.edit_tag_preview_image);
        WebImageView webImageView = (WebImageView) findViewById5;
        Intrinsics.f(webImageView);
        webImageView.o0(dl2.b.y0(webImageView, eo1.a.base_color_grayscale_0));
        webImageView.M1(bs1.c.W(webImageView, eo1.c.lego_border_width_small));
        webImageView.setOnClickListener(new com.pinterest.feature.home.view.c(this, i15));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f46015f = webImageView;
        View findViewById6 = inflate.findViewById(aq1.d.user_avatar);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById6;
        final int i16 = 2;
        gestaltAvatar.M2(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinOverlayViewColorPickerModal f46194b;

            {
                this.f46194b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                au0.d dVar;
                int i152 = i16;
                IdeaPinOverlayViewColorPickerModal this$0 = this.f46194b;
                switch (i152) {
                    case 0:
                        int i162 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = false;
                        this$0.d();
                        break;
                    case 1:
                        int i17 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f46024o = true;
                        this$0.d();
                        break;
                    default:
                        int i18 = IdeaPinOverlayViewColorPickerModal.f46009u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof rl1.t) && (dVar = this$0.f46028s) != null) {
                            dVar.getPinalytics().X(h32.u0.STORY_PIN_MENTION_THUMBNAIL);
                            if (dVar.u3() != null) {
                                q qVar = (q) ((yt0.d) dVar.getView());
                                qVar.getClass();
                                NavigationImpl V8 = q.V8(qVar, com.pinterest.screens.d2.i());
                                V8.Y1("com.pinterest.EXTRA_IDEA_PIN_IS_EDITING_EXISTING_USER_TAG", true);
                                qVar.M1(V8);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f46016g = gestaltAvatar;
        View findViewById7 = findViewById(aq1.d.idea_pin_creation_sticker_option_selector);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f46011b = (IdeaPinCreationStickerVariantSelector) findViewById7;
    }
}
