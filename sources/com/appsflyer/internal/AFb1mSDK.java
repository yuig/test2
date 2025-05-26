package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1mSDK {
    public static String AFAdRevenueData(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFAdRevenueData(messageDigest.digest());
        } catch (Exception e13) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e13);
            return null;
        }
    }

    private static byte[] getMediationNetwork(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e13) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e13);
            return null;
        }
    }

    public static long getMonetizationNetwork(@NonNull String str) {
        byte[] mediationNetwork = getMediationNetwork(str);
        if (mediationNetwork == null || mediationNetwork.length <= 0) {
            return -1L;
        }
        if (mediationNetwork.length > 8) {
            mediationNetwork = Arrays.copyOfRange(mediationNetwork, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(mediationNetwork);
        allocate.flip();
        return allocate.getLong();
    }

    public static String getRevenue(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFAdRevenueData(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e13) {
            AFLogger.afErrorLog(e13.getMessage(), e13, true);
            return e13.getMessage();
        }
    }

    private static String AFAdRevenueData(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder();
        for (byte b13 : bArr) {
            sb3.append(Integer.toString((b13 & 255) + RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 16).substring(1));
        }
        return sb3.toString();
    }

    public static boolean getMonetizationNetwork(Map<String, Object> map, String[] strArr, AFd1nSDK aFd1nSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String component2 = AFd1nSDK.component2();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(new JSONObject(map));
        sb3.append(component2);
        return getRevenue(sb3.toString(), AFb1iSDK.getMediationNetwork(aFd1nSDK.getRevenue, aFd1nSDK.getCurrencyIso4217Code)).equals(str2);
    }
}
