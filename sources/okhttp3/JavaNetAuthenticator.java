package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "<init>", "()V", "okhttp-urlconnection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class JavaNetAuthenticator implements Authenticator {
    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return Authenticator.f95492b.a(route, response);
    }
}
