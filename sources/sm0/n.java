package sm0;

import androidx.appcompat.widget.q;

/* loaded from: classes5.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f113269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f113270s;

    /* renamed from: t, reason: collision with root package name */
    public int f113271t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(cVar);
        this.f113270s = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f113269r = obj;
        this.f113271t |= Integer.MIN_VALUE;
        return this.f113270s.i(null, this);
    }
}
