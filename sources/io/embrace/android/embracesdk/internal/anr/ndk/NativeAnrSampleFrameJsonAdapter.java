package io.embrace.android.embracesdk.internal.anr.ndk;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/anr/ndk/NativeAnrSampleFrameJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/anr/ndk/NativeAnrSampleFrame;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NativeAnrSampleFrameJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72919a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72920b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72921c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f72922d;

    public NativeAnrSampleFrameJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("program_counter", "so_load_addr", "so_name", "result");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"program_counter\", \"s…     \"so_name\", \"result\")");
        this.f72919a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "programCounter");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…ySet(), \"programCounter\")");
        this.f72920b = c13;
        r c14 = moshi.c(Integer.class, s0Var, "result");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Int::class…    emptySet(), \"result\")");
        this.f72921c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72919a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f72920b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                str2 = (String) this.f72920b.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                str3 = (String) this.f72920b.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                num = (Integer) this.f72921c.a(reader);
                i13 &= -9;
            }
        }
        reader.e();
        if (i13 == -16) {
            return new NativeAnrSampleFrame(str, str2, str3, num);
        }
        Constructor constructor = this.f72922d;
        if (constructor == null) {
            constructor = NativeAnrSampleFrame.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f72922d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "NativeAnrSampleFrame::cl…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, num, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (NativeAnrSampleFrame) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NativeAnrSampleFrame nativeAnrSampleFrame = (NativeAnrSampleFrame) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (nativeAnrSampleFrame == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("program_counter");
        r rVar = this.f72920b;
        rVar.d(writer, nativeAnrSampleFrame.f72915a);
        writer.f("so_load_addr");
        rVar.d(writer, nativeAnrSampleFrame.f72916b);
        writer.f("so_name");
        rVar.d(writer, nativeAnrSampleFrame.f72917c);
        writer.f("result");
        this.f72921c.d(writer, nativeAnrSampleFrame.f72918d);
        writer.d();
    }

    public final String toString() {
        return f.f(42, "GeneratedJsonAdapter(NativeAnrSampleFrame)", "toString(...)");
    }
}
