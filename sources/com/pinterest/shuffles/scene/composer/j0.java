package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import java.util.List;
import r72.e2;

/* loaded from: classes4.dex */
public final class j0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public n0 f52063r;

    /* renamed from: s, reason: collision with root package name */
    public Object f52064s;

    /* renamed from: t, reason: collision with root package name */
    public Size f52065t;

    /* renamed from: u, reason: collision with root package name */
    public List f52066u;

    /* renamed from: v, reason: collision with root package name */
    public e2 f52067v;

    /* renamed from: w, reason: collision with root package name */
    public int f52068w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f52069x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f52070y;

    /* renamed from: z, reason: collision with root package name */
    public int f52071z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, bl2.c cVar) {
        super(cVar);
        this.f52070y = n0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f52069x = obj;
        this.f52071z |= Integer.MIN_VALUE;
        return this.f52070y.b(null, null, null, 0, null, this);
    }
}
