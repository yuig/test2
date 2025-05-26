package okhttp3.internal.http2;

import a.a;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;
import okhttp3.internal.Util;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f96042a = new Http2();

    /* renamed from: b, reason: collision with root package name */
    public static final m f96043b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f96044c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f96045d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f96046e;

    static {
        m mVar = m.f130712d;
        f96043b = f0.h0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f96044c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f96045d = new String[64];
        String[] strArr = new String[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        for (int i13 = 0; i13 < 256; i13++) {
            String binaryString = Integer.toBinaryString(i13);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i13] = z.m(Util.i("%8s", binaryString), ' ', '0');
        }
        f96046e = strArr;
        String[] strArr2 = f96045d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i14 = iArr[0];
        strArr2[i14 | 8] = a.p(new StringBuilder(), strArr2[i14], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = iArr2[i15];
            int i17 = iArr[0];
            String[] strArr3 = f96045d;
            int i18 = i17 | i16;
            strArr3[i18] = strArr3[i17] + '|' + strArr3[i16];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strArr3[i17]);
            sb3.append('|');
            strArr3[i18 | 8] = a.p(sb3, strArr3[i16], "|PADDED");
        }
        int length = f96045d.length;
        for (int i19 = 0; i19 < length; i19++) {
            String[] strArr4 = f96045d;
            if (strArr4[i19] == null) {
                strArr4[i19] = f96046e[i19];
            }
        }
    }

    private Http2() {
    }

    public static String a(int i13) {
        String[] strArr = f96044c;
        return i13 < strArr.length ? strArr[i13] : Util.i("0x%02x", Integer.valueOf(i13));
    }

    public static String b(boolean z13, int i13, int i14, int i15, int i16) {
        String str;
        String str2;
        String a13 = a(i15);
        if (i16 == 0) {
            str = "";
        } else {
            String[] strArr = f96046e;
            if (i15 != 2 && i15 != 3) {
                if (i15 == 4 || i15 == 6) {
                    str = i16 == 1 ? "ACK" : strArr[i16];
                } else if (i15 != 7 && i15 != 8) {
                    String[] strArr2 = f96045d;
                    if (i16 < strArr2.length) {
                        str2 = strArr2[i16];
                        Intrinsics.f(str2);
                    } else {
                        str2 = strArr[i16];
                    }
                    str = (i15 != 5 || (i16 & 4) == 0) ? (i15 != 0 || (i16 & 32) == 0) ? str2 : z.n(str2, "PRIORITY", "COMPRESSED") : z.n(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i16];
        }
        return Util.i("%s 0x%08x %5d %-13s %s", z13 ? "<<" : ">>", Integer.valueOf(i13), Integer.valueOf(i14), a13, str);
    }
}
