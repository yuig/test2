package wj2;

import java.util.concurrent.Callable;
import uj2.a0;

/* loaded from: classes2.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130032a;

    public /* synthetic */ a(int i13) {
        this.f130032a = i13;
    }

    public final a0 a() {
        switch (this.f130032a) {
            case 0:
                return b.f130033a;
            case 1:
            default:
                return tk2.d.f118014a;
            case 2:
                return tk2.a.f118011a;
            case 3:
                return tk2.b.f118012a;
            case 4:
                return tk2.c.f118013a;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f130032a) {
        }
        return a();
    }
}
