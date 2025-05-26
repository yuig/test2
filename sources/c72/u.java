package c72;

import f72.l1;
import f72.o1;
import f72.p0;
import f72.p1;
import f72.q1;
import f72.t0;
import g72.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import q8.m0;
import r72.b2;
import r72.c2;
import r72.d2;
import r72.e2;
import r72.f2;
import r72.i1;
import r72.k0;
import r72.l2;
import r72.u1;
import r72.y1;
import r72.z1;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26927a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26928b;

    public u(f entityMapperCommon, m72.a shuffleCoreLogger) {
        Intrinsics.checkNotNullParameter(entityMapperCommon, "entityMapperCommon");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        this.f26927a = entityMapperCommon;
        this.f26928b = shuffleCoreLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g72.a0 a(r72.k0 r37, r72.i1 r38) {
        /*
            Method dump skipped, instructions count: 1585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c72.u.a(r72.k0, r72.i1):g72.a0");
    }

    public final q1 b(f2 shuffle) {
        t0 t0Var;
        String str;
        p1 i1Var;
        String str2;
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        List<z1> list = shuffle.f106470b;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (z1 z1Var : list) {
            boolean z13 = z1Var instanceof y1;
            Object obj = this.f26927a;
            if (z13) {
                List j13 = f0.j(Double.valueOf(z1Var.c().f106535a), Double.valueOf(z1Var.c().f106536b));
                double e13 = z1Var.e();
                double d2 = z1Var.d();
                g72.a0 a13 = ((u) obj).a(z1Var.a(), i1.f106497c);
                l2 from = ((y1) z1Var).f106726f;
                Intrinsics.checkNotNullParameter(from, "from");
                i1Var = new o1(j13, e13, d2, a13, new p0(from.f106540a, from.f106541b, from.f106542c, from.f106543d, from.f106544e.getValue().intValue(), from.f106545f.getValue().intValue()));
            } else {
                boolean z14 = z1Var instanceof u1;
                if (z14 && ((u1) z1Var).f106676h != null) {
                    List j14 = f0.j(Double.valueOf(z1Var.c().f106535a), Double.valueOf(z1Var.c().f106536b));
                    double e14 = z1Var.e();
                    double d13 = z1Var.d();
                    u uVar = (u) obj;
                    k0 a14 = z1Var.a();
                    u1 u1Var = (u1) z1Var;
                    i1 mask = u1Var.f106675g;
                    g72.a0 a15 = uVar.a(a14, mask);
                    Intrinsics.checkNotNullParameter(mask, "mask");
                    String str3 = (((true ^ ((m0) uVar.f26927a).f102963a) || mask.f106499b == null) && (str2 = mask.f106498a) != null) ? str2 : null;
                    String str4 = u1Var.f106676h;
                    String str5 = str4 == null ? null : str4;
                    if (str5 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    i1Var = new l1(j14, e14, d13, a15, str3, str5);
                } else {
                    if (!z14) {
                        throw new IllegalStateException("Unsupported ShuffleItem".toString());
                    }
                    List j15 = f0.j(Double.valueOf(z1Var.c().f106535a), Double.valueOf(z1Var.c().f106536b));
                    double e15 = z1Var.e();
                    double d14 = z1Var.d();
                    u uVar2 = (u) obj;
                    k0 a16 = z1Var.a();
                    u1 u1Var2 = (u1) z1Var;
                    i1 mask2 = u1Var2.f106675g;
                    g72.a0 a17 = uVar2.a(a16, mask2);
                    Intrinsics.checkNotNullParameter(mask2, "mask");
                    i1Var = new f72.i1(j15, e15, d14, a17, (((true ^ ((m0) uVar2.f26927a).f102963a) || mask2.f106499b == null) && (str = mask2.f106498a) != null) ? str : null, Long.parseLong(u1Var2.f106677i));
                }
            }
            arrayList.add(i1Var);
        }
        String str6 = shuffle.f106471c;
        String str7 = str6 == null ? null : str6;
        ((gi2.b) this.f26928b).getClass();
        r72.q1 from2 = shuffle.f106476h;
        Intrinsics.checkNotNullParameter(from2, "from");
        String str8 = from2.f106626a;
        e2 e2Var = from2.f106628c;
        if (e2Var instanceof b2) {
            t0Var = t0.None;
        } else if (e2Var instanceof c2) {
            int i13 = w.f26930a[((c2) e2Var).ordinal()];
            if (i13 == 1) {
                t0Var = t0.Parallax;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                t0Var = t0.TimeLapse;
            }
        } else {
            if (!(e2Var instanceof d2)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (w.f26931b[((d2) e2Var).ordinal()]) {
                case 1:
                    t0Var = t0.AnalogGrit;
                    break;
                case 2:
                    t0Var = t0.BitCrush;
                    break;
                case 3:
                    t0Var = t0.Butterflies;
                    break;
                case 4:
                    t0Var = t0.CityLights;
                    break;
                case 5:
                    t0Var = t0.EuphoriaGlitch;
                    break;
                case 6:
                    t0Var = t0.FairyDust;
                    break;
                case 7:
                    t0Var = t0.Fireworks;
                    break;
                case 8:
                    t0Var = t0.GlitterShower;
                    break;
                case 9:
                    t0Var = t0.HeavyRain;
                    break;
                case 10:
                    t0Var = t0.LightLeakColor;
                    break;
                case 11:
                    t0Var = t0.LightLeakMono;
                    break;
                case 12:
                    t0Var = t0.LightFrame;
                    break;
                case 13:
                    t0Var = t0.Snowglobe;
                    break;
                case 14:
                    t0Var = t0.Sparkler;
                    break;
                case 15:
                    t0Var = t0.Speed;
                    break;
                case 16:
                    t0Var = t0.Spotlights;
                    break;
                case 17:
                    t0Var = t0.Vhs;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new q1(arrayList, str7, shuffle.f106472d, shuffle.f106473e, shuffle.f106474f, shuffle.f106475g, new x4(str8, t0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0205, code lost:
    
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q72.g c(e72.d0 r50) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c72.u.c(e72.d0):q72.g");
    }

    public u(u modelMapperEffectData, gi2.b modelMapperShuffleEffectData) {
        Intrinsics.checkNotNullParameter(modelMapperEffectData, "modelMapperEffectData");
        Intrinsics.checkNotNullParameter(modelMapperShuffleEffectData, "modelMapperShuffleEffectData");
        this.f26927a = modelMapperEffectData;
        this.f26928b = modelMapperShuffleEffectData;
    }

    public u(m0 commonDebugSettings, g62.d rendererUtility) {
        Intrinsics.checkNotNullParameter(commonDebugSettings, "commonDebugSettings");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        this.f26927a = commonDebugSettings;
        this.f26928b = rendererUtility;
    }
}
