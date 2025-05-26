package io.embrace.android.embracesdk.internal.comms.delivery;

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
import pg2.s;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCallsJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCalls;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PendingApiCallsJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72962a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72963b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f72964c;

    public PendingApiCallsJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("pendingApiCallsMap");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"pendingApiCallsMap\")");
        this.f72962a = b13;
        r c13 = moshi.c(a.Z(Map.class, s.class, a.Z(List.class, PendingApiCall.class)), s0.f80394a, "pendingApiCallsMap");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Types.newP…    \"pendingApiCallsMap\")");
        this.f72963b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Map map = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72962a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                map = (Map) this.f72963b.a(reader);
                if (map == null) {
                    JsonDataException l13 = b.l("pendingApiCallsMap", "pendingApiCallsMap", reader);
                    Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"pendingA…dingApiCallsMap\", reader)");
                    throw l13;
                }
                i13 = -2;
            } else {
                continue;
            }
        }
        reader.e();
        if (i13 == -2) {
            Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<io.embrace.android.embracesdk.internal.comms.api.Endpoint, kotlin.collections.MutableList<io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall>>");
            return new PendingApiCalls(map);
        }
        Constructor constructor = this.f72964c;
        if (constructor == null) {
            constructor = PendingApiCalls.class.getDeclaredConstructor(Map.class, Integer.TYPE, b.f100000c);
            this.f72964c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "PendingApiCalls::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(map, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (PendingApiCalls) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        PendingApiCalls pendingApiCalls = (PendingApiCalls) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (pendingApiCalls == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("pendingApiCallsMap");
        this.f72963b.d(writer, pendingApiCalls.f72961a);
        writer.d();
    }

    public final String toString() {
        return f.f(37, "GeneratedJsonAdapter(PendingApiCalls)", "toString(...)");
    }
}
