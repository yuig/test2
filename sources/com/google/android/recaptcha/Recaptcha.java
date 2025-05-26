package com.google.android.recaptcha;

import android.app.Application;
import androidx.annotation.NonNull;
import bl2.c;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\n\u0010\rJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0087@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "Landroid/app/Application;", "application", "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", "", "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "Lxk2/s;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLbl2/c;)Ljava/lang/Object;", "getClient", "<init>", "()V", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class Recaptcha {

    @NotNull
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    @NotNull
    public static final Task<RecaptchaTasksClient> fetchTaskClient(@NonNull Application application, @NonNull String siteKey) {
        return zzcq.zze(application, siteKey);
    }

    @NonNull
    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m89getClientBWLJW6A$default(@NonNull Recaptcha recaptcha, @NonNull Application application, @NonNull String str, long j13, @NonNull c cVar, int i13, @NonNull Object obj) {
        if ((i13 & 4) != 0) {
            j13 = 10000;
        }
        return recaptcha.m90getClientBWLJW6A(application, str, j13, cVar);
    }

    @d
    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String siteKey) {
        return zzcq.zzc(application, siteKey, 10000L);
    }

    public final Object fetchClient(@NonNull Application application, @NonNull String str, @NonNull c<? super RecaptchaClient> cVar) {
        return zzcq.zzd(application, str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @xk2.d
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m90getClientBWLJW6A(@androidx.annotation.NonNull android.app.Application r5, @androidx.annotation.NonNull java.lang.String r6, long r7, @androidx.annotation.NonNull bl2.c<? super xk2.s> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r9)
            xk2.q r9 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L27
            r0.zzc = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L3f
            return r1
        L3f:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L27
            xk2.q r5 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L27
            goto L4a
        L44:
            xk2.q r6 = xk2.s.f135225b
            xk2.r r9 = ue.c.m(r5)
        L4a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m90getClientBWLJW6A(android.app.Application, java.lang.String, long, bl2.c):java.lang.Object");
    }

    @d
    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String siteKey, long timeout) {
        return zzcq.zzc(application, siteKey, timeout);
    }
}
