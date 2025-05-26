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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeSymbolsJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/NativeSymbols;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NativeSymbolsJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73203a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73204b;

    public NativeSymbolsJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("symbols");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"symbols\")");
        this.f73203a = b13;
        r c13 = moshi.c(a.Z(Map.class, String.class, a.Z(Map.class, String.class, String.class)), s0.f80394a, "symbols");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Types.newP…   emptySet(), \"symbols\")");
        this.f73204b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Map map = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73203a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0 && (map = (Map) this.f73204b.a(reader)) == null) {
                JsonDataException l13 = b.l("symbols", "symbols", reader);
                Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"symbols\", \"symbols\", reader)");
                throw l13;
            }
        }
        reader.e();
        if (map != null) {
            return new NativeSymbols(map);
        }
        JsonDataException f13 = b.f("symbols", "symbols", reader);
        Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"symbols\", \"symbols\", reader)");
        throw f13;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NativeSymbols nativeSymbols = (NativeSymbols) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (nativeSymbols == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("symbols");
        this.f73204b.d(writer, nativeSymbols.f73202a);
        writer.d();
    }

    public final String toString() {
        return f.f(35, "GeneratedJsonAdapter(NativeSymbols)", "toString(...)");
    }
}
