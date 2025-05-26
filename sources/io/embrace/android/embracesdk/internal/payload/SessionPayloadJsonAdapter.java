package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/SessionPayloadJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/SessionPayload;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionPayloadJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73236a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73237b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73238c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73239d;

    public SessionPayloadJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("spans", "span_snapshots", "shared_lib_symbol_mapping");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"spans\", \"span_snapsh…ared_lib_symbol_mapping\")");
        this.f73236a = b13;
        Util$ParameterizedTypeImpl Z = a.Z(List.class, Span.class);
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Z, s0Var, "spans");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Types.newP…mptySet(),\n      \"spans\")");
        this.f73237b = c13;
        r c14 = moshi.c(a.Z(Map.class, String.class, String.class), s0Var, "sharedLibSymbolMapping");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…\"sharedLibSymbolMapping\")");
        this.f73238c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List list = null;
        List list2 = null;
        Map map = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73236a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                list = (List) this.f73237b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                list2 = (List) this.f73237b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                map = (Map) this.f73238c.a(reader);
                i13 &= -5;
            }
        }
        reader.e();
        if (i13 == -8) {
            return new SessionPayload(list, list2, map);
        }
        Constructor constructor = this.f73239d;
        if (constructor == null) {
            constructor = SessionPayload.class.getDeclaredConstructor(List.class, List.class, Map.class, Integer.TYPE, b.f100000c);
            this.f73239d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "SessionPayload::class.ja…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, list2, map, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SessionPayload) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        SessionPayload sessionPayload = (SessionPayload) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (sessionPayload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("spans");
        r rVar = this.f73237b;
        rVar.d(writer, sessionPayload.f73233a);
        writer.f("span_snapshots");
        rVar.d(writer, sessionPayload.f73234b);
        writer.f("shared_lib_symbol_mapping");
        this.f73238c.d(writer, sessionPayload.f73235c);
        writer.d();
    }

    public final String toString() {
        return f.f(36, "GeneratedJsonAdapter(SessionPayload)", "toString(...)");
    }
}
