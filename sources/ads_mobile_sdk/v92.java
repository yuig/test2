package ads_mobile_sdk;

import android.net.Uri;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class v92 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f12402a;

    /* renamed from: b, reason: collision with root package name */
    public int f12403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn1 f12405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w92 f12407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f12408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f12409h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v92(int i13, long j13, Uri uri, zn1 zn1Var, w92 w92Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f12404c = i13;
        this.f12405d = zn1Var;
        this.f12406e = j13;
        this.f12407f = w92Var;
        this.f12408g = uri;
        this.f12409h = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        int i13 = this.f12404c;
        zn1 zn1Var = this.f12405d;
        return new v92(i13, this.f12406e, this.f12408g, zn1Var, this.f12407f, this.f12409h, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v92) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long l13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12403b;
        if (i13 == 0) {
            ue.c.H(obj);
            if (this.f12404c == 1) {
                zn2.a aVar2 = zn2.b.f142311b;
                l13 = dl2.b.P2(this.f12405d.f14841b, zn2.d.MILLISECONDS);
            } else {
                l13 = zn2.b.l(this.f12405d.f14843d, this.f12406e);
            }
            this.f12402a = l13;
            this.f12403b = 1;
            if (l0.T(l13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            l13 = this.f12402a;
            ue.c.H(obj);
        }
        long j13 = l13;
        w92 w92Var = this.f12407f;
        Uri uri = this.f12408g;
        zn1 zn1Var = this.f12405d;
        int i14 = this.f12404c + 1;
        String str = this.f12409h;
        this.f12403b = 2;
        if (w92Var.a(uri, zn1Var, i14, j13, str, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
