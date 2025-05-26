package androidx.lifecycle;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n1 implements l8.x, ha.d, ka.a, y7.a {
    public static final LinkedHashMap a(tc.g gVar, pc.o0 o0Var, pc.v vVar, boolean z13, String str) {
        gVar.s();
        gVar.M0("operationName");
        gVar.n1(o0Var.name());
        gVar.M0("variables");
        uc.a aVar = new uc.a(gVar);
        aVar.s();
        o0Var.e(aVar, vVar);
        aVar.v();
        LinkedHashMap linkedHashMap = aVar.f121751b;
        if (str != null) {
            gVar.M0("query");
            gVar.n1(str);
        }
        if (z13) {
            gVar.M0("extensions");
            gVar.s();
            gVar.M0("persistedQuery");
            gVar.s();
            gVar.M0("version").D(1);
            gVar.M0("sha256Hash").n1(o0Var.a());
            gVar.v();
            gVar.v();
        }
        gVar.v();
        return linkedHashMap;
    }

    public static void d(oa.g statement, Object[] objArr) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i13 = 0;
        while (i13 < length) {
            Object obj = objArr[i13];
            i13++;
            if (obj == null) {
                statement.M1(i13);
            } else if (obj instanceof byte[]) {
                statement.y1(i13, (byte[]) obj);
            } else if (obj instanceof Float) {
                statement.N(i13, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                statement.N(i13, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                statement.u1(i13, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                statement.u1(i13, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                statement.u1(i13, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                statement.u1(i13, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                statement.c1(i13, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i13 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                statement.u1(i13, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static long e(boolean z13, int i13, kb.a backoffPolicy, long j13, long j14, int i14, boolean z14, long j15, long j16, long j17, long j18) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        if (j18 != Long.MAX_VALUE && z14) {
            return i14 == 0 ? j18 : ql2.s.b(j18, 900000 + j14);
        }
        if (z13) {
            return ql2.s.d(backoffPolicy == kb.a.LINEAR ? i13 * j13 : (long) Math.scalb(j13, i13 - 1), 18000000L) + j14;
        }
        if (z14) {
            long j19 = i14 == 0 ? j14 + j15 : j14 + j17;
            return (j16 == j17 || i14 != 0) ? j19 : (j17 - j16) + j19;
        }
        if (j14 == -1) {
            return Long.MAX_VALUE;
        }
        return j14 + j15;
    }

    public static g8.l f(ArrayList arrayList, AbstractList abstractList) {
        return new g8.l(arrayList, abstractList);
    }

    public static String h(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    @Override // ka.a
    public void G(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // l8.x
    public void b() {
    }

    @Override // ha.d
    public void c() {
    }

    public dl2.b g(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new z8.b();
                case "application/x-icy":
                    return new c9.a();
                case "application/id3":
                    return new d9.i(null);
                case "application/x-emsg":
                    return new a9.b();
                case "application/x-scte35":
                    return new f9.c();
            }
        }
        throw new IllegalArgumentException(a.a.j("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // ha.d
    public void i(int i13, Object obj) {
    }

    public boolean j(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
