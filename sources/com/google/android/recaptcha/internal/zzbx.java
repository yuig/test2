package com.google.android.recaptcha.internal;

import ao2.p0;
import ao2.v;
import ao2.w;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import ue.c;

/* loaded from: classes3.dex */
public final class zzbx {
    @NotNull
    public static final p0 zza(@NotNull Task task) {
        final w a13 = c.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                v vVar = v.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((w) vVar).e0(exception);
                } else if (task2.isCanceled()) {
                    vVar.cancel((CancellationException) null);
                } else {
                    ((w) vVar).Q(task2.getResult());
                }
            }
        });
        return new zzbw(a13);
    }
}
