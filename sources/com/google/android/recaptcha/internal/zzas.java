package com.google.android.recaptcha.internal;

import ao2.p0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzas {
    @NotNull
    public static final Task zza(@NotNull p0 p0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        p0Var.invokeOnCompletion(new zzar(taskCompletionSource, p0Var));
        return taskCompletionSource.getTask();
    }
}
