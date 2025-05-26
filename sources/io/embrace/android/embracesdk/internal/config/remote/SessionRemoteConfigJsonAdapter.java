package io.embrace.android.embracesdk.internal.config.remote;

import java.lang.reflect.Constructor;
import java.util.Set;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73084a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73085b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73086c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73087d;

    public SessionRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("enable", "components", "send_full_for");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"enable\", \"components\",\n      \"send_full_for\")");
        this.f73084a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Boolean.class, s0Var, "isEnabled");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Boolean::c… emptySet(), \"isEnabled\")");
        this.f73085b = c13;
        r c14 = moshi.c(a.Z(Set.class, String.class), s0Var, "sessionComponents");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…     \"sessionComponents\")");
        this.f73086c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
        Set set = null;
        Set set2 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73084a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                bool = (Boolean) this.f73085b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                set = (Set) this.f73086c.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                set2 = (Set) this.f73086c.a(reader);
                i13 &= -5;
            }
        }
        reader.e();
        if (i13 == -8) {
            return new SessionRemoteConfig(bool, set, set2);
        }
        Constructor constructor = this.f73087d;
        if (constructor == null) {
            constructor = SessionRemoteConfig.class.getDeclaredConstructor(Boolean.class, Set.class, Set.class, Integer.TYPE, b.f100000c);
            this.f73087d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "SessionRemoteConfig::cla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(bool, set, set2, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (SessionRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        SessionRemoteConfig sessionRemoteConfig = (SessionRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (sessionRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("enable");
        this.f73085b.d(writer, sessionRemoteConfig.f73081a);
        writer.f("components");
        r rVar = this.f73086c;
        rVar.d(writer, sessionRemoteConfig.f73082b);
        writer.f("send_full_for");
        rVar.d(writer, sessionRemoteConfig.f73083c);
        writer.d();
    }

    public final String toString() {
        return f.f(41, "GeneratedJsonAdapter(SessionRemoteConfig)", "toString(...)");
    }
}
