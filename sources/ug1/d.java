package ug1;

import com.pinterest.api.model.xk;
import h32.r;
import java.util.concurrent.TimeUnit;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;
import rf1.v;
import we1.n1;
import x02.x2;

/* loaded from: classes5.dex */
public final class d extends wi0.b {

    /* renamed from: h, reason: collision with root package name */
    public r f122160h;

    @Override // wi0.b, yk1.b
    /* renamed from: p3 */
    public final void r3(vi0.b view) {
        x2 x2Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        tg1.g gVar = view instanceof tg1.g ? (tg1.g) view : null;
        xk xkVar = this.f130002e;
        String str = xkVar != null ? xkVar.f43721m : null;
        if (str == null || (x2Var = this.f129999b) == null) {
            return;
        }
        e0 M = x2Var.M(str);
        hk2.b bVar = new hk2.b(new v(23, new n1(gVar, 9)), new v(24, c.f122154j), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    @Override // wi0.b
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final r r3() {
        r rVar;
        r rVar2;
        r source = this.f122160h;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            rVar2 = new r(source.f67199a, source.f67200b, source.f67201c, source.f67202d, jq.b.c(TimeUnit.MILLISECONDS), source.f67204f, source.f67205g, source.f67206h, source.f67207i, source.f67208j, source.f67209k, source.f67210l, source.f67211m, source.f67212n);
            rVar = null;
        } else {
            rVar = null;
            rVar2 = null;
        }
        this.f122160h = rVar;
        return rVar2;
    }

    @Override // wi0.b
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final r s3() {
        if (this.f122160h == null) {
            xk xkVar = this.f130002e;
            String uid = xkVar != null ? xkVar.getUid() : null;
            xk xkVar2 = this.f130002e;
            String uid2 = xkVar2 != null ? xkVar2.getUid() : null;
            xk xkVar3 = this.f130002e;
            Integer j13 = xkVar3 != null ? xkVar3.j() : null;
            this.f122160h = new r(uid, null, null, jq.b.c(TimeUnit.MILLISECONDS), null, null, Short.valueOf((short) this.f130003f), null, (short) 0, uid2, null, null, null, j13);
        }
        return this.f122160h;
    }
}
