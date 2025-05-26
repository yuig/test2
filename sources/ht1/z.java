package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f70376b;

    public /* synthetic */ z(b0 b0Var, int i13) {
        this.f70375a = i13;
        this.f70376b = b0Var;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        b0 b0Var = this.f70376b;
        int i13 = this.f70375a;
        switch (i13) {
            case 0:
                nt1.c incomingPacket = (nt1.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                        b0.a(b0Var, incomingPacket, b0Var.f70161m);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                        b0.a(b0Var, b0Var.f70160l, incomingPacket);
                        break;
                }
            default:
                nt1.c incomingPacket2 = (nt1.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(incomingPacket2, "incomingPacket");
                        b0.a(b0Var, incomingPacket2, b0Var.f70161m);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(incomingPacket2, "incomingPacket");
                        b0.a(b0Var, b0Var.f70160l, incomingPacket2);
                        break;
                }
        }
    }

    @Override // mt1.a
    public final void g() {
    }
}
