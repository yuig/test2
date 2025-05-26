package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes.dex */
public final class AFb1cSDK {
    private final AFa1uSDK AFAdRevenueData = new AFa1uSDK() { // from class: com.appsflyer.internal.AFb1cSDK.5
        @Override // com.appsflyer.internal.AFb1cSDK.AFa1uSDK
        public final Class<?> getMonetizationNetwork(String str) {
            return Class.forName(str);
        }
    };

    public enum AFa1tSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String getMediationNetwork;
        final String getRevenue;

        AFa1tSDK(String str, String str2) {
            this.getMediationNetwork = str;
            this.getRevenue = str2;
        }
    }

    public interface AFa1uSDK {
        Class<?> getMonetizationNetwork(String str);
    }

    private boolean getRevenue(String str) {
        try {
            this.AFAdRevenueData.getMonetizationNetwork(str);
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is found.");
            AFLogger.afRDLog(sb3.toString());
            return true;
        } catch (ClassNotFoundException e13) {
            StringBuilder sb4 = new StringBuilder("Class: ");
            sb4.append(str);
            sb4.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb4.toString(), e13, true);
            return false;
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
            return false;
        }
    }

    public final String getMonetizationNetwork() {
        for (AFa1tSDK aFa1tSDK : AFa1tSDK.values()) {
            if (getRevenue(aFa1tSDK.getRevenue)) {
                return aFa1tSDK.getMediationNetwork;
            }
        }
        return AFa1tSDK.DEFAULT.getMediationNetwork;
    }
}
