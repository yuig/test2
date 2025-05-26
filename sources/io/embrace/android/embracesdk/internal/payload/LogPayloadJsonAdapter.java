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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/LogPayloadJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/LogPayload;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LogPayloadJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73189a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73190b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f73191c;

    public LogPayloadJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("logs");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"logs\")");
        this.f73189a = b13;
        r c13 = moshi.c(a.Z(List.class, Log.class), s0.f80394a, "logs");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Types.newP…emptySet(),\n      \"logs\")");
        this.f73190b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List list = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73189a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                list = (List) this.f73190b.a(reader);
                i13 = -2;
            }
        }
        reader.e();
        if (i13 == -2) {
            return new LogPayload(list);
        }
        Constructor constructor = this.f73191c;
        if (constructor == null) {
            constructor = LogPayload.class.getDeclaredConstructor(List.class, Integer.TYPE, b.f100000c);
            this.f73191c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "LogPayload::class.java.g…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(list, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (LogPayload) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        LogPayload logPayload = (LogPayload) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (logPayload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("logs");
        this.f73190b.d(writer, logPayload.f73188a);
        writer.d();
    }

    public final String toString() {
        return f.f(32, "GeneratedJsonAdapter(LogPayload)", "toString(...)");
    }
}
