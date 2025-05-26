package xk2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class c extends b implements bl2.c {

    /* renamed from: a, reason: collision with root package name */
    public kl2.l f135202a;

    /* renamed from: b, reason: collision with root package name */
    public Object f135203b;

    /* renamed from: c, reason: collision with root package name */
    public bl2.c f135204c;

    /* renamed from: d, reason: collision with root package name */
    public Object f135205d;

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.j.f80412a;
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        this.f135204c = null;
        this.f135205d = obj;
    }
}
