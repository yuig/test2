package com.bugsnag.android;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final hd.h f29273a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29274b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f29275c;

    /* renamed from: d, reason: collision with root package name */
    public final h2 f29276d;

    /* renamed from: e, reason: collision with root package name */
    public final h2 f29277e;

    public i2(HashSet hashSet, hd.h hVar, u1 u1Var) {
        this.f29273a = hVar;
        this.f29274b = u1Var;
        w0 w0Var = hVar.f68811c;
        h2 a13 = a("com.bugsnag.android.NdkPlugin", w0Var.f29673b);
        this.f29276d = a13;
        h2 a14 = a("com.bugsnag.android.AnrPlugin", w0Var.f29672a);
        this.f29277e = a14;
        h2 a15 = a("com.bugsnag.android.BugsnagReactNativePlugin", w0Var.f29675d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(hashSet);
        if (a13 != null) {
            linkedHashSet.add(a13);
        }
        if (a14 != null) {
            linkedHashSet.add(a14);
        }
        if (a15 != null) {
            linkedHashSet.add(a15);
        }
        this.f29275c = CollectionsKt.J0(linkedHashSet);
    }

    public final h2 a(String str, boolean z13) {
        u1 u1Var = this.f29274b;
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance != null) {
                return (h2) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            if (!z13) {
                return null;
            }
            u1Var.i("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
            return null;
        } catch (Throwable th3) {
            u1Var.b("Failed to load plugin '" + str + '\'', th3);
            return null;
        }
    }
}
