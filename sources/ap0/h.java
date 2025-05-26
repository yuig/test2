package ap0;

import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.api.model.wy0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements xa.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f20308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager f20309b;

    public h(i iVar, ViewPager viewPager) {
        this.f20308a = iVar;
        this.f20309b = viewPager;
    }

    @Override // xa.i
    public final void A5(int i13) {
        String countryCode;
        i iVar = this.f20308a;
        iVar.f20317p0 = i13;
        if (i13 == f.LAST.ordinal()) {
            wk2.a aVar = iVar.f91283h;
            Boolean bool = null;
            if (aVar == null) {
                Intrinsics.r("currentUserProvider");
                throw null;
            }
            wy0 wy0Var = (wy0) aVar.get();
            if (iVar.f20316o0 != null) {
                if (wy0Var == null || (countryCode = wy0Var.G2()) == null) {
                    countryCode = "";
                }
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                bool = Boolean.valueOf(f0.j("AU", "AT", "BE", "BR", "CA", "CY", "CZ", "DK", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LU", "MT", "NL", "NZ", "NO", "PL", "PT", "RO", "SK", "ES", "SE", "CH", "GB", "US").contains(countryCode));
            }
            ((AppCompatButton) this.f20309b.findViewById(vq1.b.onboarding_create_ad_button)).setVisibility(Intrinsics.d(bool, Boolean.TRUE) ? 0 : 8);
        }
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        this.f20308a.f20317p0 = i13;
    }

    @Override // xa.i
    public final void i5(int i13) {
        if (i13 == 0) {
            this.f20308a.s7().z(null);
        }
    }
}
