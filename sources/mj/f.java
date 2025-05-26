package mj;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f87234a;

    public f(int i13) {
        this.f87234a = i13;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract float b(RecyclerView.LayoutParams layoutParams);

    public abstract RectF c(float f13, float f14, float f15, float f16);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j(View view, int i13, int i14);

    public abstract void k(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void l(float f13, float f14, Rect rect, View view);
}
