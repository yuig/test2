package com.pinterest.feature.gridactions.utils.logging;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ`\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\"\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b#\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b$\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b%\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b&\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b'\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\r¨\u0006,"}, d2 = {"com/pinterest/feature/gridactions/utils/logging/PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()I", "reason", "errorMessage", "pinId", "imageUrl", "targetDirectory", "availableSpaceBytes", "imageSizeBytes", "sdkVersion", "Lcom/pinterest/feature/gridactions/utils/logging/PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/pinterest/feature/gridactions/utils/logging/PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReason", "getErrorMessage", "getPinId", "getImageUrl", "getTargetDirectory", "getAvailableSpaceBytes", "getImageSizeBytes", "I", "getSdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "gridActions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload implements e {

    @b("available_space_bytes")
    @NotNull
    private final String availableSpaceBytes;

    @b("error_message")
    @NotNull
    private final String errorMessage;

    @b("image_size_bytes")
    @NotNull
    private final String imageSizeBytes;

    @b("image_url")
    @NotNull
    private final String imageUrl;

    @b("pin_id")
    @NotNull
    private final String pinId;

    @b("failure_reason")
    @NotNull
    private final String reason;

    @b("sdk_version")
    private final int sdkVersion;

    @b("target_directory")
    @NotNull
    private final String targetDirectory;

    public PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload(@NotNull String reason, @NotNull String errorMessage, @NotNull String pinId, @NotNull String imageUrl, @NotNull String targetDirectory, @NotNull String availableSpaceBytes, @NotNull String imageSizeBytes, int i13) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(targetDirectory, "targetDirectory");
        Intrinsics.checkNotNullParameter(availableSpaceBytes, "availableSpaceBytes");
        Intrinsics.checkNotNullParameter(imageSizeBytes, "imageSizeBytes");
        this.reason = reason;
        this.errorMessage = errorMessage;
        this.pinId = pinId;
        this.imageUrl = imageUrl;
        this.targetDirectory = targetDirectory;
        this.availableSpaceBytes = availableSpaceBytes;
        this.imageSizeBytes = imageSizeBytes;
        this.sdkVersion = i13;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTargetDirectory() {
        return this.targetDirectory;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAvailableSpaceBytes() {
        return this.availableSpaceBytes;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getImageSizeBytes() {
        return this.imageSizeBytes;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload copy(@NotNull String reason, @NotNull String errorMessage, @NotNull String pinId, @NotNull String imageUrl, @NotNull String targetDirectory, @NotNull String availableSpaceBytes, @NotNull String imageSizeBytes, int sdkVersion) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(targetDirectory, "targetDirectory");
        Intrinsics.checkNotNullParameter(availableSpaceBytes, "availableSpaceBytes");
        Intrinsics.checkNotNullParameter(imageSizeBytes, "imageSizeBytes");
        return new PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload(reason, errorMessage, pinId, imageUrl, targetDirectory, availableSpaceBytes, imageSizeBytes, sdkVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload)) {
            return false;
        }
        PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload = (PinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload) other;
        return Intrinsics.d(this.reason, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.reason) && Intrinsics.d(this.errorMessage, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.errorMessage) && Intrinsics.d(this.pinId, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.pinId) && Intrinsics.d(this.imageUrl, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.imageUrl) && Intrinsics.d(this.targetDirectory, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.targetDirectory) && Intrinsics.d(this.availableSpaceBytes, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.availableSpaceBytes) && Intrinsics.d(this.imageSizeBytes, pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.imageSizeBytes) && this.sdkVersion == pinImageDownloadFailureKibanaLogger$PinImageDownloaderLog$Payload.sdkVersion;
    }

    @NotNull
    public final String getAvailableSpaceBytes() {
        return this.availableSpaceBytes;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getImageSizeBytes() {
        return this.imageSizeBytes;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getTargetDirectory() {
        return this.targetDirectory;
    }

    public int hashCode() {
        return Integer.hashCode(this.sdkVersion) + cb.d(this.imageSizeBytes, cb.d(this.availableSpaceBytes, cb.d(this.targetDirectory, cb.d(this.imageUrl, cb.d(this.pinId, cb.d(this.errorMessage, this.reason.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.reason;
        String str2 = this.errorMessage;
        String str3 = this.pinId;
        String str4 = this.imageUrl;
        String str5 = this.targetDirectory;
        String str6 = this.availableSpaceBytes;
        String str7 = this.imageSizeBytes;
        int i13 = this.sdkVersion;
        StringBuilder w13 = a.w("Payload(reason=", str, ", errorMessage=", str2, ", pinId=");
        a.B(w13, str3, ", imageUrl=", str4, ", targetDirectory=");
        a.B(w13, str5, ", availableSpaceBytes=", str6, ", imageSizeBytes=");
        w13.append(str7);
        w13.append(", sdkVersion=");
        w13.append(i13);
        w13.append(")");
        return w13.toString();
    }
}
