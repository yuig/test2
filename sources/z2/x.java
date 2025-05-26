package z2;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public enum x implements v {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    @Override // z2.v
    public boolean getHasFocus() {
        int i13 = w.f140652a[ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return true;
        }
        if (i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean isCaptured() {
        int i13 = w.f140652a[ordinal()];
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2 || i13 == 3 || i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // z2.v
    public boolean isFocused() {
        int i13 = w.f140652a[ordinal()];
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3 || i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
