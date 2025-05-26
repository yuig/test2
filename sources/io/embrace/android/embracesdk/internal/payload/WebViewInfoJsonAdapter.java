package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/WebViewInfoJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/WebViewInfo;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebViewInfoJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73289a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73290b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73291c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73292d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73293e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Constructor f73294f;

    public WebViewInfoJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("t", "vt", "u", "ts");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"t\", \"vt\", \"u\", \"ts\")");
        this.f73289a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "tag");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…\n      emptySet(), \"tag\")");
        this.f73290b = c13;
        r c14 = moshi.c(a.Z(List.class, WebVital.class), s0Var, "webVitals");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP… emptySet(), \"webVitals\")");
        this.f73291c = c14;
        r c15 = moshi.c(String.class, s0Var, "url");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.f73292d = c15;
        r c16 = moshi.c(Long.TYPE, s0Var, "startTime");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.f73293e = c16;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        List list = null;
        String str = null;
        Long l13 = null;
        String str2 = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73289a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f73290b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                list = (List) this.f73291c.a(reader);
                if (list == null) {
                    JsonDataException l14 = b.l("webVitals", "vt", reader);
                    Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"webVitals\", \"vt\", reader)");
                    throw l14;
                }
                i13 &= -3;
            } else if (k13 == 2) {
                str2 = (String) this.f73292d.a(reader);
                if (str2 == null) {
                    JsonDataException l15 = b.l("url", "u", reader);
                    Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"url\", \"u\", reader)");
                    throw l15;
                }
            } else if (k13 == 3 && (l13 = (Long) this.f73293e.a(reader)) == null) {
                JsonDataException l16 = b.l("startTime", "ts", reader);
                Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"startTim…            \"ts\", reader)");
                throw l16;
            }
        }
        reader.e();
        if (i13 == -4) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<io.embrace.android.embracesdk.internal.payload.WebVital>");
            List t13 = dl2.b.t(list);
            if (str2 == null) {
                JsonDataException f13 = b.f("url", "u", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"url\", \"u\", reader)");
                throw f13;
            }
            if (l13 != null) {
                return new WebViewInfo(str, t13, str2, l13.longValue(), null, 16, null);
            }
            JsonDataException f14 = b.f("startTime", "ts", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"startTime\", \"ts\", reader)");
            throw f14;
        }
        Constructor constructor = this.f73294f;
        if (constructor == null) {
            constructor = WebViewInfo.class.getDeclaredConstructor(String.class, List.class, String.class, Long.TYPE, Map.class, Integer.TYPE, b.f100000c);
            this.f73294f = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "WebViewInfo::class.java.…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        objArr[0] = str;
        objArr[1] = list;
        if (str2 == null) {
            JsonDataException f15 = b.f("url", "u", reader);
            Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"url\", \"u\", reader)");
            throw f15;
        }
        objArr[2] = str2;
        if (l13 == null) {
            JsonDataException f16 = b.f("startTime", "ts", reader);
            Intrinsics.checkNotNullExpressionValue(f16, "missingProperty(\"startTime\", \"ts\", reader)");
            throw f16;
        }
        objArr[3] = l13;
        objArr[4] = null;
        objArr[5] = Integer.valueOf(i13);
        objArr[6] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (WebViewInfo) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        WebViewInfo webViewInfo = (WebViewInfo) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (webViewInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("t");
        this.f73290b.d(writer, webViewInfo.f73284a);
        writer.f("vt");
        this.f73291c.d(writer, webViewInfo.f73285b);
        writer.f("u");
        this.f73292d.d(writer, webViewInfo.f73286c);
        writer.f("ts");
        this.f73293e.d(writer, Long.valueOf(webViewInfo.f73287d));
        writer.d();
    }

    public final String toString() {
        return f.f(33, "GeneratedJsonAdapter(WebViewInfo)", "toString(...)");
    }
}
