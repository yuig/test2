package qc2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ql2.g;
import ql2.s;

/* loaded from: classes2.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final r70.b f103523a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f103524b;

    /* renamed from: c, reason: collision with root package name */
    public final b f103525c;

    /* renamed from: d, reason: collision with root package name */
    public final b f103526d;

    /* renamed from: e, reason: collision with root package name */
    public final b f103527e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f103528f;

    public d(r70.b bottomNavBarState) {
        Intrinsics.checkNotNullParameter(bottomNavBarState, "bottomNavBarState");
        this.f103523a = bottomNavBarState;
        this.f103524b = new int[2];
        this.f103525c = new b(0, 0, 0, 0);
        this.f103526d = new b(0, 0, 0, 0);
        this.f103527e = new b(0, 0, 0, 0);
        this.f103528f = new ArrayList();
    }

    public final float b(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, Set obstructionViews, Context context) {
        float f13;
        float a13;
        Intrinsics.checkNotNullParameter(context, "context");
        int d2 = (bs1.c.c1(context) ? hf0.b.d(bs1.c.k0(context)) : hf0.b.g(context)) - ml2.c.c(this.f103523a.b());
        int i24 = context.getResources().getDisplayMetrics().widthPixels;
        if (d2 > 0) {
            i23 = s.g(i23, 0, d2);
        }
        if (i24 > 0) {
            i18 = s.g(i18, 0, i24);
        }
        if (d2 > 0) {
            i19 = s.g(i19, 0, d2);
        }
        if (i24 > 0) {
            i17 = s.g(i17, 0, i24);
        }
        int max = Math.max(0, Math.max(i17, 0) - i13);
        int i25 = i13 + i15;
        int max2 = Math.max(0, i25 - i18);
        int max3 = Math.max(0, i19 - i14);
        int i26 = i14 + i16;
        int i27 = i13 + max;
        int max4 = i26 - Math.max(0, i26 - i23);
        b videoViewRect = this.f103525c;
        videoViewRect.f103519a = i27;
        videoViewRect.f103520b = i14 + max3;
        videoViewRect.f103521c = i25 - max2;
        videoViewRect.f103522d = max4;
        int i28 = i15 * i16;
        if (i28 > 0.0d) {
            if (obstructionViews != null) {
                Intrinsics.checkNotNullParameter(videoViewRect, "videoViewRect");
                Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
                a13 = videoViewRect.a();
                ArrayList arrayList = this.f103528f;
                arrayList.clear();
                Iterator it = CollectionsKt.K(obstructionViews).iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    b bVar2 = this.f103526d;
                    bVar2.c(bVar);
                    if (bVar2.b(videoViewRect)) {
                        a13 -= bVar2.a();
                        b bVar3 = this.f103527e;
                        bVar3.c(bVar2);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            b bVar4 = (b) it2.next();
                            Intrinsics.f(bVar4);
                            if (bVar3.b(bVar4)) {
                                a13 += bVar3.a();
                                bVar3.c(bVar2);
                            }
                        }
                        arrayList.add(bVar);
                    }
                }
            } else {
                a13 = videoViewRect.a();
            }
            f13 = a13 / i28;
        } else {
            f13 = 0.0f;
        }
        return ((Number) s.k(Float.valueOf(f13), new g(0.0f, 1.0f))).floatValue() * 100;
    }

    public final float c(View view, int i13, int i14, int i15, int i16, View viewParent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        int[] iArr = this.f103524b;
        viewParent.getLocationInWindow(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int c13 = ml2.c.c(view.getX()) + i17 + i13;
        int c14 = ml2.c.c(view.getY()) + i18 + i14;
        int paddingStart = viewParent.getPaddingStart() + i17;
        int width = (viewParent.getWidth() + i17) - viewParent.getPaddingEnd();
        int paddingTop = viewParent.getPaddingTop() + i18;
        int height = (viewParent.getHeight() + i18) - viewParent.getPaddingBottom();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return b(c13, c14, i15, i16, paddingStart, width, paddingTop, height, null, context);
    }

    public final float d(View view, View viewParent, Set set) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        int[] iArr = this.f103524b;
        viewParent.getLocationInWindow(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int paddingStart = viewParent.getPaddingStart() + i13;
        int width = (viewParent.getWidth() + i13) - viewParent.getPaddingEnd();
        int paddingTop = viewParent.getPaddingTop() + i14;
        int height = (viewParent.getHeight() + i14) - viewParent.getPaddingBottom();
        view.getLocationInWindow(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return b(i15, i16, width2, height2, paddingStart, width, paddingTop, height, set, context);
    }

    public final boolean e(View view, View viewParent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        return d(view, viewParent, null) > 0.0f;
    }

    public /* synthetic */ d() {
        this(r70.b.f106349i.k0());
    }
}
