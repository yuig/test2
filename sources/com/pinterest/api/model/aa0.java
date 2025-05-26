package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class aa0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35683b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35684c;

    public aa0(@NotNull String message, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f35682a = message;
        this.f35683b = str;
        this.f35684c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return Intrinsics.d(this.f35682a, aa0Var.f35682a) && Intrinsics.d(this.f35683b, aa0Var.f35683b) && Intrinsics.d(this.f35684c, aa0Var.f35684c);
    }

    public final int hashCode() {
        int hashCode = this.f35682a.hashCode() * 31;
        String str = this.f35683b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35684c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PromptData(message=");
        sb3.append(this.f35682a);
        sb3.append(", acceptLabel=");
        sb3.append(this.f35683b);
        sb3.append(", declineLabel=");
        return a.a.p(sb3, this.f35684c, ")");
    }
}
