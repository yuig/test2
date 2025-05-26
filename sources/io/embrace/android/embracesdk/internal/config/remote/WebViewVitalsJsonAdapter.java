package io.embrace.android.embracesdk.internal.config.remote;

import java.lang.reflect.Constructor;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitalsJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebViewVitalsJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73097a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73098b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73099c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73100d;

    public WebViewVitalsJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("pct_enabled", "max_vitals");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"pct_enabled\", \"max_vitals\")");
        this.f73097a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Float.class, s0Var, "pctEnabled");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Float::cla…emptySet(), \"pctEnabled\")");
        this.f73098b = c13;
        r c14 = moshi.c(Integer.class, s0Var, "maxVitals");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Int::class… emptySet(), \"maxVitals\")");
        this.f73099c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Float f13 = null;
        Integer num = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73097a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                f13 = (Float) this.f73098b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                num = (Integer) this.f73099c.a(reader);
                i13 &= -3;
            }
        }
        reader.e();
        if (i13 == -4) {
            return new WebViewVitals(f13, num);
        }
        Constructor constructor = this.f73100d;
        if (constructor == null) {
            constructor = WebViewVitals.class.getDeclaredConstructor(Float.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f73100d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "WebViewVitals::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(f13, num, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (WebViewVitals) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        WebViewVitals webViewVitals = (WebViewVitals) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (webViewVitals == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("pct_enabled");
        this.f73098b.d(writer, webViewVitals.f73095a);
        writer.f("max_vitals");
        this.f73099c.d(writer, webViewVitals.f73096b);
        writer.d();
    }

    public final String toString() {
        return f.f(35, "GeneratedJsonAdapter(WebViewVitals)", "toString(...)");
    }
}
