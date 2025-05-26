package ed0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.h7;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Led0/c;", "Lyk1/k;", "Lcom/pinterest/creatorHub/feature/brandedContent/a;", "<init>", "()V", "brandedContent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends o implements com.pinterest.creatorHub.feature.brandedContent.a {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f58502m0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public h7 f58503j0;

    /* renamed from: k0, reason: collision with root package name */
    public dd0.b f58504k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f58505l0;

    public c() {
        this.E = pd0.b.branded_content_agreement;
        this.f58505l0 = d4.BRANDED_CONTENT_TERMS;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        h7 h7Var = this.f58503j0;
        if (h7Var != null) {
            return h7Var.a(p7());
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF27566e0() {
        return this.f58505l0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 0;
        ((GestaltButton) v13.findViewById(pd0.a.branded_content_tos_button)).d(b.f58498j).e(new gm1.a(this) { // from class: ed0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f58497b;

            {
                this.f58497b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                c this$0 = this.f58497b;
                switch (i14) {
                    case 0:
                        int i15 = c.f58502m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        dd0.b bVar = this$0.f58504k0;
                        if (bVar != null) {
                            bVar.p3();
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f58502m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltIconButton) v13.findViewById(pd0.a.close_button)).u(new gm1.a(this) { // from class: ed0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f58497b;

            {
                this.f58497b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                c this$0 = this.f58497b;
                switch (i142) {
                    case 0:
                        int i15 = c.f58502m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        dd0.b bVar = this$0.f58504k0;
                        if (bVar != null) {
                            bVar.p3();
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f58502m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
