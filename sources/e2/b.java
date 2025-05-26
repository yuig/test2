package e2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j1.q0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends z implements t {

    /* renamed from: x, reason: collision with root package name */
    public s f56832x;

    /* renamed from: y, reason: collision with root package name */
    public v f56833y;

    @Override // u2.p
    public final void E0() {
        s sVar = this.f56832x;
        if (sVar != null) {
            d0();
            u uVar = sVar.f56904d;
            v vVar = (v) uVar.f56906a.get(this);
            if (vVar != null) {
                vVar.b();
                Map map = uVar.f56906a;
                v vVar2 = (v) map.get(this);
                if (vVar2 != null) {
                }
                map.remove(this);
                sVar.f56903c.add(vVar);
            }
        }
    }

    @Override // e2.z
    public final void M0(o1.n nVar, long j13, float f13) {
        s sVar = this.f56832x;
        if (sVar == null) {
            sVar = d0.a(d0.b((View) com.bumptech.glide.c.w(this, AndroidCompositionLocals_androidKt.f17459f)));
            this.f56832x = sVar;
            Intrinsics.f(sVar);
        }
        v a13 = sVar.a(this);
        a13.a(nVar, this.f56922o, j13, ml2.c.c(f13), this.f56924q.a(), ((i) this.f56925r.invoke()).f56868d, new q0(this, 19));
        this.f56833y = a13;
        com.bumptech.glide.c.k0(this);
    }

    @Override // e2.z
    public final void N0(d3.h hVar) {
        b3.u a13 = hVar.p0().a();
        v vVar = this.f56833y;
        if (vVar != null) {
            vVar.c(this.f56928u, this.f56924q.a(), ((i) this.f56925r.invoke()).f56868d);
            vVar.draw(b3.e.b(a13));
        }
    }

    @Override // e2.z
    public final void P0(o1.n nVar) {
        v vVar = this.f56833y;
        if (vVar != null) {
            vVar.d(false);
        }
    }

    @Override // e2.t
    public final void d0() {
        this.f56833y = null;
        com.bumptech.glide.c.k0(this);
    }
}
