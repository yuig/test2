package fd;

import ao2.j0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v extends dl2.d {
    public /* synthetic */ Object A;
    public final /* synthetic */ y B;
    public int C;

    /* renamed from: r, reason: collision with root package name */
    public y f61812r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f61813s;

    /* renamed from: t, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f61814t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f61815u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f61816v;

    /* renamed from: w, reason: collision with root package name */
    public Map f61817w;

    /* renamed from: x, reason: collision with root package name */
    public gd.f f61818x;

    /* renamed from: y, reason: collision with root package name */
    public j f61819y;

    /* renamed from: z, reason: collision with root package name */
    public long f61820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, bl2.c cVar) {
        super(cVar);
        this.B = yVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return y.b(this.B, null, this);
    }
}
