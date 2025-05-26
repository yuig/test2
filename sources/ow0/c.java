package ow0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import cp1.p;
import dh0.d;
import h32.d4;
import i32.y0;
import is1.l;
import k22.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import nx.d0;
import pk.a0;
import rg0.n;
import rg0.s;
import xk2.v;
import yk1.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Low0/c;", "Lyk1/k;", "Lcom/pinterest/feature/location/a;", "<init>", "()V", "locationRequest_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends k implements com.pinterest.feature.location.a {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f97921m0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public s f97922e0;

    /* renamed from: f0, reason: collision with root package name */
    public m f97923f0;

    /* renamed from: g0, reason: collision with root package name */
    public l f97924g0;

    /* renamed from: h0, reason: collision with root package name */
    public q f97925h0;

    /* renamed from: i0, reason: collision with root package name */
    public n f97926i0;

    /* renamed from: k0, reason: collision with root package name */
    public nw0.a f97928k0;

    /* renamed from: j0, reason: collision with root package name */
    public final v f97927j0 = xk2.m.b(new au0.a(this, 15));

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f97929l0 = d4.MODAL;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        a0.i1(window);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        super.L7();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.d1(E4);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        n nVar = this.f97926i0;
        if (nVar == null) {
            Intrinsics.r("experience");
            throw null;
        }
        d0 s73 = s7();
        m mVar = this.f97923f0;
        if (mVar == null) {
            Intrinsics.r("userService");
            throw null;
        }
        l lVar = this.f97924g0;
        if (lVar != null) {
            return new nw0.a(nVar, s73, mVar, lVar);
        }
        Intrinsics.r("locationUtils");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73869c0() {
        return this.f97929l0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        s sVar = this.f97922e0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        n b13 = ((d) sVar).b(y0.ANDROID_HOME_FEED_TAKEOVER);
        if (b13 != null) {
            if (b13.f108060b == i32.l.ANDROID_HOMEFEED_LOCATION_UPSELL.getValue()) {
                this.f97926i0 = b13;
                super.onCreate(bundle);
                this.E = xs1.b.fragment_location_permission;
                return;
            }
        }
        b6().o("Location up-sell ExperienceValue is missing in LocationPermissionFragment.", new IllegalStateException("Location up-sell ExperienceValue is missing in LocationPermissionFragment."));
        D5();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        mw0.a aVar = (mw0.a) this.f97927j0.getValue();
        if (aVar != null) {
            super.onViewCreated(v13, bundle);
            Context context = v13.getContext();
            int i13 = eo1.b.color_black_900;
            Object obj = d5.a.f53679a;
            context.getColor(i13);
            View findViewById = v13.findViewById(xs1.a.welcome_back);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            a0.p((GestaltText) findViewById, aVar.b());
            View findViewById2 = v13.findViewById(xs1.a.disclaimer);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            a0.p((GestaltText) findViewById2, aVar.a());
            View findViewById3 = v13.findViewById(xs1.a.title);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            a0.p((GestaltText) findViewById3, aVar.d());
            View findViewById4 = v13.findViewById(xs1.a.subtitle);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            a0.p((GestaltText) findViewById4, aVar.c());
            final int i14 = 0;
            ((GestaltButton) v13.findViewById(xs1.a.grant_button)).d(new b(aVar, i14)).e(new gm1.a(this) { // from class: ow0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f97918b;

                {
                    this.f97918b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    c this$0 = this.f97918b;
                    switch (i15) {
                        case 0:
                            int i16 = c.f97921m0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            nw0.a aVar2 = this$0.f97928k0;
                            if (aVar2 != null) {
                                q qVar = this$0.f97925h0;
                                if (qVar == null) {
                                    Intrinsics.r("prefsManagerPersisted");
                                    throw null;
                                }
                                FragmentActivity E4 = this$0.E4();
                                Intrinsics.g(E4, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
                                aVar2.q3(qVar, (p) E4);
                                return;
                            }
                            return;
                        default:
                            int i17 = c.f97921m0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            nw0.a aVar3 = this$0.f97928k0;
                            if (aVar3 != null) {
                                aVar3.p3();
                                return;
                            }
                            return;
                    }
                }
            });
            final int i15 = 1;
            if (((GestaltButton) v13.findViewById(xs1.a.deny_button)).d(new b(aVar, i15)).e(new gm1.a(this) { // from class: ow0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f97918b;

                {
                    this.f97918b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i15;
                    c this$0 = this.f97918b;
                    switch (i152) {
                        case 0:
                            int i16 = c.f97921m0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            nw0.a aVar2 = this$0.f97928k0;
                            if (aVar2 != null) {
                                q qVar = this$0.f97925h0;
                                if (qVar == null) {
                                    Intrinsics.r("prefsManagerPersisted");
                                    throw null;
                                }
                                FragmentActivity E4 = this$0.E4();
                                Intrinsics.g(E4, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
                                aVar2.q3(qVar, (p) E4);
                                return;
                            }
                            return;
                        default:
                            int i17 = c.f97921m0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            nw0.a aVar3 = this$0.f97928k0;
                            if (aVar3 != null) {
                                aVar3.p3();
                                return;
                            }
                            return;
                    }
                }
            }) != null) {
                return;
            }
        }
        b6().o("Location up-sell LocationRequestExperience is missing in LocationPermissionFragment.", new IllegalStateException("Location up-sell LocationRequestExperience is missing in LocationPermissionFragment."));
        D5();
        Unit unit = Unit.f80348a;
    }
}
