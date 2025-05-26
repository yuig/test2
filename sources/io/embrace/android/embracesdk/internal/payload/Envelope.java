package io.embrace.android.embracesdk.internal.payload;

import com.google.android.gms.ads.RequestConfiguration;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import kg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fBA\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/Envelope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;", "resource", "Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "metadata", "", "version", "type", "data", "copy", "(Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/embrace/android/embracesdk/internal/payload/Envelope;", "<init>", "(Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "org/chromium/net/y", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class Envelope<T> {

    /* renamed from: f */
    public static final Util$ParameterizedTypeImpl f73106f;

    /* renamed from: g */
    public static final Util$ParameterizedTypeImpl f73107g;

    /* renamed from: a */
    public final EnvelopeResource f73108a;

    /* renamed from: b */
    public final EnvelopeMetadata f73109b;

    /* renamed from: c */
    public final String f73110c;

    /* renamed from: d */
    public final String f73111d;

    /* renamed from: e */
    public final Object f73112e;

    static {
        Util$ParameterizedTypeImpl Z = a.Z(Envelope.class, SessionPayload.class);
        Intrinsics.checkNotNullExpressionValue(Z, "newParameterizedType(Env…ssionPayload::class.java)");
        f73106f = Z;
        Util$ParameterizedTypeImpl Z2 = a.Z(Envelope.class, LogPayload.class);
        Intrinsics.checkNotNullExpressionValue(Z2, "newParameterizedType(Env…, LogPayload::class.java)");
        f73107g = Z2;
    }

    public Envelope(@p(name = "resource") EnvelopeResource envelopeResource, @p(name = "metadata") EnvelopeMetadata envelopeMetadata, @p(name = "version") String str, @p(name = "type") String str2, @p(name = "data") T t13) {
        this.f73108a = envelopeResource;
        this.f73109b = envelopeMetadata;
        this.f73110c = str;
        this.f73111d = str2;
        this.f73112e = t13;
    }

    public static /* synthetic */ Envelope a(Envelope envelope, EnvelopeMetadata envelopeMetadata, Object obj, int i13) {
        EnvelopeResource envelopeResource = envelope.f73108a;
        if ((i13 & 2) != 0) {
            envelopeMetadata = envelope.f73109b;
        }
        return envelope.copy(envelopeResource, envelopeMetadata, envelope.f73110c, envelope.f73111d, obj);
    }

    @NotNull
    public final Envelope<T> copy(@p(name = "resource") EnvelopeResource resource, @p(name = "metadata") EnvelopeMetadata metadata, @p(name = "version") String version, @p(name = "type") String type, @p(name = "data") T data) {
        return new Envelope<>(resource, metadata, version, type, data);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Envelope)) {
            return false;
        }
        Envelope envelope = (Envelope) obj;
        return Intrinsics.d(this.f73108a, envelope.f73108a) && Intrinsics.d(this.f73109b, envelope.f73109b) && Intrinsics.d(this.f73110c, envelope.f73110c) && Intrinsics.d(this.f73111d, envelope.f73111d) && Intrinsics.d(this.f73112e, envelope.f73112e);
    }

    public final int hashCode() {
        EnvelopeResource envelopeResource = this.f73108a;
        int hashCode = (envelopeResource == null ? 0 : envelopeResource.hashCode()) * 31;
        EnvelopeMetadata envelopeMetadata = this.f73109b;
        int hashCode2 = (hashCode + (envelopeMetadata == null ? 0 : envelopeMetadata.hashCode())) * 31;
        String str = this.f73110c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73111d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.f73112e;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "Envelope(resource=" + this.f73108a + ", metadata=" + this.f73109b + ", version=" + this.f73110c + ", type=" + this.f73111d + ", data=" + this.f73112e + ')';
    }

    public /* synthetic */ Envelope(EnvelopeResource envelopeResource, EnvelopeMetadata envelopeMetadata, String str, String str2, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : envelopeResource, (i13 & 2) != 0 ? null : envelopeMetadata, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, obj);
    }
}
