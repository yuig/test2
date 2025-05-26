package th2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum l {
    NOTIFICATION("notif"),
    DATA("data"),
    NOTIFICATION_AND_DATA("notif-data"),
    UNKNOWN("unknown");


    @NotNull
    public static final k Builder = new k();

    @NotNull
    private final String type;

    l(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
