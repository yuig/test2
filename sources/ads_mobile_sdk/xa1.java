package ads_mobile_sdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class xa1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13552a;

    static {
        char[] cArr = new char[80];
        f13552a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
    
        if (((java.lang.Boolean) ads_mobile_sdk.sj0.a(r13, r19, new java.lang.Object[0])).booleanValue() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d9, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0198, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(a.xe r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa1.a(a.xe, java.lang.StringBuilder, int):void");
    }

    public static void a(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        int i14 = i13;
        while (true) {
            int i15 = 80;
            if (i14 <= 0) {
                break;
            }
            char[] cArr = f13552a;
            if (i14 <= 80) {
                i15 = i14;
            }
            sb3.append(cArr, 0, i15);
            i14 -= i15;
        }
        if (!str.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Character.toLowerCase(str.charAt(0)));
            for (int i16 = 1; i16 < str.length(); i16++) {
                char charAt = str.charAt(i16);
                if (Character.isUpperCase(charAt)) {
                    sb4.append("_");
                }
                sb4.append(Character.toLowerCase(charAt));
            }
            str = sb4.toString();
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            gl glVar = il.f6431b;
            sb3.append(kh2.d.c(new gl(((String) obj).getBytes(hw0.f6126a))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof il) {
            sb3.append(": \"");
            sb3.append(kh2.d.c((il) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof sj0) {
            sb3.append(" {");
            a((sj0) obj, sb3, i13 + 2);
            sb3.append("\n");
            while (i13 > 0) {
                char[] cArr2 = f13552a;
                int i17 = i13 > 80 ? 80 : i13;
                sb3.append(cArr2, 0, i17);
                i13 -= i17;
            }
            sb3.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb3.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i18 = i13 + 2;
            a(sb3, i18, "key", entry.getKey());
            a(sb3, i18, "value", entry.getValue());
            sb3.append("\n");
            while (i13 > 0) {
                char[] cArr3 = f13552a;
                int i19 = i13 > 80 ? 80 : i13;
                sb3.append(cArr3, 0, i19);
                i13 -= i19;
            }
            sb3.append("}");
            return;
        }
        sb3.append(": ");
        sb3.append(obj);
    }
}
