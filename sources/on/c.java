package on;

import kotlin.jvm.internal.Intrinsics;
import no2.h;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import pq2.p;

/* loaded from: classes3.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f96696a;

    /* renamed from: b, reason: collision with root package name */
    public final h f96697b;

    /* renamed from: c, reason: collision with root package name */
    public final d f96698c;

    public c(MediaType contentType, no2.b saver, d serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f96696a = contentType;
        this.f96697b = saver;
        this.f96698c = serializer;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        d dVar = this.f96698c;
        dVar.getClass();
        MediaType contentType = this.f96696a;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        h saver = this.f96697b;
        Intrinsics.checkNotNullParameter(saver, "saver");
        String content = ((ro2.c) dVar.f96699a).b(saver, obj);
        RequestBody.f95711a.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        RequestBody$Companion$toRequestBody$2 a13 = RequestBody.Companion.a(content, contentType);
        Intrinsics.checkNotNullExpressionValue(a13, "create(contentType, string)");
        return a13;
    }
}
