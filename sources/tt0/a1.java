package tt0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119070a;

    /* renamed from: b, reason: collision with root package name */
    public final rt0.b f119071b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f119072c;

    /* renamed from: d, reason: collision with root package name */
    public float f119073d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f119074e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f119075f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f119076g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f119077h;

    public a1(Context context, rt0.b model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f119070a = context;
        this.f119071b = model;
        this.f119072c = new ArrayList();
        this.f119074e = xk2.m.b(new z0(this, 3));
        this.f119075f = xk2.m.b(new z0(this, 2));
        this.f119076g = xk2.m.b(new z0(this, 1));
        this.f119077h = xk2.m.b(new z0(this, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f13 = this.f119073d + IdeaPinCreationCameraVideoSegmentsView.f45929k;
        float f14 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        canvas.drawRoundRect(getBounds().left, this.f119073d, getBounds().left + getBounds().width(), f13, f14, f14, (Paint) this.f119077h.getValue());
        float f15 = getBounds().left;
        ArrayList arrayList = this.f119072c;
        Iterator it = arrayList.iterator();
        float f16 = f15;
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            rt0.b bVar = this.f119071b;
            if (!hasNext) {
                float f17 = getBounds().left;
                Iterator it2 = arrayList.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    f17 += ((Number) next).floatValue();
                    if (!(bVar.f109952d && i14 == arrayList.size() - 1)) {
                        float f18 = IdeaPinCreationCameraVideoSegmentsView.f45926h / 2.0f;
                        float f19 = this.f119073d;
                        canvas.drawRect(f17 - f18, f19, f18 + f17, f19 + IdeaPinCreationCameraVideoSegmentsView.f45929k, (Paint) this.f119076g.getValue());
                    }
                    i14 = i15;
                }
                return;
            }
            Object next2 = it.next();
            int i16 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            float floatValue = ((Number) next2).floatValue();
            Paint paint = (bVar.f109952d && i13 == arrayList.size() - 1) ? (Paint) this.f119075f.getValue() : (Paint) this.f119074e.getValue();
            float f23 = this.f119073d;
            float f24 = f16 + floatValue;
            float f25 = f23 + IdeaPinCreationCameraVideoSegmentsView.f45929k;
            float f26 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
            canvas.drawRoundRect(f16, f23, f24, f25, f26, f26, paint);
            f16 = f24;
            i13 = i16;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        super.setBounds(i13, i14, i15, i16);
        float f13 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
        this.f119073d = ((getBounds().height() / 2.0f) - (IdeaPinCreationCameraVideoSegmentsView.f45929k / 2.0f)) + getBounds().top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
