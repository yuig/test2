package androidx.fragment.app;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import oi.d4;
import oi.g4;
import oi.u4;
import oi.y3;

/* loaded from: classes3.dex */
public final class n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18385b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18386c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18387d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18388e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18389f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18390g;

    public /* synthetic */ n1(Object obj, int i13, Serializable serializable, Object obj2, Object obj3, Object obj4, int i14) {
        this.f18384a = i14;
        this.f18390g = obj;
        this.f18385b = i13;
        this.f18386c = serializable;
        this.f18387d = obj2;
        this.f18388e = obj3;
        this.f18389f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18384a) {
            case 0:
                break;
            case 1:
                g4 g4Var = ((u4) ((y3) this.f18390g).f24333a).f95204h;
                u4.c(g4Var);
                if (!g4Var.f94712b) {
                    Log.println(6, ((y3) this.f18390g).D(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                y3 y3Var = (y3) this.f18390g;
                if (y3Var.f95265c == 0) {
                    oi.e l13 = y3Var.l();
                    if (l13.f94735d == null) {
                        synchronized (l13) {
                            try {
                                if (l13.f94735d == null) {
                                    ApplicationInfo applicationInfo = l13.zza().getApplicationInfo();
                                    String a13 = oh.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        l13.f94735d = Boolean.valueOf(str != null && str.equals(a13));
                                    }
                                    if (l13.f94735d == null) {
                                        l13.f94735d = Boolean.TRUE;
                                        l13.zzj().f95268f.c("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (l13.f94735d.booleanValue()) {
                        ((y3) this.f18390g).f95265c = 'C';
                    } else {
                        ((y3) this.f18390g).f95265c = 'c';
                    }
                }
                y3 y3Var2 = (y3) this.f18390g;
                if (y3Var2.f95266d < 0) {
                    y3Var2.f95266d = 82001L;
                }
                char charAt = "01VDIWEA?".charAt(this.f18385b);
                y3 y3Var3 = (y3) this.f18390g;
                char c13 = y3Var3.f95265c;
                long j13 = y3Var3.f95266d;
                String u13 = y3.u(true, (String) this.f18386c, this.f18387d, this.f18388e, this.f18389f);
                StringBuilder sb3 = new StringBuilder("2");
                sb3.append(charAt);
                sb3.append(c13);
                sb3.append(j13);
                String p13 = a.a.p(sb3, ":", u13);
                if (p13.length() > 1024) {
                    p13 = ((String) this.f18386c).substring(0, 1024);
                }
                a1.d dVar = g4Var.f94769d;
                if (dVar != null) {
                    g4 g4Var2 = (g4) dVar.f242e;
                    g4Var2.p();
                    if (((g4) dVar.f242e).w().getLong((String) dVar.f239b, 0L) == 0) {
                        dVar.c();
                    }
                    if (p13 == null) {
                        p13 = "";
                    }
                    long j14 = g4Var2.w().getLong((String) dVar.f240c, 0L);
                    if (j14 <= 0) {
                        SharedPreferences.Editor edit = g4Var2.w().edit();
                        edit.putString((String) dVar.f241d, p13);
                        edit.putLong((String) dVar.f240c, 1L);
                        edit.apply();
                        return;
                    }
                    long j15 = j14 + 1;
                    r1 = (g4Var2.o().B0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j15 ? 1 : 0;
                    SharedPreferences.Editor edit2 = g4Var2.w().edit();
                    if (r1 != 0) {
                        edit2.putString((String) dVar.f241d, p13);
                    }
                    edit2.putLong((String) dVar.f240c, j15);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((d4) this.f18386c).b((String) this.f18389f, this.f18385b, (Throwable) this.f18387d, (byte[]) this.f18388e, (Map) this.f18390g);
                return;
        }
        while (r1 < this.f18385b) {
            View view = (View) ((ArrayList) this.f18386c).get(r1);
            String str2 = (String) ((ArrayList) this.f18387d).get(r1);
            WeakHashMap weakHashMap = q5.v0.f102521a;
            q5.m0.o(view, str2);
            q5.m0.o((View) ((ArrayList) this.f18388e).get(r1), (String) ((ArrayList) this.f18389f).get(r1));
            r1++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(String str, d4 d4Var, int i13, IOException iOException, byte[] bArr, Map map) {
        this(str, d4Var, i13, iOException, bArr, map, 0);
        this.f18384a = 2;
    }

    public n1(String str, d4 d4Var, int i13, IOException iOException, byte[] bArr, Map map, int i14) {
        this.f18384a = 2;
        com.bumptech.glide.d.t(d4Var);
        this.f18386c = d4Var;
        this.f18385b = i13;
        this.f18387d = iOException;
        this.f18388e = bArr;
        this.f18389f = str;
        this.f18390g = map;
    }
}
