package com.pinterest.xmediahandler;

import ep.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/pinterest/xmediahandler/MetadataOnlyResult;", "", "success", "", "metadataBytes", "", "error", "", "(Z[BLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "getMetadataBytes", "()[B", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mediahandler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MetadataOnlyResult {

    @NotNull
    private final String error;

    @NotNull
    private final byte[] metadataBytes;
    private final boolean success;

    public MetadataOnlyResult(boolean z13, @NotNull byte[] metadataBytes, @NotNull String error) {
        Intrinsics.checkNotNullParameter(metadataBytes, "metadataBytes");
        Intrinsics.checkNotNullParameter(error, "error");
        this.success = z13;
        this.metadataBytes = metadataBytes;
        this.error = error;
    }

    public static /* synthetic */ MetadataOnlyResult copy$default(MetadataOnlyResult metadataOnlyResult, boolean z13, byte[] bArr, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = metadataOnlyResult.success;
        }
        if ((i13 & 2) != 0) {
            bArr = metadataOnlyResult.metadataBytes;
        }
        if ((i13 & 4) != 0) {
            str = metadataOnlyResult.error;
        }
        return metadataOnlyResult.copy(z13, bArr, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getMetadataBytes() {
        return this.metadataBytes;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final MetadataOnlyResult copy(boolean success, @NotNull byte[] metadataBytes, @NotNull String error) {
        Intrinsics.checkNotNullParameter(metadataBytes, "metadataBytes");
        Intrinsics.checkNotNullParameter(error, "error");
        return new MetadataOnlyResult(success, metadataBytes, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetadataOnlyResult)) {
            return false;
        }
        MetadataOnlyResult metadataOnlyResult = (MetadataOnlyResult) other;
        return this.success == metadataOnlyResult.success && Intrinsics.d(this.metadataBytes, metadataOnlyResult.metadataBytes) && Intrinsics.d(this.error, metadataOnlyResult.error);
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final byte[] getMetadataBytes() {
        return this.metadataBytes;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.error.hashCode() + ((Arrays.hashCode(this.metadataBytes) + (Boolean.hashCode(this.success) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb3 = new StringBuilder("MetadataOnlyResult(success=");
        sb3.append(this.success);
        sb3.append(", metadataBytes=");
        sb3.append(Arrays.toString(this.metadataBytes));
        sb3.append(", error=");
        return b.k(sb3, this.error, ')');
    }
}
