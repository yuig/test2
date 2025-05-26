package ed0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.s;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led0/k;", "Lnl1/d;", "<init>", "()V", "brandedContent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f58517f0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public wk2.a f58518c0;

    /* renamed from: d0, reason: collision with root package name */
    public final j f58519d0 = new j(this);

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f58520e0;

    public k() {
        this.E = pd0.b.branded_content_enrolled;
        this.f58520e0 = d4.BRANDED_CONTENT_ENROLLED;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ScreenDescription w13;
        s sVar = this.f91293r;
        if (sVar != null && (w13 = sVar.w(1)) != null && Intrinsics.d(w13.getScreenClass(), BrandedContentLocation.BRANDED_CONTENT_AGREEMENT.getF44776a())) {
            sVar.z(w13);
        }
        nl1.d.J7();
        return false;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF58520e0() {
        return this.f58520e0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        f7().j(this.f58519d0);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f7().h(this.f58519d0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltText gestaltText = (GestaltText) v13.findViewById(pd0.a.branded_content_enrolled_detail_1);
        final int i13 = 1;
        gestaltText.i(new c2(gestaltText, 1));
        GestaltText gestaltText2 = (GestaltText) v13.findViewById(pd0.a.branded_content_enrolled_detail_2);
        gestaltText2.i(new c2(gestaltText2, 2));
        GestaltText gestaltText3 = (GestaltText) v13.findViewById(pd0.a.branded_content_enrolled_detail_3);
        gestaltText3.i(new c2(gestaltText3, 3));
        final int i14 = 0;
        ((GestaltIconButton) v13.findViewById(pd0.a.screen_setting_button)).u(new gm1.a(this) { // from class: ed0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f58515b;

            {
                this.f58515b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                k this$0 = this.f58515b;
                switch (i15) {
                    case 0:
                        int i16 = k.f58517f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            wk2.a aVar = this$0.f58518c0;
                            if (aVar == null) {
                                Intrinsics.r("fragmentProvider");
                                throw null;
                            }
                            n nVar = (n) aVar.get();
                            nVar.setArguments(new Bundle());
                            nVar.S6(this$0.getChildFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        int i17 = k.f58517f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            return;
                        }
                        return;
                }
            }
        });
        ((GestaltIconButton) v13.findViewById(pd0.a.screen_back_button)).u(new gm1.a(this) { // from class: ed0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f58515b;

            {
                this.f58515b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                k this$0 = this.f58515b;
                switch (i15) {
                    case 0:
                        int i16 = k.f58517f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            wk2.a aVar = this$0.f58518c0;
                            if (aVar == null) {
                                Intrinsics.r("fragmentProvider");
                                throw null;
                            }
                            n nVar = (n) aVar.get();
                            nVar.setArguments(new Bundle());
                            nVar.S6(this$0.getChildFragmentManager(), null);
                            return;
                        }
                        return;
                    default:
                        int i17 = k.f58517f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
