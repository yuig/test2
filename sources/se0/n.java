package se0;

/* loaded from: classes.dex */
public enum n {
    IDLE,
    USER_DRAG,
    USER_DRAG_X_RESET,
    ANIMATE_TO_REFRESH,
    REFRESHING,
    ANIMATE_TO_RESET;

    public boolean isAnimatingToReset() {
        return this == ANIMATE_TO_RESET;
    }

    public boolean isRefreshing() {
        return this == ANIMATE_TO_REFRESH || this == REFRESHING;
    }

    public boolean isUserDragInterruptReset() {
        return this == USER_DRAG_X_RESET;
    }
}
