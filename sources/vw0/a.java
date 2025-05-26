package vw0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import h32.a4;
import h32.d4;
import h32.z1;
import m60.w;
import nx.d1;
import pb0.g;
import uk1.d;
import yk1.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a */
    public f30 f126794a;

    /* renamed from: b */
    public final vh f126795b;

    /* renamed from: c */
    public z1 f126796c;

    /* renamed from: d */
    public final d f126797d;

    /* renamed from: e */
    public final w f126798e;

    /* renamed from: f */
    public final zs1.a f126799f;

    /* renamed from: g */
    public final pb0.a f126800g;

    /* renamed from: h */
    public final d1 f126801h;

    /* renamed from: i */
    public boolean f126802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vh vhVar, d dVar, w wVar, zs1.a aVar, d1 d1Var) {
        super(0);
        g gVar = g.f99432a;
        this.f126802i = true;
        this.f126795b = vhVar;
        this.f126797d = dVar;
        this.f126798e = wVar;
        this.f126799f = aVar;
        this.f126800g = gVar;
        this.f126801h = d1Var;
        if (vhVar != null) {
            if (vhVar.q().equals("partner_curated_pins") || vhVar.q().equals("shop_the_look")) {
                dVar.c(a4.PIN_CLOSEUP_VISUAL_LINK_FEED, d4.PIN_VISUAL_LINKS, null);
            }
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        super.r3((uw0.a) nVar);
        p3();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p3() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.a.p3():void");
    }
}
