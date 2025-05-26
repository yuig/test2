package androidx.compose.foundation.lazy.layout;

import java.util.List;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f17327a;

    /* renamed from: b, reason: collision with root package name */
    public final List[] f17328b;

    /* renamed from: c, reason: collision with root package name */
    public int f17329c;

    /* renamed from: d, reason: collision with root package name */
    public int f17330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f17331e;

    public y0(a1 a1Var, List list) {
        this.f17331e = a1Var;
        this.f17327a = list;
        this.f17328b = new List[list.size()];
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states".toString());
        }
    }
}
