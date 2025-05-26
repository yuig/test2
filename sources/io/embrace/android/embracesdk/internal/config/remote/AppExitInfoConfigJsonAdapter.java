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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AppExitInfoConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72994a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72995b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72996c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f72997d;

    public AppExitInfoConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("app_exit_info_traces_limit", "pct_aei_enabled_v2", "aei_max_num");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"app_exit_info_traces…abled_v2\", \"aei_max_num\")");
        this.f72994a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Integer.class, s0Var, "appExitInfoTracesLimit");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class…\"appExitInfoTracesLimit\")");
        this.f72995b = c13;
        r c14 = moshi.c(Float.class, s0Var, "pctAeiCaptureEnabled");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Float::cla…, \"pctAeiCaptureEnabled\")");
        this.f72996c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Float f13 = null;
        Integer num2 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72994a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                num = (Integer) this.f72995b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                f13 = (Float) this.f72996c.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                num2 = (Integer) this.f72995b.a(reader);
                i13 &= -5;
            }
        }
        reader.e();
        if (i13 == -8) {
            return new AppExitInfoConfig(num, f13, num2);
        }
        Constructor constructor = this.f72997d;
        if (constructor == null) {
            constructor = AppExitInfoConfig.class.getDeclaredConstructor(Integer.class, Float.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f72997d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "AppExitInfoConfig::class…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, f13, num2, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (AppExitInfoConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        AppExitInfoConfig appExitInfoConfig = (AppExitInfoConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (appExitInfoConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("app_exit_info_traces_limit");
        r rVar = this.f72995b;
        rVar.d(writer, appExitInfoConfig.f72991a);
        writer.f("pct_aei_enabled_v2");
        this.f72996c.d(writer, appExitInfoConfig.f72992b);
        writer.f("aei_max_num");
        rVar.d(writer, appExitInfoConfig.f72993c);
        writer.d();
    }

    public final String toString() {
        return f.f(39, "GeneratedJsonAdapter(AppExitInfoConfig)", "toString(...)");
    }
}
