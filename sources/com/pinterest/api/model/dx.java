package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/pinterest/api/model/dx;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "code", "", "b", "Z", "()Z", "used", "<init>", "(Ljava/lang/String;Z)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class dx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("code")
    @NotNull
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("used")
    private final boolean used;

    public dx(@NotNull String code, boolean z13) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.used = z13;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getUsed() {
        return this.used;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return Intrinsics.d(this.code, dxVar.code) && this.used == dxVar.used;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.used) + (this.code.hashCode() * 31);
    }

    public final String toString() {
        return "MultiFactorBackupCode(code=" + this.code + ", used=" + this.used + ")";
    }
}
