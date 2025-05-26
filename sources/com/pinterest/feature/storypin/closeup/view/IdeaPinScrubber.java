package com.pinterest.feature.storypin.closeup.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import bs1.c;
import dl2.b;
import eo1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf1.n0;
import sf1.o0;
import sf1.p0;
import sf1.q0;
import sf1.r0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/storypin/closeup/view/IdeaPinScrubber;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "sf1/a0", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinScrubber extends AppCompatSeekBar {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f48558n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f48559b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f48560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48561d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48562e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48563f;

    /* renamed from: g, reason: collision with root package name */
    public int f48564g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f48565h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f48566i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f48567j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f48568k;

    /* renamed from: l, reason: collision with root package name */
    public long f48569l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinScrubber(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint.setColor(b.x0(context2, a.color_white_mochimalist_0_opacity_20));
        this.f48559b = paint;
        Paint paint2 = new Paint(1);
        int i13 = eo1.b.color_white_0;
        Context context3 = getContext();
        Object obj = d5.a.f53679a;
        paint2.setColor(context3.getColor(i13));
        this.f48560c = paint2;
        getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_timestamp_top_padding);
        this.f48561d = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_top_padding);
        this.f48562e = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_height);
        this.f48563f = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_spacing);
        this.f48565h = new ArrayList();
        this.f48566i = new LinkedHashMap();
        this.f48567j = new ArrayList();
        this.f48568k = new ArrayList();
        setMax(1000);
    }

    public static q0 e(float f13) {
        return f13 <= 0.0f ? n0.f112662b : f13 >= 100.0f ? o0.f112669b : new p0(f13);
    }

    public final void a(List pagesDurationPercentage) {
        Intrinsics.checkNotNullParameter(pagesDurationPercentage, "pagesDurationPercentage");
        int c13 = c() - ((this.f48564g - 1) * this.f48563f);
        ArrayList arrayList = this.f48565h;
        arrayList.clear();
        List list = pagesDurationPercentage;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf((int) (((Number) it.next()).floatValue() * c13)));
        }
        arrayList.addAll(arrayList2);
    }

    public final long b(int i13) {
        ArrayList arrayList = this.f48568k;
        if (i13 >= arrayList.size()) {
            return 0L;
        }
        return ((Number) arrayList.get(i13)).longValue();
    }

    public final int c() {
        if (getWidth() <= 0) {
            return 0;
        }
        return getWidth() - (getPaddingEnd() + getPaddingStart());
    }

    public final float d(int i13) {
        q0 q0Var = (q0) this.f48566i.get(Integer.valueOf(i13));
        if (q0Var != null) {
            return q0Var.f112682a;
        }
        return 0.0f;
    }

    public final void f(List list, boolean z13) {
        q0 q0Var = z13 ? o0.f112669b : n0.f112662b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new r0(((Number) it.next()).intValue(), q0Var));
        }
        h(arrayList);
    }

    public final void g(int i13, float f13) {
        if (i13 >= 0) {
            ArrayList arrayList = this.f48565h;
            if (arrayList.size() < 1 || this.f48570m || f13 > 1.0f || i13 >= arrayList.size()) {
                return;
            }
            h(e0.b(new r0(i13, e(f13))));
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                i14 += ((Number) arrayList.get(i15)).intValue();
            }
            float floatValue = (((i14 + (this.f48563f * i13)) + (((Number) arrayList.get(i13)).floatValue() * f13)) / c()) * 1000;
            for (int i16 = 0; i16 < i13; i16++) {
                q0 q0Var = (q0) this.f48566i.get(Integer.valueOf(c.l1(this) ? (this.f48564g - i16) - 1 : i16));
                if (!Intrinsics.c(q0Var != null ? Float.valueOf(q0Var.f112682a) : null, 1.0f)) {
                    h(e0.b(new r0(i16, e(1.0f))));
                }
            }
            setProgress((int) floatValue);
        }
    }

    public final void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            int i13 = r0Var.f112692a;
            if (c.l1(this)) {
                i13 = (this.f48564g - i13) - 1;
            }
            this.f48566i.put(Integer.valueOf(i13), r0Var.f112693b);
        }
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float d2;
        float f13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float paddingStart = getPaddingStart();
        int i13 = this.f48564g;
        int i14 = 0;
        int i15 = 0;
        while (i15 < i13) {
            ArrayList arrayList = this.f48565h;
            if (arrayList.size() == 1 && ((Number) arrayList.get(i14)).intValue() == 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f48567j);
                a(arrayList2);
            }
            float floatValue = ((Number) arrayList.get(i15)).floatValue() + paddingStart;
            float f14 = this.f48561d;
            float f15 = f14 + this.f48562e;
            LinkedHashMap linkedHashMap = this.f48566i;
            q0 q0Var = (q0) linkedHashMap.get(Integer.valueOf(i15));
            n0 n0Var = n0.f112662b;
            if (q0Var == null) {
                q0Var = n0Var;
            }
            boolean z13 = q0Var instanceof o0;
            Paint paint = this.f48560c;
            canvas.drawRoundRect(paddingStart, f14, floatValue, f15, 20.0f, 20.0f, z13 ? paint : this.f48559b);
            q0 q0Var2 = (q0) linkedHashMap.get(Integer.valueOf(i15));
            if (q0Var2 == null) {
                q0Var2 = n0Var;
            }
            if (q0Var2 instanceof p0) {
                if (c.l1(this)) {
                    f13 = floatValue - (d(i15) * ((Number) arrayList.get(i15)).floatValue());
                    d2 = floatValue;
                } else {
                    d2 = (d(i15) * ((Number) arrayList.get(i15)).floatValue()) + paddingStart;
                    f13 = paddingStart;
                }
                canvas.drawRoundRect(f13, f14, d2, f15, 20.0f, 20.0f, paint);
            }
            paddingStart += ((Number) arrayList.get(i15)).intValue() + this.f48563f;
            i15++;
            i14 = 0;
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinScrubber(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint.setColor(b.x0(context2, a.color_white_mochimalist_0_opacity_20));
        this.f48559b = paint;
        Paint paint2 = new Paint(1);
        int i14 = eo1.b.color_white_0;
        Context context3 = getContext();
        Object obj = d5.a.f53679a;
        paint2.setColor(context3.getColor(i14));
        this.f48560c = paint2;
        getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_timestamp_top_padding);
        this.f48561d = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_top_padding);
        this.f48562e = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_height);
        this.f48563f = getResources().getDimensionPixelSize(pq1.b.idea_pin_scrubber_page_spacing);
        this.f48565h = new ArrayList();
        this.f48566i = new LinkedHashMap();
        this.f48567j = new ArrayList();
        this.f48568k = new ArrayList();
        setMax(1000);
    }
}
