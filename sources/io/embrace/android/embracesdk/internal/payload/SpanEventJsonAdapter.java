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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/SpanEventJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/SpanEvent;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SpanEventJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73252a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73253b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73254c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73255d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Constructor f73256e;

    public SpanEventJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("name", "time_unix_nano", "attributes");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"name\", \"time_unix_nano\",\n      \"attributes\")");
        this.f73252a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "name");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.f73253b = c13;
        r c14 = moshi.c(Long.class, s0Var, "timestampNanos");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Long::clas…ySet(), \"timestampNanos\")");
        this.f73254c = c14;
        r c15 = moshi.c(a.Z(List.class, Attribute.class), s0Var, "attributes");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.f73255d = c15;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        Long l13 = null;
        List list = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73252a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f73253b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                l13 = (Long) this.f73254c.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                list = (List) this.f73255d.a(reader);
                i13 &= -5;
            }
        }
        reader.e();
        if (i13 == -8) {
            return new SpanEvent(str, l13, list);
        }
        Constructor constructor = this.f73256e;
        if (constructor == null) {
            constructor = SpanEvent.class.getDeclaredConstructor(String.class, Long.class, List.class, Integer.TYPE, b.f100000c);
            this.f73256e = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "SpanEvent::class.java.ge…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, l13, list, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SpanEvent) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        SpanEvent spanEvent = (SpanEvent) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (spanEvent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("name");
        this.f73253b.d(writer, spanEvent.f73249a);
        writer.f("time_unix_nano");
        this.f73254c.d(writer, spanEvent.f73250b);
        writer.f("attributes");
        this.f73255d.d(writer, spanEvent.f73251c);
        writer.d();
    }

    public final String toString() {
        return f.f(31, "GeneratedJsonAdapter(SpanEvent)", "toString(...)");
    }
}
