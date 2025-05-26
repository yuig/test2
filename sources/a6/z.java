package a6;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f896r;

    /* renamed from: s, reason: collision with root package name */
    public Object f897s;

    /* renamed from: t, reason: collision with root package name */
    public Serializable f898t;

    /* renamed from: u, reason: collision with root package name */
    public Object f899u;

    /* renamed from: v, reason: collision with root package name */
    public b0 f900v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f901w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f902x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0 f903y;

    /* renamed from: z, reason: collision with root package name */
    public int f904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f903y = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f902x = obj;
        this.f904z |= Integer.MIN_VALUE;
        return this.f903y.e(this);
    }
}
