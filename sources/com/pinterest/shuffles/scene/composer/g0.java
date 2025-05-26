package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f52045r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Size f52046s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ke2.c f52047t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.m f52048u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, Size size, ke2.c cVar, ao2.m mVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f52045r = n0Var;
        this.f52046s = size;
        this.f52047t = cVar;
        this.f52048u = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f52045r, this.f52046s, this.f52047t, this.f52048u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x72.b bVar2 = x72.b.f134124d;
        if (bVar2 == null) {
            Intrinsics.r("current");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bVar2, "<this>");
        boolean z13 = bVar2.f134125a == x72.e.LEGACY;
        ke2.c cVar = this.f52047t;
        Size size = this.f52046s;
        if (z13) {
            bVar = new be2.a(this.f52045r.f52109a, size, cVar);
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            x72.b bVar3 = x72.b.f134124d;
            if (bVar3 == null) {
                Intrinsics.r("current");
                throw null;
            }
            bVar = new ie2.b(size, cVar, bVar3.f134125a == x72.e.XRENDERER_VULKAN ? me2.c.VULKAN : me2.c.GLES);
        }
        xk2.q qVar = xk2.s.f135225b;
        this.f52048u.resumeWith(bVar);
        return Unit.f80348a;
    }
}
