package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
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
import th2.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/WebVitalJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/WebVital;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebVitalJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73301a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73302b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73303c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73304d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73305e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73306f;

    /* renamed from: g, reason: collision with root package name */
    public final r f73307g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Constructor f73308h;

    public WebVitalJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("t", "n", "st", "d", "p", "s");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"t\", \"n\", \"st\", \"d\", \"p\", \"s\")");
        this.f73301a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(p.class, s0Var, "type");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(WebVitalTy…java, emptySet(), \"type\")");
        this.f73302b = c13;
        r c14 = moshi.c(String.class, s0Var, "name");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f73303c = c14;
        r c15 = moshi.c(Long.TYPE, s0Var, "startTime");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.f73304d = c15;
        r c16 = moshi.c(Long.class, s0Var, "duration");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.f73305e = c16;
        r c17 = moshi.c(a.Z(Map.class, String.class, Object.class), s0Var, "properties");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Types.newP…emptySet(), \"properties\")");
        this.f73306f = c17;
        r c18 = moshi.c(Double.class, s0Var, "score");
        Intrinsics.checkNotNullExpressionValue(c18, "moshi.adapter(Double::cl…ype, emptySet(), \"score\")");
        this.f73307g = c18;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        Long l13 = null;
        p pVar = null;
        String str2 = null;
        Long l14 = null;
        Map map = null;
        Double d2 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73301a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    pVar = (p) this.f73302b.a(reader);
                    if (pVar == null) {
                        JsonDataException l15 = b.l("type", "t", reader);
                        Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"type\", \"t\",\n            reader)");
                        throw l15;
                    }
                    break;
                case 1:
                    str2 = (String) this.f73303c.a(reader);
                    if (str2 == null) {
                        JsonDataException l16 = b.l("name", "n", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"name\", \"n\", reader)");
                        throw l16;
                    }
                    break;
                case 2:
                    l13 = (Long) this.f73304d.a(reader);
                    if (l13 == null) {
                        JsonDataException l17 = b.l("startTime", "st", reader);
                        Intrinsics.checkNotNullExpressionValue(l17, "unexpectedNull(\"startTim…            \"st\", reader)");
                        throw l17;
                    }
                    break;
                case 3:
                    l14 = (Long) this.f73305e.a(reader);
                    i13 &= -9;
                    break;
                case 4:
                    map = (Map) this.f73306f.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    d2 = (Double) this.f73307g.a(reader);
                    i13 &= -33;
                    break;
            }
        }
        reader.e();
        if (i13 == -57) {
            if (pVar == null) {
                JsonDataException f13 = b.f("type", "t", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"type\", \"t\", reader)");
                throw f13;
            }
            if (str2 == null) {
                JsonDataException f14 = b.f("name", "n", reader);
                Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"name\", \"n\", reader)");
                throw f14;
            }
            if (l13 != null) {
                return new WebVital(pVar, str2, l13.longValue(), l14, map, d2);
            }
            JsonDataException f15 = b.f("startTime", "st", reader);
            Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"startTime\", \"st\", reader)");
            throw f15;
        }
        Constructor constructor = this.f73308h;
        if (constructor == null) {
            str = "missingProperty(\"name\", \"n\", reader)";
            constructor = WebVital.class.getDeclaredConstructor(p.class, String.class, Long.TYPE, Long.class, Map.class, Double.class, Integer.TYPE, b.f100000c);
            this.f73308h = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "WebVital::class.java.get…his.constructorRef = it }");
        } else {
            str = "missingProperty(\"name\", \"n\", reader)";
        }
        Object[] objArr = new Object[8];
        if (pVar == null) {
            JsonDataException f16 = b.f("type", "t", reader);
            Intrinsics.checkNotNullExpressionValue(f16, "missingProperty(\"type\", \"t\", reader)");
            throw f16;
        }
        objArr[0] = pVar;
        if (str2 == null) {
            JsonDataException f17 = b.f("name", "n", reader);
            Intrinsics.checkNotNullExpressionValue(f17, str);
            throw f17;
        }
        objArr[1] = str2;
        if (l13 == null) {
            JsonDataException f18 = b.f("startTime", "st", reader);
            Intrinsics.checkNotNullExpressionValue(f18, "missingProperty(\"startTime\", \"st\", reader)");
            throw f18;
        }
        objArr[2] = l13;
        objArr[3] = l14;
        objArr[4] = map;
        objArr[5] = d2;
        objArr[6] = Integer.valueOf(i13);
        objArr[7] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (WebVital) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        WebVital webVital = (WebVital) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (webVital == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("t");
        this.f73302b.d(writer, webVital.f73295a);
        writer.f("n");
        this.f73303c.d(writer, webVital.f73296b);
        writer.f("st");
        this.f73304d.d(writer, Long.valueOf(webVital.f73297c));
        writer.f("d");
        this.f73305e.d(writer, webVital.f73298d);
        writer.f("p");
        this.f73306f.d(writer, webVital.f73299e);
        writer.f("s");
        this.f73307g.d(writer, webVital.f73300f);
        writer.d();
    }

    public final String toString() {
        return f.f(30, "GeneratedJsonAdapter(WebVital)", "toString(...)");
    }
}
