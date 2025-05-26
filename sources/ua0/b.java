package ua0;

import android.graphics.Bitmap;
import com.pinterest.api.model.fi0;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f121391r;

    /* renamed from: s, reason: collision with root package name */
    public r f121392s;

    /* renamed from: t, reason: collision with root package name */
    public fi0 f121393t;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f121394u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f121395v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121396w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f121397x;

    /* renamed from: y, reason: collision with root package name */
    public int f121398y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f121397x = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f121396w = obj;
        this.f121398y |= Integer.MIN_VALUE;
        return d.j(this.f121397x, null, null, null, false, this);
    }
}
