package d91;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.r0;
import m60.s0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import ny1.t;
import ny1.w;
import so.jb;
import so.oa;
import so.s8;
import tb0.p;
import ye2.o;

/* loaded from: classes5.dex */
public final class e extends FrameLayout implements uk1.c, yk1.d, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f54057a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f54058b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f54059c;

    /* renamed from: d, reason: collision with root package name */
    public final c91.e f54060d;

    /* renamed from: e, reason: collision with root package name */
    public final x20.a f54061e;

    /* renamed from: f, reason: collision with root package name */
    public final w f54062f;

    /* renamed from: g, reason: collision with root package name */
    public final q f54063g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f54064h;

    /* renamed from: i, reason: collision with root package name */
    public a91.b f54065i;

    /* renamed from: j, reason: collision with root package name */
    public x81.k f54066j;

    /* renamed from: k, reason: collision with root package name */
    public final com.pinterest.feature.pincarouselads.view.l f54067k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f54068l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f54069m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f54070n;

    /* renamed from: o, reason: collision with root package name */
    public final d4 f54071o;

    /* renamed from: p, reason: collision with root package name */
    public final a4 f54072p;

    /* renamed from: q, reason: collision with root package name */
    public final g0 f54073q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d0 d0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 1;
        if (!this.f54058b) {
            this.f54058b = true;
            jb jbVar = (jb) ((f) generatedComponent());
            oa oaVar = jbVar.f113483a;
            s8 s8Var = jbVar.f113485c;
            this.f54060d = (c91.e) s8Var.f114211a0.get();
            this.f54061e = (x20.a) s8Var.f114445pc.get();
            this.f54062f = s8Var.A5();
            this.f54063g = (q) oaVar.O0.get();
            this.f54064h = (i92.k) oaVar.f113921t1.get();
        }
        this.f54059c = d0Var;
        com.pinterest.feature.pincarouselads.view.l lVar = new com.pinterest.feature.pincarouselads.view.l(context, 0, false, null, 56);
        this.f54067k = lVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        int i14 = s0.ic_action_face_tryon_pdp_nonpds;
        Object obj = d5.a.f53679a;
        imageView.setImageDrawable(context.getDrawable(i14));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(c.f54050l);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_400);
        layoutParams2.gravity = 1;
        gestaltText.setLayoutParams(layoutParams2);
        dl2.b.y2(gestaltText);
        linearLayout.addView(gestaltText);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(r0.margin_triple);
        linearLayout.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        linearLayout.setOnClickListener(new b(this, 0));
        this.f54068l = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(c.f54048j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_400);
        layoutParams3.gravity = 1;
        gestaltText2.setLayoutParams(layoutParams3);
        dl2.b.y2(gestaltText2);
        linearLayout2.addView(gestaltText2);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = frameLayout.getResources().getDimensionPixelSize(eo1.c.space_400);
        frameLayout.setLayoutParams(layoutParams4);
        GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText3.i(c.f54049k);
        dl2.b.y2(gestaltText3);
        frameLayout.addView(gestaltText3);
        frameLayout.setBackground(context.getDrawable(s0.rounded_rect_radius_32));
        frameLayout.setOnClickListener(new b(this, i13));
        int dimensionPixelSize2 = frameLayout.getResources().getDimensionPixelSize(eo1.c.space_300);
        frameLayout.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        linearLayout2.addView(frameLayout);
        this.f54069m = linearLayout2;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(lVar);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        Unit unit = Unit.f80348a;
        addView(linearLayout, layoutParams5);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams6.gravity = 17;
        addView(linearLayout2, layoutParams6);
        linearLayout2.setVisibility(8);
        this.f54071o = d4.PIN;
        this.f54072p = a4.PIN_CLOSEUP;
        this.f54073q = g0.PIN_CLOSEUP;
    }

    public final void a() {
        if (d5.a.a(getContext(), "android.permission.CAMERA") != 0) {
            w wVar = this.f54062f;
            if (wVar != null) {
                wVar.c(bs1.c.m0(this), ny1.d.f92664f, (r23 & 4) != 0 ? "" : p.VIRTUAL_TRY_ON.toString(), null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? t.f92702m : null, (r23 & 1024) != 0 ? t.f92703n : new d(this, 0));
                return;
            } else {
                Intrinsics.r("permissionsManager");
                throw null;
            }
        }
        a91.b bVar = this.f54065i;
        if (bVar != null) {
            x20.a aVar = this.f54061e;
            if (aVar != null) {
                bVar.r3(aVar);
            } else {
                Intrinsics.r("tryOnService");
                throw null;
            }
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f54057a == null) {
            this.f54057a = new o(this);
        }
        return this.f54057a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f54057a == null) {
            this.f54057a = new o(this);
        }
        return this.f54057a.generatedComponent();
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getV0() {
        return this.f54073q;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getD0() {
        return this.f54072p;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF111517j0() {
        return this.f54071o;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        a91.b bVar = this.f54065i;
        if (bVar != null) {
            if (i13 == 0) {
                bs1.c.R1(((e) bVar.getView()).f54068l, true);
                return;
            }
            e eVar = (e) bVar.getView();
            x81.k kVar = eVar.f54066j;
            if (kVar != null) {
                kVar.pauseCamera();
            }
            LinearLayout linearLayout = eVar.f54070n;
            if (linearLayout != null && Intrinsics.d(linearLayout.getParent(), eVar)) {
                eVar.removeView(linearLayout);
            }
            Object obj = eVar.f54066j;
            View view = obj instanceof View ? (View) obj : null;
            if (view != null && Intrinsics.d(view.getParent(), eVar)) {
                eVar.removeView(view);
            }
            bs1.c.R1(eVar.f54069m, false);
            bs1.c.R1(eVar.f54068l, true);
        }
    }
}
