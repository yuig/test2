package a8;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import pk.c1;

/* loaded from: classes3.dex */
public final class g0 implements l8.u {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f1339a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1340b = new f0();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f1342d;

    public g0(i0 i0Var, InputStream inputStream) {
        this.f1342d = i0Var;
        this.f1339a = new DataInputStream(inputStream);
    }

    @Override // l8.u
    public final void h() {
        String str;
        while (!this.f1341c) {
            byte readByte = this.f1339a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f1339a.readUnsignedByte();
                int readUnsignedShort = this.f1339a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f1339a.readFully(bArr, 0, readUnsignedShort);
                q0 q0Var = (q0) this.f1342d.f1365c.get(Integer.valueOf(readUnsignedByte));
                if (q0Var != null && !this.f1342d.f1368f) {
                    q0Var.f1450e.add(bArr);
                }
            } else if (this.f1342d.f1368f) {
                continue;
            } else {
                e0 e0Var = this.f1342d.f1363a;
                f0 f0Var = this.f1340b;
                DataInputStream dataInputStream = this.f1339a;
                f0Var.getClass();
                c1 a13 = f0Var.a(f0.b(readByte, dataInputStream));
                while (a13 == null) {
                    if (f0Var.f1324b == 3) {
                        long j13 = f0Var.f1325c;
                        if (j13 <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int r13 = d7.b.r(j13);
                        bf.b.t(r13 != -1);
                        byte[] bArr2 = new byte[r13];
                        dataInputStream.readFully(bArr2, 0, r13);
                        bf.b.t(f0Var.f1324b == 3);
                        if (r13 > 0) {
                            int i13 = r13 - 1;
                            if (bArr2[i13] == 10) {
                                if (r13 > 1) {
                                    int i14 = r13 - 2;
                                    if (bArr2[i14] == 13) {
                                        str = new String(bArr2, 0, i14, i0.f1362g);
                                        ArrayList arrayList = f0Var.f1323a;
                                        arrayList.add(str);
                                        a13 = c1.r(arrayList);
                                        f0Var.f1323a.clear();
                                        f0Var.f1324b = 1;
                                        f0Var.f1325c = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i13, i0.f1362g);
                                ArrayList arrayList2 = f0Var.f1323a;
                                arrayList2.add(str);
                                a13 = c1.r(arrayList2);
                                f0Var.f1323a.clear();
                                f0Var.f1324b = 1;
                                f0Var.f1325c = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    a13 = f0Var.a(f0.b(dataInputStream.readByte(), dataInputStream));
                }
                m mVar = (m) e0Var;
                mVar.f1396a.post(new w2.c(22, mVar, a13));
            }
        }
    }

    @Override // l8.u
    public final void o() {
        this.f1341c = true;
    }
}
