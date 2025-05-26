package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonDataException;
import java.util.Map;
import kg.a;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;
import oe2.h0;
import oe2.r;
import oe2.v;
import oe2.y;
import org.jetbrains.annotations.NotNull;
import pe2.b;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeCrashDataJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/NativeCrashData;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NativeCrashDataJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73197a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73198b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73199c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73200d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73201e;

    public NativeCrashDataJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("report_id", "sid", "ts", "crash", "symbols");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"report_id\", \"sid\", \"…\"crash\",\n      \"symbols\")");
        this.f73197a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "nativeCrashId");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…),\n      \"nativeCrashId\")");
        this.f73198b = c13;
        r c14 = moshi.c(Long.TYPE, s0Var, "timestamp");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.f73199c = c14;
        r c15 = moshi.c(String.class, s0Var, "crash");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…     emptySet(), \"crash\")");
        this.f73200d = c15;
        r c16 = moshi.c(a.Z(Map.class, String.class, String.class), s0Var, "symbols");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Types.newP…), emptySet(), \"symbols\")");
        this.f73201e = c16;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l13 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73197a);
            if (k13 != -1) {
                r rVar = this.f73198b;
                if (k13 == 0) {
                    str = (String) rVar.a(reader);
                    if (str == null) {
                        JsonDataException l14 = b.l("nativeCrashId", "report_id", reader);
                        Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"nativeCr…Id\", \"report_id\", reader)");
                        throw l14;
                    }
                } else if (k13 == 1) {
                    str2 = (String) rVar.a(reader);
                    if (str2 == null) {
                        JsonDataException l15 = b.l("sessionId", "sid", reader);
                        Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"sessionI…           \"sid\", reader)");
                        throw l15;
                    }
                } else if (k13 == 2) {
                    l13 = (Long) this.f73199c.a(reader);
                    if (l13 == null) {
                        JsonDataException l16 = b.l("timestamp", "ts", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"timestam…            \"ts\", reader)");
                        throw l16;
                    }
                } else if (k13 == 3) {
                    str3 = (String) this.f73200d.a(reader);
                } else if (k13 == 4) {
                    map = (Map) this.f73201e.a(reader);
                }
            } else {
                reader.m();
                reader.E();
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException f13 = b.f("nativeCrashId", "report_id", reader);
            Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"nativeC…_id\",\n            reader)");
            throw f13;
        }
        if (str2 == null) {
            JsonDataException f14 = b.f("sessionId", "sid", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"sessionId\", \"sid\", reader)");
            throw f14;
        }
        if (l13 != null) {
            return new NativeCrashData(str, str2, l13.longValue(), str3, map);
        }
        JsonDataException f15 = b.f("timestamp", "ts", reader);
        Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"timestamp\", \"ts\", reader)");
        throw f15;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NativeCrashData nativeCrashData = (NativeCrashData) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (nativeCrashData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("report_id");
        r rVar = this.f73198b;
        rVar.d(writer, nativeCrashData.f73192a);
        writer.f("sid");
        rVar.d(writer, nativeCrashData.f73193b);
        writer.f("ts");
        this.f73199c.d(writer, Long.valueOf(nativeCrashData.f73194c));
        writer.f("crash");
        this.f73200d.d(writer, nativeCrashData.f73195d);
        writer.f("symbols");
        this.f73201e.d(writer, nativeCrashData.f73196e);
        writer.d();
    }

    public final String toString() {
        return f.f(37, "GeneratedJsonAdapter(NativeCrashData)", "toString(...)");
    }
}
