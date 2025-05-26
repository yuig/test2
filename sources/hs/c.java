package hs;

import android.util.LruCache;
import ao2.e2;
import ao2.f0;
import ao2.j0;
import ao2.k2;
import ao2.o1;
import ao2.v0;
import ho2.q;
import java.util.concurrent.CancellationException;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f70024a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f70025b;

    /* renamed from: c, reason: collision with root package name */
    public final LruCache f70026c;

    /* renamed from: d, reason: collision with root package name */
    public final LruCache f70027d;

    public c(j0 scope) {
        f fVar = v0.f20219a;
        e2 dispatcher = q.f69782a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f70024a = scope;
        this.f70025b = dispatcher;
        this.f70026c = new LruCache(20);
        this.f70027d = new LruCache(20);
    }

    public final Object a(String str) {
        LruCache lruCache = this.f70027d;
        if (str == null) {
            return null;
        }
        return lruCache.get(str);
    }

    public final void b(long j13, String str) {
        Boolean bool = Boolean.FALSE;
        if (str != null) {
            LruCache lruCache = this.f70026c;
            o1 o1Var = (o1) lruCache.get(str);
            if (o1Var == null || !o1Var.isActive()) {
                o1 o1Var2 = (o1) lruCache.get(str);
                if (o1Var2 != null) {
                    o1Var2.cancel((CancellationException) null);
                }
                k2 z13 = j.z(this.f70024a, this.f70025b, null, new b(j13, this, str, bool, null), 2);
                lruCache.put(str, z13);
                z13.invokeOnCompletion(new a(0, this, str));
            }
        }
    }
}
