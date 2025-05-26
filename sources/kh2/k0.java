package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(uh2.b bVar, int i13) {
        super(bVar, uh2.b.class, "deviceIdentifier", "getDeviceIdentifier()Ljava/lang/String;", 0);
        this.f79582a = i13;
        if (i13 != 1) {
        } else {
            super(bVar, uh2.b.class, "deviceIdentifier", "getDeviceIdentifier()Ljava/lang/String;", 0);
        }
    }

    @Override // rl2.r
    public final Object get() {
        switch (this.f79582a) {
        }
        return ((uh2.a) ((uh2.b) this.receiver)).a();
    }

    @Override // rl2.j
    public final void set(Object obj) {
        switch (this.f79582a) {
            case 0:
                String value = (String) obj;
                uh2.a aVar = (uh2.a) ((uh2.b) this.receiver);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                uh2.a.d(aVar.f122252a, "io.embrace.deviceid", value);
                break;
            default:
                String value2 = (String) obj;
                uh2.a aVar2 = (uh2.a) ((uh2.b) this.receiver);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                uh2.a.d(aVar2.f122252a, "io.embrace.deviceid", value2);
                break;
        }
    }
}
