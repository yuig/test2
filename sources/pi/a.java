package pi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ih.d;
import java.lang.reflect.Method;
import oi.o6;
import org.chromium.net.ApiVersion;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f100168a = d.f72259b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f100169b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static sh.d f100170c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f100171d = "0";

    public static Task a(Context context) {
        sh.d dVar;
        com.bumptech.glide.d.u(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (f100169b) {
            dVar = f100170c;
        }
        if (dVar != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new o6(context, taskCompletionSource, 3)).start();
        return taskCompletionSource.getTask();
    }

    public static void b(Context context) {
        sh.d dVar;
        Object obj = f100169b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dVar = f100170c;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dVar != null) {
            return;
        }
        com.bumptech.glide.d.u(context, "Context must not be null");
        ClassLoader classLoader = a.class.getClassLoader();
        com.bumptech.glide.d.t(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            d dVar2 = f100168a;
            dVar2.getClass();
            d.d(context);
            try {
                sh.d c13 = sh.d.c(context, sh.d.f112891b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> loadClass = c13.f112904a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() == a.class.getClassLoader()) {
                        Log.e("a", "ImplVersion class is missing from Cronet module.");
                        throw new GooglePlayServicesNotAvailableException();
                    }
                    Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                    Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                    Integer num = (Integer) method.invoke(null, new Object[0]);
                    com.bumptech.glide.d.t(num);
                    int intValue = num.intValue();
                    String str = (String) method2.invoke(null, new Object[0]);
                    com.bumptech.glide.d.t(str);
                    f100171d = str;
                    if (apiLevel <= intValue) {
                        f100170c = c13;
                        return;
                    }
                    if (dVar2.a(2, context, "cr") == null) {
                        Log.e("a", "Unable to fetch error resolution intent");
                        throw new GooglePlayServicesNotAvailableException();
                    }
                    String str2 = f100171d;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN);
                    sb3.append("Google Play Services update is required. The API Level of the client is ");
                    sb3.append(apiLevel);
                    sb3.append(". The API Level of the implementation is ");
                    sb3.append(intValue);
                    sb3.append(". The Cronet implementation version is ");
                    sb3.append(str2);
                    throw new GooglePlayServicesRepairableException(sb3.toString());
                } catch (Exception e13) {
                    Log.e("a", "Unable to read Cronet version from the Cronet module ", e13);
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e13));
                }
            } catch (DynamiteModule$LoadingException e14) {
                Log.e("a", "Unable to load Cronet module", e14);
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e14));
            }
        } catch (ClassNotFoundException e15) {
            Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e15));
        }
    }
}
