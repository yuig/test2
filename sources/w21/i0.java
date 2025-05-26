package w21;

import a.cb;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f127705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f127706j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f127707k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(long j13, float f13, m mVar) {
        super(2);
        this.f127705i = j13;
        this.f127706j = f13;
        this.f127707k = mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        u50.f0 f0Var;
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.n nVar = u2.n.f120041b;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
        i2.s sVar2 = (i2.s) oVar;
        int i13 = sVar2.P;
        i2.z1 o13 = sVar2.o();
        u2.q X = ao2.m0.X(oVar, nVar);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar2.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar2.a0();
        if (sVar2.O) {
            sVar2.n(iVar);
        } else {
            sVar2.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(oVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(oVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i13))) {
            ep.b.y(i13, sVar2, i13, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(oVar, X, hVar4);
        float f13 = 1;
        p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(nVar, 1.0f), f13), this.f127705i, b3.s0.f21349a), oVar, 0);
        u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(db0.a.pin_selection_page_top_bar_height, oVar) - f13), this.f127706j, com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_medium_plus_paddings, oVar));
        p1.e1 a14 = p1.c1.a(p1.l.f98543a, u2.b.f120023k, oVar, 48);
        int i14 = sVar2.P;
        i2.z1 o14 = sVar2.o();
        u2.q X2 = ao2.m0.X(oVar, q13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar2.a0();
        if (sVar2.O) {
            sVar2.n(iVar);
        } else {
            sVar2.j0();
        }
        tb.f.f0(oVar, a14, hVar);
        tb.f.f0(oVar, o14, hVar2);
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i14))) {
            ep.b.y(i14, sVar2, i14, hVar3);
        }
        tb.f.f0(oVar, X2, hVar4);
        FillElement fillElement = androidx.compose.foundation.layout.e.f17183b;
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        u2.q j13 = fillElement.j(new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true));
        if (this.f127707k.f127741b == 0) {
            sVar2.W(-1307583223);
            String string = kh2.a1.D0(db0.f.pin_selection_bottom_tray_intro_title, oVar);
            Intrinsics.checkNotNullParameter(string, "string");
            f0Var = new u50.f0(string);
            sVar2.r(false);
        } else {
            sVar2.W(-1307438205);
            String string2 = kh2.a1.D0(db0.f.pin_selection_bottom_tray_in_progress_title, oVar);
            Intrinsics.checkNotNullParameter(string2, "string");
            f0Var = new u50.f0(string2);
            sVar2.r(false);
        }
        dl2.b.c(new rn1.a(f0Var, null, kotlin.collections.f0.j(vn1.b.START, vn1.b.CENTER_VERTICAL), null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), j13, null, null, oVar, 8, 12);
        sVar2.r(true);
        sVar2.r(true);
        return Unit.f80348a;
    }
}
