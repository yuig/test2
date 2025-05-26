package com.pinterest.feature.unifiedcomments.view;

import af2.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.hx0;
import com.pinterest.feature.unifiedcomments.view.CommunityInsightHeaderView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import ee1.d;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.m0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import pg0.l;
import pg0.n;
import pk.a0;
import rh1.v0;
import rh1.y;
import rh1.z;
import so.jb;
import so.s8;
import xk2.m;
import xk2.v;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommunityInsightHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrh1/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor", "GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class CommunityInsightHeaderView extends ConstraintLayout implements z, c {

    /* renamed from: a, reason: collision with root package name */
    public o f48930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48931b;

    /* renamed from: c, reason: collision with root package name */
    public w f48932c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f48933d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f48934e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f48935f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f48936g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f48937h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f48938i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f48939j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f48940k;

    /* renamed from: l, reason: collision with root package name */
    public final v f48941l;

    /* renamed from: m, reason: collision with root package name */
    public final int[][] f48942m;

    /* renamed from: n, reason: collision with root package name */
    public final int[][] f48943n;

    /* renamed from: o, reason: collision with root package name */
    public final int f48944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityInsightHeaderView(Context context) {
        super(context);
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48941l = m.b(new d(this, 19));
        int i14 = b.base_color_blue_100;
        int i15 = b.base_color_blue_400;
        int i16 = b.color_white_0;
        int[] iArr = {i14, i15, i15, i16};
        int i17 = b.base_color_blue_500;
        int[] iArr2 = {i17, i14, i14, i17};
        int i18 = b.color_blue_skycicle_100;
        int i19 = b.color_blue_skycicle_500;
        int i23 = b.color_blue_skycicle_900;
        this.f48942m = new int[][]{iArr, iArr2, new int[]{i18, i19, i19, i16}, new int[]{i23, i18, i18, i23}};
        int i24 = b.base_color_purple_100;
        int i25 = b.base_color_purple_500;
        int i26 = b.base_color_purple_400;
        int[] iArr3 = {i24, i25, i26, i16};
        int[] iArr4 = {i26, i24, i24, i26};
        int i27 = b.color_purple_mysticool_200;
        int i28 = b.color_purple_mysticool_700;
        this.f48943n = new int[][]{iArr3, iArr4, new int[]{i27, i28, b.color_purple_mysticool_600, i16}, new int[]{i28, i27, i27, i28}};
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (a0.q0(context2)) {
            i13 = b.color_white_0;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i13 = dl2.b.T1(context3) ? b.sema_color_text_neutral : b.color_text_subtle;
        }
        this.f48944o = i13;
        View.inflate(getContext(), fb0.d.community_insight_header, this);
        View findViewById = findViewById(fb0.c.community_insight_header_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48934e = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(fb0.c.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48935f = (WebImageView) findViewById2;
        View findViewById3 = findViewById(fb0.c.insight_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48937h = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(fb0.c.insight_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48936g = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(fb0.c.insight_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48938i = (GestaltText) findViewById5;
        View findViewById6 = findViewById(fb0.c.insight_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48939j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(fb0.c.insight_header_body);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48940k = (GestaltText) findViewById7;
        View findViewById8 = findViewById(fb0.c.community_insight_close_button);
        final int i29 = 2;
        ((GestaltIconButton) findViewById8).v(new View.OnClickListener(this) { // from class: rh1.u0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommunityInsightHeaderView f108302b;

            {
                this.f108302b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i33 = i29;
                CommunityInsightHeaderView.L(this.f108302b);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }

    public static void L(CommunityInsightHeaderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        w wVar = this$0.f48932c;
        if (wVar != null) {
            wVar.d(new l());
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // rh1.z
    public final void J2(boolean z13) {
    }

    @Override // rh1.z
    public final void K(hx0 commentsCountHeaderItem) {
        Intrinsics.checkNotNullParameter(commentsCountHeaderItem, "commentsCountHeaderItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    @Override // rh1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(com.pinterest.api.model.ge r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.unifiedcomments.view.CommunityInsightHeaderView.Q(com.pinterest.api.model.ge):void");
    }

    @Override // rh1.z
    public final void a5(boolean z13) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48930a == null) {
            this.f48930a = new o(this);
        }
        return this.f48930a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48930a == null) {
            this.f48930a = new o(this);
        }
        return this.f48930a.generatedComponent();
    }

    @Override // rh1.z
    public final void h6(String str, String commentId, y translationStatus) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(translationStatus, "translationStatus");
    }

    public final void inject() {
        if (this.f48931b) {
            return;
        }
        this.f48931b = true;
        jb jbVar = (jb) ((v0) generatedComponent());
        this.f48932c = (w) jbVar.f113483a.f113885r0.get();
        s8 s8Var = jbVar.f113485c;
        this.f48933d = s8Var.o5();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f48932c;
        if (wVar != null) {
            wVar.d(new pg0.o());
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar = this.f48932c;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.d(new n());
        super.onDetachedFromWindow();
    }

    @Override // rh1.z
    public final void v6(rp0.d comment, int i13, String badgedCommentId, String pinCreatorUid, String pinCreatorUsername, String selectedEngagementId, boolean z13, rp0.d dVar) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(badgedCommentId, "badgedCommentId");
        Intrinsics.checkNotNullParameter(pinCreatorUid, "pinCreatorUid");
        Intrinsics.checkNotNullParameter(pinCreatorUsername, "pinCreatorUsername");
        Intrinsics.checkNotNullParameter(selectedEngagementId, "selectedEngagementId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityInsightHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48941l = m.b(new d(this, 19));
        int i14 = b.base_color_blue_100;
        int i15 = b.base_color_blue_400;
        int i16 = b.color_white_0;
        int[] iArr = {i14, i15, i15, i16};
        int i17 = b.base_color_blue_500;
        int[] iArr2 = {i17, i14, i14, i17};
        int i18 = b.color_blue_skycicle_100;
        int i19 = b.color_blue_skycicle_500;
        int i23 = b.color_blue_skycicle_900;
        this.f48942m = new int[][]{iArr, iArr2, new int[]{i18, i19, i19, i16}, new int[]{i23, i18, i18, i23}};
        int i24 = b.base_color_purple_100;
        int i25 = b.base_color_purple_500;
        int i26 = b.base_color_purple_400;
        int[] iArr3 = {i24, i25, i26, i16};
        int[] iArr4 = {i26, i24, i24, i26};
        int i27 = b.color_purple_mysticool_200;
        int i28 = b.color_purple_mysticool_700;
        this.f48943n = new int[][]{iArr3, iArr4, new int[]{i27, i28, b.color_purple_mysticool_600, i16}, new int[]{i28, i27, i27, i28}};
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (a0.q0(context2)) {
            i13 = b.color_white_0;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i13 = dl2.b.T1(context3) ? b.sema_color_text_neutral : b.color_text_subtle;
        }
        this.f48944o = i13;
        View.inflate(getContext(), fb0.d.community_insight_header, this);
        View findViewById = findViewById(fb0.c.community_insight_header_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48934e = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(fb0.c.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48935f = (WebImageView) findViewById2;
        View findViewById3 = findViewById(fb0.c.insight_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48937h = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(fb0.c.insight_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48936g = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(fb0.c.insight_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48938i = (GestaltText) findViewById5;
        View findViewById6 = findViewById(fb0.c.insight_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48939j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(fb0.c.insight_header_body);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48940k = (GestaltText) findViewById7;
        View findViewById8 = findViewById(fb0.c.community_insight_close_button);
        final int i29 = 0;
        ((GestaltIconButton) findViewById8).v(new View.OnClickListener(this) { // from class: rh1.u0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommunityInsightHeaderView f108302b;

            {
                this.f108302b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i33 = i29;
                CommunityInsightHeaderView.L(this.f108302b);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityInsightHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int i14;
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48941l = m.b(new d(this, 19));
        int i15 = b.base_color_blue_100;
        int i16 = b.base_color_blue_400;
        int i17 = b.color_white_0;
        int[] iArr = {i15, i16, i16, i17};
        int i18 = b.base_color_blue_500;
        int[] iArr2 = {i18, i15, i15, i18};
        int i19 = b.color_blue_skycicle_100;
        int i23 = b.color_blue_skycicle_500;
        int i24 = b.color_blue_skycicle_900;
        this.f48942m = new int[][]{iArr, iArr2, new int[]{i19, i23, i23, i17}, new int[]{i24, i19, i19, i24}};
        int i25 = b.base_color_purple_100;
        int i26 = b.base_color_purple_500;
        int i27 = b.base_color_purple_400;
        int[] iArr3 = {i25, i26, i27, i17};
        int[] iArr4 = {i27, i25, i25, i27};
        int i28 = b.color_purple_mysticool_200;
        int i29 = b.color_purple_mysticool_700;
        this.f48943n = new int[][]{iArr3, iArr4, new int[]{i28, i29, b.color_purple_mysticool_600, i17}, new int[]{i29, i28, i28, i29}};
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (a0.q0(context2)) {
            i14 = b.color_white_0;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i14 = dl2.b.T1(context3) ? b.sema_color_text_neutral : b.color_text_subtle;
        }
        this.f48944o = i14;
        View.inflate(getContext(), fb0.d.community_insight_header, this);
        View findViewById = findViewById(fb0.c.community_insight_header_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48934e = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(fb0.c.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48935f = (WebImageView) findViewById2;
        View findViewById3 = findViewById(fb0.c.insight_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48937h = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(fb0.c.insight_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48936g = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(fb0.c.insight_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48938i = (GestaltText) findViewById5;
        View findViewById6 = findViewById(fb0.c.insight_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48939j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(fb0.c.insight_header_body);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48940k = (GestaltText) findViewById7;
        View findViewById8 = findViewById(fb0.c.community_insight_close_button);
        final int i33 = 1;
        ((GestaltIconButton) findViewById8).v(new View.OnClickListener(this) { // from class: rh1.u0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommunityInsightHeaderView f108302b;

            {
                this.f108302b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i332 = i33;
                CommunityInsightHeaderView.L(this.f108302b);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }
}
