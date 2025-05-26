package rf1;

import com.pinterest.api.model.f30;
import h32.a4;
import i32.y0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import sf1.e1;
import sf1.k1;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f107788j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f107789k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(p0 p0Var, f30 f30Var, int i13) {
        super(0);
        this.f107787i = i13;
        this.f107788j = p0Var;
        this.f107789k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f107787i) {
            case 0:
                m245invoke();
                break;
            default:
                m245invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m245invoke() {
        k1 x33;
        h32.g0 g0Var;
        int i13 = this.f107787i;
        h32.v0 v0Var = null;
        p0 p0Var = this.f107788j;
        switch (i13) {
            case 0:
                nx.d0 pinalytics = p0Var.getPinalytics();
                h32.u0 u0Var = h32.u0.PIN_STORY_PIN_SAVE_BUTTON;
                h32.g0 g0Var2 = h32.g0.PIN_STORY_PIN_CHROME;
                String uid = this.f107789k.getUid();
                HashMap H4 = p0Var.H4();
                String F3 = p0Var.F3(p0Var.Z);
                if (F3 != null) {
                    v0Var = new h32.v0();
                    v0Var.G = F3;
                }
                pinalytics.J(u0Var, g0Var2, uid, H4, v0Var, false);
                if (p0Var.isBound()) {
                    p0Var.f107845j.l(y0.ANDROID_IDEA_STREAM_TAKEOVER, i32.l.ANDROID_SAVE_EDUCATION);
                    p0Var.f107870v0 = s.DO_NOT_RESTART;
                    nx.d0 pinalytics2 = p0Var.getPinalytics();
                    gp1.k kVar = gp1.k.CLOSEUP;
                    f30 f30Var = this.f107789k;
                    k11.p.a(p0Var.f107873x, f30Var, true, false, false, null, false, null, pinalytics2, kVar, null, new m0(p0Var, f30Var, 1), 2556);
                    if (p0Var.isBound() && (x33 = p0Var.x3()) != null) {
                        e1 e1Var = (e1) x33;
                        ig1.b.M0(true, e1Var, true, e1Var.getContext(), true, false, false);
                    }
                    p0Var.f107841h.d(new lq.a(f30Var.getUid()));
                    break;
                }
                break;
            default:
                h32.i0 p13 = p0Var.getPinalytics().p();
                if (p13 == null || (g0Var = p13.f67084d) == null) {
                    g0Var = null;
                } else if (g0Var == h32.g0.PIN_IDEA_STREAM) {
                    g0Var = h32.g0.MODULE_IDEA_STREAM;
                }
                a4 a4Var = p13 != null ? p13.f67082b : null;
                String name = g0Var != null ? g0Var.name() : null;
                String name2 = a4Var != null ? a4Var.name() : null;
                bz.g gVar = p0Var.f107839g.f24184b;
                e02.a.b(p0Var.f107869v, this.f107789k, true, p0Var.f107855o, null, null, null, null, null, null, null, name, name2, gVar != null ? gVar.f24166a : null, null, null, false, false, null, null, null, gp1.k.CLOSEUP, null, 3138552);
                break;
        }
    }
}
