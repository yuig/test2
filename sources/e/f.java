package e;

import android.content.Context;
import androidx.activity.i0;
import androidx.lifecycle.z;
import ba.n;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import i1.x;
import i2.s0;
import k1.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lr.p;
import lr.r;
import m60.x0;
import p1.t0;
import p1.z0;
import q3.b1;
import q3.c1;
import q3.r0;
import rl2.g0;
import rq.m4;
import s2.t;
import u50.f0;
import zp.j0;
import zp.w0;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56677i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56678j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56679k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f56680l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f56677i = i13;
        this.f56678j = obj;
        this.f56679k = obj2;
        this.f56680l = obj3;
    }

    public final do1.d b(do1.d it) {
        int i13 = this.f56677i;
        Object obj = this.f56680l;
        Object obj2 = this.f56679k;
        Object obj3 = this.f56678j;
        switch (i13) {
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                PinterestToastContainer pinterestToastContainer = (PinterestToastContainer) obj3;
                Context context = pinterestToastContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String string = pinterestToastContainer.getResources().getString(f02.g.follow_upsell_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                p pVar = (p) obj2;
                String Z2 = pVar.f84536d.Z2();
                if (Z2 == null) {
                    Z2 = "";
                }
                String spannableStringBuilder = f0.h.D(context, string, Z2).toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "toString(...)");
                return new do1.d(bs1.c.h2(spannableStringBuilder), new do1.j(dl2.b.s0(pVar.f84536d)), new do1.b(d7.g.q(pinterestToastContainer.getResources(), x0.follow, "getString(...)"), new j0(10, pVar, (GestaltToast) obj)), null, f02.c.toast_follow, 3600, 0, null, false, 456);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return do1.d.e(it, bs1.c.j2(new String[0], tr.d.title_pin_published), null, new do1.b(bs1.c.j2(new String[0], tr.d.button_text_view_pin_closeup), new q((r) obj3, (PinterestToastContainer) obj2, (GestaltToast) obj, 12)), 0, true, 250);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                PinterestToastContainer pinterestToastContainer2 = (PinterestToastContainer) obj3;
                Context context2 = pinterestToastContainer2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String string2 = pinterestToastContainer2.getResources().getString(f02.g.share_upsell_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                lr.g gVar = (lr.g) obj2;
                String spannableStringBuilder2 = f0.h.D(context2, string2, (String) gVar.f84514g).toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
                f0 h23 = bs1.c.h2(spannableStringBuilder2);
                String str = (String) gVar.f84513f;
                return new do1.d(h23, str != null ? new do1.j(str) : null, new do1.b(bs1.c.j2(new String[0], x0.share), new q(gVar, pinterestToastContainer2, (GestaltToast) obj, 13)), null, f02.c.toast_share, 0, 0, null, false, 488);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                up.b bVar = (up.b) obj3;
                return new do1.d(bs1.c.j2(new String[0], bVar.f122934e), null, new do1.b(bs1.c.j2(new String[0], x0.undo), new q(bVar, (PinterestToastContainer) obj2, (GestaltToast) obj, 14)), null, 0, 0, 0, null, false, 506);
        }
    }

    public final s0 e() {
        int i13 = this.f56677i;
        int i14 = 1;
        Object obj = this.f56680l;
        Object obj2 = this.f56679k;
        Object obj3 = this.f56678j;
        switch (i13) {
            case 0:
                h hVar = (h) obj;
                ((i0) obj3).a((z) obj2, hVar);
                return new b(hVar, i14);
            case 1:
                return new i1.k((t) obj3, obj2, (x) obj);
            case 10:
                r2.i iVar = (r2.i) obj3;
                if (!iVar.f106050b.containsKey(obj2)) {
                    iVar.f106049a.remove(obj2);
                    r2.h hVar2 = (r2.h) obj;
                    iVar.f106050b.put(obj2, hVar2);
                    return new i1.k(hVar2, iVar, obj2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            default:
                t tVar = (t) obj3;
                z9.k kVar = (z9.k) obj2;
                tVar.add(kVar);
                return new i1.k((n) obj, kVar, tVar);
        }
    }

    public final void f(v7 v7Var) {
        String F6;
        int i13 = this.f56677i;
        Object obj = this.f56680l;
        Object obj2 = this.f56679k;
        Object obj3 = this.f56678j;
        switch (i13) {
            case 18:
                w0 w0Var = (w0) obj3;
                w0Var.f142552n0 = (String) obj2;
                w0Var.f142554o0 = v7Var;
                w0Var.f142548l0 = null;
                w0Var.f142550m0 = null;
                w0Var.f142556p0 = null;
                w0Var.f142558q0 = null;
                ((Function0) obj).invoke();
                return;
            default:
                m4 m4Var = (m4) obj3;
                f30 f30Var = (f30) obj2;
                v7 v7Var2 = (v7) obj;
                int i14 = m4.f109377p;
                m4Var.getClass();
                if (v7Var == null) {
                    v7Var = v7Var2;
                }
                wy0 I5 = f30Var.I5();
                b60.b bVar = m4Var.f109384g;
                if (bVar == null) {
                    Intrinsics.r("activeUserManager");
                    throw null;
                }
                wy0 Q = com.bumptech.glide.d.Q(bVar);
                String uid = I5 != null ? I5.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                if ((!dl2.b.S1(Q, uid) && ((I5 == null || !Intrinsics.d(I5.R2(), Boolean.TRUE)) && ((v7Var == null || !Intrinsics.d(v7Var.V0(), Boolean.TRUE)) && (!Intrinsics.d(m4Var.f109380c, "board") || (F6 = f30Var.F6()) == null || F6.length() == 0)))) || ((!v7Var.g1().booleanValue() && g0.W(f30Var)) || kh2.d.I0(v7Var))) {
                    bs1.c.X0(m4Var);
                    return;
                }
                m4Var.createViewIfNecessary();
                m4Var.updateView();
                bs1.c.U1(m4Var);
                return;
        }
    }

    public final void h(b1 b1Var) {
        int i13 = this.f56677i;
        Object obj = this.f56680l;
        Object obj2 = this.f56679k;
        Object obj3 = this.f56678j;
        switch (i13) {
            case 2:
                t0 t0Var = (t0) obj3;
                long j13 = ((n4.h) t0Var.f98597n.invoke((r0) obj2)).f89180a;
                if (!t0Var.f98598o) {
                    b1.i(b1Var, (c1) obj, (int) (j13 >> 32), (int) (4294967295L & j13), null, 12);
                    break;
                } else {
                    b1.g(b1Var, (c1) obj, (int) (j13 >> 32), (int) (4294967295L & j13));
                    break;
                }
            default:
                r0 r0Var = (r0) obj2;
                z0 z0Var = (z0) obj;
                b1.d(b1Var, (c1) obj3, r0Var.R(z0Var.f98623n.c(r0Var.getLayoutDirection())), r0Var.R(z0Var.f98623n.d()));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0221  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 3052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.invoke(java.lang.Object):java.lang.Object");
    }
}
