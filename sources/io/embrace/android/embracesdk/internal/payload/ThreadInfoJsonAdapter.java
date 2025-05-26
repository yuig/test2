package io.embrace.android.embracesdk.internal.payload;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import com.squareup.moshi.JsonDataException;
import java.lang.Thread;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/ThreadInfoJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/ThreadInfo;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ThreadInfoJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73270a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73271b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73272c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73273d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73274e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73275f;

    public ThreadInfoJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("threadId", AnimatedTarget.PROPERTY_STATE, "n", "p", "tt", "fc");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"threadId\", \"state\", …\", \"p\",\n      \"tt\", \"fc\")");
        this.f73270a = b13;
        Class cls = Long.TYPE;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(cls, s0Var, "threadId");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Long::clas…ySet(),\n      \"threadId\")");
        this.f73271b = c13;
        r c14 = moshi.c(Thread.State.class, s0Var, AnimatedTarget.PROPERTY_STATE);
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Thread.Sta…ava, emptySet(), \"state\")");
        this.f73272c = c14;
        r c15 = moshi.c(String.class, s0Var, "name");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.f73273d = c15;
        r c16 = moshi.c(Integer.TYPE, s0Var, "priority");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Int::class…, emptySet(), \"priority\")");
        this.f73274e = c16;
        r c17 = moshi.c(a.Z(List.class, String.class), s0Var, "lines");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Types.newP…mptySet(),\n      \"lines\")");
        this.f73275f = c17;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l13 = null;
        Integer num = null;
        Integer num2 = null;
        Thread.State state = null;
        String str = null;
        List list = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73270a);
            r rVar = this.f73274e;
            switch (k13) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    l13 = (Long) this.f73271b.a(reader);
                    if (l13 == null) {
                        JsonDataException l14 = b.l("threadId", "threadId", reader);
                        Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"threadId…      \"threadId\", reader)");
                        throw l14;
                    }
                    break;
                case 1:
                    state = (Thread.State) this.f73272c.a(reader);
                    break;
                case 2:
                    str = (String) this.f73273d.a(reader);
                    break;
                case 3:
                    num = (Integer) rVar.a(reader);
                    if (num == null) {
                        JsonDataException l15 = b.l("priority", "p", reader);
                        Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"priority… \"p\",\n            reader)");
                        throw l15;
                    }
                    break;
                case 4:
                    list = (List) this.f73275f.a(reader);
                    break;
                case 5:
                    num2 = (Integer) rVar.a(reader);
                    if (num2 == null) {
                        JsonDataException l16 = b.l("frameCount", "fc", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"frameCou…            \"fc\", reader)");
                        throw l16;
                    }
                    break;
            }
        }
        reader.e();
        if (l13 == null) {
            JsonDataException f13 = b.f("threadId", "threadId", reader);
            Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"threadId\", \"threadId\", reader)");
            throw f13;
        }
        long longValue = l13.longValue();
        if (num == null) {
            JsonDataException f14 = b.f("priority", "p", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"priority\", \"p\", reader)");
            throw f14;
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new ThreadInfo(longValue, state, str, intValue, list, num2.intValue());
        }
        JsonDataException f15 = b.f("frameCount", "fc", reader);
        Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"frameCount\", \"fc\", reader)");
        throw f15;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        ThreadInfo threadInfo = (ThreadInfo) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (threadInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("threadId");
        this.f73271b.d(writer, Long.valueOf(threadInfo.f73264a));
        writer.f(AnimatedTarget.PROPERTY_STATE);
        this.f73272c.d(writer, threadInfo.f73265b);
        writer.f("n");
        this.f73273d.d(writer, threadInfo.f73266c);
        writer.f("p");
        Integer valueOf = Integer.valueOf(threadInfo.f73267d);
        r rVar = this.f73274e;
        rVar.d(writer, valueOf);
        writer.f("tt");
        this.f73275f.d(writer, threadInfo.f73268e);
        writer.f("fc");
        rVar.d(writer, Integer.valueOf(threadInfo.f73269f));
        writer.d();
    }

    public final String toString() {
        return f.f(32, "GeneratedJsonAdapter(ThreadInfo)", "toString(...)");
    }
}
