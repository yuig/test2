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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LogRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73018a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73019b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f73020c;

    public LogRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("max_length", "info_limit", "warn_limit", "error_limit");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"max_length\", \"info_l…rn_limit\", \"error_limit\")");
        this.f73018a = b13;
        r c13 = moshi.c(Integer.class, s0.f80394a, "logMessageMaximumAllowedLength");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class…ageMaximumAllowedLength\")");
        this.f73019b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73018a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                num = (Integer) this.f73019b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                num2 = (Integer) this.f73019b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                num3 = (Integer) this.f73019b.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                num4 = (Integer) this.f73019b.a(reader);
                i13 &= -9;
            }
        }
        reader.e();
        if (i13 == -16) {
            return new LogRemoteConfig(num, num2, num3, num4);
        }
        Constructor constructor = this.f73020c;
        if (constructor == null) {
            constructor = LogRemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f73020c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "LogRemoteConfig::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, num2, num3, num4, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (LogRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        LogRemoteConfig logRemoteConfig = (LogRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (logRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("max_length");
        r rVar = this.f73019b;
        rVar.d(writer, logRemoteConfig.f73014a);
        writer.f("info_limit");
        rVar.d(writer, logRemoteConfig.f73015b);
        writer.f("warn_limit");
        rVar.d(writer, logRemoteConfig.f73016c);
        writer.f("error_limit");
        rVar.d(writer, logRemoteConfig.f73017d);
        writer.d();
    }

    public final String toString() {
        return f.f(37, "GeneratedJsonAdapter(LogRemoteConfig)", "toString(...)");
    }
}
