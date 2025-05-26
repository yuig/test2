package xa1;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxa1/t;", "Lyk1/k;", "Lva1/g;", "<init>", "()V", "menu_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class t extends d implements va1.g {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f134480o0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f134481j0;

    /* renamed from: k0, reason: collision with root package name */
    public wa1.a f134482k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f134483l0 = d4.ALERT_SHEET;

    /* renamed from: m0, reason: collision with root package name */
    public final a4 f134484m0 = a4.PRIVACY_BLOCKER_ALERT;

    /* renamed from: n0, reason: collision with root package name */
    public rg0.n f134485n0;

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f134481j0;
        if (eVar != null) {
            return new wa1.a(((uk1.a) eVar).g(), p7(), f7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF70594r0() {
        return this.f134484m0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF141641h0() {
        return this.f134483l0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = d52.b.android_privacy_modal;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f134482k0 = null;
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        eg0.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view != null) {
            Navigation navigation = this.I;
            Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_PRIVACY_MODAL_EXPERIENCE_VALUE_BLOCKING") : null;
            Intrinsics.g(i03, "null cannot be cast to non-null type com.pinterest.experience.ExperienceValue");
            rg0.n nVar = (rg0.n) i03;
            this.f134485n0 = nVar;
            List list = (List) nVar.f108071m.f85200e;
            if (list != null) {
                final int i13 = 0;
                eg0.b bVar = (eg0.b) list.get(0);
                if (bVar != null && (aVar = bVar.f58879f) != null) {
                    View findViewById = view.findViewById(d52.a.tv_modal_title);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    a0.q((GestaltText) findViewById, bs1.c.h2(aVar.a()));
                    ((GestaltText) view.findViewById(d52.a.tv_modal_description)).i(new s(aVar, i13));
                    GestaltButton gestaltButton = (GestaltButton) view.findViewById(d52.a.bt_complete);
                    final int i14 = 1;
                    gestaltButton.d(new s(aVar, i14));
                    gestaltButton.e(new gm1.a(this) { // from class: xa1.r

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t f134477b;

                        {
                            this.f134477b = this;
                        }

                        @Override // gm1.a
                        public final void h3(gm1.c it) {
                            int i15 = i13;
                            t this$0 = this.f134477b;
                            switch (i15) {
                                case 0:
                                    int i16 = t.f134480o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    wa1.a aVar2 = this$0.f134482k0;
                                    if (aVar2 != null) {
                                        aVar2.p3();
                                        break;
                                    }
                                    break;
                                default:
                                    int i17 = t.f134480o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    wa1.a aVar3 = this$0.f134482k0;
                                    if (aVar3 != null) {
                                        aVar3.q3();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    GestaltButton gestaltButton2 = (GestaltButton) view.findViewById(d52.a.bt_dismiss);
                    gestaltButton2.d(new s(aVar, 2));
                    gestaltButton2.e(new gm1.a(this) { // from class: xa1.r

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t f134477b;

                        {
                            this.f134477b = this;
                        }

                        @Override // gm1.a
                        public final void h3(gm1.c it) {
                            int i15 = i14;
                            t this$0 = this.f134477b;
                            switch (i15) {
                                case 0:
                                    int i16 = t.f134480o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    wa1.a aVar2 = this$0.f134482k0;
                                    if (aVar2 != null) {
                                        aVar2.p3();
                                        break;
                                    }
                                    break;
                                default:
                                    int i17 = t.f134480o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    wa1.a aVar3 = this$0.f134482k0;
                                    if (aVar3 != null) {
                                        aVar3.q3();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }
        super.onViewCreated(view, bundle);
    }
}
