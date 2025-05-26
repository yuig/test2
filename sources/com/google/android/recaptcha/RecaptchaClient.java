package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import bl2.c;
import kotlin.Metadata;
import xk2.s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaClient;", "", "Lcom/google/android/recaptcha/RecaptchaAction;", "recaptchaAction", "", "timeout", "Lxk2/s;", "", "execute-0E7RQCE", "(Lcom/google/android/recaptcha/RecaptchaAction;JLbl2/c;)Ljava/lang/Object;", "execute", "execute-gIAlu-s", "(Lcom/google/android/recaptcha/RecaptchaAction;Lbl2/c;)Ljava/lang/Object;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public interface RecaptchaClient {
    /* renamed from: execute-0E7RQCE, reason: not valid java name */
    Object mo91execute0E7RQCE(@NonNull RecaptchaAction recaptchaAction, long j13, @NonNull c<? super s> cVar);

    /* renamed from: execute-gIAlu-s, reason: not valid java name */
    Object mo92executegIAlus(@NonNull RecaptchaAction recaptchaAction, @NonNull c<? super s> cVar);
}
