package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFj1pSDK {

    /* loaded from: classes.dex */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1uSDK.values().length];
            try {
                iArr[AFj1uSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1uSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1uSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }
}
