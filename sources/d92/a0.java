package d92;

import com.pinterest.api.model.f30;

/* loaded from: classes4.dex */
public final class a0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public b0 f54110r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f54111s;

    /* renamed from: t, reason: collision with root package name */
    public Object f54112t;

    /* renamed from: u, reason: collision with root package name */
    public Object f54113u;

    /* renamed from: v, reason: collision with root package name */
    public String f54114v;

    /* renamed from: w, reason: collision with root package name */
    public String f54115w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f54116x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f54117y;

    /* renamed from: z, reason: collision with root package name */
    public int f54118z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, bl2.c cVar) {
        super(cVar);
        this.f54117y = b0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f54116x = obj;
        this.f54118z |= Integer.MIN_VALUE;
        return this.f54117y.emit(null, this);
    }
}
