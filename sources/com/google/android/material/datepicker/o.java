package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.w2;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f32550a = i0.g(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f32551b = i0.g(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f32552c;

    public o(s sVar) {
        this.f32552c = sVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void g(Canvas canvas, RecyclerView recyclerView, w2 w2Var) {
        Object obj;
        b2 b2Var = recyclerView.f19240m;
        if (b2Var instanceof l0) {
            l2 l2Var = recyclerView.f19242n;
            if (l2Var instanceof GridLayoutManager) {
                l0 l0Var = (l0) b2Var;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) l2Var;
                s sVar = this.f32552c;
                Iterator it = sVar.f32558c.h1().iterator();
                while (it.hasNext()) {
                    p5.b bVar = (p5.b) it.next();
                    Object obj2 = bVar.f98855a;
                    if (obj2 != null && (obj = bVar.f98856b) != null) {
                        long longValue = ((Long) obj2).longValue();
                        Calendar calendar = this.f32550a;
                        calendar.setTimeInMillis(longValue);
                        long longValue2 = ((Long) obj).longValue();
                        Calendar calendar2 = this.f32551b;
                        calendar2.setTimeInMillis(longValue2);
                        int i13 = calendar.get(1) - l0Var.f32548d.f32559d.f32471a.f32488c;
                        int i14 = calendar2.get(1) - l0Var.f32548d.f32559d.f32471a.f32488c;
                        View z13 = gridLayoutManager.z(i13);
                        View z14 = gridLayoutManager.z(i14);
                        int i15 = gridLayoutManager.F;
                        int i16 = i13 / i15;
                        int i17 = i14 / i15;
                        int i18 = i16;
                        while (i18 <= i17) {
                            if (gridLayoutManager.z(gridLayoutManager.F * i18) != null) {
                                canvas.drawRect((i18 != i16 || z13 == null) ? 0 : (z13.getWidth() / 2) + z13.getLeft(), ((Rect) ((a0.a) sVar.f32563h.f15840d).f203b).top + r11.getTop(), (i18 != i17 || z14 == null) ? recyclerView.getWidth() : (z14.getWidth() / 2) + z14.getLeft(), r11.getBottom() - ((Rect) ((a0.a) sVar.f32563h.f15840d).f203b).bottom, (Paint) sVar.f32563h.f15844h);
                            }
                            i18++;
                        }
                    }
                }
            }
        }
    }
}
