package c72;

import android.graphics.Color;
import g72.b3;
import g72.b4;
import g72.e3;
import g72.e4;
import g72.f1;
import g72.g1;
import g72.g3;
import g72.h4;
import g72.i0;
import g72.j3;
import g72.k2;
import g72.k4;
import g72.m3;
import g72.n0;
import g72.n1;
import g72.n4;
import g72.o0;
import g72.p1;
import g72.p2;
import g72.p3;
import g72.q4;
import g72.s1;
import g72.s2;
import g72.s3;
import g72.t4;
import g72.u0;
import g72.u1;
import g72.u4;
import g72.v1;
import g72.v2;
import g72.v3;
import g72.y2;
import g72.y3;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r72.d0;
import r72.e0;
import r72.e1;
import r72.f0;
import r72.g0;
import r72.g2;
import r72.h0;
import r72.i1;
import r72.j1;
import r72.k0;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p f26910a;

    /* renamed from: b, reason: collision with root package name */
    public final n72.m f26911b;

    /* renamed from: c, reason: collision with root package name */
    public final t62.b f26912c;

    public n(p entityMapperKeyframeAnimation, m72.a shuffleCoreLogger, g62.d rendererUtility) {
        Intrinsics.checkNotNullParameter(entityMapperKeyframeAnimation, "entityMapperKeyframeAnimation");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        this.f26910a = entityMapperKeyframeAnimation;
        this.f26911b = shuffleCoreLogger;
        this.f26912c = rendererUtility;
    }

    public static r72.a a(g72.r rVar) {
        String value;
        float[][] fArr;
        if (rVar == null || (value = rVar.f64090b) == null || (fArr = rVar.f64089a) == null) {
            return null;
        }
        float[] fArr2 = fArr[0];
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = fArr[1];
        j1 j1Var = new j1(f13, f14, fArr3[0], fArr3[1]);
        Intrinsics.checkNotNullParameter(value, "value");
        return new r72.a(j1Var, value);
    }

    public static i1 e(String value, g72.r rVar) {
        if (value != null) {
            int i13 = g2.f106487b;
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        return new i1(value, a(rVar));
    }

    public static r72.o g(String str, boolean z13, i0 i0Var) {
        f1 f1Var;
        f1 f1Var2;
        g72.v vVar;
        f1 f1Var3;
        f1 f1Var4;
        f1 f1Var5;
        f1 f1Var6;
        f1 f1Var7;
        f1 f1Var8;
        f1 f1Var9;
        g1 g1Var = i0Var.f64007b;
        float f13 = (g1Var == null || (f1Var9 = g1Var.f63989a) == null) ? 1.0f : f1Var9.f63982a;
        l lVar = l.Exposure;
        g1 g1Var2 = i0Var.f64008c;
        float mapToSupportXR = lVar.mapToSupportXR((g1Var2 == null || (f1Var8 = g1Var2.f63989a) == null) ? 0.0f : f1Var8.f63982a, z13);
        l lVar2 = l.Contrast;
        g1 g1Var3 = i0Var.f64009d;
        float mapToSupportXR2 = lVar2.mapToSupportXR((g1Var3 == null || (f1Var7 = g1Var3.f63989a) == null) ? 1.0f : f1Var7.f63982a, z13);
        g1 g1Var4 = i0Var.f64010e;
        float f14 = (g1Var4 == null || (f1Var6 = g1Var4.f63989a) == null) ? 1.0f : f1Var6.f63982a;
        g1 g1Var5 = i0Var.f64011f;
        float f15 = (g1Var5 == null || (f1Var5 = g1Var5.f63989a) == null) ? 0.0f : f1Var5.f63982a;
        l lVar3 = l.Warmth;
        g1 g1Var6 = i0Var.f64012g;
        float mapToSupportXR3 = lVar3.mapToSupportXR((g1Var6 == null || (f1Var4 = g1Var6.f63989a) == null) ? 0.0f : f1Var4.f63982a, z13);
        l lVar4 = l.Tone;
        g1 g1Var7 = i0Var.f64013h;
        float mapToSupportXR4 = lVar4.mapToSupportXR((g1Var7 == null || (f1Var3 = g1Var7.f63989a) == null) ? 0.0f : f1Var3.f63982a, z13);
        g72.x xVar = i0Var.f64014i;
        boolean z14 = (xVar == null || (vVar = xVar.f64139a) == null) ? false : vVar.f64125a;
        l lVar5 = l.Shadows;
        g1 g1Var8 = i0Var.f64015j;
        float mapToSupportXR5 = lVar5.mapToSupportXR((g1Var8 == null || (f1Var2 = g1Var8.f63989a) == null) ? 0.0f : f1Var2.f63982a, z13);
        g1 g1Var9 = i0Var.f64016k;
        float f16 = (g1Var9 == null || (f1Var = g1Var9.f63989a) == null) ? 1.0f : f1Var.f63982a;
        m condition = m.f26909i;
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (((Boolean) condition.invoke(Float.valueOf(f16))).booleanValue()) {
            f16 = ql2.s.f(f16, 0.0f, 1.0f);
        }
        return new r72.o(str, f13, mapToSupportXR, mapToSupportXR2, f14, f15, mapToSupportXR3, mapToSupportXR4, z14, mapToSupportXR5, f16);
    }

    public final r72.n b(v1 v1Var, boolean z13) {
        Object m13;
        float[] fArr;
        float[] fArr2;
        n0 n0Var;
        n0 n0Var2;
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (v1Var instanceof s1) {
                o0 o0Var = ((s1) v1Var).f64100d;
                if (o0Var == null || (n0Var2 = o0Var.f64062a) == null || (fArr = n0Var2.f64054a) == null) {
                    fArr = s1.f64097e;
                }
                if (fArr.length != 2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                o0 o0Var2 = ((s1) v1Var).f64100d;
                if (o0Var2 == null || (n0Var = o0Var2.f64062a) == null || (fArr2 = n0Var.f64054a) == null) {
                    fArr2 = s1.f64097e;
                }
                float f13 = fArr2[0];
                float f14 = fArr2[1];
                g1 g1Var = ((s1) v1Var).f64098b;
                float f15 = g1Var != null ? g1Var.f63991c : 0.5f;
                g1 g1Var2 = ((s1) v1Var).f64099c;
                m13 = new r72.l(f15, g1Var2 != null ? g1Var2.f63991c : 2.0f, f13, f14, z13);
            } else if (v1Var instanceof g72.j1) {
                if (((g72.j1) v1Var).a().length != 4) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                float f16 = 255;
                int argb = Color.argb((int) (((g72.j1) v1Var).a()[3] * f16), (int) (((g72.j1) v1Var).a()[0] * f16), (int) (((g72.j1) v1Var).a()[1] * f16), (int) (((g72.j1) v1Var).a()[2] * f16));
                g1 g1Var3 = ((g72.j1) v1Var).f64026b;
                m13 = new r72.j(g1Var3 != null ? g1Var3.f63991c : 1.0f, argb, z13);
            } else if (v1Var instanceof p1) {
                m13 = r72.k.f106511b;
            } else {
                if (!Intrinsics.d(v1Var, u1.INSTANCE) && !Intrinsics.d(v1Var, n1.INSTANCE) && v1Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                m13 = r72.i.f106496b;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = xk2.s.a(m13);
        if (a13 != null) {
            this.f26911b.d(a13, new yv1.i(v1Var, 27));
        }
        r72.i iVar = r72.i.f106496b;
        if (m13 instanceof xk2.r) {
            m13 = iVar;
        }
        return (r72.n) m13;
    }

    public final k0 c(g72.a0 a0Var, boolean z13, boolean z14) {
        Object m13;
        f1 f1Var;
        float[] fArr;
        float[] fArr2;
        if (a0Var == null) {
            return k0.f106512o;
        }
        g72.o oVar = a0Var.f63915f;
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (oVar instanceof g72.l) {
                u0 u0Var = ((g72.l) oVar).f64044b;
                if (u0Var == null || (fArr = u0Var.f64122b) == null) {
                    fArr = g72.l.f64043c;
                }
                if (fArr.length != 4) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                u0 u0Var2 = ((g72.l) oVar).f64044b;
                if (u0Var2 == null || (fArr2 = u0Var2.f64122b) == null) {
                    fArr2 = g72.l.f64043c;
                }
                m13 = new r72.c(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            } else if (oVar instanceof g72.c) {
                g1 g1Var = ((g72.c) oVar).f63947b;
                m13 = new r72.b((g1Var == null || (f1Var = g1Var.f63989a) == null) ? 1.0f : f1Var.f63982a);
            } else if (Intrinsics.d(oVar, g72.e.INSTANCE)) {
                m13 = r72.d.f106453b;
            } else if (Intrinsics.d(oVar, g72.g.INSTANCE)) {
                m13 = r72.f.f106466b;
            } else {
                if (!Intrinsics.d(oVar, g72.n.INSTANCE) && oVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                m13 = r72.e.f106461b;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = xk2.s.a(m13);
        if (a13 != null) {
            this.f26911b.d(a13, new yv1.i(oVar, 26));
        }
        r72.e eVar = r72.e.f106461b;
        if (m13 instanceof xk2.r) {
            m13 = eVar;
        }
        r72.g gVar = (r72.g) m13;
        r72.i0 f13 = f(a0Var.f63916g);
        r72.n b13 = b(a0Var.f63917h, z13);
        r72.s d2 = d(a0Var.f63918i, z14);
        Double d13 = a0Var.f63921l;
        double doubleValue = d13 != null ? d13.doubleValue() : 0.0d;
        Double d14 = a0Var.f63922m;
        double doubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
        e1 a14 = this.f26910a.a(a0Var.f63923n);
        String value = a0Var.f63924o;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        return new k0(a0Var.f63910a, a0Var.f63911b, a0Var.f63912c, a0Var.f63913d, a0Var.f63914e, gVar, f13, b13, d2, a0Var.f63919j, doubleValue, doubleValue2, a14, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r72.s d(g72.i0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c72.n.d(g72.i0, boolean):r72.s");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    public final r72.i0 f(u4 u4Var) {
        Object m13;
        float[] fArr;
        float[] fArr2;
        Object vVar;
        n0 n0Var;
        n0 n0Var2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        n0 n0Var3;
        n0 n0Var4;
        n0 n0Var5;
        n0 n0Var6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        float[] fArr10;
        float[] fArr11;
        float[] fArr12;
        float[] fArr13;
        float[] fArr14;
        float[] fArr15;
        float[] fArr16;
        ?? j13;
        float[] fArr17;
        float[] fArr18;
        float[] fArr19;
        float[] fArr20;
        float[] fArr21;
        float[] fArr22;
        f1 f1Var;
        f1 f1Var2;
        f1 f1Var3;
        f1 f1Var4;
        f1 f1Var5;
        f1 f1Var6;
        f1 f1Var7;
        f1 f1Var8;
        f1 f1Var9;
        f1 f1Var10;
        f1 f1Var11;
        f1 f1Var12;
        f1 f1Var13;
        float[] fArr23;
        float[] fArr24;
        f1 f1Var14;
        f1 f1Var15;
        n0 n0Var7;
        n0 n0Var8;
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (u4Var instanceof t4) {
                o0 o0Var = ((t4) u4Var).f64120d;
                if (o0Var == null || (n0Var8 = o0Var.f64062a) == null || (fArr23 = n0Var8.f64054a) == null) {
                    fArr23 = t4.f64117e;
                }
                if (fArr23.length != 2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                o0 o0Var2 = ((t4) u4Var).f64120d;
                if (o0Var2 == null || (n0Var7 = o0Var2.f64062a) == null || (fArr24 = n0Var7.f64054a) == null) {
                    fArr24 = t4.f64117e;
                }
                float f13 = fArr24[0];
                float f14 = fArr24[1];
                g1 g1Var = ((t4) u4Var).f64118b;
                if (g1Var != null && (f1Var15 = g1Var.f63989a) != null) {
                    r5 = f1Var15.f63982a;
                }
                g1 g1Var2 = ((t4) u4Var).f64119c;
                m13 = new h0(r5, (g1Var2 == null || (f1Var14 = g1Var2.f63989a) == null) ? 0.05235988f : f1Var14.f63982a, f13, f14);
            } else if (u4Var instanceof q4) {
                g1 g1Var3 = ((q4) u4Var).f64087b;
                if (g1Var3 != null && (f1Var13 = g1Var3.f63989a) != null) {
                    r5 = f1Var13.f63982a;
                }
                m13 = new g0(r5);
            } else if (u4Var instanceof y2) {
                g1 g1Var4 = ((y2) u4Var).f64158b;
                if (g1Var4 != null && (f1Var12 = g1Var4.f63989a) != null) {
                    r5 = f1Var12.f63982a;
                }
                m13 = new r72.x(r5);
            } else if (u4Var instanceof v3) {
                g1 g1Var5 = ((v3) u4Var).f64130b;
                if (g1Var5 != null && (f1Var11 = g1Var5.f63989a) != null) {
                    r5 = f1Var11.f63982a;
                }
                m13 = new r72.c0(r5);
            } else if (u4Var instanceof n4) {
                g1 g1Var6 = ((n4) u4Var).f64060b;
                if (g1Var6 != null && (f1Var10 = g1Var6.f63989a) != null) {
                    r5 = f1Var10.f63982a;
                }
                m13 = new d0(r5, false);
            } else {
                if (u4Var instanceof e3) {
                    g1 g1Var7 = ((e3) u4Var).f63971b;
                    if (g1Var7 != null && (f1Var9 = g1Var7.f63989a) != null) {
                        r5 = f1Var9.f63982a;
                    }
                    vVar = new d0(r5, true);
                } else if (u4Var instanceof b4) {
                    g1 g1Var8 = ((b4) u4Var).f63945b;
                    if (g1Var8 != null && (f1Var8 = g1Var8.f63989a) != null) {
                        r5 = f1Var8.f63982a;
                    }
                    g72.x xVar = ((b4) u4Var).f63946c;
                    vVar = new d0(r5, xVar != null ? xVar.f64141c : true);
                } else if (u4Var instanceof s3) {
                    g1 g1Var9 = ((s3) u4Var).f64107b;
                    if (g1Var9 != null && (f1Var7 = g1Var9.f63989a) != null) {
                        r5 = f1Var7.f63982a;
                    }
                    m13 = new r72.b0(r5);
                } else if (u4Var instanceof k4) {
                    g1 g1Var10 = ((k4) u4Var).f64042b;
                    if (g1Var10 != null && (f1Var6 = g1Var10.f63989a) != null) {
                        r5 = f1Var6.f63982a;
                    }
                    m13 = new f0(r5);
                } else if (u4Var instanceof p3) {
                    g1 g1Var11 = ((p3) u4Var).f64080b;
                    if (g1Var11 != null && (f1Var5 = g1Var11.f63989a) != null) {
                        r5 = f1Var5.f63982a;
                    }
                    vVar = new r72.a0(r5, true);
                } else if (u4Var instanceof m3) {
                    g1 g1Var12 = ((m3) u4Var).f64052b;
                    if (g1Var12 != null && (f1Var4 = g1Var12.f63989a) != null) {
                        r5 = f1Var4.f63982a;
                    }
                    m13 = new r72.a0(r5, false);
                } else if (u4Var instanceof j3) {
                    g1 g1Var13 = ((j3) u4Var).f64028b;
                    if (g1Var13 != null && (f1Var3 = g1Var13.f63989a) != null) {
                        r5 = f1Var3.f63982a;
                    }
                    g72.x xVar2 = ((j3) u4Var).f64029c;
                    vVar = new r72.a0(r5, xVar2 != null ? xVar2.f64141c : true);
                } else if (u4Var instanceof h4) {
                    g1 g1Var14 = ((h4) u4Var).f64004b;
                    if (g1Var14 != null && (f1Var2 = g1Var14.f63989a) != null) {
                        r5 = f1Var2.f63982a;
                    }
                    m13 = new e0(r5);
                } else if (u4Var instanceof v2) {
                    g1 g1Var15 = ((v2) u4Var).f64129b;
                    if (g1Var15 != null && (f1Var = g1Var15.f63989a) != null) {
                        r5 = f1Var.f63982a;
                    }
                    m13 = new r72.w(r5);
                } else if (u4Var instanceof e4) {
                    o0 o0Var3 = ((e4) u4Var).f63976d;
                    if (o0Var3 == null || (fArr19 = o0Var3.f64064c) == null) {
                        fArr19 = e4.f63972g;
                    }
                    if (fArr19.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var4 = ((e4) u4Var).f63976d;
                    if (o0Var4 == null || (fArr20 = o0Var4.f64064c) == null) {
                        fArr20 = e4.f63972g;
                    }
                    float f15 = fArr20[0];
                    float f16 = fArr20[1];
                    o0 o0Var5 = ((e4) u4Var).f63977e;
                    if (o0Var5 == null || (fArr21 = o0Var5.f64064c) == null) {
                        fArr21 = e4.f63973h;
                    }
                    if (fArr21.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var6 = ((e4) u4Var).f63977e;
                    if (o0Var6 == null || (fArr22 = o0Var6.f64064c) == null) {
                        fArr22 = e4.f63973h;
                    }
                    ArrayList arrayList = new ArrayList(fArr22.length);
                    for (float f17 : fArr22) {
                        arrayList.add(Float.valueOf(f17 - 0.5f));
                    }
                    float floatValue = ((Number) arrayList.get(0)).floatValue();
                    float floatValue2 = ((Number) arrayList.get(1)).floatValue();
                    g1 g1Var16 = ((e4) u4Var).f63974b;
                    float f18 = g1Var16 != null ? g1Var16.f63991c : 1.0f;
                    g1 g1Var17 = ((e4) u4Var).f63975c;
                    float f19 = g1Var17 != null ? g1Var17.f63991c : 1.0f;
                    g72.x xVar3 = ((e4) u4Var).f63978f;
                    m13 = new r72.t(f18, f19, f15, f16, floatValue, floatValue2, xVar3 != null ? xVar3.f64141c : false);
                } else if (u4Var instanceof k2) {
                    o0 o0Var7 = ((k2) u4Var).f64035d;
                    if (o0Var7 == null || (fArr15 = o0Var7.f64064c) == null) {
                        fArr15 = k2.f64031i;
                    }
                    if (fArr15.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var8 = ((k2) u4Var).f64035d;
                    if (o0Var8 == null || (fArr16 = o0Var8.f64064c) == null) {
                        fArr16 = k2.f64031i;
                    }
                    float f23 = fArr16[0];
                    float f24 = fArr16[1];
                    if (((k2) u4Var).f64036e != null) {
                        o0 o0Var9 = ((k2) u4Var).f64036e;
                        if (o0Var9 == null || (fArr17 = o0Var9.f64064c) == null) {
                            fArr17 = k2.f64032j;
                        }
                        if (fArr17.length != 2) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        o0 o0Var10 = ((k2) u4Var).f64036e;
                        if (o0Var10 == null || (fArr18 = o0Var10.f64064c) == null) {
                            fArr18 = k2.f64032j;
                        }
                        j13 = new ArrayList(fArr18.length);
                        for (float f25 : fArr18) {
                            j13.add(Float.valueOf(f25 - 0.5f));
                        }
                    } else {
                        Float[] fArr25 = new Float[2];
                        g1 g1Var18 = ((k2) u4Var).f64037f;
                        fArr25[0] = Float.valueOf(g1Var18 != null ? g1Var18.f63991c : 0.0f);
                        fArr25[1] = Float.valueOf(((k2) u4Var).c());
                        j13 = kotlin.collections.f0.j(fArr25);
                    }
                    m13 = new r72.t(((k2) u4Var).d(), ((k2) u4Var).b(), f23, f24, ((Number) j13.get(0)).floatValue(), ((Number) j13.get(1)).floatValue(), ((k2) u4Var).a());
                } else if (u4Var instanceof b3) {
                    o0 o0Var11 = ((b3) u4Var).f63943g;
                    if (o0Var11 == null || (fArr7 = o0Var11.f64064c) == null) {
                        fArr7 = b3.f63934i;
                    }
                    if (fArr7.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var12 = ((b3) u4Var).f63943g;
                    if (o0Var12 == null || (fArr8 = o0Var12.f64064c) == null) {
                        fArr8 = b3.f63934i;
                    }
                    float f26 = fArr8[0];
                    o0 o0Var13 = ((b3) u4Var).f63944h;
                    if (o0Var13 == null || (fArr9 = o0Var13.f64064c) == null) {
                        fArr9 = b3.f63935j;
                    }
                    if (fArr9.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var14 = ((b3) u4Var).f63944h;
                    if (o0Var14 == null || (fArr10 = o0Var14.f64064c) == null) {
                        fArr10 = b3.f63935j;
                    }
                    float f27 = fArr10[1];
                    o0 o0Var15 = ((b3) u4Var).f63941e;
                    if (o0Var15 == null || (fArr11 = o0Var15.f64064c) == null) {
                        fArr11 = b3.f63936k;
                    }
                    if (fArr11.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var16 = ((b3) u4Var).f63941e;
                    if (o0Var16 == null || (fArr12 = o0Var16.f64064c) == null) {
                        fArr12 = b3.f63936k;
                    }
                    float f28 = fArr12[0];
                    o0 o0Var17 = ((b3) u4Var).f63940d;
                    if (o0Var17 == null || (fArr13 = o0Var17.f64064c) == null) {
                        fArr13 = b3.f63937l;
                    }
                    if (fArr13.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var18 = ((b3) u4Var).f63940d;
                    if (o0Var18 == null || (fArr14 = o0Var18.f64064c) == null) {
                        fArr14 = b3.f63937l;
                    }
                    m13 = new r72.y(((b3) u4Var).b(), ((b3) u4Var).a(), f26, f27, f28, 1.0f - fArr14[1]);
                } else if (u4Var instanceof y3) {
                    m13 = new r72.y(((y3) u4Var).f(), ((y3) u4Var).e(), ((y3) u4Var).c(), ((y3) u4Var).d(), ((y3) u4Var).b(), ((y3) u4Var).a());
                } else if (u4Var instanceof p2) {
                    o0 o0Var19 = ((p2) u4Var).f64077d;
                    if (o0Var19 == null || (n0Var6 = o0Var19.f64062a) == null || (fArr3 = n0Var6.f64054a) == null) {
                        fArr3 = p2.f64074h;
                    }
                    if (fArr3.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var20 = ((p2) u4Var).f64077d;
                    if (o0Var20 == null || (n0Var5 = o0Var20.f64062a) == null || (fArr4 = n0Var5.f64054a) == null) {
                        fArr4 = p2.f64074h;
                    }
                    float f29 = fArr4[0];
                    float f33 = fArr4[1];
                    o0 o0Var21 = ((p2) u4Var).f64076c;
                    if (o0Var21 == null || (n0Var4 = o0Var21.f64062a) == null || (fArr5 = n0Var4.f64054a) == null) {
                        fArr5 = p2.f64073g;
                    }
                    if (fArr5.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var22 = ((p2) u4Var).f64076c;
                    if (o0Var22 == null || (n0Var3 = o0Var22.f64062a) == null || (fArr6 = n0Var3.f64054a) == null) {
                        fArr6 = p2.f64073g;
                    }
                    ArrayList arrayList2 = new ArrayList(fArr6.length);
                    for (float f34 : fArr6) {
                        arrayList2.add(Float.valueOf(f34 - 0.5f));
                    }
                    m13 = new r72.v(((p2) u4Var).c(), Math.max(Math.abs(((Number) arrayList2.get(0)).floatValue()), Math.abs(((Number) arrayList2.get(1)).floatValue())), f29, f33, !((p2) u4Var).b(), ((p2) u4Var).a());
                } else if (u4Var instanceof s2) {
                    o0 o0Var23 = ((s2) u4Var).f64104d;
                    if (o0Var23 == null || (n0Var2 = o0Var23.f64062a) == null || (fArr = n0Var2.f64054a) == null) {
                        fArr = s2.f64101g;
                    }
                    if (fArr.length != 2) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    o0 o0Var24 = ((s2) u4Var).f64104d;
                    if (o0Var24 == null || (n0Var = o0Var24.f64062a) == null || (fArr2 = n0Var.f64054a) == null) {
                        fArr2 = s2.f64101g;
                    }
                    vVar = new r72.v(((s2) u4Var).d(), ((s2) u4Var).a(), fArr2[0], fArr2[1], !((s2) u4Var).c(), ((s2) u4Var).b());
                } else {
                    if (!Intrinsics.d(u4Var, g3.INSTANCE) && u4Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m13 = r72.z.f106727b;
                }
                m13 = vVar;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = xk2.s.a(m13);
        if (a13 != null) {
            this.f26911b.d(a13, new yv1.i(u4Var, 29));
        }
        r72.z zVar = r72.z.f106727b;
        if (m13 instanceof xk2.r) {
            m13 = zVar;
        }
        return (r72.i0) m13;
    }
}
