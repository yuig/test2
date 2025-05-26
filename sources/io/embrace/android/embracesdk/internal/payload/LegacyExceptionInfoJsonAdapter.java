package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonDataException;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/LegacyExceptionInfoJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/LegacyExceptionInfo;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LegacyExceptionInfoJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73171a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73172b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73173c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73174d;

    public LegacyExceptionInfoJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("n", "m", "tt");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"n\", \"m\", \"tt\")");
        this.f73171a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "name");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f73172b = c13;
        r c14 = moshi.c(String.class, s0Var, "message");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl…   emptySet(), \"message\")");
        this.f73173c = c14;
        r c15 = moshi.c(a.Z(List.class, String.class), s0Var, "lines");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Types.newP…mptySet(),\n      \"lines\")");
        this.f73174d = c15;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        List list = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73171a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f73172b.a(reader);
                if (str == null) {
                    JsonDataException l13 = b.l("name", "n", reader);
                    Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"name\", \"n\", reader)");
                    throw l13;
                }
            } else if (k13 == 1) {
                str2 = (String) this.f73173c.a(reader);
            } else if (k13 == 2 && (list = (List) this.f73174d.a(reader)) == null) {
                JsonDataException l14 = b.l("lines", "tt", reader);
                Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"lines\",\n            \"tt\", reader)");
                throw l14;
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException f13 = b.f("name", "n", reader);
            Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"name\", \"n\", reader)");
            throw f13;
        }
        if (list != null) {
            return new LegacyExceptionInfo(str, str2, list);
        }
        JsonDataException f14 = b.f("lines", "tt", reader);
        Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"lines\", \"tt\", reader)");
        throw f14;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        LegacyExceptionInfo legacyExceptionInfo = (LegacyExceptionInfo) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (legacyExceptionInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("n");
        this.f73172b.d(writer, legacyExceptionInfo.f73168a);
        writer.f("m");
        this.f73173c.d(writer, legacyExceptionInfo.f73169b);
        writer.f("tt");
        this.f73174d.d(writer, legacyExceptionInfo.f73170c);
        writer.d();
    }

    public final String toString() {
        return f.f(41, "GeneratedJsonAdapter(LegacyExceptionInfo)", "toString(...)");
    }
}
