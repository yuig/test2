package p00;

import kotlin.jvm.internal.Intrinsics;
import nm.o;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final o f98350a;

    public c(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f98350a = gson;
    }

    @Override // p00.d, pq2.p
    /* renamed from: b */
    public final RequestBody a(Object obj) {
        String k13 = this.f98350a.k(obj);
        RequestBody.Companion companion = RequestBody.f95711a;
        Intrinsics.f(k13);
        MediaType.f95651d.getClass();
        MediaType a13 = MediaType.Companion.a("application/json");
        companion.getClass();
        return RequestBody.Companion.a(k13, a13);
    }
}
