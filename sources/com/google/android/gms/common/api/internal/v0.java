package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v0 extends Fragment implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f30888d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f30889a = Collections.synchronizedMap(new g1.g());

    /* renamed from: b, reason: collision with root package name */
    public int f30890b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f30891c;

    @Override // com.google.android.gms.common.api.internal.i
    public final Activity E4() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final LifecycleCallback L0(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f30889a.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i13, i14, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30890b = 1;
        this.f30891c = bundle;
        for (Map.Entry entry : this.f30889a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f30890b = 5;
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f30890b = 3;
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f30889a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f30890b = 2;
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f30890b = 4;
        Iterator it = this.f30889a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void q(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f30889a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a.a.k("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f30890b > 0) {
            new bi.f(Looper.getMainLooper(), 1).post(new s.f((Object) this, (Object) lifecycleCallback, str, 5));
        }
    }
}
