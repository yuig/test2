package bo2;

import android.os.Looper;
import ao2.e2;
import ho2.p;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements p {
    @Override // ho2.p
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // ho2.p
    public e2 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // ho2.p
    public int c() {
        return 1073741823;
    }
}
