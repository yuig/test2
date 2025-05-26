package gk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import bk.g;
import bk.i;
import bk.j;
import bk.m;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.z;
import com.google.android.material.navigation.b;
import yj.e;

/* loaded from: classes3.dex */
public final class a extends i implements z {
    public static final /* synthetic */ int P = 0;
    public final Paint.FontMetrics A;
    public final a0 B;
    public final b C;
    public final Rect D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f65201J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f65202y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f65203z;

    public a(Context context, int i13) {
        super(context, null, 0, i13);
        this.A = new Paint.FontMetrics();
        a0 a0Var = new a0(this);
        this.B = a0Var;
        this.C = new b(this, 1);
        this.D = new Rect();
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 0.5f;
        this.O = 1.0f;
        this.f65203z = context;
        TextPaint textPaint = a0Var.f32699a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float C() {
        int i13;
        Rect rect = this.D;
        if (((rect.right - getBounds().right) - this.K) - this.H < 0) {
            i13 = ((rect.right - getBounds().right) - this.K) - this.H;
        } else {
            if (((rect.left - getBounds().left) - this.K) + this.H <= 0) {
                return 0.0f;
            }
            i13 = ((rect.left - getBounds().left) - this.K) + this.H;
        }
        return i13;
    }

    public final j D() {
        float f13 = -C();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f65201J))) / 2.0f;
        return new j(new g(this.f65201J), Math.min(Math.max(f13, -width), width));
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float C = C();
        float f13 = (float) (-((Math.sqrt(2.0d) * this.f65201J) - this.f65201J));
        canvas.scale(this.L, this.M, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.N) + getBounds().top);
        canvas.translate(C, f13);
        super.draw(canvas);
        if (this.f65202y != null) {
            float centerY = getBounds().centerY();
            a0 a0Var = this.B;
            TextPaint textPaint = a0Var.f32699a;
            Paint.FontMetrics fontMetrics = this.A;
            textPaint.getFontMetrics(fontMetrics);
            int i13 = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            e eVar = a0Var.f32705g;
            TextPaint textPaint2 = a0Var.f32699a;
            if (eVar != null) {
                textPaint2.drawableState = getState();
                a0Var.f32705g.e(this.f65203z, textPaint2, a0Var.f32700b);
                textPaint2.setAlpha((int) (this.O * 255.0f));
            }
            CharSequence charSequence = this.f65202y;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i13, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.B.f32699a.getTextSize(), this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f13 = this.E * 2;
        CharSequence charSequence = this.f65202y;
        return (int) Math.max(f13 + (charSequence == null ? 0.0f : this.B.a(charSequence.toString())), this.F);
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.I) {
            m h10 = this.f23052a.f23030a.h();
            h10.f23088k = D();
            Y0(h10.a());
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
