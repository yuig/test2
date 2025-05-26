package s91;

import kotlin.jvm.internal.DefaultConstructorMarker;
import va1.j1;

/* loaded from: classes5.dex */
public final class q extends j1 implements s {

    /* renamed from: e, reason: collision with root package name */
    public final int f112103e;

    public q() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112103e;
    }

    public /* synthetic */ q(String str, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : num);
    }

    public q(String str, Integer num) {
        super(num, str);
        this.f112103e = 1;
    }
}
