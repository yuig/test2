package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFa1ySDK {
    private static AFa1ySDK getMonetizationNetwork;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFa1ySDK.5
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    public enum AFa1uSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMediationNetwork;

        AFa1uSDK(String str) {
            this.getMediationNetwork = str;
        }
    }

    /* loaded from: classes3.dex */
    public enum AFa1zSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getCurrencyIso4217Code;

        AFa1zSDK(String str) {
            this.getCurrencyIso4217Code = str;
        }
    }

    private AFa1ySDK() {
    }

    private static boolean AFAdRevenueData(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static AFa1ySDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFa1ySDK();
        }
        return getMonetizationNetwork;
    }

    private AFa1jSDK getMonetizationNetwork() {
        AFa1jSDK aFa1jSDK = new AFa1jSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String monetizationNetwork = getMonetizationNetwork(entry.getValue());
                if (monetizationNetwork != null && !monetizationNetwork.equals("")) {
                    aFa1jSDK.getMediationNetwork(entry.getKey(), monetizationNetwork);
                }
            }
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e13);
        }
        return aFa1jSDK;
    }

    public final Object getCurrencyIso4217Code(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!getMediationNetwork(str)) {
                }
                AFa1jSDK aFa1jSDK = new AFa1jSDK();
                aFa1jSDK.getMediationNetwork("pr", getMonetizationNetwork());
                aFa1jSDK.getMediationNetwork("an", getMediationNetwork(context));
                return aFa1jSDK;
            } catch (Exception e13) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e13);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFa1jSDK aFa1jSDK2 = new AFa1jSDK();
        aFa1jSDK2.getMediationNetwork("pr", getMonetizationNetwork());
        aFa1jSDK2.getMediationNetwork("an", getMediationNetwork(context));
        return aFa1jSDK2;
    }

    private static String AFAdRevenueData() {
        StringBuilder sb3 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i13 = 0;
            int i14 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i14 <= 2) {
                        i14++;
                        sb3.append(AFa1zSDK.XPOSED.getCurrencyIso4217Code);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb3.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb3.append("+h");
                        }
                        sb3.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i13++;
                    }
                }
            }
            if (i13 > 1) {
                sb3.append("mz;");
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th3);
        }
        try {
            StringBuilder sb4 = new StringBuilder("/proc/");
            sb4.append(Process.myPid());
            sb4.append("/maps");
            if (getMediationNetwork(sb4.toString(), "frida")) {
                sb3.append(AFa1zSDK.FRIDA.getCurrencyIso4217Code);
                if (Build.VERSION.SDK_INT < 29 && getMediationNetwork("/proc/net/tcp", "69A2")) {
                    sb3.append("+prt");
                }
            }
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e13);
            sb3.append(e13.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb3.append(";");
        return sb3.toString();
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private AFa1jSDK getMediationNetwork(Context context) {
        AFa1jSDK aFa1jSDK = new AFa1jSDK();
        try {
            aFa1jSDK.getMediationNetwork(AFa1uSDK.HOOKING.getMediationNetwork, AFAdRevenueData());
            aFa1jSDK.getMediationNetwork.put(AFa1jSDK.getMediationNetwork(AFa1uSDK.DEBUGGABLE.getMediationNetwork), Boolean.valueOf(AFAdRevenueData(context)));
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th3);
        }
        return aFa1jSDK;
    }

    @SuppressLint({"PrivateApi"})
    private static String getMonetizationNetwork(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e13);
            return null;
        }
    }

    private static boolean getMediationNetwork(String str, String str2) {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e13) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e13);
            throw new Exception("FNF");
        } catch (IOException e14) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e14);
            throw new Exception("IOF");
        } catch (Exception e15) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e15);
            throw new Exception("GF");
        }
    }
}
