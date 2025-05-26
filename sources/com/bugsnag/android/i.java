package com.bugsnag.android;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i {

    @NotNull
    private final CopyOnWriteArrayList<hd.m> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(@NotNull hd.m mVar) {
        this.observers.addIfAbsent(mVar);
    }

    @NotNull
    public final CopyOnWriteArrayList<hd.m> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(@NotNull hd.m mVar) {
        this.observers.remove(mVar);
    }

    public final void updateState(@NotNull j3 j3Var) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(j3Var);
        }
    }

    public final void updateState$bugsnag_android_core_release(@NotNull Function0<? extends j3> function0) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        j3 j3Var = (j3) function0.invoke();
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(j3Var);
        }
    }
}
