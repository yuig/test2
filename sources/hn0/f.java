package hn0;

import android.media.MediaCodec;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f69622r;

    /* renamed from: s, reason: collision with root package name */
    public MediaCodec f69623s;

    /* renamed from: t, reason: collision with root package name */
    public int f69624t;

    /* renamed from: u, reason: collision with root package name */
    public long f69625u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f69626v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f69627w;

    /* renamed from: x, reason: collision with root package name */
    public int f69628x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(cVar);
        this.f69627w = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f69626v = obj;
        this.f69628x |= Integer.MIN_VALUE;
        return this.f69627w.c(null, 0, 0L, this);
    }
}
