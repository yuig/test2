package yb;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import ec.y;
import i2.a2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class p implements n, zb.a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f138415e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.v f138416f;

    /* renamed from: g, reason: collision with root package name */
    public final ec.m f138417g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f138418h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f138419i;

    /* renamed from: j, reason: collision with root package name */
    public final zb.i f138420j;

    /* renamed from: k, reason: collision with root package name */
    public final zb.e f138421k;

    /* renamed from: l, reason: collision with root package name */
    public final zb.i f138422l;

    /* renamed from: m, reason: collision with root package name */
    public final zb.i f138423m;

    /* renamed from: n, reason: collision with root package name */
    public final zb.i f138424n;

    /* renamed from: o, reason: collision with root package name */
    public final zb.i f138425o;

    /* renamed from: p, reason: collision with root package name */
    public final zb.i f138426p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f138428r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f138411a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f138412b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f138413c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f138414d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final a2 f138427q = new a2(1);

    public p(com.airbnb.lottie.v vVar, fc.c cVar, ec.n nVar) {
        this.f138416f = vVar;
        this.f138415e = nVar.f58316a;
        ec.m mVar = nVar.f58317b;
        this.f138417g = mVar;
        this.f138418h = nVar.f58325j;
        this.f138419i = nVar.f58326k;
        zb.e a13 = nVar.f58318c.a();
        this.f138420j = (zb.i) a13;
        zb.e a14 = nVar.f58319d.a();
        this.f138421k = a14;
        zb.e a15 = nVar.f58320e.a();
        this.f138422l = (zb.i) a15;
        zb.e a16 = nVar.f58322g.a();
        this.f138424n = (zb.i) a16;
        zb.e a17 = nVar.f58324i.a();
        this.f138426p = (zb.i) a17;
        ec.m mVar2 = ec.m.STAR;
        if (mVar == mVar2) {
            this.f138423m = (zb.i) nVar.f58321f.a();
            this.f138425o = (zb.i) nVar.f58323h.a();
        } else {
            this.f138423m = null;
            this.f138425o = null;
        }
        cVar.e(a13);
        cVar.e(a14);
        cVar.e(a15);
        cVar.e(a16);
        cVar.e(a17);
        if (mVar == mVar2) {
            cVar.e(this.f138423m);
            cVar.e(this.f138425o);
        }
        a13.a(this);
        a14.a(this);
        a15.a(this);
        a16.a(this);
        a17.a(this);
        if (mVar == mVar2) {
            this.f138423m.a(this);
            this.f138425o.a(this);
        }
    }

    @Override // zb.a
    public final void a() {
        this.f138428r = false;
        this.f138416f.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i13 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i13);
            if (cVar instanceof w) {
                w wVar = (w) cVar;
                if (wVar.f138467c == y.SIMULTANEOUSLY) {
                    this.f138427q.f71073a.add(wVar);
                    wVar.d(this);
                }
            }
            i13++;
        }
    }

    @Override // cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        zb.i iVar;
        zb.i iVar2;
        if (obj == com.airbnb.lottie.y.f28496r) {
            this.f138420j.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28497s) {
            this.f138422l.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28487i) {
            this.f138421k.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28498t && (iVar2 = this.f138423m) != null) {
            iVar2.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28499u) {
            this.f138424n.l(dVar);
            return;
        }
        if (obj == com.airbnb.lottie.y.f28500v && (iVar = this.f138425o) != null) {
            iVar.l(dVar);
        } else if (obj == com.airbnb.lottie.y.f28501w) {
            this.f138426p.l(dVar);
        }
    }

    @Override // cc.g
    public final void g(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        jc.f.f(fVar, i13, arrayList, fVar2, this);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138415e;
    }

    @Override // yb.n
    public final Path r() {
        float f13;
        double d2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f23;
        float f24;
        float f25;
        float f26;
        int i13;
        int i14;
        double d13;
        float f27;
        p pVar;
        float f28;
        p pVar2 = this;
        boolean z13 = pVar2.f138428r;
        Path path = pVar2.f138411a;
        if (z13) {
            return path;
        }
        path.reset();
        if (pVar2.f138418h) {
            pVar2.f138428r = true;
            return path;
        }
        int i15 = o.f138410a[pVar2.f138417g.ordinal()];
        zb.e eVar = pVar2.f138421k;
        zb.i iVar = pVar2.f138424n;
        zb.i iVar2 = pVar2.f138426p;
        zb.i iVar3 = pVar2.f138422l;
        zb.i iVar4 = pVar2.f138420j;
        if (i15 == 1) {
            boolean z14 = false;
            float floatValue = ((Float) iVar4.g()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.g()).floatValue() : 0.0d) - 90.0d);
            double d14 = floatValue;
            float f29 = (float) (6.283185307179586d / d14);
            if (pVar2.f138419i) {
                f29 *= -1.0f;
            }
            float f33 = f29;
            float f34 = f33 / 2.0f;
            float f35 = floatValue - ((int) floatValue);
            if (f35 != 0.0f) {
                radians += (1.0f - f35) * f34;
            }
            float floatValue2 = ((Float) iVar.g()).floatValue();
            float floatValue3 = ((Float) pVar2.f138423m.g()).floatValue();
            zb.i iVar5 = pVar2.f138425o;
            float floatValue4 = iVar5 != null ? ((Float) iVar5.g()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = iVar2 != null ? ((Float) iVar2.g()).floatValue() / 100.0f : 0.0f;
            if (f35 != 0.0f) {
                float a13 = ep.b.a(floatValue2, floatValue3, f35, floatValue3);
                double d15 = a13;
                float cos = (float) (Math.cos(radians) * d15);
                float sin = (float) (d15 * Math.sin(radians));
                path.moveTo(cos, sin);
                d2 = radians + ((f33 * f35) / 2.0f);
                f15 = cos;
                f16 = a13;
                f14 = sin;
                f13 = f34;
            } else {
                double d16 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d16);
                float sin2 = (float) (d16 * Math.sin(radians));
                path.moveTo(cos2, sin2);
                f13 = f34;
                d2 = radians + f13;
                f14 = sin2;
                f15 = cos2;
                f16 = 0.0f;
            }
            double ceil = Math.ceil(d14) * 2.0d;
            double d17 = d2;
            int i16 = 0;
            float f36 = floatValue3;
            while (true) {
                double d18 = i16;
                if (d18 >= ceil) {
                    break;
                }
                float f37 = z14 ? floatValue2 : f36;
                if (f16 == 0.0f || d18 != ceil - 2.0d) {
                    f17 = f33;
                    f18 = f13;
                } else {
                    f17 = f33;
                    f18 = (f33 * f35) / 2.0f;
                }
                if (f16 == 0.0f || d18 != ceil - 1.0d) {
                    f19 = floatValue2;
                    f23 = f37;
                    f24 = f36;
                } else {
                    f19 = floatValue2;
                    f24 = f36;
                    f23 = f16;
                }
                double d19 = f23;
                float f38 = f16;
                float f39 = f13;
                float cos3 = (float) (Math.cos(d17) * d19);
                float sin3 = (float) (d19 * Math.sin(d17));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    path.lineTo(cos3, sin3);
                    f25 = f24;
                    f26 = f19;
                    i13 = i16;
                } else {
                    float f41 = f14;
                    double atan2 = (float) (Math.atan2(f14, f15) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    float f43 = f15;
                    double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f44 = z14 ? floatValue4 : floatValue5;
                    float f45 = z14 ? floatValue5 : floatValue4;
                    float f46 = (z14 ? f24 : f19) * f44 * 0.47829f;
                    float f47 = cos4 * f46;
                    float f48 = f46 * sin4;
                    float f49 = (z14 ? f19 : f24) * f45 * 0.47829f;
                    float f53 = cos5 * f49;
                    float f54 = f49 * sin5;
                    if (f35 != 0.0f) {
                        if (i16 == 0) {
                            f47 *= f35;
                            f48 *= f35;
                        } else {
                            if (d18 == ceil - 1.0d) {
                                f53 *= f35;
                                f54 *= f35;
                            }
                            f25 = f24;
                            f26 = f19;
                            i13 = i16;
                            path.cubicTo(f43 - f47, f41 - f48, cos3 + f53, sin3 + f54, cos3, sin3);
                        }
                    }
                    f25 = f24;
                    f26 = f19;
                    i13 = i16;
                    path.cubicTo(f43 - f47, f41 - f48, cos3 + f53, sin3 + f54, cos3, sin3);
                }
                d17 += f18;
                z14 = !z14;
                i16 = i13 + 1;
                f36 = f25;
                f15 = cos3;
                f14 = sin3;
                floatValue2 = f26;
                f33 = f17;
                f13 = f39;
                f16 = f38;
            }
            PointF pointF = (PointF) eVar.g();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i15 == 2) {
            int floor = (int) Math.floor(((Float) iVar4.g()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.g()).floatValue() : 0.0d) - 90.0d);
            double d23 = floor;
            float floatValue6 = ((Float) iVar2.g()).floatValue() / 100.0f;
            float floatValue7 = ((Float) iVar.g()).floatValue();
            double d24 = floatValue7;
            float cos6 = (float) (Math.cos(radians2) * d24);
            float sin6 = (float) (Math.sin(radians2) * d24);
            path.moveTo(cos6, sin6);
            double d25 = (float) (6.283185307179586d / d23);
            double ceil2 = Math.ceil(d23);
            double d26 = radians2 + d25;
            int i17 = 0;
            while (true) {
                double d27 = i17;
                if (d27 >= ceil2) {
                    break;
                }
                zb.e eVar2 = eVar;
                double d28 = d25;
                float cos7 = (float) (Math.cos(d26) * d24);
                float sin7 = (float) (Math.sin(d26) * d24);
                if (floatValue6 != 0.0f) {
                    d13 = d24;
                    double atan23 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    float f55 = cos6;
                    i14 = i17;
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float f56 = floatValue7 * floatValue6 * 0.25f;
                    float f57 = cos8 * f56;
                    float f58 = sin8 * f56;
                    float cos9 = ((float) Math.cos(atan24)) * f56;
                    float sin9 = f56 * ((float) Math.sin(atan24));
                    if (d27 == ceil2 - 1.0d) {
                        pVar = this;
                        Path path2 = pVar.f138412b;
                        path2.reset();
                        path2.moveTo(f55, sin6);
                        float f59 = f55 - f57;
                        float f63 = sin6 - f58;
                        float f64 = cos7 + cos9;
                        float f65 = sin7 + sin9;
                        path2.cubicTo(f59, f63, f64, f65, cos7, sin7);
                        PathMeasure pathMeasure = pVar.f138413c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = pVar.f138414d;
                        pathMeasure.getPosTan(length, fArr, null);
                        f27 = floatValue7;
                        path.cubicTo(f59, f63, f64, f65, fArr[0], fArr[1]);
                    } else {
                        pVar = this;
                        f27 = floatValue7;
                        path.cubicTo(f55 - f57, sin6 - f58, cos7 + cos9, sin7 + sin9, cos7, sin7);
                    }
                    f28 = sin7;
                } else {
                    i14 = i17;
                    d13 = d24;
                    f27 = floatValue7;
                    pVar = pVar2;
                    if (d27 == ceil2 - 1.0d) {
                        f28 = sin7;
                        sin6 = f28;
                        pVar2 = pVar;
                        i17 = i14 + 1;
                        cos6 = cos7;
                        d24 = d13;
                        floatValue7 = f27;
                        eVar = eVar2;
                        d25 = d28;
                    } else {
                        f28 = sin7;
                        path.lineTo(cos7, f28);
                    }
                }
                d26 += d28;
                sin6 = f28;
                pVar2 = pVar;
                i17 = i14 + 1;
                cos6 = cos7;
                d24 = d13;
                floatValue7 = f27;
                eVar = eVar2;
                d25 = d28;
            }
            PointF pointF2 = (PointF) eVar.g();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f138427q.e(path);
        this.f138428r = true;
        return path;
    }
}
