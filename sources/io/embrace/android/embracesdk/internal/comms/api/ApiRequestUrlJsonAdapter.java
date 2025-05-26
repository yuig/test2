package io.embrace.android.embracesdk.internal.comms.api;

import com.squareup.moshi.JsonDataException;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestUrlJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestUrl;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApiRequestUrlJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72940a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72941b;

    public ApiRequestUrlJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("url");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"url\")");
        this.f72940a = b13;
        r c13 = moshi.c(String.class, s0.f80394a, "url");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.f72941b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72940a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0 && (str = (String) this.f72941b.a(reader)) == null) {
                JsonDataException l13 = b.l("url", "url", reader);
                Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"url\", \"url\", reader)");
                throw l13;
            }
        }
        reader.e();
        if (str != null) {
            return new ApiRequestUrl(str);
        }
        JsonDataException f13 = b.f("url", "url", reader);
        Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"url\", \"url\", reader)");
        throw f13;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        ApiRequestUrl apiRequestUrl = (ApiRequestUrl) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (apiRequestUrl == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("url");
        this.f72941b.d(writer, apiRequestUrl.f72939a);
        writer.d();
    }

    public final String toString() {
        return f.f(35, "GeneratedJsonAdapter(ApiRequestUrl)", "toString(...)");
    }
}
