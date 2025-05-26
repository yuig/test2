package y31;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.ns;
import com.pinterest.api.model.rs;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeCarousel;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import ey.r3;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f136842a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f136843b;

    /* renamed from: c, reason: collision with root package name */
    public j41.b f136844c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f136845d;

    /* renamed from: e, reason: collision with root package name */
    public final qc2.d f136846e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f136847f;

    /* renamed from: g, reason: collision with root package name */
    public final kb.g f136848g;

    public q(Context context, ll.j pincodesUtil) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pincodesUtil, "pincodesUtil");
        this.f136842a = context;
        this.f136843b = pincodesUtil;
        this.f136845d = hf0.b.q();
        this.f136846e = new qc2.d();
        this.f136847f = xk2.m.b(p.f136832i);
        kb.c0 c0Var = kb.c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kb.c0 networkType = kb.c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.f136848g = new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
    }

    public static final j41.b a(q qVar, c92.n media, ViewGroup viewGroup) {
        j41.b bVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(media, "media");
        if (media instanceof h41.c) {
            bVar = new j41.n();
        } else if (media instanceof h41.d) {
            bVar = new j41.q();
        } else if (media instanceof h41.b) {
            bVar = new j41.k();
        } else {
            if (!(media instanceof h41.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        boolean z13 = qVar.f136845d;
        Context context = qVar.f136842a;
        if (z13) {
            measuredWidth = context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_width);
            measuredHeight = context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_height);
        }
        j41.a aVar = new j41.a(measuredWidth, measuredHeight);
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        View b13 = bVar.b(aVar, context, a13);
        viewGroup.removeAllViews();
        if (z13) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            layoutParams2.G = null;
            viewGroup.setLayoutParams(layoutParams2);
        }
        viewGroup.addView(b13);
        qVar.f136844c = bVar;
        return bVar;
    }

    public static final j41.b b(q qVar, c92.n nVar) {
        qVar.getClass();
        if (nVar instanceof h41.c) {
            j41.b bVar = qVar.f136844c;
            if (bVar instanceof j41.n) {
                return (j41.n) bVar;
            }
            return null;
        }
        if (nVar instanceof h41.d) {
            j41.b bVar2 = qVar.f136844c;
            if (bVar2 instanceof j41.q) {
                return (j41.q) bVar2;
            }
            return null;
        }
        if (!(nVar instanceof h41.b)) {
            return null;
        }
        j41.b bVar3 = qVar.f136844c;
        if (bVar3 instanceof j41.k) {
            return (j41.k) bVar3;
        }
        return null;
    }

    public final void c(ViewGroup coverMediaContainer, c92.n media, View coverMediaOverlay, Guideline guideline, GestaltButton gestaltButton, a41.m mVar) {
        j41.a aVar;
        Intrinsics.checkNotNullParameter(coverMediaContainer, "coverMediaContainer");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(coverMediaOverlay, "coverMediaOverlay");
        i(!Intrinsics.d(media, h41.a.f67627b), media, coverMediaContainer, coverMediaOverlay, guideline, gestaltButton, mVar);
        if (!coverMediaContainer.isLaidOut() || coverMediaContainer.isLayoutRequested()) {
            coverMediaContainer.addOnLayoutChangeListener(new n(this, media, coverMediaContainer, coverMediaOverlay, guideline, gestaltButton, mVar));
            return;
        }
        j41.b b13 = b(this, media);
        if (b13 == null) {
            b13 = a(this, media, coverMediaContainer);
        }
        j41.b bVar = b13;
        i(bVar != null, media, coverMediaContainer, coverMediaOverlay, guideline, gestaltButton, mVar);
        if (this.f136845d) {
            Context context = this.f136842a;
            aVar = new j41.a(context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_width), context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_height));
        } else {
            aVar = new j41.a(coverMediaContainer.getMeasuredWidth(), coverMediaContainer.getMeasuredHeight());
        }
        if (bVar != null) {
            bVar.a(media, aVar);
        }
    }

    public final void d(InspirationalBadgeCarousel carousel, vz0 verifiedMerchant) {
        ns j13;
        List i13;
        rs j14;
        List l13;
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        if (verifiedMerchant == null || !kh2.r.S(verifiedMerchant)) {
            return;
        }
        carousel.getClass();
        Intrinsics.checkNotNullParameter(verifiedMerchant, "verifiedMerchant");
        rs j15 = verifiedMerchant.j();
        if (j15 == null || (i13 = j15.i()) == null || (!i13.isEmpty()) || (j14 = verifiedMerchant.j()) == null || (l13 = j14.l()) == null || (!l13.isEmpty())) {
            String str = null;
            if (carousel.f48533c == null) {
                RecyclerView recyclerView = new RecyclerView(carousel.getContext(), null);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                g41.a aVar = new g41.a(carousel, 8);
                recyclerView.getContext();
                recyclerView.R2(new PinterestLinearLayoutManager(aVar, 0, false));
                int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(r0.margin);
                recyclerView.m(new com.pinterest.feature.home.view.f(dimensionPixelOffset, recyclerView.getResources().getDimensionPixelOffset(eo1.c.inspirational_badge_margin), dimensionPixelOffset, 2));
                carousel.addView(recyclerView);
                carousel.f48533c = recyclerView;
            }
            if (kh2.r.S(verifiedMerchant)) {
                List P = kh2.r.P(verifiedMerchant);
                rs j16 = verifiedMerchant.j();
                if (j16 != null && (j13 = j16.j()) != null) {
                    str = j13.c();
                }
                RecyclerView recyclerView2 = carousel.f48533c;
                if (recyclerView2 != null) {
                    recyclerView2.H2(new xo.v(P, str, carousel.f48532b));
                }
            }
        }
        bs1.c.U1(carousel);
    }

    public final SpannableStringBuilder e(String text, Drawable icon, int i13, Function0 function0) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dl2.b.Q1() ? a.a.j("  ", text) : a.a.C(text, "  "));
        int length = dl2.b.Q1() ? 0 : spannableStringBuilder.length() - 1;
        int length2 = dl2.b.Q1() ? 1 : spannableStringBuilder.length();
        if (function0 != null) {
            spannableStringBuilder.setSpan(new nk0.b(2, function0), length, length2, 18);
        }
        spannableStringBuilder.setSpan(new ImageSpan(icon, i13), length, length2, 18);
        return spannableStringBuilder;
    }

    public final boolean f(ViewGroup coverMediaContainer) {
        Intrinsics.checkNotNullParameter(coverMediaContainer, "coverMediaContainer");
        Object parent = coverMediaContainer.getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null && coverMediaContainer.getVisibility() == 0 && this.f136846e.e(coverMediaContainer, view);
    }

    public final void g(GestaltAvatar avatar, final wy0 user, final boolean z13, final Function1 onAvatarClicked) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onAvatarClicked, "onAvatarClicked");
        final String uid = user.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (dl2.b.o1(user) && !user.u4().booleanValue()) {
            new r3(z13, uid, s92.o.COMPLETE).i();
        }
        avatar.M2(new gm1.a() { // from class: y31.l
            @Override // gm1.a
            public final void h3(gm1.c event) {
                Function1 onAvatarTapped = Function1.this;
                Intrinsics.checkNotNullParameter(onAvatarTapped, "$onAvatarTapped");
                q this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                wy0 user2 = user;
                Intrinsics.checkNotNullParameter(user2, "$user");
                String userId = uid;
                Intrinsics.checkNotNullParameter(userId, "$userId");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rl1.t) {
                    this$0.f136843b.getClass();
                    onAvatarTapped.invoke(Boolean.valueOf(ll.j.t() && ll.j.r(this$0.f136842a) != null));
                    return;
                }
                if (!(event instanceof rl1.y) || dl2.b.o1(user2) || user2.u4().booleanValue()) {
                    return;
                }
                boolean z14 = event instanceof rl1.u;
                boolean z15 = z13;
                if (z14) {
                    new r3(z15, userId, s92.o.COMPLETE).i();
                }
                if (event instanceof rl1.v) {
                    new r3(z15, userId, s92.o.ERROR).i();
                }
            }
        });
        avatar.H2(new s1.w(user, this, dl2.b.W1(user) && !user.O3().booleanValue(), 14));
    }

    public final void h(GestaltText fullName, n10.d status, rm1.i iconSize, int i13, Function0 onVerifiedStatusClicked) {
        BitmapDrawable C;
        BitmapDrawable bitmapDrawable;
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        Intrinsics.checkNotNullParameter(onVerifiedStatusClicked, "onVerifiedStatusClicked");
        int i14 = m.f136813a[status.ordinal()];
        if (i14 == 1) {
            rm1.d dVar = new rm1.d(new rm1.f(rm1.q.CHECK_CIRCLE_FILL, iconSize), rm1.c.BRAND, null, 0, null, 28);
            Context context = fullName.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C = com.bumptech.glide.d.C(dVar, context);
        } else {
            if (i14 != 2) {
                bitmapDrawable = null;
                u50.i0 i0Var = fullName.l().f108849g;
                Context context2 = fullName.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                CharSequence a13 = i0Var.a(context2);
                if (bitmapDrawable == null && (!kotlin.text.z.j(a13))) {
                    fullName.i(new ja.a(this, a13, bitmapDrawable, i13, status == n10.d.VERIFIED_MERCHANT ? onVerifiedStatusClicked : null, 4));
                    fullName.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
            }
            rm1.d dVar2 = new rm1.d(new rm1.f(rm1.q.CHECK_CIRCLE_FILL, iconSize), rm1.c.INFO, null, 0, null, 28);
            Context context3 = fullName.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            C = com.bumptech.glide.d.C(dVar2, context3);
        }
        bitmapDrawable = C;
        u50.i0 i0Var2 = fullName.l().f108849g;
        Context context22 = fullName.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        CharSequence a132 = i0Var2.a(context22);
        if (bitmapDrawable == null) {
        }
    }

    public final void i(boolean z13, c92.n nVar, ViewGroup viewGroup, View view, Guideline guideline, GestaltButton gestaltButton, a41.m mVar) {
        boolean z14 = z13 && !Intrinsics.d(nVar, h41.a.f67627b);
        bs1.c.R1(viewGroup, z14);
        if (guideline != null) {
            bs1.c.R1(guideline, !z14);
        }
        boolean z15 = z14 && Intrinsics.d(nVar, h41.b.f67628b);
        if (gestaltButton != null) {
            gestaltButton.d(new i31.a(z15, 3));
        }
        boolean z16 = z14 && nVar.a() && !this.f136845d;
        bs1.c.R1(view, z16);
        if (mVar != null) {
            a41.r rVar = mVar.f630a;
            if (z16) {
                a41.l0 l0Var = rVar.f668t1;
                if (l0Var != null) {
                    a41.d0 d0Var = (a41.d0) l0Var;
                    if (d0Var.isBound() && !d0Var.S) {
                        ((a41.r) ((a41.p0) d0Var.getView())).H8(d0Var.t3(true));
                        d0Var.S = true;
                        return;
                    }
                    return;
                }
                return;
            }
            a41.l0 l0Var2 = rVar.f668t1;
            if (l0Var2 != null) {
                a41.d0 d0Var2 = (a41.d0) l0Var2;
                if (d0Var2.isBound() && d0Var2.S) {
                    ((a41.r) ((a41.p0) d0Var2.getView())).H8(d0Var2.t3(false));
                    d0Var2.S = false;
                }
            }
        }
    }
}
