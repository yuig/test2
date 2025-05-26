package va;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f125064p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f125065a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f125066b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f125067c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f125068d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f125069e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f125070f;

    /* renamed from: g, reason: collision with root package name */
    public final j f125071g;

    /* renamed from: h, reason: collision with root package name */
    public float f125072h;

    /* renamed from: i, reason: collision with root package name */
    public float f125073i;

    /* renamed from: j, reason: collision with root package name */
    public float f125074j;

    /* renamed from: k, reason: collision with root package name */
    public float f125075k;

    /* renamed from: l, reason: collision with root package name */
    public int f125076l;

    /* renamed from: m, reason: collision with root package name */
    public String f125077m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f125078n;

    /* renamed from: o, reason: collision with root package name */
    public final g1.g f125079o;

    public m() {
        this.f125067c = new Matrix();
        this.f125072h = 0.0f;
        this.f125073i = 0.0f;
        this.f125074j = 0.0f;
        this.f125075k = 0.0f;
        this.f125076l = 255;
        this.f125077m = null;
        this.f125078n = null;
        this.f125079o = new g1.g();
        this.f125071g = new j();
        this.f125065a = new Path();
        this.f125066b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f125043k != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va.j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.m.a(va.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f125076l;
    }

    public void setAlpha(float f13) {
        setRootAlpha((int) (f13 * 255.0f));
    }

    public void setRootAlpha(int i13) {
        this.f125076l = i13;
    }

    public m(m mVar) {
        this.f125067c = new Matrix();
        this.f125072h = 0.0f;
        this.f125073i = 0.0f;
        this.f125074j = 0.0f;
        this.f125075k = 0.0f;
        this.f125076l = 255;
        this.f125077m = null;
        this.f125078n = null;
        g1.g gVar = new g1.g(0);
        this.f125079o = gVar;
        this.f125071g = new j(mVar.f125071g, gVar);
        this.f125065a = new Path(mVar.f125065a);
        this.f125066b = new Path(mVar.f125066b);
        this.f125072h = mVar.f125072h;
        this.f125073i = mVar.f125073i;
        this.f125074j = mVar.f125074j;
        this.f125075k = mVar.f125075k;
        this.f125076l = mVar.f125076l;
        this.f125077m = mVar.f125077m;
        String str = mVar.f125077m;
        if (str != null) {
            gVar.put(str, this);
        }
        this.f125078n = mVar.f125078n;
    }
}
