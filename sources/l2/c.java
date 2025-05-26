package l2;

import java.util.Collection;
import m2.f;

/* loaded from: classes.dex */
public interface c extends b, Collection, ll2.a {
    c P(m2.b bVar);

    c W(int i13);

    @Override // java.util.List
    c add(int i13, Object obj);

    @Override // java.util.List, java.util.Collection
    c add(Object obj);

    @Override // java.util.List, java.util.Collection
    c addAll(Collection collection);

    f q();

    @Override // java.util.List
    c set(int i13, Object obj);
}
