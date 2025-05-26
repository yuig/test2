package com.pinterest.ui.recyclerview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc1.c;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.text.GestaltText;
import d02.b;
import dl1.s;
import eb2.f;
import i11.m;
import java.util.Locale;
import java.util.WeakHashMap;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import q5.v0;

/* loaded from: classes4.dex */
public class FastScrollerView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f52633a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f52634b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f52635c;

    /* renamed from: d, reason: collision with root package name */
    public int f52636d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView f52637e;

    /* renamed from: f, reason: collision with root package name */
    public ObjectAnimator f52638f;

    /* renamed from: g, reason: collision with root package name */
    public f f52639g;

    /* renamed from: h, reason: collision with root package name */
    public final c f52640h;

    public FastScrollerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52640h = new c(this, 9);
        a(context);
    }

    public final void a(Context context) {
        View.inflate(context, d02.c.fast_scroller_view, this);
        this.f52633a = (ImageView) findViewById(b.fastscroller_handle);
        this.f52634b = (FrameLayout) findViewById(b.fastscroller_bubble);
        this.f52635c = (GestaltText) findViewById(b.fastscroller_bubble_text);
        k3.Q1(this.f52634b, 4);
        setOrientation(0);
        setClipChildren(false);
    }

    public final void b(float f13) {
        int height = this.f52633a.getHeight();
        ImageView imageView = this.f52633a;
        int i13 = this.f52636d - height;
        int i14 = height / 2;
        imageView.setY(Math.min(Math.max(0, (int) (f13 - i14)), i13));
        int height2 = this.f52634b.getHeight();
        this.f52634b.setY(Math.min(Math.max(0, (int) (f13 - height2)), (this.f52636d - height2) - i14));
    }

    public final void c(f fVar) {
        this.f52639g = fVar;
    }

    public final void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        if (recyclerView == null || (recyclerView2 = this.f52637e) == recyclerView) {
            return;
        }
        c cVar = this.f52640h;
        if (recyclerView2 != null) {
            recyclerView2.w2(cVar);
        }
        this.f52637e = recyclerView;
        recyclerView.o(cVar);
    }

    public final void e(MotionEvent motionEvent) {
        String str;
        float y13 = motionEvent.getY();
        b(y13);
        RecyclerView recyclerView = this.f52637e;
        if (recyclerView == null || this.f52639g == null) {
            return;
        }
        int e13 = recyclerView.f19240m.e();
        float f13 = 0.0f;
        if (this.f52633a.getY() != 0.0f) {
            float y14 = this.f52633a.getY() + this.f52633a.getHeight();
            int i13 = this.f52636d;
            f13 = y14 >= ((float) (i13 + (-5))) ? 1.0f : y13 / i13;
        }
        int i14 = (int) (f13 * e13);
        int min = Math.min(Math.max(0, i14), e13 - 1);
        ((LinearLayoutManager) this.f52637e.f19242n).B1(min, 0);
        s sVar = (s) ((m) this.f52639g).getItem(min);
        if (sVar != null) {
            v7 v7Var = (v7) sVar;
            String j13 = v7Var.j1();
            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
            if (j13.length() > 0) {
                String valueOf = String.valueOf(v7Var.j1().charAt(0));
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                str = valueOf.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                if (!a0.x0(str) || i14 <= 0) {
                    k3.Q1(this.f52634b, 4);
                } else {
                    a0.p(this.f52635c, str);
                    k3.Q1(this.f52634b, 0);
                    return;
                }
            }
        }
        str = "";
        if (a0.x0(str)) {
        }
        k3.Q1(this.f52634b, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = this.f52637e;
        if (recyclerView != null) {
            recyclerView.w2(this.f52640h);
            this.f52637e = null;
        }
        if (this.f52638f != null) {
            this.f52638f = null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f52636d = i14;
        RecyclerView recyclerView = this.f52637e;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            float computeVerticalScrollRange = this.f52637e.computeVerticalScrollRange();
            float f13 = this.f52636d;
            b((computeVerticalScrollOffset / (computeVerticalScrollRange - f13)) * f13);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    e(motionEvent);
                    return true;
                }
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            this.f52633a.setSelected(false);
            ObjectAnimator objectAnimator = this.f52638f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f52634b, "alpha", 1.0f, 0.0f).setDuration(100L);
            this.f52638f = duration;
            duration.addListener(new d(this, 25));
            this.f52638f.start();
            return true;
        }
        float x13 = motionEvent.getX();
        float x14 = this.f52633a.getX();
        ImageView imageView = this.f52633a;
        WeakHashMap weakHashMap = v0.f102521a;
        if (x13 < x14 - imageView.getPaddingStart()) {
            return false;
        }
        ObjectAnimator objectAnimator2 = this.f52638f;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        if (this.f52634b.getVisibility() == 4) {
            k3.Q1(this.f52634b, 0);
            ObjectAnimator objectAnimator3 = this.f52638f;
            if (objectAnimator3 != null) {
                objectAnimator3.cancel();
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f52634b, "alpha", 0.0f, 1.0f).setDuration(100L);
            this.f52638f = duration2;
            duration2.start();
        }
        this.f52633a.setSelected(true);
        e(motionEvent);
        return true;
    }

    public FastScrollerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52640h = new c(this, 9);
        a(context);
    }
}
