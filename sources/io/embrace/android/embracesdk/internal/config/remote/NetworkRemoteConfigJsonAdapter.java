package io.embrace.android.embracesdk.internal.config.remote;

import java.lang.reflect.Constructor;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NetworkRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73038a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73039b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73040c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73041d;

    public NetworkRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("defaultCaptureLimit", "domains");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"defaultCaptureLimit\", \"domains\")");
        this.f73038a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Integer.class, s0Var, "defaultCaptureLimit");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class…), \"defaultCaptureLimit\")");
        this.f73039b = c13;
        r c14 = moshi.c(a.Z(Map.class, String.class, Integer.class), s0Var, "domainLimits");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…ptySet(), \"domainLimits\")");
        this.f73040c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Map map = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73038a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                num = (Integer) this.f73039b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                map = (Map) this.f73040c.a(reader);
                i13 &= -3;
            }
        }
        reader.e();
        if (i13 == -4) {
            return new NetworkRemoteConfig(num, map);
        }
        Constructor constructor = this.f73041d;
        if (constructor == null) {
            constructor = NetworkRemoteConfig.class.getDeclaredConstructor(Integer.class, Map.class, Integer.TYPE, b.f100000c);
            this.f73041d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "NetworkRemoteConfig::cla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, map, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (NetworkRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NetworkRemoteConfig networkRemoteConfig = (NetworkRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (networkRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("defaultCaptureLimit");
        this.f73039b.d(writer, networkRemoteConfig.f73036a);
        writer.f("domains");
        this.f73040c.d(writer, networkRemoteConfig.f73037b);
        writer.d();
    }

    public final String toString() {
        return f.f(41, "GeneratedJsonAdapter(NetworkRemoteConfig)", "toString(...)");
    }
}
