package j81;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tb0.p;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f74940i = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        hVar.h("RetrofitPagedRemoteRequest error: " + th3 + ". This has also been logged as a non-fatal exception.");
        hVar.q(th3, "RetrofitPagedRemoteRequest error", p.PLATFORM);
        return Unit.f80348a;
    }
}
