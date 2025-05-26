package ik;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.app.v;
import c50.c1;
import com.facebook.login.z;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jk.m;
import jk.s;
import jk.t;
import jk.u;
import oi.o6;
import rd.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f72383e = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final c f72384a;

    /* renamed from: b, reason: collision with root package name */
    public final m f72385b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f72386c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final j f72387d;

    public a(Context context) {
        try {
            c cVar = new c(context);
            this.f72384a = cVar;
            this.f72387d = new j(cVar, 16);
            this.f72385b = new m(context);
        } catch (PackageManager.NameNotFoundException e13) {
            throw new zzbh(e13);
        }
    }

    public static boolean c(Context context, boolean z13) {
        boolean z14;
        AtomicReference atomicReference = f72383e;
        a aVar = new a(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z14 = false;
                    break;
                }
            } else {
                z14 = true;
                break;
            }
        }
        a aVar2 = (a) atomicReference.get();
        if (z14) {
            s sVar = s.INSTANCE;
            ThreadPoolExecutor m03 = tb.f.m0();
            c cVar = aVar2.f72384a;
            int i13 = 10;
            com.google.android.gms.common.api.d dVar = new com.google.android.gms.common.api.d(10);
            tb.c cVar2 = new tb.c(new j(cVar, 16));
            rg.a aVar3 = new rg.a();
            aVar3.f107929a = cVar;
            aVar3.f107930b = dVar;
            aVar3.f107931c = context;
            aVar3.f107932d = cVar2;
            sVar.zzb(new kk.d(context, m03, aVar3, cVar));
            h hVar = new h(aVar2);
            AtomicReference atomicReference2 = t.f76354a;
            while (!atomicReference2.compareAndSet(null, hVar) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            tb.f.m0().execute(new v(context, i13));
        }
        try {
            aVar2.b(context, z13);
            return true;
        } catch (Exception e13) {
            Log.e("SplitCompat", "Error installing additional splits", e13);
            return false;
        }
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c.e(this.f72384a.b((String) it.next()));
        }
        m mVar = this.f72385b;
        mVar.getClass();
        synchronized (m.class) {
            mVar.f76350a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final synchronized void b(Context context, boolean z13) {
        kk.e c1Var;
        int i13 = 11;
        try {
            if (z13) {
                this.f72384a.d();
            } else {
                tb.f.m0().execute(new v(this, i13));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet c13 = this.f72384a.c();
                Set a13 = this.f72385b.a();
                HashSet hashSet = new HashSet();
                Iterator it = c13.iterator();
                while (it.hasNext()) {
                    String b13 = ((b) it.next()).b();
                    if (arrayList.contains(b13) || a13.contains(u.b(b13))) {
                        hashSet.add(b13);
                        it.remove();
                    }
                }
                if (z13) {
                    a(hashSet);
                } else if (!hashSet.isEmpty()) {
                    tb.f.m0().execute(new o6(4, this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = c13.iterator();
                while (it2.hasNext()) {
                    String b14 = ((b) it2.next()).b();
                    if (!u.d(b14)) {
                        hashSet2.add(b14);
                    }
                }
                for (String str : arrayList) {
                    if (!u.d(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet hashSet3 = new HashSet(c13.size());
                Iterator it3 = c13.iterator();
                while (it3.hasNext()) {
                    b bVar = (b) it3.next();
                    String b15 = bVar.b();
                    fi.b bVar2 = u.f76355c;
                    if (b15.startsWith("config.") || hashSet2.contains(u.b(bVar.b()))) {
                        hashSet3.add(bVar);
                    }
                }
                g gVar = new g(this.f72384a);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 != 26) {
                    if (i14 == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) {
                        c1Var = new c1(8);
                    }
                    c1Var = new z(11);
                } else {
                    c1Var = new c1(7);
                }
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z13) {
                    c1Var.l(classLoader, gVar.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        b bVar3 = (b) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        g.b(bVar3, new m.h(gVar, bVar3, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            c1Var.l(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    b bVar4 = (b) it5.next();
                    try {
                        ZipFile zipFile2 = new ZipFile(bVar4.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null && !c1Var.k(classLoader, this.f72384a.a(bVar4.b()), bVar4.a(), z13)) {
                                Log.w("SplitCompat", "split was not installed ".concat(bVar4.a().toString()));
                            }
                            hashSet5.add(bVar4.a());
                        } catch (IOException e13) {
                            e = e13;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e14) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e14);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e15) {
                        e = e15;
                    }
                }
                this.f72387d.I(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    b bVar5 = (b) it6.next();
                    if (hashSet5.contains(bVar5.a())) {
                        Log.d("SplitCompat", "Split '" + bVar5.b() + "' installation emulated");
                        hashSet6.add(bVar5.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + bVar5.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f72386c) {
                    this.f72386c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e16) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e16);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
