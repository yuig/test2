package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f70168a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f70170c;

    public c(d dVar) {
        this.f70170c = dVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        boolean a13;
        et1.k incomingPacket = (et1.k) obj;
        d dVar = this.f70170c;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        try {
            if (dVar.f70183c) {
                long g13 = nt1.d.g(incomingPacket.f60038b.remaining() / dVar.f70196p, dVar.f70197q, nt1.d.f92294a);
                if (g13 == 0) {
                    g13 = 100;
                }
                dVar.f70195o = incomingPacket.f60040d + g13;
            }
            this.f70168a = true;
            do {
                a13 = d.a(dVar, incomingPacket);
                if (!a13) {
                    dVar.c(0L);
                }
            } while (!a13);
            this.f70168a = false;
            if (this.f70169b) {
                this.f70169b = false;
                d.b(dVar);
            }
        } catch (Throwable th3) {
            if (this.f70169b) {
                this.f70169b = false;
                d.b(dVar);
            }
            throw th3;
        }
    }

    @Override // mt1.a
    public final void g() {
        if (this.f70168a) {
            this.f70169b = true;
        } else {
            d.b(this.f70170c);
        }
    }
}
