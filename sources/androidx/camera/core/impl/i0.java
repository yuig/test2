package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public enum i0 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    private final boolean mHoldsCameraSlot;

    i0(boolean z13) {
        this.mHoldsCameraSlot = z13;
    }

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }
}
