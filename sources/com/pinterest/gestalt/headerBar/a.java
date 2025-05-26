package com.pinterest.gestalt.headerBar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import df.j1;
import ek.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import nm1.c0;
import nm1.d0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ GestaltHeaderBar f49378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f49379j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Map f49380k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f49381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GestaltTabLayout f49382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0 f49383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GestaltHeaderBar gestaltHeaderBar, d0 d0Var, Map map, Map map2, GestaltTabLayout gestaltTabLayout, f0 f0Var) {
        super(1);
        this.f49378i = gestaltHeaderBar;
        this.f49379j = d0Var;
        this.f49380k = map;
        this.f49381l = map2;
        this.f49382m = gestaltTabLayout;
        this.f49383n = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List tabItems = (List) obj;
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        GestaltHeaderBar gestaltHeaderBar = this.f49378i;
        Context context = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int F0 = dl2.b.F0(context, eo1.a.sema_space_200);
        Context context2 = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int F02 = dl2.b.F0(context2, eo1.a.sema_space_300);
        Context context3 = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int F03 = dl2.b.F0(context3, eo1.a.sema_space_100);
        d0 d0Var = this.f49379j;
        int a13 = d0Var.a();
        Map map = this.f49380k;
        map.clear();
        Map map2 = this.f49381l;
        map2.clear();
        List list = tabItems;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            GestaltTabLayout gestaltTabLayout = this.f49382m;
            if (!hasNext) {
                if (d0Var.a() > tabItems.size()) {
                    throw new GestaltHeaderBar.GestaltHeaderBarException(a.a.e("Tab index ", a13, " out-of-bounds."));
                }
                gestaltTabLayout.E(d0Var.a(), arrayList);
                this.f49383n.f80424a = true;
                return Unit.f80348a;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            c0 c0Var = (c0) next;
            Iterator it2 = it;
            e I = j1.I(gestaltTabLayout, c0Var.f91390a, c0Var.f91391b, null, 24);
            View view = I.f59129f;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = -2;
            }
            View view2 = I.f59129f;
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                pp2.a.P0(marginLayoutParams2, F02, F0, F02, F0);
            }
            View view3 = I.f59129f;
            if (view3 != null) {
                view3.setPaddingRelative(0, 0, 0, F03);
            }
            map.put(I, Integer.valueOf(i13));
            map2.put(Integer.valueOf(i13), I);
            arrayList.add(I);
            it = it2;
            i13 = i14;
        }
    }
}
