package mj;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f87230a;

    /* renamed from: b, reason: collision with root package name */
    public List f87231b;

    public c() {
        Paint paint = new Paint();
        this.f87230a = paint;
        this.f87231b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.h2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f87230a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(fj.e.m3_carousel_debug_keyline_width));
        for (i iVar : this.f87231b) {
            paint.setColor(f5.c.c(-65281, iVar.f87248c, -16776961));
            if (((CarouselLayoutManager) recyclerView.f19242n).m1()) {
                float i13 = ((CarouselLayoutManager) recyclerView.f19242n).f32409y.i();
                float d2 = ((CarouselLayoutManager) recyclerView.f19242n).f32409y.d();
                float f13 = iVar.f87247b;
                canvas.drawLine(f13, i13, f13, d2, paint);
            } else {
                float f14 = ((CarouselLayoutManager) recyclerView.f19242n).f32409y.f();
                float g13 = ((CarouselLayoutManager) recyclerView.f19242n).f32409y.g();
                float f15 = iVar.f87247b;
                canvas.drawLine(f14, f15, g13, f15, paint);
            }
        }
    }
}
