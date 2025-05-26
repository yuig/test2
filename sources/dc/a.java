package dc;

import java.util.List;
import o5.g;
import qd.h;
import qd.l;
import qd.n;
import zb.k;
import zb.o;
import zb.p;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54303c;

    public /* synthetic */ a(int i13) {
        this.f54303c = i13;
    }

    @Override // dc.f
    public zb.e a() {
        int i13 = this.f54303c;
        Object obj = this.f92902b;
        switch (i13) {
            case 0:
                return new zb.f((List) obj);
            case 1:
                return new k((List) obj);
            case 2:
                return new o((List) obj, 0);
            case 3:
                return new o((List) obj, 1);
            default:
                return new p((List) obj);
        }
    }

    public l k() {
        switch (this.f54303c) {
            case 0:
                return new h(this);
            default:
                return new n(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i13) {
        super(list, 1);
        this.f54303c = i13;
    }
}
