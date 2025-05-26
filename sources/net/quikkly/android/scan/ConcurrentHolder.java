package net.quikkly.android.scan;

/* loaded from: classes4.dex */
public class ConcurrentHolder<V> {
    private static final long WAIT_TIMEOUT_MILLIS = 10000;
    private V value = null;
    private boolean accepting = false;
    private boolean terminated = false;

    public synchronized V offerReplace(V v13) {
        if (this.terminated) {
            return null;
        }
        if (!this.accepting) {
            return v13;
        }
        V v14 = this.value;
        this.value = v13;
        notify();
        return v14;
    }

    public synchronized void pauseOffers() {
        if (this.accepting) {
            this.accepting = false;
            this.value = null;
        }
    }

    public synchronized void resumeOffers() {
        if (!this.accepting) {
            this.accepting = true;
        }
    }

    public synchronized V take() {
        while (!this.terminated) {
            V v13 = this.value;
            if (v13 != null) {
                this.value = null;
                return v13;
            }
            try {
                wait(10000L);
            } catch (InterruptedException unused) {
                return null;
            }
        }
        return null;
    }

    public synchronized V terminateTakers() {
        V v13;
        v13 = this.value;
        this.terminated = true;
        this.value = null;
        notifyAll();
        return v13;
    }
}
