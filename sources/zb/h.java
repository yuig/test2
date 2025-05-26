package zb;

import android.graphics.Color;

/* loaded from: classes3.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f141503a;

    /* renamed from: b, reason: collision with root package name */
    public final e f141504b;

    /* renamed from: c, reason: collision with root package name */
    public final i f141505c;

    /* renamed from: d, reason: collision with root package name */
    public final i f141506d;

    /* renamed from: e, reason: collision with root package name */
    public final i f141507e;

    /* renamed from: f, reason: collision with root package name */
    public final i f141508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f141509g = true;

    public h(a aVar, fc.c cVar, androidx.camera.core.impl.j jVar) {
        this.f141503a = aVar;
        e a13 = ((dc.a) jVar.f16875b).a();
        this.f141504b = a13;
        a13.a(this);
        cVar.e(a13);
        e a14 = ((dc.b) jVar.f16876c).a();
        this.f141505c = (i) a14;
        a14.a(this);
        cVar.e(a14);
        e a15 = ((dc.b) jVar.f16877d).a();
        this.f141506d = (i) a15;
        a15.a(this);
        cVar.e(a15);
        e a16 = ((dc.b) jVar.f16878e).a();
        this.f141507e = (i) a16;
        a16.a(this);
        cVar.e(a16);
        e a17 = ((dc.b) jVar.f16879f).a();
        this.f141508f = (i) a17;
        a17.a(this);
        cVar.e(a17);
    }

    @Override // zb.a
    public final void a() {
        this.f141509g = true;
        this.f141503a.a();
    }

    public final void b(xb.a aVar) {
        if (this.f141509g) {
            this.f141509g = false;
            double floatValue = ((Float) this.f141506d.g()).floatValue() * 0.017453292519943295d;
            float floatValue2 = ((Float) this.f141507e.g()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.f141504b.g()).intValue();
            aVar.setShadowLayer(((Float) this.f141508f.g()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f141505c.g()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public final void c(androidx.appcompat.app.d dVar) {
        i iVar = this.f141505c;
        if (dVar == null) {
            iVar.l(null);
        } else {
            iVar.l(new g(dVar));
        }
    }
}
