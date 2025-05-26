package qa2;

/* loaded from: classes2.dex */
public interface f0 extends yk1.n, y92.i, e0 {
    h0 getInternalCell();

    default void onViewDetached() {
        getInternalCell().onDetached();
    }

    default void onViewRecycled() {
        getInternalCell().onViewRecycled();
    }
}
