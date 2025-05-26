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
import th2.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/SpanJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/Span;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SpanJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73257a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73258b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73259c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73260d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73261e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73262f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Constructor f73263g;

    public SpanJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("trace_id", "span_id", "parent_span_id", "name", "start_time_unix_nano", "end_time_unix_nano", "status", "events", "attributes");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"trace_id\", \"span_id\"…nts\",\n      \"attributes\")");
        this.f73257a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "traceId");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…   emptySet(), \"traceId\")");
        this.f73258b = c13;
        r c14 = moshi.c(Long.class, s0Var, "startTimeNanos");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Long::clas…ySet(), \"startTimeNanos\")");
        this.f73259c = c14;
        r c15 = moshi.c(m.class, s0Var, "status");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Span.Statu…va, emptySet(), \"status\")");
        this.f73260d = c15;
        r c16 = moshi.c(a.Z(List.class, SpanEvent.class), s0Var, "events");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Types.newP…ptySet(),\n      \"events\")");
        this.f73261e = c16;
        r c17 = moshi.c(a.Z(List.class, Attribute.class), s0Var, "attributes");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.f73262f = c17;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        int i13 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l13 = null;
        Long l14 = null;
        m mVar = null;
        List list = null;
        List list2 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73257a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    str = (String) this.f73258b.a(reader);
                    i13 &= -2;
                    break;
                case 1:
                    str2 = (String) this.f73258b.a(reader);
                    i13 &= -3;
                    break;
                case 2:
                    str3 = (String) this.f73258b.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str4 = (String) this.f73258b.a(reader);
                    i13 &= -9;
                    break;
                case 4:
                    l13 = (Long) this.f73259c.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    l14 = (Long) this.f73259c.a(reader);
                    i13 &= -33;
                    break;
                case 6:
                    mVar = (m) this.f73260d.a(reader);
                    i13 &= -65;
                    break;
                case 7:
                    list = (List) this.f73261e.a(reader);
                    i13 &= -129;
                    break;
                case 8:
                    list2 = (List) this.f73262f.a(reader);
                    i13 &= -257;
                    break;
            }
        }
        reader.e();
        if (i13 == -512) {
            return new Span(str, str2, str3, str4, l13, l14, mVar, list, list2);
        }
        Constructor constructor = this.f73263g;
        if (constructor == null) {
            constructor = Span.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.class, Long.class, m.class, List.class, List.class, Integer.TYPE, b.f100000c);
            this.f73263g = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "Span::class.java.getDecl…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, l13, l14, mVar, list, list2, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Span) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        Span span = (Span) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (span == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("trace_id");
        r rVar = this.f73258b;
        rVar.d(writer, span.f73240a);
        writer.f("span_id");
        rVar.d(writer, span.f73241b);
        writer.f("parent_span_id");
        rVar.d(writer, span.f73242c);
        writer.f("name");
        rVar.d(writer, span.f73243d);
        writer.f("start_time_unix_nano");
        r rVar2 = this.f73259c;
        rVar2.d(writer, span.f73244e);
        writer.f("end_time_unix_nano");
        rVar2.d(writer, span.f73245f);
        writer.f("status");
        this.f73260d.d(writer, span.f73246g);
        writer.f("events");
        this.f73261e.d(writer, span.f73247h);
        writer.f("attributes");
        this.f73262f.d(writer, span.f73248i);
        writer.d();
    }

    public final String toString() {
        return f.f(26, "GeneratedJsonAdapter(Span)", "toString(...)");
    }
}
