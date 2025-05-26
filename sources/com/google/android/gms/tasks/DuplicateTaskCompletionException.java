package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th3) {
        super(str, th3);
    }

    @NonNull
    public static IllegalStateException of(@NonNull Task<?> task) {
        if (!task.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        return new DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
    }
}
