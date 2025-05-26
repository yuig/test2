package w21;

import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lw21/i;", "Lmm1/l;", "<init>", "()V", "bp1/h", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends c {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f127704g0 = 0;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(db0.d.pin_or_spin_selection_cta_sheet_fragment, false, 0, 0, false, true, g.f127687i, 732);
    }

    public final void d8() {
        d7.g.s(Navigation.w1(PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION_CTA_MODAL), f7());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF53438s0() {
        return d4.PIN_OR_SPIN_SELECTION;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        w01.e0 listener = new w01.e0(this, 11);
        Intrinsics.checkNotNullParameter(listener, "listener");
        mm1.k kVar = this.f87627c0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.c(listener);
        final int i13 = 0;
        Y7(new View.OnClickListener(this) { // from class: w21.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f127683b;

            {
                this.f127683b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                i this$0 = this.f127683b;
                switch (i14) {
                    case 0:
                        int i15 = i.f127704g0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.d8();
                        break;
                    default:
                        int i16 = i.f127704g0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.d8();
                        break;
                }
            }
        });
        final int i14 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: w21.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f127683b;

            {
                this.f127683b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                i this$0 = this.f127683b;
                switch (i142) {
                    case 0:
                        int i15 = i.f127704g0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.d8();
                        break;
                    default:
                        int i16 = i.f127704g0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.d8();
                        break;
                }
            }
        };
        mm1.k kVar2 = this.f87627c0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.b(onClickListener);
        a8(h.f127691j);
        Z7(h.f127692k);
    }
}
