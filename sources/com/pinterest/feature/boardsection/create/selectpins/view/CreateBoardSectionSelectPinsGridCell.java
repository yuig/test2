package com.pinterest.feature.boardsection.create.selectpins.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ar0.d;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import k70.b;
import k70.c;
import nn0.a;
import pk.a0;
import ye2.m;
import yk1.n;

/* loaded from: classes5.dex */
public class CreateBoardSectionSelectPinsGridCell extends FrameLayout implements n, d {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f45360m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f45361a;

    /* renamed from: b, reason: collision with root package name */
    public WebImageView f45362b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f45363c;

    /* renamed from: d, reason: collision with root package name */
    public a f45364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45365e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f45366f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f45367g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f45368h;

    /* renamed from: i, reason: collision with root package name */
    public int f45369i;

    /* renamed from: j, reason: collision with root package name */
    public int f45370j;

    /* renamed from: k, reason: collision with root package name */
    public int f45371k;

    /* renamed from: l, reason: collision with root package name */
    public int f45372l;

    public CreateBoardSectionSelectPinsGridCell(m mVar) {
        super(mVar);
        this.f45361a = a0.K(2, getResources());
        a();
    }

    public final void a() {
        View.inflate(getContext(), c.board_section_pin_select_grid_cell, this);
        this.f45362b = (WebImageView) findViewById(b.pin_image);
        this.f45363c = (GestaltText) findViewById(b.pin_subtitle);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.f45367g = new RectF();
        Paint paint = new Paint();
        this.f45366f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f45366f.setAntiAlias(true);
        Paint paint2 = this.f45366f;
        Context context = getContext();
        int i13 = eo1.b.color_themed_base_red_300;
        Object obj = d5.a.f53679a;
        paint2.setColor(context.getColor(i13));
        this.f45366f.setStrokeWidth(this.f45361a);
        this.f45372l = (int) getResources().getDimension(eo1.c.lego_corner_radius_small);
        this.f45368h = getContext().getDrawable(vf0.a.rounded_rect_super_light_gray_8dp);
        this.f45362b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        WebImageView webImageView = this.f45362b;
        float f13 = this.f45372l;
        webImageView.g2(f13, f13, f13, f13);
        this.f45363c.setPaddingRelative(0, 0, 0, 0);
    }

    public final void b() {
        if (this.f45365e) {
            int K = a0.K(6, getResources());
            this.f45362b.setPaddingRelative(K, K, K, K);
        } else {
            this.f45362b.setPaddingRelative(0, 0, 0, 0);
        }
        requestLayout();
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45365e) {
            RectF rectF = this.f45367g;
            int i13 = this.f45372l;
            canvas.drawRoundRect(rectF, i13, i13, this.f45366f);
        }
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        Context context = getContext();
        int i14 = eo1.d.drawable_themed_transparent;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        Context context = getContext();
        int i13 = bo1.a.rounded_rect_white;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        WebImageView webImageView = this.f45362b;
        webImageView.layout(0, 0, this.f45371k, webImageView.getMeasuredHeight());
        int measuredHeight = this.f45362b.getMeasuredHeight();
        if (this.f45363c.l().f108855m != fm1.c.GONE) {
            int K = a0.K(4, getResources()) + measuredHeight;
            GestaltText gestaltText = this.f45363c;
            gestaltText.layout(0, K, this.f45371k, gestaltText.getMeasuredHeight() + K);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int floor;
        int size = View.MeasureSpec.getSize(i13);
        this.f45371k = size;
        int i15 = this.f45369i;
        if (i15 == 0) {
            floor = 0;
        } else {
            floor = (int) Math.floor((this.f45370j / i15) * size);
        }
        measureChild(this.f45362b, i13, View.MeasureSpec.makeMeasureSpec(Math.max(floor, this.f45371k), 1073741824));
        int measuredHeight = this.f45362b.getMeasuredHeight();
        if (this.f45363c.l().f108855m != fm1.c.GONE) {
            int K = a0.K(4, getResources()) + measuredHeight;
            measureChild(this.f45363c, i13, i14);
            measuredHeight = this.f45363c.getMeasuredHeight() + K;
        }
        RectF rectF = this.f45367g;
        int i16 = this.f45361a;
        rectF.set(i16, i16, this.f45371k - i16, this.f45362b.getMeasuredHeight() - i16);
        setMeasuredDimension(i13, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public CreateBoardSectionSelectPinsGridCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45361a = a0.K(2, getResources());
        a();
    }

    public CreateBoardSectionSelectPinsGridCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f45361a = a0.K(2, getResources());
        a();
    }
}
