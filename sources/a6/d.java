package a6;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Serializable f807r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f808s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f809t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f810u;

    /* renamed from: v, reason: collision with root package name */
    public int f811v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, bl2.c cVar) {
        super(cVar);
        this.f810u = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f809t = obj;
        this.f811v |= Integer.MIN_VALUE;
        return i.a(this.f810u, null, null, this);
    }
}
