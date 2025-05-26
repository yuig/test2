package y92;

/* loaded from: classes2.dex */
public interface g {
    default int getAllowedHeightChange(int i13) {
        if (resizable()) {
            return i13;
        }
        return 0;
    }

    boolean resizable();

    String uid();
}
