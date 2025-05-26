package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class w0 extends Fragment implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f30893d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f30894a = Collections.synchronizedMap(new g1.g());

    /* renamed from: b, reason: collision with root package name */
    public int f30895b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f30896c;

    public static w0 M6(FragmentActivity fragmentActivity) {
        w0 w0Var;
        WeakHashMap weakHashMap = f30893d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (w0Var = (w0) weakReference.get()) != null) {
            return w0Var;
        }
        try {
            w0 w0Var2 = (w0) fragmentActivity.getSupportFragmentManager().F("SupportLifecycleFragmentImpl");
            if (w0Var2 == null || w0Var2.isRemoving()) {
                w0Var2 = new w0();
                androidx.fragment.app.w0 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.g(0, w0Var2, "SupportLifecycleFragmentImpl", 1);
                aVar.e(true);
            }
            weakHashMap.put(fragmentActivity, new WeakReference(w0Var2));
            return w0Var2;
        } catch (ClassCastException e13) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final LifecycleCallback L0(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f30894a.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i13, i14, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30895b = 1;
        this.f30896c = bundle;
        for (Map.Entry entry : this.f30894a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f30895b = 5;
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f30895b = 3;
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f30894a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f30895b = 2;
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f30895b = 4;
        Iterator it = this.f30894a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void q(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f30894a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a.a.k("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f30895b > 0) {
            new bi.f(Looper.getMainLooper(), 1).post(new s.f((Object) this, (Object) lifecycleCallback, str, 6));
        }
    }
}
