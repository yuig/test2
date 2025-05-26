package ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f125644d = 0;

    /* renamed from: a, reason: collision with root package name */
    public int[] f125645a;

    /* renamed from: b, reason: collision with root package name */
    public int f125646b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f125647c;

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f125645a = shape;
        int a13 = me.f.a(shape);
        this.f125646b = a13;
        this.f125647c = new float[a13];
    }

    public final float[] a() {
        return this.f125647c;
    }

    public final int b(int i13) {
        return this.f125645a[i13];
    }
}
