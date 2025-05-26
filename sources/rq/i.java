package rq;

import kotlin.jvm.internal.Intrinsics;
import so.db;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class i extends b {

    /* renamed from: d, reason: collision with root package name */
    public cr0.i f109265d;

    /* renamed from: e, reason: collision with root package name */
    public cr0.i f109266e;

    /* renamed from: f, reason: collision with root package name */
    public cr0.i f109267f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109268g;

    @Override // cr0.j
    public final cr0.i M0(cr0.a aVar) {
        cr0.i iVar;
        cr0.q type = (cr0.q) aVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof cr0.p) {
            iVar = this.f109265d;
            if (iVar == null) {
                Intrinsics.r("videoViewsView");
                throw null;
            }
        } else if (type instanceof cr0.n) {
            iVar = this.f109266e;
            if (iVar == null) {
                Intrinsics.r("averageTimeView");
                throw null;
            }
        } else {
            if (!(type instanceof cr0.o)) {
                throw new UnsupportedOperationException(type + " not supported");
            }
            iVar = this.f109267f;
            if (iVar == null) {
                Intrinsics.r("savesView");
                throw null;
            }
        }
        return iVar;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109268g) {
            return;
        }
        this.f109268g = true;
        u uVar = (u) this;
        jb jbVar = (jb) ((v) generatedComponent());
        oa oaVar = jbVar.f113483a;
        uVar.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        uVar.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        uVar.closeupActionController = s8Var.h5();
        uVar.bidiFormatter = a02.e.I1();
        uVar.baseCloseupLibraryExperiments = s8Var.k5();
        uVar.pinAuxHelper = (nx.b0) oaVar.R8.get();
        uVar.f109563h = (db) jbVar.f113490h.get();
    }
}
