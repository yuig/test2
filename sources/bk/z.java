package bk;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public float f23140a;

    /* renamed from: b, reason: collision with root package name */
    public float f23141b;

    /* renamed from: c, reason: collision with root package name */
    public float f23142c;

    /* renamed from: d, reason: collision with root package name */
    public float f23143d;

    /* renamed from: e, reason: collision with root package name */
    public float f23144e;

    /* renamed from: f, reason: collision with root package name */
    public float f23145f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23146g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23147h = new ArrayList();

    public z() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f13, float f14, float f15, float f16, float f17, float f18) {
        v vVar = new v(f13, f14, f15, f16);
        vVar.f23133f = f17;
        vVar.f23134g = f18;
        this.f23146g.add(vVar);
        t tVar = new t(vVar);
        float f19 = f17 + f18;
        boolean z13 = f18 < 0.0f;
        if (z13) {
            f17 = (f17 + 180.0f) % 360.0f;
        }
        float f23 = z13 ? (180.0f + f19) % 360.0f : f19;
        b(f17);
        this.f23147h.add(tVar);
        this.f23144e = f23;
        double d2 = f19;
        this.f23142c = (((f15 - f13) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f13 + f15) * 0.5f);
        this.f23143d = (((f16 - f14) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f14 + f16) * 0.5f);
    }

    public final void b(float f13) {
        float f14 = this.f23144e;
        if (f14 == f13) {
            return;
        }
        float f15 = ((f13 - f14) + 360.0f) % 360.0f;
        if (f15 > 180.0f) {
            return;
        }
        float f16 = this.f23142c;
        float f17 = this.f23143d;
        v vVar = new v(f16, f17, f16, f17);
        vVar.f23133f = this.f23144e;
        vVar.f23134g = f15;
        this.f23147h.add(new t(vVar));
        this.f23144e = f13;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f23146g;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((x) arrayList.get(i13)).a(matrix, path);
        }
    }

    public final void d(float f13, float f14) {
        w wVar = new w();
        wVar.f23135b = f13;
        wVar.f23136c = f14;
        this.f23146g.add(wVar);
        u uVar = new u(wVar, this.f23142c, this.f23143d);
        float b13 = uVar.b() + 270.0f;
        float b14 = uVar.b() + 270.0f;
        b(b13);
        this.f23147h.add(uVar);
        this.f23144e = b14;
        this.f23142c = f13;
        this.f23143d = f14;
    }

    public final void e(float f13, float f14, float f15, float f16) {
        this.f23140a = f13;
        this.f23141b = f14;
        this.f23142c = f13;
        this.f23143d = f14;
        this.f23144e = f15;
        this.f23145f = (f15 + f16) % 360.0f;
        this.f23146g.clear();
        this.f23147h.clear();
    }
}
