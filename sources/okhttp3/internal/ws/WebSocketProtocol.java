package okhttp3.internal.ws;

import a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.g;
import wo2.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebSocketProtocol {

    /* renamed from: a, reason: collision with root package name */
    public static final WebSocketProtocol f96311a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public static String a(int i13) {
        if (i13 < 1000 || i13 >= 5000) {
            return a.d("Code must be in range [1000,5000): ", i13);
        }
        if ((1004 > i13 || i13 >= 1007) && (1015 > i13 || i13 >= 3000)) {
            return null;
        }
        return a.e("Code ", i13, " is reserved and may not be used.");
    }

    public static void b(g cursor, byte[] key) {
        long j13;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i13 = 0;
        do {
            byte[] bArr = cursor.f130693e;
            int i14 = cursor.f130694f;
            int i15 = cursor.f130695g;
            if (bArr != null) {
                while (i14 < i15) {
                    int i16 = i13 % length;
                    bArr[i14] = (byte) (bArr[i14] ^ key[i16]);
                    i14++;
                    i13 = i16 + 1;
                }
            }
            long j14 = cursor.f130692d;
            j jVar = cursor.f130689a;
            Intrinsics.f(jVar);
            if (j14 == jVar.f130711b) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j13 = cursor.f130692d;
        } while (cursor.c(j13 == -1 ? 0L : j13 + (cursor.f130695g - cursor.f130694f)) != -1);
    }
}
