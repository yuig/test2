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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DataRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73003a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73004b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f73005c;

    public DataRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("pct_thermal_status_enabled");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"pct_thermal_status_enabled\")");
        this.f73003a = b13;
        r c13 = moshi.c(Float.class, s0.f80394a, "pctThermalStatusEnabled");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Float::cla…pctThermalStatusEnabled\")");
        this.f73004b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Float f13 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73003a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                f13 = (Float) this.f73004b.a(reader);
                i13 = -2;
            }
        }
        reader.e();
        if (i13 == -2) {
            return new DataRemoteConfig(f13);
        }
        Constructor constructor = this.f73005c;
        if (constructor == null) {
            constructor = DataRemoteConfig.class.getDeclaredConstructor(Float.class, Integer.TYPE, b.f100000c);
            this.f73005c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "DataRemoteConfig::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(f13, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (DataRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        DataRemoteConfig dataRemoteConfig = (DataRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (dataRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("pct_thermal_status_enabled");
        this.f73004b.d(writer, dataRemoteConfig.f73002a);
        writer.d();
    }

    public final String toString() {
        return f.f(38, "GeneratedJsonAdapter(DataRemoteConfig)", "toString(...)");
    }
}
