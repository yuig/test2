package com.pinterest.feature.board.detail.floatingtoolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import bs1.c;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import d7.b;
import d70.d;
import d70.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oq.p;
import org.jetbrains.annotations.NotNull;
import sk0.a;
import xa0.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/board/detail/floatingtoolbar/FloatingToolbarView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FloatingToolbarView extends CardView {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45199i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f45200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingToolbarView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View inflate = View.inflate(context, e.view_floating_toolbar, this);
        View findViewById = inflate.findViewById(d.floating_tool_list);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45200h = (LinearLayout) findViewById;
        c.X0(inflate);
    }

    public final View D(sk0.c toolType) {
        Object obj;
        Intrinsics.checkNotNullParameter(toolType, "toolType");
        Iterator it = b.O(this.f45200h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((View) obj).getTag(), toolType.name())) {
                break;
            }
        }
        return (View) obj;
    }

    public final void x(List floatingTools, Function1 onClick, Function1 onView) {
        Map map;
        Intrinsics.checkNotNullParameter(floatingTools, "floatingTools");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onView, "onView");
        LinearLayout linearLayout = this.f45200h;
        linearLayout.removeAllViews();
        int i13 = 1;
        c.R1(this, !floatingTools.isEmpty());
        Iterator it = floatingTools.iterator();
        int i14 = 0;
        int i15 = 0;
        while (it.hasNext()) {
            a displayState = (a) it.next();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            p pVar = new p(context, 1);
            onView.invoke(Integer.valueOf(displayState.f113046c));
            Intrinsics.checkNotNullParameter(displayState, "displayState");
            GestaltIcon gestaltIcon = (GestaltIcon) pVar.f97116a;
            dl2.b.z(gestaltIcon, new rk0.d(displayState, i13));
            gestaltIcon.setRotationY(displayState.f113048e ? 180.0f : 0.0f);
            ((GestaltText) pVar.f97117b).i(new rk0.d(displayState, 2));
            pVar.setOnClickListener(new m(displayState, onClick));
            pVar.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(d70.b.board_floating_tool_max_width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = pVar.getMeasuredHeight();
            if (i15 < measuredHeight) {
                i15 = measuredHeight;
            }
            int measuredWidth = pVar.getMeasuredWidth();
            if (i14 < measuredWidth) {
                i14 = measuredWidth;
            }
            sk0.c.Companion.getClass();
            map = sk0.c.positionMap;
            sk0.c cVar = (sk0.c) map.get(Integer.valueOf(displayState.f113046c));
            pVar.setTag(cVar != null ? cVar.name() : null);
            linearLayout.addView(pVar);
        }
        int childCount = linearLayout.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = linearLayout.getChildAt(i16);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i14;
            layoutParams2.height = i15;
            childAt.setLayoutParams(layoutParams2);
        }
    }
}
