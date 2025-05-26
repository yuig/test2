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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UiRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73092a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73093b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f73094c;

    public UiRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("breadcrumbs", "taps", "web_views", "fragments");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"breadcrumbs\", \"taps\"…\"web_views\", \"fragments\")");
        this.f73092a = b13;
        r c13 = moshi.c(Integer.class, s0.f80394a, "breadcrumbs");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class…mptySet(), \"breadcrumbs\")");
        this.f73093b = c13;
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
            int k13 = reader.k(this.f73092a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                num = (Integer) this.f73093b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                num2 = (Integer) this.f73093b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                num3 = (Integer) this.f73093b.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                num4 = (Integer) this.f73093b.a(reader);
                i13 &= -9;
            }
        }
        reader.e();
        if (i13 == -16) {
            return new UiRemoteConfig(num, num2, num3, num4);
        }
        Constructor constructor = this.f73094c;
        if (constructor == null) {
            constructor = UiRemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f73094c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "UiRemoteConfig::class.ja…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, num2, num3, num4, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (UiRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        UiRemoteConfig uiRemoteConfig = (UiRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (uiRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("breadcrumbs");
        r rVar = this.f73093b;
        rVar.d(writer, uiRemoteConfig.f73088a);
        writer.f("taps");
        rVar.d(writer, uiRemoteConfig.f73089b);
        writer.f("web_views");
        rVar.d(writer, uiRemoteConfig.f73090c);
        writer.f("fragments");
        rVar.d(writer, uiRemoteConfig.f73091d);
        writer.d();
    }

    public final String toString() {
        return f.f(36, "GeneratedJsonAdapter(UiRemoteConfig)", "toString(...)");
    }
}
