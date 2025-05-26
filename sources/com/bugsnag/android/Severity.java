package com.bugsnag.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/Severity;", "", "Lcom/bugsnag/android/n1;", "Lcom/bugsnag/android/o1;", "writer", "", "toStream", "(Lcom/bugsnag/android/o1;)V", "", "str", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "com/bugsnag/android/o2", "ERROR", "WARNING", "INFO", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public enum Severity implements n1 {
    ERROR("error"),
    WARNING("warning"),
    INFO("info");


    @NotNull
    public static final o2 Companion = new o2();

    @NotNull
    private final String str;

    Severity(String str) {
        this.str = str;
    }

    @Override // com.bugsnag.android.n1
    public void toStream(@NotNull o1 writer) {
        writer.z(this.str);
    }
}
