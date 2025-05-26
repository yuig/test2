package vn1;

import android.graphics.Paint;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int gravity;
    public static final b START = new b("START", 0, 8388611);
    public static final b CENTER = new b("CENTER", 1, 17);
    public static final b END = new b("END", 2, 8388613);
    public static final b FORCE_LEFT = new b("FORCE_LEFT", 3, 3);
    public static final b FORCE_RIGHT = new b("FORCE_RIGHT", 4, 5);
    public static final b CENTER_VERTICAL = new b("CENTER_VERTICAL", 5, 16);
    public static final b CENTER_HORIZONTAL = new b("CENTER_HORIZONTAL", 6, 1);
    public static final b BOTTOM = new b("BOTTOM", 7, 80);
    public static final b TOP = new b("TOP", 8, 48);
    public static final b NONE = new b("NONE", 9, 0);

    private static final /* synthetic */ b[] $values() {
        return new b[]{START, CENTER, END, FORCE_LEFT, FORCE_RIGHT, CENTER_VERTICAL, CENTER_HORIZONTAL, BOTTOM, TOP, NONE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.gravity = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getGravity$text_release() {
        return this.gravity;
    }

    @NotNull
    public final Paint.Align toTextPaintAlignment() {
        switch (a.f126273a[ordinal()]) {
        }
        return Paint.Align.LEFT;
    }
}
