package hb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import eb.p;
import hb.h;
import hb.i;
import hb.j;
import hb.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f68497a;

    /* renamed from: b, reason: collision with root package name */
    public final h f68498b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f68499c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f68500d;

    /* renamed from: e, reason: collision with root package name */
    public j f68501e;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SidecarInterface b13 = i.b(context);
        h sidecarAdapter = new h();
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.f68497a = b13;
        this.f68498b = sidecarAdapter;
        this.f68499c = new LinkedHashMap();
        this.f68500d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f68497a;
    }

    public final p e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a13 = i.a(activity);
        if (a13 == null) {
            return new p(f0.g());
        }
        SidecarInterface sidecarInterface = this.f68497a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a13) : null;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f68498b.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a13 = i.a(activity);
        if (a13 == null) {
            return;
        }
        SidecarInterface sidecarInterface = this.f68497a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerRemoved(a13);
        }
        LinkedHashMap linkedHashMap = this.f68500d;
        p5.a aVar = (p5.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof d5.c) {
                ((d5.c) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        j jVar = this.f68501e;
        if (jVar != null) {
            jVar.b(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f68499c;
        boolean z13 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a13);
        if (!z13 || sidecarInterface == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(IBinder windowToken, Activity activity) {
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinkedHashMap linkedHashMap = this.f68499c;
        linkedHashMap.put(windowToken, activity);
        SidecarInterface sidecarInterface = this.f68497a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (linkedHashMap.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        j jVar = this.f68501e;
        if (jVar != null) {
            jVar.a(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f68500d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof d5.c)) {
            h0.d dVar = new h0.d(5, this, activity);
            linkedHashMap2.put(activity, dVar);
            ((d5.c) activity).addOnConfigurationChangedListener(dVar);
        }
    }

    public final void h(l extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.f68501e = new j(extensionCallback);
        SidecarInterface sidecarInterface = this.f68497a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f68498b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    j jVar;
                    h hVar;
                    SidecarInterface d2;
                    Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
                    linkedHashMap = k.this.f68499c;
                    Collection<Activity> values = linkedHashMap.values();
                    k kVar = k.this;
                    for (Activity activity : values) {
                        IBinder a13 = i.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a13 != null && (d2 = kVar.d()) != null) {
                            sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a13);
                        }
                        jVar = kVar.f68501e;
                        if (jVar != null) {
                            hVar = kVar.f68498b;
                            jVar.a(activity, hVar.e(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    h hVar;
                    SidecarDeviceState sidecarDeviceState;
                    j jVar;
                    Intrinsics.checkNotNullParameter(windowToken, "windowToken");
                    Intrinsics.checkNotNullParameter(newLayout, "newLayout");
                    linkedHashMap = k.this.f68499c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    hVar = k.this.f68498b;
                    SidecarInterface d2 = k.this.d();
                    if (d2 == null || (sidecarDeviceState = d2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    p e13 = hVar.e(newLayout, sidecarDeviceState);
                    jVar = k.this.f68501e;
                    if (jVar != null) {
                        jVar.a(activity, e13);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f68497a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!Intrinsics.d(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f68497a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f68497a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f68497a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!Intrinsics.d(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f68497a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!Intrinsics.d(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f68497a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!Intrinsics.d(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                Intrinsics.g(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!Intrinsics.d(arrayList, (List) invoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
