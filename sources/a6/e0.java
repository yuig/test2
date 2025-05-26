package a6;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class e0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f818r;

    /* renamed from: s, reason: collision with root package name */
    public FileInputStream f819s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f820t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f821u;

    /* renamed from: v, reason: collision with root package name */
    public int f822v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f821u = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f820t = obj;
        this.f822v |= Integer.MIN_VALUE;
        return this.f821u.h(this);
    }
}
