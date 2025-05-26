package c72;

import g72.b2;
import g72.g2;
import g72.y1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import r72.d1;
import r72.e1;
import r72.f1;
import r72.g1;
import r72.h1;
import r72.l1;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final n72.m f26915a;

    public p(m72.a shuffleCoreLogger) {
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        this.f26915a = shuffleCoreLogger;
    }

    public static g1 b(String value, y1 y1Var) {
        if (y1Var.f64153c.size() != 2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Float f13 = y1Var.f64151a;
        float floatValue = f13 != null ? f13.floatValue() : 1.0f;
        Boolean bool = y1Var.f64152b;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        List list = y1Var.f64153c;
        l1 l1Var = new l1(((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue());
        Double d2 = y1Var.f64155e;
        double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        Double d13 = y1Var.f64156f;
        return new g1(value, floatValue, booleanValue, l1Var, y1Var.f64154d, doubleValue, d13 != null ? d13.doubleValue() : 0.0d, y1Var.f64157g);
    }

    public final e1 a(b2 b2Var) {
        f1 f1Var;
        h1 h1Var;
        Object m13;
        if (b2Var == null) {
            return null;
        }
        List<g2> list = b2Var.f63932a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (g2 g2Var : list) {
            String value = g2Var.f63993a;
            Intrinsics.checkNotNullParameter(value, "value");
            zn2.a aVar = zn2.b.f142311b;
            long O2 = dl2.b.O2(g2Var.f63994b, zn2.d.SECONDS);
            Map map = g2Var.f63995c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    m13 = b((String) entry.getKey(), (y1) entry.getValue());
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th3);
                }
                Throwable a13 = xk2.s.a(m13);
                if (a13 != null) {
                    this.f26915a.d(a13, new o(entry, 0));
                }
                if (m13 instanceof xk2.r) {
                    m13 = null;
                }
                linkedHashMap.put(key, (g1) m13);
            }
            ArrayList Q = CollectionsKt.Q(linkedHashMap.values());
            String str = g2Var.f63996d;
            switch (str.hashCode()) {
                case -1383205240:
                    if (!str.equals("bounce")) {
                        throw new IllegalStateException("Unknown timingFunction: ".concat(str).toString());
                    }
                    h1Var = h1.BOUNCE;
                    break;
                case -1102672091:
                    if (!str.equals("linear")) {
                        throw new IllegalStateException("Unknown timingFunction: ".concat(str).toString());
                    }
                    h1Var = h1.LINEAR;
                    break;
                case -898533970:
                    if (!str.equals("smooth")) {
                        throw new IllegalStateException("Unknown timingFunction: ".concat(str).toString());
                    }
                    h1Var = h1.SMOOTH;
                    break;
                case -895679987:
                    if (!str.equals("spring")) {
                        throw new IllegalStateException("Unknown timingFunction: ".concat(str).toString());
                    }
                    h1Var = h1.SPRING;
                    break;
                default:
                    throw new IllegalStateException("Unknown timingFunction: ".concat(str).toString());
            }
            arrayList.add(new d1(value, O2, Q, h1Var));
        }
        String str2 = b2Var.f63933b;
        int hashCode = str2.hashCode();
        if (hashCode == -1955888557) {
            if (str2.equals("autoreverse")) {
                f1Var = f1.AUTO_REVERSE;
                return new e1(arrayList, f1Var);
            }
            throw new IllegalStateException("Unknown loopMode: ".concat(str2).toString());
        }
        if (hashCode == -1039745817) {
            if (str2.equals("normal")) {
                f1Var = f1.NORMAL;
                return new e1(arrayList, f1Var);
            }
            throw new IllegalStateException("Unknown loopMode: ".concat(str2).toString());
        }
        if (hashCode == 3327652 && str2.equals("loop")) {
            f1Var = f1.LOOP;
            return new e1(arrayList, f1Var);
        }
        throw new IllegalStateException("Unknown loopMode: ".concat(str2).toString());
    }
}
