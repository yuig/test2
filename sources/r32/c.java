package r32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c IMAGE_UPLOAD_INVALID_IMAGE = new c("IMAGE_UPLOAD_INVALID_IMAGE", 0);
    public static final c IMAGE_UPLOAD_FAILED = new c("IMAGE_UPLOAD_FAILED", 1);
    public static final c IMAGE_UPLOAD_INVALID_RESPONSE = new c("IMAGE_UPLOAD_INVALID_RESPONSE", 2);
    public static final c IMAGE_UPLOAD_REGISTRATION_FAILED = new c("IMAGE_UPLOAD_REGISTRATION_FAILED", 3);
    public static final c IMAGE_PROCESSING_FAILED = new c("IMAGE_PROCESSING_FAILED", 4);
    public static final c IMAGE_PROCESSING_TIMEOUT = new c("IMAGE_PROCESSING_TIMEOUT", 5);
    public static final c VIDEO_UPLOAD_INVALID_VIDEO = new c("VIDEO_UPLOAD_INVALID_VIDEO", 6);
    public static final c VIDEO_UPLOAD_EXPORT_FAILED = new c("VIDEO_UPLOAD_EXPORT_FAILED", 7);
    public static final c VIDEO_UPLOAD_REGISTRATION_FAILED = new c("VIDEO_UPLOAD_REGISTRATION_FAILED", 8);
    public static final c VIDEO_UPLOAD_FAILED = new c("VIDEO_UPLOAD_FAILED", 9);
    public static final c VIDEO_UPLOAD_INVALID_RESPONSE = new c("VIDEO_UPLOAD_INVALID_RESPONSE", 10);
    public static final c VIDEO_PROCESSING_FAILED = new c("VIDEO_PROCESSING_FAILED", 11);
    public static final c VIDEO_PROCESSING_TIMEOUT = new c("VIDEO_PROCESSING_TIMEOUT", 12);
    public static final c STORY_PIN_UPLOAD_FAILED = new c("STORY_PIN_UPLOAD_FAILED", 13);
    public static final c MEDIA_STATUS_FAILED = new c("MEDIA_STATUS_FAILED", 14);
    public static final c MEDIA_NOT_FOUND = new c("MEDIA_NOT_FOUND", 15);

    private static final /* synthetic */ c[] $values() {
        return new c[]{IMAGE_UPLOAD_INVALID_IMAGE, IMAGE_UPLOAD_FAILED, IMAGE_UPLOAD_INVALID_RESPONSE, IMAGE_UPLOAD_REGISTRATION_FAILED, IMAGE_PROCESSING_FAILED, IMAGE_PROCESSING_TIMEOUT, VIDEO_UPLOAD_INVALID_VIDEO, VIDEO_UPLOAD_EXPORT_FAILED, VIDEO_UPLOAD_REGISTRATION_FAILED, VIDEO_UPLOAD_FAILED, VIDEO_UPLOAD_INVALID_RESPONSE, VIDEO_PROCESSING_FAILED, VIDEO_PROCESSING_TIMEOUT, STORY_PIN_UPLOAD_FAILED, MEDIA_STATUS_FAILED, MEDIA_NOT_FOUND};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return IMAGE_UPLOAD_INVALID_IMAGE;
            case 1:
                return IMAGE_UPLOAD_FAILED;
            case 2:
                return IMAGE_UPLOAD_INVALID_RESPONSE;
            case 3:
                return IMAGE_PROCESSING_FAILED;
            case 4:
                return IMAGE_PROCESSING_TIMEOUT;
            case 5:
                return VIDEO_UPLOAD_INVALID_VIDEO;
            case 6:
                return VIDEO_UPLOAD_EXPORT_FAILED;
            case 7:
                return VIDEO_UPLOAD_REGISTRATION_FAILED;
            case 8:
                return VIDEO_UPLOAD_FAILED;
            case 9:
                return VIDEO_UPLOAD_INVALID_RESPONSE;
            case 10:
                return VIDEO_PROCESSING_FAILED;
            case 11:
                return VIDEO_PROCESSING_TIMEOUT;
            case 12:
                return STORY_PIN_UPLOAD_FAILED;
            case 13:
                return IMAGE_UPLOAD_REGISTRATION_FAILED;
            case 14:
                return MEDIA_STATUS_FAILED;
            case 15:
                return MEDIA_NOT_FOUND;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f106096a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 13;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 14:
                return 12;
            case 15:
                return 14;
            case 16:
                return 15;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
