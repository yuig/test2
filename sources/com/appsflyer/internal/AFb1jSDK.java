package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFb1jSDK {
    public String AFAdRevenueData;
    public AFf1rSDK getCurrencyIso4217Code;
    public String getMediationNetwork;
    String getMonetizationNetwork;
    private byte[] getRevenue;

    public AFb1jSDK(String str, byte[] bArr, String str2, AFf1rSDK aFf1rSDK) {
        this.AFAdRevenueData = str;
        this.getRevenue = bArr;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = aFf1rSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1jSDK.class == obj.getClass()) {
            AFb1jSDK aFb1jSDK = (AFb1jSDK) obj;
            String str = this.getMonetizationNetwork;
            if (str == null ? aFb1jSDK.getMonetizationNetwork != null : !str.equals(aFb1jSDK.getMonetizationNetwork)) {
                return false;
            }
            if (!Arrays.equals(this.getRevenue, aFb1jSDK.getRevenue)) {
                return false;
            }
            String str2 = this.AFAdRevenueData;
            if (str2 == null ? aFb1jSDK.AFAdRevenueData != null : !str2.equals(aFb1jSDK.AFAdRevenueData)) {
                return false;
            }
            String str3 = this.getMediationNetwork;
            if (str3 == null ? aFb1jSDK.getMediationNetwork != null : !str3.equals(aFb1jSDK.getMediationNetwork)) {
                return false;
            }
            if (this.getCurrencyIso4217Code == aFb1jSDK.getCurrencyIso4217Code) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMonetizationNetwork() {
        return this.getRevenue;
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int hashCode = (Arrays.hashCode(this.getRevenue) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMediationNetwork;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1rSDK aFf1rSDK = this.getCurrencyIso4217Code;
        return hashCode3 + (aFf1rSDK != null ? aFf1rSDK.hashCode() : 0);
    }

    public AFb1jSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i13 = 0;
        int i14 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFAdRevenueData = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getMonetizationNetwork = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.getMonetizationNetwork);
                if (matcher.matches()) {
                    i13 = Integer.parseInt(matcher.group(1));
                    i14 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.getRevenue = (i13 > 4 || i14 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.getCurrencyIso4217Code = AFf1rSDK.valueOf(trim2);
                } catch (Exception e13) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e13);
                }
            }
        }
        scanner.close();
    }
}
