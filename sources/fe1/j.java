package fe1;

import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.RangeFilterItem;
import com.pinterest.ui.components.rangesliders.RangeSliderBar;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;
import zd1.r;

/* loaded from: classes5.dex */
public final class j extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public r f62062a;

    /* renamed from: b, reason: collision with root package name */
    public final h f62063b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f62064c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62065d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f62066e;

    /* renamed from: f, reason: collision with root package name */
    public int f62067f;

    /* renamed from: g, reason: collision with root package name */
    public int f62068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h rangeUpdateListener, boolean z13, boolean z14, Function0 getRules) {
        super(0);
        Intrinsics.checkNotNullParameter(rangeUpdateListener, "rangeUpdateListener");
        Intrinsics.checkNotNullParameter(getRules, "getRules");
        this.f62062a = null;
        this.f62063b = rangeUpdateListener;
        this.f62064c = z13;
        this.f62065d = z14;
        this.f62066e = getRules;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        de1.j view = (de1.j) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        RangeSliderBar rangeSliderBar = ((RangeFilterItem) view).f48491d;
        rangeSliderBar.getClass();
        Intrinsics.checkNotNullParameter(this, "l");
        rangeSliderBar.H = this;
    }

    public final String p3(int i13) {
        String str;
        String str2;
        String str3;
        if (this.f62064c) {
            r rVar = this.f62062a;
            if (rVar == null || (str3 = rVar.f141753h) == null) {
                str2 = null;
            } else {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setMaximumFractionDigits(0);
                currencyInstance.setCurrency(Currency.getInstance(str3));
                str2 = currencyInstance.format(Integer.valueOf(i13));
            }
            return str2 == null ? String.valueOf(i13) : str2;
        }
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance();
        currencyInstance2.setMaximumFractionDigits(0);
        r rVar2 = this.f62062a;
        if (rVar2 == null || (str = rVar2.f141753h) == null) {
            str = "USD";
        }
        currencyInstance2.setCurrency(Currency.getInstance(str));
        String format = currencyInstance2.format(Integer.valueOf(i13));
        Intrinsics.f(format);
        return format;
    }

    public final void q3() {
        int i13 = this.f62068g;
        r rVar = this.f62062a;
        if (rVar != null) {
            int i14 = rVar.f141750e;
            int i15 = rVar.f141749d;
            if (i13 == i14) {
                i13 = i15;
            }
            if (i13 > i15) {
                i13 = i15;
            }
        }
        int i16 = i13;
        int i17 = this.f62067f;
        int i18 = i17 > i16 ? i16 : i17;
        if (!this.f62064c) {
            this.f62063b.P1(i18, i16);
        } else if (rVar != null) {
            String[] strArr = {rVar.f141754i, rVar.f141755j, rVar.f141756k};
            int i19 = 0;
            while (true) {
                if (i19 >= 3) {
                    ArrayList A = c0.A(strArr);
                    this.f62063b.P2((String) A.get(0), i18, (String) A.get(1), i16, (String) A.get(2));
                    break;
                } else if (strArr[i19] == null) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        r rVar2 = this.f62062a;
        if (rVar2 != null) {
            rVar2.f141752g = this.f62068g;
        }
        if (rVar2 == null) {
            return;
        }
        rVar2.f141751f = this.f62067f;
    }
}
