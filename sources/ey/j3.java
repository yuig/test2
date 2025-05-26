package ey;

import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: b, reason: collision with root package name */
    public static long f60511b;

    /* renamed from: c, reason: collision with root package name */
    public static long f60512c;

    /* renamed from: d, reason: collision with root package name */
    public static long f60513d;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f60516g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f60517h;

    /* renamed from: j, reason: collision with root package name */
    public static int f60519j;

    /* renamed from: a, reason: collision with root package name */
    public static final j3 f60510a = new j3();

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f60514e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final xk2.v f60515f = xk2.m.b(f3.f60484k);

    /* renamed from: i, reason: collision with root package name */
    public static Function1 f60518i = i3.f60501i;

    public static long a() {
        return ((Random) f60515f.getValue()).nextLong();
    }

    public static re2.g b(re2.j jVar) {
        List<re2.g> list = jVar.f107714f;
        if (list == null) {
            return null;
        }
        for (re2.g gVar : list) {
            if (Intrinsics.d(gVar.f107699a, "search_cause")) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Map c(re2.j jVar) {
        String str;
        Collection collection = jVar.f107714f;
        if (qb0.b.o(collection)) {
            return kotlin.collections.z0.d();
        }
        HashMap hashMap = new HashMap();
        if (collection == null) {
            collection = kotlin.collections.q0.f80391a;
        }
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            re2.g binaryAnnotation = (re2.g) it.next();
            String str2 = binaryAnnotation.f107699a;
            if (str2 != null && !kotlin.text.z.j(str2) && (str = binaryAnnotation.f107699a) != null) {
                Enum r53 = null;
                switch (str.hashCode()) {
                    case -1995507808:
                        if (!str.equals("view.parameter")) {
                            break;
                        } else {
                            h32.y3 y3Var = h32.a4.Companion;
                            int i13 = i(binaryAnnotation);
                            y3Var.getClass();
                            h32.a4 a13 = h32.y3.a(i13);
                            if (a13 == null) {
                                break;
                            } else {
                                hashMap.put(str, a13.name());
                                break;
                            }
                        }
                    case -1618252573:
                        if (!str.equals("view.type")) {
                            break;
                        } else {
                            h32.b4 b4Var = h32.d4.Companion;
                            int i14 = i(binaryAnnotation);
                            b4Var.getClass();
                            h32.d4 a14 = h32.b4.a(i14);
                            if (a14 == null) {
                                break;
                            } else {
                                hashMap.put(str, a14.name());
                                break;
                            }
                        }
                    case 274032774:
                        if (!str.equals("image_cached")) {
                            break;
                        } else {
                            Intrinsics.checkNotNullParameter(binaryAnnotation, "binaryAnnotation");
                            wo2.m mVar = binaryAnnotation.f107700b;
                            String bool = Boolean.toString(mVar != null && mVar.b() > 0 && mVar.e(0) == 1);
                            Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
                            hashMap.put(str, bool);
                            break;
                        }
                        break;
                    case 665180638:
                        if (!str.equals("pwt.result")) {
                            break;
                        } else {
                            s92.m mVar2 = s92.o.Companion;
                            short h10 = h(binaryAnnotation);
                            mVar2.getClass();
                            if (h10 == 1) {
                                r53 = s92.o.COMPLETE;
                            } else if (h10 == 2) {
                                r53 = s92.o.ABORTED;
                            } else if (h10 == 3) {
                                r53 = s92.o.ERROR;
                            }
                            if (r53 == null) {
                                break;
                            } else {
                                hashMap.put(str, r53.name());
                                break;
                            }
                        }
                    case 1947149960:
                        if (!str.equals("pwt.cause")) {
                            break;
                        } else {
                            s92.j jVar2 = s92.l.Companion;
                            short h13 = h(binaryAnnotation);
                            jVar2.getClass();
                            switch (h13) {
                                case 1:
                                    r53 = s92.l.FIRST_START;
                                    break;
                                case 2:
                                    r53 = s92.l.COLD_START;
                                    break;
                                case 3:
                                    r53 = s92.l.WARM_START;
                                    break;
                                case 4:
                                    r53 = s92.l.USER_NAVIGATION;
                                    break;
                                case 5:
                                    r53 = s92.l.STORY_PIN_NAVIGATION;
                                    break;
                                case 6:
                                    r53 = s92.l.AUTOPLAYING_USER_NAVIGATION;
                                    break;
                                case 7:
                                    r53 = s92.l.FIRST_PAGE_LOAD;
                                    break;
                                case 8:
                                    r53 = s92.l.FIRST_PAGE_LOAD_VISIBLE_ONLY;
                                    break;
                            }
                            if (r53 == null) {
                                break;
                            } else {
                                hashMap.put(str, r53.name());
                                break;
                            }
                        }
                }
            }
        }
        return hashMap;
    }

    public static s92.f d(String carrierName, String str) {
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        return kotlin.text.z.i("wifi", carrierName, true) ? s92.f.WIFI : (str == null && kotlin.text.z.i("Unknown", carrierName, true)) ? s92.f.WIFI : s92.f.CELLULAR;
    }

    public static h32.q0 e() {
        String str = Build.MANUFACTURER;
        if (kotlin.text.z.i("Acer", str, true)) {
            return h32.q0.ACER;
        }
        if (!kotlin.text.z.i("Amazon", str, true)) {
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            if (!StringsKt.E(str2, "Kindle Fire", true)) {
                return kotlin.text.z.i("Asus", str, true) ? h32.q0.ASUS : (kotlin.text.z.i("Alcatel", str, true) || kotlin.text.z.i("TCT", str, true) || kotlin.text.z.i("TCT (Alcatel)", str, true)) ? h32.q0.ALCATEL : kotlin.text.z.i("LGE", str, true) ? h32.q0.LGE : (kotlin.text.z.i("Motorola", str, true) || kotlin.text.z.i("Droid", str, true)) ? h32.q0.DROID : kotlin.text.z.i("HTC", str, true) ? h32.q0.HTC : kotlin.text.z.i("Huawei", str, true) ? h32.q0.HUAWEI : kotlin.text.z.i("NEXUS", str, true) ? h32.q0.NEXUS : kotlin.text.z.i("Kyocera", str, true) ? h32.q0.KYOCERA : kotlin.text.z.i("Samsung", str, true) ? h32.q0.SAMSUNG : (kotlin.text.z.i("Sony", str, true) || kotlin.text.z.i("Sony Ericsson", str, true)) ? h32.q0.SONY : kotlin.text.z.i("ZTE", str, true) ? h32.q0.ZTE : h32.q0.OTHER;
            }
        }
        return h32.q0.KINDLE;
    }

    public static h3 f(j3 j3Var, k3 perfLogger, String metricName, String str, int i13) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        j3Var.getClass();
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        perfLogger.getClass();
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        o1 b13 = perfLogger.b(metricName, str, null);
        if (b13 == null) {
            return new h3();
        }
        re2.j b14 = b13.b();
        Long l13 = b14.f107709a;
        Intrinsics.f(l13);
        long longValue = l13.longValue();
        long a13 = a();
        Long l14 = b14.f107711c;
        Intrinsics.f(l14);
        return new h3(longValue, a13, l14.longValue());
    }

    public static h3 g(k3 perfLogger, String metricName, String str, String str2) {
        Long l13;
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        perfLogger.getClass();
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        o1 b13 = perfLogger.b(metricName, str, str2);
        long longValue = (b13 == null || (l13 = b13.b().f107709a) == null) ? -1L : l13.longValue();
        return longValue == -1 ? new h3() : new h3(longValue, a(), a());
    }

    public static short h(re2.g binaryAnnotation) {
        Intrinsics.checkNotNullParameter(binaryAnnotation, "binaryAnnotation");
        wo2.j jVar = new wo2.j();
        wo2.m mVar = binaryAnnotation.f107700b;
        Intrinsics.f(mVar);
        jVar.S(mVar);
        fo.b bVar = new fo.b(new go.a(jVar));
        try {
            byte[] bArr = bVar.f62729b;
            bVar.o(2, bArr);
            return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
        } catch (IOException unused) {
            vb0.j.f125466a.R(false, "can not read out value from binary annotation " + binaryAnnotation, tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
            return Short.MIN_VALUE;
        }
    }

    public static int i(re2.g binaryAnnotation) {
        Intrinsics.checkNotNullParameter(binaryAnnotation, "binaryAnnotation");
        wo2.j jVar = new wo2.j();
        wo2.m mVar = binaryAnnotation.f107700b;
        Intrinsics.f(mVar);
        jVar.S(mVar);
        fo.b bVar = new fo.b(new go.a(jVar));
        try {
            byte[] bArr = bVar.f62729b;
            bVar.o(4, bArr);
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        } catch (IOException unused) {
            vb0.j.f125466a.R(false, "can not read out value from binary annotation " + binaryAnnotation, tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
            return Integer.MIN_VALUE;
        }
    }

    public static void j() {
        m60.w wVar = m60.u.f85943a;
        wVar.d(new ny.s(false));
        wVar.f(new w());
    }
}
