package b51;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import uj2.q;
import x02.x2;
import yk1.m;
import yk1.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb51/e;", "Lyk1/k;", "Lb51/c;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a implements c {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f21995q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f21996j0;

    /* renamed from: k0, reason: collision with root package name */
    public k f21997k0;

    /* renamed from: l0, reason: collision with root package name */
    public v f21998l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f21999m0;

    /* renamed from: n0, reason: collision with root package name */
    public b f22000n0;

    /* renamed from: o0, reason: collision with root package name */
    public final d4 f22001o0 = d4.USER;

    /* renamed from: p0, reason: collision with root package name */
    public final a4 f22002p0 = a4.USER_OTHERS;

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation == null) {
            return;
        }
        String g23 = navigation.g2("com.pinterest.EXTRA_USER_ID", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        this.f21999m0 = g23;
    }

    @Override // yk1.k
    public final m V7() {
        String str = this.f21999m0;
        if (str == null) {
            Intrinsics.r("userId");
            throw null;
        }
        x2 A7 = A7();
        k kVar = this.f21997k0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        v vVar = this.f21998l0;
        if (vVar == null) {
            Intrinsics.r("viewResources");
            throw null;
        }
        q p73 = p7();
        uk1.e eVar = this.f21996j0;
        if (eVar != null) {
            return new h(str, A7, kVar, vVar, p73, ((uk1.a) eVar).g());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getD0() {
        return this.f22002p0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF111517j0() {
        return this.f22001o0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = nz1.d.report_profile_spam_fragment;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        GestaltIconButton gestaltIconButton;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 0;
        ((GestaltButton) v13.findViewById(nz1.c.report_button)).e(new gm1.a(this) { // from class: b51.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f21994b;

            {
                this.f21994b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                e this$0 = this.f21994b;
                switch (i14) {
                    case 0:
                        int i15 = e.f21995q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b bVar = this$0.f22000n0;
                        if (bVar != null) {
                            ((h) bVar).p3();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.f21995q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.D5();
                            break;
                        }
                        break;
                }
            }
        });
        View view = getView();
        if (view == null || (gestaltIconButton = (GestaltIconButton) view.findViewById(nz1.c.report_profile_spam_cancel)) == null) {
            return;
        }
        final int i14 = 1;
        gestaltIconButton.u(new gm1.a(this) { // from class: b51.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f21994b;

            {
                this.f21994b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                e this$0 = this.f21994b;
                switch (i142) {
                    case 0:
                        int i15 = e.f21995q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b bVar = this$0.f22000n0;
                        if (bVar != null) {
                            ((h) bVar).p3();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.f21995q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.D5();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
