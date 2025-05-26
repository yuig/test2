package t72;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f116645r;

    /* renamed from: s, reason: collision with root package name */
    public Object f116646s;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap f116647t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f116648u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f116649v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f116650w;

    /* renamed from: x, reason: collision with root package name */
    public int f116651x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, bl2.c cVar) {
        super(cVar);
        this.f116650w = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116649v = obj;
        this.f116651x |= Integer.MIN_VALUE;
        return this.f116650w.b(null, null, false, this);
    }
}
