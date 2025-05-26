package com.pinterest.ads.feature.waista.view;

import af2.b;
import af2.c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bumptech.glide.d;
import ev.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.m2;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.g;
import m60.s0;
import org.jetbrains.annotations.NotNull;
import ql2.k;
import ql2.s;
import rq.r2;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/waista/view/GenAiDisclosureSkeletonLoadingView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GenAiDisclosureSkeletonLoadingView extends View implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f35408h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f35409a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35410b;

    /* renamed from: c, reason: collision with root package name */
    public final g f35411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35412d;

    /* renamed from: e, reason: collision with root package name */
    public final tn1.c f35413e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f35414f;

    /* renamed from: g, reason: collision with root package name */
    public AnimatorSet f35415g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenAiDisclosureSkeletonLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(900L);
        ofFloat.addUpdateListener(new androidx.media3.ui.c(this, 10));
        ofFloat.addListener(new j(this, 0));
        ofFloat.start();
    }

    public final void b(long j13) {
        animate().alpha(0.0f).setDuration(j13).setListener(new j(this, 1));
    }

    public final void c() {
        setVisibility(0);
        if (this.f35415g != null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.4f, 1.0f);
        ofFloat.setDuration(900L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.4f);
        ofFloat2.setDuration(900L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new r2(1));
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
        this.f35415g = animatorSet;
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f35409a == null) {
            this.f35409a = new o(this);
        }
        return this.f35409a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f35409a == null) {
            this.f35409a = new o(this);
        }
        return this.f35409a.generatedComponent();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        Object obj;
        String str;
        int size = View.MeasureSpec.getSize(i13);
        CharSequence charSequence = this.f35414f;
        StaticLayout z13 = d.z(charSequence, charSequence.length(), this.f35413e, size, Layout.Alignment.ALIGN_NORMAL, null, size, Integer.MAX_VALUE);
        IntRange q13 = s.q(0, z13.getLineCount());
        ArrayList arrayList = new ArrayList(g0.q(q13, 10));
        k it = q13.iterator();
        while (it.f104109c) {
            int b13 = it.b();
            int lineStart = z13.getLineStart(b13);
            int lineVisibleEnd = z13.getLineVisibleEnd(b13);
            if (lineStart < 0 || lineVisibleEnd > z13.getText().length()) {
                str = "";
            } else {
                str = z13.getText().toString().substring(lineStart, lineVisibleEnd);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            Rect rect = new Rect();
            this.f35413e.getTextBounds(str, 0, str.length(), rect);
            arrayList.add(rect);
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int width = ((Rect) next).width();
                do {
                    Object next2 = it2.next();
                    int width2 = ((Rect) next2).width();
                    if (width < width2) {
                        next = next2;
                        width = width2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Rect rect2 = (Rect) obj;
        if (rect2 != null) {
            size = rect2.width();
        }
        setMeasuredDimension(size, View.MeasureSpec.getMode(i14) == 1073741824 ? View.MeasureSpec.getSize(i14) : this.f35412d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenAiDisclosureSkeletonLoadingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        CharSequence string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f35410b) {
            this.f35410b = true;
            this.f35411c = ((jb) ((ev.k) generatedComponent())).f113483a.p2();
        }
        setBackgroundResource(s0.rounded_rect_grid_pin_placeholder);
        this.f35412d = getResources().getDimensionPixelSize(eo1.c.space_400);
        this.f35413e = new tn1.c(context, new tn1.b((vn1.c) null, (List) null, vn1.g.BODY_300, 7));
        g gVar = this.f35411c;
        if (gVar == null) {
            Intrinsics.r("adsExperiments");
            throw null;
        }
        if (gVar.d()) {
            string = m2.C0(context, ps.s.ads_gen_ai_modified_with_ai, getResources().getString(ps.s.ads_gen_ai_modified_with_ai_learn_more));
        } else {
            string = getResources().getString(ps.s.ads_gen_ai_modified);
            Intrinsics.f(string);
        }
        this.f35414f = string;
    }
}
