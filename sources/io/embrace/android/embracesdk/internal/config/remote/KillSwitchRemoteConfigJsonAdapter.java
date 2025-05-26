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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class KillSwitchRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73010a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73011b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73012c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73013d;

    public KillSwitchRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("sig_handler_detection", "jetpack_compose", "v2_storage", "use_okhttp");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"sig_handler_detectio…2_storage\", \"use_okhttp\")");
        this.f73010a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Boolean.class, s0Var, "sigHandlerDetection");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Boolean::c…), \"sigHandlerDetection\")");
        this.f73011b = c13;
        r c14 = moshi.c(Float.class, s0Var, "v2StoragePct");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Float::cla…ptySet(), \"v2StoragePct\")");
        this.f73012c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
        Boolean bool2 = null;
        Float f13 = null;
        Float f14 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73010a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                bool = (Boolean) this.f73011b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                bool2 = (Boolean) this.f73011b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                f13 = (Float) this.f73012c.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                f14 = (Float) this.f73012c.a(reader);
                i13 &= -9;
            }
        }
        reader.e();
        if (i13 == -16) {
            return new KillSwitchRemoteConfig(bool, bool2, f13, f14);
        }
        Constructor constructor = this.f73013d;
        if (constructor == null) {
            constructor = KillSwitchRemoteConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, Float.class, Float.class, Integer.TYPE, b.f100000c);
            this.f73013d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "KillSwitchRemoteConfig::…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(bool, bool2, f13, f14, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (KillSwitchRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        KillSwitchRemoteConfig killSwitchRemoteConfig = (KillSwitchRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (killSwitchRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("sig_handler_detection");
        r rVar = this.f73011b;
        rVar.d(writer, killSwitchRemoteConfig.f73006a);
        writer.f("jetpack_compose");
        rVar.d(writer, killSwitchRemoteConfig.f73007b);
        writer.f("v2_storage");
        r rVar2 = this.f73012c;
        rVar2.d(writer, killSwitchRemoteConfig.f73008c);
        writer.f("use_okhttp");
        rVar2.d(writer, killSwitchRemoteConfig.f73009d);
        writer.d();
    }

    public final String toString() {
        return f.f(44, "GeneratedJsonAdapter(KillSwitchRemoteConfig)", "toString(...)");
    }
}
