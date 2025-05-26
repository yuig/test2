package pu0;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.pinterest.api.model.qq;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f101416a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f101417b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f101418c;

    /* renamed from: d, reason: collision with root package name */
    public final List f101419d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f101420e;

    public r(int i13, rm1.q qVar, ValueAnimator valueAnimator, List list, Function1 function1) {
        this.f101416a = i13;
        this.f101417b = qVar;
        this.f101418c = valueAnimator;
        this.f101419d = list;
        this.f101420e = function1;
    }

    public abstract Function1 a();

    public abstract Bitmap b();

    public abstract qq c();

    public abstract Bitmap d();

    public abstract boolean e();
}
