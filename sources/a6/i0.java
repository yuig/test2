package a6;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class i0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f845r;

    /* renamed from: s, reason: collision with root package name */
    public File f846s;

    /* renamed from: t, reason: collision with root package name */
    public FileOutputStream f847t;

    /* renamed from: u, reason: collision with root package name */
    public FileOutputStream f848u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f849v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f850w;

    /* renamed from: x, reason: collision with root package name */
    public int f851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f850w = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f849v = obj;
        this.f851x |= Integer.MIN_VALUE;
        return this.f850w.k(null, this);
    }
}
