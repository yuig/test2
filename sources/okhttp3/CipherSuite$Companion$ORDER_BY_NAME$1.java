package okhttp3;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"okhttp3/CipherSuite$Companion$ORDER_BY_NAME$1", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7.length()
            int r1 = r8.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 4
        L1b:
            r2 = 1
            r3 = -1
            if (r1 >= r0) goto L34
            char r4 = r7.charAt(r1)
            char r5 = r8.charAt(r1)
            if (r4 == r5) goto L31
            int r7 = kotlin.jvm.internal.Intrinsics.i(r4, r5)
            if (r7 >= 0) goto L42
        L2f:
            r2 = r3
            goto L42
        L31:
            int r1 = r1 + 1
            goto L1b
        L34:
            int r7 = r7.length()
            int r8 = r8.length()
            if (r7 == r8) goto L41
            if (r7 >= r8) goto L42
            goto L2f
        L41:
            r2 = 0
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1.compare(java.lang.Object, java.lang.Object):int");
    }
}
