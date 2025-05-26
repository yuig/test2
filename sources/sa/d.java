package sa;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f112120a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f112121b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f112122c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f112123d;

    /* renamed from: e, reason: collision with root package name */
    public float f112124e;

    /* renamed from: f, reason: collision with root package name */
    public float f112125f;

    /* renamed from: g, reason: collision with root package name */
    public float f112126g;

    /* renamed from: h, reason: collision with root package name */
    public float f112127h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f112128i;

    /* renamed from: j, reason: collision with root package name */
    public int f112129j;

    /* renamed from: k, reason: collision with root package name */
    public float f112130k;

    /* renamed from: l, reason: collision with root package name */
    public float f112131l;

    /* renamed from: m, reason: collision with root package name */
    public float f112132m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f112133n;

    /* renamed from: o, reason: collision with root package name */
    public Path f112134o;

    /* renamed from: p, reason: collision with root package name */
    public float f112135p;

    /* renamed from: q, reason: collision with root package name */
    public float f112136q;

    /* renamed from: r, reason: collision with root package name */
    public int f112137r;

    /* renamed from: s, reason: collision with root package name */
    public int f112138s;

    /* renamed from: t, reason: collision with root package name */
    public int f112139t;

    /* renamed from: u, reason: collision with root package name */
    public int f112140u;

    public d() {
        Paint paint = new Paint();
        this.f112121b = paint;
        Paint paint2 = new Paint();
        this.f112122c = paint2;
        Paint paint3 = new Paint();
        this.f112123d = paint3;
        this.f112124e = 0.0f;
        this.f112125f = 0.0f;
        this.f112126g = 0.0f;
        this.f112127h = 5.0f;
        this.f112135p = 1.0f;
        this.f112139t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }
}
