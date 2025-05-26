package com.google.protobuf;

/* loaded from: classes.dex */
public enum a3 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(l.f33922b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    a3(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
