package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.s;

/* loaded from: classes3.dex */
public class MockView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f17593a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f17594b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f17595c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17597e;

    /* renamed from: f, reason: collision with root package name */
    public String f17598f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f17599g;

    /* renamed from: h, reason: collision with root package name */
    public int f17600h;

    /* renamed from: i, reason: collision with root package name */
    public int f17601i;

    /* renamed from: j, reason: collision with root package name */
    public int f17602j;

    /* renamed from: k, reason: collision with root package name */
    public int f17603k;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17593a = new Paint();
        this.f17594b = new Paint();
        this.f17595c = new Paint();
        this.f17596d = true;
        this.f17597e = true;
        this.f17598f = null;
        this.f17599g = new Rect();
        this.f17600h = Color.argb(255, 0, 0, 0);
        this.f17601i = Color.argb(255, 200, 200, 200);
        this.f17602j = Color.argb(255, 50, 50, 50);
        this.f17603k = 4;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.MockView_mock_label) {
                    this.f17598f = obtainStyledAttributes.getString(index);
                } else if (index == s.MockView_mock_showDiagonals) {
                    this.f17596d = obtainStyledAttributes.getBoolean(index, this.f17596d);
                } else if (index == s.MockView_mock_diagonalsColor) {
                    this.f17600h = obtainStyledAttributes.getColor(index, this.f17600h);
                } else if (index == s.MockView_mock_labelBackgroundColor) {
                    this.f17602j = obtainStyledAttributes.getColor(index, this.f17602j);
                } else if (index == s.MockView_mock_labelColor) {
                    this.f17601i = obtainStyledAttributes.getColor(index, this.f17601i);
                } else if (index == s.MockView_mock_showLabel) {
                    this.f17597e = obtainStyledAttributes.getBoolean(index, this.f17597e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f17598f == null) {
            try {
                this.f17598f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i14 = this.f17600h;
        Paint paint = this.f17593a;
        paint.setColor(i14);
        paint.setAntiAlias(true);
        int i15 = this.f17601i;
        Paint paint2 = this.f17594b;
        paint2.setColor(i15);
        paint2.setAntiAlias(true);
        this.f17595c.setColor(this.f17602j);
        this.f17603k = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f17603k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f17596d) {
            width--;
            height--;
            float f13 = width;
            float f14 = height;
            canvas.drawLine(0.0f, 0.0f, f13, f14, this.f17593a);
            canvas.drawLine(0.0f, f14, f13, 0.0f, this.f17593a);
            canvas.drawLine(0.0f, 0.0f, f13, 0.0f, this.f17593a);
            canvas.drawLine(f13, 0.0f, f13, f14, this.f17593a);
            canvas.drawLine(f13, f14, 0.0f, f14, this.f17593a);
            canvas.drawLine(0.0f, f14, 0.0f, 0.0f, this.f17593a);
        }
        String str = this.f17598f;
        if (str == null || !this.f17597e) {
            return;
        }
        int length = str.length();
        Paint paint = this.f17594b;
        Rect rect = this.f17599g;
        paint.getTextBounds(str, 0, length, rect);
        float width2 = (width - rect.width()) / 2.0f;
        float height2 = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) width2, (int) height2);
        int i13 = rect.left;
        int i14 = this.f17603k;
        rect.set(i13 - i14, rect.top - i14, rect.right + i14, rect.bottom + i14);
        canvas.drawRect(rect, this.f17595c);
        canvas.drawText(this.f17598f, width2, height2, paint);
    }

    public MockView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17593a = new Paint();
        this.f17594b = new Paint();
        this.f17595c = new Paint();
        this.f17596d = true;
        this.f17597e = true;
        this.f17598f = null;
        this.f17599g = new Rect();
        this.f17600h = Color.argb(255, 0, 0, 0);
        this.f17601i = Color.argb(255, 200, 200, 200);
        this.f17602j = Color.argb(255, 50, 50, 50);
        this.f17603k = 4;
        a(context, attributeSet);
    }
}
