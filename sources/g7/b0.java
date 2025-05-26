package g7;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class b0 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final int f63752e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f63753f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f63754g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f63755h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f63756i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f63757j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f63758k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f63759l;

    /* renamed from: m, reason: collision with root package name */
    public int f63760m;

    public b0() {
        this(8000);
    }

    @Override // g7.f
    public final void close() {
        this.f63755h = null;
        MulticastSocket multicastSocket = this.f63757j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f63758k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f63757j = null;
        }
        DatagramSocket datagramSocket = this.f63756i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f63756i = null;
        }
        this.f63758k = null;
        this.f63760m = 0;
        if (this.f63759l) {
            this.f63759l = false;
            u();
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        Uri uri = iVar.f63786a;
        this.f63755h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f63755h.getPort();
        v(iVar);
        try {
            this.f63758k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f63758k, port);
            if (this.f63758k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f63757j = multicastSocket;
                multicastSocket.joinGroup(this.f63758k);
                this.f63756i = this.f63757j;
            } else {
                this.f63756i = new DatagramSocket(inetSocketAddress);
            }
            this.f63756i.setSoTimeout(this.f63752e);
            this.f63759l = true;
            w(iVar);
            return -1L;
        } catch (IOException e13) {
            throw new UdpDataSource$UdpDataSourceException(2001, e13);
        } catch (SecurityException e14) {
            throw new UdpDataSource$UdpDataSourceException(2006, e14);
        }
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63755h;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f63760m;
        DatagramPacket datagramPacket = this.f63754g;
        if (i15 == 0) {
            try {
                DatagramSocket datagramSocket = this.f63756i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f63760m = length;
                t(length);
            } catch (SocketTimeoutException e13) {
                throw new UdpDataSource$UdpDataSourceException(2002, e13);
            } catch (IOException e14) {
                throw new UdpDataSource$UdpDataSourceException(2001, e14);
            }
        }
        int length2 = datagramPacket.getLength();
        int i16 = this.f63760m;
        int min = Math.min(i16, i14);
        System.arraycopy(this.f63753f, length2 - i16, bArr, i13, min);
        this.f63760m -= min;
        return min;
    }

    public b0(int i13) {
        super(true);
        this.f63752e = i13;
        byte[] bArr = new byte[2000];
        this.f63753f = bArr;
        this.f63754g = new DatagramPacket(bArr, 0, 2000);
    }
}
