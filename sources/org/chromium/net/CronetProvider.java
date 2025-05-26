package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    public CronetProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set<CronetProvider> set) {
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        boolean z13 = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z13 = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                Log.e(TAG, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        return z13;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set<CronetProvider> set, boolean z13) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException e13) {
            logReflectiveOperationException(str, z13, e13);
            return false;
        } catch (IllegalAccessException e14) {
            logReflectiveOperationException(str, z13, e14);
            return false;
        } catch (InstantiationException e15) {
            logReflectiveOperationException(str, z13, e15);
            return false;
        } catch (NoSuchMethodException e16) {
            logReflectiveOperationException(str, z13, e16);
            return false;
        } catch (InvocationTargetException e17) {
            logReflectiveOperationException(str, z13, e17);
            return false;
        }
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void logReflectiveOperationException(String str, boolean z13, Exception exc) {
        if (z13) {
            Log.e(TAG, "Unable to load provider class: " + str, exc);
            return;
        }
        String str2 = TAG;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean isEnabled = isEnabled();
        StringBuilder w13 = a.a.w("[class=", name, ", name=", name2, ", version=");
        w13.append(version);
        w13.append(", enabled=");
        w13.append(isEnabled);
        w13.append("]");
        return w13.toString();
    }
}
