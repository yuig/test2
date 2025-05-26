package com.pinterest.xmediahandler;

import a.cb;
import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/pinterest/xmediahandler/ManifestCheckResult;", "", "manifestFound", "", "imageHash", "", "error", "(ZLjava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getImageHash", "getManifestFound", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mediahandler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ManifestCheckResult {

    @NotNull
    private final String error;

    @NotNull
    private final String imageHash;
    private final boolean manifestFound;

    public ManifestCheckResult(boolean z13, @NotNull String imageHash, @NotNull String error) {
        Intrinsics.checkNotNullParameter(imageHash, "imageHash");
        Intrinsics.checkNotNullParameter(error, "error");
        this.manifestFound = z13;
        this.imageHash = imageHash;
        this.error = error;
    }

    public static /* synthetic */ ManifestCheckResult copy$default(ManifestCheckResult manifestCheckResult, boolean z13, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = manifestCheckResult.manifestFound;
        }
        if ((i13 & 2) != 0) {
            str = manifestCheckResult.imageHash;
        }
        if ((i13 & 4) != 0) {
            str2 = manifestCheckResult.error;
        }
        return manifestCheckResult.copy(z13, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getManifestFound() {
        return this.manifestFound;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageHash() {
        return this.imageHash;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final ManifestCheckResult copy(boolean manifestFound, @NotNull String imageHash, @NotNull String error) {
        Intrinsics.checkNotNullParameter(imageHash, "imageHash");
        Intrinsics.checkNotNullParameter(error, "error");
        return new ManifestCheckResult(manifestFound, imageHash, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManifestCheckResult)) {
            return false;
        }
        ManifestCheckResult manifestCheckResult = (ManifestCheckResult) other;
        return this.manifestFound == manifestCheckResult.manifestFound && Intrinsics.d(this.imageHash, manifestCheckResult.imageHash) && Intrinsics.d(this.error, manifestCheckResult.error);
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getImageHash() {
        return this.imageHash;
    }

    public final boolean getManifestFound() {
        return this.manifestFound;
    }

    public int hashCode() {
        return this.error.hashCode() + cb.d(this.imageHash, Boolean.hashCode(this.manifestFound) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb3 = new StringBuilder("ManifestCheckResult(manifestFound=");
        sb3.append(this.manifestFound);
        sb3.append(", imageHash=");
        sb3.append(this.imageHash);
        sb3.append(", error=");
        return b.k(sb3, this.error, ')');
    }
}
