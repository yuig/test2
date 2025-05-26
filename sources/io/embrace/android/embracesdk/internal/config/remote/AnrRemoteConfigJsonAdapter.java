package io.embrace.android.embracesdk.internal.config.remote;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AnrRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72983a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72984b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72985c;

    /* renamed from: d, reason: collision with root package name */
    public final r f72986d;

    /* renamed from: e, reason: collision with root package name */
    public final r f72987e;

    /* renamed from: f, reason: collision with root package name */
    public final r f72988f;

    /* renamed from: g, reason: collision with root package name */
    public final r f72989g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Constructor f72990h;

    public AnrRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("pct_enabled", "interval", "per_interval", "max_depth", "per_session", "min_duration", "unity_ndk_sampling_factor", "unity_ndk_sampling_unwinder", "pct_unity_thread_capture_enabled", "ndk_sampling_offset_enabled", "ignore_unity_ndk_sampling_allowlist", "unity_ndk_sampling_allowlist", "monitor_thread_priority");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"pct_enabled\", \"inter…monitor_thread_priority\")");
        this.f72983a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Integer.class, s0Var, "pctEnabled");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class…emptySet(), \"pctEnabled\")");
        this.f72984b = c13;
        r c14 = moshi.c(Long.class, s0Var, "sampleIntervalMs");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Long::clas…et(), \"sampleIntervalMs\")");
        this.f72985c = c14;
        r c15 = moshi.c(String.class, s0Var, "nativeThreadAnrSamplingUnwinder");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…readAnrSamplingUnwinder\")");
        this.f72986d = c15;
        r c16 = moshi.c(Float.class, s0Var, "pctNativeThreadAnrSamplingEnabled");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Float::cla…hreadAnrSamplingEnabled\")");
        this.f72987e = c16;
        r c17 = moshi.c(Boolean.class, s0Var, "nativeThreadAnrSamplingOffsetEnabled");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Boolean::c…nrSamplingOffsetEnabled\")");
        this.f72988f = c17;
        r c18 = moshi.c(a.Z(List.class, AllowedNdkSampleMethod.class), s0Var, "nativeThreadAnrSamplingAllowlist");
        Intrinsics.checkNotNullExpressionValue(c18, "moshi.adapter(Types.newP…eadAnrSamplingAllowlist\")");
        this.f72989g = c18;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        int i13 = -1;
        Long l13 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str = null;
        Float f13 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        Integer num7 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f72983a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    num = (Integer) this.f72984b.a(reader);
                    i13 &= -2;
                    break;
                case 1:
                    l13 = (Long) this.f72985c.a(reader);
                    i13 &= -3;
                    break;
                case 2:
                    num2 = (Integer) this.f72984b.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    num3 = (Integer) this.f72984b.a(reader);
                    i13 &= -9;
                    break;
                case 4:
                    num4 = (Integer) this.f72984b.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    num5 = (Integer) this.f72984b.a(reader);
                    i13 &= -33;
                    break;
                case 6:
                    num6 = (Integer) this.f72984b.a(reader);
                    i13 &= -65;
                    break;
                case 7:
                    str = (String) this.f72986d.a(reader);
                    i13 &= -129;
                    break;
                case 8:
                    f13 = (Float) this.f72987e.a(reader);
                    i13 &= -257;
                    break;
                case 9:
                    bool = (Boolean) this.f72988f.a(reader);
                    i13 &= -513;
                    break;
                case 10:
                    bool2 = (Boolean) this.f72988f.a(reader);
                    i13 &= -1025;
                    break;
                case 11:
                    list = (List) this.f72989g.a(reader);
                    i13 &= -2049;
                    break;
                case 12:
                    num7 = (Integer) this.f72984b.a(reader);
                    i13 &= -4097;
                    break;
            }
        }
        reader.e();
        if (i13 == -8192) {
            return new AnrRemoteConfig(num, l13, num2, num3, num4, num5, num6, str, f13, bool, bool2, list, num7);
        }
        Constructor constructor = this.f72990h;
        if (constructor == null) {
            constructor = AnrRemoteConfig.class.getDeclaredConstructor(Integer.class, Long.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, Float.class, Boolean.class, Boolean.class, List.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f72990h = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "AnrRemoteConfig::class.j…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, l13, num2, num3, num4, num5, num6, str, f13, bool, bool2, list, num7, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (AnrRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        AnrRemoteConfig anrRemoteConfig = (AnrRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (anrRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("pct_enabled");
        r rVar = this.f72984b;
        rVar.d(writer, anrRemoteConfig.f72970a);
        writer.f("interval");
        this.f72985c.d(writer, anrRemoteConfig.f72971b);
        writer.f("per_interval");
        rVar.d(writer, anrRemoteConfig.f72972c);
        writer.f("max_depth");
        rVar.d(writer, anrRemoteConfig.f72973d);
        writer.f("per_session");
        rVar.d(writer, anrRemoteConfig.f72974e);
        writer.f("min_duration");
        rVar.d(writer, anrRemoteConfig.f72975f);
        writer.f("unity_ndk_sampling_factor");
        rVar.d(writer, anrRemoteConfig.f72976g);
        writer.f("unity_ndk_sampling_unwinder");
        this.f72986d.d(writer, anrRemoteConfig.f72977h);
        writer.f("pct_unity_thread_capture_enabled");
        this.f72987e.d(writer, anrRemoteConfig.f72978i);
        writer.f("ndk_sampling_offset_enabled");
        r rVar2 = this.f72988f;
        rVar2.d(writer, anrRemoteConfig.f72979j);
        writer.f("ignore_unity_ndk_sampling_allowlist");
        rVar2.d(writer, anrRemoteConfig.f72980k);
        writer.f("unity_ndk_sampling_allowlist");
        this.f72989g.d(writer, anrRemoteConfig.f72981l);
        writer.f("monitor_thread_priority");
        rVar.d(writer, anrRemoteConfig.f72982m);
        writer.d();
    }

    public final String toString() {
        return f.f(37, "GeneratedJsonAdapter(AnrRemoteConfig)", "toString(...)");
    }
}
