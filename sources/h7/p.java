package h7;

import android.util.SparseArray;
import d7.n0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67920a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Cipher f67921b = null;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f67922c = null;

    /* renamed from: d, reason: collision with root package name */
    public final SecureRandom f67923d = null;

    /* renamed from: e, reason: collision with root package name */
    public final qq2.c f67924e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67925f;

    /* renamed from: g, reason: collision with root package name */
    public u f67926g;

    public p(File file) {
        this.f67924e = new qq2.c(file);
    }

    public static int i(n nVar, int i13) {
        int hashCode = nVar.f67911b.hashCode() + (nVar.f67910a * 31);
        if (i13 >= 2) {
            return (hashCode * 31) + nVar.f67914e.hashCode();
        }
        long a13 = r.a(nVar.f67914e);
        return (hashCode * 31) + ((int) (a13 ^ (a13 >>> 32)));
    }

    public static n j(int i13, DataInputStream dataInputStream) {
        s b13;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i13 < 2) {
            long readLong = dataInputStream.readLong();
            tb.l lVar = new tb.l(2);
            lVar.c(Long.valueOf(readLong), "exo_len");
            b13 = s.f67927c.b(lVar);
        } else {
            b13 = androidx.appcompat.widget.x.b(dataInputStream);
        }
        return new n(readInt, readUTF, b13);
    }

    @Override // h7.q
    public final void a(n nVar, boolean z13) {
        this.f67925f = true;
    }

    @Override // h7.q
    public final boolean b() {
        return this.f67924e.f();
    }

    @Override // h7.q
    public final void c(HashMap hashMap) {
        if (this.f67925f) {
            e(hashMap);
        }
    }

    @Override // h7.q
    public final void d(long j13) {
    }

    @Override // h7.q
    public final void e(HashMap hashMap) {
        u uVar;
        DataOutputStream dataOutputStream;
        Cipher cipher = this.f67921b;
        qq2.c cVar = this.f67924e;
        Closeable closeable = null;
        try {
            d7.a s13 = cVar.s();
            u uVar2 = this.f67926g;
            if (uVar2 == null) {
                this.f67926g = new u(s13);
            } else {
                uVar2.a(s13);
            }
            uVar = this.f67926g;
            dataOutputStream = new DataOutputStream(uVar);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            dataOutputStream.writeInt(2);
            boolean z13 = this.f67920a;
            dataOutputStream.writeInt(z13 ? 1 : 0);
            if (z13) {
                byte[] bArr = new byte[16];
                SecureRandom secureRandom = this.f67923d;
                int i13 = n0.f53866a;
                secureRandom.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    cipher.init(1, this.f67922c, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(uVar, cipher));
                } catch (InvalidAlgorithmParameterException e13) {
                    e = e13;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e14) {
                    e = e14;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i14 = 0;
            for (n nVar : hashMap.values()) {
                dataOutputStream.writeInt(nVar.f67910a);
                dataOutputStream.writeUTF(nVar.f67911b);
                androidx.appcompat.widget.x.c(nVar.f67914e, dataOutputStream);
                i14 += i(nVar, 2);
            }
            dataOutputStream.writeInt(i14);
            dataOutputStream.close();
            ((File) cVar.f104884c).delete();
            int i15 = n0.f53866a;
            this.f67925f = false;
        } catch (Throwable th4) {
            th = th4;
            closeable = dataOutputStream;
            n0.g(closeable);
            throw th;
        }
    }

    @Override // h7.q
    public final void f(n nVar) {
        this.f67925f = true;
    }

    @Override // h7.q
    public final void g(HashMap hashMap, SparseArray sparseArray) {
        bf.b.t(!this.f67925f);
        qq2.c cVar = this.f67924e;
        if (cVar.f()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(cVar.p());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f67921b;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f67922c;
                                    int i13 = n0.f53866a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                } catch (InvalidAlgorithmParameterException e13) {
                                    e = e13;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e14) {
                                    e = e14;
                                    throw new IllegalStateException(e);
                                }
                            }
                        } else if (this.f67920a) {
                            this.f67925f = true;
                        }
                        int readInt2 = dataInputStream2.readInt();
                        int i14 = 0;
                        for (int i15 = 0; i15 < readInt2; i15++) {
                            n j13 = j(readInt, dataInputStream2);
                            String str = j13.f67911b;
                            hashMap.put(str, j13);
                            sparseArray.put(j13.f67910a, str);
                            i14 += i(j13, readInt);
                        }
                        int readInt3 = dataInputStream2.readInt();
                        boolean z13 = dataInputStream2.read() == -1;
                        if (readInt3 == i14 && z13) {
                            n0.g(dataInputStream2);
                            return;
                        }
                    }
                    n0.g(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        n0.g(dataInputStream);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    ((File) cVar.f104883b).delete();
                    ((File) cVar.f104884c).delete();
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        n0.g(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                th = th4;
            }
            hashMap.clear();
            sparseArray.clear();
            ((File) cVar.f104883b).delete();
            ((File) cVar.f104884c).delete();
        }
    }

    @Override // h7.q
    public final void h() {
        qq2.c cVar = this.f67924e;
        ((File) cVar.f104883b).delete();
        ((File) cVar.f104884c).delete();
    }
}
