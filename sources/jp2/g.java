package jp2;

/* loaded from: classes2.dex */
public enum g {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);

    private final boolean mContentCacheEnabled;
    private final int mType;

    g(int i13, boolean z13) {
        this.mContentCacheEnabled = z13;
        this.mType = i13;
    }

    public static g fromPublicBuilderCacheMode(int i13) {
        if (i13 == 0) {
            return DISABLED;
        }
        if (i13 == 1) {
            return MEMORY;
        }
        if (i13 == 2) {
            return DISK_NO_HTTP;
        }
        if (i13 == 3) {
            return DISK;
        }
        throw new IllegalArgumentException("Unknown public builder cache mode");
    }

    public int getType() {
        return this.mType;
    }

    public boolean isContentCacheEnabled() {
        return this.mContentCacheEnabled;
    }

    public int toPublicBuilderCacheMode() {
        int i13 = f.f77324a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 != 2) {
            i14 = 3;
            if (i13 != 3) {
                if (i13 == 4) {
                    return 1;
                }
                throw new IllegalArgumentException("Unknown internal builder cache mode");
            }
        }
        return i14;
    }
}
