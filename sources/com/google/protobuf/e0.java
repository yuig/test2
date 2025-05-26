package com.google.protobuf;

/* loaded from: classes3.dex */
public enum e0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    e0(boolean z13) {
        this.isList = z13;
    }

    public boolean isList() {
        return this.isList;
    }
}
