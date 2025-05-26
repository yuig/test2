package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f17291b;

    public /* synthetic */ t(b0 b0Var, int i13) {
        this.f17290a = i13;
        this.f17291b = b0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = this.f17290a;
        b0 b0Var = this.f17291b;
        switch (i13) {
        }
        return al2.a.b(Integer.valueOf(b0Var.b(((e0) obj2).getKey())), Integer.valueOf(b0Var.b(((e0) obj).getKey())));
    }
}
