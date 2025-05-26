package qz;

import ey.j1;
import ey.u2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class a0 extends wo2.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f105365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Response f105367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, String str, Response response, wo2.l lVar) {
        super(lVar);
        this.f105365b = b0Var;
        this.f105366c = str;
        this.f105367d = response;
    }

    @Override // wo2.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f105365b.getClass();
        if (j1.f60506c) {
            boolean z13 = this.f105367d.f95728i != null;
            String url = this.f105366c;
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.E(url, "pinimg.com", false)) {
                new u2(url, z13).i();
            }
        }
    }
}
