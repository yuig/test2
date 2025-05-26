package com.pinterest.activity.pin.view.unifiedcomments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.a;
import nx.d0;
import nx.f0;
import nx.j0;
import nx.m;
import ob2.f;
import org.jetbrains.annotations.NotNull;
import rq.l2;
import uq.d;
import uq.u;
import xo.s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/activity/pin/view/unifiedcomments/CommentsQuickReplies;", "Landroid/widget/LinearLayout;", "Lnx/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommentsQuickReplies extends s implements a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f35113k = 0;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f35114d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f35115e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35116f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f35117g;

    /* renamed from: h, reason: collision with root package name */
    public String f35118h;

    /* renamed from: i, reason: collision with root package name */
    public a4 f35119i;

    /* renamed from: j, reason: collision with root package name */
    public d4 f35120j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsQuickReplies(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(this.f35120j, this.f35119i, null, g0.COMMENT_COMPOSER, null, null);
    }

    public final void i(f0 pinalyticsFactory, String pinId) {
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f35118h = pinId;
        this.f35117g = ((m) pinalyticsFactory).a(this);
        j();
    }

    public final void j() {
        removeAllViews();
        int size = this.f35114d.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, context, (AttributeSet) null);
            String str = (String) this.f35114d.get(i14);
            GestaltButton d2 = smallPrimaryButton.d(new l2(str, 8));
            int dimensionPixelSize = d2.getResources().getDimensionPixelSize(r0.margin);
            int dimensionPixelSize2 = d2.getResources().getDimensionPixelSize(r0.margin_half);
            smallPrimaryButton.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            int dimensionPixelSize3 = d2.getResources().getDimensionPixelSize(r0.margin_quarter);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(dimensionPixelSize3);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            layoutParams.setMarginEnd(dimensionPixelSize3);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            smallPrimaryButton.setLayoutParams(layoutParams);
            smallPrimaryButton.e(new u(this, str, i14, i13));
            addView(smallPrimaryButton);
        }
        if (this.f35116f) {
            return;
        }
        this.f35116f = true;
        j0 j0Var = this.f35117g;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        f1 f1Var = f1.COMMENT_HELPER_VIEWED;
        String str2 = this.f35118h;
        if (str2 == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        d0.v(j0Var, f1Var, str2, false, 12);
    }

    public final void k(Function1 onClickReply) {
        Intrinsics.checkNotNullParameter(onClickReply, "onClickReply");
        this.f35115e = onClickReply;
    }

    public final void l(a4 a4Var) {
        this.f35119i = a4Var;
    }

    public final void m(d4 d4Var) {
        this.f35120j = d4Var;
    }

    public final ArrayList n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = getContext().getString(((Number) it.next()).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(string);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsQuickReplies(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35114d = n(kotlin.collections.f0.j(Integer.valueOf(f.comment_templates_eyes), Integer.valueOf(f.comment_templates_clap), Integer.valueOf(f.comment_templates_fire), Integer.valueOf(f.comment_templates_pin), Integer.valueOf(f.comment_templates_love_it), Integer.valueOf(f.comment_templates_mind_blown), Integer.valueOf(f.comment_templates_goals), Integer.valueOf(f.comment_templates_taps_save)));
        setOrientation(0);
        this.f35115e = d.f122999w;
        setGravity(16);
    }
}
