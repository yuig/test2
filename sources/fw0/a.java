package fw0;

import com.pinterest.hairball.network.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f63040a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63041b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f63043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String url, String str, String str2) {
        super(bVar, url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f63043d = bVar;
        this.f63040a = url;
        this.f63041b = str;
        this.f63042c = str2;
    }

    @Override // com.pinterest.hairball.network.c
    public final Object buildRequest() {
        return this.f63043d.f63044a.a(this.f63040a, this.f63041b, this.f63042c);
    }
}
