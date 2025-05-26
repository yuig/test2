package com.pinterest.ui.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import cb2.b0;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Timer;
import java.util.WeakHashMap;
import ne0.b;
import pe.j;
import pl1.c;
import q5.v0;
import tb0.g;
import tb0.h;

/* loaded from: classes4.dex */
public class SpringLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public Timer f52627a;

    /* renamed from: b, reason: collision with root package name */
    public c[][] f52628b;

    /* renamed from: c, reason: collision with root package name */
    public b0[][] f52629c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52630d;

    /* renamed from: e, reason: collision with root package name */
    public final j f52631e;

    /* renamed from: f, reason: collision with root package name */
    public final b f52632f;

    public SpringLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52631e = new j(this, 2);
        this.f52632f = new b(this, 9);
    }

    public void a() {
        Timer timer = this.f52627a;
        if (timer != null) {
            timer.cancel();
            this.f52627a.purge();
            this.f52631e.cancel();
            this.f52627a = null;
        }
    }

    public final void b() {
        b0 b0Var;
        for (int i13 = 0; i13 < this.f52628b.length; i13++) {
            View childAt = getChildAt(i13);
            int i14 = 0;
            while (true) {
                c[] cVarArr = this.f52628b[i13];
                if (i14 < cVarArr.length) {
                    c cVar = cVarArr[i14];
                    if (cVar != null && cVar.c()) {
                        float a13 = cVar.a();
                        setVisibility(0);
                        childAt.setVisibility(0);
                        if (i14 == 0) {
                            childAt.setTranslationX(a13);
                        } else if (i14 == 1) {
                            childAt.setTranslationY(a13);
                        } else if (i14 == 2) {
                            childAt.setScaleX(a13);
                            childAt.setScaleY(a13);
                            if (a13 == 0.0f) {
                                childAt.setVisibility(4);
                            }
                        } else if (i14 == 3) {
                            if (a13 > 1.0f) {
                                a13 = 1.0f;
                            } else if (a13 < 0.0f) {
                                a13 = 0.0f;
                            }
                            childAt.setAlpha(a13);
                        }
                        if (!cVar.c() && (b0Var = this.f52629c[i13][i14]) != null) {
                            b0Var.a();
                            this.f52629c[i13][i14] = null;
                        }
                    }
                    i14++;
                }
            }
        }
        try {
            WeakHashMap weakHashMap = v0.f102521a;
            postInvalidateOnAnimation();
        } catch (Exception e13) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e13);
        }
    }

    public void c() {
        if (this.f52627a != null || this.f52630d) {
            return;
        }
        Timer timer = new Timer("Timer Thread - " + toString(), true);
        this.f52627a = timer;
        timer.scheduleAtFixedRate(this.f52631e, 0L, 16L);
    }

    public final void d(int i13, float f13, float f14, float f15, float f16, b0 b0Var) {
        if (this.f52628b == null) {
            int childCount = getChildCount();
            this.f52628b = (c[][]) Array.newInstance((Class<?>) c.class, childCount, 4);
            this.f52629c = (b0[][]) Array.newInstance((Class<?>) b0.class, childCount, 4);
        }
        c[] cVarArr = this.f52628b[0];
        c cVar = cVarArr[i13];
        if (cVar == null) {
            cVarArr[i13] = new c(f13, f14, f15, f16);
        } else {
            cVar.f100566b = f14;
            cVar.f100567c = f15;
            cVar.f100568d = f16;
            cVar.f100573i = true;
            b0 b0Var2 = this.f52629c[0][i13];
        }
        this.f52629c[0][i13] = b0Var;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52630d = true;
        a();
    }
}
