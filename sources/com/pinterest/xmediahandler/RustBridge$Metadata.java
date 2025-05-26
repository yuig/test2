package com.pinterest.xmediahandler;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/pinterest/xmediahandler/RustBridge$Metadata", "", "", "imageBytes", "Lcom/pinterest/xmediahandler/MetadataOnlyResult;", "stripImageRetainMetadata", "([B)Lcom/pinterest/xmediahandler/MetadataOnlyResult;", "mediahandler_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Metadata {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Metadata f52857a = new RustBridge$Metadata();

    static {
        System.loadLibrary("x_media_handler");
    }

    @NotNull
    public final native MetadataOnlyResult stripImageRetainMetadata(@NotNull byte[] imageBytes);
}
