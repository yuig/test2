package d10;

import android.content.ContextWrapper;
import do2.i;
import do2.j0;
import e10.j;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class g implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    public final c10.d f53611a;

    /* renamed from: b, reason: collision with root package name */
    public final o00.a f53612b;

    /* renamed from: c, reason: collision with root package name */
    public final j f53613c;

    public g(ContextWrapper context, c10.d graphQLOnFailureRouter, o00.a coroutineDispatcherProvider, j logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(graphQLOnFailureRouter, "graphQLOnFailureRouter");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f53611a = graphQLOnFailureRouter;
        this.f53612b = coroutineDispatcherProvider;
        this.f53613c = logger;
    }

    @Override // ad.a
    public final i a(pc.f request, ad.b chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        return new j0(l0.Q0(new e(this, null), chain.a(request)), new f(request, this, null));
    }
}
