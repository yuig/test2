package ue;

import android.os.Bundle;
import android.util.Log;
import df.a0;
import df.c0;
import df.e0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.o0;
import le.v;
import me.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final r f121953a = new r(v.a());

    public static final boolean a() {
        c0 b13 = e0.b(v.b());
        return b13 != null && o0.b() && b13.f54732i;
    }

    public static final void b(String purchase, String skuDetails, boolean z13) {
        f fVar;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (a()) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(purchase);
                JSONObject jSONObject2 = new JSONObject(skuDetails);
                Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
                bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
                bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
                bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
                String optString = jSONObject2.optString("type");
                bundle.putCharSequence("fb_iap_product_type", optString);
                if (Intrinsics.d(optString, "subs")) {
                    bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                    bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                    bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                    String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                    Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                    if (introductoryPriceCycles.length() != 0) {
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
                }
                BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
                Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
                Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                fVar = new f(bigDecimal, currency, bundle);
            } catch (JSONException e13) {
                Log.e("ue.g", "Error parsing in-app subscription data.", e13);
                fVar = null;
            }
            if (fVar == null) {
                return;
            }
            r rVar = f121953a;
            if (z13) {
                AtomicBoolean atomicBoolean = a0.f54697a;
                if (a0.b("app_events_if_auto_log_subs", v.b(), false)) {
                    String str = se.h.f112358a.j(skuDetails) ? "StartTrial" : "Subscribe";
                    BigDecimal c13 = fVar.c();
                    Currency a13 = fVar.a();
                    Bundle b13 = fVar.b();
                    rVar.getClass();
                    if (o0.b()) {
                        me.m mVar = rVar.f87020a;
                        mVar.getClass();
                        if (p001if.a.b(mVar) || c13 == null || a13 == null) {
                            return;
                        }
                        if (b13 == null) {
                            try {
                                b13 = new Bundle();
                            } catch (Throwable th3) {
                                p001if.a.a(mVar, th3);
                                return;
                            }
                        }
                        Bundle bundle2 = b13;
                        bundle2.putString("fb_currency", a13.getCurrencyCode());
                        mVar.e(str, Double.valueOf(c13.doubleValue()), bundle2, true, b.b());
                        return;
                    }
                    return;
                }
            }
            BigDecimal c14 = fVar.c();
            Currency a14 = fVar.a();
            Bundle b14 = fVar.b();
            rVar.getClass();
            v vVar = v.f83104a;
            if (o0.b()) {
                me.m mVar2 = rVar.f87020a;
                mVar2.getClass();
                if (p001if.a.b(mVar2)) {
                    return;
                }
                try {
                    mVar2.g(c14, a14, b14);
                } catch (Throwable th4) {
                    p001if.a.a(mVar2, th4);
                }
            }
        }
    }
}
