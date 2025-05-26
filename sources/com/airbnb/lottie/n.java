package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import ao2.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28429a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f28430b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28431c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28432d = {31, -117, 8};

    public static b0 a(final String str, Callable callable, Runnable runnable) {
        h a13 = str == null ? null : cc.h.f27436b.a(str);
        b0 b0Var = a13 != null ? new b0(a13) : null;
        HashMap hashMap = f28429a;
        if (str != null && hashMap.containsKey(str)) {
            b0Var = (b0) hashMap.get(str);
        }
        if (b0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return b0Var;
        }
        final int i13 = 0;
        b0 b0Var2 = new b0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            b0Var2.b(new x() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.x
                public final void onResult(Object obj) {
                    int i14 = i13;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i14) {
                        case 0:
                            HashMap hashMap2 = n.f28429a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                n.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = n.f28429a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                n.k();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i14 = 1;
            b0Var2.a(new x() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.x
                public final void onResult(Object obj) {
                    int i142 = i14;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i142) {
                        case 0:
                            HashMap hashMap2 = n.f28429a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                n.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = n.f28429a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                n.k();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, b0Var2);
                if (hashMap.size() == 1) {
                    k();
                }
            }
        }
        return b0Var2;
    }

    public static z b(Context context, String str, String str2) {
        h a13 = str2 == null ? null : cc.h.f27436b.a(str2);
        if (a13 != null) {
            return new z(a13);
        }
        try {
            wo2.y i13 = m0.i(m0.l0(context.getAssets().open(str)));
            return j(i13, f28431c).booleanValue() ? h(context, new ZipInputStream(i13.k2()), str2) : j(i13, f28432d).booleanValue() ? c(new GZIPInputStream(i13.k2()), str2) : c(i13.k2(), str2);
        } catch (IOException e13) {
            return new z(e13);
        }
    }

    public static z c(InputStream inputStream, String str) {
        wo2.y i13 = m0.i(m0.l0(inputStream));
        String[] strArr = ic.d.f72048e;
        return d(new ic.e(i13), str, true);
    }

    public static z d(ic.e eVar, String str, boolean z13) {
        h a13;
        try {
            if (str == null) {
                a13 = null;
            } else {
                try {
                    a13 = cc.h.f27436b.a(str);
                } catch (Exception e13) {
                    z zVar = new z(e13);
                    if (z13) {
                        jc.g.b(eVar);
                    }
                    return zVar;
                }
            }
            if (a13 != null) {
                z zVar2 = new z(a13);
                if (z13) {
                    jc.g.b(eVar);
                }
                return zVar2;
            }
            h a14 = hc.w.a(eVar);
            if (str != null) {
                cc.h.f27436b.f27437a.d(str, a14);
            }
            z zVar3 = new z(a14);
            if (z13) {
                jc.g.b(eVar);
            }
            return zVar3;
        } catch (Throwable th3) {
            if (z13) {
                jc.g.b(eVar);
            }
            throw th3;
        }
    }

    public static b0 e(final int i13, Context context, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return n.g(i13, context2, str);
            }
        }, null);
    }

    public static b0 f(Context context, int i13) {
        return e(i13, context, l(context, i13));
    }

    public static z g(int i13, Context context, String str) {
        h a13 = str == null ? null : cc.h.f27436b.a(str);
        if (a13 != null) {
            return new z(a13);
        }
        try {
            wo2.y i14 = m0.i(m0.l0(context.getResources().openRawResource(i13)));
            if (j(i14, f28431c).booleanValue()) {
                return h(context, new ZipInputStream(i14.k2()), str);
            }
            if (!j(i14, f28432d).booleanValue()) {
                return c(i14.k2(), str);
            }
            try {
                return c(new GZIPInputStream(i14.k2()), str);
            } catch (IOException e13) {
                return new z(e13);
            }
        } catch (Resources.NotFoundException e14) {
            return new z(e14);
        }
    }

    public static z h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            jc.g.b(zipInputStream);
        }
    }

    public static z i(Context context, ZipInputStream zipInputStream, String str) {
        h a13;
        w wVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a13 = null;
        } else {
            try {
                a13 = cc.h.f27436b.a(str);
            } catch (IOException e13) {
                return new z(e13);
            }
        }
        if (a13 != null) {
            return new z(a13);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        h hVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                wo2.y i13 = m0.i(m0.l0(zipInputStream));
                String[] strArr = ic.d.f72048e;
                hVar = (h) d(new ic.e(i13), null, false).f28505a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        jc.b.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        jc.b.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (hVar == null) {
            return new z(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = hVar.c().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    wVar = null;
                    break;
                }
                wVar = (w) it.next();
                if (wVar.f28475d.equals(str4)) {
                    break;
                }
            }
            if (wVar != null) {
                wVar.f28477f = jc.g.e((Bitmap) entry.getValue(), wVar.f28472a, wVar.f28473b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z13 = false;
            for (cc.d dVar : hVar.f28401f.values()) {
                if (dVar.a().equals(entry2.getKey())) {
                    dVar.b((Typeface) entry2.getValue());
                    z13 = true;
                }
            }
            if (!z13) {
                jc.b.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = hVar.c().entrySet().iterator();
            while (it2.hasNext()) {
                w wVar2 = (w) ((Map.Entry) it2.next()).getValue();
                if (wVar2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = wVar2.f28475d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        wVar2.f28477f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e14) {
                        jc.b.d("data URL did not have correct base64 format.", e14);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            cc.h.f27436b.f27437a.d(str, hVar);
        }
        return new z(hVar);
    }

    public static Boolean j(wo2.y yVar, byte[] bArr) {
        try {
            wo2.y peek = yVar.peek();
            for (byte b13 : bArr) {
                if (peek.readByte() != b13) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            jc.b.b();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(f28430b);
        if (arrayList.size() <= 0) {
            return;
        }
        ep.b.A(arrayList.get(0));
        throw null;
    }

    public static String l(Context context, int i13) {
        StringBuilder sb3 = new StringBuilder("rawRes");
        sb3.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb3.append(i13);
        return sb3.toString();
    }
}
