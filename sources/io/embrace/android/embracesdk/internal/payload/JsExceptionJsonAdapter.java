package io.embrace.android.embracesdk.internal.payload;

import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;
import oe2.h0;
import oe2.r;
import oe2.v;
import oe2.y;
import org.jetbrains.annotations.NotNull;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/JsExceptionJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/JsException;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class JsExceptionJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73166a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73167b;

    public JsExceptionJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("n", "m", "t", "st");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"n\", \"m\", \"t\", \"st\")");
        this.f73166a = b13;
        r c13 = moshi.c(String.class, s0.f80394a, "name");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.f73167b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73166a);
            if (k13 != -1) {
                r rVar = this.f73167b;
                if (k13 == 0) {
                    str = (String) rVar.a(reader);
                } else if (k13 == 1) {
                    str2 = (String) rVar.a(reader);
                } else if (k13 == 2) {
                    str3 = (String) rVar.a(reader);
                } else if (k13 == 3) {
                    str4 = (String) rVar.a(reader);
                }
            } else {
                reader.m();
                reader.E();
            }
        }
        reader.e();
        return new JsException(str, str2, str3, str4);
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        JsException jsException = (JsException) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (jsException == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("n");
        String str = jsException.f73162a;
        r rVar = this.f73167b;
        rVar.d(writer, str);
        writer.f("m");
        rVar.d(writer, jsException.f73163b);
        writer.f("t");
        rVar.d(writer, jsException.f73164c);
        writer.f("st");
        rVar.d(writer, jsException.f73165d);
        writer.d();
    }

    public final String toString() {
        return f.f(33, "GeneratedJsonAdapter(JsException)", "toString(...)");
    }
}
