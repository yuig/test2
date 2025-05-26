package le;

import com.facebook.AuthenticationToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final com.bugsnag.android.a0 f83061d = new com.bugsnag.android.a0();

    /* renamed from: e, reason: collision with root package name */
    public static k f83062e;

    /* renamed from: a, reason: collision with root package name */
    public final z6.c f83063a;

    /* renamed from: b, reason: collision with root package name */
    public final i f83064b;

    /* renamed from: c, reason: collision with root package name */
    public AuthenticationToken f83065c;

    public k(z6.c localBroadcastManager, i authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.f83063a = localBroadcastManager;
        this.f83064b = authenticationTokenCache;
    }
}
