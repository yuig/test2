package m8;

import android.os.SystemClock;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import l8.w;
import p7.i;
import t5.e;
import v5.x;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f86526a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f86527b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f86528c;

    /* renamed from: d, reason: collision with root package name */
    public static long f86529d;

    public static long a() {
        DatagramSocket datagramSocket;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            Object obj = f86527b;
            synchronized (obj) {
                try {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        try {
                            datagramSocket.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                }
            }
            datagramSocket2.setSoTimeout(1000);
            synchronized (obj) {
                try {
                } catch (Throwable th8) {
                    th = th8;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                }
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b13 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i13], RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
                bArr2[b13] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b13);
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                    datagramSocket = datagramSocket2;
                } else {
                    long j13 = currentTimeMillis / 1000;
                    long j14 = currentTimeMillis - (j13 * 1000);
                    socketTimeoutException = socketTimeoutException2;
                    long j15 = j13 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j15 >> 24);
                    bArr[41] = (byte) (j15 >> 16);
                    datagramSocket = datagramSocket2;
                    bArr[42] = (byte) (j15 >> 8);
                    bArr[43] = (byte) j15;
                    long j16 = (j14 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j16 >> 24);
                    bArr[45] = (byte) (j16 >> 16);
                    bArr[46] = (byte) (j16 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j17 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b14 = bArr3[0];
                    int i15 = bArr3[1] & 255;
                    long e13 = e(24, bArr3);
                    long e14 = e(32, bArr3);
                    long e15 = e(40, bArr3);
                    b((byte) ((b14 >> 6) & 3), (byte) (b14 & 7), i15, e15);
                    long j18 = (j17 + (((e15 - j17) + (e14 - e13)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j18;
                } catch (SocketTimeoutException e16) {
                    SocketTimeoutException socketTimeoutException3 = e16;
                    if (socketTimeoutException != null) {
                        SocketTimeoutException socketTimeoutException4 = socketTimeoutException;
                        socketTimeoutException4.addSuppressed(socketTimeoutException3);
                        socketTimeoutException3 = socketTimeoutException4;
                    }
                    int i16 = i14 + 1;
                    if (i14 >= 10) {
                        socketTimeoutException2 = socketTimeoutException3;
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i13++;
                    i14 = i16;
                    b13 = 0;
                    socketTimeoutException2 = socketTimeoutException3;
                    datagramSocket2 = datagramSocket;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b13, byte b14, int i13, long j13) {
        if (b13 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b14 != 4 && b14 != 5) {
            throw new IOException(a.a.d("SNTP: Untrusted mode: ", b14));
        }
        if (i13 == 0 || i13 > 15) {
            throw new IOException(a.a.d("SNTP: Untrusted stratum: ", i13));
        }
        if (j13 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void c(w wVar, e eVar) {
        boolean z13;
        synchronized (f86527b) {
            z13 = f86528c;
        }
        if (z13) {
            eVar.v();
            return;
        }
        if (wVar == null) {
            wVar = new w("SntpClient");
        }
        wVar.g(new x((v5.w) null), new i(eVar, 1), 1);
    }

    public static long d(int i13, byte[] bArr) {
        int i14 = bArr[i13];
        int i15 = bArr[i13 + 1];
        int i16 = bArr[i13 + 2];
        int i17 = bArr[i13 + 3];
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i14 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i15 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i16 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i17 = (i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        return (i14 << 24) + (i15 << 16) + (i16 << 8) + i17;
    }

    public static long e(int i13, byte[] bArr) {
        long d2 = d(i13, bArr);
        long d13 = d(i13 + 4, bArr);
        if (d2 == 0 && d13 == 0) {
            return 0L;
        }
        return ((d13 * 1000) / 4294967296L) + ((d2 - 2208988800L) * 1000);
    }
}
