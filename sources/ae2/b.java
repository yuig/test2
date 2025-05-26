package ae2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int pixelDataFormat;
    private final int pixelDataType;
    private final int textureDataFormat;
    public static final b UInt8RGBA = new b("UInt8RGBA", 0, 32856, 6408, 5121);
    public static final b Float32RGBA = new b("Float32RGBA", 1, 34836, 6408, 5126);
    public static final b UInt8Single = new b("UInt8Single", 2, 33321, 6403, 5121);
    public static final b Float32Single = new b("Float32Single", 3, 33326, 6403, 5126);
    public static final b Float32Depth = new b("Float32Depth", 4, 6402, 6402, 5126);

    private static final /* synthetic */ b[] $values() {
        return new b[]{UInt8RGBA, Float32RGBA, UInt8Single, Float32Single, Float32Depth};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14, int i15, int i16) {
        this.textureDataFormat = i14;
        this.pixelDataFormat = i15;
        this.pixelDataType = i16;
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

    public final int getPixelDataFormat() {
        return this.pixelDataFormat;
    }

    public final int getPixelDataType() {
        return this.pixelDataType;
    }

    public final int getTextureDataFormat() {
        return this.textureDataFormat;
    }
}
