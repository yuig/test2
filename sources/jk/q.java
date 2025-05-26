package jk;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final kk.m f76351a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.m f76352b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.m f76353c;

    public q(kk.m mVar, kk.m mVar2, kk.m mVar3) {
        this.f76351a = mVar;
        this.f76352b = mVar2;
        this.f76353c = mVar3;
    }

    @Override // jk.b
    public final void a(c91.b bVar) {
        g().a(bVar);
    }

    @Override // jk.b
    public final void b(c cVar) {
        g().b(cVar);
    }

    @Override // jk.b
    public final Task c(List list) {
        return g().c(list);
    }

    @Override // jk.b
    public final Set d() {
        return g().d();
    }

    @Override // jk.b
    public final boolean e(d dVar, Activity activity) {
        return g().e(dVar, activity);
    }

    @Override // jk.b
    public final Task f(qq2.c cVar) {
        return g().f(cVar);
    }

    public final b g() {
        return ((kk.n) this.f76353c).zza() != null ? (b) ((kk.n) this.f76352b).zza() : (b) ((kk.n) this.f76351a).zza();
    }
}
