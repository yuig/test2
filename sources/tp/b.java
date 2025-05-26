package tp;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.wy0;
import df.j1;
import m60.u;
import m60.x0;
import oh1.r;
import r0.p0;
import so.oa;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118719a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f118720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Resources f118721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f118722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wy0 f118723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rp0.d f118724f;

    public /* synthetic */ b(g gVar, Resources resources, String str, wy0 wy0Var, rp0.d dVar) {
        this.f118720b = gVar;
        this.f118721c = resources;
        this.f118722d = str;
        this.f118723e = wy0Var;
        this.f118724f = dVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f118719a;
        Resources resources = this.f118721c;
        g gVar = this.f118720b;
        gVar.getClass();
        switch (i13) {
            case 0:
                a.c.y(u.f85943a);
                String string = resources.getString(x0.comment_block_user_confirm_toast);
                String str = this.f118722d;
                String X = j1.X(string, str);
                Context context = kb0.a.f79058b;
                i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                rp0.d dVar = this.f118724f;
                wy0 wy0Var = this.f118723e;
                E2.c(new up.c(new p0(gVar, resources, dVar, wy0Var, str, 3), X));
                r rVar = gVar.f118738f;
                if (rVar != null) {
                    rVar.e(wy0Var, dVar, false);
                    break;
                }
                break;
            default:
                String X2 = j1.X(resources.getString(x0.comment_block_user_undo_toast), this.f118722d);
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(X2);
                r rVar2 = gVar.f118738f;
                if (rVar2 != null) {
                    rVar2.e(this.f118723e, this.f118724f, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(g gVar, Resources resources, String str, rp0.b bVar, wy0 wy0Var) {
        this.f118720b = gVar;
        this.f118721c = resources;
        this.f118722d = str;
        this.f118724f = bVar;
        this.f118723e = wy0Var;
    }
}
