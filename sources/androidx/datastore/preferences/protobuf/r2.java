package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum r2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(i.f18075b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    r2(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
