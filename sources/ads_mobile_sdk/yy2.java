package ads_mobile_sdk;

import a.jh;
import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import kh2.n;

/* loaded from: classes2.dex */
public final class yy2 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f14469h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14470a;

    /* renamed from: b, reason: collision with root package name */
    public final jh f14471b;

    /* renamed from: c, reason: collision with root package name */
    public final a.se f14472c;

    /* renamed from: d, reason: collision with root package name */
    public final wy2 f14473d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14474e;

    /* renamed from: f, reason: collision with root package name */
    public k71 f14475f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14476g = new Object();

    public yy2(Context context, jh jhVar, a.se seVar, wy2 wy2Var, boolean z13) {
        this.f14470a = context;
        this.f14471b = jhVar;
        this.f14472c = seVar;
        this.f14473d = wy2Var;
        this.f14474e = z13;
    }

    public final k71 a() {
        k71 k71Var;
        synchronized (this.f14476g) {
            k71Var = this.f14475f;
        }
        return k71Var;
    }

    public final k71 a(q12 q12Var) {
        Class<?> cls;
        synchronized (this) {
            try {
                y12 y12Var = q12Var.f9906a;
                if (y12Var != null) {
                    String u13 = y12Var.u();
                    HashMap hashMap = f14469h;
                    cls = (Class) hashMap.get(u13);
                    if (cls == null) {
                        try {
                            wy2 wy2Var = this.f14473d;
                            File file = q12Var.f9907b;
                            wy2Var.getClass();
                            if (wy2.a(file)) {
                                try {
                                    File file2 = q12Var.f9908c;
                                    if (!file2.exists()) {
                                        file2.mkdirs();
                                    }
                                    cls = new DexClassLoader(q12Var.f9907b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f14470a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                                    hashMap.put(u13, cls);
                                } catch (ClassNotFoundException e13) {
                                    e = e13;
                                    throw new xy2(2008, e);
                                } catch (IllegalArgumentException e14) {
                                    e = e14;
                                    throw new xy2(2008, e);
                                } catch (SecurityException e15) {
                                    e = e15;
                                    throw new xy2(2008, e);
                                }
                            } else {
                                throw new xy2("VM did not pass signature verification", 2026);
                            }
                        } catch (GeneralSecurityException e16) {
                            throw new xy2(2026, e16);
                        }
                    }
                } else {
                    throw new xy2("mc", 4010);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            k71 k71Var = new k71(cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f14470a, "msa-r", q12Var.a(), null, new Bundle(), 2), this.f14471b, this.f14472c, this.f14474e);
            if (k71Var.c()) {
                int b13 = k71Var.b();
                if (b13 == 0) {
                    return k71Var;
                }
                throw new xy2(n.j(b13, "ci: "), 4001);
            }
            throw new xy2("init failed", 4000);
        } catch (Exception e17) {
            throw new xy2(2004, e17);
        }
    }

    public final void a(k71 k71Var) {
        synchronized (this.f14476g) {
            k71 k71Var2 = this.f14475f;
            if (k71Var2 != null) {
                try {
                    k71Var2.a();
                } catch (xy2 e13) {
                    this.f14472c.a(e13.f13896a, -1L, e13);
                }
            }
            this.f14475f = k71Var;
        }
    }
}
