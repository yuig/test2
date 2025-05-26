package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1oSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1eSDK implements AFc1fSDK {
    private boolean AFAdRevenueData;
    Map<String, Object> getCurrencyIso4217Code;

    @NotNull
    private final AFd1oSDK getRevenue;

    /* loaded from: classes3.dex */
    public static final class AFa1zSDK implements AFa1oSDK.AFa1vSDK {
        private /* synthetic */ long getMediationNetwork;

        public AFa1zSDK(long j13) {
            this.getMediationNetwork = j13;
        }

        @Override // com.appsflyer.internal.AFa1oSDK.AFa1vSDK
        public final void AFAdRevenueData(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFc1eSDK.this.getCurrencyIso4217Code;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFc1eSDK.this.getCurrencyIso4217Code) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFc1eSDK aFc1eSDK = AFc1eSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFc1eSDK.getCurrencyIso4217Code;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFc1eSDK.this.getCurrencyIso4217Code;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.getMediationNetwork);
            Map<String, Object> map5 = AFc1eSDK.this.getCurrencyIso4217Code;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1oSDK.AFa1vSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFc1eSDK.this.getCurrencyIso4217Code;
            if (map != null) {
                map.put("error", str);
            }
        }
    }

    public AFc1eSDK(@NotNull AFd1oSDK aFd1oSDK) {
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        this.getRevenue = aFd1oSDK;
    }

    private boolean AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void getMediationNetwork(boolean z13) {
        this.AFAdRevenueData = z13;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final boolean getMonetizationNetwork() {
        if (!AFAdRevenueData()) {
            return false;
        }
        Map<String, Object> map = this.getCurrencyIso4217Code;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void getRevenue() {
        Context context;
        if (AFAdRevenueData() && (context = this.getRevenue.getMonetizationNetwork) != null) {
            this.getCurrencyIso4217Code = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                v vVar = v.f83104a;
                v.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                Method method = ze.c.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, ze.b.class);
                Object newProxyInstance = Proxy.newProxyInstance(ze.b.class.getClassLoader(), new Class[]{ze.b.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1oSDK.2
                    private /* synthetic */ AFa1vSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMediationNetwork;

                    public AnonymousClass2(Class cls, AFa1vSDK aFa1zSDK2) {
                        r1 = cls;
                        r2 = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1vSDK aFa1vSDK = r2;
                            if (aFa1vSDK != null) {
                                aFa1vSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", new Class[0]).invoke(r1.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1vSDK aFa1vSDK2 = r2;
                            if (aFa1vSDK2 != null) {
                                aFa1vSDK2.AFAdRevenueData(str2, str3, str);
                            }
                        } else {
                            AFa1vSDK aFa1vSDK3 = r2;
                            if (aFa1vSDK3 != null) {
                                aFa1vSDK3.AFAdRevenueData(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e13) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e13);
                aFa1zSDK2.getRevenue(e13.toString());
            } catch (IllegalAccessException e14) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e14);
                aFa1zSDK2.getRevenue(e14.toString());
            } catch (NoSuchMethodException e15) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e15);
                aFa1zSDK2.getRevenue(e15.toString());
            } catch (InvocationTargetException e16) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e16);
                aFa1zSDK2.getRevenue(e16.toString());
            }
        }
    }
}
