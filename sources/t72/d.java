package t72;

import java.io.Serializable;
import kotlin.jvm.internal.j0;

/* loaded from: classes4.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f116632r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f116633s;

    /* renamed from: t, reason: collision with root package name */
    public j0 f116634t;

    /* renamed from: u, reason: collision with root package name */
    public Serializable f116635u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f116636v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f116637w;

    /* renamed from: x, reason: collision with root package name */
    public int f116638x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, bl2.c cVar) {
        super(cVar);
        this.f116637w = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116636v = obj;
        this.f116638x |= Integer.MIN_VALUE;
        return this.f116637w.a(null, null, this);
    }
}
