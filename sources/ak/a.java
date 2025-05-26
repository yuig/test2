package ak;

import android.graphics.Paint;
import android.graphics.Path;
import f5.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f15446i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f15447j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f15448k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f15449l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f15450a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f15451b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f15452c;

    /* renamed from: d, reason: collision with root package name */
    public int f15453d;

    /* renamed from: e, reason: collision with root package name */
    public int f15454e;

    /* renamed from: f, reason: collision with root package name */
    public int f15455f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f15456g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f15457h;

    public a() {
        Paint paint = new Paint();
        this.f15457h = paint;
        this.f15450a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f15451b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f15452c = new Paint(paint2);
    }

    public final void a(int i13) {
        this.f15453d = c.j(i13, 68);
        this.f15454e = c.j(i13, 20);
        this.f15455f = c.j(i13, 0);
        this.f15450a.setColor(this.f15453d);
    }
}
