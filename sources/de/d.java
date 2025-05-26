package de;

/* loaded from: classes3.dex */
public enum d {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    d(boolean z13) {
        this.isComplete = z13;
    }

    public boolean isComplete() {
        return this.isComplete;
    }
}
