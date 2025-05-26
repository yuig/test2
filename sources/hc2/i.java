package hc2;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f68756a;

    /* renamed from: b, reason: collision with root package name */
    public final ExoPlayer f68757b;

    /* renamed from: c, reason: collision with root package name */
    public final p f68758c;

    /* renamed from: d, reason: collision with root package name */
    public final b f68759d;

    /* renamed from: e, reason: collision with root package name */
    public final h f68760e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68761f;

    /* renamed from: g, reason: collision with root package name */
    public o f68762g;

    public i(c prefetchItem, ExoPlayer prefetchPlayer, p prefetchTracker, b callback) {
        Intrinsics.checkNotNullParameter(prefetchItem, "prefetchItem");
        Intrinsics.checkNotNullParameter(prefetchPlayer, "prefetchPlayer");
        Intrinsics.checkNotNullParameter(prefetchTracker, "prefetchTracker");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f68756a = prefetchItem;
        this.f68757b = prefetchPlayer;
        this.f68758c = prefetchTracker;
        this.f68759d = callback;
        h hVar = new h(this);
        this.f68760e = hVar;
        ((l0) prefetchPlayer).f0(hVar);
    }

    public final void a() {
        this.f68761f = true;
        ((l0) this.f68757b).u0(this.f68760e);
    }
}
