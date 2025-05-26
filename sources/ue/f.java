package ue;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f121950a;

    /* renamed from: b, reason: collision with root package name */
    public final Currency f121951b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f121952c;

    public f(BigDecimal purchaseAmount, Currency currency, Bundle param) {
        Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(param, "param");
        this.f121950a = purchaseAmount;
        this.f121951b = currency;
        this.f121952c = param;
    }

    public final Currency a() {
        return this.f121951b;
    }

    public final Bundle b() {
        return this.f121952c;
    }

    public final BigDecimal c() {
        return this.f121950a;
    }
}
