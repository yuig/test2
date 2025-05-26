package com.pinterest.feature.user.group.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import tn1.b;
import tn1.c;
import vh1.a;
import vn1.g;

/* loaded from: classes5.dex */
public class GroupUserImageView extends View implements a {

    /* renamed from: a, reason: collision with root package name */
    public hs1.a[] f48970a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap[] f48971b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f48972c;

    /* renamed from: d, reason: collision with root package name */
    public Canvas f48973d;

    /* renamed from: e, reason: collision with root package name */
    public Rect[] f48974e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f48975f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f48976g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f48977h;

    /* renamed from: i, reason: collision with root package name */
    public Path f48978i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f48979j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f48980k;

    /* renamed from: l, reason: collision with root package name */
    public c f48981l;

    /* renamed from: m, reason: collision with root package name */
    public Paint f48982m;

    /* renamed from: n, reason: collision with root package name */
    public Paint f48983n;

    /* renamed from: o, reason: collision with root package name */
    public int f48984o;

    /* renamed from: p, reason: collision with root package name */
    public int f48985p;

    public GroupUserImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        a();
    }

    public final void a() {
        Context context = getContext();
        this.f48970a = new hs1.a[3];
        this.f48971b = new Bitmap[3];
        this.f48974e = new Rect[3];
        this.f48975f = new Rect();
        this.f48976g = new Rect();
        this.f48977h = new RectF();
        this.f48978i = new Path();
        this.f48979j = new RectF();
        int i13 = 0;
        while (true) {
            Rect[] rectArr = this.f48974e;
            if (i13 >= rectArr.length) {
                Paint paint = new Paint();
                this.f48980k = paint;
                paint.setAntiAlias(true);
                this.f48980k.setStyle(Paint.Style.FILL);
                this.f48981l = new c(context, new b(vn1.c.LIGHT, vn1.b.CENTER, c.f118618j, g.UI_400));
                Paint paint2 = new Paint();
                this.f48982m = paint2;
                paint2.setAntiAlias(true);
                Paint paint3 = new Paint();
                this.f48983n = paint3;
                paint3.setColor(dl2.b.x0(context, eo1.a.base_color_grayscale_0));
                this.f48983n.setStrokeWidth(2.0f * hf0.b.f69001a);
                setWillNotDraw(false);
                return;
            }
            rectArr[i13] = new Rect();
            i13++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Canvas canvas2 = this.f48973d;
        if (canvas2 == null) {
            return;
        }
        Context context = getContext();
        int i13 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        canvas2.drawColor(context.getColor(i13));
        int i14 = 0;
        while (true) {
            Rect[] rectArr = this.f48974e;
            if (i14 >= rectArr.length) {
                break;
            }
            int i15 = this.f48984o;
            boolean z13 = true;
            if ((i15 != 2 || i14 > 1) && (i15 != 3 || i14 != 0)) {
                z13 = false;
            }
            Bitmap bitmap = this.f48971b[i14];
            Rect rect = rectArr[i14];
            if (rect != null && !rect.isEmpty() && bitmap != null) {
                this.f48975f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                if (z13) {
                    int width = this.f48975f.width();
                    Rect rect2 = this.f48975f;
                    rect2.left = width / 4;
                    rect2.right = (width * 3) / 4;
                }
                canvas2.drawBitmap(bitmap, this.f48975f, rect, this.f48980k);
            }
            i14++;
        }
        float width2 = canvas2.getWidth() / 2;
        float height = canvas2.getHeight() / 2;
        if (this.f48984o == 3) {
            canvas2.drawLine(width2, height, canvas2.getWidth(), height, this.f48983n);
        }
        if (this.f48984o >= 2) {
            canvas2.drawLine(width2, 0.0f, width2, canvas2.getHeight(), this.f48983n);
        }
        canvas.drawOval(this.f48977h, this.f48982m);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int i15 = size / 2;
        int i16 = this.f48985p;
        if (i16 <= 1) {
            this.f48974e[0].set(0, 0, size, size);
        } else if (i16 == 2) {
            this.f48974e[0].set(0, 0, i15 - 1, size);
            this.f48974e[1].set(i15 + 1, 0, size, size);
        } else if (i16 > 2) {
            int i17 = i15 - 1;
            this.f48974e[0].set(0, 0, i17, size);
            int i18 = i15 + 1;
            this.f48974e[1].set(i18, 0, size, i17);
            this.f48974e[2].set(i18, i18, size, size);
        }
        if (this.f48978i.isEmpty()) {
            float f13 = size;
            Path.Direction direction = Path.Direction.CW;
            this.f48978i.addRect(0.0f, 0.0f, size + 1, f13, direction);
            this.f48979j.set(0.0f, 0.0f, f13, f13);
            this.f48978i.addOval(this.f48979j, direction);
            this.f48978i.setFillType(Path.FillType.EVEN_ODD);
        }
        if (this.f48972c == null) {
            this.f48972c = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
            Paint paint = this.f48982m;
            Bitmap bitmap = this.f48972c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Canvas canvas = new Canvas(this.f48972c);
            this.f48973d = canvas;
            if (canvas.getWidth() != ((int) this.f48977h.width()) || this.f48973d.getHeight() != ((int) this.f48977h.height())) {
                this.f48977h.set(0.0f, 0.0f, this.f48973d.getWidth(), this.f48973d.getHeight());
            }
        }
        super.onMeasure(i13, i14);
        setMeasuredDimension(size, size);
    }

    public GroupUserImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
    }
}
