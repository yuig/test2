package sh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.login.z;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kh2.b0;
import t3.n1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e */
    public static Boolean f112894e = null;

    /* renamed from: f */
    public static String f112895f = null;

    /* renamed from: g */
    public static boolean f112896g = false;

    /* renamed from: h */
    public static int f112897h = -1;

    /* renamed from: i */
    public static Boolean f112898i;

    /* renamed from: m */
    public static i f112902m;

    /* renamed from: n */
    public static j f112903n;

    /* renamed from: a */
    public final Context f112904a;

    /* renamed from: j */
    public static final ThreadLocal f112899j = new ThreadLocal();

    /* renamed from: k */
    public static final n1 f112900k = new n1(5);

    /* renamed from: l */
    public static final z f112901l = new z(2);

    /* renamed from: b */
    public static final com.google.android.gms.common.api.d f112891b = new com.google.android.gms.common.api.d(2);

    /* renamed from: c */
    public static final z f112892c = new z(4);

    /* renamed from: d */
    public static final com.google.android.gms.common.api.d f112893d = new com.google.android.gms.common.api.d(4);

    public d(Context context) {
        this.f112904a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.bumptech.glide.c.x(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e13) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e13.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r10 != 0) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static sh.d c(android.content.Context r23, sh.c r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.d.c(android.content.Context, sh.c, java.lang.String):sh.d");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01ca -> B:24:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01cc -> B:24:0x01cf). Please report as a decompilation issue!!! */
    public static int d(Context context, String str, boolean z13) {
        Field declaredField;
        Throwable th3;
        RemoteException e13;
        h hVar;
        Cursor cursor;
        try {
            synchronized (d.class) {
                Boolean bool = f112894e;
                Cursor cursor2 = null;
                int i13 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e14) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e14.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (DynamiteModule$LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!h(context)) {
                                return 0;
                            }
                            if (!f112896g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e15 = e(context, str, z13, true);
                                        String str2 = f112895f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader g13 = f.g();
                                            if (g13 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = f112895f;
                                                    com.bumptech.glide.d.t(str3);
                                                    g13 = a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f112895f;
                                                    com.bumptech.glide.d.t(str4);
                                                    g13 = new g(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(g13);
                                            declaredField.set(null, g13);
                                            f112894e = bool2;
                                            return e15;
                                        }
                                        return e15;
                                    } catch (DynamiteModule$LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f112894e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z13, false);
                    } catch (DynamiteModule$LoadingException e16) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e16.getMessage());
                        return 0;
                    }
                }
                i i14 = i(context);
                try {
                    if (i14 != null) {
                        try {
                            int I = i14.I();
                            if (I >= 3) {
                                ThreadLocal threadLocal = f112899j;
                                h hVar2 = (h) threadLocal.get();
                                if (hVar2 == null || (cursor = hVar2.f112911a) == null) {
                                    Cursor cursor3 = (Cursor) rh.b.E(i14.O(new rh.b(context), str, z13, ((Long) f112900k.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i15 = cursor3.getInt(0);
                                                if (i15 <= 0 || (hVar = (h) threadLocal.get()) == null || hVar.f112911a != null) {
                                                    cursor2 = cursor3;
                                                } else {
                                                    hVar.f112911a = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i13 = i15;
                                            }
                                        } catch (RemoteException e17) {
                                            e13 = e17;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e13.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i13;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th3;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i13 = cursor.getInt(0);
                                }
                            } else if (I == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i13 = i14.K(new rh.b(context), str, z13);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i13 = i14.J(new rh.b(context), str, z13);
                            }
                        } catch (RemoteException e18) {
                            e13 = e18;
                        }
                    }
                    return i13;
                } catch (Throwable th5) {
                    th3 = th5;
                }
            }
        } catch (Throwable th6) {
            b0.J(context, th6);
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.d.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static d f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new d(context);
    }

    public static void g(ClassLoader classLoader) {
        j jVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f112903n = jVar;
        } catch (ClassNotFoundException e13) {
            e = e13;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e14) {
            e = e14;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e15) {
            e = e15;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e16) {
            e = e16;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e17) {
            e = e17;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean h(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f112898i)) {
            return true;
        }
        boolean z13 = false;
        if (f112898i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (ih.d.f72259b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z13 = true;
            }
            f112898i = Boolean.valueOf(z13);
            if (z13 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f112896g = true;
            }
        }
        if (!z13) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z13;
    }

    public static i i(Context context) {
        i iVar;
        synchronized (d.class) {
            i iVar2 = f112902m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
                }
                if (iVar != null) {
                    f112902m = iVar;
                    return iVar;
                }
            } catch (Exception e13) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e13.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f112904a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e13) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e13);
        }
    }
}
