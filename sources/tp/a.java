package tp;

import android.content.Context;
import m60.u;
import m60.x0;
import oh1.r;
import so.oa;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f118718b;

    public /* synthetic */ a(g gVar, int i13) {
        this.f118717a = i13;
        this.f118718b = gVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f118717a;
        final int i14 = 1;
        final int i15 = 0;
        final g gVar = this.f118718b;
        switch (i13) {
            case 0:
                r rVar = gVar.f118738f;
                if (rVar != null) {
                    rVar.c(new rp0.b(gVar.f118734b), true);
                }
                a.c.y(u.f85943a);
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.b(x0.comment_highlighted, new Runnable() { // from class: tp.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i15;
                        g gVar2 = gVar;
                        switch (i16) {
                            case 0:
                                gVar2.b();
                                break;
                            default:
                                gVar2.a();
                                break;
                        }
                    }
                }));
                break;
            default:
                r rVar2 = gVar.f118738f;
                if (rVar2 != null) {
                    rVar2.c(new rp0.b(gVar.f118734b), false);
                }
                a.c.y(u.f85943a);
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.b(x0.comment_highlight_removed, new Runnable() { // from class: tp.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i14;
                        g gVar2 = gVar;
                        switch (i16) {
                            case 0:
                                gVar2.b();
                                break;
                            default:
                                gVar2.a();
                                break;
                        }
                    }
                }));
                break;
        }
    }
}
