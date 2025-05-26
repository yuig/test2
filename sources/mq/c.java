package mq;

import ac2.o1;
import android.content.ComponentCallbacks;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import b11.o0;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import zp.n0;

/* loaded from: classes3.dex */
public final class c extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public final kq.c f87956a;

    /* renamed from: b, reason: collision with root package name */
    public int f87957b;

    /* renamed from: c, reason: collision with root package name */
    public int f87958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f87959d;

    public c(u uVar, kq.c viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f87959d = uVar;
        this.f87956a = viewAdapter;
        this.f87957b = -1;
        this.f87958c = viewAdapter.f77530g;
    }

    @Override // xa.k, xa.i
    public final void A5(int i13) {
        String str;
        f30 H4;
        String D;
        u uVar = this.f87959d;
        uVar.f7().d(new dg0.c(dg0.b.DISMISS_UI));
        if (!uVar.g8().J()) {
            ComponentCallbacks a13 = a(i13, 1.0f);
            if (a13 instanceof j0) {
                j0 j0Var = (j0) a13;
                if (!j0Var.n1() && (H4 = j0Var.H4()) != null) {
                    if (uVar.h8()) {
                        uVar.f88021i0 = a11.w.c(H4, uVar.f88021i0);
                        se2.a aVar = uVar.B0;
                        if (aVar == null) {
                            Intrinsics.r("urlInfoHelper");
                            throw null;
                        }
                        Object obj = ((bf2.b) aVar).get();
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        a11.y yVar = (a11.y) obj;
                        m60.w f73 = uVar.f7();
                        se2.a aVar2 = uVar.G0;
                        if (aVar2 == null) {
                            Intrinsics.r("linkValidation");
                            throw null;
                        }
                        Object obj2 = ((bf2.b) aVar2).get();
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        ws1.a aVar3 = (ws1.a) obj2;
                        z70.f r23 = ((oa) z70.i.a()).r2();
                        androidx.lifecycle.z viewLifecycleOwner = uVar.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        a11.w.a(H4, yVar, f73, aVar3, r23, bf.b.S(viewLifecycleOwner), ((Boolean) uVar.I0.getValue()).booleanValue());
                    } else {
                        f3 z33 = H4.z3();
                        if (z33 != null) {
                            String uid = z33.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            uVar.f88021i0 = uid;
                        }
                        if (com.bumptech.glide.c.f1(H4) && (D = com.bumptech.glide.c.D(H4)) != null && URLUtil.isValidUrl(D)) {
                            se2.a aVar4 = uVar.B0;
                            if (aVar4 == null) {
                                Intrinsics.r("urlInfoHelper");
                                throw null;
                            }
                            ((a11.y) ((bf2.b) aVar4).get()).a(D, H4.getUid()).s().o(new n0(17, new ba.s(15, uVar, H4)), new n0(18, d.f87962j));
                        }
                    }
                }
            }
        }
        String f83 = uVar.f8();
        jr.a aVar5 = uVar.Y;
        Intrinsics.f(aVar5);
        int i14 = ((kq.c) aVar5).f77530g;
        String str2 = "left";
        String str3 = "";
        if (!uVar.h8()) {
            if (i14 < i13) {
                uVar.l8(i13 + 1, i13 - 2);
                str2 = "right";
            } else if (i14 > i13) {
                uVar.l8(i13 - 1, i13 + 2);
            } else {
                str2 = "";
            }
            uVar.s7().V(f83, str2);
            return;
        }
        a11.u uVar2 = i14 != i13 ? i14 < i13 ? new a11.u("right", i13 + 1, i13 - 2) : new a11.u("left", i13 - 1, i13 + 2) : null;
        if (uVar2 != null) {
            uVar.l8(uVar2.f358b, uVar2.f359c);
        }
        nx.d0 s73 = uVar.s7();
        if (uVar2 != null && (str = uVar2.f357a) != null) {
            str3 = str;
        }
        s73.V(f83, str3);
    }

    public final Fragment a(int i13, float f13) {
        kq.c cVar = this.f87956a;
        int i14 = cVar.f77530g;
        int size = cVar.f77529f.size();
        int i15 = this.f87957b;
        if (i15 >= 0 && f13 < 1.0E-4d) {
            Fragment u13 = i15 < size ? cVar.u(i15) : null;
            this.f87957b = -1;
            return u13;
        }
        int i16 = u.P0;
        if (this.f87959d.h8()) {
            if ((i14 <= i13 || i13 < 0) && ((i14 >= i13 || i13 >= size) && (i13 = i14 + 1) >= size)) {
                i13 = -1;
            }
            if (i13 == -1) {
                i13 = this.f87957b;
            }
            this.f87957b = i13;
            return cVar.u(i13);
        }
        if (i14 > i13) {
            if (i13 >= 0) {
                this.f87957b = i13;
            }
        } else if (i14 >= i13) {
            int i17 = i14 + 1;
            if (i17 < size) {
                this.f87957b = i17;
            }
        } else if (i13 < size) {
            this.f87957b = i13;
        }
        return cVar.u(this.f87957b);
    }

    public final void b(int i13) {
        if (i13 >= 0) {
            kq.c cVar = this.f87956a;
            if (i13 < cVar.f77529f.size()) {
                ComponentCallbacks u13 = cVar.u(i13);
                o0 o0Var = u13 instanceof o0 ? (o0) u13 : null;
                if (o0Var != null) {
                    ((PinCloseupFragment) o0Var).D9();
                }
            }
        }
    }

    public final void c(int i13) {
        if (i13 >= 0) {
            kq.c cVar = this.f87956a;
            if (i13 < cVar.f77529f.size()) {
                ComponentCallbacks u13 = cVar.u(i13);
                o0 o0Var = u13 instanceof o0 ? (o0) u13 : null;
                if (o0Var != null) {
                    ((PinCloseupFragment) o0Var).E9();
                }
            }
        }
    }

    public final void d(int i13) {
        this.f87958c = i13;
    }

    @Override // xa.k, xa.i
    public final void i(int i13, float f13, int i14) {
        kq.c cVar = this.f87956a;
        if (cVar.f77529f.size() <= 1) {
            return;
        }
        ((o1) this.f87959d.B7()).w();
        ComponentCallbacks r13 = cVar.r();
        if (r13 instanceof j0) {
            ((j0) r13).H1();
        }
        ComponentCallbacks a13 = a(i13, f13);
        if (a13 instanceof j0) {
            ((j0) a13).i(i13, f13, i14);
        }
        int i15 = this.f87958c;
        if (i13 == i15 && f13 > 0.5f) {
            int i16 = i13 + 1;
            this.f87958c = i16;
            b(i13);
            c(this.f87958c);
            cVar.a0(i16);
            return;
        }
        if (i13 != i15 - 1 || f13 >= 0.5f) {
            return;
        }
        this.f87958c = i13;
        b(i13 + 1);
        c(this.f87958c);
        cVar.a0(i13);
    }
}
