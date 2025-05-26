package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import d5.a;
import eo1.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lp.n;
import tn1.c;
import vn1.g;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/conversation/view/GroupUserImageView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp/n", "avatarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GroupUserImageView extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap[] f34870c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f34871d;

    /* renamed from: e, reason: collision with root package name */
    public Canvas f34872e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect[] f34873f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f34874g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f34875h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f34876i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f34877j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f34878k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f34879l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f34880m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f34881n;

    public GroupUserImageView(Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Canvas canvas2 = this.f34872e;
        if (canvas2 == null) {
            return;
        }
        Context context = getContext();
        int i13 = b.color_gray_500;
        Object obj = a.f53679a;
        canvas2.drawColor(context.getColor(i13));
        Rect[] rectArr = this.f34873f;
        int length = rectArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            boolean z13 = true;
            if ((Math.min(this.f34881n.size(), 3) != 2 || i14 > 1) && (Math.min(this.f34881n.size(), 3) != 3 || i14 != 0)) {
                z13 = false;
            }
            Bitmap bitmap = this.f34870c[i14];
            Rect rect = rectArr[i14];
            if (rect != null && !rect.isEmpty() && bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Rect rect2 = this.f34874g;
                rect2.set(0, 0, width, height);
                if (z13) {
                    int width2 = rect2.width();
                    rect2.left = width2 / 4;
                    rect2.right = (width2 * 3) / 4;
                }
                canvas2.drawBitmap(bitmap, rect2, rect, this.f34878k);
            }
        }
        float width3 = canvas2.getWidth() / 2;
        float height2 = canvas2.getHeight() / 2;
        if (Math.min(this.f34881n.size(), 3) == 3) {
            float width4 = canvas2.getWidth();
            Paint paint = this.f34880m;
            Intrinsics.f(paint);
            canvas2.drawLine(width3, height2, width4, height2, paint);
        }
        if (Math.min(this.f34881n.size(), 3) >= 2) {
            float height3 = canvas2.getHeight();
            Paint paint2 = this.f34880m;
            Intrinsics.f(paint2);
            canvas2.drawLine(width3, 0.0f, width3, height3, paint2);
        }
        RectF rectF = this.f34875h;
        Paint paint3 = this.f34879l;
        Intrinsics.f(paint3);
        canvas.drawOval(rectF, paint3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
    
        if (r1.getHeight() != ((int) r2.height())) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = r0 / 2
            java.util.ArrayList r2 = r11.f34881n
            int r3 = r2.size()
            android.graphics.Rect[] r4 = r11.f34873f
            r5 = 0
            r6 = 1
            if (r3 > r6) goto L1b
            r1 = r4[r5]
            kotlin.jvm.internal.Intrinsics.f(r1)
            r1.set(r5, r5, r0, r0)
            goto L57
        L1b:
            int r3 = r2.size()
            r7 = 2
            if (r3 != r7) goto L36
            r2 = r4[r5]
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r3 = r1 + (-1)
            r2.set(r5, r5, r3, r0)
            r2 = r4[r6]
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r1 = r1 + r6
            r2.set(r1, r5, r0, r0)
            goto L57
        L36:
            int r2 = r2.size()
            if (r2 <= r7) goto L57
            r2 = r4[r5]
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r3 = r1 + (-1)
            r2.set(r5, r5, r3, r0)
            r2 = r4[r6]
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r1 = r1 + r6
            r2.set(r1, r5, r0, r3)
            r2 = r4[r7]
            kotlin.jvm.internal.Intrinsics.f(r2)
            r2.set(r1, r1, r0, r0)
        L57:
            android.graphics.Path r1 = r11.f34876i
            boolean r2 = r1.isEmpty()
            r9 = 0
            if (r2 == 0) goto L7b
            int r2 = r0 + 1
            float r6 = (float) r2
            float r2 = (float) r0
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CW
            r4 = 0
            r5 = 0
            r3 = r1
            r7 = r2
            r8 = r10
            r3.addRect(r4, r5, r6, r7, r8)
            android.graphics.RectF r3 = r11.f34877j
            r3.set(r9, r9, r2, r2)
            r1.addOval(r3, r10)
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
            r1.setFillType(r2)
        L7b:
            android.graphics.Bitmap r1 = r11.f34871d
            if (r1 != 0) goto Ldf
            android.graphics.Paint r1 = r11.f34879l
            if (r1 == 0) goto Ldf
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            r11.f34871d = r1
            android.graphics.Paint r1 = r11.f34879l
            kotlin.jvm.internal.Intrinsics.f(r1)
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            android.graphics.Bitmap r3 = r11.f34871d
            kotlin.jvm.internal.Intrinsics.f(r3)
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r3, r4, r4)
            r1.setShader(r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r11.f34871d
            kotlin.jvm.internal.Intrinsics.f(r2)
            r1.<init>(r2)
            r11.f34872e = r1
            int r1 = r1.getWidth()
            android.graphics.RectF r2 = r11.f34875h
            float r3 = r2.width()
            int r3 = (int) r3
            if (r1 != r3) goto Lc8
            android.graphics.Canvas r1 = r11.f34872e
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r1 = r1.getHeight()
            float r3 = r2.height()
            int r3 = (int) r3
            if (r1 == r3) goto Ldf
        Lc8:
            android.graphics.Canvas r1 = r11.f34872e
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.graphics.Canvas r3 = r11.f34872e
            kotlin.jvm.internal.Intrinsics.f(r3)
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r2.set(r9, r9, r1, r3)
        Ldf:
            super.onMeasure(r12, r13)
            r11.setMeasuredDimension(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.conversation.view.GroupUserImageView.onMeasure(int, int):void");
    }

    public GroupUserImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (!this.f84229b) {
            this.f84229b = true;
        }
        this.f34870c = new Bitmap[3];
        Rect[] rectArr = new Rect[3];
        this.f34873f = rectArr;
        this.f34874g = new Rect();
        new Rect();
        this.f34875h = new RectF();
        this.f34876i = new Path();
        this.f34877j = new RectF();
        this.f34881n = new ArrayList();
        Paint paint = new Paint();
        this.f34878k = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f34878k;
        Intrinsics.f(paint2);
        paint2.setStyle(Paint.Style.FILL);
        Context context2 = getContext();
        Intrinsics.f(context2);
        new c(context2, new tn1.b(vn1.c.LIGHT, vn1.b.CENTER, c.f118618j, g.UI_400));
        Paint paint3 = new Paint();
        this.f34879l = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f34880m = paint4;
        Context context3 = getContext();
        int i14 = b.color_themed_background_default;
        Object obj = a.f53679a;
        paint4.setColor(context3.getColor(i14));
        Paint paint5 = this.f34880m;
        Intrinsics.f(paint5);
        paint5.setStrokeWidth(2.0f * hf0.b.f69001a);
        for (int i15 = 0; i15 < 3; i15++) {
            rectArr[i15] = new Rect();
        }
        setWillNotDraw(false);
    }

    public /* synthetic */ GroupUserImageView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }
}
