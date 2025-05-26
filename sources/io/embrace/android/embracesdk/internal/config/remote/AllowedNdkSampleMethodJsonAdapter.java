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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AllowedNdkSampleMethodJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/AllowedNdkSampleMethod;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AllowedNdkSampleMethodJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72967a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72968b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f72969c;

    public AllowedNdkSampleMethodJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("c", "m");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"c\", \"m\")");
        this.f72967a = b13;
        r c13 = moshi.c(String.class, s0.f80394a, "clz");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…\n      emptySet(), \"clz\")");
        this.f72968b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72967a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f72968b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                str2 = (String) this.f72968b.a(reader);
                i13 &= -3;
            }
        }
        reader.e();
        if (i13 == -4) {
            return new AllowedNdkSampleMethod(str, str2);
        }
        Constructor constructor = this.f72969c;
        if (constructor == null) {
            constructor = AllowedNdkSampleMethod.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, b.f100000c);
            this.f72969c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "AllowedNdkSampleMethod::…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (AllowedNdkSampleMethod) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        AllowedNdkSampleMethod allowedNdkSampleMethod = (AllowedNdkSampleMethod) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (allowedNdkSampleMethod == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("c");
        r rVar = this.f72968b;
        rVar.d(writer, allowedNdkSampleMethod.f72965a);
        writer.f("m");
        rVar.d(writer, allowedNdkSampleMethod.f72966b);
        writer.d();
    }

    public final String toString() {
        return f.f(44, "GeneratedJsonAdapter(AllowedNdkSampleMethod)", "toString(...)");
    }
}
