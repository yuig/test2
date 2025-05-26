package p0;

import androidx.camera.core.impl.k;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.z2;
import c0.s1;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f98304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f98305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f98306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z2 f98307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f98308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f98309f;

    public /* synthetic */ c(d dVar, String str, String str2, z2 z2Var, k kVar, k kVar2) {
        this.f98304a = dVar;
        this.f98305b = str;
        this.f98306c = str2;
        this.f98307d = z2Var;
        this.f98308e = kVar;
        this.f98309f = kVar2;
    }

    @Override // androidx.camera.core.impl.k2
    public final void a(o2 o2Var, m2 m2Var) {
        d dVar = this.f98304a;
        if (dVar.c() == null) {
            return;
        }
        dVar.B();
        dVar.A(dVar.C(this.f98305b, this.f98306c, this.f98307d, this.f98308e, this.f98309f));
        dVar.o();
        g gVar = dVar.f98311p;
        gVar.getClass();
        f0.h.s();
        Iterator it = gVar.f98328a.iterator();
        while (it.hasNext()) {
            gVar.h((s1) it.next());
        }
    }
}
