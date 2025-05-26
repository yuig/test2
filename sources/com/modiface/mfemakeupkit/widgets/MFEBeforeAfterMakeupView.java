package com.modiface.mfemakeupkit.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.h;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import q5.j;

/* loaded from: classes7.dex */
public class MFEBeforeAfterMakeupView extends RelativeLayout {
    protected static final int DefaultDividerColor = -65536;
    protected static final int DefaultDividerWidthInDp = 2;
    protected MFEMakeupView mBackgroundMakeupView;
    protected FrameLayout mBackgroundViewContainer;
    protected BeforeViewSide mBeforeViewSide;
    protected float mBeforeVisibleAmount;
    protected MFEMakeupView mCroppedMakeupView;
    protected Paint mDividerPaint;
    protected View mOverlayView;
    protected j mOverlayViewGestureDetector;
    protected ScrollView mScrollView;
    protected FrameLayout mScrollViewContainer;
    protected boolean mShowBefore;

    public enum BeforeViewSide {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        
            r4 = 1.0f - r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        
            if (r0 == com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.RIGHT) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r0 == com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.BOTTOM) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.view.MotionEvent r4) {
            /*
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView r0 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.this
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView$BeforeViewSide r0 = r0.mBeforeViewSide
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView$BeforeViewSide r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.LEFT
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r0 == r1) goto L25
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView$BeforeViewSide r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.RIGHT
                if (r0 != r1) goto L12
                goto L25
            L12:
                float r4 = r4.getY()
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.this
                android.view.View r1 = r1.mOverlayView
                int r1 = r1.getHeight()
                float r1 = (float) r1
                float r4 = r4 / r1
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView$BeforeViewSide r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.BOTTOM
                if (r0 != r1) goto L39
                goto L37
            L25:
                float r4 = r4.getX()
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.this
                android.view.View r1 = r1.mOverlayView
                int r1 = r1.getWidth()
                float r1 = (float) r1
                float r4 = r4 / r1
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView$BeforeViewSide r1 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.BeforeViewSide.RIGHT
                if (r0 != r1) goto L39
            L37:
                float r4 = r2 - r4
            L39:
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L47
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 > 0) goto L47
                com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView r0 = com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.this
                r0.setBeforeVisibleAmount(r4)
            L47:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView.e.a(android.view.MotionEvent):void");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            a(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
            a(motionEvent2);
            return true;
        }
    }

    public MFEBeforeAfterMakeupView(@NonNull Context context) {
        super(context);
        this.mBeforeViewSide = BeforeViewSide.LEFT;
        this.mBeforeVisibleAmount = 0.5f;
        this.mDividerPaint = new Paint();
        this.mShowBefore = true;
        init(context);
    }

    private void init(Context context) {
        this.mDividerPaint.setStyle(Paint.Style.STROKE);
        this.mDividerPaint.setAntiAlias(true);
        this.mDividerPaint.setColor(DefaultDividerColor);
        this.mDividerPaint.setStrokeWidth(h.a(context, 2));
        this.mOverlayViewGestureDetector = new j(context, new e());
        this.mCroppedMakeupView = new MFEMakeupView(context);
        this.mBackgroundMakeupView = new MFEMakeupView(context);
        this.mBackgroundViewContainer = new FrameLayout(context);
        this.mScrollView = new ScrollView(context);
        this.mScrollViewContainer = new FrameLayout(context);
        this.mOverlayView = new a(this, context);
        this.mScrollView.setFillViewport(true);
        this.mScrollView.setSmoothScrollingEnabled(false);
        this.mScrollView.setOverScrollMode(2);
        this.mScrollView.setHorizontalScrollBarEnabled(false);
        this.mScrollView.setVerticalScrollBarEnabled(false);
        this.mOverlayView.addOnLayoutChangeListener(new b(this));
        this.mOverlayView.setOnTouchListener(new c(this));
        this.mScrollViewContainer.addView(this.mCroppedMakeupView, new ViewGroup.LayoutParams(1, 1));
        this.mScrollView.addView(this.mScrollViewContainer, new ViewGroup.LayoutParams(-2, -2));
        this.mBackgroundViewContainer.addView(this.mBackgroundMakeupView, new ViewGroup.LayoutParams(-1, -1));
        addView(this.mBackgroundViewContainer, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.mScrollView, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.mOverlayView, new RelativeLayout.LayoutParams(-1, -1));
        setBeforeViewSide(this.mBeforeViewSide);
        setBeforeVisibleAmount(this.mBeforeVisibleAmount);
    }

    public void clear() {
        getBeforeMakeupView().clear();
        getAfterMakeupView().clear();
    }

    public void drawOnOverlayView(Canvas canvas) {
        if (this.mShowBefore) {
            float f13 = this.mBeforeVisibleAmount;
            BeforeViewSide beforeViewSide = this.mBeforeViewSide;
            float width = this.mOverlayView.getWidth();
            float height = this.mOverlayView.getHeight();
            float paddingLeft = this.mOverlayView.getPaddingLeft();
            float paddingTop = this.mOverlayView.getPaddingTop();
            float paddingRight = width - this.mOverlayView.getPaddingRight();
            float paddingBottom = height - this.mOverlayView.getPaddingBottom();
            Paint paint = this.mDividerPaint;
            int i13 = d.f34769a[beforeViewSide.ordinal()];
            if (i13 == 1) {
                float f14 = f13 * width;
                canvas.drawLine(f14, paddingTop, f14, paddingBottom, paint);
                return;
            }
            if (i13 == 2) {
                float f15 = (1.0f - f13) * width;
                canvas.drawLine(f15, paddingTop, f15, paddingBottom, paint);
            } else if (i13 == 3) {
                float f16 = f13 * height;
                canvas.drawLine(paddingLeft, f16, paddingRight, f16, paint);
            } else {
                if (i13 != 4) {
                    return;
                }
                float f17 = (1.0f - f13) * height;
                canvas.drawLine(paddingLeft, f17, paddingRight, f17, paint);
            }
        }
    }

    public MFEMakeupView getAfterMakeupView() {
        BeforeViewSide beforeViewSide = this.mBeforeViewSide;
        return (beforeViewSide == BeforeViewSide.LEFT || beforeViewSide == BeforeViewSide.TOP) ? this.mBackgroundMakeupView : this.mCroppedMakeupView;
    }

    public MFEMakeupView getBeforeMakeupView() {
        BeforeViewSide beforeViewSide = this.mBeforeViewSide;
        return (beforeViewSide == BeforeViewSide.LEFT || beforeViewSide == BeforeViewSide.TOP) ? this.mCroppedMakeupView : this.mBackgroundMakeupView;
    }

    public boolean isBeforeViewVisible() {
        return getBeforeMakeupView().getVisibility() == 0;
    }

    public void overlayViewOnTouch(View view, MotionEvent motionEvent) {
        this.mOverlayViewGestureDetector.a(motionEvent);
    }

    public void setAfterViewZoomArea(MFEMakeupZoomArea mFEMakeupZoomArea) {
        getAfterMakeupView().setZoomArea(mFEMakeupZoomArea);
    }

    public void setBeforeViewSide(BeforeViewSide beforeViewSide) {
        if (beforeViewSide == null) {
            throw new IllegalArgumentException("Cannot set a null before view side");
        }
        this.mBeforeViewSide = beforeViewSide;
        getBeforeMakeupView().setShowBefore(true);
        getAfterMakeupView().setShowBefore(false);
        updateSplit();
    }

    public void setBeforeViewVisible(boolean z13) {
        this.mShowBefore = z13;
        updateSplit();
    }

    public void setBeforeViewZoomArea(MFEMakeupZoomArea mFEMakeupZoomArea) {
        getBeforeMakeupView().setZoomArea(mFEMakeupZoomArea);
    }

    public void setBeforeVisibleAmount(float f13) {
        if (f13 < 0.0f || f13 > 1.0f) {
            throw new IllegalArgumentException("Cannot set the before visible amount outside of range [0.0, 1.0]");
        }
        this.mBeforeVisibleAmount = f13;
        updateSplit();
    }

    public void setDividerColor(int i13) {
        this.mDividerPaint.setColor(i13);
        this.mOverlayView.invalidate();
    }

    public void setDividerWidth(float f13) {
        this.mDividerPaint.setStrokeWidth(f13);
        this.mOverlayView.invalidate();
    }

    public void setZoomArea(MFEMakeupZoomArea mFEMakeupZoomArea) {
        setBeforeViewZoomArea(mFEMakeupZoomArea);
        setAfterViewZoomArea(mFEMakeupZoomArea);
    }

    public void setup(MFEMakeupEngine mFEMakeupEngine) {
        if (mFEMakeupEngine == null) {
            throw new IllegalArgumentException("Cannot setup with a null makeup engine");
        }
        mFEMakeupEngine.attachMakeupView(this.mCroppedMakeupView);
        mFEMakeupEngine.attachMakeupView(this.mBackgroundMakeupView);
    }

    public void updateSplit() {
        float f13 = this.mBeforeVisibleAmount;
        BeforeViewSide beforeViewSide = this.mBeforeViewSide;
        boolean z13 = this.mShowBefore;
        getBeforeMakeupView().setVisibility(z13 ? 0 : 8);
        getAfterMakeupView().setVisibility(0);
        if (!z13 && getAfterMakeupView() == this.mCroppedMakeupView) {
            f13 = 0.0f;
        }
        float width = this.mOverlayView.getWidth();
        float height = this.mOverlayView.getHeight();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mScrollView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        int i13 = d.f34769a[beforeViewSide.ordinal()];
        if (i13 == 1) {
            layoutParams.width = Math.round(f13 * width);
        } else if (i13 == 2) {
            layoutParams.width = Math.round((1.0f - f13) * width);
        } else if (i13 == 3) {
            layoutParams.height = Math.round(f13 * height);
        } else if (i13 == 4) {
            layoutParams.height = Math.round((1.0f - f13) * height);
        }
        this.mScrollView.setLayoutParams(layoutParams);
        requestLayout();
        this.mScrollView.invalidate();
        this.mOverlayView.invalidate();
    }

    public MFEBeforeAfterMakeupView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBeforeViewSide = BeforeViewSide.LEFT;
        this.mBeforeVisibleAmount = 0.5f;
        this.mDividerPaint = new Paint();
        this.mShowBefore = true;
        init(context);
    }

    public MFEBeforeAfterMakeupView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mBeforeViewSide = BeforeViewSide.LEFT;
        this.mBeforeVisibleAmount = 0.5f;
        this.mDividerPaint = new Paint();
        this.mShowBefore = true;
        init(context);
    }
}
