package com.pinterest.feature.ideaPinCreation.education;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bs1.c;
import eo1.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import org.jetbrains.annotations.NotNull;
import tu0.b;
import tu0.f;
import xk2.m;
import xk2.v;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\f\r\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/education/IdeaPinCreationEducationOnboardingView;", "Landroid/widget/FrameLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "tu0/c", "tu0/d", "ideaPinCreationEducationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationEducationOnboardingView extends FrameLayout implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final v f46525h = m.b(b.f119319j);

    /* renamed from: i, reason: collision with root package name */
    public static final v f46526i = m.b(b.f119320k);

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f46527a;

    /* renamed from: b, reason: collision with root package name */
    public Canvas f46528b;

    /* renamed from: c, reason: collision with root package name */
    public final w f46529c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f46530d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f46531e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f46532f;

    /* renamed from: g, reason: collision with root package name */
    public final f f46533g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationEducationOnboardingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f46529c = wVar;
        TextPaint textPaint = new TextPaint(1);
        this.f46530d = textPaint;
        Paint paint = new Paint(1);
        this.f46531e = paint;
        this.f46532f = new ArrayList();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        textPaint.setColor(c.B(this, eo1.b.color_white_0));
        textPaint.setTextSize(getResources().getDimensionPixelSize(eo1.c.font_size_400));
        this.f46533g = new f(this);
    }

    public final void a(int i13, int i14) {
        Canvas canvas = this.f46528b;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        this.f46528b = null;
        Bitmap bitmap = this.f46527a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f46527a = null;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        this.f46527a = createBitmap;
        if (createBitmap != null) {
            this.f46528b = new Canvas(createBitmap);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f46529c.j(this.f46533g);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a(canvas.getWidth(), canvas.getHeight());
        Canvas canvas2 = this.f46528b;
        if (canvas2 != null) {
            canvas2.drawColor(dl2.b.y0(this, a.sema_color_background_wash_dark));
            Iterator it = this.f46532f.iterator();
            while (it.hasNext()) {
                tu0.d dVar = (tu0.d) it.next();
                int[] iArr = new int[2];
                dVar.f119322a.getLocationOnScreen(iArr);
                int i13 = 0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                View view = dVar.f119322a;
                int width = view.getWidth();
                int height = view.getHeight();
                Intrinsics.checkNotNullParameter(view, "view");
                Activity l03 = c.l0(view);
                if (l03 != null) {
                    Window window = l03.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    Rect rect = new Rect();
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    int i16 = rect.top;
                    View findViewById = window.findViewById(R.id.content);
                    Intrinsics.g(findViewById, "null cannot be cast to non-null type android.view.View");
                    i13 = findViewById.getTop() - i16;
                }
                int i17 = dVar.f119323b;
                int i18 = i15 + i13;
                float f13 = i18 - i17;
                float f14 = dVar.f119324c;
                canvas2.drawRoundRect(i14 - i17, f13, r6 + width, r4 + height, f14, f14, this.f46531e);
                String str = dVar.f119325d;
                if (str != null) {
                    int width2 = (int) (canvas2.getWidth() - (gi2.b.R() * 2));
                    StaticLayout z13 = com.bumptech.glide.d.z(str, str.length(), this.f46530d, width2, Layout.Alignment.ALIGN_CENTER, TextUtils.TruncateAt.END, width2, ((Number) f46525h.getValue()).intValue());
                    float height2 = z13.getHeight();
                    float R = gi2.b.R();
                    float f15 = i18 + height + i17;
                    float R2 = ((float) canvas2.getHeight()) > gi2.b.R() + (gi2.b.R() + (f15 + height2)) ? gi2.b.R() + f15 : (f13 - gi2.b.R()) - height2;
                    canvas2.save();
                    canvas2.translate(R, R2);
                    z13.draw(canvas2);
                    canvas2.restore();
                }
            }
        }
        Bitmap bitmap = this.f46527a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        a(i13, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationEducationOnboardingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f46529c = wVar;
        TextPaint textPaint = new TextPaint(1);
        this.f46530d = textPaint;
        Paint paint = new Paint(1);
        this.f46531e = paint;
        this.f46532f = new ArrayList();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        textPaint.setColor(c.B(this, eo1.b.color_white_0));
        textPaint.setTextSize(getResources().getDimensionPixelSize(eo1.c.font_size_400));
        this.f46533g = new f(this);
    }
}
