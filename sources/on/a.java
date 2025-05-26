package on;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import pq2.p;

/* loaded from: classes3.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final no2.a f96692a;

    /* renamed from: b, reason: collision with root package name */
    public final d f96693b;

    public a(no2.b loader, d serializer) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f96692a = loader;
        this.f96693b = serializer;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        ResponseBody body = (ResponseBody) obj;
        Intrinsics.checkNotNullParameter(body, "value");
        d dVar = this.f96693b;
        dVar.getClass();
        no2.a loader = this.f96692a;
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(body, "body");
        String string = body.string();
        Intrinsics.checkNotNullExpressionValue(string, "body.string()");
        return ((ro2.c) dVar.f96699a).a(loader, string);
    }
}
