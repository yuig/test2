package com.pinterest.feature.ideaPinCreation.producttagging.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wa2.t;
import xk2.v;
import yk1.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/producttagging/view/IdeaPinProductTagsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinProductTagsItemView extends ConstraintLayout implements n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f46551k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f46552a;

    /* renamed from: b, reason: collision with root package name */
    public final v f46553b;

    /* renamed from: c, reason: collision with root package name */
    public final v f46554c;

    /* renamed from: d, reason: collision with root package name */
    public final v f46555d;

    /* renamed from: e, reason: collision with root package name */
    public final v f46556e;

    /* renamed from: f, reason: collision with root package name */
    public final v f46557f;

    /* renamed from: g, reason: collision with root package name */
    public final v f46558g;

    /* renamed from: h, reason: collision with root package name */
    public final v f46559h;

    /* renamed from: i, reason: collision with root package name */
    public final v f46560i;

    /* renamed from: j, reason: collision with root package name */
    public Function2 f46561j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IdeaPinProductTagsItemView(int r3, int r4, android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r2 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            r0 = 4
            r4 = r4 & r0
            r1 = 0
            if (r4 == 0) goto Lb
            r3 = r1
        Lb:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            r2.<init>(r5, r6, r3, r1)
            mv0.a0 r3 = new mv0.a0
            r4 = 2
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46552a = r3
            mv0.a0 r3 = new mv0.a0
            r4 = 3
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46553b = r3
            mv0.a0 r3 = new mv0.a0
            r4 = 7
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46554c = r3
            mv0.a0 r3 = new mv0.a0
            r4 = 6
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46555d = r3
            mv0.a0 r3 = new mv0.a0
            r4 = 1
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46556e = r3
            mv0.a0 r3 = new mv0.a0
            r3.<init>(r2, r0)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46557f = r3
            mv0.a0 r3 = new mv0.a0
            r4 = 5
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46558g = r3
            mv0.a0 r3 = new mv0.a0
            r3.<init>(r2, r1)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46559h = r3
            xo0.i r3 = new xo0.i
            r4 = 21
            r3.<init>(r5, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f46560i = r3
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r4 = -1
            r6 = -2
            r3.<init>(r4, r6)
            r2.setLayoutParams(r3)
            int r3 = aq1.f.view_idea_pin_creation_product_tags_item
            android.view.View.inflate(r5, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final t L() {
        return (t) this.f46560i.getValue();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        L().g(0);
        L().e(getResources().getDimensionPixelSize(c.pin_rating_default_icon_size));
        L().f(View.MeasureSpec.getSize(i13));
        L().h();
        Function2 function2 = this.f46561j;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinProductTagsItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinProductTagsItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
