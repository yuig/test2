package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public enum z {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    z(boolean z13) {
        this.isList = z13;
    }

    public boolean isList() {
        return this.isList;
    }
}
