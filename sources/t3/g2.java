package t3;

import android.os.Parcel;
import android.util.Base64;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f116005a;

    public g2(String str) {
        Parcel obtain = Parcel.obtain();
        this.f116005a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public long a() {
        Parcel parcel = this.f116005a;
        byte readByte = parcel.readByte();
        long j13 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        if (!n4.n.a(j13, 0L)) {
            return kh2.w.r0(j13, parcel.readFloat());
        }
        n4.n[] nVarArr = n4.m.f89188b;
        return n4.m.f89189c;
    }

    public void b(byte b13) {
        this.f116005a.writeByte(b13);
    }

    public void c(float f13) {
        this.f116005a.writeFloat(f13);
    }

    public void d(long j13) {
        long b13 = n4.m.b(j13);
        byte b14 = 0;
        if (!n4.n.a(b13, 0L)) {
            if (n4.n.a(b13, 4294967296L)) {
                b14 = 1;
            } else if (n4.n.a(b13, 8589934592L)) {
                b14 = 2;
            }
        }
        b(b14);
        if (n4.n.a(n4.m.b(j13), 0L)) {
            return;
        }
        c(n4.m.c(j13));
    }
}
