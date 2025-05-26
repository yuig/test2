package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ky1 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7562b;

    public ky1(List list, List list2) {
        this.f7561a = list;
        this.f7562b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ly1(this.f7561a.iterator(), this.f7562b.iterator());
    }
}
