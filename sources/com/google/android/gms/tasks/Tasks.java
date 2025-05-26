package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.bumptech.glide.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ki.a;

/* loaded from: classes.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) {
        d.r("Must not be called on the main application thread");
        d.q();
        d.u(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    @NonNull
    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzaf zzafVar = new zzaf(collection.size(), zzwVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzafVar);
        }
        return zzwVar;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j13, @NonNull TimeUnit timeUnit) {
        d.u(task, "Task must not be null");
        d.i("Timeout must be positive", j13 > 0);
        d.u(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final a aVar = new a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j13));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                a.this.removeCallbacksAndMessages(null);
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else {
                    if (task2.isCanceled()) {
                        zzbVar.zza();
                        return;
                    }
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static Object zza(@NonNull Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        d.u(executor, "Executor must not be null");
        d.u(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWithTask(executor, new zzab(collection));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, Collection<? extends Task> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(executor, new zzaa(collection));
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(executor, Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static Task<Void> whenAll(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j13, @NonNull TimeUnit timeUnit) {
        d.r("Must not be called on the main application thread");
        d.q();
        d.u(task, "Task must not be null");
        d.u(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j13, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
