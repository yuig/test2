package com.google.android.gms.internal.measurement;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f31697a = Logger.getLogger(q5.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final String f31698b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static r5 a() {
        String str;
        ClassLoader classLoader = x5.class.getClassLoader();
        if (r5.class.equals(r5.class)) {
            str = f31698b;
        } else {
            if (!r5.class.getPackage().equals(x5.class.getPackage())) {
                throw new IllegalArgumentException(r5.class.getName());
            }
            str = a.a.l(r5.class.getPackage().getName(), ".BlazeGenerated", r5.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                }
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(x5.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                } catch (ServiceConfigurationError e17) {
                    f31697a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(r5.class.getSimpleName()), (Throwable) e17);
                }
            }
            if (arrayList.size() == 1) {
                return (r5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (r5) r5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e18) {
                throw new IllegalStateException(e18);
            } catch (NoSuchMethodException e19) {
                throw new IllegalStateException(e19);
            } catch (InvocationTargetException e23) {
                throw new IllegalStateException(e23);
            }
        }
    }
}
