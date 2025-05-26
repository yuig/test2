package com.pinterest.feature.pearlibrary.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.u;
import com.pinterest.api.model.p20;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h01.d;
import h01.h;
import h01.i;
import h01.j;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import h32.x3;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pearlibrary/view/PearStyleTagsScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pearLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PearStyleTagsScrollView extends HorizontalScrollView implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f46877i = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f46878a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46879b;

    /* renamed from: c, reason: collision with root package name */
    public w f46880c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f46881d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46882e;

    /* renamed from: f, reason: collision with root package name */
    public String f46883f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46884g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f46885h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearStyleTagsScrollView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f46883f = "";
        this.f46884g = bs1.c.W(this, eo1.c.space_200);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        this.f46885h = linearLayout;
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
        setClipToPadding(false);
        addView(linearLayout);
    }

    public static void b(PearStyleTagsScrollView pearStyleTagsScrollView, f1 f1Var, u0 u0Var, HashMap hashMap, int i13) {
        HashMap hashMap2;
        x3 x3Var;
        if ((i13 & 1) != 0) {
            f1Var = f1.TAP;
        }
        f1 f1Var2 = f1Var;
        u0 u0Var2 = (i13 & 2) != 0 ? null : u0Var;
        d0 d0Var = pearStyleTagsScrollView.f46881d;
        if (d0Var != null) {
            g0 g0Var = g0.PEAR_STYLE_PILLS;
            i0 p13 = d0Var.p();
            String str = (p13 == null || (x3Var = p13.f67083c) == null) ? null : x3Var.f67402f;
            d0 d0Var2 = pearStyleTagsScrollView.f46881d;
            if (d0Var2 == null || (hashMap2 = d0Var2.f()) == null) {
                hashMap2 = new HashMap();
            }
            HashMap hashMap3 = hashMap2;
            hashMap3.putAll(hashMap);
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap3, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public static void d(PearStyleTagsScrollView pearStyleTagsScrollView, List list) {
        pearStyleTagsScrollView.c(list, new i(1, pearStyleTagsScrollView, PearStyleTagsScrollView.class, "defaultOnTapAction", "defaultOnTapAction(Lcom/pinterest/api/model/PearStyle;)V", 0));
    }

    public final void a() {
        if (this.f46879b) {
            return;
        }
        this.f46879b = true;
        this.f46880c = (w) ((jb) ((j) generatedComponent())).f113483a.f113885r0.get();
    }

    public final void c(List styles, Function1 onTapAction) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        LinearLayout linearLayout = this.f46885h;
        linearLayout.removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u uVar = new u(context);
        List list = styles;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            p20 p20Var = (p20) obj;
            int i15 = uVar.f19640b + 1;
            uVar.f19640b = i15;
            int[] iArr = uVar.f19639a;
            int i16 = iArr[i15 % iArr.length];
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String q13 = p20Var.q();
            if (q13 == null) {
                q13 = "";
            }
            View hVar = new h(context2, q13, false, 0, i16, 0, new c01.c(onTapAction, p20Var, 1), 44);
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i13 == 0 ? 0 : this.f46884g);
            hVar.setLayoutParams(marginLayoutParams);
            linearLayout.addView(hVar);
            i13 = i14;
        }
        if (this.f46882e || !(!styles.isEmpty())) {
            return;
        }
        f1 f1Var = f1.VIEW;
        HashMap hashMap = new HashMap();
        hashMap.put("style_ids", CollectionsKt.Z(list, ",", null, null, 0, null, d.f66428l, 30));
        Unit unit = Unit.f80348a;
        b(this, f1Var, null, hashMap, 2);
        this.f46882e = true;
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f46878a == null) {
            this.f46878a = new o(this);
        }
        return this.f46878a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46878a == null) {
            this.f46878a = new o(this);
        }
        return this.f46878a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearStyleTagsScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f46883f = "";
        this.f46884g = bs1.c.W(this, eo1.c.space_200);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        this.f46885h = linearLayout;
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
        setClipToPadding(false);
        addView(linearLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearStyleTagsScrollView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        this.f46883f = "";
        this.f46884g = bs1.c.W(this, eo1.c.space_200);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        this.f46885h = linearLayout;
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
        setClipToPadding(false);
        addView(linearLayout);
    }
}
