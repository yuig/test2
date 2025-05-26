package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.s;
import y4.d;

/* loaded from: classes3.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: d, reason: collision with root package name */
    public float f17604d;

    /* renamed from: e, reason: collision with root package name */
    public float f17605e;

    /* renamed from: f, reason: collision with root package name */
    public Path f17606f;

    /* renamed from: g, reason: collision with root package name */
    public d f17607g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f17608h;

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17604d = 0.0f;
        this.f17605e = Float.NaN;
        c(attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ImageFilterView_round) {
                    float dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    if (Float.isNaN(dimension)) {
                        this.f17605e = dimension;
                        float f13 = this.f17604d;
                        this.f17604d = -1.0f;
                        d(f13);
                    } else {
                        boolean z13 = this.f17605e != dimension;
                        this.f17605e = dimension;
                        if (dimension != 0.0f) {
                            if (this.f17606f == null) {
                                this.f17606f = new Path();
                            }
                            if (this.f17608h == null) {
                                this.f17608h = new RectF();
                            }
                            if (this.f17607g == null) {
                                d dVar = new d(this, 1);
                                this.f17607g = dVar;
                                setOutlineProvider(dVar);
                            }
                            setClipToOutline(true);
                            this.f17608h.set(0.0f, 0.0f, getWidth(), getHeight());
                            this.f17606f.reset();
                            Path path = this.f17606f;
                            RectF rectF = this.f17608h;
                            float f14 = this.f17605e;
                            path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                        } else {
                            setClipToOutline(false);
                        }
                        if (z13) {
                            invalidateOutline();
                        }
                    }
                } else if (index == s.ImageFilterView_roundPercent) {
                    d(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void d(float f13) {
        boolean z13 = this.f17604d != f13;
        this.f17604d = f13;
        if (f13 != 0.0f) {
            if (this.f17606f == null) {
                this.f17606f = new Path();
            }
            if (this.f17608h == null) {
                this.f17608h = new RectF();
            }
            if (this.f17607g == null) {
                d dVar = new d(this, 0);
                this.f17607g = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f17604d) / 2.0f;
            this.f17608h.set(0.0f, 0.0f, width, height);
            this.f17606f.reset();
            this.f17606f.addRoundRect(this.f17608h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z13) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17604d = 0.0f;
        this.f17605e = Float.NaN;
        c(attributeSet);
    }
}
