package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaTasksClient;", "", "executeTask", "Lcom/google/android/gms/tasks/Task;", "", "recaptchaAction", "Lcom/google/android/recaptcha/RecaptchaAction;", "timeout", "", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RecaptchaTasksClient {
    @NotNull
    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction);

    @NotNull
    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction, long timeout);
}
