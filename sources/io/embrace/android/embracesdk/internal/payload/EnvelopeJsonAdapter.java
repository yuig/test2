package io.embrace.android.embracesdk.internal.payload;

import com.google.android.gms.ads.RequestConfiguration;
import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeJsonAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/Envelope;", "Loe2/h0;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Loe2/h0;[Ljava/lang/reflect/Type;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EnvelopeJsonAdapter<T> extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73113a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73114b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73115c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73116d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73117e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Constructor f73118f;

    public EnvelopeJsonAdapter(@NotNull h0 moshi, @NotNull Type[] types) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(types, "types");
        if (types.length != 1) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length;
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            throw new IllegalArgumentException(str.toString());
        }
        k b13 = k.b("resource", "metadata", "version", "type", "data");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"resource\", \"metadata…n\",\n      \"type\", \"data\")");
        this.f73113a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(EnvelopeResource.class, s0Var, "resource");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(EnvelopeRe…, emptySet(), \"resource\")");
        this.f73114b = c13;
        r c14 = moshi.c(EnvelopeMetadata.class, s0Var, "metadata");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(EnvelopeMe…, emptySet(), \"metadata\")");
        this.f73115c = c14;
        r c15 = moshi.c(String.class, s0Var, "version");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…   emptySet(), \"version\")");
        this.f73116d = c15;
        r c16 = moshi.c(types[0], s0Var, "data");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(types[0], emptySet(), \"data\")");
        this.f73117e = c16;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        EnvelopeResource envelopeResource = null;
        EnvelopeMetadata envelopeMetadata = null;
        String str = null;
        String str2 = null;
        Object obj = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f73113a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                envelopeResource = (EnvelopeResource) this.f73114b.a(reader);
                i13 &= -2;
            } else if (k13 == 1) {
                envelopeMetadata = (EnvelopeMetadata) this.f73115c.a(reader);
                i13 &= -3;
            } else if (k13 == 2) {
                str = (String) this.f73116d.a(reader);
                i13 &= -5;
            } else if (k13 == 3) {
                str2 = (String) this.f73116d.a(reader);
                i13 &= -9;
            } else if (k13 == 4 && (obj = this.f73117e.a(reader)) == null) {
                JsonDataException l13 = b.l("data_", "data", reader);
                Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"data_\",\n…          \"data\", reader)");
                throw l13;
            }
        }
        reader.e();
        if (i13 == -16) {
            if (obj != null) {
                return new Envelope(envelopeResource, envelopeMetadata, str, str2, obj);
            }
            JsonDataException f13 = b.f("data_", "data", reader);
            Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"data_\", \"data\", reader)");
            throw f13;
        }
        Constructor constructor = this.f73118f;
        if (constructor == null) {
            constructor = Envelope.class.getDeclaredConstructor(EnvelopeResource.class, EnvelopeMetadata.class, String.class, String.class, Object.class, Integer.TYPE, b.f100000c);
            Intrinsics.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<io.embrace.android.embracesdk.internal.payload.Envelope<T of io.embrace.android.embracesdk.internal.payload.EnvelopeJsonAdapter>>");
            this.f73118f = constructor;
        }
        Object[] objArr = new Object[7];
        objArr[0] = envelopeResource;
        objArr[1] = envelopeMetadata;
        objArr[2] = str;
        objArr[3] = str2;
        if (obj == null) {
            JsonDataException f14 = b.f("data_", "data", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"data_\", \"data\", reader)");
            throw f14;
        }
        objArr[4] = obj;
        objArr[5] = Integer.valueOf(i13);
        objArr[6] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Envelope) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        Envelope envelope = (Envelope) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (envelope == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("resource");
        this.f73114b.d(writer, envelope.f73108a);
        writer.f("metadata");
        this.f73115c.d(writer, envelope.f73109b);
        writer.f("version");
        r rVar = this.f73116d;
        rVar.d(writer, envelope.f73110c);
        writer.f("type");
        rVar.d(writer, envelope.f73111d);
        writer.f("data");
        this.f73117e.d(writer, envelope.f73112e);
        writer.d();
    }

    public final String toString() {
        return f.f(30, "GeneratedJsonAdapter(Envelope)", "toString(...)");
    }
}
