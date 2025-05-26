package pk2;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class d extends CountDownLatch implements ak2.e, ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f100546a;

    @Override // ak2.e
    public final void accept(Object obj) {
        this.f100546a = (Throwable) obj;
        countDown();
    }

    @Override // ak2.a
    public final void run() {
        countDown();
    }
}
