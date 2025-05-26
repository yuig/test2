package cc;

import a.cb;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f27411a;

    /* renamed from: b, reason: collision with root package name */
    public String f27412b;

    /* renamed from: c, reason: collision with root package name */
    public float f27413c;

    /* renamed from: d, reason: collision with root package name */
    public b f27414d;

    /* renamed from: e, reason: collision with root package name */
    public int f27415e;

    /* renamed from: f, reason: collision with root package name */
    public float f27416f;

    /* renamed from: g, reason: collision with root package name */
    public float f27417g;

    /* renamed from: h, reason: collision with root package name */
    public int f27418h;

    /* renamed from: i, reason: collision with root package name */
    public int f27419i;

    /* renamed from: j, reason: collision with root package name */
    public float f27420j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27421k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f27422l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f27423m;

    public final int hashCode() {
        int ordinal = ((this.f27414d.ordinal() + (((int) (cb.d(this.f27412b, this.f27411a.hashCode() * 31, 31) + this.f27413c)) * 31)) * 31) + this.f27415e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f27416f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f27418h;
    }
}
