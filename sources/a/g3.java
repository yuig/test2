package a;

import ads_mobile_sdk.il;
import ads_mobile_sdk.zk;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class g3 extends il {
    public abstract boolean a(il ilVar, int i13, int i14);

    @Override // ads_mobile_sdk.il
    public final int b() {
        return 0;
    }

    @Override // ads_mobile_sdk.il
    public final boolean c() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zk(this);
    }
}
