package i72;

import android.graphics.Rect;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f71669r;

    /* renamed from: s, reason: collision with root package name */
    public Parcelable f71670s;

    /* renamed from: t, reason: collision with root package name */
    public Rect f71671t;

    /* renamed from: u, reason: collision with root package name */
    public int f71672u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f71673v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f71674w;

    /* renamed from: x, reason: collision with root package name */
    public int f71675x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, bl2.c cVar) {
        super(cVar);
        this.f71674w = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f71673v = obj;
        this.f71675x |= Integer.MIN_VALUE;
        return this.f71674w.a(null, null, this);
    }
}
