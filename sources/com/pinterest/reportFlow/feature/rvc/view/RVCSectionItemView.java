package com.pinterest.reportFlow.feature.rvc.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.ni0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import df.j1;
import h02.d;
import h02.e;
import hs1.m;
import hs1.t;
import jq1.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import n10.c;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q02.a;
import r02.b0;
import r02.f;
import r02.i0;
import r02.j0;
import s02.j;
import s1.w;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/reportFlow/feature/rvc/view/RVCSectionItemView;", "Landroid/widget/RelativeLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RVCSectionItemView extends RelativeLayout implements n {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f50428l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ShapeableImageView f50429a;

    /* renamed from: b, reason: collision with root package name */
    public final ShapeableImageView f50430b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50431c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50432d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50433e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f50434f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f50435g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f50436h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIcon f50437i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIcon f50438j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f50439k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RVCSectionItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(j jVar, b0 onMoreActionsClicked, boolean z13, final ex1.n onActionLink, b onViewPdfClick) {
        final mj mjVar;
        String l33;
        f30 S;
        fi0 j13;
        Intrinsics.checkNotNullParameter(onMoreActionsClicked, "onMoreActionsClicked");
        Intrinsics.checkNotNullParameter(onActionLink, "onActionLink");
        Intrinsics.checkNotNullParameter(onViewPdfClick, "onViewPdfClick");
        if (jVar == null || (mjVar = jVar.f110321a) == null) {
            return;
        }
        Boolean S2 = mjVar.S();
        Intrinsics.checkNotNullExpressionValue(S2, "getShowPreviewImage(...)");
        int i13 = 2;
        final int i14 = 0;
        final int i15 = 1;
        if (S2.booleanValue()) {
            Intrinsics.checkNotNullParameter(mjVar, "<this>");
            mj.c M = mjVar.M();
            Unit unit = null;
            switch (M == null ? -1 : a.f101859a[M.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    wy0 V = mjVar.V();
                    if (V != null) {
                        l33 = V.l3();
                        break;
                    }
                    l33 = null;
                    break;
                case 4:
                case 5:
                    f30 N = mjVar.N();
                    if (N != null) {
                        l33 = N.y4();
                        break;
                    }
                    l33 = null;
                    break;
                case 6:
                    v7 D = mjVar.D();
                    if (D != null) {
                        l33 = D.c1();
                        break;
                    }
                    l33 = null;
                    break;
                case 7:
                    z2 A = mjVar.A();
                    if (A != null && (S = A.S()) != null) {
                        l33 = S.y4();
                        break;
                    }
                    l33 = null;
                    break;
                case 8:
                    ni0 T = mjVar.T();
                    if (T != null && (j13 = T.j()) != null) {
                        l33 = q02.b.b(j13);
                        break;
                    }
                    l33 = null;
                    break;
                case 9:
                    az0 G = mjVar.G();
                    if (G != null) {
                        Intrinsics.checkNotNullParameter(G, "<this>");
                        l33 = c.c(G, "150x150");
                        break;
                    }
                    l33 = null;
                    break;
                case 10:
                    l33 = mjVar.I();
                    break;
                default:
                    l33 = null;
                    break;
            }
            if (l33 != null) {
                ((m) t.a()).k(l33, new mp0.b(2, this, mjVar), null, null);
                unit = Unit.f80348a;
            }
            if (unit == null) {
                b(q02.b.d(mjVar) == q02.c.Rectangle);
            }
        } else {
            b(q02.b.d(mjVar) == q02.c.Rectangle);
        }
        this.f50429a.setOnClickListener(new View.OnClickListener() { // from class: r02.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i14;
                mj item = mjVar;
                Function1 onActionLink2 = onActionLink;
                switch (i16) {
                    case 0:
                        int i17 = RVCSectionItemView.f50428l;
                        Intrinsics.checkNotNullParameter(onActionLink2, "$onActionLink");
                        Intrinsics.checkNotNullParameter(item, "$item");
                        onActionLink2.invoke(q02.b.c(item));
                        break;
                    default:
                        int i18 = RVCSectionItemView.f50428l;
                        Intrinsics.checkNotNullParameter(onActionLink2, "$onActionLink");
                        Intrinsics.checkNotNullParameter(item, "$item");
                        onActionLink2.invoke(q02.b.c(item));
                        break;
                }
            }
        });
        this.f50430b.setOnClickListener(new View.OnClickListener() { // from class: r02.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                mj item = mjVar;
                Function1 onActionLink2 = onActionLink;
                switch (i16) {
                    case 0:
                        int i17 = RVCSectionItemView.f50428l;
                        Intrinsics.checkNotNullParameter(onActionLink2, "$onActionLink");
                        Intrinsics.checkNotNullParameter(item, "$item");
                        onActionLink2.invoke(q02.b.c(item));
                        break;
                    default:
                        int i18 = RVCSectionItemView.f50428l;
                        Intrinsics.checkNotNullParameter(onActionLink2, "$onActionLink");
                        Intrinsics.checkNotNullParameter(item, "$item");
                        onActionLink2.invoke(q02.b.c(item));
                        break;
                }
            }
        });
        this.f50431c.i(new w(this, mjVar, z13, 26));
        this.f50439k.i(new j0(mjVar, 3)).j(new ez1.b(4, mjVar, onViewPdfClick));
        j0 j0Var = new j0(mjVar, 4);
        GestaltText gestaltText = this.f50432d;
        gestaltText.i(j0Var);
        String O = mjVar.O();
        if (O != null && !z.j(O)) {
            CharSequence a03 = j1.a0(gestaltText.getResources().getString(e.generic_link, mjVar.O(), mjVar.P()));
            Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
            a0.q(gestaltText, bs1.c.h2(a03));
        }
        this.f50433e.i(new i0(this, mjVar));
        this.f50434f.i(new j0(mjVar, i14));
        this.f50435g.i(new j0(mjVar, i15));
        Intrinsics.checkNotNullParameter(mjVar, "<this>");
        Intrinsics.checkNotNullParameter(mjVar, "<this>");
        boolean L = CollectionsKt.L(f0.j(mj.a.ACCEPTED, mj.a.DENIED), mjVar.C());
        GestaltIcon gestaltIcon = this.f50437i;
        GestaltText gestaltText2 = this.f50436h;
        if (L || q02.b.a(mjVar)) {
            gestaltText2.i(new i0(mjVar, this));
            gestaltIcon.g2(new j0(mjVar, i13));
        } else {
            gestaltText2.i(f.f105732m);
            gestaltIcon.g2(f.f105733n);
        }
        this.f50438j.setOnClickListener(new fd1.e(22, onMoreActionsClicked, mjVar));
    }

    public final void b(boolean z13) {
        this.f50430b.setVisibility(8);
        ShapeableImageView shapeableImageView = this.f50429a;
        shapeableImageView.setVisibility(0);
        Context context = shapeableImageView.getContext();
        int i13 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        shapeableImageView.setBackground(context.getDrawable(i13));
        shapeableImageView.setImageResource(sm1.b.ic_action_prohibited_gestalt);
        if (z13) {
            shapeableImageView.getLayoutParams().width = shapeableImageView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_height);
            shapeableImageView.getLayoutParams().height = shapeableImageView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_width);
            return;
        }
        shapeableImageView.getLayoutParams().width = shapeableImageView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_width);
        shapeableImageView.getLayoutParams().height = shapeableImageView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_height);
    }

    public /* synthetic */ RVCSectionItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RVCSectionItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, d.rvc_info_item, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(h02.c.iv_rvc_user);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50429a = (ShapeableImageView) findViewById;
        View findViewById2 = findViewById(h02.c.iv_rvc_user_rounded);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50430b = (ShapeableImageView) findViewById2;
        View findViewById3 = findViewById(h02.c.gt_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50431c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(h02.c.gt_header_text_pdf);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50439k = (GestaltText) findViewById4;
        View findViewById5 = ((ConstraintLayout) findViewById(h02.c.container_violation)).findViewById(h02.c.gt_item_key);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        a0.o((GestaltText) findViewById5, e.rvc_violation_text, new Object[0]);
        this.f50432d = ((GestaltText) ((ConstraintLayout) findViewById(h02.c.container_violation)).findViewById(h02.c.gt_status_value)).i(f.f105731l);
        View findViewById6 = ((ConstraintLayout) findViewById(h02.c.container_lastupdated)).findViewById(h02.c.gt_item_key);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        a0.o((GestaltText) findViewById6, e.rvc_last_updated_text, new Object[0]);
        View findViewById7 = ((ConstraintLayout) findViewById(h02.c.container_lastupdated)).findViewById(h02.c.gt_status_value);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f50433e = (GestaltText) findViewById7;
        View findViewById8 = ((ConstraintLayout) findViewById(h02.c.container_status)).findViewById(h02.c.gt_item_key);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        a0.o((GestaltText) findViewById8, e.rvc_status_text, new Object[0]);
        View findViewById9 = ((ConstraintLayout) findViewById(h02.c.container_status)).findViewById(h02.c.gt_status_value);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f50434f = (GestaltText) findViewById9;
        View findViewById10 = ((ConstraintLayout) findViewById(h02.c.container_status)).findViewById(h02.c.gt_status_action);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f50435g = (GestaltText) findViewById10;
        View findViewById11 = ((ConstraintLayout) findViewById(h02.c.container_status)).findViewById(h02.c.gt_appeal_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f50436h = (GestaltText) findViewById11;
        View findViewById12 = findViewById(h02.c.gt_more_actions_menu);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f50438j = (GestaltIcon) findViewById12;
        View findViewById13 = ((ConstraintLayout) findViewById(h02.c.container_status)).findViewById(h02.c.gi_appeal_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f50437i = (GestaltIcon) findViewById13;
    }
}
