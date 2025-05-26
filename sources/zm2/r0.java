package zm2;

/* loaded from: classes2.dex */
public enum r0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.f142207a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    r0(Object obj) {
        this.defaultDefault = obj;
    }
}
