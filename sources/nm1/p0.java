package nm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91465i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f91466j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(k kVar, int i13) {
        super(1);
        this.f91465i = i13;
        this.f91466j = kVar;
    }

    public final rl1.q b(rl1.q state) {
        int i13 = this.f91465i;
        k kVar = this.f91466j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                i iVar = (i) kVar;
                String str = iVar.f91432b;
                rl1.d dVar = new rl1.d(iVar.f91431a);
                int i14 = h1.content_description_user_avatar;
                String str2 = iVar.f91433c;
                return rl1.q.e(state, str, str2, false, null, new u50.k0(new String[]{str2}, i14), false, false, null, 0, dVar, null, 1516);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                j jVar = (j) kVar;
                String str3 = jVar.f91437b;
                String userId = jVar.f91436a;
                Intrinsics.checkNotNullParameter(userId, "userId");
                rl1.e eVar = new rl1.e(userId);
                return rl1.q.e(state, str3, jVar.f91438c, false, null, new u50.k0(new String[]{jVar.f91438c}, h1.content_description_user_avatar), false, false, null, 0, eVar, null, 1516);
        }
    }

    public final rn1.a e(rn1.a state) {
        int i13 = this.f91465i;
        k kVar = this.f91466j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.p2(((i) kVar).f91433c), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.p2(((j) kVar).f91438c), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91465i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((rl1.q) obj);
            case 2:
                return e((rn1.a) obj);
            default:
                return b((rl1.q) obj);
        }
    }
}
