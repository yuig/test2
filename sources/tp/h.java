package tp;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.wy0;
import df.j1;
import m60.x0;
import oh1.r;
import r0.p0;
import so.oa;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118744a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f118745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Resources f118746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f118747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wy0 f118748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rp0.d f118749f;

    public /* synthetic */ h(m mVar, Resources resources, String str, wy0 wy0Var, rp0.d dVar) {
        this.f118745b = mVar;
        this.f118746c = resources;
        this.f118747d = str;
        this.f118748e = wy0Var;
        this.f118749f = dVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f118744a;
        Resources resources = this.f118746c;
        m mVar = this.f118745b;
        mVar.getClass();
        switch (i13) {
            case 0:
                String string = resources.getString(x0.comment_block_user_confirm_toast);
                String str = this.f118747d;
                String X = j1.X(string, str);
                Context context = kb0.a.f79058b;
                i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                rp0.d dVar = this.f118749f;
                wy0 wy0Var = this.f118748e;
                E2.c(new up.c(new p0(mVar, resources, dVar, wy0Var, str, 4), X));
                r rVar = mVar.f118766i;
                if (rVar != null) {
                    rVar.e(wy0Var, dVar, false);
                    break;
                }
                break;
            default:
                String X2 = j1.X(resources.getString(x0.comment_block_user_undo_toast), this.f118747d);
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(X2);
                r rVar2 = mVar.f118766i;
                if (rVar2 != null) {
                    rVar2.e(this.f118748e, this.f118749f, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(m mVar, Resources resources, String str, rp0.c cVar, wy0 wy0Var) {
        this.f118745b = mVar;
        this.f118746c = resources;
        this.f118747d = str;
        this.f118749f = cVar;
        this.f118748e = wy0Var;
    }
}
