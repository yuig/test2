package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public enum s2 {
    VGA(0),
    s720p(1),
    PREVIEW(2),
    s1440p(3),
    RECORD(4),
    MAXIMUM(5),
    ULTRA_MAXIMUM(6),
    NOT_SUPPORT(7);

    final int mId;

    s2(int i13) {
        this.mId = i13;
    }

    public int getId() {
        return this.mId;
    }
}
