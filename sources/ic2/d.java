package ic2;

import a7.u0;
import ac2.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d implements n7.c {

    /* renamed from: a, reason: collision with root package name */
    public Integer f72114a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f72115b;

    @Override // n7.c
    public void P(n7.b eventTime, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.f72114a = Integer.valueOf(i13);
        Boolean bool = this.f72115b;
        if (bool != null) {
            j(eventTime, bool.booleanValue(), i13);
        }
    }

    public void X(long j13) {
    }

    @Override // n7.c
    public void b0(n7.b eventTime, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.f72115b = Boolean.valueOf(z13);
        Integer num = this.f72114a;
        if (num != null) {
            j(eventTime, z13, num.intValue());
        }
    }

    public void c0(long j13, e0 playerDisconnectReason) {
        Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
    }

    public void d0(int i13, Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public void e0(float f13, qc2.c viewability, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
    }

    public void j(n7.b eventTime, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
    }

    public void o(boolean z13, long j13) {
    }

    @Override // n7.c
    public void x(n7.b eventTime, u0 oldPosition, u0 newPosition, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
    }

    public void z(long j13, long j14) {
    }
}
