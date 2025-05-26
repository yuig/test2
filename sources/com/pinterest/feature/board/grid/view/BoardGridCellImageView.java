package com.pinterest.feature.board.grid.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.pinterest.ui.brio.view.SquareFourImageView;
import dc0.h;
import hf0.b;
import hs1.m;
import hs1.t;
import hs1.z;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import qa2.c;
import sl0.a;

/* loaded from: classes5.dex */
public class BoardGridCellImageView extends SquareFourImageView implements a, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f45255s = 0;

    /* renamed from: m, reason: collision with root package name */
    public final c f45256m;

    /* renamed from: n, reason: collision with root package name */
    public String f45257n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45258o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f45259p;

    /* renamed from: q, reason: collision with root package name */
    public int f45260q;

    /* renamed from: r, reason: collision with root package name */
    public final ul0.a f45261r;

    public BoardGridCellImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45259p = new int[2];
        this.f45260q = -1;
        ul0.a aVar = new ul0.a(this, 0);
        this.f45261r = aVar;
        this.f45256m = new c(this);
        this.f52238l = aVar;
    }

    @Override // com.pinterest.ui.brio.view.SquareFourImageView
    public final void a(Canvas canvas) {
        g(canvas);
        if (!this.f45258o) {
            e(canvas);
            return;
        }
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = this.f52228b;
            int i15 = this.f52230d;
            b(i14 + i15, (this.f52229c + i15) * (i13 % 2), (c) this.f52227a.get(i13), canvas);
        }
        c cVar = this.f45256m;
        cVar.f103232a = 0;
        float f13 = this.f52228b;
        float f14 = (this.f52229c * 2) + this.f52230d;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        cVar.a(canvas, 0.0f, 0.0f, f13, f14, false);
    }

    @Override // com.pinterest.ui.brio.view.SquareFourImageView
    public final void k() {
        super.k();
        this.f45260q = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r5 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003b, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(ul0.c r11) {
        /*
            r10 = this;
            int[] r0 = r10.f45259p
            r1 = 1
            r0 = r0[r1]
            boolean r2 = r10.f45258o
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L3f
            java.lang.String r2 = r10.f45257n
            boolean r2 = pk.a0.D0(r2)
            if (r2 == 0) goto L3f
            float r2 = (float) r0
            int r5 = hf0.b.f69003c
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L1d
            r2 = r1
            goto L1e
        L1d:
            r2 = r4
        L1e:
            int[] r5 = ul0.b.f122446a
            int r6 = r11.ordinal()
            r5 = r5[r6]
            if (r5 == r1) goto L3b
            if (r5 == r3) goto L2b
            goto L3f
        L2b:
            qa2.c r5 = r10.f45256m
            android.graphics.Bitmap r5 = r5.c()
            if (r5 == 0) goto L35
            r5 = r1
            goto L36
        L35:
            r5 = r4
        L36:
            if (r2 == 0) goto L3f
            if (r5 == 0) goto L3f
            goto L3d
        L3b:
            if (r2 == 0) goto L3f
        L3d:
            r2 = r1
            goto L40
        L3f:
            r2 = r4
        L40:
            java.util.List r5 = r10.f52237k
            if (r5 == 0) goto L54
            int r5 = r5.size()
            boolean r6 = r10.f45258o
            if (r6 == 0) goto L4e
            r6 = r3
            goto L4f
        L4e:
            r6 = 4
        L4f:
            int r5 = java.lang.Math.min(r5, r6)
            goto L55
        L54:
            r5 = r4
        L55:
            r6 = r4
        L56:
            if (r6 >= r5) goto La1
            boolean r7 = r10.f45258o
            if (r7 == 0) goto L63
            int r7 = r10.f52229c
            int r8 = r10.f52230d
            int r7 = r7 + r8
            int r7 = r7 * r6
            goto L6b
        L63:
            int r7 = r6 / 2
            int r8 = r10.f52229c
            int r9 = r10.f52230d
            int r8 = r8 + r9
            int r7 = r7 * r8
        L6b:
            int r7 = r7 + r0
            float r7 = (float) r7
            int r8 = hf0.b.f69003c
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L76
            r7 = r1
            goto L77
        L76:
            r7 = r4
        L77:
            int[] r8 = ul0.b.f122446a
            int r9 = r11.ordinal()
            r8 = r8[r9]
            if (r8 == r1) goto L9a
            if (r8 == r3) goto L84
            goto L9e
        L84:
            java.util.ArrayList r8 = r10.f52227a
            java.lang.Object r8 = r8.get(r6)
            qa2.c r8 = (qa2.c) r8
            android.graphics.Bitmap r8 = r8.c()
            if (r8 == 0) goto L94
            r8 = r1
            goto L95
        L94:
            r8 = r4
        L95:
            if (r7 == 0) goto L9e
            if (r8 == 0) goto L9e
            goto L9c
        L9a:
            if (r7 == 0) goto L9e
        L9c:
            int r2 = r2 + 1
        L9e:
            int r6 = r6 + 1
            goto L56
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.board.grid.view.BoardGridCellImageView.l(ul0.c):int");
    }

    public final void m() {
        if (this.f45257n == null || this.f52228b == 0 || this.f52229c == 0) {
            return;
        }
        this.f45256m.f103242k = this.f45261r;
        z o13 = ((m) t.a()).o(this.f45257n, false);
        o13.f70086d = true;
        o13.f70087e = this.f52228b;
        o13.f70088f = (this.f52229c * 2) + this.f52230d;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        o13.a(this.f45256m);
    }

    public final void n() {
        int[] iArr = this.f45259p;
        getLocationOnScreen(iArr);
        float f13 = b.f69003c;
        int i13 = iArr[1];
        if ((i13 <= 0 || i13 < f13) && l(ul0.c.IMAGE_HAS_LOADED) == this.f45260q) {
            u.f85943a.d(new h(false));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.ui.brio.view.SquareFourImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        m();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int[] iArr = this.f45259p;
        getLocationOnScreen(iArr);
        int i13 = 0;
        boolean z13 = ((float) iArr[1]) < ((float) b.f69003c);
        if (this.f52228b != 0 && this.f52229c != 0 && !qb0.b.o(this.f52227a) && !qb0.b.o(this.f52237k) && z13) {
            i13 = l(ul0.c.IMAGE_IS_LOADING);
        }
        this.f45260q = i13;
        n();
        return true;
    }

    public BoardGridCellImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f45259p = new int[2];
        this.f45260q = -1;
        ul0.a aVar = new ul0.a(this, 0);
        this.f45261r = aVar;
        this.f45256m = new c(this);
        this.f52238l = aVar;
    }
}
