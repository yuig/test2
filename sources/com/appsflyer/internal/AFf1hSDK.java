package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AFf1hSDK<Result> extends AFe1aSDK<AFe1jSDK<Result>> {
    protected final AFe1sSDK areAllFieldsValid;
    public AFe1jSDK<Result> component1;
    private AFb1rSDK component2;
    protected final AFb1gSDK component3;
    public final AFg1qSDK component4;
    private String equals;

    private AFf1hSDK(@NonNull AFf1rSDK aFf1rSDK, @NonNull AFf1rSDK[] aFf1rSDKArr, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFg1qSDK aFg1qSDK, @NonNull AFb1gSDK aFb1gSDK, @NonNull AFb1rSDK aFb1rSDK, String str) {
        super(aFf1rSDK, aFf1rSDKArr, str);
        this.areAllFieldsValid = aFe1sSDK;
        this.component4 = aFg1qSDK;
        this.component3 = aFb1gSDK;
        this.component2 = aFb1rSDK;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final void AFAdRevenueData() {
        super.AFAdRevenueData();
        if (copy()) {
            AFg1qSDK aFg1qSDK = this.component4;
            String str = (String) AFg1qSDK.AFAdRevenueData(new Object[]{aFg1qSDK}, 1235496603, -1235496602, System.identityHashCode(aFg1qSDK));
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            AFe1rSDK<Result> currencyIso4217Code = getCurrencyIso4217Code(str);
            if (currencyIso4217Code != null) {
                getRevenue(currencyIso4217Code.getCurrencyIso4217Code);
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            }
        }
    }

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener areAllFieldsValid();

    public abstract boolean copy();

    public abstract AFe1rSDK<Result> getCurrencyIso4217Code(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1aSDK
    @NonNull
    public AFf1wSDK getCurrencyIso4217Code() {
        if (a_() && this.component4.getRevenue()) {
            AppsFlyerRequestListener areAllFieldsValid = areAllFieldsValid();
            if (areAllFieldsValid != null) {
                areAllFieldsValid.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1tSDK();
        }
        AFg1qSDK aFg1qSDK = this.component4;
        String str = (String) AFg1qSDK.AFAdRevenueData(new Object[]{aFg1qSDK}, 1235496603, -1235496602, System.identityHashCode(aFg1qSDK));
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener areAllFieldsValid2 = areAllFieldsValid();
            if (areAllFieldsValid2 != null) {
                areAllFieldsValid2.onError(41, "No dev key");
            }
            throw new AFf1vSDK();
        }
        AFe1rSDK<Result> currencyIso4217Code = getCurrencyIso4217Code(str);
        if (currencyIso4217Code == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFf1wSDK.FAILURE;
        }
        if (copy()) {
            getRevenue(currencyIso4217Code.getCurrencyIso4217Code);
        }
        AFe1jSDK<Result> AFAdRevenueData = currencyIso4217Code.AFAdRevenueData();
        this.component1 = AFAdRevenueData;
        this.component3.getCurrencyIso4217Code(currencyIso4217Code.getCurrencyIso4217Code.getMonetizationNetwork, AFAdRevenueData.getStatusCode(), AFAdRevenueData.getBody().toString());
        AppsFlyerRequestListener areAllFieldsValid3 = areAllFieldsValid();
        if (areAllFieldsValid3 != null) {
            if (AFAdRevenueData.isSuccessful()) {
                areAllFieldsValid3.onSuccess();
            } else {
                StringBuilder sb3 = new StringBuilder("Status code failure ");
                sb3.append(AFAdRevenueData.getStatusCode());
                areAllFieldsValid3.onError(50, sb3.toString());
            }
        }
        return AFAdRevenueData.isSuccessful() ? AFf1wSDK.SUCCESS : AFf1wSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public void getMediationNetwork() {
        String str;
        if (this.AFAdRevenueData == AFf1wSDK.SUCCESS) {
            String str2 = this.equals;
            if (str2 != null) {
                this.component2.AFAdRevenueData(str2);
                return;
            }
            return;
        }
        if (getRevenue() || (str = this.equals) == null) {
            return;
        }
        this.component2.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public long getMonetizationNetwork() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public boolean getRevenue() {
        if (component4() instanceof AFf1tSDK) {
            return false;
        }
        if (this.AFAdRevenueData == AFf1wSDK.TIMEOUT) {
            return true;
        }
        Throwable component4 = component4();
        return (component4 instanceof IOException) && !(component4 instanceof ParsingException);
    }

    public AFf1hSDK(@NonNull AFf1rSDK aFf1rSDK, @NonNull AFf1rSDK[] aFf1rSDKArr, @NonNull AFd1gSDK aFd1gSDK, String str) {
        this(aFf1rSDK, aFf1rSDKArr, aFd1gSDK.AFAdRevenueData(), aFd1gSDK.AFKeystoreWrapper(), aFd1gSDK.copydefault(), aFd1gSDK.valueOf(), str);
    }

    private void getRevenue(AFe1kSDK aFe1kSDK) {
        String str = this.equals;
        this.equals = this.component2.getMonetizationNetwork(new AFb1jSDK(aFe1kSDK.getMonetizationNetwork, aFe1kSDK.getMonetizationNetwork(), "6.16.0", this.getRevenue));
        if (str != null) {
            this.component2.AFAdRevenueData(str);
        }
    }

    public AFf1hSDK(@NonNull AFf1rSDK aFf1rSDK, @NonNull AFf1rSDK[] aFf1rSDKArr, @NonNull AFd1gSDK aFd1gSDK, String str, String str2) {
        this(aFf1rSDK, aFf1rSDKArr, aFd1gSDK.AFAdRevenueData(), aFd1gSDK.AFKeystoreWrapper(), aFd1gSDK.copydefault(), aFd1gSDK.valueOf(), str);
        this.equals = str2;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final void getCurrencyIso4217Code(Throwable th3) {
        boolean z13 = !(th3 instanceof HttpException);
        if (th3 instanceof AFf1tSDK) {
            AFLogger.INSTANCE.e(AFh1sSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th3, true, false);
        } else {
            AFLogger.INSTANCE.e(AFh1sSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th3)), th3, true, true, z13);
        }
        AppsFlyerRequestListener areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            areAllFieldsValid.onError(40, message);
        }
    }
}
