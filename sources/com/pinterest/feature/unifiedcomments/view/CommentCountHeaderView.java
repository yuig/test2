package com.pinterest.feature.unifiedcomments.view;

import af2.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.m4;
import com.pinterest.api.model.dw0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ge;
import com.pinterest.api.model.hx0;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fb0.d;
import hf0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rh1.q;
import rh1.r;
import rh1.y;
import rh1.z;
import so.jb;
import so.s8;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommentCountHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrh1/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class CommentCountHeaderView extends ConstraintLayout implements z, c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48920h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48921a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48922b;

    /* renamed from: c, reason: collision with root package name */
    public w f48923c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48924d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f48925e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48926f;

    /* renamed from: g, reason: collision with root package name */
    public final q f48927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCountHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48926f = true;
        this.f48927g = new q(this);
        View.inflate(getContext(), d.comment_count_header_view, this);
        View findViewById = findViewById(fb0.c.comment_count);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48924d = (GestaltText) findViewById;
    }

    @Override // rh1.z
    public final void J2(boolean z13) {
    }

    @Override // rh1.z
    public final void K(hx0 commentsCountHeaderItem) {
        Intrinsics.checkNotNullParameter(commentsCountHeaderItem, "commentsCountHeaderItem");
        w wVar = this.f48923c;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.h(this.f48927g);
        if (this.f48925e == null) {
            L(commentsCountHeaderItem.f38561a);
        }
        f30 f30Var = commentsCountHeaderItem.f38562b;
        if (!b.q()) {
            dw0 A6 = f30Var.A6();
            if (j1.U0(A6 != null ? A6.f() : null)) {
                GestaltText gestaltText = this.f48924d;
                ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_600);
                gestaltText.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void L(int i13) {
        Integer valueOf = Integer.valueOf(i13);
        int intValue = valueOf.intValue();
        GestaltText gestaltText = this.f48924d;
        if (intValue > 0) {
            bs1.c.U1(gestaltText.i(new m4(this, intValue, 18)));
        } else {
            bs1.c.X0(gestaltText);
        }
        this.f48925e = valueOf;
    }

    @Override // rh1.z
    public final void Q(ge communityInsightHeaderItem) {
        Intrinsics.checkNotNullParameter(communityInsightHeaderItem, "communityInsightHeaderItem");
    }

    @Override // rh1.z
    public final void a5(boolean z13) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48921a == null) {
            this.f48921a = new o(this);
        }
        return this.f48921a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48921a == null) {
            this.f48921a = new o(this);
        }
        return this.f48921a.generatedComponent();
    }

    @Override // rh1.z
    public final void h6(String str, String commentId, y translationStatus) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(translationStatus, "translationStatus");
    }

    public final void inject() {
        if (this.f48922b) {
            return;
        }
        this.f48922b = true;
        jb jbVar = (jb) ((r) generatedComponent());
        this.f48923c = (w) jbVar.f113483a.f113885r0.get();
        s8 s8Var = jbVar.f113485c;
        s8Var.o5();
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
    public CommentCountHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48926f = true;
        this.f48927g = new q(this);
        View.inflate(getContext(), d.comment_count_header_view, this);
        View findViewById = findViewById(fb0.c.comment_count);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48924d = (GestaltText) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCountHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48926f = true;
        this.f48927g = new q(this);
        View.inflate(getContext(), d.comment_count_header_view, this);
        View findViewById = findViewById(fb0.c.comment_count);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48924d = (GestaltText) findViewById;
    }
}
