package yc;

import kotlin.jvm.internal.j0;

/* loaded from: classes.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public b f138588r;

    /* renamed from: s, reason: collision with root package name */
    public pc.h f138589s;

    /* renamed from: t, reason: collision with root package name */
    public j0 f138590t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f138591u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f138592v;

    /* renamed from: w, reason: collision with root package name */
    public int f138593w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, bl2.c cVar) {
        super(cVar);
        this.f138592v = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138591u = obj;
        this.f138593w |= Integer.MIN_VALUE;
        return this.f138592v.emit(null, this);
    }
}
