package com.bugsnag.android;

import android.net.TrafficStats;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f29158a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29159b;

    public b0(u uVar, u1 u1Var) {
        this.f29158a = uVar;
        this.f29159b = u1Var;
    }

    public static HttpURLConnection d(URL url, byte[] bArr, String str, Map map) {
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        if (str != null) {
            httpURLConnection.addRequestProperty("Bugsnag-Integrity", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                httpURLConnection.addRequestProperty(str2, str3);
            }
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bArr);
            Unit unit = Unit.f80348a;
            dl2.b.J(outputStream, null);
            return httpURLConnection;
        } finally {
        }
    }

    public final g0 a(a1 a1Var, androidx.camera.core.impl.x2 x2Var) {
        if (a1Var.a().length > 999700) {
            x0 x0Var = a1Var.f29143c;
            hd.h hVar = a1Var.f29142b;
            if (x0Var == null) {
                File file = a1Var.f29144d;
                Intrinsics.f(file);
                String str = a1Var.f29141a;
                if (str == null) {
                    str = hVar.f68809a;
                }
                x0Var = new v1(file, str, hVar.f68826r).invoke();
                a1Var.f29143c = x0Var;
            }
            int i13 = hVar.f68831w;
            z0 z0Var = x0Var.f29685a;
            Iterator it = z0Var.f29718c.f29687a.entrySet().iterator();
            int i14 = 0;
            int i15 = 0;
            while (it.hasNext()) {
                hd.p h13 = oe.f.h1(i13, dl2.b.u(((Map.Entry) it.next()).getValue()));
                i14 += h13.f68843a;
                i15 += h13.f68844b;
            }
            Iterator it2 = z0Var.f29726k.iterator();
            while (it2.hasNext()) {
                Map map = ((Breadcrumb) it2.next()).impl.f29281c;
                hd.p pVar = map == null ? new hd.p(0, 0) : oe.f.h1(i13, map);
                i14 += pVar.f68843a;
                i15 += pVar.f68844b;
            }
            z0Var.f29731p.l(i14, i15);
            List list = z0Var.f29728m;
            int size = list.size();
            int i16 = hVar.f68830v;
            if (size > i16) {
                list.subList(i16, size).clear();
                list.add(new s3("", "[" + (size - i16) + " threads omitted as the maxReportedThreads limit (" + i16 + ") was exceeded]", ErrorType.UNKNOWN, false, r3.UNKNOWN, new s2(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, hVar.f68816h, hVar.f68826r)));
            }
            a1Var.f29145e = null;
            byte[] a13 = a1Var.a();
            if (a13.length > 999700) {
                int length = a13.length - 999700;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length && (!z0Var.f29726k.isEmpty())) {
                    i17 += hd.l.c((Breadcrumb) z0Var.f29726k.remove(0)).length;
                    i18++;
                }
                u1 u1Var = z0Var.f29717b;
                if (i18 == 1) {
                    z0Var.f29726k.add(new Breadcrumb("Removed to reduce payload size", u1Var));
                } else {
                    List list2 = z0Var.f29726k;
                    StringBuilder sb3 = new StringBuilder("Removed, along with ");
                    sb3.append(i18 - 1);
                    sb3.append(" older breadcrumbs, to reduce payload size");
                    list2.add(new Breadcrumb(sb3.toString(), u1Var));
                }
                z0Var.f29731p.y(i18, i17);
                a1Var.f29145e = null;
                a1Var.a();
            }
        }
        g0 b13 = b(x2Var.f16994a, a1Var.a(), kh2.a1.E(a1Var), x2Var.f16995b);
        this.f29159b.c(Intrinsics.n(b13, "Error API request finished with status "));
        return b13;
    }

    public final g0 b(String str, byte[] bArr, String str2, Map map) {
        u1 u1Var = this.f29159b;
        TrafficStats.setThreadStatsTag(1);
        s sVar = this.f29158a;
        if (sVar != null && !sVar.j()) {
            return g0.UNDELIVERED;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    try {
                        httpURLConnection = d(new URL(str), bArr, str2, map);
                        int responseCode = httpURLConnection.getResponseCode();
                        g0.Companion.getClass();
                        g0 a13 = f0.a(responseCode);
                        c(responseCode, httpURLConnection, a13);
                        httpURLConnection.disconnect();
                        return a13;
                    } catch (Exception e13) {
                        u1Var.a("Unexpected error delivering payload", e13);
                        g0 g0Var = g0.FAILURE;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return g0Var;
                    }
                } catch (IOException e14) {
                    u1Var.a("IOException encountered in request", e14);
                    g0 g0Var2 = g0.UNDELIVERED;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return g0Var2;
                }
            } catch (OutOfMemoryError e15) {
                u1Var.a("Encountered OOM delivering payload, falling back to persist on disk", e15);
                g0 g0Var3 = g0.UNDELIVERED;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return g0Var3;
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th3;
        }
    }

    public final void c(int i13, HttpURLConnection httpURLConnection, g0 g0Var) {
        BufferedReader bufferedReader;
        u1 u1Var = this.f29159b;
        try {
            xk2.q qVar = xk2.s.f135225b;
            u1Var.c("Request completed with code " + i13 + ", message: " + ((Object) httpURLConnection.getResponseMessage()) + ", headers: " + httpURLConnection.getHeaderFields());
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            ue.c.m(th3);
        }
        try {
            Reader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        } catch (Throwable th4) {
            xk2.q qVar3 = xk2.s.f135225b;
            ue.c.m(th4);
        }
        try {
            u1Var.i(Intrinsics.n(kh2.j.z2(bufferedReader), "Received request response: "));
            Unit unit2 = Unit.f80348a;
            dl2.b.J(bufferedReader, null);
            try {
                if (g0Var != g0.DELIVERED) {
                    Reader inputStreamReader2 = new InputStreamReader(httpURLConnection.getErrorStream(), Charsets.UTF_8);
                    bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                    try {
                        u1Var.f(Intrinsics.n(kh2.j.z2(bufferedReader), "Request error details: "));
                        Unit unit3 = Unit.f80348a;
                        dl2.b.J(bufferedReader, null);
                    } finally {
                    }
                }
                Unit unit4 = Unit.f80348a;
            } catch (Throwable th5) {
                xk2.q qVar4 = xk2.s.f135225b;
                ue.c.m(th5);
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
