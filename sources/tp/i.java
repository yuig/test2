package tp;

import android.content.Context;
import m60.u;
import m60.x0;
import oh1.r;
import so.oa;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f118751b;

    public /* synthetic */ i(m mVar, int i13) {
        this.f118750a = i13;
        this.f118751b = mVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f118750a;
        final m mVar = this.f118751b;
        switch (i13) {
            case 0:
                r rVar = mVar.f118766i;
                final int i14 = 1;
                if (rVar != null) {
                    rVar.c(new rp0.c(mVar.f118759b), true);
                }
                a.c.y(u.f85943a);
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.b(x0.comment_highlighted, new Runnable() { // from class: tp.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = i14;
                        m mVar2 = mVar;
                        switch (i15) {
                            case 0:
                                mVar2.a();
                                break;
                            default:
                                mVar2.b();
                                break;
                        }
                    }
                }));
                break;
            default:
                r rVar2 = mVar.f118766i;
                final int i15 = 0;
                if (rVar2 != null) {
                    rVar2.c(new rp0.c(mVar.f118759b), false);
                }
                a.c.y(u.f85943a);
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.b(x0.comment_highlight_removed, new Runnable() { // from class: tp.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152 = i15;
                        m mVar2 = mVar;
                        switch (i152) {
                            case 0:
                                mVar2.a();
                                break;
                            default:
                                mVar2.b();
                                break;
                        }
                    }
                }));
                break;
        }
    }
}
