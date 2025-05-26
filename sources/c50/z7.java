package c50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z7 implements l82.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26493a;

    public /* synthetic */ z7(int i13) {
        this.f26493a = i13;
    }

    @Override // l82.f
    public l82.h D(l82.h engineRequest) {
        switch (this.f26493a) {
            case 0:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                zw0.k kVar = (zw0.k) engineRequest;
                zw0.h hVar = kVar instanceof zw0.h ? (zw0.h) kVar : null;
                if (hVar != null) {
                    return hVar.f142908a;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                zw0.k kVar2 = (zw0.k) engineRequest;
                if ((kVar2 instanceof zw0.i ? (zw0.i) kVar2 : null) != null) {
                    return al1.b.f15477a;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                zw0.k kVar3 = (zw0.k) engineRequest;
                zw0.j jVar = kVar3 instanceof zw0.j ? (zw0.j) kVar3 : null;
                if (jVar != null) {
                    return jVar.f142909a;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                zw0.k kVar4 = (zw0.k) engineRequest;
                zw0.g gVar = kVar4 instanceof zw0.g ? (zw0.g) kVar4 : null;
                if (gVar != null) {
                    return gVar.f142907a;
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l82.f
    public u50.s E(u50.s anotherEvent) {
        switch (this.f26493a) {
            case 0:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
        }
        return a((Void) anotherEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u50.s a(Void anotherEvent) {
        switch (this.f26493a) {
            case 1:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            default:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
        }
        return (u50.s) anotherEvent;
    }

    public pc.m0 b() {
        switch (this.f26493a) {
            case 1:
                return b8.f25909b;
            case 3:
                return g8.f26026b;
            case 6:
                return j8.f26096b;
            case 8:
                return l8.f26138b;
            case 13:
                return q8.f26254b;
            case 15:
                return s8.f26297b;
            case 17:
                return u8.f26387b;
            case 18:
                return v8.f26409b;
            case 19:
                return w8.f26430b;
            case 21:
                return y8.f26474b;
            case 23:
                return a9.f25887b;
            case 25:
                return c9.f25934b;
            case 27:
                return e9.f25981b;
            default:
                return f9.f26005b;
        }
    }

    public pc.v0 c() {
        switch (this.f26493a) {
            case 0:
                return a8.f25885b;
            case 1:
            case 3:
            case 6:
            case 8:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            default:
                return g9.f26028b;
            case 2:
                return c8.f25932b;
            case 4:
                return h8.f26049b;
            case 5:
                return i8.f26072b;
            case 7:
                return k8.f26116b;
            case 9:
                return m8.f26162b;
            case 10:
                return n8.f26185b;
            case 11:
                return o8.f26208b;
            case 12:
                return p8.f26232b;
            case 14:
                return r8.f26276b;
            case 16:
                return t8.f26365b;
            case 20:
                return x8.f26452b;
            case 22:
                return z8.f26495b;
            case 24:
                return b9.f25911b;
            case 26:
                return d9.f25957b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(int i13, int i14) {
        this(0);
        this.f26493a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
