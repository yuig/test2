package h92;

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
    public static final c GAM_AD_UNIT_ID = new c("GAM_AD_UNIT_ID", 0);
    public static final c GAM_AD_CHOICE_URL = new c("GAM_AD_CHOICE_URL", 1);
    public static final c INTERNAL_CREATIVE_TYPE = new c("INTERNAL_CREATIVE_TYPE", 2);
    public static final c GAM_FORMAT_TYPE = new c("GAM_FORMAT_TYPE", 3);
    public static final c GAM_AD_NUM = new c("GAM_AD_NUM", 4);
    public static final c IS_GAM_ADVERTISER_PRESENT = new c("IS_GAM_ADVERTISER_PRESENT", 5);
    public static final c HAS_DEFAULT_THUMBNAIL = new c("HAS_DEFAULT_THUMBNAIL", 6);
    public static final c IS_WEBVIEW_AD = new c("IS_WEBVIEW_AD", 7);
    public static final c GAM_AD_SIZE_IS_REAL = new c("GAM_AD_SIZE_IS_REAL", 8);

    private static final /* synthetic */ c[] $values() {
        return new c[]{GAM_AD_UNIT_ID, GAM_AD_CHOICE_URL, INTERNAL_CREATIVE_TYPE, GAM_FORMAT_TYPE, GAM_AD_NUM, IS_GAM_ADVERTISER_PRESENT, HAS_DEFAULT_THUMBNAIL, IS_WEBVIEW_AD, GAM_AD_SIZE_IS_REAL};
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
                return GAM_AD_UNIT_ID;
            case 1:
                return GAM_AD_SIZE_IS_REAL;
            case 2:
                return GAM_AD_CHOICE_URL;
            case 3:
                return INTERNAL_CREATIVE_TYPE;
            case 4:
                return GAM_FORMAT_TYPE;
            case 5:
                return GAM_AD_NUM;
            case 6:
                return IS_GAM_ADVERTISER_PRESENT;
            case 7:
                return HAS_DEFAULT_THUMBNAIL;
            case 8:
                return IS_WEBVIEW_AD;
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
        switch (b.f68315a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
