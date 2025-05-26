package u51;

import android.content.Context;
import com.pinterest.component.modal.ModalListViewWrapper;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.jb;
import so.oa;
import so.s8;
import w01.e0;

/* loaded from: classes5.dex */
public final class z extends ModalListViewWrapper implements q51.b, af2.c {

    /* renamed from: n, reason: collision with root package name */
    public ye2.o f120648n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f120649o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f120650p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f120651q;

    /* renamed from: r, reason: collision with root package name */
    public final m60.w f120652r;

    /* renamed from: s, reason: collision with root package name */
    public final i92.k f120653s;

    /* renamed from: t, reason: collision with root package name */
    public final nk1.l f120654t;

    /* renamed from: u, reason: collision with root package name */
    public final d4 f120655u;

    /* renamed from: v, reason: collision with root package name */
    public final a4 f120656v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f120649o) {
            this.f120649o = true;
            jb jbVar = (jb) ((a0) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f120652r = (m60.w) oaVar.f113885r0.get();
            this.f120653s = (i92.k) oaVar.f113921t1.get();
            this.f120654t = s8.X4(jbVar.f113485c);
        }
        this.f120650p = context;
        this.f120651q = xk2.m.b(new e0(this, 26));
        this.f120655u = d4.PIN;
        this.f120656v = a4.REPORT_PIN;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f120648n == null) {
            this.f120648n = new ye2.o(this);
        }
        return this.f120648n;
    }

    public final void dismiss() {
        m60.w wVar = this.f120652r;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.d(new of0.b());
        wVar.d(new jc0.q(true));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f120648n == null) {
            this.f120648n = new ye2.o(this);
        }
        return this.f120648n.generatedComponent();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getV0() {
        return this.f120656v;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF112037k0() {
        return this.f120655u;
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
