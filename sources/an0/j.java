package an0;

import android.graphics.Bitmap;
import ao2.j0;
import j1.v0;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pd.r;
import r72.u1;
import r72.y0;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u1 f15671r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f15672s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.shuffles.scene.composer.h f15673t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f15674u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f15675v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u1 u1Var, k kVar, com.pinterest.shuffles.scene.composer.h hVar, Function0 function0, Function0 function02, bl2.c cVar) {
        super(2, cVar);
        this.f15671r = u1Var;
        this.f15672s = kVar;
        this.f15673t = hVar;
        this.f15674u = function0;
        this.f15675v = function02;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f15671r, this.f15672s, this.f15673t, this.f15674u, this.f15675v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Bitmap a13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u1 u1Var = this.f15671r;
        y0 b13 = u1Var.f106674f.b();
        k kVar = this.f15672s;
        i A1 = k3.A1(u1Var, kVar.f15677b);
        try {
            if (Intrinsics.d(b13, y0.f106715e)) {
                Integer num = A1.f15667b;
                a13 = num != null ? k.a(kVar, num.intValue(), A1.f15666a, A1.f15668c) : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                a13 = k.b(kVar, b13.f106716a, A1);
            }
            Bitmap bitmap = a13;
            com.pinterest.shuffles.scene.composer.h hVar = this.f15673t;
            if (hVar == null) {
                hVar = new com.pinterest.shuffles.scene.composer.h();
            }
            u1 u1Var2 = this.f15671r;
            Function0 function0 = this.f15674u;
            Function0 function02 = this.f15675v;
            g62.a aVar2 = g62.a.f63738a;
            com.bumptech.glide.l a14 = com.bumptech.glide.b.f(kVar.f15676a).c().K(bitmap).a((de.h) new de.h().h(r.f99744a));
            Intrinsics.checkNotNullExpressionValue(a14, "load(...)");
            hVar.g(aVar2, a14, b13, u1Var2, function0, new v0(hVar, bitmap, u1Var2, function02, 10));
            return hVar;
        } catch (Exception unused) {
            return new ke2.i();
        }
    }
}
