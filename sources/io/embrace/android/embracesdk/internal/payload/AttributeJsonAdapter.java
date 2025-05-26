package io.embrace.android.embracesdk.internal.payload;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/AttributeJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/Attribute;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AttributeJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73103a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73104b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f73105c;

    public AttributeJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("key", "value");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"key\", \"value\")");
        this.f73103a = b13;
        r c13 = moshi.c(String.class, s0.f80394a, "key");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…\n      emptySet(), \"key\")");
        this.f73104b = c13;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73103a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                str = (String) this.f73104b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                str2 = (String) this.f73104b.a(reader);
                i13 &= -3;
            }
        }
        reader.e();
        if (i13 == -4) {
            return new Attribute(str, str2);
        }
        Constructor constructor = this.f73105c;
        if (constructor == null) {
            constructor = Attribute.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, b.f100000c);
            this.f73105c = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "Attribute::class.java.ge…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Attribute) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        Attribute attribute = (Attribute) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (attribute == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("key");
        r rVar = this.f73104b;
        rVar.d(writer, attribute.f73101a);
        writer.f("value");
        rVar.d(writer, attribute.f73102b);
        writer.d();
    }

    public final String toString() {
        return f.f(31, "GeneratedJsonAdapter(Attribute)", "toString(...)");
    }
}
