package ha2;

import a.z0;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.ExoPlayer;
import c50.w2;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.ay;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.grid.ImageInterestFollowButton;
import com.pinterest.ui.view.AnimatedContainer;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import ni1.x1;
import u50.f0;
import u50.k0;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68445i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i13) {
        super(1);
        this.f68445i = i13;
        this.f68446j = obj;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, null, null, false, false, ((ja2.c) obj) == ja2.c.Circular ? fm1.c.VISIBLE : fm1.c.GONE, 0, null, null, 1919);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, false, ((va2.n) obj).f125419p ? rl1.r.XS : rl1.r.MD, null, false, false, null, 0, null, null, 2035);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                ay ayVar = (ay) obj;
                String p13 = ayVar.p();
                if (p13 == null) {
                    p13 = "";
                }
                f0 x13 = ep.b.x(p13, "string", p13);
                String p14 = ayVar.p();
                return rn1.a.y(it, x13, null, null, null, null, 0, (p14 == null || kotlin.text.z.j(p14)) ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, d7.g.q(((rb2.w) obj).getContext().getResources(), nb2.d.see_all_messages_label, "getString(...)"), null, null, null, null, false, null, null, 2093055);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, d7.g.q(((rb2.z) obj).getContext().getResources(), nb2.d.see_all_requests_label, "getString(...)"), null, null, null, null, false, null, null, 2093047);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, ((zc2.b) obj).f141617c ? vn1.c.DEFAULT : vn1.c.DISABLED, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }

    public final zc2.b f(zc2.b it) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                zc2.g gVar = (zc2.g) obj;
                String str = gVar.f141623a;
                return zc2.b.e(it, str != null ? ep.b.x(str, "string", str) : null, null, (gVar.f141623a == null || it.f141616b == null) ? false : true, false, 10);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                zc2.h hVar = (zc2.h) obj;
                Long l13 = hVar.f141624a;
                return zc2.b.e(it, null, new k0((l13 != null && l13.longValue() == 3600000) ? xc2.g.hourly : xc2.g.daily), (hVar.f141624a == null || it.f141615a == null) ? false : true, false, 9);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((com.pinterest.widget.configuration.f) ((zc2.i) obj).f141625a).getClass();
                return zc2.b.e(it, null, null, false, true, 7);
        }
    }

    public final void h(String userId) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!kotlin.text.z.j(userId)) {
                    oa2.g gVar = (oa2.g) obj;
                    gVar.f93896j.invoke(null);
                    gVar.f93902p.d(userId, r41.b.GraphQLLegoUserRep);
                    break;
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(userId, "it");
                wa2.y yVar = (wa2.y) obj;
                yVar.f128959q = userId;
                yVar.f128954l.requestLayout();
                break;
            default:
                Intrinsics.checkNotNullParameter(userId, "it");
                wa2.f0 f0Var = (wa2.f0) obj;
                f0Var.f128700q = userId;
                f0Var.f128695l.requestLayout();
                f0Var.f128703t.getClass();
                break;
        }
    }

    public final void i(l82.n buildAndStart) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 23:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                l82.n.b(buildAndStart, (mb0.a) ((v72.a0) obj).f124400c);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                zc2.w wVar = (zc2.w) obj;
                com.pinterest.widget.configuration.e eVar = wVar.f141652d;
                buildAndStart.a(eVar, new w2(23), eVar.a());
                w60.d dVar = wVar.f141653e;
                buildAndStart.a(dVar, new w2(24), dVar.a());
                gx.e eVar2 = wVar.f141651c;
                buildAndStart.a(eVar2, new w2(25), eVar2.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                ad2.u uVar = (ad2.u) obj;
                mb0.a aVar = (mb0.a) uVar.f2119e.f63225b;
                buildAndStart.a(aVar, new w2(26), aVar.a());
                com.pinterest.widget.configuration.e eVar3 = uVar.f2118d;
                buildAndStart.a(eVar3, new w2(27), eVar3.a());
                w60.d dVar2 = uVar.f2117c;
                buildAndStart.a(dVar2, new w2(28), dVar2.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        ExoPlayer exoPlayer;
        int i13 = this.f68445i;
        boolean z13 = false;
        boolean z14 = false;
        z13 = false;
        final int i14 = 1;
        Object obj3 = this.f68446j;
        switch (i13) {
            case 0:
                ul1.c it = (ul1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ul1.c.e(it, bs1.c.j2(new String[0], ((w) obj3).f68476a), null, null, 0, 62);
            case 1:
                return b((rl1.q) obj);
            case 2:
                h((String) obj);
                return Unit.f80348a;
            case 3:
                l((oa2.i) obj);
                return Unit.f80348a;
            case 4:
                l((oa2.i) obj);
                return Unit.f80348a;
            case 5:
                nk1.h hVar = (nk1.h) obj;
                Intrinsics.f(hVar);
                int i15 = ImageInterestFollowButton.f52383h;
                ((ImageInterestFollowButton) obj3).b(hVar);
                return Unit.f80348a;
            case 6:
                return b((rl1.q) obj);
            case 7:
                h((String) obj);
                return Unit.f80348a;
            case 8:
                h((String) obj);
                return Unit.f80348a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ab2.n nVar = (ab2.n) obj3;
                u50.r rVar = nVar.f1769c;
                PinterestVideoView pinterestVideoView = nVar.f1768b;
                rVar.a(new x1(new gk1.o(pinterestVideoView.getB())));
                if (booleanValue && !pinterestVideoView.V()) {
                    pinterestVideoView.R = true;
                    hc2.m mVar = pinterestVideoView.Q;
                    if (mVar == null || (exoPlayer = ((dc2.g) mVar).f54407a) == null) {
                        obj2 = null;
                    } else {
                        l0 l0Var = (l0) exoPlayer;
                        l0Var.L0();
                        obj2 = l0Var.f86269j;
                    }
                    k8.q qVar = obj2 instanceof k8.q ? (k8.q) obj2 : null;
                    if (qVar != null) {
                        dl2.b.W2(qVar, true);
                    }
                }
                return Unit.f80348a;
            case 10:
                gb2.l lVar = (gb2.l) obj;
                if ((lVar instanceof gb2.i) && ((gb2.i) lVar).f64754b == ((wa2.p) obj3)) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 11:
                Boolean bool = (Boolean) obj;
                final AnimatedContainer animatedContainer = (AnimatedContainer) obj3;
                Intrinsics.f(bool);
                boolean booleanValue2 = bool.booleanValue();
                ValueAnimator valueAnimator = animatedContainer.f52664a;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                ValueAnimator valueAnimator2 = animatedContainer.f52665b;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(booleanValue2 ? 0 : animatedContainer.f52668e, booleanValue2 ? animatedContainer.f52668e : 0);
                animatedContainer.f52664a = ofInt;
                long j13 = animatedContainer.f52666c;
                if (ofInt != null) {
                    ofInt.setDuration(j13);
                    final int i16 = z13 ? 1 : 0;
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hb2.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator anim) {
                            int i17 = i16;
                            AnimatedContainer this$0 = animatedContainer;
                            switch (i17) {
                                case 0:
                                    int i18 = AnimatedContainer.f52663g;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    Object animatedValue = anim.getAnimatedValue();
                                    Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((Integer) animatedValue).intValue();
                                    this$0.getClass();
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this$0.getLayoutParams());
                                    layoutParams.height = intValue;
                                    this$0.setLayoutParams(layoutParams);
                                    break;
                                default:
                                    int i19 = AnimatedContainer.f52663g;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    Object animatedValue2 = anim.getAnimatedValue();
                                    Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                                    this$0.setAlpha(((Float) animatedValue2).floatValue());
                                    break;
                            }
                        }
                    });
                    ofInt.start();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(booleanValue2 ? 0.0f : 1.0f, booleanValue2 ? 1.0f : 0.0f);
                animatedContainer.f52665b = ofFloat;
                if (ofFloat != null) {
                    long j14 = j13 / 2;
                    ofFloat.setDuration(j14);
                    if (!booleanValue2) {
                        j14 = 0;
                    }
                    ofFloat.setStartDelay(j14);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hb2.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator anim) {
                            int i17 = i14;
                            AnimatedContainer this$0 = animatedContainer;
                            switch (i17) {
                                case 0:
                                    int i18 = AnimatedContainer.f52663g;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    Object animatedValue = anim.getAnimatedValue();
                                    Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((Integer) animatedValue).intValue();
                                    this$0.getClass();
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this$0.getLayoutParams());
                                    layoutParams.height = intValue;
                                    this$0.setLayoutParams(layoutParams);
                                    break;
                                default:
                                    int i19 = AnimatedContainer.f52663g;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    Object animatedValue2 = anim.getAnimatedValue();
                                    Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                                    this$0.setAlpha(((Float) animatedValue2).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat.start();
                }
                return Unit.f80348a;
            case 12:
                return e((rn1.a) obj);
            case 13:
                wy0 activeUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(activeUser, "activeUser");
                a60.a aVar = a60.a.f905a;
                String uid = activeUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                aVar.e((c60.a) obj3, uid, dl2.b.S2(activeUser));
                return activeUser;
            case 14:
                wy0 authenticatedUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(authenticatedUser, "authenticatedUser");
                qr1.t tVar = (qr1.t) obj3;
                tVar.getClass();
                int i17 = qr1.s.f105028a[tVar.f105031c.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z14 = true;
                }
                return new qr1.c(authenticatedUser, z14, tVar.f105029a);
            case 15:
                ((lb2.x) obj3).f82831j.j(or1.g.THIRD_PARTY_LOGOUT_ERROR, (Throwable) obj, null);
                return Unit.f80348a;
            case 16:
                int i18 = rb2.t.f107203t;
                ((rb2.t) obj3).e(true);
                return Unit.f80348a;
            case 17:
                return e((rn1.a) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                String s53 = ((f30) obj).s5();
                if (s53 != null) {
                    yb2.c cVar = (yb2.c) obj3;
                    cVar.f138586b.b(cVar.f138585a, s53);
                }
                return Unit.f80348a;
            case 20:
                j((nc2.l) obj);
                return Unit.f80348a;
            case 21:
                j((nc2.l) obj);
                return Unit.f80348a;
            case 22:
                int intValue = ((Number) obj).intValue();
                SimplePlayerControlView simplePlayerControlView = (SimplePlayerControlView) obj3;
                super/*android.view.View*/.setVisibility(intValue);
                boolean z15 = intValue == 0;
                if (!Intrinsics.d(simplePlayerControlView.f52793p0, Boolean.valueOf(z15))) {
                    z0 z0Var = simplePlayerControlView.f52792o0;
                    if (z0Var != null) {
                        a8.v listener = (a8.v) z0Var.f196b;
                        int i19 = com.pinterest.feature.pincarouselads.view.a0.f47355m;
                        Intrinsics.checkNotNullParameter(listener, "$listener");
                        CloseupCarouselView this$0 = (CloseupCarouselView) listener.f1465b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (z15) {
                            uk2.d dVar = this$0.N;
                            if (dVar != null) {
                                dVar.c(Boolean.TRUE);
                            }
                        } else {
                            uk2.d dVar2 = this$0.N;
                            if (dVar2 != null) {
                                dVar2.c(Boolean.FALSE);
                            }
                        }
                    }
                    simplePlayerControlView.f52793p0 = Boolean.valueOf(z15);
                }
                return Unit.f80348a;
            case 23:
                i((l82.n) obj);
                return Unit.f80348a;
            case 24:
                return e((rn1.a) obj);
            case 25:
                return f((zc2.b) obj);
            case 26:
                return f((zc2.b) obj);
            case 27:
                return f((zc2.b) obj);
            case 28:
                i((l82.n) obj);
                return Unit.f80348a;
            default:
                i((l82.n) obj);
                return Unit.f80348a;
        }
    }

    public final void j(nc2.l readVideoState) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(readVideoState, "$this$readVideoState");
                ec2.e eVar = (ec2.e) obj;
                if (!readVideoState.f90409a) {
                    eVar.f58444b.play();
                    break;
                } else {
                    oc2.i.a(eVar.f58444b);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(readVideoState, "$this$readVideoState");
                oc2.i iVar = (oc2.i) obj;
                if (!readVideoState.f90409a) {
                    iVar.play();
                    break;
                } else {
                    oc2.i.a(iVar);
                    break;
                }
        }
    }

    public final void l(oa2.i position) {
        int i13 = this.f68445i;
        Object obj = this.f68446j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(position, "position");
                oa2.s sVar = ((LegoUserRep) obj).f52353m;
                if (sVar != null) {
                    sVar.y2(position);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(position, "position");
                oa2.c cVar = (oa2.c) ((oa2.l) obj);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(position, "previewImagePosition");
                cVar.a();
                break;
        }
    }
}
