package io.embrace.android.embracesdk.internal.payload;

import java.lang.reflect.Constructor;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/LogJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/Log;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LogJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73182a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73183b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73184c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73185d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73186e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Constructor f73187f;

    public LogJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("time_unix_nano", "severity_number", "severity_text", "body", "attributes", "trace_id", "span_id");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"time_unix_nano\",\n   …\", \"trace_id\", \"span_id\")");
        this.f73182a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Long.class, s0Var, "timeUnixNano");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Long::clas…ptySet(), \"timeUnixNano\")");
        this.f73183b = c13;
        r c14 = moshi.c(Integer.class, s0Var, "severityNumber");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Int::class…ySet(), \"severityNumber\")");
        this.f73184c = c14;
        r c15 = moshi.c(String.class, s0Var, "severityText");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…ptySet(), \"severityText\")");
        this.f73185d = c15;
        r c16 = moshi.c(a.Z(List.class, Attribute.class), s0Var, "attributes");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.f73186e = c16;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l13 = null;
        int i13 = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73182a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    l13 = (Long) this.f73183b.a(reader);
                    i13 &= -2;
                    break;
                case 1:
                    num = (Integer) this.f73184c.a(reader);
                    i13 &= -3;
                    break;
                case 2:
                    str = (String) this.f73185d.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str2 = (String) this.f73185d.a(reader);
                    i13 &= -9;
                    break;
                case 4:
                    list = (List) this.f73186e.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str3 = (String) this.f73185d.a(reader);
                    i13 &= -33;
                    break;
                case 6:
                    str4 = (String) this.f73185d.a(reader);
                    i13 &= -65;
                    break;
            }
        }
        reader.e();
        if (i13 == -128) {
            return new Log(l13, num, str, str2, list, str3, str4);
        }
        Constructor constructor = this.f73187f;
        if (constructor == null) {
            constructor = Log.class.getDeclaredConstructor(Long.class, Integer.class, String.class, String.class, List.class, String.class, String.class, Integer.TYPE, b.f100000c);
            this.f73187f = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "Log::class.java.getDecla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(l13, num, str, str2, list, str3, str4, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Log) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        Log log = (Log) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (log == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("time_unix_nano");
        this.f73183b.d(writer, log.f73175a);
        writer.f("severity_number");
        this.f73184c.d(writer, log.f73176b);
        writer.f("severity_text");
        r rVar = this.f73185d;
        rVar.d(writer, log.f73177c);
        writer.f("body");
        rVar.d(writer, log.f73178d);
        writer.f("attributes");
        this.f73186e.d(writer, log.f73179e);
        writer.f("trace_id");
        rVar.d(writer, log.f73180f);
        writer.f("span_id");
        rVar.d(writer, log.f73181g);
        writer.d();
    }

    public final String toString() {
        return f.f(25, "GeneratedJsonAdapter(Log)", "toString(...)");
    }
}
