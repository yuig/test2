package org.chromium.url;

import java.net.IDN;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class IDNStringUtil {
    @CalledByNative
    public static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
