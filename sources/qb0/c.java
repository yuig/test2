package qb0;

import java.io.EOFException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import wo2.m;

/* loaded from: classes.dex */
public final class c extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public Integer f103393d;

    /* renamed from: e, reason: collision with root package name */
    public m f103394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f103395f;

    public c(e eVar) {
        this.f103395f = eVar;
    }

    @Override // hb0.c
    public final void c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        if (nextElement instanceof Inet6Address) {
                            byte[] data = nextElement.getAddress();
                            m mVar = m.f130712d;
                            Intrinsics.checkNotNullParameter(data, "data");
                            byte[] copyOf = Arrays.copyOf(data, data.length);
                            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                            this.f103394e = new m(copyOf);
                            return;
                        }
                        if (nextElement instanceof Inet4Address) {
                            wo2.j jVar = new wo2.j();
                            jVar.U(nextElement.getAddress());
                            this.f103393d = Integer.valueOf(jVar.readInt());
                            return;
                        }
                    }
                }
            }
        } catch (EOFException | NullPointerException | SocketException unused) {
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // hb0.d
    public final void e() {
        Integer num = this.f103393d;
        e eVar = this.f103395f;
        eVar.f103397a = num;
        eVar.f103398b = this.f103394e;
    }
}
