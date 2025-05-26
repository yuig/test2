package ads_mobile_sdk;

import a.h4;
import a.ih;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.m2;
import net.quikkly.android.utils.BitmapUtils;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class ya1 implements a.tb {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14158n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f14159o = mw2.a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f14160a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14163d;

    /* renamed from: e, reason: collision with root package name */
    public final a.xe f14164e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14165f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f14166g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14167h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14168i;

    /* renamed from: j, reason: collision with root package name */
    public final a.ed f14169j;

    /* renamed from: k, reason: collision with root package name */
    public final a.wf f14170k;

    /* renamed from: l, reason: collision with root package name */
    public final a.tf f14171l;

    /* renamed from: m, reason: collision with root package name */
    public final a.mf f14172m;

    public ya1(int[] iArr, Object[] objArr, int i13, int i14, a.xe xeVar, int[] iArr2, int i15, int i16, a.ed edVar, a.wf wfVar, a.tf tfVar, a.x6 x6Var, a.mf mfVar) {
        this.f14160a = iArr;
        this.f14161b = objArr;
        this.f14162c = i13;
        this.f14163d = i14;
        this.f14165f = xeVar instanceof sj0;
        this.f14166g = iArr2;
        this.f14167h = i15;
        this.f14168i = i16;
        this.f14169j = edVar;
        this.f14170k = wfVar;
        this.f14171l = tfVar;
        this.f14164e = xeVar;
        this.f14172m = mfVar;
    }

    public static long d(int i13) {
        return i13 & 1048575;
    }

    public static void e(Object obj) {
        if (!g(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static yv2 f(Object obj) {
        sj0 sj0Var = (sj0) obj;
        yv2 yv2Var = sj0Var.f11118b;
        if (yv2Var != yv2.f14423f) {
            return yv2Var;
        }
        yv2 b13 = yv2.b();
        sj0Var.f11118b = b13;
        return b13;
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof sj0) {
            return ((sj0) obj).m();
        }
        return true;
    }

    public final void a(int i13, a.q3 q3Var, Object obj) {
        if ((536870912 & i13) != 0) {
            jo joVar = (jo) q3Var;
            joVar.b(2);
            mw2.f8408c.a(i13 & 1048575, obj, joVar.f6898a.q());
            return;
        }
        if (this.f14165f) {
            jo joVar2 = (jo) q3Var;
            joVar2.b(2);
            mw2.f8408c.a(i13 & 1048575, obj, joVar2.f6898a.p());
            return;
        }
        jo joVar3 = (jo) q3Var;
        joVar3.b(2);
        mw2.f8408c.a(i13 & 1048575, obj, joVar3.f6898a.d());
    }

    public final void b(int i13, a.q3 q3Var, Object obj) {
        if ((536870912 & i13) != 0) {
            ((a.tg) this.f14170k).getClass();
            ((jo) q3Var).a(a.tg.b(i13 & 1048575, obj), true);
        } else {
            ((a.tg) this.f14170k).getClass();
            ((jo) q3Var).a(a.tg.b(i13 & 1048575, obj), false);
        }
    }

    public final a.tb c(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f14161b;
        a.tb tbVar = (a.tb) objArr[i14];
        if (tbVar != null) {
            return tbVar;
        }
        a.tb a13 = k22.f7066c.a((Class) objArr[i14 + 1]);
        this.f14161b[i14] = a13;
        return a13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x020c, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
    
        r8 = r8 + r2;
     */
    @Override // a.tb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.d(java.lang.Object):int");
    }

    @Override // a.tb
    public final void c(Object obj) {
        if (g(obj)) {
            if (obj instanceof sj0) {
                sj0 sj0Var = (sj0) obj;
                sj0Var.e();
                sj0Var.d();
                sj0Var.o();
            }
            int length = this.f14160a.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int[] iArr = this.f14160a;
                int i14 = iArr[i13 + 1];
                long j13 = 1048575 & i14;
                int i15 = (i14 & 267386880) >>> 20;
                if (i15 != 9) {
                    if (i15 != 60 && i15 != 68) {
                        switch (i15) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((a.tg) this.f14170k).getClass();
                                a.tg.a(j13, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f14159o;
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    ((a.xf) this.f14172m).getClass();
                                    a.xf.g(object);
                                    unsafe.putObject(obj, j13, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (a(obj, iArr[i13], i13)) {
                        c(i13).c(f14159o.getObject(obj, j13));
                    }
                }
                if (a(i13, obj)) {
                    c(i13).c(f14159o.getObject(obj, j13));
                }
            }
            this.f14171l.d(obj);
        }
    }

    @Override // a.tb
    public final boolean b(Object obj, Object obj2) {
        boolean a13;
        int length = this.f14160a.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int[] iArr = this.f14160a;
            int i14 = iArr[i13 + 1];
            long j13 = i14 & 1048575;
            switch ((i14 & 267386880) >>> 20) {
                case 0:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var = mw2.f8408c;
                        if (Double.doubleToLongBits(lw2Var.c(obj, j13)) == Double.doubleToLongBits(lw2Var.c(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var2 = mw2.f8408c;
                        if (Float.floatToIntBits(lw2Var2.d(obj, j13)) == Float.floatToIntBits(lw2Var2.d(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var3 = mw2.f8408c;
                        if (lw2Var3.f(obj, j13) == lw2Var3.f(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var4 = mw2.f8408c;
                        if (lw2Var4.f(obj, j13) == lw2Var4.f(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var5 = mw2.f8408c;
                        if (lw2Var5.e(obj, j13) == lw2Var5.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var6 = mw2.f8408c;
                        if (lw2Var6.f(obj, j13) == lw2Var6.f(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var7 = mw2.f8408c;
                        if (lw2Var7.e(obj, j13) == lw2Var7.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var8 = mw2.f8408c;
                        if (lw2Var8.a(obj, j13) == lw2Var8.a(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var9 = mw2.f8408c;
                        if (td2.a(lw2Var9.g(obj, j13), lw2Var9.g(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var10 = mw2.f8408c;
                        if (td2.a(lw2Var10.g(obj, j13), lw2Var10.g(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var11 = mw2.f8408c;
                        if (td2.a(lw2Var11.g(obj, j13), lw2Var11.g(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var12 = mw2.f8408c;
                        if (lw2Var12.e(obj, j13) == lw2Var12.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var13 = mw2.f8408c;
                        if (lw2Var13.e(obj, j13) == lw2Var13.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var14 = mw2.f8408c;
                        if (lw2Var14.e(obj, j13) == lw2Var14.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var15 = mw2.f8408c;
                        if (lw2Var15.f(obj, j13) == lw2Var15.f(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var16 = mw2.f8408c;
                        if (lw2Var16.e(obj, j13) == lw2Var16.e(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var17 = mw2.f8408c;
                        if (lw2Var17.f(obj, j13) == lw2Var17.f(obj2, j13)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (a(i13, obj, obj2)) {
                        lw2 lw2Var18 = mw2.f8408c;
                        if (td2.a(lw2Var18.g(obj, j13), lw2Var18.g(obj2, j13))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    lw2 lw2Var19 = mw2.f8408c;
                    a13 = td2.a(lw2Var19.g(obj, j13), lw2Var19.g(obj2, j13));
                    break;
                case 50:
                    lw2 lw2Var20 = mw2.f8408c;
                    a13 = td2.a(lw2Var20.g(obj, j13), lw2Var20.g(obj2, j13));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j14 = iArr[i13 + 2] & 1048575;
                    lw2 lw2Var21 = mw2.f8408c;
                    if (lw2Var21.e(obj, j14) == lw2Var21.e(obj2, j14) && td2.a(lw2Var21.g(obj, j13), lw2Var21.g(obj2, j13))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!a13) {
                return false;
            }
        }
        ((ih) this.f14171l).getClass();
        yv2 yv2Var = ((sj0) obj).f11118b;
        ((ih) this.f14171l).getClass();
        return yv2Var.equals(((sj0) obj2).f11118b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [ads_mobile_sdk.ya1] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v172, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v188, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v193, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object] */
    public final void a(a.tf tfVar, Object obj, a.q3 q3Var, jc0 jc0Var) {
        ?? r13 = 0;
        while (true) {
            yv2 yv2Var = r13;
            while (true) {
                try {
                    jo joVar = (jo) q3Var;
                    int a13 = joVar.a();
                    int a14 = (a13 < this.f14162c || a13 > this.f14163d) ? -1 : a(a13, 0);
                    if (a14 < 0) {
                        if (a13 == Integer.MAX_VALUE) {
                            Object obj2 = yv2Var;
                            for (int i13 = this.f14167h; i13 < this.f14168i; i13++) {
                                obj2 = a(obj, this.f14166g[i13], obj2, tfVar, obj);
                            }
                            if (obj2 != null) {
                                tfVar.b(obj, obj2);
                                return;
                            }
                            return;
                        }
                        tfVar.getClass();
                        if (yv2Var == null) {
                            yv2Var = tfVar.a(obj);
                        }
                        if (!a.tf.c(0, joVar, yv2Var)) {
                            Object obj3 = yv2Var;
                            for (int i14 = this.f14167h; i14 < this.f14168i; i14++) {
                                obj3 = a(obj, this.f14166g[i14], obj3, tfVar, obj);
                            }
                            if (obj3 != null) {
                                tfVar.b(obj, obj3);
                                return;
                            }
                            return;
                        }
                    } else {
                        int i15 = this.f14160a[a14 + 1];
                        switch ((267386880 & i15) >>> 20) {
                            case 0:
                                long d2 = d(i15);
                                joVar.b(1);
                                mw2.a(obj, d2, joVar.f6898a.e());
                                c(a14, obj);
                                break;
                            case 1:
                                long d13 = d(i15);
                                joVar.b(5);
                                mw2.a(obj, d13, joVar.f6898a.i());
                                c(a14, obj);
                                break;
                            case 2:
                                long d14 = d(i15);
                                joVar.b(0);
                                mw2.f8408c.a(obj, d14, joVar.f6898a.k());
                                c(a14, obj);
                                break;
                            case 3:
                                long d15 = d(i15);
                                joVar.b(0);
                                mw2.f8408c.a(obj, d15, joVar.f6898a.t());
                                c(a14, obj);
                                break;
                            case 4:
                                long d16 = d(i15);
                                joVar.b(0);
                                mw2.a(joVar.f6898a.j(), d16, obj);
                                c(a14, obj);
                                break;
                            case 5:
                                long d17 = d(i15);
                                joVar.b(1);
                                mw2.f8408c.a(obj, d17, joVar.f6898a.h());
                                c(a14, obj);
                                break;
                            case 6:
                                long d18 = d(i15);
                                joVar.b(5);
                                mw2.a(joVar.f6898a.g(), d18, obj);
                                c(a14, obj);
                                break;
                            case 7:
                                long d19 = d(i15);
                                joVar.b(0);
                                mw2.a(obj, d19, joVar.f6898a.c());
                                c(a14, obj);
                                break;
                            case 8:
                                a(i15, joVar, obj);
                                c(a14, obj);
                                break;
                            case 9:
                                a.xe xeVar = (a.xe) b(a14, obj);
                                a.tb c13 = c(a14);
                                joVar.b(2);
                                joVar.b(xeVar, c13, jc0Var);
                                d(a14, obj, xeVar);
                                break;
                            case 10:
                                long d23 = d(i15);
                                joVar.b(2);
                                mw2.a(d23, obj, joVar.f6898a.d());
                                c(a14, obj);
                                break;
                            case 11:
                                long d24 = d(i15);
                                joVar.b(0);
                                mw2.a(joVar.f6898a.s(), d24, obj);
                                c(a14, obj);
                                break;
                            case 12:
                                joVar.b(0);
                                int f13 = joVar.f6898a.f();
                                a.r0 a15 = a(a14);
                                if (a15 != null && !a15.a(f13)) {
                                    r13 = td2.a(obj, a13, f13, yv2Var, tfVar);
                                    break;
                                }
                                mw2.a(f13, d(i15), obj);
                                c(a14, obj);
                                break;
                            case 13:
                                long d25 = d(i15);
                                joVar.b(5);
                                mw2.a(joVar.f6898a.l(), d25, obj);
                                c(a14, obj);
                                break;
                            case 14:
                                long d26 = d(i15);
                                joVar.b(1);
                                mw2.f8408c.a(obj, d26, joVar.f6898a.m());
                                c(a14, obj);
                                break;
                            case 15:
                                long d27 = d(i15);
                                joVar.b(0);
                                mw2.a(joVar.f6898a.n(), d27, obj);
                                c(a14, obj);
                                break;
                            case 16:
                                long d28 = d(i15);
                                joVar.b(0);
                                mw2.f8408c.a(obj, d28, joVar.f6898a.o());
                                c(a14, obj);
                                break;
                            case 17:
                                a.xe xeVar2 = (a.xe) b(a14, obj);
                                a.tb c14 = c(a14);
                                joVar.b(3);
                                joVar.a(xeVar2, c14, jc0Var);
                                d(a14, obj, xeVar2);
                                break;
                            case 18:
                                a.wf wfVar = this.f14170k;
                                long d29 = d(i15);
                                ((a.tg) wfVar).getClass();
                                joVar.c(a.tg.b(d29, obj));
                                break;
                            case 19:
                                a.wf wfVar2 = this.f14170k;
                                long d33 = d(i15);
                                ((a.tg) wfVar2).getClass();
                                joVar.g(a.tg.b(d33, obj));
                                break;
                            case 20:
                                a.wf wfVar3 = this.f14170k;
                                long d34 = d(i15);
                                ((a.tg) wfVar3).getClass();
                                joVar.i(a.tg.b(d34, obj));
                                break;
                            case 21:
                                a.wf wfVar4 = this.f14170k;
                                long d35 = d(i15);
                                ((a.tg) wfVar4).getClass();
                                joVar.o(a.tg.b(d35, obj));
                                break;
                            case 22:
                                a.wf wfVar5 = this.f14170k;
                                long d36 = d(i15);
                                ((a.tg) wfVar5).getClass();
                                joVar.h(a.tg.b(d36, obj));
                                break;
                            case 23:
                                a.wf wfVar6 = this.f14170k;
                                long d37 = d(i15);
                                ((a.tg) wfVar6).getClass();
                                joVar.f(a.tg.b(d37, obj));
                                break;
                            case 24:
                                a.wf wfVar7 = this.f14170k;
                                long d38 = d(i15);
                                ((a.tg) wfVar7).getClass();
                                joVar.e(a.tg.b(d38, obj));
                                break;
                            case 25:
                                a.wf wfVar8 = this.f14170k;
                                long d39 = d(i15);
                                ((a.tg) wfVar8).getClass();
                                joVar.a(a.tg.b(d39, obj));
                                break;
                            case 26:
                                b(i15, joVar, obj);
                                break;
                            case 27:
                                a(obj, i15, joVar, c(a14), jc0Var);
                                break;
                            case 28:
                                a.wf wfVar9 = this.f14170k;
                                long d43 = d(i15);
                                ((a.tg) wfVar9).getClass();
                                joVar.b(a.tg.b(d43, obj));
                                break;
                            case 29:
                                a.wf wfVar10 = this.f14170k;
                                long d44 = d(i15);
                                ((a.tg) wfVar10).getClass();
                                joVar.n(a.tg.b(d44, obj));
                                break;
                            case 30:
                                a.wf wfVar11 = this.f14170k;
                                long d45 = d(i15);
                                ((a.tg) wfVar11).getClass();
                                h4 b13 = a.tg.b(d45, obj);
                                joVar.d(b13);
                                r13 = td2.a(obj, a13, b13, a(a14), yv2Var, tfVar);
                                break;
                            case 31:
                                a.wf wfVar12 = this.f14170k;
                                long d46 = d(i15);
                                ((a.tg) wfVar12).getClass();
                                joVar.j(a.tg.b(d46, obj));
                                break;
                            case 32:
                                a.wf wfVar13 = this.f14170k;
                                long d47 = d(i15);
                                ((a.tg) wfVar13).getClass();
                                joVar.k(a.tg.b(d47, obj));
                                break;
                            case 33:
                                a.wf wfVar14 = this.f14170k;
                                long d48 = d(i15);
                                ((a.tg) wfVar14).getClass();
                                joVar.l(a.tg.b(d48, obj));
                                break;
                            case 34:
                                a.wf wfVar15 = this.f14170k;
                                long d49 = d(i15);
                                ((a.tg) wfVar15).getClass();
                                joVar.m(a.tg.b(d49, obj));
                                break;
                            case 35:
                                a.wf wfVar16 = this.f14170k;
                                long d53 = d(i15);
                                ((a.tg) wfVar16).getClass();
                                joVar.c(a.tg.b(d53, obj));
                                break;
                            case 36:
                                a.wf wfVar17 = this.f14170k;
                                long d54 = d(i15);
                                ((a.tg) wfVar17).getClass();
                                joVar.g(a.tg.b(d54, obj));
                                break;
                            case 37:
                                a.wf wfVar18 = this.f14170k;
                                long d55 = d(i15);
                                ((a.tg) wfVar18).getClass();
                                joVar.i(a.tg.b(d55, obj));
                                break;
                            case 38:
                                a.wf wfVar19 = this.f14170k;
                                long d56 = d(i15);
                                ((a.tg) wfVar19).getClass();
                                joVar.o(a.tg.b(d56, obj));
                                break;
                            case 39:
                                a.wf wfVar20 = this.f14170k;
                                long d57 = d(i15);
                                ((a.tg) wfVar20).getClass();
                                joVar.h(a.tg.b(d57, obj));
                                break;
                            case 40:
                                a.wf wfVar21 = this.f14170k;
                                long d58 = d(i15);
                                ((a.tg) wfVar21).getClass();
                                joVar.f(a.tg.b(d58, obj));
                                break;
                            case 41:
                                a.wf wfVar22 = this.f14170k;
                                long d59 = d(i15);
                                ((a.tg) wfVar22).getClass();
                                joVar.e(a.tg.b(d59, obj));
                                break;
                            case 42:
                                a.wf wfVar23 = this.f14170k;
                                long d63 = d(i15);
                                ((a.tg) wfVar23).getClass();
                                joVar.a(a.tg.b(d63, obj));
                                break;
                            case 43:
                                a.wf wfVar24 = this.f14170k;
                                long d64 = d(i15);
                                ((a.tg) wfVar24).getClass();
                                joVar.n(a.tg.b(d64, obj));
                                break;
                            case 44:
                                a.wf wfVar25 = this.f14170k;
                                long d65 = d(i15);
                                ((a.tg) wfVar25).getClass();
                                h4 b14 = a.tg.b(d65, obj);
                                joVar.d(b14);
                                r13 = td2.a(obj, a13, b14, a(a14), yv2Var, tfVar);
                                break;
                            case 45:
                                a.wf wfVar26 = this.f14170k;
                                long d66 = d(i15);
                                ((a.tg) wfVar26).getClass();
                                joVar.j(a.tg.b(d66, obj));
                                break;
                            case 46:
                                a.wf wfVar27 = this.f14170k;
                                long d67 = d(i15);
                                ((a.tg) wfVar27).getClass();
                                joVar.k(a.tg.b(d67, obj));
                                break;
                            case 47:
                                a.wf wfVar28 = this.f14170k;
                                long d68 = d(i15);
                                ((a.tg) wfVar28).getClass();
                                joVar.l(a.tg.b(d68, obj));
                                break;
                            case 48:
                                a.wf wfVar29 = this.f14170k;
                                long d69 = d(i15);
                                ((a.tg) wfVar29).getClass();
                                joVar.m(a.tg.b(d69, obj));
                                break;
                            case 49:
                                a(obj, d(i15), joVar, c(a14), jc0Var);
                                break;
                            case 50:
                                a(obj, a14, b(a14), jc0Var, joVar);
                                break;
                            case 51:
                                long d73 = d(i15);
                                joVar.b(1);
                                mw2.a(d73, obj, Double.valueOf(joVar.f6898a.e()));
                                c(obj, a13, a14);
                                break;
                            case 52:
                                long d74 = d(i15);
                                joVar.b(5);
                                mw2.a(d74, obj, Float.valueOf(joVar.f6898a.i()));
                                c(obj, a13, a14);
                                break;
                            case 53:
                                long d75 = d(i15);
                                joVar.b(0);
                                mw2.a(d75, obj, Long.valueOf(joVar.f6898a.k()));
                                c(obj, a13, a14);
                                break;
                            case 54:
                                long d76 = d(i15);
                                joVar.b(0);
                                mw2.a(d76, obj, Long.valueOf(joVar.f6898a.t()));
                                c(obj, a13, a14);
                                break;
                            case 55:
                                long d77 = d(i15);
                                joVar.b(0);
                                mw2.a(d77, obj, Integer.valueOf(joVar.f6898a.j()));
                                c(obj, a13, a14);
                                break;
                            case 56:
                                long d78 = d(i15);
                                joVar.b(1);
                                mw2.a(d78, obj, Long.valueOf(joVar.f6898a.h()));
                                c(obj, a13, a14);
                                break;
                            case 57:
                                long d79 = d(i15);
                                joVar.b(5);
                                mw2.a(d79, obj, Integer.valueOf(joVar.f6898a.g()));
                                c(obj, a13, a14);
                                break;
                            case 58:
                                long d83 = d(i15);
                                joVar.b(0);
                                mw2.a(d83, obj, Boolean.valueOf(joVar.f6898a.c()));
                                c(obj, a13, a14);
                                break;
                            case 59:
                                a(i15, joVar, obj);
                                c(obj, a13, a14);
                                break;
                            case 60:
                                a.xe xeVar3 = (a.xe) b(obj, a13, a14);
                                a.tb c15 = c(a14);
                                joVar.b(2);
                                joVar.b(xeVar3, c15, jc0Var);
                                a(obj, a13, a14, xeVar3);
                                break;
                            case 61:
                                long d84 = d(i15);
                                joVar.b(2);
                                mw2.a(d84, obj, joVar.f6898a.d());
                                c(obj, a13, a14);
                                break;
                            case 62:
                                long d85 = d(i15);
                                joVar.b(0);
                                mw2.a(d85, obj, Integer.valueOf(joVar.f6898a.s()));
                                c(obj, a13, a14);
                                break;
                            case 63:
                                joVar.b(0);
                                int f14 = joVar.f6898a.f();
                                a.r0 a16 = a(a14);
                                if (a16 != null && !a16.a(f14)) {
                                    r13 = td2.a(obj, a13, f14, yv2Var, tfVar);
                                    break;
                                }
                                mw2.a(d(i15), obj, Integer.valueOf(f14));
                                c(obj, a13, a14);
                                break;
                            case 64:
                                long d86 = d(i15);
                                joVar.b(5);
                                mw2.a(d86, obj, Integer.valueOf(joVar.f6898a.l()));
                                c(obj, a13, a14);
                                break;
                            case 65:
                                long d87 = d(i15);
                                joVar.b(1);
                                mw2.a(d87, obj, Long.valueOf(joVar.f6898a.m()));
                                c(obj, a13, a14);
                                break;
                            case 66:
                                long d88 = d(i15);
                                joVar.b(0);
                                mw2.a(d88, obj, Integer.valueOf(joVar.f6898a.n()));
                                c(obj, a13, a14);
                                break;
                            case 67:
                                long d89 = d(i15);
                                joVar.b(0);
                                mw2.a(d89, obj, Long.valueOf(joVar.f6898a.o()));
                                c(obj, a13, a14);
                                break;
                            case 68:
                                a.xe xeVar4 = (a.xe) b(obj, a13, a14);
                                a.tb c16 = c(a14);
                                joVar.b(3);
                                joVar.a(xeVar4, c16, jc0Var);
                                a(obj, a13, a14, xeVar4);
                                break;
                            default:
                                if (yv2Var == null) {
                                    try {
                                        yv2Var = tfVar.a(obj);
                                    } catch (d21 unused) {
                                        tfVar.getClass();
                                        if (yv2Var == null) {
                                            yv2Var = tfVar.a(obj);
                                        }
                                        if (!a.tf.c(0, joVar, yv2Var)) {
                                            Object obj4 = yv2Var;
                                            for (int i16 = this.f14167h; i16 < this.f14168i; i16++) {
                                                obj4 = a(obj, this.f14166g[i16], obj4, tfVar, obj);
                                            }
                                            if (obj4 != null) {
                                                tfVar.b(obj, obj4);
                                                return;
                                            }
                                            return;
                                        }
                                        break;
                                    }
                                }
                                tfVar.getClass();
                                if (!a.tf.c(0, joVar, yv2Var)) {
                                    Object obj5 = yv2Var;
                                    for (int i17 = this.f14167h; i17 < this.f14168i; i17++) {
                                        obj5 = a(obj, this.f14166g[i17], obj5, tfVar, obj);
                                    }
                                    if (obj5 != null) {
                                        tfVar.b(obj, obj5);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    }
                } catch (Throwable th3) {
                    Object obj6 = yv2Var;
                    for (int i18 = this.f14167h; i18 < this.f14168i; i18++) {
                        obj6 = a(obj, this.f14166g[i18], obj6, tfVar, obj);
                    }
                    if (obj6 != null) {
                        tfVar.b(obj, obj6);
                    }
                    throw th3;
                }
            }
        }
    }

    public final void c(int i13, Object obj, Object obj2) {
        int i14 = this.f14160a[i13];
        if (a(obj2, i14, i13)) {
            long j13 = this.f14160a[i13 + 1] & 1048575;
            Unsafe unsafe = f14159o;
            Object object = unsafe.getObject(obj2, j13);
            if (object != null) {
                a.tb c13 = c(i13);
                if (!a(obj, i14, i13)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j13, object);
                    } else {
                        sj0 a13 = c13.a();
                        c13.a(a13, object);
                        unsafe.putObject(obj, j13, a13);
                    }
                    c(obj, i14, i13);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j13);
                if (!g(object2)) {
                    sj0 a14 = c13.a();
                    c13.a(a14, object2);
                    unsafe.putObject(obj, j13, a14);
                    object2 = a14;
                }
                c13.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f14160a[i13] + " is present but null: " + String.valueOf(obj2));
        }
    }

    public final void c(int i13, Object obj) {
        int i14 = this.f14160a[i13 + 2];
        long j13 = 1048575 & i14;
        if (j13 == 1048575) {
            return;
        }
        lw2 lw2Var = mw2.f8408c;
        lw2Var.a((1 << (i14 >>> 20)) | lw2Var.e(obj, j13), j13, obj);
    }

    public final void c(Object obj, int i13, int i14) {
        mw2.f8408c.a(i13, this.f14160a[i14 + 2] & 1048575, obj);
    }

    public final Object b(int i13) {
        return this.f14161b[(i13 / 3) * 2];
    }

    @Override // a.tb
    public final int b(Object obj) {
        int i13;
        int i14;
        int i15;
        int b13;
        int d2;
        int h10;
        int i16;
        Unsafe unsafe = f14159o;
        int i17 = 1048575;
        int i18 = 1048575;
        int i19 = 0;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int[] iArr = this.f14160a;
            if (i23 < iArr.length) {
                int i25 = iArr[i23 + 1];
                int i26 = (267386880 & i25) >>> 20;
                int i27 = iArr[i23];
                int i28 = iArr[i23 + 2];
                int i29 = i28 & i17;
                if (i26 <= 17) {
                    if (i29 != i18) {
                        i19 = i29 == i17 ? 0 : unsafe.getInt(obj, i29);
                        i18 = i29;
                    }
                    i13 = i18;
                    i14 = i19;
                    i15 = 1 << (i28 >>> 20);
                } else {
                    i13 = i18;
                    i14 = i19;
                    i15 = 0;
                }
                long j13 = i25 & i17;
                if (i26 >= wc0.f12979b.a()) {
                    wc0.f12980c.a();
                }
                switch (i26) {
                    case 0:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.b(i27);
                            i24 += b13;
                            break;
                        }
                    case 1:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.e(i27);
                            i24 += b13;
                            break;
                        }
                    case 2:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.a(i27, unsafe.getLong(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 3:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.c(i27, unsafe.getLong(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 4:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.b(i27, unsafe.getInt(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 5:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.d(i27);
                            i24 += b13;
                            break;
                        }
                    case 6:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.c(i27);
                            i24 += b13;
                            break;
                        }
                    case 7:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.a(i27);
                            i24 += b13;
                            break;
                        }
                    case 8:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j13);
                            if (object instanceof il) {
                                b13 = oo.a(i27, (il) object);
                            } else {
                                b13 = oo.a((String) object, i27);
                            }
                            i24 += b13;
                            break;
                        }
                    case 9:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = td2.a(i27, c(i23), unsafe.getObject(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 10:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.a(i27, (il) unsafe.getObject(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 11:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.d(i27, unsafe.getInt(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 12:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.a(i27, unsafe.getInt(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 13:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.f(i27);
                            i24 += b13;
                            break;
                        }
                    case 14:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.g(i27);
                            i24 += b13;
                            break;
                        }
                    case 15:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.c(i27, unsafe.getInt(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 16:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.b(i27, unsafe.getLong(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 17:
                        if (!a(obj, i23, i13, i14, i15)) {
                            break;
                        } else {
                            b13 = oo.a(i27, (a.xe) unsafe.getObject(obj, j13), c(i23));
                            i24 += b13;
                            break;
                        }
                    case 18:
                        b13 = td2.e(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 19:
                        b13 = td2.d(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 20:
                        b13 = td2.g(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 21:
                        b13 = td2.l(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 22:
                        b13 = td2.f(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 23:
                        b13 = td2.e(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 24:
                        b13 = td2.d(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 25:
                        b13 = td2.a(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 26:
                        b13 = td2.j(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 27:
                        b13 = td2.b(i27, (List) unsafe.getObject(obj, j13), c(i23));
                        i24 += b13;
                        break;
                    case 28:
                        b13 = td2.b(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 29:
                        b13 = td2.k(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 30:
                        b13 = td2.c(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 31:
                        b13 = td2.d(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 32:
                        b13 = td2.e(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 33:
                        b13 = td2.h(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 34:
                        b13 = td2.i(i27, (List) unsafe.getObject(obj, j13));
                        i24 += b13;
                        break;
                    case 35:
                        d2 = td2.d((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 36:
                        d2 = td2.c((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 37:
                        d2 = td2.f((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 38:
                        d2 = td2.j((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 39:
                        d2 = td2.e((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 40:
                        d2 = td2.d((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 41:
                        d2 = td2.c((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 42:
                        d2 = td2.a((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 43:
                        d2 = td2.i((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 44:
                        d2 = td2.b((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 45:
                        d2 = td2.c((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 46:
                        d2 = td2.d((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 47:
                        d2 = td2.g((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 48:
                        d2 = td2.h((List) unsafe.getObject(obj, j13));
                        if (d2 <= 0) {
                            break;
                        } else {
                            h10 = oo.h(i27);
                            i16 = oo.i(d2);
                            b13 = d2 + i16 + h10;
                            i24 += b13;
                            break;
                        }
                    case 49:
                        b13 = td2.a(i27, (List) unsafe.getObject(obj, j13), c(i23));
                        i24 += b13;
                        break;
                    case 50:
                        a.mf mfVar = this.f14172m;
                        Object object2 = unsafe.getObject(obj, j13);
                        Object b14 = b(i23);
                        ((a.xf) mfVar).getClass();
                        b13 = a.xf.a(i27, object2, b14);
                        i24 += b13;
                        break;
                    case 51:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.b(i27);
                            i24 += b13;
                            break;
                        }
                    case 52:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.e(i27);
                            i24 += b13;
                            break;
                        }
                    case 53:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.a(i27, b(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 54:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.c(i27, b(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 55:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.b(i27, a(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 56:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.d(i27);
                            i24 += b13;
                            break;
                        }
                    case 57:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.c(i27);
                            i24 += b13;
                            break;
                        }
                    case 58:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.a(i27);
                            i24 += b13;
                            break;
                        }
                    case 59:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j13);
                            if (object3 instanceof il) {
                                b13 = oo.a(i27, (il) object3);
                            } else {
                                b13 = oo.a((String) object3, i27);
                            }
                            i24 += b13;
                            break;
                        }
                    case 60:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = td2.a(i27, c(i23), unsafe.getObject(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 61:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.a(i27, (il) unsafe.getObject(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 62:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.d(i27, a(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 63:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.a(i27, a(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 64:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.f(i27);
                            i24 += b13;
                            break;
                        }
                    case 65:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.g(i27);
                            i24 += b13;
                            break;
                        }
                    case 66:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.c(i27, a(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 67:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.b(i27, b(obj, j13));
                            i24 += b13;
                            break;
                        }
                    case 68:
                        if (!a(obj, i27, i23)) {
                            break;
                        } else {
                            b13 = oo.a(i27, (a.xe) unsafe.getObject(obj, j13), c(i23));
                            i24 += b13;
                            break;
                        }
                }
                i23 += 3;
                i18 = i13;
                i19 = i14;
                i17 = 1048575;
            } else {
                ((ih) this.f14171l).getClass();
                return ((sj0) obj).f11118b.a() + i24;
            }
        }
    }

    public final void d(int i13, Object obj, Object obj2) {
        f14159o.putObject(obj, this.f14160a[i13 + 1] & 1048575, obj2);
        c(i13, obj);
    }

    public final void b(int i13, Object obj, Object obj2) {
        if (a(i13, obj2)) {
            long j13 = this.f14160a[i13 + 1] & 1048575;
            Unsafe unsafe = f14159o;
            Object object = unsafe.getObject(obj2, j13);
            if (object != null) {
                a.tb c13 = c(i13);
                if (!a(i13, obj)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j13, object);
                    } else {
                        sj0 a13 = c13.a();
                        c13.a(a13, object);
                        unsafe.putObject(obj, j13, a13);
                    }
                    c(i13, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j13);
                if (!g(object2)) {
                    sj0 a14 = c13.a();
                    c13.a(a14, object2);
                    unsafe.putObject(obj, j13, a14);
                    object2 = a14;
                }
                c13.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f14160a[i13] + " is present but null: " + String.valueOf(obj2));
        }
    }

    public final Object b(int i13, Object obj) {
        a.tb c13 = c(i13);
        long j13 = this.f14160a[i13 + 1] & 1048575;
        if (!a(i13, obj)) {
            return c13.a();
        }
        Object object = f14159o.getObject(obj, j13);
        if (g(object)) {
            return object;
        }
        sj0 a13 = c13.a();
        if (object != null) {
            c13.a(a13, object);
        }
        return a13;
    }

    public final Object b(Object obj, int i13, int i14) {
        a.tb c13 = c(i14);
        if (!a(obj, i13, i14)) {
            return c13.a();
        }
        Object object = f14159o.getObject(obj, this.f14160a[i14 + 1] & 1048575);
        if (g(object)) {
            return object;
        }
        sj0 a13 = c13.a();
        if (object != null) {
            c13.a(a13, object);
        }
        return a13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj, po poVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int length = this.f14160a.length;
        Unsafe unsafe = f14159o;
        int i17 = 1048575;
        boolean z13 = 0;
        int i18 = 1048575;
        int i19 = 0;
        int i23 = 0;
        while (i23 < length) {
            int[] iArr = this.f14160a;
            int i24 = iArr[i23 + 1];
            int i25 = iArr[i23];
            int i26 = (267386880 & i24) >>> 20;
            if (i26 <= 17) {
                int i27 = iArr[i23 + 2];
                int i28 = i27 & i17;
                if (i28 != i18) {
                    i19 = i28 == i17 ? z13 : unsafe.getInt(obj, i28);
                    i18 = i28;
                }
                i13 = i18;
                i14 = i19;
                i15 = 1 << (i27 >>> 20);
            } else {
                i13 = i18;
                i14 = i19;
                i15 = z13;
            }
            long j13 = i24 & i17;
            switch (i26) {
                case 0:
                    i16 = i23;
                    if (!a(obj, i16, i13, i14, i15)) {
                        break;
                    } else {
                        poVar.a(i25, mw2.f8408c.c(obj, j13));
                        continue;
                    }
                case 1:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.a(i25, mw2.f8408c.d(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.b(i25, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.e(i25, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.c(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.a(i25, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.b(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.a(i25, mw2.f8408c.a(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        Object object = unsafe.getObject(obj, j13);
                        if (object instanceof String) {
                            poVar.f9758a.b((String) object, i25);
                            break;
                        } else {
                            poVar.f9758a.b(i25, (il) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.b(i25, c(i16), unsafe.getObject(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.a(i25, (il) unsafe.getObject(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.f(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.a(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.d(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.c(i25, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.e(i25, unsafe.getInt(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i16 = i23;
                    if (a(obj, i16, i13, i14, i15)) {
                        poVar.d(i25, unsafe.getLong(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i16 = i23;
                    if (a(obj, i23, i13, i14, i15)) {
                        poVar.a(i25, c(i16), unsafe.getObject(obj, j13));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    td2.b(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 19:
                    td2.f(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 20:
                    td2.h(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 21:
                    td2.n(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 22:
                    td2.g(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 23:
                    td2.e(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 24:
                    td2.d(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 25:
                    td2.a(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 26:
                    td2.b(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar);
                    break;
                case 27:
                    td2.b(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, c(i23));
                    break;
                case 28:
                    td2.a(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar);
                    break;
                case 29:
                    td2.m(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 30:
                    td2.c(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 31:
                    td2.i(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 32:
                    td2.j(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 33:
                    td2.k(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 34:
                    td2.l(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, z13);
                    break;
                case 35:
                    td2.b(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 36:
                    td2.f(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 37:
                    td2.h(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 38:
                    td2.n(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 39:
                    td2.g(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 40:
                    td2.e(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 41:
                    td2.d(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 42:
                    td2.a(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 43:
                    td2.m(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 44:
                    td2.c(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 45:
                    td2.i(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 46:
                    td2.j(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 47:
                    td2.k(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 48:
                    td2.l(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, true);
                    break;
                case 49:
                    td2.a(this.f14160a[i23], (List) unsafe.getObject(obj, j13), poVar, c(i23));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j13);
                    if (object2 != null) {
                        a.mf mfVar = this.f14172m;
                        Object b13 = b(i23);
                        ((a.xf) mfVar).getClass();
                        s81 s81Var = ((t81) b13).f11451a;
                        ((a.xf) this.f14172m).getClass();
                        poVar.f9758a.getClass();
                        for (Map.Entry entry : ((w81) object2).entrySet()) {
                            poVar.f9758a.g(i25, 2);
                            poVar.f9758a.m(t81.a(s81Var, entry.getKey(), entry.getValue()));
                            oo ooVar = poVar.f9758a;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            vc0.a(ooVar, s81Var.f11001a, 1, key);
                            vc0.a(ooVar, s81Var.f11003c, 2, value);
                        }
                        break;
                    }
                    break;
                case 51:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, ((Double) mw2.f8408c.g(obj, j13)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, ((Float) mw2.f8408c.g(obj, j13)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (a(obj, i25, i23)) {
                        poVar.b(i25, b(obj, j13));
                        break;
                    }
                    break;
                case 54:
                    if (a(obj, i25, i23)) {
                        poVar.e(i25, b(obj, j13));
                        break;
                    }
                    break;
                case 55:
                    if (a(obj, i25, i23)) {
                        poVar.c(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 56:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, b(obj, j13));
                        break;
                    }
                    break;
                case 57:
                    if (a(obj, i25, i23)) {
                        poVar.b(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 58:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, ((Boolean) mw2.f8408c.g(obj, j13)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (a(obj, i25, i23)) {
                        Object object3 = unsafe.getObject(obj, j13);
                        if (object3 instanceof String) {
                            poVar.f9758a.b((String) object3, i25);
                            break;
                        } else {
                            poVar.f9758a.b(i25, (il) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (a(obj, i25, i23)) {
                        poVar.b(i25, c(i23), unsafe.getObject(obj, j13));
                        break;
                    }
                    break;
                case 61:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, (il) unsafe.getObject(obj, j13));
                        break;
                    }
                    break;
                case 62:
                    if (a(obj, i25, i23)) {
                        poVar.f(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 63:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 64:
                    if (a(obj, i25, i23)) {
                        poVar.d(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 65:
                    if (a(obj, i25, i23)) {
                        poVar.c(i25, b(obj, j13));
                        break;
                    }
                    break;
                case 66:
                    if (a(obj, i25, i23)) {
                        poVar.e(i25, a(obj, j13));
                        break;
                    }
                    break;
                case 67:
                    if (a(obj, i25, i23)) {
                        poVar.d(i25, b(obj, j13));
                        break;
                    }
                    break;
                case 68:
                    if (a(obj, i25, i23)) {
                        poVar.a(i25, c(i23), unsafe.getObject(obj, j13));
                        break;
                    }
                    break;
            }
            i16 = i23;
            i23 = i16 + 3;
            i18 = i13;
            i19 = i14;
            i17 = 1048575;
            z13 = 0;
        }
        ((ih) this.f14171l).getClass();
        ((sj0) obj).f11118b.a(poVar);
    }

    public final void a(Object obj, int i13, a.q3 q3Var, a.tb tbVar, jc0 jc0Var) {
        int r13;
        ((a.tg) this.f14170k).getClass();
        h4 b13 = a.tg.b(i13 & 1048575, obj);
        jo joVar = (jo) q3Var;
        int i14 = joVar.f6899b;
        if ((i14 & 7) == 2) {
            do {
                sj0 a13 = tbVar.a();
                joVar.b(a13, tbVar, jc0Var);
                tbVar.c(a13);
                b13.add(a13);
                if (joVar.f6898a.b() || joVar.f6901d != 0) {
                    return;
                } else {
                    r13 = joVar.f6898a.r();
                }
            } while (r13 == i14);
            joVar.f6901d = r13;
            return;
        }
        int i15 = e21.f4580b;
        throw new d21();
    }

    public final boolean a(int i13, Object obj, Object obj2) {
        return a(i13, obj) == a(i13, obj2);
    }

    public static int a(byte[] bArr, int i13, int i14, v03 v03Var, Class cls, pg pgVar) {
        switch (v03Var.ordinal()) {
            case 0:
                pgVar.f9672c = Double.valueOf(Double.longBitsToDouble(m2.m0(i13, bArr)));
                return i13 + 8;
            case 1:
                pgVar.f9672c = Float.valueOf(Float.intBitsToFloat(m2.d0(i13, bArr)));
                return i13 + 4;
            case 2:
            case 3:
                int E0 = m2.E0(bArr, i13, pgVar);
                pgVar.f9672c = Long.valueOf(pgVar.f9671b);
                return E0;
            case 4:
            case 12:
            case 13:
                int z03 = m2.z0(bArr, i13, pgVar);
                pgVar.f9672c = Integer.valueOf(pgVar.f9670a);
                return z03;
            case 5:
            case 15:
                pgVar.f9672c = Long.valueOf(m2.m0(i13, bArr));
                return i13 + 8;
            case 6:
            case 14:
                pgVar.f9672c = Integer.valueOf(m2.d0(i13, bArr));
                return i13 + 4;
            case 7:
                int E02 = m2.E0(bArr, i13, pgVar);
                pgVar.f9672c = Boolean.valueOf(pgVar.f9671b != 0);
                return E02;
            case 8:
                return m2.l0(bArr, i13, pgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                a.tb a13 = k22.f7066c.a(cls);
                sj0 a14 = a13.a();
                int Q = m2.Q(a14, a13, bArr, i13, i14, pgVar);
                a13.c(a14);
                pgVar.f9672c = a14;
                return Q;
            case 11:
                return m2.S(bArr, i13, pgVar);
            case 16:
                int z04 = m2.z0(bArr, i13, pgVar);
                pgVar.f9672c = Integer.valueOf(io.b(pgVar.f9670a));
                return z04;
            case 17:
                int E03 = m2.E0(bArr, i13, pgVar);
                pgVar.f9672c = Long.valueOf(io.a(pgVar.f9671b));
                return E03;
        }
    }

    public final Object a(Object obj, int i13, Object obj2, a.tf tfVar, Object obj3) {
        a.r0 a13;
        int i14 = this.f14160a[i13];
        Object g13 = mw2.f8408c.g(obj, r0[i13 + 1] & 1048575);
        if (g13 == null || (a13 = a(i13)) == null) {
            return obj2;
        }
        ((a.xf) this.f14172m).getClass();
        a.mf mfVar = this.f14172m;
        Object b13 = b(i13);
        ((a.xf) mfVar).getClass();
        s81 s81Var = ((t81) b13).f11451a;
        Iterator it = ((w81) g13).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!a13.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = tfVar.a(obj3);
                }
                int a14 = t81.a(s81Var, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a14];
                lo loVar = new lo(bArr, a14);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    vc0.a(loVar, s81Var.f11001a, 1, key);
                    vc0.a(loVar, s81Var.f11003c, 2, value);
                    if (loVar.a() == 0) {
                        gl glVar = new gl(bArr);
                        ((ih) tfVar).getClass();
                        ((yv2) obj2).a((i14 << 3) | 2, glVar);
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e13) {
                    throw new RuntimeException(e13);
                }
            }
        }
        return obj2;
    }

    public final a.r0 a(int i13) {
        return (a.r0) this.f14161b[a.cb.c(i13, 3, 2, 1)];
    }

    public final boolean a(int i13, Object obj) {
        int[] iArr = this.f14160a;
        int i14 = iArr[i13 + 2];
        long j13 = i14 & 1048575;
        if (j13 != 1048575) {
            return ((1 << (i14 >>> 20)) & mw2.f8408c.e(obj, j13)) != 0;
        }
        int i15 = iArr[i13 + 1];
        long j14 = i15 & 1048575;
        switch ((i15 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(mw2.f8408c.c(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(mw2.f8408c.d(obj, j14)) != 0;
            case 2:
                return mw2.f8408c.f(obj, j14) != 0;
            case 3:
                return mw2.f8408c.f(obj, j14) != 0;
            case 4:
                return mw2.f8408c.e(obj, j14) != 0;
            case 5:
                return mw2.f8408c.f(obj, j14) != 0;
            case 6:
                return mw2.f8408c.e(obj, j14) != 0;
            case 7:
                return mw2.f8408c.a(obj, j14);
            case 8:
                Object g13 = mw2.f8408c.g(obj, j14);
                if (g13 instanceof String) {
                    return !((String) g13).isEmpty();
                }
                if (g13 instanceof il) {
                    return !il.f6431b.equals(g13);
                }
                throw new IllegalArgumentException();
            case 9:
                return mw2.f8408c.g(obj, j14) != null;
            case 10:
                return !il.f6431b.equals(mw2.f8408c.g(obj, j14));
            case 11:
                return mw2.f8408c.e(obj, j14) != 0;
            case 12:
                return mw2.f8408c.e(obj, j14) != 0;
            case 13:
                return mw2.f8408c.e(obj, j14) != 0;
            case 14:
                return mw2.f8408c.f(obj, j14) != 0;
            case 15:
                return mw2.f8408c.e(obj, j14) != 0;
            case 16:
                return mw2.f8408c.f(obj, j14) != 0;
            case 17:
                return mw2.f8408c.g(obj, j14) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i13, int i14, int i15, int i16) {
        if (i14 == 1048575) {
            return a(i13, obj);
        }
        return (i15 & i16) != 0;
    }

    @Override // a.tb
    public final boolean a(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f14167h) {
            int i18 = this.f14166g[i17];
            int[] iArr = this.f14160a;
            int i19 = iArr[i18];
            int i23 = iArr[i18 + 1];
            int i24 = iArr[i18 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i15) {
                if (i25 != 1048575) {
                    i16 = f14159o.getInt(obj, i25);
                }
                i14 = i16;
                i13 = i25;
            } else {
                i13 = i15;
                i14 = i16;
            }
            if ((268435456 & i23) != 0 && !a(obj, i18, i13, i14, i26)) {
                return false;
            }
            int i27 = (267386880 & i23) >>> 20;
            if (i27 != 9 && i27 != 17) {
                if (i27 != 27) {
                    if (i27 == 60 || i27 == 68) {
                        if (a(obj, i19, i18)) {
                            if (!c(i18).a(mw2.f8408c.g(obj, i23 & 1048575))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (i27 != 49) {
                        if (i27 != 50) {
                            continue;
                        } else {
                            a.mf mfVar = this.f14172m;
                            Object g13 = mw2.f8408c.g(obj, i23 & 1048575);
                            ((a.xf) mfVar).getClass();
                            w81 w81Var = (w81) g13;
                            if (w81Var.isEmpty()) {
                                continue;
                            } else {
                                Object b13 = b(i18);
                                ((a.xf) this.f14172m).getClass();
                                if (((t81) b13).f11451a.f11003c.f12286a != w03.MESSAGE) {
                                    continue;
                                } else {
                                    a.tb tbVar = null;
                                    for (Object obj2 : w81Var.values()) {
                                        if (tbVar == null) {
                                            tbVar = k22.f7066c.a(obj2.getClass());
                                        }
                                        if (!tbVar.a(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) mw2.f8408c.g(obj, i23 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    a.tb c13 = c(i18);
                    for (int i28 = 0; i28 < list.size(); i28++) {
                        if (!c13.a(list.get(i28))) {
                            return false;
                        }
                    }
                }
            } else if (a(obj, i18, i13, i14, i26)) {
                if (!c(i18).a(mw2.f8408c.g(obj, i23 & 1048575))) {
                    return false;
                }
            } else {
                continue;
            }
            i17++;
            i15 = i13;
            i16 = i14;
        }
        return true;
    }

    public final boolean a(Object obj, int i13, int i14) {
        return mw2.f8408c.e(obj, (long) (this.f14160a[i14 + 2] & 1048575)) == i13;
    }

    @Override // a.tb
    public final void a(Object obj, a.q3 q3Var, jc0 jc0Var) {
        jc0Var.getClass();
        e(obj);
        a(this.f14171l, obj, q3Var, jc0Var);
    }

    @Override // a.tb
    public final void a(Object obj, Object obj2) {
        e(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f14160a;
            if (i13 < iArr.length) {
                int i14 = iArr[i13 + 1];
                long j13 = 1048575 & i14;
                int i15 = iArr[i13];
                switch ((i14 & 267386880) >>> 20) {
                    case 0:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var = mw2.f8408c;
                            lw2Var.a(obj, j13, lw2Var.c(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 1:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var2 = mw2.f8408c;
                            lw2Var2.a(obj, j13, lw2Var2.d(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 2:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var3 = mw2.f8408c;
                            lw2Var3.a(obj, j13, lw2Var3.f(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 3:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var4 = mw2.f8408c;
                            lw2Var4.a(obj, j13, lw2Var4.f(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 4:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var5 = mw2.f8408c;
                            lw2Var5.a(lw2Var5.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 5:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var6 = mw2.f8408c;
                            lw2Var6.a(obj, j13, lw2Var6.f(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 6:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var7 = mw2.f8408c;
                            lw2Var7.a(lw2Var7.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 7:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var8 = mw2.f8408c;
                            lw2Var8.a(obj, j13, lw2Var8.a(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 8:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var9 = mw2.f8408c;
                            lw2Var9.a(j13, obj, lw2Var9.g(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 9:
                        b(i13, obj, obj2);
                        break;
                    case 10:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var10 = mw2.f8408c;
                            lw2Var10.a(j13, obj, lw2Var10.g(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 11:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var11 = mw2.f8408c;
                            lw2Var11.a(lw2Var11.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 12:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var12 = mw2.f8408c;
                            lw2Var12.a(lw2Var12.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 13:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var13 = mw2.f8408c;
                            lw2Var13.a(lw2Var13.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 14:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var14 = mw2.f8408c;
                            lw2Var14.a(obj, j13, lw2Var14.f(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 15:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var15 = mw2.f8408c;
                            lw2Var15.a(lw2Var15.e(obj2, j13), j13, obj);
                            c(i13, obj);
                            break;
                        }
                    case 16:
                        if (!a(i13, obj2)) {
                            break;
                        } else {
                            lw2 lw2Var16 = mw2.f8408c;
                            lw2Var16.a(obj, j13, lw2Var16.f(obj2, j13));
                            c(i13, obj);
                            break;
                        }
                    case 17:
                        b(i13, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        ((a.tg) this.f14170k).getClass();
                        lw2 lw2Var17 = mw2.f8408c;
                        h4 h4Var = (h4) lw2Var17.g(obj, j13);
                        h4 h4Var2 = (h4) lw2Var17.g(obj2, j13);
                        int size = h4Var.size();
                        int size2 = h4Var2.size();
                        if (size > 0 && size2 > 0) {
                            if (!((j) h4Var).f6594a) {
                                h4Var = h4Var.a(size2 + size);
                            }
                            h4Var.addAll(h4Var2);
                        }
                        if (size > 0) {
                            h4Var2 = h4Var;
                        }
                        lw2Var17.a(j13, obj, h4Var2);
                        break;
                    case 50:
                        a.mf mfVar = this.f14172m;
                        Class cls = td2.f11509a;
                        lw2 lw2Var18 = mw2.f8408c;
                        Object g13 = lw2Var18.g(obj, j13);
                        Object g14 = lw2Var18.g(obj2, j13);
                        ((a.xf) mfVar).getClass();
                        lw2Var18.a(j13, obj, a.xf.d(g13, g14));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(obj2, i15, i13)) {
                            break;
                        } else {
                            lw2 lw2Var19 = mw2.f8408c;
                            lw2Var19.a(j13, obj, lw2Var19.g(obj2, j13));
                            c(obj, i15, i13);
                            break;
                        }
                    case 60:
                        c(i13, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, i15, i13)) {
                            break;
                        } else {
                            lw2 lw2Var20 = mw2.f8408c;
                            lw2Var20.a(j13, obj, lw2Var20.g(obj2, j13));
                            c(obj, i15, i13);
                            break;
                        }
                    case 68:
                        c(i13, obj, obj2);
                        break;
                }
                i13 += 3;
            } else {
                td2.a(this.f14171l, obj, obj2);
                return;
            }
        }
    }

    public static long b(Object obj, long j13) {
        return ((Long) mw2.f8408c.g(obj, j13)).longValue();
    }

    @Override // a.tb
    public final void a(Object obj, byte[] bArr, int i13, int i14, pg pgVar) {
        a(obj, bArr, i13, i14, 0, pgVar);
    }

    public final void a(Object obj, int i13, Object obj2, jc0 jc0Var, a.q3 q3Var) {
        long j13 = this.f14160a[i13 + 1] & 1048575;
        lw2 lw2Var = mw2.f8408c;
        Object g13 = lw2Var.g(obj, j13);
        if (g13 == null) {
            ((a.xf) this.f14172m).getClass();
            g13 = w81.f12896b.b();
            lw2Var.a(j13, obj, g13);
        } else {
            ((a.xf) this.f14172m).getClass();
            if (a.xf.f(g13)) {
                ((a.xf) this.f14172m).getClass();
                w81 b13 = w81.f12896b.b();
                ((a.xf) this.f14172m).getClass();
                a.xf.d(b13, g13);
                lw2Var.a(j13, obj, b13);
                g13 = b13;
            }
        }
        ((a.xf) this.f14172m).getClass();
        w81 w81Var = (w81) g13;
        ((a.xf) this.f14172m).getClass();
        s81 s81Var = ((t81) obj2).f11451a;
        jo joVar = (jo) q3Var;
        joVar.b(2);
        int d2 = joVar.f6898a.d(joVar.f6898a.s());
        Object obj3 = s81Var.f11002b;
        Object obj4 = s81Var.f11004d;
        while (true) {
            try {
                int a13 = joVar.a();
                if (a13 == Integer.MAX_VALUE || joVar.f6898a.b()) {
                    break;
                }
                if (a13 == 1) {
                    obj3 = joVar.a(s81Var.f11001a, (Class) null, (jc0) null);
                } else if (a13 != 2) {
                    try {
                        if (!joVar.b()) {
                            throw new e21("Unable to parse map entry.");
                        }
                    } catch (d21 e13) {
                        if (!joVar.b()) {
                            throw new e21(e13);
                        }
                    }
                } else {
                    obj4 = joVar.a(s81Var.f11003c, s81Var.f11004d.getClass(), jc0Var);
                }
            } catch (Throwable th3) {
                joVar.f6898a.c(d2);
                throw th3;
            }
        }
        w81Var.put(obj3, obj4);
        joVar.f6898a.c(d2);
    }

    @Override // a.tb
    public final sj0 a() {
        a.ed edVar = this.f14169j;
        a.xe xeVar = this.f14164e;
        ((a.wd) edVar).getClass();
        return (sj0) ((sj0) xeVar).a(4, (sj0) null);
    }

    public static ya1 a(f62 f62Var, a.ed edVar, a.wf wfVar, a.tf tfVar, a.x6 x6Var, a.mf mfVar) {
        int i13;
        int charAt;
        int charAt2;
        int charAt3;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        char charAt4;
        int i23;
        char charAt5;
        int i24;
        char charAt6;
        int i25;
        char charAt7;
        int i26;
        char charAt8;
        int i27;
        char charAt9;
        int i28;
        char charAt10;
        int i29;
        char charAt11;
        int i33;
        int i34;
        int i35;
        int i36;
        int[] iArr2;
        int i37;
        int i38;
        int i39;
        int i43;
        int i44;
        Field a13;
        char charAt12;
        int i45;
        int i46;
        Field a14;
        Field a15;
        int i47;
        char charAt13;
        int i48;
        char charAt14;
        int i49;
        char charAt15;
        int i53;
        char charAt16;
        String c13 = f62Var.c();
        int length = c13.length();
        int i54 = 0;
        char c14 = 55296;
        if (c13.charAt(0) >= 55296) {
            int i55 = 1;
            while (true) {
                i13 = i55 + 1;
                if (c13.charAt(i55) < 55296) {
                    break;
                }
                i55 = i13;
            }
        } else {
            i13 = 1;
        }
        int i56 = i13 + 1;
        int charAt17 = c13.charAt(i13);
        if (charAt17 >= 55296) {
            int i57 = charAt17 & 8191;
            int i58 = 13;
            while (true) {
                i53 = i56 + 1;
                charAt16 = c13.charAt(i56);
                if (charAt16 < 55296) {
                    break;
                }
                i57 |= (charAt16 & 8191) << i58;
                i58 += 13;
                i56 = i53;
            }
            charAt17 = i57 | (charAt16 << i58);
            i56 = i53;
        }
        if (charAt17 == 0) {
            charAt2 = 0;
            charAt3 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i14 = i56;
            iArr = f14158n;
            charAt = 0;
        } else {
            int i59 = i56 + 1;
            charAt = c13.charAt(i56);
            if (charAt >= 55296) {
                int i63 = charAt & 8191;
                int i64 = 13;
                while (true) {
                    i29 = i59 + 1;
                    charAt11 = c13.charAt(i59);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i63 |= (charAt11 & 8191) << i64;
                    i64 += 13;
                    i59 = i29;
                }
                charAt = i63 | (charAt11 << i64);
                i59 = i29;
            }
            int i65 = i59 + 1;
            int charAt18 = c13.charAt(i59);
            if (charAt18 >= 55296) {
                int i66 = charAt18 & 8191;
                int i67 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt10 = c13.charAt(i65);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i66 |= (charAt10 & 8191) << i67;
                    i67 += 13;
                    i65 = i28;
                }
                charAt18 = i66 | (charAt10 << i67);
                i65 = i28;
            }
            int i68 = i65 + 1;
            int charAt19 = c13.charAt(i65);
            if (charAt19 >= 55296) {
                int i69 = charAt19 & 8191;
                int i73 = 13;
                while (true) {
                    i27 = i68 + 1;
                    charAt9 = c13.charAt(i68);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i69 |= (charAt9 & 8191) << i73;
                    i73 += 13;
                    i68 = i27;
                }
                charAt19 = i69 | (charAt9 << i73);
                i68 = i27;
            }
            int i74 = i68 + 1;
            int charAt20 = c13.charAt(i68);
            if (charAt20 >= 55296) {
                int i75 = charAt20 & 8191;
                int i76 = 13;
                while (true) {
                    i26 = i74 + 1;
                    charAt8 = c13.charAt(i74);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i75 |= (charAt8 & 8191) << i76;
                    i76 += 13;
                    i74 = i26;
                }
                charAt20 = i75 | (charAt8 << i76);
                i74 = i26;
            }
            int i77 = i74 + 1;
            charAt2 = c13.charAt(i74);
            if (charAt2 >= 55296) {
                int i78 = charAt2 & 8191;
                int i79 = 13;
                while (true) {
                    i25 = i77 + 1;
                    charAt7 = c13.charAt(i77);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i78 |= (charAt7 & 8191) << i79;
                    i79 += 13;
                    i77 = i25;
                }
                charAt2 = i78 | (charAt7 << i79);
                i77 = i25;
            }
            int i83 = i77 + 1;
            charAt3 = c13.charAt(i77);
            if (charAt3 >= 55296) {
                int i84 = charAt3 & 8191;
                int i85 = 13;
                while (true) {
                    i24 = i83 + 1;
                    charAt6 = c13.charAt(i83);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i84 |= (charAt6 & 8191) << i85;
                    i85 += 13;
                    i83 = i24;
                }
                charAt3 = i84 | (charAt6 << i85);
                i83 = i24;
            }
            int i86 = i83 + 1;
            int charAt21 = c13.charAt(i83);
            if (charAt21 >= 55296) {
                int i87 = charAt21 & 8191;
                int i88 = 13;
                while (true) {
                    i23 = i86 + 1;
                    charAt5 = c13.charAt(i86);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i87 |= (charAt5 & 8191) << i88;
                    i88 += 13;
                    i86 = i23;
                }
                charAt21 = i87 | (charAt5 << i88);
                i86 = i23;
            }
            i14 = i86 + 1;
            int charAt22 = c13.charAt(i86);
            if (charAt22 >= 55296) {
                int i89 = charAt22 & 8191;
                int i93 = 13;
                while (true) {
                    i19 = i14 + 1;
                    charAt4 = c13.charAt(i14);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i89 |= (charAt4 & 8191) << i93;
                    i93 += 13;
                    i14 = i19;
                }
                charAt22 = i89 | (charAt4 << i93);
                i14 = i19;
            }
            i15 = (charAt * 2) + charAt18;
            i16 = charAt19;
            i17 = charAt20;
            iArr = new int[charAt22 + charAt3 + charAt21];
            i18 = charAt22;
        }
        Unsafe unsafe = f14159o;
        Object[] b13 = f62Var.b();
        Class<?> cls = f62Var.a().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 * 2];
        int i94 = i18 + charAt3;
        int i95 = 0;
        int i96 = i18;
        int i97 = i94;
        while (i14 < length) {
            int i98 = i14 + 1;
            int charAt23 = c13.charAt(i14);
            if (charAt23 >= c14) {
                int i99 = charAt23 & 8191;
                int i100 = i98;
                int i101 = 13;
                while (true) {
                    i49 = i100 + 1;
                    charAt15 = c13.charAt(i100);
                    if (charAt15 < c14) {
                        break;
                    }
                    i99 |= (charAt15 & 8191) << i101;
                    i101 += 13;
                    i100 = i49;
                }
                charAt23 = i99 | (charAt15 << i101);
                i33 = i49;
            } else {
                i33 = i98;
            }
            int i102 = i33 + 1;
            int charAt24 = c13.charAt(i33);
            if (charAt24 >= c14) {
                int i103 = charAt24 & 8191;
                int i104 = i102;
                int i105 = 13;
                while (true) {
                    i48 = i104 + 1;
                    charAt14 = c13.charAt(i104);
                    if (charAt14 < c14) {
                        break;
                    }
                    i103 |= (charAt14 & 8191) << i105;
                    i105 += 13;
                    i104 = i48;
                }
                charAt24 = i103 | (charAt14 << i105);
                i34 = i48;
            } else {
                i34 = i102;
            }
            int i106 = charAt24 & 255;
            if ((charAt24 & 1024) != 0) {
                iArr[i95] = i54;
                i95++;
            }
            if (i106 >= 51) {
                int i107 = i34 + 1;
                int charAt25 = c13.charAt(i34);
                i35 = length;
                char c15 = 55296;
                if (charAt25 >= 55296) {
                    int i108 = charAt25 & 8191;
                    int i109 = 13;
                    while (true) {
                        i47 = i107 + 1;
                        charAt13 = c13.charAt(i107);
                        if (charAt13 < c15) {
                            break;
                        }
                        i108 |= (charAt13 & 8191) << i109;
                        i109 += 13;
                        i107 = i47;
                        c15 = 55296;
                    }
                    charAt25 = i108 | (charAt13 << i109);
                    i107 = i47;
                }
                int i110 = i106 - 51;
                int i111 = i107;
                if (i110 != 9 && i110 != 17) {
                    if (i110 != 12 || (!a.bb.e(f62Var.d()) && (charAt24 & 2048) == 0)) {
                        i36 = i95;
                        i46 = 2;
                    } else {
                        i36 = i95;
                        i46 = 2;
                        objArr[a.cb.c(i54, 3, 2, 1)] = b13[i15];
                        i15++;
                    }
                } else {
                    i36 = i95;
                    i46 = 2;
                    objArr[a.cb.c(i54, 3, 2, 1)] = b13[i15];
                    i15++;
                }
                int i112 = charAt25 * i46;
                Object obj = b13[i112];
                if (obj instanceof Field) {
                    a14 = (Field) obj;
                } else {
                    a14 = a((Class) cls, (String) obj);
                    b13[i112] = a14;
                }
                int[] iArr4 = iArr3;
                i44 = (int) unsafe.objectFieldOffset(a14);
                int i113 = i112 + 1;
                Object obj2 = b13[i113];
                if (obj2 instanceof Field) {
                    a15 = (Field) obj2;
                } else {
                    a15 = a((Class) cls, (String) obj2);
                    b13[i113] = a15;
                }
                i39 = (int) unsafe.objectFieldOffset(a15);
                iArr2 = iArr4;
                i37 = charAt23;
                i38 = i111;
                i43 = 0;
            } else {
                i35 = length;
                i36 = i95;
                int[] iArr5 = iArr3;
                int i114 = i15 + 1;
                Field a16 = a((Class) cls, (String) b13[i15]);
                if (i106 == 9 || i106 == 17) {
                    iArr2 = iArr5;
                    i37 = charAt23;
                    objArr[a.cb.c(i54, 3, 2, 1)] = a16.getType();
                } else {
                    if (i106 == 27 || i106 == 49) {
                        iArr2 = iArr5;
                        i37 = charAt23;
                        i45 = i15 + 2;
                        objArr[a.cb.c(i54, 3, 2, 1)] = b13[i114];
                    } else if (i106 == 12 || i106 == 30 || i106 == 44) {
                        iArr2 = iArr5;
                        if (f62Var.d() == 1 || (charAt24 & 2048) != 0) {
                            i37 = charAt23;
                            i45 = i15 + 2;
                            objArr[a.cb.c(i54, 3, 2, 1)] = b13[i114];
                        } else {
                            i37 = charAt23;
                        }
                    } else {
                        if (i106 == 50) {
                            int i115 = i96 + 1;
                            iArr[i96] = i54;
                            int i116 = (i54 / 3) * 2;
                            int i117 = i15 + 2;
                            objArr[i116] = b13[i114];
                            if ((charAt24 & 2048) != 0) {
                                i114 = i15 + 3;
                                objArr[i116 + 1] = b13[i117];
                                iArr2 = iArr5;
                                i96 = i115;
                            } else {
                                i96 = i115;
                                i37 = charAt23;
                                i114 = i117;
                                iArr2 = iArr5;
                            }
                        } else {
                            iArr2 = iArr5;
                        }
                        i37 = charAt23;
                    }
                    i114 = i45;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(a16);
                if ((charAt24 & 4096) == 0 || i106 > 17) {
                    i38 = i34;
                    i39 = 1048575;
                    i43 = 0;
                } else {
                    int i118 = i34 + 1;
                    int charAt26 = c13.charAt(i34);
                    if (charAt26 >= 55296) {
                        int i119 = charAt26 & 8191;
                        int i120 = 13;
                        while (true) {
                            i38 = i118 + 1;
                            charAt12 = c13.charAt(i118);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i119 |= (charAt12 & 8191) << i120;
                            i120 += 13;
                            i118 = i38;
                        }
                        charAt26 = i119 | (charAt12 << i120);
                    } else {
                        i38 = i118;
                    }
                    int i121 = (charAt26 / 32) + (charAt * 2);
                    Object obj3 = b13[i121];
                    if (obj3 instanceof Field) {
                        a13 = (Field) obj3;
                    } else {
                        a13 = a((Class) cls, (String) obj3);
                        b13[i121] = a13;
                    }
                    i43 = charAt26 % 32;
                    i39 = (int) unsafe.objectFieldOffset(a13);
                }
                if (i106 >= 18 && i106 <= 49) {
                    iArr[i97] = objectFieldOffset;
                    i97++;
                }
                i15 = i114;
                i44 = objectFieldOffset;
            }
            int i122 = i54 + 1;
            iArr2[i54] = i37;
            int i123 = i54 + 2;
            iArr2[i122] = i44 | ((charAt24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 536870912 : 0) | ((charAt24 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i106 << 20);
            i54 += 3;
            iArr2[i123] = (i43 << 20) | i39;
            i14 = i38;
            length = i35;
            iArr3 = iArr2;
            i95 = i36;
            c14 = 55296;
        }
        return new ya1(iArr3, objArr, i16, i17, f62Var.a(), iArr, i18, i94, edVar, wfVar, tfVar, x6Var, mfVar);
    }

    public final int a(Object obj, byte[] bArr, int i13, int i14, int i15, long j13, pg pgVar) {
        Unsafe unsafe = f14159o;
        Object b13 = b(i15);
        Object object = unsafe.getObject(obj, j13);
        ((a.xf) this.f14172m).getClass();
        if (a.xf.f(object)) {
            ((a.xf) this.f14172m).getClass();
            w81 c13 = a.xf.c();
            ((a.xf) this.f14172m).getClass();
            a.xf.d(c13, object);
            unsafe.putObject(obj, j13, c13);
            object = c13;
        }
        ((a.xf) this.f14172m).getClass();
        s81 b14 = a.xf.b(b13);
        ((a.xf) this.f14172m).getClass();
        w81 e13 = a.xf.e(object);
        int z03 = m2.z0(bArr, i13, pgVar);
        int i16 = pgVar.f9670a;
        if (i16 >= 0 && i16 <= i14 - z03) {
            int i17 = i16 + z03;
            Object obj2 = b14.f11002b;
            Object obj3 = b14.f11004d;
            while (z03 < i17) {
                int i18 = z03 + 1;
                int i19 = bArr[z03];
                if (i19 < 0) {
                    i18 = m2.N(i19, bArr, i18, pgVar);
                    i19 = pgVar.f9670a;
                }
                int i23 = i18;
                int i24 = i19 >>> 3;
                int i25 = i19 & 7;
                if (i24 == 1) {
                    v03 v03Var = b14.f11001a;
                    if (i25 == v03Var.f12287b) {
                        z03 = a(bArr, i23, i14, v03Var, (Class) null, pgVar);
                        obj2 = pgVar.f9672c;
                    } else {
                        z03 = m2.L(i19, bArr, i23, i14, pgVar);
                    }
                } else {
                    if (i24 == 2) {
                        v03 v03Var2 = b14.f11003c;
                        if (i25 == v03Var2.f12287b) {
                            z03 = a(bArr, i23, i14, v03Var2, b14.f11004d.getClass(), pgVar);
                            obj3 = pgVar.f9672c;
                        }
                    }
                    z03 = m2.L(i19, bArr, i23, i14, pgVar);
                }
            }
            if (z03 == i17) {
                e13.put(obj2, obj3);
                return i17;
            }
            throw new e21("Failed to parse the message.");
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0376, code lost:
    
        if (r0 != r20) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03e5, code lost:
    
        r8 = r32;
        r6 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03cb, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r3 = r32;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r16;
        r4 = r20;
        r5 = r21;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03a3, code lost:
    
        if (r0 != r15) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03c9, code lost:
    
        if (r0 != r15) goto L136;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, ads_mobile_sdk.pg r35) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.a(java.lang.Object, byte[], int, int, int, ads_mobile_sdk.pg):int");
    }

    public final int a(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, int i23, pg pgVar) {
        Unsafe unsafe = f14159o;
        long j14 = this.f14160a[i23 + 2] & 1048575;
        switch (i19) {
            case 51:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Double.valueOf(m2.K(i13, bArr)));
                    int i24 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i24;
                }
                break;
            case 52:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Float.valueOf(m2.w0(i13, bArr)));
                    int i25 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i25;
                }
                break;
            case 53:
            case 54:
                if (i17 == 0) {
                    int E0 = m2.E0(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, Long.valueOf(pgVar.f9671b));
                    unsafe.putInt(obj, j14, i16);
                    return E0;
                }
                break;
            case 55:
            case 62:
                if (i17 == 0) {
                    int z03 = m2.z0(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(pgVar.f9670a));
                    unsafe.putInt(obj, j14, i16);
                    return z03;
                }
                break;
            case 56:
            case 65:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Long.valueOf(m2.m0(i13, bArr)));
                    int i26 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i26;
                }
                break;
            case 57:
            case 64:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Integer.valueOf(m2.d0(i13, bArr)));
                    int i27 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i27;
                }
                break;
            case 58:
                if (i17 == 0) {
                    int E02 = m2.E0(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, Boolean.valueOf(pgVar.f9671b != 0));
                    unsafe.putInt(obj, j14, i16);
                    return E02;
                }
                break;
            case 59:
                if (i17 == 2) {
                    int z04 = m2.z0(bArr, i13, pgVar);
                    int i28 = pgVar.f9670a;
                    if (i28 == 0) {
                        unsafe.putObject(obj, j13, "");
                    } else {
                        if ((i18 & 536870912) != 0 && !rx2.a(bArr, z04, z04 + i28)) {
                            throw e21.a();
                        }
                        unsafe.putObject(obj, j13, new String(bArr, z04, i28, hw0.f6126a));
                        z04 += i28;
                    }
                    unsafe.putInt(obj, j14, i16);
                    return z04;
                }
                break;
            case 60:
                if (i17 == 2) {
                    Object b13 = b(obj, i16, i23);
                    int Q = m2.Q(b13, c(i23), bArr, i13, i14, pgVar);
                    a(obj, i16, i23, b13);
                    return Q;
                }
                break;
            case 61:
                if (i17 == 2) {
                    int S = m2.S(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, pgVar.f9672c);
                    unsafe.putInt(obj, j14, i16);
                    return S;
                }
                break;
            case 63:
                if (i17 == 0) {
                    int z05 = m2.z0(bArr, i13, pgVar);
                    int i29 = pgVar.f9670a;
                    a.r0 a13 = a(i23);
                    if (a13 != null && !a13.a(i29)) {
                        f(obj).a(i15, Long.valueOf(i29));
                    } else {
                        unsafe.putObject(obj, j13, Integer.valueOf(i29));
                        unsafe.putInt(obj, j14, i16);
                    }
                    return z05;
                }
                break;
            case 66:
                if (i17 == 0) {
                    int z06 = m2.z0(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(io.b(pgVar.f9670a)));
                    unsafe.putInt(obj, j14, i16);
                    return z06;
                }
                break;
            case 67:
                if (i17 == 0) {
                    int E03 = m2.E0(bArr, i13, pgVar);
                    unsafe.putObject(obj, j13, Long.valueOf(io.a(pgVar.f9671b)));
                    unsafe.putInt(obj, j14, i16);
                    return E03;
                }
                break;
            case 68:
                if (i17 == 3) {
                    Object b14 = b(obj, i16, i23);
                    int P = m2.P(b14, c(i23), bArr, i13, i14, (i15 & (-8)) | 4, pgVar);
                    a(obj, i16, i23, b14);
                    return P;
                }
                break;
        }
        return i13;
    }

    public final void a(Object obj, long j13, a.q3 q3Var, a.tb tbVar, jc0 jc0Var) {
        int r13;
        ((a.tg) this.f14170k).getClass();
        h4 b13 = a.tg.b(j13, obj);
        jo joVar = (jo) q3Var;
        int i13 = joVar.f6899b;
        if ((i13 & 7) == 3) {
            do {
                sj0 a13 = tbVar.a();
                joVar.a(a13, tbVar, jc0Var);
                tbVar.c(a13);
                b13.add(a13);
                if (joVar.f6898a.b() || joVar.f6901d != 0) {
                    return;
                } else {
                    r13 = joVar.f6898a.r();
                }
            } while (r13 == i13);
            joVar.f6901d = r13;
            return;
        }
        int i14 = e21.f4580b;
        throw new d21();
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e13) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder w13 = a.a.w("Field ", str, " for ", name, " not found. Known fields are ");
            w13.append(arrays);
            throw new RuntimeException(w13.toString(), e13);
        }
    }

    public final int a(int i13, int i14) {
        int length = (this.f14160a.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = this.f14160a[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    public final void a(Object obj, int i13, int i14, Object obj2) {
        f14159o.putObject(obj, this.f14160a[i14 + 1] & 1048575, obj2);
        c(obj, i13, i14);
    }

    @Override // a.tb
    public final void a(Object obj, po poVar) {
        poVar.getClass();
        b(obj, poVar);
    }

    public static int a(Object obj, long j13) {
        return ((Integer) mw2.f8408c.g(obj, j13)).intValue();
    }

    public final int a(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, long j13, int i19, long j14, pg pgVar) {
        int z13;
        Unsafe unsafe = f14159o;
        j jVar = (j) ((h4) unsafe.getObject(obj, j14));
        boolean b13 = jVar.b();
        h4 h4Var = jVar;
        if (!b13) {
            h4 a13 = jVar.a(jVar.size() * 2);
            unsafe.putObject(obj, j14, a13);
            h4Var = a13;
        }
        switch (i19) {
            case 18:
            case 35:
                if (i17 == 2) {
                    m2.i0(bArr, i13, h4Var, pgVar);
                    throw null;
                }
                if (i17 == 1) {
                    m2.n0(bArr, i13, h4Var);
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i17 == 2) {
                    m2.F0(bArr, i13, h4Var, pgVar);
                    throw null;
                }
                if (i17 == 5) {
                    m2.H0(bArr, i13, h4Var);
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i17 == 2) {
                    return m2.d1(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 0) {
                    return m2.A1(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i17 == 2) {
                    return m2.Z0(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 0) {
                    return m2.z1(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i17 == 2) {
                    return m2.y0(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 1) {
                    return m2.D0(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i17 == 2) {
                    return m2.k0(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 5) {
                    return m2.x0(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 25:
            case 42:
                if (i17 == 2) {
                    return m2.R(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 0) {
                    m2.X(bArr, i13, h4Var, pgVar);
                    throw null;
                }
                break;
            case 26:
                if (i17 == 2) {
                    if ((j13 & 536870912) == 0) {
                        return m2.c1(i15, bArr, i13, i14, h4Var, pgVar);
                    }
                    return m2.y1(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 27:
                if (i17 == 2) {
                    return m2.f0(c(i18), i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 28:
                if (i17 == 2) {
                    return m2.e0(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 30:
            case 44:
                if (i17 == 2) {
                    z13 = m2.Z0(bArr, i13, h4Var, pgVar);
                } else if (i17 == 0) {
                    z13 = m2.z1(i15, bArr, i13, i14, h4Var, pgVar);
                }
                td2.a(obj, i16, h4Var, a(i18), null, this.f14171l);
                return z13;
            case 33:
            case 47:
                if (i17 == 2) {
                    return m2.G0(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 0) {
                    return m2.J0(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 34:
            case 48:
                if (i17 == 2) {
                    return m2.K0(bArr, i13, h4Var, pgVar);
                }
                if (i17 == 0) {
                    return m2.Y0(i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
            case 49:
                if (i17 == 3) {
                    return m2.O(c(i18), i15, bArr, i13, i14, h4Var, pgVar);
                }
                break;
        }
        return i13;
    }
}
