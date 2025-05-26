package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j13) {
        this.zza = j13;
    }

    public static void createAndAddCallback(@NonNull Task<Object> task, long j13) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j13));
    }

    public native void nativeOnComplete(long j13, Object obj, boolean z13, boolean z14, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
