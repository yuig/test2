package com.google.android.recaptcha.internal;

import a.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzji {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m13;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                m13 = "null";
            } else {
                try {
                    m13 = obj.toString();
                } catch (Exception e13) {
                    String D = a.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(D), (Throwable) e13);
                    m13 = a.m("<", D, " threw ", e13.getClass().getName(), ">");
                }
            }
            objArr[i14] = m13;
            i14++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (indexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i15, indexOf);
            sb3.append(objArr[i13]);
            i15 = indexOf + 2;
            i13++;
        }
        sb3.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
