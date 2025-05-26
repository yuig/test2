package h6;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f67715d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f67716a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.q f67717b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f67718c = 0;

    public g0(com.google.firebase.messaging.q qVar, int i13) {
        this.f67717b = qVar;
        this.f67716a = i13;
    }

    public final int a(int i13) {
        i6.a c13 = c();
        int a13 = c13.a(16);
        if (a13 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c13.f71621b;
        int i14 = a13 + c13.f71620a;
        return byteBuffer.getInt((i13 * 4) + byteBuffer.getInt(i14) + i14 + 4);
    }

    public final int b() {
        i6.a c13 = c();
        int a13 = c13.a(16);
        if (a13 == 0) {
            return 0;
        }
        int i13 = a13 + c13.f71620a;
        return c13.f71621b.getInt(c13.f71621b.getInt(i13) + i13);
    }

    public final i6.a c() {
        ThreadLocal threadLocal = f67715d;
        i6.a aVar = (i6.a) threadLocal.get();
        if (aVar == null) {
            aVar = new i6.a();
            threadLocal.set(aVar);
        }
        i6.b bVar = (i6.b) this.f67717b.f33803a;
        int a13 = bVar.a(6);
        if (a13 != 0) {
            int i13 = a13 + bVar.f71620a;
            int i14 = (this.f67716a * 4) + bVar.f71621b.getInt(i13) + i13 + 4;
            aVar.b(bVar.f71621b.getInt(i14) + i14, bVar.f71621b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(", id:");
        i6.a c13 = c();
        int a13 = c13.a(4);
        sb3.append(Integer.toHexString(a13 != 0 ? c13.f71621b.getInt(a13 + c13.f71620a) : 0));
        sb3.append(", codepoints:");
        int b13 = b();
        for (int i13 = 0; i13 < b13; i13++) {
            sb3.append(Integer.toHexString(a(i13)));
            sb3.append(" ");
        }
        return sb3.toString();
    }
}
