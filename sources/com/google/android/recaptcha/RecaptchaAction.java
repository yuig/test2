package com.google.android.recaptcha;

import a.a;
import androidx.annotation.NonNull;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaAction;", "", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecaptchaAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");

    @NotNull
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");

    @NotNull
    private final String action;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaAction$Companion;", "", "<init>", "()V", "LOGIN", "Lcom/google/android/recaptcha/RecaptchaAction;", "SIGNUP", "custom", "customAction", "", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final RecaptchaAction custom(@NonNull String customAction) {
            return new RecaptchaAction(customAction, null);
        }

        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    @NonNull
    public static /* synthetic */ RecaptchaAction copy$default(@NonNull RecaptchaAction recaptchaAction, @NonNull String str, int i13, @NonNull Object obj) {
        if ((i13 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    @NotNull
    public static final RecaptchaAction custom(@NonNull String str) {
        return INSTANCE.custom(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final RecaptchaAction copy(@NonNull String action) {
        return new RecaptchaAction(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecaptchaAction) && Intrinsics.d(this.action, ((RecaptchaAction) other).action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return a.p(new StringBuilder("RecaptchaAction(action="), this.action, ")");
    }

    public /* synthetic */ RecaptchaAction(@NonNull String str, @NonNull DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
