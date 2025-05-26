package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public enum y {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    y(boolean z13) {
        this.isList = z13;
    }

    public boolean isList() {
        return this.isList;
    }
}
