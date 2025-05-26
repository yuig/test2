package fp2;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f62785a = new ArrayList(1);

    public a(int i13, String str) {
    }

    public final synchronized boolean a(int i13) {
        if (this.f62785a.size() >= 256) {
            return false;
        }
        this.f62785a.add(Integer.valueOf(i13));
        return true;
    }
}
