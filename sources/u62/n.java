package u62;

import com.pinterest.shuffles.core.ui.model.MaskModel;

/* loaded from: classes4.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t f120850r;

    /* renamed from: s, reason: collision with root package name */
    public MaskModel f120851s;

    /* renamed from: t, reason: collision with root package name */
    public q72.g f120852t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f120853u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t f120854v;

    /* renamed from: w, reason: collision with root package name */
    public int f120855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, bl2.c cVar) {
        super(cVar);
        this.f120854v = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f120853u = obj;
        this.f120855w |= Integer.MIN_VALUE;
        return this.f120854v.c(null, this);
    }
}
