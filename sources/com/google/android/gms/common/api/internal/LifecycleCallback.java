package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LifecycleCallback {

    @NonNull
    protected final i mLifecycleFragment;

    public LifecycleCallback(i iVar) {
        this.mLifecycleFragment = iVar;
    }

    @Keep
    private static i getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @NonNull
    public static i getFragment(@NonNull Activity activity) {
        return getFragment(new h(activity));
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }

    @NonNull
    public Activity getActivity() {
        Activity E4 = this.mLifecycleFragment.E4();
        com.bumptech.glide.d.t(E4);
        return E4;
    }

    public void onActivityResult(int i13, int i14, @NonNull Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    @NonNull
    public static i getFragment(@NonNull h hVar) {
        v0 v0Var;
        Activity activity = hVar.f30826a;
        if (activity instanceof FragmentActivity) {
            return w0.M6(hVar.a());
        }
        if (!(activity instanceof Activity)) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        WeakHashMap weakHashMap = v0.f30888d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference == null || (v0Var = (v0) weakReference.get()) == null) {
            try {
                v0Var = (v0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (v0Var == null || v0Var.isRemoving()) {
                    v0Var = new v0();
                    activity.getFragmentManager().beginTransaction().add(v0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(v0Var));
            } catch (ClassCastException e13) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e13);
            }
        }
        return v0Var;
    }

    @NonNull
    public static i getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
