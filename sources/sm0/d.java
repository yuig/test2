package sm0;

import androidx.appcompat.widget.q;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f113237r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f113238s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f113239t;

    /* renamed from: u, reason: collision with root package name */
    public int f113240u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, bl2.c cVar) {
        super(cVar);
        this.f113239t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f113238s = obj;
        this.f113240u |= Integer.MIN_VALUE;
        return this.f113239t.i(null, this);
    }
}
