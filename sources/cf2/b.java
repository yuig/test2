package cf2;

import android.graphics.Picture;

/* loaded from: classes4.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Picture f27653r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27654s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f27655t;

    /* renamed from: u, reason: collision with root package name */
    public int f27656u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, bl2.c cVar) {
        super(cVar);
        this.f27655t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f27654s = obj;
        this.f27656u |= Integer.MIN_VALUE;
        return f.P0(this.f27655t, this);
    }
}
