package com.pinterest.feature.sharesheet.view.previewcarousel;

import a.z0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import androidx.viewpager2.widget.ViewPager2;
import ed1.l0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends FrameLayout implements yk1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f48439c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ViewPager2 f48440a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f48441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        j jVar = new j(this);
        View.inflate(getContext(), a62.d.view_sharesheet_preview_carousel, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        View findViewById = findViewById(a62.c.carousel_viewpager);
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setLayoutAnimation(null);
        viewPager2.l(new z0(viewPager2, 0));
        viewPager2.f(jVar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48440a = viewPager2;
    }

    public final i a(int i13) {
        Object obj;
        ViewPager2 viewPager2 = this.f48440a;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        Iterator it = d7.b.O(viewPager2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof RecyclerView) {
                break;
            }
        }
        RecyclerView recyclerView = obj instanceof RecyclerView ? (RecyclerView) obj : null;
        y2 S0 = recyclerView != null ? recyclerView.S0(i13) : null;
        if (S0 instanceof i) {
            return (i) S0;
        }
        return null;
    }
}
