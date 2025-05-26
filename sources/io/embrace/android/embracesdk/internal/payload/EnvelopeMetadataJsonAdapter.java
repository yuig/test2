package io.embrace.android.embracesdk.internal.payload;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadataJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EnvelopeMetadataJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73125a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73126b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73127c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f73128d;

    public EnvelopeMetadataJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("user_id", "email", "username", "personas", "timezone_description", "locale");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"user_id\", \"email\", \"…e_description\", \"locale\")");
        this.f73125a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "userId");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…    emptySet(), \"userId\")");
        this.f73126b = c13;
        r c14 = moshi.c(a.Z(Set.class, String.class), s0Var, "personas");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…ySet(),\n      \"personas\")");
        this.f73127c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        int i13 = -1;
        String str2 = null;
        String str3 = null;
        Set set = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73125a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    str = (String) this.f73126b.a(reader);
                    i13 &= -2;
                    break;
                case 1:
                    str2 = (String) this.f73126b.a(reader);
                    i13 &= -3;
                    break;
                case 2:
                    str3 = (String) this.f73126b.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    set = (Set) this.f73127c.a(reader);
                    i13 &= -9;
                    break;
                case 4:
                    str4 = (String) this.f73126b.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str5 = (String) this.f73126b.a(reader);
                    i13 &= -33;
                    break;
            }
        }
        reader.e();
        if (i13 == -64) {
            return new EnvelopeMetadata(str, str2, str3, set, str4, str5);
        }
        Constructor constructor = this.f73128d;
        if (constructor == null) {
            constructor = EnvelopeMetadata.class.getDeclaredConstructor(String.class, String.class, String.class, Set.class, String.class, String.class, Integer.TYPE, b.f100000c);
            this.f73128d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "EnvelopeMetadata::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, set, str4, str5, Integer.valueOf(i13), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (EnvelopeMetadata) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        EnvelopeMetadata envelopeMetadata = (EnvelopeMetadata) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (envelopeMetadata == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("user_id");
        r rVar = this.f73126b;
        rVar.d(writer, envelopeMetadata.f73119a);
        writer.f("email");
        rVar.d(writer, envelopeMetadata.f73120b);
        writer.f("username");
        rVar.d(writer, envelopeMetadata.f73121c);
        writer.f("personas");
        this.f73127c.d(writer, envelopeMetadata.f73122d);
        writer.f("timezone_description");
        rVar.d(writer, envelopeMetadata.f73123e);
        writer.f("locale");
        rVar.d(writer, envelopeMetadata.f73124f);
        writer.d();
    }

    public final String toString() {
        return f.f(38, "GeneratedJsonAdapter(EnvelopeMetadata)", "toString(...)");
    }
}
